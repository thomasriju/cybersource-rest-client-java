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
import Model.PtsV2PaymentsPost201ResponseErrorInformationDetails;
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
 * PtsV2PaymentsReversalsPost400Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-27T12:49:40.999Z")
public class PtsV2PaymentsReversalsPost400Response {
  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  /**
   * The status of the submitted transaction.  Possible values:  - INVALID_REQUEST 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    REQUEST("INVALID_REQUEST");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  /**
   * The reason of the status.  Possible values:  - MISSING_FIELD  - INVALID_DATA  - DUPLICATE_REQUEST  - INVALID_MERCHANT_CONFIGURATION  - PROCESSOR_UNAVAILABLE  - AUTH_ALREADY_REVERSED  - TRANSACTION_ALREADY_SETTLED  - INVALID_AMOUNT  - MISSING_AUTH  - TRANSACTION_ALREADY_REVERSED_OR_SETTLED 
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    MISSING_FIELD("MISSING_FIELD"),
    
    INVALID_DATA("INVALID_DATA"),
    
    DUPLICATE_REQUEST("DUPLICATE_REQUEST"),
    
    INVALID_MERCHANT_CONFIGURATION("INVALID_MERCHANT_CONFIGURATION"),
    
    AUTH_ALREADY_REVERSED("AUTH_ALREADY_REVERSED"),
    
    MISSING_AUTH("MISSING_AUTH"),
    
    TRANSACTION_ALREADY_REVERSED_OR_SETTLED("TRANSACTION_ALREADY_REVERSED_OR_SETTLED");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reason")
  private ReasonEnum reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details = null;

  public PtsV2PaymentsReversalsPost400Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public PtsV2PaymentsReversalsPost400Response status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - INVALID_REQUEST 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - INVALID_REQUEST ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PtsV2PaymentsReversalsPost400Response reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the status.  Possible values:  - MISSING_FIELD  - INVALID_DATA  - DUPLICATE_REQUEST  - INVALID_MERCHANT_CONFIGURATION  - PROCESSOR_UNAVAILABLE  - AUTH_ALREADY_REVERSED  - TRANSACTION_ALREADY_SETTLED  - INVALID_AMOUNT  - MISSING_AUTH  - TRANSACTION_ALREADY_REVERSED_OR_SETTLED 
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of the status.  Possible values:  - MISSING_FIELD  - INVALID_DATA  - DUPLICATE_REQUEST  - INVALID_MERCHANT_CONFIGURATION  - PROCESSOR_UNAVAILABLE  - AUTH_ALREADY_REVERSED  - TRANSACTION_ALREADY_SETTLED  - INVALID_AMOUNT  - MISSING_AUTH  - TRANSACTION_ALREADY_REVERSED_OR_SETTLED ")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public PtsV2PaymentsReversalsPost400Response message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The detail message related to the status and reason listed above.
   * @return message
  **/
  @ApiModelProperty(value = "The detail message related to the status and reason listed above.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PtsV2PaymentsReversalsPost400Response details(List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details) {
    this.details = details;
    return this;
  }

  public PtsV2PaymentsReversalsPost400Response addDetailsItem(PtsV2PaymentsPost201ResponseErrorInformationDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<PtsV2PaymentsPost201ResponseErrorInformationDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<PtsV2PaymentsPost201ResponseErrorInformationDetails> getDetails() {
    return details;
  }

  public void setDetails(List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsReversalsPost400Response ptsV2PaymentsReversalsPost400Response = (PtsV2PaymentsReversalsPost400Response) o;
    return Objects.equals(this.submitTimeUtc, ptsV2PaymentsReversalsPost400Response.submitTimeUtc) &&
        Objects.equals(this.status, ptsV2PaymentsReversalsPost400Response.status) &&
        Objects.equals(this.reason, ptsV2PaymentsReversalsPost400Response.reason) &&
        Objects.equals(this.message, ptsV2PaymentsReversalsPost400Response.message) &&
        Objects.equals(this.details, ptsV2PaymentsReversalsPost400Response.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitTimeUtc, status, reason, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsReversalsPost400Response {\n");
    
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

