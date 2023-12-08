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
 * CreateContributionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class CreateContributionDto {

  private String name;

  private String imgPath;

  private Float amount;

  /**
   * Default constructor
   * @deprecated Use {@link CreateContributionDto#CreateContributionDto(String, String, Float)}
   */
  @Deprecated
  public CreateContributionDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateContributionDto(String name, String imgPath, Float amount) {
    this.name = name;
    this.imgPath = imgPath;
    this.amount = amount;
  }

  public CreateContributionDto name(String name) {
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

  public CreateContributionDto imgPath(String imgPath) {
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

  public CreateContributionDto amount(Float amount) {
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
    CreateContributionDto createContributionDto = (CreateContributionDto) o;
    return Objects.equals(this.name, createContributionDto.name) &&
        Objects.equals(this.imgPath, createContributionDto.imgPath) &&
        Objects.equals(this.amount, createContributionDto.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, imgPath, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContributionDto {\n");
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

