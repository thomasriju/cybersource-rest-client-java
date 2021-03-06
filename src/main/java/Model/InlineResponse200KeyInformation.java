/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.InlineResponse201ErrorInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * key information 
 */
@ApiModel(description = "key information ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class InlineResponse200KeyInformation {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("keyId")
  private String keyId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("expirationDate")
  private String expirationDate = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("errorInformation")
  private InlineResponse201ErrorInformation errorInformation = null;

  public InlineResponse200KeyInformation organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Merchant Id 
   * @return organizationId
  **/
  @ApiModelProperty(value = "Merchant Id ")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public InlineResponse200KeyInformation keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Key serial number 
   * @return keyId
  **/
  @ApiModelProperty(value = "Key serial number ")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public InlineResponse200KeyInformation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the key.  Possible values:  - FAILED  - ACTIVE  - INACTIVE  - EXPIRED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the key.  Possible values:  - FAILED  - ACTIVE  - INACTIVE  - EXPIRED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse200KeyInformation expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration time in UTC. 
   * @return expirationDate
  **/
  @ApiModelProperty(value = "The expiration time in UTC. ")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public InlineResponse200KeyInformation message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message in case of failed key 
   * @return message
  **/
  @ApiModelProperty(value = "message in case of failed key ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse200KeyInformation errorInformation(InlineResponse201ErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201ErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(InlineResponse201ErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200KeyInformation inlineResponse200KeyInformation = (InlineResponse200KeyInformation) o;
    return Objects.equals(this.organizationId, inlineResponse200KeyInformation.organizationId) &&
        Objects.equals(this.keyId, inlineResponse200KeyInformation.keyId) &&
        Objects.equals(this.status, inlineResponse200KeyInformation.status) &&
        Objects.equals(this.expirationDate, inlineResponse200KeyInformation.expirationDate) &&
        Objects.equals(this.message, inlineResponse200KeyInformation.message) &&
        Objects.equals(this.errorInformation, inlineResponse200KeyInformation.errorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, keyId, status, expirationDate, message, errorInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200KeyInformation {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
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

