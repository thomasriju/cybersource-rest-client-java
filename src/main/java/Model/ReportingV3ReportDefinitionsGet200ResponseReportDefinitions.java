/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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
 * ReportingV3ReportDefinitionsGet200ResponseReportDefinitions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-27T12:49:40.999Z")
public class ReportingV3ReportDefinitionsGet200ResponseReportDefinitions {
  @SerializedName("type")
  private String type = null;

  @SerializedName("reportDefinitionId")
  private Integer reportDefinitionId = null;

  @SerializedName("reportDefintionName")
  private String reportDefintionName = null;

  /**
   * Gets or Sets supportedFormats
   */
  @JsonAdapter(SupportedFormatsEnum.Adapter.class)
  public enum SupportedFormatsEnum {
    APPLICATION_XML("application/xml"),
    
    TEXT_CSV("text/csv");

    private String value;

    SupportedFormatsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SupportedFormatsEnum fromValue(String text) {
      for (SupportedFormatsEnum b : SupportedFormatsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SupportedFormatsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SupportedFormatsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SupportedFormatsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SupportedFormatsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("supportedFormats")
  private List<SupportedFormatsEnum> supportedFormats = null;

  @SerializedName("description")
  private String description = null;

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions reportDefinitionId(Integer reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
    return this;
  }

   /**
   * | Id  |         Definition Class          | | --- | --------------------------------- | | 210 | TransactionRequestClass           | | 211 | PaymentBatchDetailClass           | | 212 | ExceptionDetailClass              | | 213 | ProcessorSettlementDetailClass    | | 214 | ProcessorEventsDetailClass        | | 215 | FundingDetailClass                | | 216 | AgingDetailClass                  | | 217 | ChargebackAndRetrievalDetailClass | | 218 | DepositDetailClass                | | 219 | FeeDetailClass                    | | 220 | InvoiceSummaryClass               | | 221 | PayerAuthDetailClass              | | 222 | ConversionDetailClass             | | 270 | JPTransactionDetailClass          | | 271 | ServiceFeeDetailClass             | | 310 | GatewayTransactionRequestClass    | | 400 | DecisionManagerEventDetailClass   | | 401 | DecisionManagerDetailClass        | | 410 | FeeSummaryClass                   | | 420 | TaxCalculationClass               | | 520 | POSTerminalExceptionClass         | | 620 | SubscriptionDetailClass           | 
   * @return reportDefinitionId
  **/
  @ApiModelProperty(value = "| Id  |         Definition Class          | | --- | --------------------------------- | | 210 | TransactionRequestClass           | | 211 | PaymentBatchDetailClass           | | 212 | ExceptionDetailClass              | | 213 | ProcessorSettlementDetailClass    | | 214 | ProcessorEventsDetailClass        | | 215 | FundingDetailClass                | | 216 | AgingDetailClass                  | | 217 | ChargebackAndRetrievalDetailClass | | 218 | DepositDetailClass                | | 219 | FeeDetailClass                    | | 220 | InvoiceSummaryClass               | | 221 | PayerAuthDetailClass              | | 222 | ConversionDetailClass             | | 270 | JPTransactionDetailClass          | | 271 | ServiceFeeDetailClass             | | 310 | GatewayTransactionRequestClass    | | 400 | DecisionManagerEventDetailClass   | | 401 | DecisionManagerDetailClass        | | 410 | FeeSummaryClass                   | | 420 | TaxCalculationClass               | | 520 | POSTerminalExceptionClass         | | 620 | SubscriptionDetailClass           | ")
  public Integer getReportDefinitionId() {
    return reportDefinitionId;
  }

  public void setReportDefinitionId(Integer reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions reportDefintionName(String reportDefintionName) {
    this.reportDefintionName = reportDefintionName;
    return this;
  }

   /**
   * Get reportDefintionName
   * @return reportDefintionName
  **/
  @ApiModelProperty(value = "")
  public String getReportDefintionName() {
    return reportDefintionName;
  }

  public void setReportDefintionName(String reportDefintionName) {
    this.reportDefintionName = reportDefintionName;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions supportedFormats(List<SupportedFormatsEnum> supportedFormats) {
    this.supportedFormats = supportedFormats;
    return this;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions addSupportedFormatsItem(SupportedFormatsEnum supportedFormatsItem) {
    if (this.supportedFormats == null) {
      this.supportedFormats = new ArrayList<SupportedFormatsEnum>();
    }
    this.supportedFormats.add(supportedFormatsItem);
    return this;
  }

   /**
   * Get supportedFormats
   * @return supportedFormats
  **/
  @ApiModelProperty(value = "")
  public List<SupportedFormatsEnum> getSupportedFormats() {
    return supportedFormats;
  }

  public void setSupportedFormats(List<SupportedFormatsEnum> supportedFormats) {
    this.supportedFormats = supportedFormats;
  }

  public ReportingV3ReportDefinitionsGet200ResponseReportDefinitions description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportDefinitionsGet200ResponseReportDefinitions reportingV3ReportDefinitionsGet200ResponseReportDefinitions = (ReportingV3ReportDefinitionsGet200ResponseReportDefinitions) o;
    return Objects.equals(this.type, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.type) &&
        Objects.equals(this.reportDefinitionId, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.reportDefinitionId) &&
        Objects.equals(this.reportDefintionName, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.reportDefintionName) &&
        Objects.equals(this.supportedFormats, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.supportedFormats) &&
        Objects.equals(this.description, reportingV3ReportDefinitionsGet200ResponseReportDefinitions.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, reportDefinitionId, reportDefintionName, supportedFormats, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportDefinitionsGet200ResponseReportDefinitions {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reportDefinitionId: ").append(toIndentedString(reportDefinitionId)).append("\n");
    sb.append("    reportDefintionName: ").append(toIndentedString(reportDefintionName)).append("\n");
    sb.append("    supportedFormats: ").append(toIndentedString(supportedFormats)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

