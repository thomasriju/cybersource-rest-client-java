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
 * Riskv1liststypeentriesPaymentInformationCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:10:54.851+05:30")
public class Riskv1liststypeentriesPaymentInformationCard {
  @SerializedName("number")
  private String number = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("bin")
  private String bin = null;

  public Riskv1liststypeentriesPaymentInformationCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The customer’s payment card number, also known as the Primary Account Number (PAN). You can also use this field for encoded account numbers.  For processor-specific information, see the &#x60;customer_cc_number&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return number
  **/
  @ApiModelProperty(value = "The customer’s payment card number, also known as the Primary Account Number (PAN). You can also use this field for encoded account numbers.  For processor-specific information, see the `customer_cc_number` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Riskv1liststypeentriesPaymentInformationCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Three-digit value that indicates the card type.  Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover - 005: Diners Club - 007: JCB - 024: Maestro (UK Domestic) - 036: Cartes Bancaires - 039 Encoded account number - 042: Maestro (International)  For the complete list of possible values, see &#x60;card_type&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return type
  **/
  @ApiModelProperty(value = "Three-digit value that indicates the card type.  Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover - 005: Diners Club - 007: JCB - 024: Maestro (UK Domestic) - 036: Cartes Bancaires - 039 Encoded account number - 042: Maestro (International)  For the complete list of possible values, see `card_type` field description in the [Credit Card Services Using the SCMP API Guide.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Riskv1liststypeentriesPaymentInformationCard bin(String bin) {
    this.bin = bin;
    return this;
  }

   /**
   * description: The BIN is the first six digits of the card&#39;s Primary Account Number (PAN). 
   * @return bin
  **/
  @ApiModelProperty(value = "description: The BIN is the first six digits of the card's Primary Account Number (PAN). ")
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1liststypeentriesPaymentInformationCard riskv1liststypeentriesPaymentInformationCard = (Riskv1liststypeentriesPaymentInformationCard) o;
    return Objects.equals(this.number, riskv1liststypeentriesPaymentInformationCard.number) &&
        Objects.equals(this.type, riskv1liststypeentriesPaymentInformationCard.type) &&
        Objects.equals(this.bin, riskv1liststypeentriesPaymentInformationCard.bin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type, bin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1liststypeentriesPaymentInformationCard {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
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

