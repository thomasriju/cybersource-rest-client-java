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
import Model.Ptsv2paymentsidreversalsPointOfSaleInformationEmv;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsGet200ResponsePointOfSaleInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T15:31:38.576+05:30")
public class TssV2TransactionsGet200ResponsePointOfSaleInformation {
  @SerializedName("entryMode")
  private String entryMode = null;

  @SerializedName("terminalCapability")
  private Integer terminalCapability = null;

  @SerializedName("emv")
  private Ptsv2paymentsidreversalsPointOfSaleInformationEmv emv = null;

  public TssV2TransactionsGet200ResponsePointOfSaleInformation entryMode(String entryMode) {
    this.entryMode = entryMode;
    return this;
  }

   /**
   * Method of entering payment card information into the POS terminal. Possible values:   - &#x60;contact&#x60;: Read from direct contact with chip card.  - &#x60;contactless&#x60;: Read from a contactless interface using chip data.  - &#x60;keyed&#x60;: Manually keyed into POS terminal. This value is not supported on OmniPay Direct.  - &#x60;msd&#x60;: Read from a contactless interface using magnetic stripe data (MSD). This value is not supported on OmniPay Direct.  - &#x60;swiped&#x60;: Read from credit card magnetic stripe.  The &#x60;contact&#x60;, &#x60;contactless&#x60;, and &#x60;msd&#x60; values are supported only for EMV transactions.  #### Used by **Authorization** Required field.  #### Card Present Card present information about EMV applies only to credit card processing and PIN debit processing. All other card present information applies only to credit card processing. 
   * @return entryMode
  **/
  @ApiModelProperty(value = "Method of entering payment card information into the POS terminal. Possible values:   - `contact`: Read from direct contact with chip card.  - `contactless`: Read from a contactless interface using chip data.  - `keyed`: Manually keyed into POS terminal. This value is not supported on OmniPay Direct.  - `msd`: Read from a contactless interface using magnetic stripe data (MSD). This value is not supported on OmniPay Direct.  - `swiped`: Read from credit card magnetic stripe.  The `contact`, `contactless`, and `msd` values are supported only for EMV transactions.  #### Used by **Authorization** Required field.  #### Card Present Card present information about EMV applies only to credit card processing and PIN debit processing. All other card present information applies only to credit card processing. ")
  public String getEntryMode() {
    return entryMode;
  }

  public void setEntryMode(String entryMode) {
    this.entryMode = entryMode;
  }

  public TssV2TransactionsGet200ResponsePointOfSaleInformation terminalCapability(Integer terminalCapability) {
    this.terminalCapability = terminalCapability;
    return this;
  }

   /**
   * POS terminal’s capability. Possible values:   - &#x60;1&#x60;: Terminal has a magnetic stripe reader only.  - &#x60;2&#x60;: Terminal has a magnetic stripe reader and manual entry capability.  - &#x60;3&#x60;: Terminal has manual entry capability only.  - &#x60;4&#x60;: Terminal can read chip cards.  - &#x60;5&#x60;: Terminal can read contactless chip cards; cannot use contact to read chip cards.  For an EMV transaction, the value of this field must be &#x60;4&#x60; or &#x60;5&#x60;.  #### Used by **Authorization** Required for the following processors: - American Express Direct - Chase Paymentech Solutions - Credit Mutuel-CIC - FDC Nashville Global - FDMS Nashville - OmniPay Direct - SIX - Worldpay VAP  Optional for the following processors: - CyberSource through VisaNet - GPN - GPX - JCN Gateway - RBS WorldPay Atlanta - TSYS Acquiring Solutions 
   * minimum: 1
   * maximum: 5
   * @return terminalCapability
  **/
  @ApiModelProperty(value = "POS terminal’s capability. Possible values:   - `1`: Terminal has a magnetic stripe reader only.  - `2`: Terminal has a magnetic stripe reader and manual entry capability.  - `3`: Terminal has manual entry capability only.  - `4`: Terminal can read chip cards.  - `5`: Terminal can read contactless chip cards; cannot use contact to read chip cards.  For an EMV transaction, the value of this field must be `4` or `5`.  #### Used by **Authorization** Required for the following processors: - American Express Direct - Chase Paymentech Solutions - Credit Mutuel-CIC - FDC Nashville Global - FDMS Nashville - OmniPay Direct - SIX - Worldpay VAP  Optional for the following processors: - CyberSource through VisaNet - GPN - GPX - JCN Gateway - RBS WorldPay Atlanta - TSYS Acquiring Solutions ")
  public Integer getTerminalCapability() {
    return terminalCapability;
  }

  public void setTerminalCapability(Integer terminalCapability) {
    this.terminalCapability = terminalCapability;
  }

  public TssV2TransactionsGet200ResponsePointOfSaleInformation emv(Ptsv2paymentsidreversalsPointOfSaleInformationEmv emv) {
    this.emv = emv;
    return this;
  }

   /**
   * Get emv
   * @return emv
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsPointOfSaleInformationEmv getEmv() {
    return emv;
  }

  public void setEmv(Ptsv2paymentsidreversalsPointOfSaleInformationEmv emv) {
    this.emv = emv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePointOfSaleInformation tssV2TransactionsGet200ResponsePointOfSaleInformation = (TssV2TransactionsGet200ResponsePointOfSaleInformation) o;
    return Objects.equals(this.entryMode, tssV2TransactionsGet200ResponsePointOfSaleInformation.entryMode) &&
        Objects.equals(this.terminalCapability, tssV2TransactionsGet200ResponsePointOfSaleInformation.terminalCapability) &&
        Objects.equals(this.emv, tssV2TransactionsGet200ResponsePointOfSaleInformation.emv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryMode, terminalCapability, emv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePointOfSaleInformation {\n");
    
    sb.append("    entryMode: ").append(toIndentedString(entryMode)).append("\n");
    sb.append("    terminalCapability: ").append(toIndentedString(terminalCapability)).append("\n");
    sb.append("    emv: ").append(toIndentedString(emv)).append("\n");
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

