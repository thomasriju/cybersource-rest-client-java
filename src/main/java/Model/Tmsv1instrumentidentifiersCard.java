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
 * Tmsv1instrumentidentifiersCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-27T12:49:40.999Z")
public class Tmsv1instrumentidentifiersCard {
  @SerializedName("number")
  private String number = null;

  public Tmsv1instrumentidentifiersCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Credit card number (PAN).
   * @return number
  **/
  @ApiModelProperty(example = "1234567890987654", value = "Credit card number (PAN).")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv1instrumentidentifiersCard tmsv1instrumentidentifiersCard = (Tmsv1instrumentidentifiersCard) o;
    return Objects.equals(this.number, tmsv1instrumentidentifiersCard.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv1instrumentidentifiersCard {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

