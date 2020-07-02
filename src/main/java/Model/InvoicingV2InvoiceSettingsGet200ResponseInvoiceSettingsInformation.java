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
import Model.InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:10:54.851+05:30")
public class InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation {
  @SerializedName("merchantLogo")
  private String merchantLogo = null;

  @SerializedName("merchantDisplayName")
  private String merchantDisplayName = null;

  @SerializedName("customEmailMessage")
  private String customEmailMessage = null;

  @SerializedName("enableReminders")
  private Boolean enableReminders = null;

  @SerializedName("headerStyle")
  private InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle headerStyle = null;

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation merchantLogo(String merchantLogo) {
    this.merchantLogo = merchantLogo;
    return this;
  }

   /**
   * The image file, which must be encoded in Base64 format. Supported file formats are &#x60;png&#x60;, &#x60;jpg&#x60;, and &#x60;gif&#x60;. The image file size restriction is 1 MB.
   * @return merchantLogo
  **/
  @ApiModelProperty(value = "The image file, which must be encoded in Base64 format. Supported file formats are `png`, `jpg`, and `gif`. The image file size restriction is 1 MB.")
  public String getMerchantLogo() {
    return merchantLogo;
  }

  public void setMerchantLogo(String merchantLogo) {
    this.merchantLogo = merchantLogo;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation merchantDisplayName(String merchantDisplayName) {
    this.merchantDisplayName = merchantDisplayName;
    return this;
  }

   /**
   * The merchant&#39;s display name shown on the invoice.
   * @return merchantDisplayName
  **/
  @ApiModelProperty(value = "The merchant's display name shown on the invoice.")
  public String getMerchantDisplayName() {
    return merchantDisplayName;
  }

  public void setMerchantDisplayName(String merchantDisplayName) {
    this.merchantDisplayName = merchantDisplayName;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation customEmailMessage(String customEmailMessage) {
    this.customEmailMessage = customEmailMessage;
    return this;
  }

   /**
   * The content of the email message that we send to your customers.
   * @return customEmailMessage
  **/
  @ApiModelProperty(value = "The content of the email message that we send to your customers.")
  public String getCustomEmailMessage() {
    return customEmailMessage;
  }

  public void setCustomEmailMessage(String customEmailMessage) {
    this.customEmailMessage = customEmailMessage;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation enableReminders(Boolean enableReminders) {
    this.enableReminders = enableReminders;
    return this;
  }

   /**
   * Whether you would like us to send an auto-generated reminder email to your invoice recipients. Currently, this reminder email is sent five days before the invoice is due and one day after it is past due.
   * @return enableReminders
  **/
  @ApiModelProperty(value = "Whether you would like us to send an auto-generated reminder email to your invoice recipients. Currently, this reminder email is sent five days before the invoice is due and one day after it is past due.")
  public Boolean getEnableReminders() {
    return enableReminders;
  }

  public void setEnableReminders(Boolean enableReminders) {
    this.enableReminders = enableReminders;
  }

  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation headerStyle(InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle headerStyle) {
    this.headerStyle = headerStyle;
    return this;
  }

   /**
   * Get headerStyle
   * @return headerStyle
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle getHeaderStyle() {
    return headerStyle;
  }

  public void setHeaderStyle(InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformationHeaderStyle headerStyle) {
    this.headerStyle = headerStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation = (InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation) o;
    return Objects.equals(this.merchantLogo, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.merchantLogo) &&
        Objects.equals(this.merchantDisplayName, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.merchantDisplayName) &&
        Objects.equals(this.customEmailMessage, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.customEmailMessage) &&
        Objects.equals(this.enableReminders, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.enableReminders) &&
        Objects.equals(this.headerStyle, invoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation.headerStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantLogo, merchantDisplayName, customEmailMessage, enableReminders, headerStyle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoiceSettingsGet200ResponseInvoiceSettingsInformation {\n");
    
    sb.append("    merchantLogo: ").append(toIndentedString(merchantLogo)).append("\n");
    sb.append("    merchantDisplayName: ").append(toIndentedString(merchantDisplayName)).append("\n");
    sb.append("    customEmailMessage: ").append(toIndentedString(customEmailMessage)).append("\n");
    sb.append("    enableReminders: ").append(toIndentedString(enableReminders)).append("\n");
    sb.append("    headerStyle: ").append(toIndentedString(headerStyle)).append("\n");
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

