package org.mifos.conventions.gradle.workflow.generator.example.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.mifos.conventions.gradle.workflow.generator.example.models.GetClientsDataTables;
import org.mifos.conventions.gradle.workflow.generator.example.models.GetClientsOfficeOptions;
import org.mifos.conventions.gradle.workflow.generator.example.models.GetClientsSavingProductOptions;
import org.mifos.conventions.gradle.workflow.generator.example.models.GetClientsStaffOptions;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetClientsTemplateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.24.0")
public class GetClientsTemplateResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate activationDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Set<GetClientsDataTables> datatables;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long officeId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Set<GetClientsOfficeOptions> officeOptions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Set<GetClientsSavingProductOptions> savingProductOptions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Set<GetClientsStaffOptions> staffOptions;

  public GetClientsTemplateResponse activationDate(LocalDate activationDate) {
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

  public GetClientsTemplateResponse datatables(Set<GetClientsDataTables> datatables) {
    this.datatables = datatables;
    return this;
  }

  public GetClientsTemplateResponse addDatatablesItem(GetClientsDataTables datatablesItem) {
    if (this.datatables == null) {
      this.datatables = new LinkedHashSet<>();
    }
    this.datatables.add(datatablesItem);
    return this;
  }

  /**
   * Get datatables
   * @return datatables
   */
  
  @JsonProperty("datatables")
  public Set<GetClientsDataTables> getDatatables() {
    return datatables;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("datatables")
  public void setDatatables(Set<GetClientsDataTables> datatables) {
    this.datatables = datatables;
  }

  public GetClientsTemplateResponse officeId(Long officeId) {
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

  public GetClientsTemplateResponse officeOptions(Set<GetClientsOfficeOptions> officeOptions) {
    this.officeOptions = officeOptions;
    return this;
  }

  public GetClientsTemplateResponse addOfficeOptionsItem(GetClientsOfficeOptions officeOptionsItem) {
    if (this.officeOptions == null) {
      this.officeOptions = new LinkedHashSet<>();
    }
    this.officeOptions.add(officeOptionsItem);
    return this;
  }

  /**
   * Get officeOptions
   * @return officeOptions
   */
  
  @JsonProperty("officeOptions")
  public Set<GetClientsOfficeOptions> getOfficeOptions() {
    return officeOptions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("officeOptions")
  public void setOfficeOptions(Set<GetClientsOfficeOptions> officeOptions) {
    this.officeOptions = officeOptions;
  }

  public GetClientsTemplateResponse savingProductOptions(Set<GetClientsSavingProductOptions> savingProductOptions) {
    this.savingProductOptions = savingProductOptions;
    return this;
  }

  public GetClientsTemplateResponse addSavingProductOptionsItem(GetClientsSavingProductOptions savingProductOptionsItem) {
    if (this.savingProductOptions == null) {
      this.savingProductOptions = new LinkedHashSet<>();
    }
    this.savingProductOptions.add(savingProductOptionsItem);
    return this;
  }

  /**
   * Get savingProductOptions
   * @return savingProductOptions
   */
  
  @JsonProperty("savingProductOptions")
  public Set<GetClientsSavingProductOptions> getSavingProductOptions() {
    return savingProductOptions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("savingProductOptions")
  public void setSavingProductOptions(Set<GetClientsSavingProductOptions> savingProductOptions) {
    this.savingProductOptions = savingProductOptions;
  }

  public GetClientsTemplateResponse staffOptions(Set<GetClientsStaffOptions> staffOptions) {
    this.staffOptions = staffOptions;
    return this;
  }

  public GetClientsTemplateResponse addStaffOptionsItem(GetClientsStaffOptions staffOptionsItem) {
    if (this.staffOptions == null) {
      this.staffOptions = new LinkedHashSet<>();
    }
    this.staffOptions.add(staffOptionsItem);
    return this;
  }

  /**
   * Get staffOptions
   * @return staffOptions
   */
  
  @JsonProperty("staffOptions")
  public Set<GetClientsStaffOptions> getStaffOptions() {
    return staffOptions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("staffOptions")
  public void setStaffOptions(Set<GetClientsStaffOptions> staffOptions) {
    this.staffOptions = staffOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsTemplateResponse getClientsTemplateResponse = (GetClientsTemplateResponse) o;
    return Objects.equals(this.activationDate, getClientsTemplateResponse.activationDate) &&
        Objects.equals(this.datatables, getClientsTemplateResponse.datatables) &&
        Objects.equals(this.officeId, getClientsTemplateResponse.officeId) &&
        Objects.equals(this.officeOptions, getClientsTemplateResponse.officeOptions) &&
        Objects.equals(this.savingProductOptions, getClientsTemplateResponse.savingProductOptions) &&
        Objects.equals(this.staffOptions, getClientsTemplateResponse.staffOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationDate, datatables, officeId, officeOptions, savingProductOptions, staffOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsTemplateResponse {\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    datatables: ").append(toIndentedString(datatables)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeOptions: ").append(toIndentedString(officeOptions)).append("\n");
    sb.append("    savingProductOptions: ").append(toIndentedString(savingProductOptions)).append("\n");
    sb.append("    staffOptions: ").append(toIndentedString(staffOptions)).append("\n");
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

