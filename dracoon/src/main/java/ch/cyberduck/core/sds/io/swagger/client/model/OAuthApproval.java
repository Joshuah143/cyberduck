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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.joda.time.DateTime;
/**
 * OAuth client approval information
 */
@Schema(description = "OAuth client approval information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-25T23:34:01.480829+02:00[Europe/Paris]")
public class OAuthApproval {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientName")
  private String clientName = null;

  @JsonProperty("expiresAt")
  private DateTime expiresAt = null;

  public OAuthApproval clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * ID of the OAuth client
   * @return clientId
  **/
  @Schema(required = true, description = "ID of the OAuth client")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OAuthApproval clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Name, which is shown at the client configuration and authorization.
   * @return clientName
  **/
  @Schema(required = true, description = "Name, which is shown at the client configuration and authorization.")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public OAuthApproval expiresAt(DateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Expiration date of the approval
   * @return expiresAt
  **/
  @Schema(description = "Expiration date of the approval")
  public DateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(DateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthApproval oauthApproval = (OAuthApproval) o;
    return Objects.equals(this.clientId, oauthApproval.clientId) &&
        Objects.equals(this.clientName, oauthApproval.clientName) &&
        Objects.equals(this.expiresAt, oauthApproval.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientName, expiresAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthApproval {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
