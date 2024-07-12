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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * CreateAdminBoxRelation
 */



public class CreateAdminBoxRelation {
  @JsonProperty("targetBoxNodeId")
  private String targetBoxNodeId = null;

  public CreateAdminBoxRelation targetBoxNodeId(String targetBoxNodeId) {
    this.targetBoxNodeId = targetBoxNodeId;
    return this;
  }

   /**
   * Get targetBoxNodeId
   * @return targetBoxNodeId
  **/
  @Schema(description = "")
  public String getTargetBoxNodeId() {
    return targetBoxNodeId;
  }

  public void setTargetBoxNodeId(String targetBoxNodeId) {
    this.targetBoxNodeId = targetBoxNodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAdminBoxRelation createAdminBoxRelation = (CreateAdminBoxRelation) o;
    return Objects.equals(this.targetBoxNodeId, createAdminBoxRelation.targetBoxNodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetBoxNodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAdminBoxRelation {\n");
    
    sb.append("    targetBoxNodeId: ").append(toIndentedString(targetBoxNodeId)).append("\n");
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
