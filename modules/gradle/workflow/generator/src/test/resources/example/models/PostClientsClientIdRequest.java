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
 * PostClientsClientIdRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.24.0")
public class PostClientsClientIdRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String activationDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String closureDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long closureReasonId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String dateFormat;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String locale;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String reactivationDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String rejectionDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long rejectionReasonId;

  public PostClientsClientIdRequest activationDate(String activationDate) {
    this.activationDate = activationDate;
    return this;
  }

  /**
   * Get activationDate
   * @return activationDate
   */
  
  @JsonProperty("activationDate")
  public String getActivationDate() {
    return activationDate;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("activationDate")
  public void setActivationDate(String activationDate) {
    this.activationDate = activationDate;
  }

  public PostClientsClientIdRequest closureDate(String closureDate) {
    this.closureDate = closureDate;
    return this;
  }

  /**
   * Get closureDate
   * @return closureDate
   */
  
  @JsonProperty("closureDate")
  public String getClosureDate() {
    return closureDate;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("closureDate")
  public void setClosureDate(String closureDate) {
    this.closureDate = closureDate;
  }

  public PostClientsClientIdRequest closureReasonId(Long closureReasonId) {
    this.closureReasonId = closureReasonId;
    return this;
  }

  /**
   * Get closureReasonId
   * @return closureReasonId
   */
  
  @JsonProperty("closureReasonId")
  public Long getClosureReasonId() {
    return closureReasonId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("closureReasonId")
  public void setClosureReasonId(Long closureReasonId) {
    this.closureReasonId = closureReasonId;
  }

  public PostClientsClientIdRequest dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  /**
   * Get dateFormat
   * @return dateFormat
   */
  
  @JsonProperty("dateFormat")
  public String getDateFormat() {
    return dateFormat;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("dateFormat")
  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public PostClientsClientIdRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
   */
  
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("locale")
  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostClientsClientIdRequest reactivationDate(String reactivationDate) {
    this.reactivationDate = reactivationDate;
    return this;
  }

  /**
   * Get reactivationDate
   * @return reactivationDate
   */
  
  @JsonProperty("reactivationDate")
  public String getReactivationDate() {
    return reactivationDate;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("reactivationDate")
  public void setReactivationDate(String reactivationDate) {
    this.reactivationDate = reactivationDate;
  }

  public PostClientsClientIdRequest rejectionDate(String rejectionDate) {
    this.rejectionDate = rejectionDate;
    return this;
  }

  /**
   * Get rejectionDate
   * @return rejectionDate
   */
  
  @JsonProperty("rejectionDate")
  public String getRejectionDate() {
    return rejectionDate;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("rejectionDate")
  public void setRejectionDate(String rejectionDate) {
    this.rejectionDate = rejectionDate;
  }

  public PostClientsClientIdRequest rejectionReasonId(Long rejectionReasonId) {
    this.rejectionReasonId = rejectionReasonId;
    return this;
  }

  /**
   * Get rejectionReasonId
   * @return rejectionReasonId
   */
  
  @JsonProperty("rejectionReasonId")
  public Long getRejectionReasonId() {
    return rejectionReasonId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("rejectionReasonId")
  public void setRejectionReasonId(Long rejectionReasonId) {
    this.rejectionReasonId = rejectionReasonId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostClientsClientIdRequest postClientsClientIdRequest = (PostClientsClientIdRequest) o;
    return Objects.equals(this.activationDate, postClientsClientIdRequest.activationDate) &&
        Objects.equals(this.closureDate, postClientsClientIdRequest.closureDate) &&
        Objects.equals(this.closureReasonId, postClientsClientIdRequest.closureReasonId) &&
        Objects.equals(this.dateFormat, postClientsClientIdRequest.dateFormat) &&
        Objects.equals(this.locale, postClientsClientIdRequest.locale) &&
        Objects.equals(this.reactivationDate, postClientsClientIdRequest.reactivationDate) &&
        Objects.equals(this.rejectionDate, postClientsClientIdRequest.rejectionDate) &&
        Objects.equals(this.rejectionReasonId, postClientsClientIdRequest.rejectionReasonId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationDate, closureDate, closureReasonId, dateFormat, locale, reactivationDate, rejectionDate, rejectionReasonId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostClientsClientIdRequest {\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    closureDate: ").append(toIndentedString(closureDate)).append("\n");
    sb.append("    closureReasonId: ").append(toIndentedString(closureReasonId)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    reactivationDate: ").append(toIndentedString(reactivationDate)).append("\n");
    sb.append("    rejectionDate: ").append(toIndentedString(rejectionDate)).append("\n");
    sb.append("    rejectionReasonId: ").append(toIndentedString(rejectionReasonId)).append("\n");
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

