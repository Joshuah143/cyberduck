/*
 * DRACOON API
 * REST Web Services for DRACOON<br>built at: 1970-01-01 00:00:00.000<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.28.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.sds.io.swagger.client.model.LogOperation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * List of log operations
 */
@Schema(description = "List of log operations")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-25T23:34:01.480829+02:00[Europe/Paris]")
public class LogOperationList {
  @JsonProperty("operationList")
  private List<LogOperation> operationList = new ArrayList<>();

  public LogOperationList operationList(List<LogOperation> operationList) {
    this.operationList = operationList;
    return this;
  }

  public LogOperationList addOperationListItem(LogOperation operationListItem) {
    this.operationList.add(operationListItem);
    return this;
  }

   /**
   * List of all log operations
   * @return operationList
  **/
  @Schema(required = true, description = "List of all log operations")
  public List<LogOperation> getOperationList() {
    return operationList;
  }

  public void setOperationList(List<LogOperation> operationList) {
    this.operationList = operationList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogOperationList logOperationList = (LogOperationList) o;
    return Objects.equals(this.operationList, logOperationList.operationList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogOperationList {\n");
    
    sb.append("    operationList: ").append(toIndentedString(operationList)).append("\n");
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
