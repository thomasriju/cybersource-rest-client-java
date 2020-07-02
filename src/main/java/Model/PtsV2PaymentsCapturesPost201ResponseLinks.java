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
import Model.PtsV2PaymentsPost201ResponseLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsCapturesPost201ResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:10:54.851+05:30")
public class PtsV2PaymentsCapturesPost201ResponseLinks {
  @SerializedName("self")
  private PtsV2PaymentsPost201ResponseLinksSelf self = null;

  @SerializedName("void")
  private PtsV2PaymentsPost201ResponseLinksSelf _void = null;

  @SerializedName("refund")
  private PtsV2PaymentsPost201ResponseLinksSelf refund = null;

  public PtsV2PaymentsCapturesPost201ResponseLinks self(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
  }

  public PtsV2PaymentsCapturesPost201ResponseLinks _void(PtsV2PaymentsPost201ResponseLinksSelf _void) {
    this._void = _void;
    return this;
  }

   /**
   * Get _void
   * @return _void
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getVoid() {
    return _void;
  }

  public void setVoid(PtsV2PaymentsPost201ResponseLinksSelf _void) {
    this._void = _void;
  }

  public PtsV2PaymentsCapturesPost201ResponseLinks refund(PtsV2PaymentsPost201ResponseLinksSelf refund) {
    this.refund = refund;
    return this;
  }

   /**
   * Get refund
   * @return refund
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getRefund() {
    return refund;
  }

  public void setRefund(PtsV2PaymentsPost201ResponseLinksSelf refund) {
    this.refund = refund;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsCapturesPost201ResponseLinks ptsV2PaymentsCapturesPost201ResponseLinks = (PtsV2PaymentsCapturesPost201ResponseLinks) o;
    return Objects.equals(this.self, ptsV2PaymentsCapturesPost201ResponseLinks.self) &&
        Objects.equals(this._void, ptsV2PaymentsCapturesPost201ResponseLinks._void) &&
        Objects.equals(this.refund, ptsV2PaymentsCapturesPost201ResponseLinks.refund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, _void, refund);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsCapturesPost201ResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    _void: ").append(toIndentedString(_void)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
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

