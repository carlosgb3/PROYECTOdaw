package DAW.proyecto.groupGifts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateUserDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class CreateUserDto {

  private String name;

  private String surame;

  private String nickName;

  private String pass;

  private String email;

  /**
   * Default constructor
   * @deprecated Use {@link CreateUserDto#CreateUserDto(String, String, String, String)}
   */
  @Deprecated
  public CreateUserDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUserDto(String name, String nickName, String pass, String email) {
    this.name = name;
    this.nickName = nickName;
    this.pass = pass;
    this.email = email;
  }

  public CreateUserDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateUserDto surame(String surame) {
    this.surame = surame;
    return this;
  }

  /**
   * Get surame
   * @return surame
  */
  
  @Schema(name = "surame", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("surame")
  public String getSurame() {
    return surame;
  }

  public void setSurame(String surame) {
    this.surame = surame;
  }

  public CreateUserDto nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

  /**
   * Get nickName
   * @return nickName
  */
  @NotNull 
  @Schema(name = "nick_name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nick_name")
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public CreateUserDto pass(String pass) {
    this.pass = pass;
    return this;
  }

  /**
   * Get pass
   * @return pass
  */
  @NotNull 
  @Schema(name = "pass", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pass")
  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public CreateUserDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserDto createUserDto = (CreateUserDto) o;
    return Objects.equals(this.name, createUserDto.name) &&
        Objects.equals(this.surame, createUserDto.surame) &&
        Objects.equals(this.nickName, createUserDto.nickName) &&
        Objects.equals(this.pass, createUserDto.pass) &&
        Objects.equals(this.email, createUserDto.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surame, nickName, pass, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surame: ").append(toIndentedString(surame)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

