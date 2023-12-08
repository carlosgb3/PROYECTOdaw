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
 * GiverContributionDto
 */

@JsonTypeName("Giver_contributionDto")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class GiverContributionDto {

  private Long giverId;

  private Long contributionId;

  /**
   * Default constructor
   * @deprecated Use {@link GiverContributionDto#GiverContributionDto(Long, Long)}
   */
  @Deprecated
  public GiverContributionDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GiverContributionDto(Long giverId, Long contributionId) {
    this.giverId = giverId;
    this.contributionId = contributionId;
  }

  public GiverContributionDto giverId(Long giverId) {
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

  public GiverContributionDto contributionId(Long contributionId) {
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
    GiverContributionDto giverContributionDto = (GiverContributionDto) o;
    return Objects.equals(this.giverId, giverContributionDto.giverId) &&
        Objects.equals(this.contributionId, giverContributionDto.contributionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giverId, contributionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiverContributionDto {\n");
    sb.append("    giverId: ").append(toIndentedString(giverId)).append("\n");
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

