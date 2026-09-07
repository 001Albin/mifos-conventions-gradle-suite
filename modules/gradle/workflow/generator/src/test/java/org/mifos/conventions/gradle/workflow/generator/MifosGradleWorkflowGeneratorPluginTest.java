///
/// This Source Code Form is subject to the terms of the Mozilla Public
/// License, v. 2.0. If a copy of the MPL was not distributed with this
/// file, You can obtain one at http://mozilla.org/MPL/2.0/.
///
package org.mifos.conventions.gradle.workflow.generator;

import static java.nio.charset.StandardCharsets.UTF_8;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.printer.DefaultPrettyPrinter;
import com.github.javaparser.printer.configuration.DefaultPrinterConfiguration;
import java.io.File;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

@Slf4j
final class MifosGradleWorkflowGeneratorPluginTest {
    @Test
    void parse() throws Exception {
        String code = FileUtils.readFileToString(
                new File("src/test/java/org/mifos/conventions/gradle/workflow/generator/example/CurrencyApi.java"),
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
                new File("src/test/java/org/mifos/conventions/gradle/workflow/generator/example/CurrencyApi.java"),
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

            cu.addInterface(base + "Usecase")
                    .setPublic(true)
                    .addExtendedType("MifosUsecase<" + base + "Request, " + base + "Response>");

            log.error("\n----- {}Usecase.java -----\n{}", base,
                    new DefaultPrettyPrinter(new DefaultPrinterConfiguration()).print(cu));
        });
    }

    @Test
    void generateUsecaseImplementation() throws Exception {
        String code = FileUtils.readFileToString(
                new File("src/test/java/org/mifos/conventions/gradle/workflow/generator/example/CurrencyApi.java"),
                UTF_8);
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

            var apiPackage = parsed.getPackageDeclaration()
                    .map(p -> p.getNameAsString())
                    .orElse("");

            var cu = new CompilationUnit();
            cu.setPackageDeclaration(pkg + ".implementation");
            cu.addImport("lombok.RequiredArgsConstructor");
            cu.addImport("lombok.extern.slf4j.Slf4j");
            cu.addImport(apiPackage + "." + apiName);
            cu.addImport(pkg + ".core.model." + base + "Request");
            cu.addImport(pkg + ".core.model." + base + "Response");
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

            var call = hasParam
                    ? "var response = api." + method.getNameAsString() + "(mapper.map(request)).getBody();"
                    : "var response = api." + method.getNameAsString() + "().getBody();";

            impl.addMethod("execute", Modifier.Keyword.PUBLIC)
                    .setType(base + "Response")
                    .addParameter(base + "Request", "request")
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
                new File("src/test/java/org/mifos/conventions/gradle/workflow/generator/example/CurrencyApi.java"),
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

        var mapper = cu.addInterface("Fineract" + domain + "RequestMapper")
                .setPublic(true);
        mapper.addAndGetAnnotation("Mapper")
                .addPair("config", "MifosMapperConfiguration.class");

        parsed.findAll(MethodDeclaration.class).forEach(method -> {
            var operation = toOperation(method.getNameAsString(), domain);
            var base = "Fineract" + domain + operation;

            // request direction: ours -> Fineract's
            method.getParameters().stream().findFirst().ifPresent(p -> {
                var fineractType = unwrap(p.getType().asString());
                cu.addImport(modelPkg + "." + fineractType);
                mapper.addMethod("map")
                        .setType(fineractType)
                        .addParameter(base + "Request", "source")
                        .setBody(null);
            });

            // response direction: Fineract's -> ours
            var fineractResponse = unwrap(method.getType().asString());
            cu.addImport(modelPkg + "." + fineractResponse);
            mapper.addMethod("map")
                    .setType(base + "Response")
                    .addParameter(fineractResponse, "source")
                    .setBody(null);
        });

        log.error("\n----- Fineract{}RequestMapper.java -----\n{}", domain,
                new DefaultPrettyPrinter(new DefaultPrinterConfiguration()).print(cu));
    }

    private static String unwrap(String type) {
        var open = type.indexOf('<');
        var close = type.lastIndexOf('>');
        return open < 0 ? type : unwrap(type.substring(open + 1, close).trim());
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
