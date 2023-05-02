/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * The custom action that you want to use as \&quot;Exclude\&quot; conditions for filtering out the shopping ads audiences to be retargeted. When &#x60;shopping_ads_retargeting_type&#x60; is &#x60;LAB3&#x60;, you need to pass in either &#x60;included_custom_actions&#x60; or &#x60;excluded_custom_actions&#x60;
 */
@Schema(description = "The custom action that you want to use as \"Exclude\" conditions for filtering out the shopping ads audiences to be retargeted. When `shopping_ads_retargeting_type` is `LAB3`, you need to pass in either `included_custom_actions` or `excluded_custom_actions`")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-04-18T10:46:48.851395-07:00[America/Los_Angeles]")
public class OpenApiv13adgroupcreateExcludedCustomActions {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("days")
  private Integer days = null;

  public OpenApiv13adgroupcreateExcludedCustomActions code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The custom action used to filter out the audiences to be retargeted.  Enum values- &#x60;VIEW_PRODUCT&#x60;- The audience viewed the product. &#x60;ADD_TO_CART&#x60;- The audience added the product to the cart. &#x60;PURCHASE&#x60;- The audience purchased the product.
   * @return code
  **/
  @Schema(description = "The custom action used to filter out the audiences to be retargeted.  Enum values- `VIEW_PRODUCT`- The audience viewed the product. `ADD_TO_CART`- The audience added the product to the cart. `PURCHASE`- The audience purchased the product.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OpenApiv13adgroupcreateExcludedCustomActions days(Integer days) {
    this.days = days;
    return this;
  }

   /**
   * The time range used to filter out the audiences that completed the specified action.
   * @return days
  **/
  @Schema(description = "The time range used to filter out the audiences that completed the specified action.")
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13adgroupcreateExcludedCustomActions openApiv13adgroupcreateExcludedCustomActions = (OpenApiv13adgroupcreateExcludedCustomActions) o;
    return Objects.equals(this.code, openApiv13adgroupcreateExcludedCustomActions.code) &&
        Objects.equals(this.days, openApiv13adgroupcreateExcludedCustomActions.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13adgroupcreateExcludedCustomActions {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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