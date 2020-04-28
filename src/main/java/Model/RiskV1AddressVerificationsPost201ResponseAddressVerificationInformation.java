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
import Model.RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode;
import Model.RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-20T15:59:18.387+05:30")
public class RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation {
  @SerializedName("addressType")
  private String addressType = null;

  @SerializedName("barCode")
  private RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode barCode = null;

  @SerializedName("applicableRegion")
  private String applicableRegion = null;

  @SerializedName("errorCode")
  private String errorCode = null;

  @SerializedName("statusCode")
  private String statusCode = null;

  @SerializedName("careOf")
  private String careOf = null;

  @SerializedName("matchScore")
  private Integer matchScore = null;

  @SerializedName("standardAddress")
  private RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress standardAddress = null;

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Contains the record type of the postal code with which the address was matched.  #### U.S. Addresses Depending on the quantity and quality of the address information provided, this field contains one or two characters:  - One character: sufficient correct information was provided to result in accurate matching. - Two characters: standardization would provide a better address if more or better input address information were available. The second character is D (default).  Blank fields are unassigned. When an address cannot be standardized, how the input data was parsed determines the address type. In this case, standardization may indicate a street, rural route, highway contract, general delivery, or PO box. For possible values, see the description for the &#x60;dav_address_type&#x60; reply field in [CyberSource Verification Services Using the SCMP API](https://apps.cybersource.com/library/documentation/dev_guides/Verification_Svcs_SCMP_API/html/)  #### All Other Countries This field contains one of the following values: - P: Post. - S: Street. - x: Unknown. 
   * @return addressType
  **/
  @ApiModelProperty(value = "Contains the record type of the postal code with which the address was matched.  #### U.S. Addresses Depending on the quantity and quality of the address information provided, this field contains one or two characters:  - One character: sufficient correct information was provided to result in accurate matching. - Two characters: standardization would provide a better address if more or better input address information were available. The second character is D (default).  Blank fields are unassigned. When an address cannot be standardized, how the input data was parsed determines the address type. In this case, standardization may indicate a street, rural route, highway contract, general delivery, or PO box. For possible values, see the description for the `dav_address_type` reply field in [CyberSource Verification Services Using the SCMP API](https://apps.cybersource.com/library/documentation/dev_guides/Verification_Svcs_SCMP_API/html/)  #### All Other Countries This field contains one of the following values: - P: Post. - S: Street. - x: Unknown. ")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation barCode(RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode barCode) {
    this.barCode = barCode;
    return this;
  }

   /**
   * Get barCode
   * @return barCode
  **/
  @ApiModelProperty(value = "")
  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode getBarCode() {
    return barCode;
  }

  public void setBarCode(RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationBarCode barCode) {
    this.barCode = barCode;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation applicableRegion(String applicableRegion) {
    this.applicableRegion = applicableRegion;
    return this;
  }

   /**
   * Value can be - Canada - US - International. The values of errorCode and statusCode mean different things depending on the applicable region. Refer to the guide for more info. 
   * @return applicableRegion
  **/
  @ApiModelProperty(value = "Value can be - Canada - US - International. The values of errorCode and statusCode mean different things depending on the applicable region. Refer to the guide for more info. ")
  public String getApplicableRegion() {
    return applicableRegion;
  }

  public void setApplicableRegion(String applicableRegion) {
    this.applicableRegion = applicableRegion;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Four-character error code returned for Canadian, US and international addresses. For possible values, see Verification Services guide. The meaning of the errorCode depends on value of applicableRegion. 
   * @return errorCode
  **/
  @ApiModelProperty(value = "Four-character error code returned for Canadian, US and international addresses. For possible values, see Verification Services guide. The meaning of the errorCode depends on value of applicableRegion. ")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Four-to-ten character status code returned for Canadian, US and international addresses. For possible values, see Verification Services guide. The meaning of the errorCode depends on value of applicableRegion. 
   * @return statusCode
  **/
  @ApiModelProperty(value = "Four-to-ten character status code returned for Canadian, US and international addresses. For possible values, see Verification Services guide. The meaning of the errorCode depends on value of applicableRegion. ")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation careOf(String careOf) {
    this.careOf = careOf;
    return this;
  }

   /**
   * Care of data dropped from the standard address.
   * @return careOf
  **/
  @ApiModelProperty(value = "Care of data dropped from the standard address.")
  public String getCareOf() {
    return careOf;
  }

  public void setCareOf(String careOf) {
    this.careOf = careOf;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation matchScore(Integer matchScore) {
    this.matchScore = matchScore;
    return this;
  }

   /**
   * Indicates the probable correctness of the address match. Returned for U.S. and Canadian addresses. Returns a value from 0-9, where 0 is most likely to be correct and 9 is least likely to be correct, or -1 if there is no address match. 
   * @return matchScore
  **/
  @ApiModelProperty(value = "Indicates the probable correctness of the address match. Returned for U.S. and Canadian addresses. Returns a value from 0-9, where 0 is most likely to be correct and 9 is least likely to be correct, or -1 if there is no address match. ")
  public Integer getMatchScore() {
    return matchScore;
  }

  public void setMatchScore(Integer matchScore) {
    this.matchScore = matchScore;
  }

  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation standardAddress(RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress standardAddress) {
    this.standardAddress = standardAddress;
    return this;
  }

   /**
   * Get standardAddress
   * @return standardAddress
  **/
  @ApiModelProperty(value = "")
  public RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress getStandardAddress() {
    return standardAddress;
  }

  public void setStandardAddress(RiskV1AddressVerificationsPost201ResponseAddressVerificationInformationStandardAddress standardAddress) {
    this.standardAddress = standardAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation riskV1AddressVerificationsPost201ResponseAddressVerificationInformation = (RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation) o;
    return Objects.equals(this.addressType, riskV1AddressVerificationsPost201ResponseAddressVerificationInformation.addressType) &&
        Objects.equals(this.barCode, riskV1AddressVerificationsPost201ResponseAddressVerificationInformation.barCode) &&
        Objects.equals(this.applicableRegion, riskV1AddressVerificationsPost201ResponseAddressVerificationInformation.applicableRegion) &&
        Objects.equals(this.errorCode, riskV1AddressVerificationsPost201ResponseAddressVerificationInformation.errorCode) &&
        Objects.equals(this.statusCode, riskV1AddressVerificationsPost201ResponseAddressVerificationInformation.statusCode) &&
        Objects.equals(this.careOf, riskV1AddressVerificationsPost201ResponseAddressVerificationInformation.careOf) &&
        Objects.equals(this.matchScore, riskV1AddressVerificationsPost201ResponseAddressVerificationInformation.matchScore) &&
        Objects.equals(this.standardAddress, riskV1AddressVerificationsPost201ResponseAddressVerificationInformation.standardAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, barCode, applicableRegion, errorCode, statusCode, careOf, matchScore, standardAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1AddressVerificationsPost201ResponseAddressVerificationInformation {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    barCode: ").append(toIndentedString(barCode)).append("\n");
    sb.append("    applicableRegion: ").append(toIndentedString(applicableRegion)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    careOf: ").append(toIndentedString(careOf)).append("\n");
    sb.append("    matchScore: ").append(toIndentedString(matchScore)).append("\n");
    sb.append("    standardAddress: ").append(toIndentedString(standardAddress)).append("\n");
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
