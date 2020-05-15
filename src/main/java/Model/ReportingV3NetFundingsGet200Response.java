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
import Model.ReportingV3NetFundingsGet200ResponseNetFundingSummaries;
import Model.ReportingV3NetFundingsGet200ResponseTotalPurchases;
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
import org.joda.time.DateTime;

/**
 * ReportingV3NetFundingsGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T15:31:38.576+05:30")
public class ReportingV3NetFundingsGet200Response {
  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("endTime")
  private DateTime endTime = null;

  @SerializedName("netFundingSummaries")
  private List<ReportingV3NetFundingsGet200ResponseNetFundingSummaries> netFundingSummaries = null;

  @SerializedName("totalPurchases")
  private List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalPurchases = null;

  @SerializedName("totalRefunds")
  private List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalRefunds = null;

  @SerializedName("totalFees")
  private List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalFees = null;

  @SerializedName("totalChargebacks")
  private List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalChargebacks = null;

  @SerializedName("netTotal")
  private List<ReportingV3NetFundingsGet200ResponseTotalPurchases> netTotal = null;

  public ReportingV3NetFundingsGet200Response startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Valid report Start Date in **ISO 8601 format**. Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example:** - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ 
   * @return startTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Valid report Start Date in **ISO 8601 format**. Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example:** - yyyy-MM-dd'T'HH:mm:ss.SSSZZ ")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public ReportingV3NetFundingsGet200Response endTime(DateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Valid report End Date in **ISO 8601 format** **Example date format:** - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ 
   * @return endTime
  **/
  @ApiModelProperty(example = "2018-04-12T23:20:50.52Z", value = "Valid report End Date in **ISO 8601 format** **Example date format:** - yyyy-MM-dd'T'HH:mm:ss.SSSZZ ")
  public DateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTime endTime) {
    this.endTime = endTime;
  }

  public ReportingV3NetFundingsGet200Response netFundingSummaries(List<ReportingV3NetFundingsGet200ResponseNetFundingSummaries> netFundingSummaries) {
    this.netFundingSummaries = netFundingSummaries;
    return this;
  }

  public ReportingV3NetFundingsGet200Response addNetFundingSummariesItem(ReportingV3NetFundingsGet200ResponseNetFundingSummaries netFundingSummariesItem) {
    if (this.netFundingSummaries == null) {
      this.netFundingSummaries = new ArrayList<ReportingV3NetFundingsGet200ResponseNetFundingSummaries>();
    }
    this.netFundingSummaries.add(netFundingSummariesItem);
    return this;
  }

   /**
   * List of Netfunding summary objects
   * @return netFundingSummaries
  **/
  @ApiModelProperty(value = "List of Netfunding summary objects")
  public List<ReportingV3NetFundingsGet200ResponseNetFundingSummaries> getNetFundingSummaries() {
    return netFundingSummaries;
  }

  public void setNetFundingSummaries(List<ReportingV3NetFundingsGet200ResponseNetFundingSummaries> netFundingSummaries) {
    this.netFundingSummaries = netFundingSummaries;
  }

  public ReportingV3NetFundingsGet200Response totalPurchases(List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalPurchases) {
    this.totalPurchases = totalPurchases;
    return this;
  }

  public ReportingV3NetFundingsGet200Response addTotalPurchasesItem(ReportingV3NetFundingsGet200ResponseTotalPurchases totalPurchasesItem) {
    if (this.totalPurchases == null) {
      this.totalPurchases = new ArrayList<ReportingV3NetFundingsGet200ResponseTotalPurchases>();
    }
    this.totalPurchases.add(totalPurchasesItem);
    return this;
  }

   /**
   * List of total purchases currency wise
   * @return totalPurchases
  **/
  @ApiModelProperty(value = "List of total purchases currency wise")
  public List<ReportingV3NetFundingsGet200ResponseTotalPurchases> getTotalPurchases() {
    return totalPurchases;
  }

  public void setTotalPurchases(List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalPurchases) {
    this.totalPurchases = totalPurchases;
  }

  public ReportingV3NetFundingsGet200Response totalRefunds(List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalRefunds) {
    this.totalRefunds = totalRefunds;
    return this;
  }

  public ReportingV3NetFundingsGet200Response addTotalRefundsItem(ReportingV3NetFundingsGet200ResponseTotalPurchases totalRefundsItem) {
    if (this.totalRefunds == null) {
      this.totalRefunds = new ArrayList<ReportingV3NetFundingsGet200ResponseTotalPurchases>();
    }
    this.totalRefunds.add(totalRefundsItem);
    return this;
  }

   /**
   * List of total refunds currency wise
   * @return totalRefunds
  **/
  @ApiModelProperty(value = "List of total refunds currency wise")
  public List<ReportingV3NetFundingsGet200ResponseTotalPurchases> getTotalRefunds() {
    return totalRefunds;
  }

  public void setTotalRefunds(List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalRefunds) {
    this.totalRefunds = totalRefunds;
  }

  public ReportingV3NetFundingsGet200Response totalFees(List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalFees) {
    this.totalFees = totalFees;
    return this;
  }

  public ReportingV3NetFundingsGet200Response addTotalFeesItem(ReportingV3NetFundingsGet200ResponseTotalPurchases totalFeesItem) {
    if (this.totalFees == null) {
      this.totalFees = new ArrayList<ReportingV3NetFundingsGet200ResponseTotalPurchases>();
    }
    this.totalFees.add(totalFeesItem);
    return this;
  }

   /**
   * List of total fees currency wise
   * @return totalFees
  **/
  @ApiModelProperty(value = "List of total fees currency wise")
  public List<ReportingV3NetFundingsGet200ResponseTotalPurchases> getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalFees) {
    this.totalFees = totalFees;
  }

  public ReportingV3NetFundingsGet200Response totalChargebacks(List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalChargebacks) {
    this.totalChargebacks = totalChargebacks;
    return this;
  }

  public ReportingV3NetFundingsGet200Response addTotalChargebacksItem(ReportingV3NetFundingsGet200ResponseTotalPurchases totalChargebacksItem) {
    if (this.totalChargebacks == null) {
      this.totalChargebacks = new ArrayList<ReportingV3NetFundingsGet200ResponseTotalPurchases>();
    }
    this.totalChargebacks.add(totalChargebacksItem);
    return this;
  }

   /**
   * List of total chargebacks currency wise
   * @return totalChargebacks
  **/
  @ApiModelProperty(value = "List of total chargebacks currency wise")
  public List<ReportingV3NetFundingsGet200ResponseTotalPurchases> getTotalChargebacks() {
    return totalChargebacks;
  }

  public void setTotalChargebacks(List<ReportingV3NetFundingsGet200ResponseTotalPurchases> totalChargebacks) {
    this.totalChargebacks = totalChargebacks;
  }

  public ReportingV3NetFundingsGet200Response netTotal(List<ReportingV3NetFundingsGet200ResponseTotalPurchases> netTotal) {
    this.netTotal = netTotal;
    return this;
  }

  public ReportingV3NetFundingsGet200Response addNetTotalItem(ReportingV3NetFundingsGet200ResponseTotalPurchases netTotalItem) {
    if (this.netTotal == null) {
      this.netTotal = new ArrayList<ReportingV3NetFundingsGet200ResponseTotalPurchases>();
    }
    this.netTotal.add(netTotalItem);
    return this;
  }

   /**
   * List of new total currency wise
   * @return netTotal
  **/
  @ApiModelProperty(value = "List of new total currency wise")
  public List<ReportingV3NetFundingsGet200ResponseTotalPurchases> getNetTotal() {
    return netTotal;
  }

  public void setNetTotal(List<ReportingV3NetFundingsGet200ResponseTotalPurchases> netTotal) {
    this.netTotal = netTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3NetFundingsGet200Response reportingV3NetFundingsGet200Response = (ReportingV3NetFundingsGet200Response) o;
    return Objects.equals(this.startTime, reportingV3NetFundingsGet200Response.startTime) &&
        Objects.equals(this.endTime, reportingV3NetFundingsGet200Response.endTime) &&
        Objects.equals(this.netFundingSummaries, reportingV3NetFundingsGet200Response.netFundingSummaries) &&
        Objects.equals(this.totalPurchases, reportingV3NetFundingsGet200Response.totalPurchases) &&
        Objects.equals(this.totalRefunds, reportingV3NetFundingsGet200Response.totalRefunds) &&
        Objects.equals(this.totalFees, reportingV3NetFundingsGet200Response.totalFees) &&
        Objects.equals(this.totalChargebacks, reportingV3NetFundingsGet200Response.totalChargebacks) &&
        Objects.equals(this.netTotal, reportingV3NetFundingsGet200Response.netTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, netFundingSummaries, totalPurchases, totalRefunds, totalFees, totalChargebacks, netTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3NetFundingsGet200Response {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    netFundingSummaries: ").append(toIndentedString(netFundingSummaries)).append("\n");
    sb.append("    totalPurchases: ").append(toIndentedString(totalPurchases)).append("\n");
    sb.append("    totalRefunds: ").append(toIndentedString(totalRefunds)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    totalChargebacks: ").append(toIndentedString(totalChargebacks)).append("\n");
    sb.append("    netTotal: ").append(toIndentedString(netTotal)).append("\n");
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

