///
/// This Source Code Form is subject to the terms of the Mozilla Public
/// License, v. 2.0. If a copy of the MPL was not distributed with this
/// file, You can obtain one at http://mozilla.org/MPL/2.0/.
///
package org.mifos.conventions.gradle.workflow.generator;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.gradle.internal.impldep.org.jsoup.nodes.Entities.EscapeMode.base;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.printer.DefaultPrettyPrinter;
import com.github.javaparser.printer.configuration.DefaultPrinterConfiguration;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

@Slf4j
final class MifosGradleWorkflowGeneratorPluginTest {
    @Test
    void parse() throws Exception {
        String code = FileUtils.readFileToString(
                new File("src/test/resources/example/ClientApi.java"),
                UTF_8);

        // Parse the Java code
        var cu = StaticJavaParser.parse(code);

        // Analyze: Find all method declarations
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            log.error("Method: {}", method.getNameAsString());
            if (method.getType() instanceof ClassOrInterfaceType type) {
                log.error(
                        "Return Type: {}",
                        type.getTypeArguments()
                                .flatMap(NodeList::getFirst)
                                .map(Type::asString)
                                .orElse(null));
            }
        });
    }

    @Test
    void generate() {
        // 1. create the root CompilationUnit
        var cu = new CompilationUnit();

        // 2. add package
        cu.setPackageDeclaration("com.example.generated");

        // 3. add imports
        cu.addImport("java.util.List");
        cu.addImport("java.util.ArrayList");

        // 4. create a public class
        var myClass = cu.addClass("UserService").setPublic(true).addAnnotation("Service");

        // 5. add a private field
        myClass.addField("List<String>", "names").setPrivate(true);

        // 6. add a constructor
        myClass.addConstructor()
                .setPublic(true)
                .setBody(new BlockStmt().addStatement("this.names = new ArrayList<>();"));

        // 7. add a method with logic
        MethodDeclaration method = myClass.addMethod("addName", Modifier.Keyword.PUBLIC)
                .setType("void")
                .addParameter("String", "name");

        method.setBody(new BlockStmt().addStatement("""
                        if (name == null || name.isBlank()) {
                            throw new IllegalArgumentException("Name cannot be empty");
                        } else {
                            this.names.add(name);
                        }
                        """));

        // 8. Add a getter
        myClass.addMethod("getNames", Modifier.Keyword.PUBLIC)
                .setType("List<String>")
                .setBody(new BlockStmt().addStatement("return this.names;"));

        // 9. Print the generated source
        var printer = new DefaultPrettyPrinter(new DefaultPrinterConfiguration());

        var sourceCode = printer.print(cu);

        log.error(sourceCode);
    }

    @Test
    void generateUsecaseInterface() throws Exception {
        String code = FileUtils.readFileToString(
                new File("src/test/resources/example/ClientApi.java"),
                UTF_8);
        var parsed = StaticJavaParser.parse(code);

        var apiName = parsed.findFirst(ClassOrInterfaceDeclaration.class)
                .map(ClassOrInterfaceDeclaration::getNameAsString)
                .orElseThrow();
        var domain = apiName.replace("Api", "");                       // CurrencyApi -> Currency

        parsed.findAll(MethodDeclaration.class).forEach(method -> {
            var operation = toOperation(method.getNameAsString(), domain);   // updateCurrencies -> Update
            var base = "Fineract" + domain + operation;                      // FineractCurrencyUpdate

            var cu = new CompilationUnit();
            cu.setPackageDeclaration("org.mifos.workflow.fineract.usecase."
                    + domain.toLowerCase() + ".core.usecase");
            cu.addImport("org.mifos.commons.boot.core.usecase.MifosUsecase");

            var requestType = method.getParameters().isEmpty() ? "Void" : base + "Request";
            var responseType = "Void".equals(unwrap(method.getType().asString()))
                    ? "Void"
                    : base + "Response";

            cu.addInterface(base + "Usecase")
                    .setPublic(true)
                    .addExtendedType("MifosUsecase<" + requestType + ", " + responseType + ">");

            log.error("\n----- {}Usecase.java -----\n{}", base,
                    new DefaultPrettyPrinter(new DefaultPrinterConfiguration()).print(cu));
        });
    }

    @Test
    void generateUsecaseImplementation() throws Exception {
        String code = FileUtils.readFileToString(
                new File("src/test/resources/example/ClientApi.java"), UTF_8);
        var parsed = StaticJavaParser.parse(code);

        var apiName = parsed.findFirst(ClassOrInterfaceDeclaration.class)
                .map(ClassOrInterfaceDeclaration::getNameAsString)
                .orElseThrow();
        var domain = apiName.replace("Api", "");
        var pkg = "org.mifos.workflow.fineract.usecase." + domain.toLowerCase();

        parsed.findAll(MethodDeclaration.class).forEach(method -> {
            var operation = toOperation(method.getNameAsString(), domain);
            var base = "Fineract" + domain + operation;
            var hasParam = !method.getParameters().isEmpty();   
            var returnsVoid = "Void".equals(unwrap(method.getType().asString()));
            var requestType = hasParam ? base + "Request" : "Void";
            var responseType = returnsVoid ? "Void" : base + "Response";
            var apiPackage = parsed.getPackageDeclaration()
                    .map(p -> p.getNameAsString())
                    .orElse("");

            var cu = new CompilationUnit();
            cu.setPackageDeclaration(pkg + ".implementation");
            cu.addImport("lombok.RequiredArgsConstructor");
            cu.addImport("lombok.extern.slf4j.Slf4j");
            cu.addImport(apiPackage + "." + apiName);
            if (hasParam) {
                cu.addImport(pkg + ".core.model." + base + "Request");
            }
            if (!returnsVoid) {
                cu.addImport(pkg + ".core.model." + base + "Response");
            }
            cu.addImport(pkg + ".core.usecase." + base + "Usecase");
            cu.addImport(pkg + ".mapping.Fineract" + domain + "RequestMapper");
            cu.addImport("org.springframework.stereotype.Component");

            var impl = cu.addClass(base + "UsecaseImpl")
                    .setPublic(false)
                    .setFinal(true)
                    .addAnnotation("Slf4j")
                    .addAnnotation("RequiredArgsConstructor")
                    .addAnnotation("Component")
                    .addImplementedType(base + "Usecase");

            impl.addField(apiName, "api").setPrivate(true).setFinal(true);
            impl.addField("Fineract" + domain + "RequestMapper", "mapper").setPrivate(true).setFinal(true);

            var args = method.getParameters().stream()
                    .map(p -> p.isAnnotationPresent("RequestBody")
                            ? "mapper.map(request)"
                            : "request.get" + capitalize(p.getNameAsString()) + "()")
                    .collect(Collectors.joining(", "));

            var call = "var response = api." + method.getNameAsString() + "(" + args + ").getBody();";

            impl.addMethod("execute", Modifier.Keyword.PUBLIC)
                    .setType(responseType)
                    .addParameter(requestType, "request")
                    .addAnnotation("Override")
                    .setBody(new BlockStmt()
                            .addStatement(call)
                            .addStatement("return mapper.map(response);"));

            log.error("\n----- {}UsecaseImpl.java -----\n{}", base,
                    new DefaultPrettyPrinter(new DefaultPrinterConfiguration()).print(cu));
        });
    }

    @Test
    void generateMapper() throws Exception {
        String code = FileUtils.readFileToString(
                new File("src/test/resources/example/ClientApi.java"),
                UTF_8);
        var parsed = StaticJavaParser.parse(code);

        var apiName = parsed.findFirst(ClassOrInterfaceDeclaration.class)
                .map(ClassOrInterfaceDeclaration::getNameAsString)
                .orElseThrow();
        var domain = apiName.replace("Api", "");
        var pkg = "org.mifos.workflow.fineract.usecase." + domain.toLowerCase();
        var modelPkg = parsed.getPackageDeclaration().map(p -> p.getNameAsString()).orElse("") + ".models";

        var cu = new CompilationUnit();
        cu.setPackageDeclaration(pkg + ".mapping");
        cu.addImport("org.mapstruct.Mapper");
        cu.addImport("org.mifos.boot.commons.mapping.MifosMapperConfiguration");

        var mapper = cu.addInterface("Fineract" + domain + "RequestMapper").setPublic(true);
        mapper.addAndGetAnnotation("Mapper").addPair("config", "MifosMapperConfiguration.class");

        var seen = new HashSet<String>();

        parsed.findAll(MethodDeclaration.class).forEach(method -> {
            var operation = toOperation(method.getNameAsString(), domain);
            var base = "Fineract" + domain + operation;

            // request direction: ours -> Fineract's, body parameters only
            method.getParameters().stream()
                    .filter(p -> p.isAnnotationPresent("RequestBody"))
                    .findFirst()
                    .ifPresent(p -> {
                        var fineractType = unwrap(p.getType().asString());
                        if (seen.add("req:" + base)) {
                            cu.addImport(modelPkg + "." + fineractType);
                            mapper.addMethod("map")
                                    .setType(fineractType)
                                    .addParameter(base + "Request", "source")
                                    .setBody(null);
                        }
                    });

            // response direction: Fineract's -> ours
            var fineractResponse = unwrap(method.getType().asString());
            if (!"Void".equals(fineractResponse) && seen.add("res:" + fineractResponse)) {
                cu.addImport(modelPkg + "." + fineractResponse);
                mapper.addMethod("map")
                        .setType(base + "Response")
                        .addParameter(fineractResponse, "source")
                        .setBody(null);
            }
        });

        log.error("\n----- Fineract{}RequestMapper.java -----\n{}", domain,
                new DefaultPrettyPrinter(new DefaultPrinterConfiguration()).print(cu));
    }


    @Test
    void generateResponseModel() throws Exception {
        var exampleDir = "src/test/resources/example/";
        var apiCode = FileUtils.readFileToString(new File(exampleDir + "ClientApi.java"), UTF_8);
        var parsed = StaticJavaParser.parse(apiCode);

        var apiName = parsed.findFirst(ClassOrInterfaceDeclaration.class)
                .map(ClassOrInterfaceDeclaration::getNameAsString)
                .orElseThrow();
        var domain = apiName.replace("Api", "");
        var pkg = "org.mifos.workflow.fineract.usecase." + domain.toLowerCase() + ".core.model";

        for (var method : parsed.findAll(MethodDeclaration.class)) {
            var operation = toOperation(method.getNameAsString(), domain);
            var base = "Fineract" + domain + operation;
            var fineractType = unwrap(method.getType().asString());

            if ("Void".equals(fineractType)) {
                log.error("{} returns Void - no response model needed", base);
                continue;
            }

            var sourceFile = new File(exampleDir + "models/" + fineractType + ".java");
            if (!sourceFile.exists()) {
                log.error("no source model for {} - skipping", fineractType);
                continue;
            }
            var model = StaticJavaParser.parse(FileUtils.readFileToString(sourceFile, UTF_8));

            var cu = new CompilationUnit();
            cu.setPackageDeclaration(pkg);
            cu.addImport("java.io.Serial");
            cu.addImport("lombok.AllArgsConstructor");
            cu.addImport("lombok.Builder");
            cu.addImport("lombok.Data");
            cu.addImport("lombok.NoArgsConstructor");
            cu.addImport("lombok.experimental.FieldNameConstants");
            cu.addImport("org.mifos.commons.boot.core.model.MifosResponse");

            var generated = cu.addClass(base + "Response")
                    .setPublic(true)
                    .addAnnotation("Builder")
                    .addAnnotation("Data")
                    .addAnnotation("NoArgsConstructor")
                    .addAnnotation("AllArgsConstructor")
                    .addAnnotation("FieldNameConstants")
                    .addImplementedType("MifosResponse");

            generated.addFieldWithInitializer("long", "serialVersionUID",
                            new NameExpr("1L"), Modifier.Keyword.PRIVATE,
                            Modifier.Keyword.STATIC, Modifier.Keyword.FINAL)
                    .addAnnotation("Serial");

            model.findAll(FieldDeclaration.class).stream()
                    .filter(f -> !f.isStatic())
                    .forEach(f -> f.getVariables().forEach(v -> {
                        var type = v.getTypeAsString();
                        collectImports(type).forEach(cu::addImport);
                        generated.addField(type, v.getNameAsString()).setPrivate(true);
                    }));

            log.error("\n----- {}Response.java -----\n{}", base,
                    new DefaultPrettyPrinter(new DefaultPrinterConfiguration()).print(cu));
        }
    }


    @Test
    void parseRealClientApi() throws Exception {
        String code = FileUtils.readFileToString(
                new File("src/test/resources/example/ClientApi.java"), UTF_8);
        var parsed = StaticJavaParser.parse(code);

        var apiName = parsed.findFirst(ClassOrInterfaceDeclaration.class)
                .map(ClassOrInterfaceDeclaration::getNameAsString)
                .orElseThrow();
        var domain = apiName.replace("Api", "");

        log.error("api: {}  domain: {}", apiName, domain);

        parsed.findAll(MethodDeclaration.class).forEach(method -> {
            log.error("--- {}", method.getNameAsString());
            log.error("    operation : {}", toOperation(method.getNameAsString(), domain));
            log.error("    returns   : {}", unwrap(method.getType().asString()));
            method.getParameters().forEach(p -> {
                var annotations = p.getAnnotations().stream()
                        .map(a -> a.getNameAsString())
                        .toList();
                log.error("    param     : {} {}  {}", p.getType().asString(), p.getNameAsString(), annotations);
            });
        });
    }

    private static List<String> collectImports(String type) {
        var imports = new ArrayList<String>();
        if (type.contains("Map")) imports.add("java.util.Map");
        if (type.contains("List")) imports.add("java.util.List");
        return imports;
    }

    private static String unwrap(String type) {
        var open = type.indexOf('<');
        var close = type.lastIndexOf('>');
        return open < 0 ? type : unwrap(type.substring(open + 1, close).trim());
    }

    private static String capitalize(String s) {
        return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    private static String toOperation(String methodName, String domain) {
        var name = methodName;
        for (var verb : List.of("retrieve", "update", "create", "delete", "get", "post", "put")) {
            if (name.startsWith(verb)) {
                return Character.toUpperCase(verb.charAt(0)) + verb.substring(1);
            }
        }
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
}
