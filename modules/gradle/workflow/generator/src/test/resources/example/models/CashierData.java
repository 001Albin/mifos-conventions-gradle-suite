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
import org.mifos.conventions.gradle.workflow.generator.example.models.StaffData;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CashierData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.24.0")
public class CashierData implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String description;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate endDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String endTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean isFullDay;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long officeId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String officeName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long staffId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String staffName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<StaffData> staffOptions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String startTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long tellerId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String tellerName;

  public CashierData description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  public CashierData endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  
  @JsonProperty("endDate")
  public LocalDate getEndDate() {
    return endDate;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("endDate")
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public CashierData endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("endTime")
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public CashierData id(Long id) {
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

  public CashierData isFullDay(Boolean isFullDay) {
    this.isFullDay = isFullDay;
    return this;
  }

  /**
   * Get isFullDay
   * @return isFullDay
   */
  
  @JsonProperty("isFullDay")
  public Boolean getIsFullDay() {
    return isFullDay;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("isFullDay")
  public void setIsFullDay(Boolean isFullDay) {
    this.isFullDay = isFullDay;
  }

  public CashierData officeId(Long officeId) {
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

  public CashierData officeName(String officeName) {
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

  public CashierData staffId(Long staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
   */
  
  @JsonProperty("staffId")
  public Long getStaffId() {
    return staffId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("staffId")
  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }

  public CashierData staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
   */
  
  @JsonProperty("staffName")
  public String getStaffName() {
    return staffName;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("staffName")
  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public CashierData staffOptions(List<StaffData> staffOptions) {
    this.staffOptions = staffOptions;
    return this;
  }

  public CashierData addStaffOptionsItem(StaffData staffOptionsItem) {
    if (this.staffOptions == null) {
      this.staffOptions = new ArrayList<>();
    }
    this.staffOptions.add(staffOptionsItem);
    return this;
  }

  /**
   * Get staffOptions
   * @return staffOptions
   */
  
  @JsonProperty("staffOptions")
  public List<StaffData> getStaffOptions() {
    return staffOptions;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("staffOptions")
  public void setStaffOptions(List<StaffData> staffOptions) {
    this.staffOptions = staffOptions;
  }

  public CashierData startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("startDate")
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public CashierData startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("startTime")
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public CashierData tellerId(Long tellerId) {
    this.tellerId = tellerId;
    return this;
  }

  /**
   * Get tellerId
   * @return tellerId
   */
  
  @JsonProperty("tellerId")
  public Long getTellerId() {
    return tellerId;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("tellerId")
  public void setTellerId(Long tellerId) {
    this.tellerId = tellerId;
  }

  public CashierData tellerName(String tellerName) {
    this.tellerName = tellerName;
    return this;
  }

  /**
   * Get tellerName
   * @return tellerName
   */
  
  @JsonProperty("tellerName")
  public String getTellerName() {
    return tellerName;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("tellerName")
  public void setTellerName(String tellerName) {
    this.tellerName = tellerName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashierData cashierData = (CashierData) o;
    return Objects.equals(this.description, cashierData.description) &&
        Objects.equals(this.endDate, cashierData.endDate) &&
        Objects.equals(this.endTime, cashierData.endTime) &&
        Objects.equals(this.id, cashierData.id) &&
        Objects.equals(this.isFullDay, cashierData.isFullDay) &&
        Objects.equals(this.officeId, cashierData.officeId) &&
        Objects.equals(this.officeName, cashierData.officeName) &&
        Objects.equals(this.staffId, cashierData.staffId) &&
        Objects.equals(this.staffName, cashierData.staffName) &&
        Objects.equals(this.staffOptions, cashierData.staffOptions) &&
        Objects.equals(this.startDate, cashierData.startDate) &&
        Objects.equals(this.startTime, cashierData.startTime) &&
        Objects.equals(this.tellerId, cashierData.tellerId) &&
        Objects.equals(this.tellerName, cashierData.tellerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, endDate, endTime, id, isFullDay, officeId, officeName, staffId, staffName, staffOptions, startDate, startTime, tellerId, tellerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashierData {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFullDay: ").append(toIndentedString(isFullDay)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffOptions: ").append(toIndentedString(staffOptions)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    tellerId: ").append(toIndentedString(tellerId)).append("\n");
    sb.append("    tellerName: ").append(toIndentedString(tellerName)).append("\n");
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

