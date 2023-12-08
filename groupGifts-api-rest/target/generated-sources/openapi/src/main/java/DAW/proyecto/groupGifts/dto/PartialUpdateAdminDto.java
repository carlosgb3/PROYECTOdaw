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
 * PartialUpdateAdminDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class PartialUpdateAdminDto {

  private String nickName;

  private String pass;

  public PartialUpdateAdminDto nickName(String nickName) {
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

  public PartialUpdateAdminDto pass(String pass) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialUpdateAdminDto partialUpdateAdminDto = (PartialUpdateAdminDto) o;
    return Objects.equals(this.nickName, partialUpdateAdminDto.nickName) &&
        Objects.equals(this.pass, partialUpdateAdminDto.pass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nickName, pass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialUpdateAdminDto {\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
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

