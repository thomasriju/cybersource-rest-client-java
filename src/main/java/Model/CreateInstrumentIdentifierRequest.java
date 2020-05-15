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
import Model.Tmsv1instrumentidentifiersBankAccount;
import Model.Tmsv1instrumentidentifiersBillTo;
import Model.Tmsv1instrumentidentifiersCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateInstrumentIdentifierRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T15:31:38.576+05:30")
public class CreateInstrumentIdentifierRequest {
  @SerializedName("type")
  private String type = null;

  @SerializedName("card")
  private Tmsv1instrumentidentifiersCard card = null;

  @SerializedName("BankAccount")
  private Tmsv1instrumentidentifiersBankAccount bankAccount = null;

  @SerializedName("billTo")
  private Tmsv1instrumentidentifiersBillTo billTo = null;

  public CreateInstrumentIdentifierRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Enrol card for a Network Token
   * @return type
  **/
  @ApiModelProperty(example = "enrollable card", value = "Enrol card for a Network Token")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CreateInstrumentIdentifierRequest card(Tmsv1instrumentidentifiersCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Tmsv1instrumentidentifiersCard getCard() {
    return card;
  }

  public void setCard(Tmsv1instrumentidentifiersCard card) {
    this.card = card;
  }

  public CreateInstrumentIdentifierRequest bankAccount(Tmsv1instrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public Tmsv1instrumentidentifiersBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(Tmsv1instrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public CreateInstrumentIdentifierRequest billTo(Tmsv1instrumentidentifiersBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Tmsv1instrumentidentifiersBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Tmsv1instrumentidentifiersBillTo billTo) {
    this.billTo = billTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstrumentIdentifierRequest createInstrumentIdentifierRequest = (CreateInstrumentIdentifierRequest) o;
    return Objects.equals(this.type, createInstrumentIdentifierRequest.type) &&
        Objects.equals(this.card, createInstrumentIdentifierRequest.card) &&
        Objects.equals(this.bankAccount, createInstrumentIdentifierRequest.bankAccount) &&
        Objects.equals(this.billTo, createInstrumentIdentifierRequest.billTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, card, bankAccount, billTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstrumentIdentifierRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
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

