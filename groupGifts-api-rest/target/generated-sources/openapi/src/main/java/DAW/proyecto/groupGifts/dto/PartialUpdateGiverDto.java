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
 * PartialUpdateGiverDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class PartialUpdateGiverDto {

  private String name;

  private String surname;

  private String email;

  private Long giftId;

  private Long contributionId;

  public PartialUpdateGiverDto name(String name) {
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

  public PartialUpdateGiverDto surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  
  @Schema(name = "surname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("surname")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public PartialUpdateGiverDto email(String email) {
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

  public PartialUpdateGiverDto giftId(Long giftId) {
    this.giftId = giftId;
    return this;
  }

  /**
   * Get giftId
   * @return giftId
  */
  
  @Schema(name = "gift_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gift_id")
  public Long getGiftId() {
    return giftId;
  }

  public void setGiftId(Long giftId) {
    this.giftId = giftId;
  }

  public PartialUpdateGiverDto contributionId(Long contributionId) {
    this.contributionId = contributionId;
    return this;
  }

  /**
   * Get contributionId
   * @return contributionId
  */
  
  @Schema(name = "contribution_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contribution_id")
  public Long getContributionId() {
    return contributionId;
  }

  public void setContributionId(Long contributionId) {
    this.contributionId = contributionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialUpdateGiverDto partialUpdateGiverDto = (PartialUpdateGiverDto) o;
    return Objects.equals(this.name, partialUpdateGiverDto.name) &&
        Objects.equals(this.surname, partialUpdateGiverDto.surname) &&
        Objects.equals(this.email, partialUpdateGiverDto.email) &&
        Objects.equals(this.giftId, partialUpdateGiverDto.giftId) &&
        Objects.equals(this.contributionId, partialUpdateGiverDto.contributionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname, email, giftId, contributionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialUpdateGiverDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    giftId: ").append(toIndentedString(giftId)).append("\n");
    sb.append("    contributionId: ").append(toIndentedString(contributionId)).append("\n");
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

