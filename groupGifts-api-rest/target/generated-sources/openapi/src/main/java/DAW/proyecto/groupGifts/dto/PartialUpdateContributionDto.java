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
 * PartialUpdateContributionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class PartialUpdateContributionDto {

  private String name;

  private String imgPath;

  private Float amount;

  public PartialUpdateContributionDto name(String name) {
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

  public PartialUpdateContributionDto imgPath(String imgPath) {
    this.imgPath = imgPath;
    return this;
  }

  /**
   * Get imgPath
   * @return imgPath
  */
  
  @Schema(name = "img_path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("img_path")
  public String getImgPath() {
    return imgPath;
  }

  public void setImgPath(String imgPath) {
    this.imgPath = imgPath;
  }

  public PartialUpdateContributionDto amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PartialUpdateContributionDto partialUpdateContributionDto = (PartialUpdateContributionDto) o;
    return Objects.equals(this.name, partialUpdateContributionDto.name) &&
        Objects.equals(this.imgPath, partialUpdateContributionDto.imgPath) &&
        Objects.equals(this.amount, partialUpdateContributionDto.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, imgPath, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialUpdateContributionDto {\n");
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

