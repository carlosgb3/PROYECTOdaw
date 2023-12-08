package DAW.proyecto.groupGifts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserGiftDto
 */

@JsonTypeName("User_giftDto")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class UserGiftDto {

  private Long userId;

  private Long giftId;

  /**
   * Default constructor
   * @deprecated Use {@link UserGiftDto#UserGiftDto(Long, Long)}
   */
  @Deprecated
  public UserGiftDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserGiftDto(Long userId, Long giftId) {
    this.userId = userId;
    this.giftId = giftId;
  }

  public UserGiftDto userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @NotNull 
  @Schema(name = "user_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public UserGiftDto giftId(Long giftId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGiftDto userGiftDto = (UserGiftDto) o;
    return Objects.equals(this.userId, userGiftDto.userId) &&
        Objects.equals(this.giftId, userGiftDto.giftId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, giftId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGiftDto {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    giftId: ").append(toIndentedString(giftId)).append("\n");
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

