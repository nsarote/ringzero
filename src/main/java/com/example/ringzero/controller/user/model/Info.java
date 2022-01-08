package com.example.ringzero.controller.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Info
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-08T07:24:00.004765900+07:00[Asia/Bangkok]")
public class Info   {
  @JsonProperty("seed")
  private String seed;

  @JsonProperty("results")
  private Integer results;

  @JsonProperty("page")
  private Integer page;

  @JsonProperty("version")
  private String version;

  public Info seed(String seed) {
    this.seed = seed;
    return this;
  }

  /**
   * Get seed
   * @return seed
  */
  @ApiModelProperty(value = "")


  public String getSeed() {
    return seed;
  }

  public void setSeed(String seed) {
    this.seed = seed;
  }

  public Info results(Integer results) {
    this.results = results;
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @ApiModelProperty(value = "")


  public Integer getResults() {
    return results;
  }

  public void setResults(Integer results) {
    this.results = results;
  }

  public Info page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
  @ApiModelProperty(value = "")


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Info version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @ApiModelProperty(value = "")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Info info = (Info) o;
    return Objects.equals(this.seed, info.seed) &&
        Objects.equals(this.results, info.results) &&
        Objects.equals(this.page, info.page) &&
        Objects.equals(this.version, info.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seed, results, page, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Info {\n");
    
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

