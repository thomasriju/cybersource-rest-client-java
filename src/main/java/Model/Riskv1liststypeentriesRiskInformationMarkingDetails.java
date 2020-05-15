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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details for marking the transaction as either positive or negative.
 */
@ApiModel(description = "Details for marking the transaction as either positive or negative.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T15:31:38.576+05:30")
public class Riskv1liststypeentriesRiskInformationMarkingDetails {
  @SerializedName("notes")
  private String notes = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("recordName")
  private String recordName = null;

  @SerializedName("action")
  private String action = null;

  public Riskv1liststypeentriesRiskInformationMarkingDetails notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes or details that explain the reasons for adding the transaction to either the positive or negative list.
   * @return notes
  **/
  @ApiModelProperty(value = "Notes or details that explain the reasons for adding the transaction to either the positive or negative list.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Riskv1liststypeentriesRiskInformationMarkingDetails reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason for adding the transaction to the negative list. This field can contain one of the following values: - &#x60;fraud_chargeback:&#x60; You have received a fraud-related chargeback for the transaction. - &#x60;non_fraud_chargeback:&#x60; You have received a non-fraudulent chargeback for the transaction. - &#x60;suspected:&#x60; You believe that you will probably receive a chargeback for the transaction. - &#x60;creditback:&#x60; You issued a refund to the customer to avoid a chargeback for the transaction. 
   * @return reason
  **/
  @ApiModelProperty(value = "Reason for adding the transaction to the negative list. This field can contain one of the following values: - `fraud_chargeback:` You have received a fraud-related chargeback for the transaction. - `non_fraud_chargeback:` You have received a non-fraudulent chargeback for the transaction. - `suspected:` You believe that you will probably receive a chargeback for the transaction. - `creditback:` You issued a refund to the customer to avoid a chargeback for the transaction. ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Riskv1liststypeentriesRiskInformationMarkingDetails recordName(String recordName) {
    this.recordName = recordName;
    return this;
  }

   /**
   * Name of the customer’s record entered in the list. For the positive list, it is required if &#x60;action_ code&#x60;&#x3D;&#x60;add_positive&#x60;. If absent from the request, &#x60;ics_risk_update&#x60; creates the value for this field by concatenating the customer’s first and last names. For the negative and the review lists, &#x60;record_name&#x60;, &#x60;customer_firstname&#x60;, and &#x60;customer_lastname&#x60; are optional. 
   * @return recordName
  **/
  @ApiModelProperty(value = "Name of the customer’s record entered in the list. For the positive list, it is required if `action_ code`=`add_positive`. If absent from the request, `ics_risk_update` creates the value for this field by concatenating the customer’s first and last names. For the negative and the review lists, `record_name`, `customer_firstname`, and `customer_lastname` are optional. ")
  public String getRecordName() {
    return recordName;
  }

  public void setRecordName(String recordName) {
    this.recordName = recordName;
  }

  public Riskv1liststypeentriesRiskInformationMarkingDetails action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Indicates whether to add to or remove a customer’s identity from the negative or positive list. This field can contain one of the following values: - add: Add information to the list. - convert: moves the data. - delete: deletes the data from the list. 
   * @return action
  **/
  @ApiModelProperty(value = "Indicates whether to add to or remove a customer’s identity from the negative or positive list. This field can contain one of the following values: - add: Add information to the list. - convert: moves the data. - delete: deletes the data from the list. ")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1liststypeentriesRiskInformationMarkingDetails riskv1liststypeentriesRiskInformationMarkingDetails = (Riskv1liststypeentriesRiskInformationMarkingDetails) o;
    return Objects.equals(this.notes, riskv1liststypeentriesRiskInformationMarkingDetails.notes) &&
        Objects.equals(this.reason, riskv1liststypeentriesRiskInformationMarkingDetails.reason) &&
        Objects.equals(this.recordName, riskv1liststypeentriesRiskInformationMarkingDetails.recordName) &&
        Objects.equals(this.action, riskv1liststypeentriesRiskInformationMarkingDetails.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, reason, recordName, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1liststypeentriesRiskInformationMarkingDetails {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    recordName: ").append(toIndentedString(recordName)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

