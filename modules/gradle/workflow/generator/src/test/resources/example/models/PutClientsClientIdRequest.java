package org.mifos.conventions.gradle.workflow.generator.example.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import org.jspecify.annotations.Nullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PutClientsClientIdRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.24.0")
public class PutClientsClientIdRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String externalId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String resourceExternalId;

  public PutClientsClientIdRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("externalId")
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public PutClientsClientIdRequest resourceExternalId(String resourceExternalId) {
    this.resourceExternalId = resourceExternalId;
    return this;
  }

  /**
   * Get resourceExternalId
   * @return resourceExternalId
   */
  
  @JsonProperty("resourceExternalId")
  public String getResourceExternalId() {
    return resourceExternalId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("resourceExternalId")
  public void setResourceExternalId(String resourceExternalId) {
    this.resourceExternalId = resourceExternalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutClientsClientIdRequest putClientsClientIdRequest = (PutClientsClientIdRequest) o;
    return Objects.equals(this.externalId, putClientsClientIdRequest.externalId) &&
        Objects.equals(this.resourceExternalId, putClientsClientIdRequest.resourceExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, resourceExternalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutClientsClientIdRequest {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    resourceExternalId: ").append(toIndentedString(resourceExternalId)).append("\n");
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

