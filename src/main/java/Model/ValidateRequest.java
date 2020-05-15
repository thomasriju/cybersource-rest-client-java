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
import Model.Riskv1authenticationresultsConsumerAuthenticationInformation;
import Model.Riskv1authenticationresultsOrderInformation;
import Model.Riskv1authenticationresultsPaymentInformation;
import Model.Riskv1authenticationsClientReferenceInformation;
import Model.Riskv1authenticationsProcessingInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ValidateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T15:31:38.576+05:30")
public class ValidateRequest {
  @SerializedName("clientReferenceInformation")
  private Riskv1authenticationsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processingInformation")
  private Riskv1authenticationsProcessingInformation processingInformation = null;

  @SerializedName("orderInformation")
  private Riskv1authenticationresultsOrderInformation orderInformation = null;

  @SerializedName("paymentInformation")
  private Riskv1authenticationresultsPaymentInformation paymentInformation = null;

  @SerializedName("consumerAuthenticationInformation")
  private Riskv1authenticationresultsConsumerAuthenticationInformation consumerAuthenticationInformation = null;

  public ValidateRequest clientReferenceInformation(Riskv1authenticationsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Riskv1authenticationsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public ValidateRequest processingInformation(Riskv1authenticationsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Riskv1authenticationsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public ValidateRequest orderInformation(Riskv1authenticationresultsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationresultsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Riskv1authenticationresultsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public ValidateRequest paymentInformation(Riskv1authenticationresultsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationresultsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Riskv1authenticationresultsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public ValidateRequest consumerAuthenticationInformation(Riskv1authenticationresultsConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
    return this;
  }

   /**
   * Get consumerAuthenticationInformation
   * @return consumerAuthenticationInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationresultsConsumerAuthenticationInformation getConsumerAuthenticationInformation() {
    return consumerAuthenticationInformation;
  }

  public void setConsumerAuthenticationInformation(Riskv1authenticationresultsConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateRequest validateRequest = (ValidateRequest) o;
    return Objects.equals(this.clientReferenceInformation, validateRequest.clientReferenceInformation) &&
        Objects.equals(this.processingInformation, validateRequest.processingInformation) &&
        Objects.equals(this.orderInformation, validateRequest.orderInformation) &&
        Objects.equals(this.paymentInformation, validateRequest.paymentInformation) &&
        Objects.equals(this.consumerAuthenticationInformation, validateRequest.consumerAuthenticationInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, processingInformation, orderInformation, paymentInformation, consumerAuthenticationInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    consumerAuthenticationInformation: ").append(toIndentedString(consumerAuthenticationInformation)).append("\n");
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

