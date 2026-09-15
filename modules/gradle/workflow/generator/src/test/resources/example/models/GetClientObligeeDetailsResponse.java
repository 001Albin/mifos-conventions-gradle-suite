package org.mifos.conventions.gradle.workflow.generator.example.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.mifos.conventions.gradle.workflow.generator.example.models.GetObligeeData;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetClientObligeeDetailsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.24.0")
public class GetClientObligeeDetailsResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Set<GetObligeeData> obligees;

  public GetClientObligeeDetailsResponse obligees(Set<GetObligeeData> obligees) {
    this.obligees = obligees;
    return this;
  }

  public GetClientObligeeDetailsResponse addObligeesItem(GetObligeeData obligeesItem) {
    if (this.obligees == null) {
      this.obligees = new LinkedHashSet<>();
    }
    this.obligees.add(obligeesItem);
    return this;
  }

  /**
   * Get obligees
   * @return obligees
   */
  
  @JsonProperty("obligees")
  public Set<GetObligeeData> getObligees() {
    return obligees;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("obligees")
  public void setObligees(Set<GetObligeeData> obligees) {
    this.obligees = obligees;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientObligeeDetailsResponse getClientObligeeDetailsResponse = (GetClientObligeeDetailsResponse) o;
    return Objects.equals(this.obligees, getClientObligeeDetailsResponse.obligees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(obligees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientObligeeDetailsResponse {\n");
    sb.append("    obligees: ").append(toIndentedString(obligees)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

