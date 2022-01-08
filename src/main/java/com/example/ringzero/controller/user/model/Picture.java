package com.example.ringzero.controller.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Picture
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-08T07:24:00.004765900+07:00[Asia/Bangkok]")
public class Picture   {
  @JsonProperty("large")
  private String large;

  @JsonProperty("medium")
  private String medium;

  @JsonProperty("thumbnail")
  private String thumbnail;

  public Picture large(String large) {
    this.large = large;
    return this;
  }

  /**
   * Get large
   * @return large
  */
  @ApiModelProperty(value = "")


  public String getLarge() {
    return large;
  }

  public void setLarge(String large) {
    this.large = large;
  }

  public Picture medium(String medium) {
    this.medium = medium;
    return this;
  }

  /**
   * Get medium
   * @return medium
  */
  @ApiModelProperty(value = "")


  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public Picture thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Get thumbnail
   * @return thumbnail
  */
  @ApiModelProperty(value = "")


  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Picture picture = (Picture) o;
    return Objects.equals(this.large, picture.large) &&
        Objects.equals(this.medium, picture.medium) &&
        Objects.equals(this.thumbnail, picture.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(large, medium, thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Picture {\n");
    
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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

