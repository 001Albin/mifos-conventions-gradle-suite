package org.mifos.conventions.gradle.workflow.generator.example.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.mifos.conventions.gradle.workflow.generator.example.models.GetClientsClientIdStatus;
import org.mifos.conventions.gradle.workflow.generator.example.models.GetClientsGroups;
import org.mifos.conventions.gradle.workflow.generator.example.models.GetClientsTimeline;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetClientsClientIdResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.24.0")
public class GetClientsClientIdResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String accountNo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate activationDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean active;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String displayName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String emailAddress;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String externalId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String firstname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<GetClientsGroups> groups;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String lastname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long officeId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String officeName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long savingsProductId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String savingsProductName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private GetClientsClientIdStatus status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private GetClientsTimeline timeline;

  public GetClientsClientIdResponse accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

  /**
   * Get accountNo
   * @return accountNo
   */
  
  @JsonProperty("accountNo")
  public String getAccountNo() {
    return accountNo;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("accountNo")
  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public GetClientsClientIdResponse activationDate(LocalDate activationDate) {
    this.activationDate = activationDate;
    return this;
  }

  /**
   * Get activationDate
   * @return activationDate
   */
  
  @JsonProperty("activationDate")
  public LocalDate getActivationDate() {
    return activationDate;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("activationDate")
  public void setActivationDate(LocalDate activationDate) {
    this.activationDate = activationDate;
  }

  public GetClientsClientIdResponse active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("active")
  public void setActive(Boolean active) {
    this.active = active;
  }

  public GetClientsClientIdResponse displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   */
  
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public GetClientsClientIdResponse emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   */
  
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("emailAddress")
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public GetClientsClientIdResponse externalId(String externalId) {
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

  public GetClientsClientIdResponse firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Get firstname
   * @return firstname
   */
  
  @JsonProperty("firstname")
  public String getFirstname() {
    return firstname;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("firstname")
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public GetClientsClientIdResponse groups(List<GetClientsGroups> groups) {
    this.groups = groups;
    return this;
  }

  public GetClientsClientIdResponse addGroupsItem(GetClientsGroups groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   */
  
  @JsonProperty("groups")
  public List<GetClientsGroups> getGroups() {
    return groups;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("groups")
  public void setGroups(List<GetClientsGroups> groups) {
    this.groups = groups;
  }

  public GetClientsClientIdResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  public GetClientsClientIdResponse lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Get lastname
   * @return lastname
   */
  
  @JsonProperty("lastname")
  public String getLastname() {
    return lastname;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("lastname")
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public GetClientsClientIdResponse officeId(Long officeId) {
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

  public GetClientsClientIdResponse officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

  /**
   * Get officeName
   * @return officeName
   */
  
  @JsonProperty("officeName")
  public String getOfficeName() {
    return officeName;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("officeName")
  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public GetClientsClientIdResponse savingsProductId(Long savingsProductId) {
    this.savingsProductId = savingsProductId;
    return this;
  }

  /**
   * Get savingsProductId
   * @return savingsProductId
   */
  
  @JsonProperty("savingsProductId")
  public Long getSavingsProductId() {
    return savingsProductId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("savingsProductId")
  public void setSavingsProductId(Long savingsProductId) {
    this.savingsProductId = savingsProductId;
  }

  public GetClientsClientIdResponse savingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
    return this;
  }

  /**
   * Get savingsProductName
   * @return savingsProductName
   */
  
  @JsonProperty("savingsProductName")
  public String getSavingsProductName() {
    return savingsProductName;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("savingsProductName")
  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }

  public GetClientsClientIdResponse status(GetClientsClientIdStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @JsonProperty("status")
  public GetClientsClientIdStatus getStatus() {
    return status;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("status")
  public void setStatus(GetClientsClientIdStatus status) {
    this.status = status;
  }

  public GetClientsClientIdResponse timeline(GetClientsTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

  /**
   * Get timeline
   * @return timeline
   */
  
  @JsonProperty("timeline")
  public GetClientsTimeline getTimeline() {
    return timeline;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("timeline")
  public void setTimeline(GetClientsTimeline timeline) {
    this.timeline = timeline;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsClientIdResponse getClientsClientIdResponse = (GetClientsClientIdResponse) o;
    return Objects.equals(this.accountNo, getClientsClientIdResponse.accountNo) &&
        Objects.equals(this.activationDate, getClientsClientIdResponse.activationDate) &&
        Objects.equals(this.active, getClientsClientIdResponse.active) &&
        Objects.equals(this.displayName, getClientsClientIdResponse.displayName) &&
        Objects.equals(this.emailAddress, getClientsClientIdResponse.emailAddress) &&
        Objects.equals(this.externalId, getClientsClientIdResponse.externalId) &&
        Objects.equals(this.firstname, getClientsClientIdResponse.firstname) &&
        Objects.equals(this.groups, getClientsClientIdResponse.groups) &&
        Objects.equals(this.id, getClientsClientIdResponse.id) &&
        Objects.equals(this.lastname, getClientsClientIdResponse.lastname) &&
        Objects.equals(this.officeId, getClientsClientIdResponse.officeId) &&
        Objects.equals(this.officeName, getClientsClientIdResponse.officeName) &&
        Objects.equals(this.savingsProductId, getClientsClientIdResponse.savingsProductId) &&
        Objects.equals(this.savingsProductName, getClientsClientIdResponse.savingsProductName) &&
        Objects.equals(this.status, getClientsClientIdResponse.status) &&
        Objects.equals(this.timeline, getClientsClientIdResponse.timeline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, activationDate, active, displayName, emailAddress, externalId, firstname, groups, id, lastname, officeId, officeName, savingsProductId, savingsProductName, status, timeline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsClientIdResponse {\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
    sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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

