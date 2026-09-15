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
 * DeleteClientsClientIdResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.24.0")
public class DeleteClientsClientIdResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long clientId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long officeId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String resourceExternalId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long resourceId;

  public DeleteClientsClientIdResponse clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
   */
  
  @JsonProperty("clientId")
  public Long getClientId() {
    return clientId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("clientId")
  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public DeleteClientsClientIdResponse officeId(Long officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Get officeId
   * @return officeId
   */
  
  @JsonProperty("officeId")
  public Long getOfficeId() {
    return officeId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("officeId")
  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }

  public DeleteClientsClientIdResponse resourceExternalId(String resourceExternalId) {
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

  public DeleteClientsClientIdResponse resourceId(Long resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
   */
  
  @JsonProperty("resourceId")
  public Long getResourceId() {
    return resourceId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("resourceId")
  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteClientsClientIdResponse deleteClientsClientIdResponse = (DeleteClientsClientIdResponse) o;
    return Objects.equals(this.clientId, deleteClientsClientIdResponse.clientId) &&
        Objects.equals(this.officeId, deleteClientsClientIdResponse.officeId) &&
        Objects.equals(this.resourceExternalId, deleteClientsClientIdResponse.resourceExternalId) &&
        Objects.equals(this.resourceId, deleteClientsClientIdResponse.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, officeId, resourceExternalId, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteClientsClientIdResponse {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    resourceExternalId: ").append(toIndentedString(resourceExternalId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

