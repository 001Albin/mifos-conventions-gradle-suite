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
import org.mifos.conventions.gradle.workflow.generator.example.models.ClientAddressRequest;
import org.mifos.conventions.gradle.workflow.generator.example.models.PostClientsDatatable;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PostClientsRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.24.0")
public class PostClientsRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String activationDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean active;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<ClientAddressRequest> address;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<PostClientsDatatable> datatables;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String dateFormat;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfBirth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String emailAddress;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String externalId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String firstname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String fullname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long groupId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String lastname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long legalFormId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String locale;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String middlename;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String mobileNo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long officeId;

  public PostClientsRequest activationDate(String activationDate) {
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

  public PostClientsRequest active(Boolean active) {
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

  public PostClientsRequest address(List<ClientAddressRequest> address) {
    this.address = address;
    return this;
  }

  public PostClientsRequest addAddressItem(ClientAddressRequest addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Address requests
   * @return address
   */
  
  @JsonProperty("address")
  public List<ClientAddressRequest> getAddress() {
    return address;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("address")
  public void setAddress(List<ClientAddressRequest> address) {
    this.address = address;
  }

  public PostClientsRequest datatables(List<PostClientsDatatable> datatables) {
    this.datatables = datatables;
    return this;
  }

  public PostClientsRequest addDatatablesItem(PostClientsDatatable datatablesItem) {
    if (this.datatables == null) {
      this.datatables = new ArrayList<>();
    }
    this.datatables.add(datatablesItem);
    return this;
  }

  /**
   * List of PostClientsDatatable
   * @return datatables
   */
  
  @JsonProperty("datatables")
  public List<PostClientsDatatable> getDatatables() {
    return datatables;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("datatables")
  public void setDatatables(List<PostClientsDatatable> datatables) {
    this.datatables = datatables;
  }

  public PostClientsRequest dateFormat(String dateFormat) {
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

  public PostClientsRequest dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
   */
  
  @JsonProperty("dateOfBirth")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("dateOfBirth")
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public PostClientsRequest emailAddress(String emailAddress) {
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

  public PostClientsRequest externalId(String externalId) {
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

  public PostClientsRequest firstname(String firstname) {
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

  public PostClientsRequest fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

  /**
   * Get fullname
   * @return fullname
   */
  
  @JsonProperty("fullname")
  public String getFullname() {
    return fullname;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("fullname")
  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public PostClientsRequest groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
   */
  
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("groupId")
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public PostClientsRequest lastname(String lastname) {
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

  public PostClientsRequest legalFormId(Long legalFormId) {
    this.legalFormId = legalFormId;
    return this;
  }

  /**
   * Get legalFormId
   * @return legalFormId
   */
  
  @JsonProperty("legalFormId")
  public Long getLegalFormId() {
    return legalFormId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("legalFormId")
  public void setLegalFormId(Long legalFormId) {
    this.legalFormId = legalFormId;
  }

  public PostClientsRequest locale(String locale) {
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

  public PostClientsRequest middlename(String middlename) {
    this.middlename = middlename;
    return this;
  }

  /**
   * Get middlename
   * @return middlename
   */
  
  @JsonProperty("middlename")
  public String getMiddlename() {
    return middlename;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("middlename")
  public void setMiddlename(String middlename) {
    this.middlename = middlename;
  }

  public PostClientsRequest mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
   */
  
  @JsonProperty("mobileNo")
  public String getMobileNo() {
    return mobileNo;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("mobileNo")
  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public PostClientsRequest officeId(Long officeId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostClientsRequest postClientsRequest = (PostClientsRequest) o;
    return Objects.equals(this.activationDate, postClientsRequest.activationDate) &&
        Objects.equals(this.active, postClientsRequest.active) &&
        Objects.equals(this.address, postClientsRequest.address) &&
        Objects.equals(this.datatables, postClientsRequest.datatables) &&
        Objects.equals(this.dateFormat, postClientsRequest.dateFormat) &&
        Objects.equals(this.dateOfBirth, postClientsRequest.dateOfBirth) &&
        Objects.equals(this.emailAddress, postClientsRequest.emailAddress) &&
        Objects.equals(this.externalId, postClientsRequest.externalId) &&
        Objects.equals(this.firstname, postClientsRequest.firstname) &&
        Objects.equals(this.fullname, postClientsRequest.fullname) &&
        Objects.equals(this.groupId, postClientsRequest.groupId) &&
        Objects.equals(this.lastname, postClientsRequest.lastname) &&
        Objects.equals(this.legalFormId, postClientsRequest.legalFormId) &&
        Objects.equals(this.locale, postClientsRequest.locale) &&
        Objects.equals(this.middlename, postClientsRequest.middlename) &&
        Objects.equals(this.mobileNo, postClientsRequest.mobileNo) &&
        Objects.equals(this.officeId, postClientsRequest.officeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationDate, active, address, datatables, dateFormat, dateOfBirth, emailAddress, externalId, firstname, fullname, groupId, lastname, legalFormId, locale, middlename, mobileNo, officeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostClientsRequest {\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    datatables: ").append(toIndentedString(datatables)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    legalFormId: ").append(toIndentedString(legalFormId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    middlename: ").append(toIndentedString(middlename)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
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

