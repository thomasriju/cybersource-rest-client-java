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

/**
 * TmsV1PaymentinstrumentsPost201ResponseCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-27T12:49:40.999Z")
public class TmsV1PaymentinstrumentsPost201ResponseCard {
  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  /**
   * Credit card brand.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VISA("visa"),
    
    MASTERCARD("mastercard"),
    
    AMERICAN_EXPRESS("american express"),
    
    DISCOVER("discover"),
    
    DINERS_CLUB("diners club"),
    
    CARTE_BLANCHE("carte blanche"),
    
    JCB("jcb"),
    
    OPTIMA("optima"),
    
    TWINPAY_CREDIT("twinpay credit"),
    
    TWINPAY_DEBIT("twinpay debit"),
    
    WALMART("walmart"),
    
    ENROUTE("enroute"),
    
    LOWES_CONSUMER("lowes consumer"),
    
    HOME_DEPOT_CONSUMER("home depot consumer"),
    
    MBNA("mbna"),
    
    DICKS_SPORTSWEAR("dicks sportswear"),
    
    CASUAL_CORNER("casual corner"),
    
    SEARS("sears"),
    
    JAL("jal"),
    
    DISNEY("disney"),
    
    MAESTRO_UK_DOMESTIC("maestro uk domestic"),
    
    SAMS_CLUB_CONSUMER("sams club consumer"),
    
    SAMS_CLUB_BUSINESS("sams club business"),
    
    NICOS("nicos"),
    
    BILL_ME_LATER("bill me later"),
    
    BEBE("bebe"),
    
    RESTORATION_HARDWARE("restoration hardware"),
    
    DELTA_ONLINE("delta online"),
    
    SOLO("solo"),
    
    VISA_ELECTRON("visa electron"),
    
    DANKORT("dankort"),
    
    LASER("laser"),
    
    CARTE_BLEUE("carte bleue"),
    
    CARTA_SI("carta si"),
    
    PINLESS_DEBIT("pinless debit"),
    
    ENCODED_ACCOUNT("encoded account"),
    
    UATP("uatp"),
    
    HOUSEHOLD("household"),
    
    MAESTRO_INTERNATIONAL("maestro international"),
    
    GE_MONEY_UK("ge money uk"),
    
    KOREAN_CARDS("korean cards"),
    
    STYLE("style"),
    
    JCREW("jcrew"),
    
    PAYEASE_CHINA_PROCESSING_EWALLET("payease china processing ewallet"),
    
    PAYEASE_CHINA_PROCESSING_BANK_TRANSFER("payease china processing bank transfer"),
    
    MEIJER_PRIVATE_LABEL("meijer private label"),
    
    HIPERCARD("hipercard"),
    
    AURA("aura"),
    
    REDECARD("redecard"),
    
    ORICO("orico"),
    
    ELO("elo"),
    
    CAPITAL_ONE_PRIVATE_LABEL("capital one private label"),
    
    SYNCHRONY_PRIVATE_LABEL("synchrony private label"),
    
    CHINA_UNION_PAY("china union pay");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("issueNumber")
  private String issueNumber = null;

  @SerializedName("startMonth")
  private String startMonth = null;

  @SerializedName("startYear")
  private String startYear = null;

  @SerializedName("useAs")
  private String useAs = null;

  public TmsV1PaymentinstrumentsPost201ResponseCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Credit card expiration month.
   * @return expirationMonth
  **/
  @ApiModelProperty(example = "12", value = "Credit card expiration month.")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public TmsV1PaymentinstrumentsPost201ResponseCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Credit card expiration year.
   * @return expirationYear
  **/
  @ApiModelProperty(example = "2022", value = "Credit card expiration year.")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public TmsV1PaymentinstrumentsPost201ResponseCard type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Credit card brand.
   * @return type
  **/
  @ApiModelProperty(example = "visa", value = "Credit card brand.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TmsV1PaymentinstrumentsPost201ResponseCard issueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
    return this;
  }

   /**
   * Credit card issue number.
   * @return issueNumber
  **/
  @ApiModelProperty(example = "01", value = "Credit card issue number.")
  public String getIssueNumber() {
    return issueNumber;
  }

  public void setIssueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
  }

  public TmsV1PaymentinstrumentsPost201ResponseCard startMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

   /**
   * Credit card start month.
   * @return startMonth
  **/
  @ApiModelProperty(example = "12", value = "Credit card start month.")
  public String getStartMonth() {
    return startMonth;
  }

  public void setStartMonth(String startMonth) {
    this.startMonth = startMonth;
  }

  public TmsV1PaymentinstrumentsPost201ResponseCard startYear(String startYear) {
    this.startYear = startYear;
    return this;
  }

   /**
   * Credit card start year.
   * @return startYear
  **/
  @ApiModelProperty(example = "12", value = "Credit card start year.")
  public String getStartYear() {
    return startYear;
  }

  public void setStartYear(String startYear) {
    this.startYear = startYear;
  }

  public TmsV1PaymentinstrumentsPost201ResponseCard useAs(String useAs) {
    this.useAs = useAs;
    return this;
  }

   /**
   * Card Use As Field. Supported value of \&quot;pinless debit\&quot; only. Only for use with Pinless Debit tokens.
   * @return useAs
  **/
  @ApiModelProperty(example = "pinless debit", value = "Card Use As Field. Supported value of \"pinless debit\" only. Only for use with Pinless Debit tokens.")
  public String getUseAs() {
    return useAs;
  }

  public void setUseAs(String useAs) {
    this.useAs = useAs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsV1PaymentinstrumentsPost201ResponseCard tmsV1PaymentinstrumentsPost201ResponseCard = (TmsV1PaymentinstrumentsPost201ResponseCard) o;
    return Objects.equals(this.expirationMonth, tmsV1PaymentinstrumentsPost201ResponseCard.expirationMonth) &&
        Objects.equals(this.expirationYear, tmsV1PaymentinstrumentsPost201ResponseCard.expirationYear) &&
        Objects.equals(this.type, tmsV1PaymentinstrumentsPost201ResponseCard.type) &&
        Objects.equals(this.issueNumber, tmsV1PaymentinstrumentsPost201ResponseCard.issueNumber) &&
        Objects.equals(this.startMonth, tmsV1PaymentinstrumentsPost201ResponseCard.startMonth) &&
        Objects.equals(this.startYear, tmsV1PaymentinstrumentsPost201ResponseCard.startYear) &&
        Objects.equals(this.useAs, tmsV1PaymentinstrumentsPost201ResponseCard.useAs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationMonth, expirationYear, type, issueNumber, startMonth, startYear, useAs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1PaymentinstrumentsPost201ResponseCard {\n");
    
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    sb.append("    useAs: ").append(toIndentedString(useAs)).append("\n");
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

