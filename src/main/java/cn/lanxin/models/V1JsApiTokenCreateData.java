/*
 * LanXin+ OpenAPI
 * LanXin+ OpenAPI Platform
 *
 * 
 *
 * NOTE: This class is auto generated by LanXin+(https://openapi.lanxin.cn).
 * https://openapi.lanxin.cn
 * Do not edit the class manually.
 */


package cn.lanxin.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1JsApiTokenCreateData
 */

public class V1JsApiTokenCreateData {
  public static final String SERIALIZED_NAME_EXPIRES_IN = "expiresIn";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Integer expiresIn;

  public static final String SERIALIZED_NAME_JS_API_TOKEN = "jsApiToken";
  @SerializedName(SERIALIZED_NAME_JS_API_TOKEN)
  private String jsApiToken;


  public V1JsApiTokenCreateData expiresIn(Integer expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * TOKEN 有效期（7200秒），建议应用根据过期时间缓存jsApiToken
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TOKEN 有效期（7200秒），建议应用根据过期时间缓存jsApiToken")

  public Integer getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  public V1JsApiTokenCreateData jsApiToken(String jsApiToken) {
    
    this.jsApiToken = jsApiToken;
    return this;
  }

   /**
   * JSAPI 访问TOKEN
   * @return jsApiToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSAPI 访问TOKEN")

  public String getJsApiToken() {
    return jsApiToken;
  }


  public void setJsApiToken(String jsApiToken) {
    this.jsApiToken = jsApiToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1JsApiTokenCreateData v1JsApiTokenCreateData = (V1JsApiTokenCreateData) o;
    return Objects.equals(this.expiresIn, v1JsApiTokenCreateData.expiresIn) &&
        Objects.equals(this.jsApiToken, v1JsApiTokenCreateData.jsApiToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresIn, jsApiToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JsApiTokenCreateData {\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    jsApiToken: ").append(toIndentedString(jsApiToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

