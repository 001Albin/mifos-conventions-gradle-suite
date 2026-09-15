package org.mifos.conventions.gradle.workflow.generator.example.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.mifos.conventions.gradle.workflow.generator.example.models.GetClientsPageItemsResponse;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetClientsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.24.0")
public class GetClientsResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<GetClientsPageItemsResponse> pageItems;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer totalFilteredRecords;

  public GetClientsResponse pageItems(List<GetClientsPageItemsResponse> pageItems) {
    this.pageItems = pageItems;
    return this;
  }

  public GetClientsResponse addPageItemsItem(GetClientsPageItemsResponse pageItemsItem) {
    if (this.pageItems == null) {
      this.pageItems = new ArrayList<>();
    }
    this.pageItems.add(pageItemsItem);
    return this;
  }

  /**
   * Get pageItems
   * @return pageItems
   */
  
  @JsonProperty("pageItems")
  public List<GetClientsPageItemsResponse> getPageItems() {
    return pageItems;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("pageItems")
  public void setPageItems(List<GetClientsPageItemsResponse> pageItems) {
    this.pageItems = pageItems;
  }

  public GetClientsResponse totalFilteredRecords(Integer totalFilteredRecords) {
    this.totalFilteredRecords = totalFilteredRecords;
    return this;
  }

  /**
   * Get totalFilteredRecords
   * @return totalFilteredRecords
   */
  
  @JsonProperty("totalFilteredRecords")
  public Integer getTotalFilteredRecords() {
    return totalFilteredRecords;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("totalFilteredRecords")
  public void setTotalFilteredRecords(Integer totalFilteredRecords) {
    this.totalFilteredRecords = totalFilteredRecords;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientsResponse getClientsResponse = (GetClientsResponse) o;
    return Objects.equals(this.pageItems, getClientsResponse.pageItems) &&
        Objects.equals(this.totalFilteredRecords, getClientsResponse.totalFilteredRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageItems, totalFilteredRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientsResponse {\n");
    sb.append("    pageItems: ").append(toIndentedString(pageItems)).append("\n");
    sb.append("    totalFilteredRecords: ").append(toIndentedString(totalFilteredRecords)).append("\n");
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

