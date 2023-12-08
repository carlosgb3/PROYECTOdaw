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
 * UpdateGiverDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class UpdateGiverDto {

  private String name;

  private String surname;

  private String email;

  private Long giftId;

  private Long contributionId;

  /**
   * Default constructor
   * @deprecated Use {@link UpdateGiverDto#UpdateGiverDto(String, String, String, Long, Long)}
   */
  @Deprecated
  public UpdateGiverDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateGiverDto(String name, String surname, String email, Long giftId, Long contributionId) {
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.giftId = giftId;
    this.contributionId = contributionId;
  }

  public UpdateGiverDto name(String name) {
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

  public UpdateGiverDto surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  @NotNull 
  @Schema(name = "surname", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("surname")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public UpdateGiverDto email(String email) {
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

  public UpdateGiverDto giftId(Long giftId) {
    this.giftId = giftId;
    return this;
  }

  /**
   * Get giftId
   * @return giftId
  */
  @NotNull 
  @Schema(name = "gift_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gift_id")
  public Long getGiftId() {
    return giftId;
  }

  public void setGiftId(Long giftId) {
    this.giftId = giftId;
  }

  public UpdateGiverDto contributionId(Long contributionId) {
    this.contributionId = contributionId;
    return this;
  }

  /**
   * Get contributionId
   * @return contributionId
  */
  @NotNull 
  @Schema(name = "contribution_id", requiredMode = Schema.RequiredMode.REQUIRED)
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
    UpdateGiverDto updateGiverDto = (UpdateGiverDto) o;
    return Objects.equals(this.name, updateGiverDto.name) &&
        Objects.equals(this.surname, updateGiverDto.surname) &&
        Objects.equals(this.email, updateGiverDto.email) &&
        Objects.equals(this.giftId, updateGiverDto.giftId) &&
        Objects.equals(this.contributionId, updateGiverDto.contributionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname, email, giftId, contributionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGiverDto {\n");
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

