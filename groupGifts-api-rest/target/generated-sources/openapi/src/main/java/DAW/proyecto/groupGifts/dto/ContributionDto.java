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
 * ContributionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class ContributionDto {

  private Long id;

  private String name;

  private String imgPath;

  private Float amount;

  /**
   * Default constructor
   * @deprecated Use {@link ContributionDto#ContributionDto(Long, String, String, Float)}
   */
  @Deprecated
  public ContributionDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContributionDto(Long id, String name, String imgPath, Float amount) {
    this.id = id;
    this.name = name;
    this.imgPath = imgPath;
    this.amount = amount;
  }

  public ContributionDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ContributionDto name(String name) {
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

  public ContributionDto imgPath(String imgPath) {
    this.imgPath = imgPath;
    return this;
  }

  /**
   * Get imgPath
   * @return imgPath
  */
  @NotNull 
  @Schema(name = "img_path", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("img_path")
  public String getImgPath() {
    return imgPath;
  }

  public void setImgPath(String imgPath) {
    this.imgPath = imgPath;
  }

  public ContributionDto amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContributionDto contributionDto = (ContributionDto) o;
    return Objects.equals(this.id, contributionDto.id) &&
        Objects.equals(this.name, contributionDto.name) &&
        Objects.equals(this.imgPath, contributionDto.imgPath) &&
        Objects.equals(this.amount, contributionDto.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, imgPath, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContributionDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imgPath: ").append(toIndentedString(imgPath)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

