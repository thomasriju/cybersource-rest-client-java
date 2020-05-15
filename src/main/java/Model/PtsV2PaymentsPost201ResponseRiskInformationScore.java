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
import java.util.ArrayList;
import java.util.List;

/**
 * PtsV2PaymentsPost201ResponseRiskInformationScore
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T15:31:38.576+05:30")
public class PtsV2PaymentsPost201ResponseRiskInformationScore {
  @SerializedName("factorCodes")
  private List<String> factorCodes = null;

  @SerializedName("modelUsed")
  private String modelUsed = null;

  @SerializedName("result")
  private String result = null;

  public PtsV2PaymentsPost201ResponseRiskInformationScore factorCodes(List<String> factorCodes) {
    this.factorCodes = factorCodes;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationScore addFactorCodesItem(String factorCodesItem) {
    if (this.factorCodes == null) {
      this.factorCodes = new ArrayList<String>();
    }
    this.factorCodes.add(factorCodesItem);
    return this;
  }

   /**
   * Get factorCodes
   * @return factorCodes
  **/
  @ApiModelProperty(value = "")
  public List<String> getFactorCodes() {
    return factorCodes;
  }

  public void setFactorCodes(List<String> factorCodes) {
    this.factorCodes = factorCodes;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationScore modelUsed(String modelUsed) {
    this.modelUsed = modelUsed;
    return this;
  }

   /**
   * Name of the score model used for the transaction. If you did not include a custom model in your request, this field contains the name of CyberSource’s default model.  For all possible values, see the &#x60;score_model_used&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return modelUsed
  **/
  @ApiModelProperty(value = "Name of the score model used for the transaction. If you did not include a custom model in your request, this field contains the name of CyberSource’s default model.  For all possible values, see the `score_model_used` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getModelUsed() {
    return modelUsed;
  }

  public void setModelUsed(String modelUsed) {
    this.modelUsed = modelUsed;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationScore result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Total score calculated for this order. The value cannot be negative.  For all possible values, see the &#x60;score_score_result&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return result
  **/
  @ApiModelProperty(value = "Total score calculated for this order. The value cannot be negative.  For all possible values, see the `score_score_result` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseRiskInformationScore ptsV2PaymentsPost201ResponseRiskInformationScore = (PtsV2PaymentsPost201ResponseRiskInformationScore) o;
    return Objects.equals(this.factorCodes, ptsV2PaymentsPost201ResponseRiskInformationScore.factorCodes) &&
        Objects.equals(this.modelUsed, ptsV2PaymentsPost201ResponseRiskInformationScore.modelUsed) &&
        Objects.equals(this.result, ptsV2PaymentsPost201ResponseRiskInformationScore.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factorCodes, modelUsed, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseRiskInformationScore {\n");
    
    sb.append("    factorCodes: ").append(toIndentedString(factorCodes)).append("\n");
    sb.append("    modelUsed: ").append(toIndentedString(modelUsed)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

