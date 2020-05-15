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
 * Ptsv2paymentsPointOfSaleInformationEmv
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T15:31:38.576+05:30")
public class Ptsv2paymentsPointOfSaleInformationEmv {
  @SerializedName("tags")
  private String tags = null;

  @SerializedName("cardholderVerificationMethodUsed")
  private Integer cardholderVerificationMethodUsed = null;

  @SerializedName("cardSequenceNumber")
  private String cardSequenceNumber = null;

  @SerializedName("fallback")
  private Boolean fallback = false;

  @SerializedName("fallbackCondition")
  private Integer fallbackCondition = null;

  public Ptsv2paymentsPointOfSaleInformationEmv tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * EMV data that is transmitted from the chip card to the issuer, and from the issuer to the chip card. The EMV data is in the tag-length-value format and includes chip card tags, terminal tags, and transaction detail tags.  For information about the individual tags, see the “Application Specification” section in the EMV 4.3 Specifications: http://emvco.com  **Note** Card present information about EMV applies only to credit card processing and PIN debit processing. All other card present information applies only to credit card processing. PIN debit processing is available only on FDC Nashville Global.  **Important** The following tags contain sensitive information and **must not** be included in this field:   - &#x60;56&#x60;: Track 1 equivalent data  - &#x60;57&#x60;: Track 2 equivalent data  - &#x60;5A&#x60;: Application PAN  - &#x60;5F20&#x60;: Cardholder name  - &#x60;5F24&#x60;: Application expiration date (This sensitivity has been relaxed for Credit Mutuel-CIC, American Express Direct, FDC Nashville Global, First Data Merchant Solutions, and SIX)  - &#x60;99&#x60;: Transaction PIN  - &#x60;9F0B&#x60;: Cardholder name (extended)  - &#x60;9F1F&#x60;: Track 1 discretionary data  - &#x60;9F20&#x60;: Track 2 discretionary data  For captures, this field is required for contact EMV transactions. Otherwise, it is optional.  For credits, this field is required for contact EMV stand-alone credits and contactless EMV stand-alone credits. Otherwise, it is optional.  **Important** For contact EMV captures, contact EMV stand-alone credits, and contactless EMV stand-alone credits, you must include the following tags in this field. For all other types of EMV transactions, the following tags are optional.   - &#x60;95&#x60;: Terminal verification results  - &#x60;9F10&#x60;: Issuer application data  - &#x60;9F26&#x60;: Application cryptogram   #### CyberSource through VisaNet - In Japan: 199 bytes - In other countries: String (252)  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International  #### JCN Gateway The following tags must be included: - &#x60;4F&#x60;: Application identifier - &#x60;84&#x60;: Dedicated file name  Data length: 199 bytes  #### All other processors: String (999)  #### Used by Authorization: Optional Authorization Reversal: Optional Credit: Optional PIN Debit processing (purchase, credit and reversal): Optional 
   * @return tags
  **/
  @ApiModelProperty(value = "EMV data that is transmitted from the chip card to the issuer, and from the issuer to the chip card. The EMV data is in the tag-length-value format and includes chip card tags, terminal tags, and transaction detail tags.  For information about the individual tags, see the “Application Specification” section in the EMV 4.3 Specifications: http://emvco.com  **Note** Card present information about EMV applies only to credit card processing and PIN debit processing. All other card present information applies only to credit card processing. PIN debit processing is available only on FDC Nashville Global.  **Important** The following tags contain sensitive information and **must not** be included in this field:   - `56`: Track 1 equivalent data  - `57`: Track 2 equivalent data  - `5A`: Application PAN  - `5F20`: Cardholder name  - `5F24`: Application expiration date (This sensitivity has been relaxed for Credit Mutuel-CIC, American Express Direct, FDC Nashville Global, First Data Merchant Solutions, and SIX)  - `99`: Transaction PIN  - `9F0B`: Cardholder name (extended)  - `9F1F`: Track 1 discretionary data  - `9F20`: Track 2 discretionary data  For captures, this field is required for contact EMV transactions. Otherwise, it is optional.  For credits, this field is required for contact EMV stand-alone credits and contactless EMV stand-alone credits. Otherwise, it is optional.  **Important** For contact EMV captures, contact EMV stand-alone credits, and contactless EMV stand-alone credits, you must include the following tags in this field. For all other types of EMV transactions, the following tags are optional.   - `95`: Terminal verification results  - `9F10`: Issuer application data  - `9F26`: Application cryptogram   #### CyberSource through VisaNet - In Japan: 199 bytes - In other countries: String (252)  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International  #### JCN Gateway The following tags must be included: - `4F`: Application identifier - `84`: Dedicated file name  Data length: 199 bytes  #### All other processors: String (999)  #### Used by Authorization: Optional Authorization Reversal: Optional Credit: Optional PIN Debit processing (purchase, credit and reversal): Optional ")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public Ptsv2paymentsPointOfSaleInformationEmv cardholderVerificationMethodUsed(Integer cardholderVerificationMethodUsed) {
    this.cardholderVerificationMethodUsed = cardholderVerificationMethodUsed;
    return this;
  }

   /**
   * Method that was used to verify the cardholder&#39;s identity.  Possible values:  - &#x60;0&#x60;: No verification  - &#x60;1&#x60;: Signature  This field is supported only on **American Express Direct**. 
   * @return cardholderVerificationMethodUsed
  **/
  @ApiModelProperty(value = "Method that was used to verify the cardholder's identity.  Possible values:  - `0`: No verification  - `1`: Signature  This field is supported only on **American Express Direct**. ")
  public Integer getCardholderVerificationMethodUsed() {
    return cardholderVerificationMethodUsed;
  }

  public void setCardholderVerificationMethodUsed(Integer cardholderVerificationMethodUsed) {
    this.cardholderVerificationMethodUsed = cardholderVerificationMethodUsed;
  }

  public Ptsv2paymentsPointOfSaleInformationEmv cardSequenceNumber(String cardSequenceNumber) {
    this.cardSequenceNumber = cardSequenceNumber;
    return this;
  }

   /**
   * Number assigned to a specific card when two or more cards are associated with the same primary account number. This value enables issuers to distinguish among multiple cards that are linked to the same account. This value can also act as a tracking tool when reissuing cards. When this value is available, it is provided by the chip reader. When the chip reader does not provide this value, do not include this field in your request.  **Note** Card present information about EMV applies only to credit card processing and PIN debit processing. All other card present information applies only to credit card processing. PIN debit processing is available only on CyberSource through VisaNet and FDC Nashville Global.  #### Used by Authorization: Optional PIN Debit processing: Optional  #### GPX  This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International 
   * @return cardSequenceNumber
  **/
  @ApiModelProperty(value = "Number assigned to a specific card when two or more cards are associated with the same primary account number. This value enables issuers to distinguish among multiple cards that are linked to the same account. This value can also act as a tracking tool when reissuing cards. When this value is available, it is provided by the chip reader. When the chip reader does not provide this value, do not include this field in your request.  **Note** Card present information about EMV applies only to credit card processing and PIN debit processing. All other card present information applies only to credit card processing. PIN debit processing is available only on CyberSource through VisaNet and FDC Nashville Global.  #### Used by Authorization: Optional PIN Debit processing: Optional  #### GPX  This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International ")
  public String getCardSequenceNumber() {
    return cardSequenceNumber;
  }

  public void setCardSequenceNumber(String cardSequenceNumber) {
    this.cardSequenceNumber = cardSequenceNumber;
  }

  public Ptsv2paymentsPointOfSaleInformationEmv fallback(Boolean fallback) {
    this.fallback = fallback;
    return this;
  }

   /**
   * Indicates whether a fallback method was used to enter credit card information into the POS terminal. When a technical problem prevents a successful exchange of information between a chip card and a chip-capable terminal:   1. Swipe the card or key the credit card information into the POS terminal.  2. Use the pointOfSaleInformation.entryMode field to indicate whether the information was swiped or keyed.   Possible values: - &#x60;true&#x60;: Fallback method was used. - &#x60;false&#x60; (default): Fallback method was not used.  This field is supported only on American Express Direct, Chase Paymentech Solutions, CyberSource through VisaNet, FDC Nashville Global, GPN, JCN Gateway, OmniPay Direct, and SIX. 
   * @return fallback
  **/
  @ApiModelProperty(value = "Indicates whether a fallback method was used to enter credit card information into the POS terminal. When a technical problem prevents a successful exchange of information between a chip card and a chip-capable terminal:   1. Swipe the card or key the credit card information into the POS terminal.  2. Use the pointOfSaleInformation.entryMode field to indicate whether the information was swiped or keyed.   Possible values: - `true`: Fallback method was used. - `false` (default): Fallback method was not used.  This field is supported only on American Express Direct, Chase Paymentech Solutions, CyberSource through VisaNet, FDC Nashville Global, GPN, JCN Gateway, OmniPay Direct, and SIX. ")
  public Boolean getFallback() {
    return fallback;
  }

  public void setFallback(Boolean fallback) {
    this.fallback = fallback;
  }

  public Ptsv2paymentsPointOfSaleInformationEmv fallbackCondition(Integer fallbackCondition) {
    this.fallbackCondition = fallbackCondition;
    return this;
  }

   /**
   * Reason for the EMV fallback transaction. An EMV fallback transaction occurs when an EMV transaction fails for one of these reasons:   - Technical failure: the EMV terminal or EMV card cannot read and process chip data.  - Empty candidate list failure: the EMV terminal does not have any applications in common with the EMV card.    EMV terminals are coded to determine whether the terminal and EMV card have any applications in common.    EMV terminals provide this information to you.  Possible values:   - &#x60;1&#x60;: Transaction was initiated with information from a magnetic stripe, and the previous transaction at the       EMV terminal either used information from a successful chip read or it was not a chip transaction.  - &#x60;2&#x60;: Transaction was initiated with information from a magnetic stripe, and the previous transaction at the       EMV terminal was an EMV fallback transaction because the attempted chip read was unsuccessful.  This field is supported only on **GPN** and **JCN Gateway**.  **NOTE**: This field is required when an EMV transaction fails for a technical reason. Do not include this field  when the EMV terminal does not have any applications in common with the EMV card. 
   * @return fallbackCondition
  **/
  @ApiModelProperty(value = "Reason for the EMV fallback transaction. An EMV fallback transaction occurs when an EMV transaction fails for one of these reasons:   - Technical failure: the EMV terminal or EMV card cannot read and process chip data.  - Empty candidate list failure: the EMV terminal does not have any applications in common with the EMV card.    EMV terminals are coded to determine whether the terminal and EMV card have any applications in common.    EMV terminals provide this information to you.  Possible values:   - `1`: Transaction was initiated with information from a magnetic stripe, and the previous transaction at the       EMV terminal either used information from a successful chip read or it was not a chip transaction.  - `2`: Transaction was initiated with information from a magnetic stripe, and the previous transaction at the       EMV terminal was an EMV fallback transaction because the attempted chip read was unsuccessful.  This field is supported only on **GPN** and **JCN Gateway**.  **NOTE**: This field is required when an EMV transaction fails for a technical reason. Do not include this field  when the EMV terminal does not have any applications in common with the EMV card. ")
  public Integer getFallbackCondition() {
    return fallbackCondition;
  }

  public void setFallbackCondition(Integer fallbackCondition) {
    this.fallbackCondition = fallbackCondition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPointOfSaleInformationEmv ptsv2paymentsPointOfSaleInformationEmv = (Ptsv2paymentsPointOfSaleInformationEmv) o;
    return Objects.equals(this.tags, ptsv2paymentsPointOfSaleInformationEmv.tags) &&
        Objects.equals(this.cardholderVerificationMethodUsed, ptsv2paymentsPointOfSaleInformationEmv.cardholderVerificationMethodUsed) &&
        Objects.equals(this.cardSequenceNumber, ptsv2paymentsPointOfSaleInformationEmv.cardSequenceNumber) &&
        Objects.equals(this.fallback, ptsv2paymentsPointOfSaleInformationEmv.fallback) &&
        Objects.equals(this.fallbackCondition, ptsv2paymentsPointOfSaleInformationEmv.fallbackCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, cardholderVerificationMethodUsed, cardSequenceNumber, fallback, fallbackCondition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPointOfSaleInformationEmv {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    cardholderVerificationMethodUsed: ").append(toIndentedString(cardholderVerificationMethodUsed)).append("\n");
    sb.append("    cardSequenceNumber: ").append(toIndentedString(cardSequenceNumber)).append("\n");
    sb.append("    fallback: ").append(toIndentedString(fallback)).append("\n");
    sb.append("    fallbackCondition: ").append(toIndentedString(fallbackCondition)).append("\n");
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

