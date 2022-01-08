package com.example.ringzero.controller.user.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-08T07:24:00.004765900+07:00[Asia/Bangkok]")
public class User   {
  @JsonProperty("gender")
  private String gender;

  @JsonProperty("name")
  private Name name;

  @JsonProperty("location")
  private Location location;

  @JsonProperty("email")
  private String email;

  @JsonProperty("login")
  private Login login;

  @JsonProperty("dob")
  private Dob dob;

  @JsonProperty("registered")
  private Registered registered;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("cell")
  private String cell;

  @JsonProperty("id")
  private ID id;

  @JsonProperty("picture")
  private Picture picture;

  @JsonProperty("nat")
  private String nat;

  public User gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(value = "")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public User name(Name name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")

  @Valid

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public User location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User login(Login login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
  */
  @ApiModelProperty(value = "")

  @Valid

  public Login getLogin() {
    return login;
  }

  public void setLogin(Login login) {
    this.login = login;
  }

  public User dob(Dob dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Get dob
   * @return dob
  */
  @ApiModelProperty(value = "")

  @Valid

  public Dob getDob() {
    return dob;
  }

  public void setDob(Dob dob) {
    this.dob = dob;
  }

  public User registered(Registered registered) {
    this.registered = registered;
    return this;
  }

  /**
   * Get registered
   * @return registered
  */
  @ApiModelProperty(value = "")

  @Valid

  public Registered getRegistered() {
    return registered;
  }

  public void setRegistered(Registered registered) {
    this.registered = registered;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @ApiModelProperty(value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User cell(String cell) {
    this.cell = cell;
    return this;
  }

  /**
   * Get cell
   * @return cell
  */
  @ApiModelProperty(value = "")


  public String getCell() {
    return cell;
  }

  public void setCell(String cell) {
    this.cell = cell;
  }

  public User id(ID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")

  @Valid

  public ID getId() {
    return id;
  }

  public void setId(ID id) {
    this.id = id;
  }

  public User picture(Picture picture) {
    this.picture = picture;
    return this;
  }

  /**
   * Get picture
   * @return picture
  */
  @ApiModelProperty(value = "")

  @Valid

  public Picture getPicture() {
    return picture;
  }

  public void setPicture(Picture picture) {
    this.picture = picture;
  }

  public User nat(String nat) {
    this.nat = nat;
    return this;
  }

  /**
   * Get nat
   * @return nat
  */
  @ApiModelProperty(value = "")


  public String getNat() {
    return nat;
  }

  public void setNat(String nat) {
    this.nat = nat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.gender, user.gender) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.location, user.location) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.login, user.login) &&
        Objects.equals(this.dob, user.dob) &&
        Objects.equals(this.registered, user.registered) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.cell, user.cell) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.picture, user.picture) &&
        Objects.equals(this.nat, user.nat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, name, location, email, login, dob, registered, phone, cell, id, picture, nat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    cell: ").append(toIndentedString(cell)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    nat: ").append(toIndentedString(nat)).append("\n");
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

