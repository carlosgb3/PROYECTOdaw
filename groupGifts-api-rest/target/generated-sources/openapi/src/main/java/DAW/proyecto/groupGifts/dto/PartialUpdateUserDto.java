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
 * PartialUpdateUserDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class PartialUpdateUserDto {

  private String name;

  private String surame;

  private String nickName;

  private String pass;

  private String email;

  public PartialUpdateUserDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartialUpdateUserDto surame(String surame) {
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

  public PartialUpdateUserDto nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

  /**
   * Get nickName
   * @return nickName
  */
  
  @Schema(name = "nick_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nick_name")
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public PartialUpdateUserDto pass(String pass) {
    this.pass = pass;
    return this;
  }

  /**
   * Get pass
   * @return pass
  */
  
  @Schema(name = "pass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pass")
  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public PartialUpdateUserDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PartialUpdateUserDto partialUpdateUserDto = (PartialUpdateUserDto) o;
    return Objects.equals(this.name, partialUpdateUserDto.name) &&
        Objects.equals(this.surame, partialUpdateUserDto.surame) &&
        Objects.equals(this.nickName, partialUpdateUserDto.nickName) &&
        Objects.equals(this.pass, partialUpdateUserDto.pass) &&
        Objects.equals(this.email, partialUpdateUserDto.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surame, nickName, pass, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialUpdateUserDto {\n");
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

