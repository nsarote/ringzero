package com.example.ringzero.controller.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Login
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-08T07:24:00.004765900+07:00[Asia/Bangkok]")
public class Login   {
  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("salt")
  private String salt;

  @JsonProperty("md5")
  private String md5;

  @JsonProperty("sha1")
  private String sha1;

  @JsonProperty("sha256")
  private String sha256;

  public Login uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @ApiModelProperty(value = "")


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Login username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @ApiModelProperty(value = "")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Login password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Login salt(String salt) {
    this.salt = salt;
    return this;
  }

  /**
   * Get salt
   * @return salt
  */
  @ApiModelProperty(value = "")


  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public Login md5(String md5) {
    this.md5 = md5;
    return this;
  }

  /**
   * Get md5
   * @return md5
  */
  @ApiModelProperty(value = "")


  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public Login sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

  /**
   * Get sha1
   * @return sha1
  */
  @ApiModelProperty(value = "")


  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public Login sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

  /**
   * Get sha256
   * @return sha256
  */
  @ApiModelProperty(value = "")


  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Login login = (Login) o;
    return Objects.equals(this.uuid, login.uuid) &&
        Objects.equals(this.username, login.username) &&
        Objects.equals(this.password, login.password) &&
        Objects.equals(this.salt, login.salt) &&
        Objects.equals(this.md5, login.md5) &&
        Objects.equals(this.sha1, login.sha1) &&
        Objects.equals(this.sha256, login.sha256);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, username, password, salt, md5, sha1, sha256);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Login {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
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

