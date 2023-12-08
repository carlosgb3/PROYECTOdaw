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
 * GiftGiverDto
 */

@JsonTypeName("Gift_giverDto")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class GiftGiverDto {

  private Long giftId;

  private Long giverId;

  /**
   * Default constructor
   * @deprecated Use {@link GiftGiverDto#GiftGiverDto(Long, Long)}
   */
  @Deprecated
  public GiftGiverDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GiftGiverDto(Long giftId, Long giverId) {
    this.giftId = giftId;
    this.giverId = giverId;
  }

  public GiftGiverDto giftId(Long giftId) {
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

  public GiftGiverDto giverId(Long giverId) {
    this.giverId = giverId;
    return this;
  }

  /**
   * Get giverId
   * @return giverId
  */
  @NotNull 
  @Schema(name = "giver_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("giver_id")
  public Long getGiverId() {
    return giverId;
  }

  public void setGiverId(Long giverId) {
    this.giverId = giverId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftGiverDto giftGiverDto = (GiftGiverDto) o;
    return Objects.equals(this.giftId, giftGiverDto.giftId) &&
        Objects.equals(this.giverId, giftGiverDto.giverId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftId, giverId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftGiverDto {\n");
    sb.append("    giftId: ").append(toIndentedString(giftId)).append("\n");
    sb.append("    giverId: ").append(toIndentedString(giverId)).append("\n");
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

