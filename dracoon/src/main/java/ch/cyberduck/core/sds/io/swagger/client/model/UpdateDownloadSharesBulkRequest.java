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
import ch.cyberduck.core.sds.io.swagger.client.model.ObjectExpiration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Request model for updating a list of Download Shares
 */
@Schema(description = "Request model for updating a list of Download Shares")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-25T23:34:01.480829+02:00[Europe/Paris]")
public class UpdateDownloadSharesBulkRequest {
  @JsonProperty("expiration")
  private ObjectExpiration expiration = null;

  @JsonProperty("showCreatorName")
  private Boolean showCreatorName = null;

  @JsonProperty("showCreatorUsername")
  private Boolean showCreatorUsername = null;

  @JsonProperty("maxDownloads")
  private Integer maxDownloads = null;

  @JsonProperty("resetMaxDownloads")
  private Boolean resetMaxDownloads = null;

  @JsonProperty("objectIds")
  private List<Long> objectIds = new ArrayList<>();

  public UpdateDownloadSharesBulkRequest expiration(ObjectExpiration expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @Schema(description = "")
  public ObjectExpiration getExpiration() {
    return expiration;
  }

  public void setExpiration(ObjectExpiration expiration) {
    this.expiration = expiration;
  }

  public UpdateDownloadSharesBulkRequest showCreatorName(Boolean showCreatorName) {
    this.showCreatorName = showCreatorName;
    return this;
  }

   /**
   * Show creator first and last name.
   * @return showCreatorName
  **/
  @Schema(description = "Show creator first and last name.")
  public Boolean isShowCreatorName() {
    return showCreatorName;
  }

  public void setShowCreatorName(Boolean showCreatorName) {
    this.showCreatorName = showCreatorName;
  }

  public UpdateDownloadSharesBulkRequest showCreatorUsername(Boolean showCreatorUsername) {
    this.showCreatorUsername = showCreatorUsername;
    return this;
  }

   /**
   * Show creator email address.
   * @return showCreatorUsername
  **/
  @Schema(description = "Show creator email address.")
  public Boolean isShowCreatorUsername() {
    return showCreatorUsername;
  }

  public void setShowCreatorUsername(Boolean showCreatorUsername) {
    this.showCreatorUsername = showCreatorUsername;
  }

  public UpdateDownloadSharesBulkRequest maxDownloads(Integer maxDownloads) {
    this.maxDownloads = maxDownloads;
    return this;
  }

   /**
   * Max allowed downloads
   * @return maxDownloads
  **/
  @Schema(description = "Max allowed downloads")
  public Integer getMaxDownloads() {
    return maxDownloads;
  }

  public void setMaxDownloads(Integer maxDownloads) {
    this.maxDownloads = maxDownloads;
  }

  public UpdateDownloadSharesBulkRequest resetMaxDownloads(Boolean resetMaxDownloads) {
    this.resetMaxDownloads = resetMaxDownloads;
    return this;
  }

   /**
   * Set &#x27;true&#x27; to reset &#x27;maxDownloads&#x27; for Download Share.
   * @return resetMaxDownloads
  **/
  @Schema(description = "Set 'true' to reset 'maxDownloads' for Download Share.")
  public Boolean isResetMaxDownloads() {
    return resetMaxDownloads;
  }

  public void setResetMaxDownloads(Boolean resetMaxDownloads) {
    this.resetMaxDownloads = resetMaxDownloads;
  }

  public UpdateDownloadSharesBulkRequest objectIds(List<Long> objectIds) {
    this.objectIds = objectIds;
    return this;
  }

  public UpdateDownloadSharesBulkRequest addObjectIdsItem(Long objectIdsItem) {
    this.objectIds.add(objectIdsItem);
    return this;
  }

   /**
   * List of ids
   * @return objectIds
  **/
  @Schema(required = true, description = "List of ids")
  public List<Long> getObjectIds() {
    return objectIds;
  }

  public void setObjectIds(List<Long> objectIds) {
    this.objectIds = objectIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDownloadSharesBulkRequest updateDownloadSharesBulkRequest = (UpdateDownloadSharesBulkRequest) o;
    return Objects.equals(this.expiration, updateDownloadSharesBulkRequest.expiration) &&
        Objects.equals(this.showCreatorName, updateDownloadSharesBulkRequest.showCreatorName) &&
        Objects.equals(this.showCreatorUsername, updateDownloadSharesBulkRequest.showCreatorUsername) &&
        Objects.equals(this.maxDownloads, updateDownloadSharesBulkRequest.maxDownloads) &&
        Objects.equals(this.resetMaxDownloads, updateDownloadSharesBulkRequest.resetMaxDownloads) &&
        Objects.equals(this.objectIds, updateDownloadSharesBulkRequest.objectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiration, showCreatorName, showCreatorUsername, maxDownloads, resetMaxDownloads, objectIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDownloadSharesBulkRequest {\n");
    
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    showCreatorName: ").append(toIndentedString(showCreatorName)).append("\n");
    sb.append("    showCreatorUsername: ").append(toIndentedString(showCreatorUsername)).append("\n");
    sb.append("    maxDownloads: ").append(toIndentedString(maxDownloads)).append("\n");
    sb.append("    resetMaxDownloads: ").append(toIndentedString(resetMaxDownloads)).append("\n");
    sb.append("    objectIds: ").append(toIndentedString(objectIds)).append("\n");
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
