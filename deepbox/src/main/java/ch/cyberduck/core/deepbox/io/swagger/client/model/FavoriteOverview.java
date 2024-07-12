/*
 * DeepBox
 * DeepBox API Documentation
 *
 * OpenAPI spec version: 1.0
 * Contact: info@deepcloud.swiss
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.deepbox.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.deepbox.io.swagger.client.model.BoxEntry;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * FavoriteOverview
 */



public class FavoriteOverview {
  @JsonProperty("boxes")
  private List<BoxEntry> boxes = null;

  public FavoriteOverview boxes(List<BoxEntry> boxes) {
    this.boxes = boxes;
    return this;
  }

  public FavoriteOverview addBoxesItem(BoxEntry boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<>();
    }
    this.boxes.add(boxesItem);
    return this;
  }

   /**
   * Get boxes
   * @return boxes
  **/
  @Schema(description = "")
  public List<BoxEntry> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<BoxEntry> boxes) {
    this.boxes = boxes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoriteOverview favoriteOverview = (FavoriteOverview) o;
    return Objects.equals(this.boxes, favoriteOverview.boxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoriteOverview {\n");
    
    sb.append("    boxes: ").append(toIndentedString(boxes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
