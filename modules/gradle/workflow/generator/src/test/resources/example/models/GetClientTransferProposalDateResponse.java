package org.mifos.conventions.gradle.workflow.generator.example.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import java.time.LocalDate;
import org.jspecify.annotations.Nullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetClientTransferProposalDateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.24.0")
public class GetClientTransferProposalDateResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate proposedTransferDate;

  public GetClientTransferProposalDateResponse proposedTransferDate(LocalDate proposedTransferDate) {
    this.proposedTransferDate = proposedTransferDate;
    return this;
  }

  /**
   * Get proposedTransferDate
   * @return proposedTransferDate
   */
  
  @JsonProperty("proposedTransferDate")
  public LocalDate getProposedTransferDate() {
    return proposedTransferDate;
  }

  @JsonSetter(nulls = Nulls.SKIP)
  @JsonProperty("proposedTransferDate")
  public void setProposedTransferDate(LocalDate proposedTransferDate) {
    this.proposedTransferDate = proposedTransferDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientTransferProposalDateResponse getClientTransferProposalDateResponse = (GetClientTransferProposalDateResponse) o;
    return Objects.equals(this.proposedTransferDate, getClientTransferProposalDateResponse.proposedTransferDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposedTransferDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientTransferProposalDateResponse {\n");
    sb.append("    proposedTransferDate: ").append(toIndentedString(proposedTransferDate)).append("\n");
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

