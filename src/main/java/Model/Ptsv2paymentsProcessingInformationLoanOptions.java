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
 * Ptsv2paymentsProcessingInformationLoanOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T15:31:38.576+05:30")
public class Ptsv2paymentsProcessingInformationLoanOptions {
  @SerializedName("type")
  private String type = null;

  @SerializedName("assetType")
  private String assetType = null;

  public Ptsv2paymentsProcessingInformationLoanOptions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of loan based on an agreement between you and the issuer. Examples: AGROCUSTEIO, AGRO-INVEST, BNDES-Type1, CBN, FINAME. This field is supported only for these kinds of payments: - BNDES transactions on CyberSource through VisaNet. - Installment payments with Mastercard on CyberSource through VisaNet in Brazil.  See \&quot;\&quot;Installment Payments on CyberSource through VisaNet,\&quot;\&quot; in the SCMP/SO guide  For BNDES transactions, the value for this field corresponds to the following data in the TC 33 capture file: - Record: CP07 TCR2, Position: 27-46, Field: Loan Type  For installment payments with Mastercard in Brazil, the value for this field corresponds to the following data in the TC 33 capture file: - Record: CP07 TCR4, Position: 5-24,Field: Financing Type 
   * @return type
  **/
  @ApiModelProperty(value = "Type of loan based on an agreement between you and the issuer. Examples: AGROCUSTEIO, AGRO-INVEST, BNDES-Type1, CBN, FINAME. This field is supported only for these kinds of payments: - BNDES transactions on CyberSource through VisaNet. - Installment payments with Mastercard on CyberSource through VisaNet in Brazil.  See \"\"Installment Payments on CyberSource through VisaNet,\"\" in the SCMP/SO guide  For BNDES transactions, the value for this field corresponds to the following data in the TC 33 capture file: - Record: CP07 TCR2, Position: 27-46, Field: Loan Type  For installment payments with Mastercard in Brazil, the value for this field corresponds to the following data in the TC 33 capture file: - Record: CP07 TCR4, Position: 5-24,Field: Financing Type ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2paymentsProcessingInformationLoanOptions assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Indicates whether a loan is for a recoverable item or a non-recoverable item. Possible values: - &#x60;N&#x60;: non-recoverable item - &#x60;R&#x60;: recoverable item This field is supported only for BNDES transactions on CyberSource through VisaNet. The value for this field corresponds to the following data in the TC 33 capture file5:  Record: CP07 TCR2, Position: 26, Field: Asset Indicator 
   * @return assetType
  **/
  @ApiModelProperty(value = "Indicates whether a loan is for a recoverable item or a non-recoverable item. Possible values: - `N`: non-recoverable item - `R`: recoverable item This field is supported only for BNDES transactions on CyberSource through VisaNet. The value for this field corresponds to the following data in the TC 33 capture file5:  Record: CP07 TCR2, Position: 26, Field: Asset Indicator ")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessingInformationLoanOptions ptsv2paymentsProcessingInformationLoanOptions = (Ptsv2paymentsProcessingInformationLoanOptions) o;
    return Objects.equals(this.type, ptsv2paymentsProcessingInformationLoanOptions.type) &&
        Objects.equals(this.assetType, ptsv2paymentsProcessingInformationLoanOptions.assetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, assetType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessingInformationLoanOptions {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
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

