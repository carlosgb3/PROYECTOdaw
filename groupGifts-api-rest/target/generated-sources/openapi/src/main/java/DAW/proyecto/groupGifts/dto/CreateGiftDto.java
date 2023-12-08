package DAW.proyecto.groupGifts.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateGiftDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
public class CreateGiftDto {

  private String name;

  private String image;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate endDate;

  private Float price;

  private Long userId;

  /**
   * Default constructor
   * @deprecated Use {@link CreateGiftDto#CreateGiftDto(String, String, LocalDate, LocalDate, Float, Long)}
   */
  @Deprecated
  public CreateGiftDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateGiftDto(String name, String image, LocalDate startDate, LocalDate endDate, Float price, Long userId) {
    this.name = name;
    this.image = image;
    this.startDate = startDate;
    this.endDate = endDate;
    this.price = price;
    this.userId = userId;
  }

  public CreateGiftDto name(String name) {
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

  public CreateGiftDto image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  */
  @NotNull 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public CreateGiftDto startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @NotNull @Valid 
  @Schema(name = "start_date", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public CreateGiftDto endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @NotNull @Valid 
  @Schema(name = "end_date", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end_date")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public CreateGiftDto price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @NotNull 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public CreateGiftDto userId(Long userId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGiftDto createGiftDto = (CreateGiftDto) o;
    return Objects.equals(this.name, createGiftDto.name) &&
        Objects.equals(this.image, createGiftDto.image) &&
        Objects.equals(this.startDate, createGiftDto.startDate) &&
        Objects.equals(this.endDate, createGiftDto.endDate) &&
        Objects.equals(this.price, createGiftDto.price) &&
        Objects.equals(this.userId, createGiftDto.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, image, startDate, endDate, price, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGiftDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

