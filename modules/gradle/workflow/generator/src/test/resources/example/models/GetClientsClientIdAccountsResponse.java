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
import org.mifos.conventions.gradle.workflow.generator.example.models.GetClientsLoanAccounts;
import org.mifos.conventions.gradle.workflow.generator.example.models.GetClientsSavingsAccounts;
import org.mifos.conventions.gradle.workflow.generator.example.models.GetClientsWorkingCapitalLoanAccounts;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetClientsClientIdAccountsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.24.0")
public class GetClientsClientIdAccountsResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Set<GetClientsLoanAccounts> loanAccounts;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Set<GetClientsSavingsAccounts> savingsAccounts;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Set<GetClientsWorkingCapitalLoanAccounts> workingCapitalLoanAccounts;

  public GetClientsClientIdAccountsResponse loanAccounts(Set<GetClientsLoanAccounts> loanAccounts) {
    this.loanAccounts = loanAccounts;
    return this;
  }

  public GetClientsClientIdAccountsResponse addLoanAccountsItem(GetClientsLoanAccounts loanAccountsItem) {
    if (this.loanAccounts == null) {
      this.loanAccounts = new LinkedHashSet<>();
    }
    this.loanAccounts.add(loanAccountsItem);
    return this;
  }

  /**
   * Get loanAccounts
   * @return loanAccounts
   */
  
  @JsonProperty("loanAccounts")
  public Set<GetClientsLoanAccounts> getLoanAccounts() {
    return loanAccounts;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("loanAccounts")
  public void setLoanAccounts(Set<GetClientsLoanAccounts> loanAccounts) {
    this.loanAccounts = loanAccounts;
  }

  public GetClientsClientIdAccountsResponse savingsAccounts(Set<GetClientsSavingsAccounts> savingsAccounts) {
    this.savingsAccounts = savingsAccounts;
    return this;
  }

  public GetClientsClientIdAccountsResponse addSavingsAccountsItem(GetClientsSavingsAccounts savingsAccountsItem) {
    if (this.savingsAccounts == null) {
      this.savingsAccounts = new LinkedHashSet<>();
    }
    this.savingsAccounts.add(savingsAccountsItem);
    return this;
  }

  /**
   * Get savingsAccounts
   * @return savingsAccounts
   */
  
  @JsonProperty("savingsAccounts")
  public Set<GetClientsSavingsAccounts> getSavingsAccounts() {
    return savingsAccounts;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("savingsAccounts")
  public void setSavingsAccounts(Set<GetClientsSavingsAccounts> savingsAccounts) {
    this.savingsAccounts = savingsAccounts;
  }

  public GetClientsClientIdAccountsResponse workingCapitalLoanAccounts(Set<GetClientsWorkingCapitalLoanAccounts> workingCapitalLoanAccounts) {
    this.workingCapitalLoanAccounts = workingCapitalLoanAccounts;
    return this;
  }

  public GetClientsClientIdAccountsResponse addWorkingCapitalLoanAccountsItem(GetClientsWorkingCapitalLoanAccounts workingCapitalLoanAccountsItem) {
    if (this.workingCapitalLoanAccounts == null) {
      this.workingCapitalLoanAccounts = new LinkedHashSet<>();
    }
    this.workingCapitalLoanAccounts.add(workingCapitalLoanAccountsItem);
    return this;
  }

  /**
   * Get workingCapitalLoanAccounts
   * @return workingCapitalLoanAccounts
   */
  
  @JsonProperty("workingCapitalLoanAccounts")
  public Set<GetClientsWorkingCapitalLoanAccounts> getWorkingCapitalLoanAccounts() {
    return workingCapitalLoanAccounts;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("workingCapitalLoanAccounts")
  public void setWorkingCapitalLoanAccounts(Set<GetClientsWorkingCapitalLoanAccounts> workingCapitalLoanAccounts) {
    this.workingCapitalLoanAccounts = workingCapitalLoanAccounts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsClientIdAccountsResponse getClientsClientIdAccountsResponse = (GetClientsClientIdAccountsResponse) o;
    return Objects.equals(this.loanAccounts, getClientsClientIdAccountsResponse.loanAccounts) &&
        Objects.equals(this.savingsAccounts, getClientsClientIdAccountsResponse.savingsAccounts) &&
        Objects.equals(this.workingCapitalLoanAccounts, getClientsClientIdAccountsResponse.workingCapitalLoanAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanAccounts, savingsAccounts, workingCapitalLoanAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsClientIdAccountsResponse {\n");
    sb.append("    loanAccounts: ").append(toIndentedString(loanAccounts)).append("\n");
    sb.append("    savingsAccounts: ").append(toIndentedString(savingsAccounts)).append("\n");
    sb.append("    workingCapitalLoanAccounts: ").append(toIndentedString(workingCapitalLoanAccounts)).append("\n");
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

