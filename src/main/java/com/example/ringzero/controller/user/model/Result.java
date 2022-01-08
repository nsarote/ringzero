package com.example.ringzero.controller.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Result
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-08T07:24:00.004765900+07:00[Asia/Bangkok]")
public class Result   {
  @JsonProperty("results")
  @Valid
  private List<User> results = null;

  @JsonProperty("info")
  private Info info;

  public Result results(List<User> results) {
    this.results = results;
    return this;
  }

  public Result addResultsItem(User resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<User> getResults() {
    return results;
  }

  public void setResults(List<User> results) {
    this.results = results;
  }

  public Result info(Info info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  */
  @ApiModelProperty(value = "")

  @Valid

  public Info getInfo() {
    return info;
  }

  public void setInfo(Info info) {
    this.info = info;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this.results, result.results) &&
        Objects.equals(this.info, result.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

