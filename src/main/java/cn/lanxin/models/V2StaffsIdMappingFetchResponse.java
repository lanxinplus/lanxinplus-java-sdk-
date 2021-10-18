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
import cn.lanxin.models.V2StaffsIdMappingFetchData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V2StaffsIdMappingFetchResponse
 */

public class V2StaffsIdMappingFetchResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private V2StaffsIdMappingFetchData data;

  public static final String SERIALIZED_NAME_ERR_CODE = "errCode";
  @SerializedName(SERIALIZED_NAME_ERR_CODE)
  private Integer errCode;

  public static final String SERIALIZED_NAME_ERR_MSG = "errMsg";
  @SerializedName(SERIALIZED_NAME_ERR_MSG)
  private String errMsg;


  public V2StaffsIdMappingFetchResponse data(V2StaffsIdMappingFetchData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2StaffsIdMappingFetchData getData() {
    return data;
  }


  public void setData(V2StaffsIdMappingFetchData data) {
    this.data = data;
  }


  public V2StaffsIdMappingFetchResponse errCode(Integer errCode) {
    
    this.errCode = errCode;
    return this;
  }

   /**
   * Get errCode
   * @return errCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getErrCode() {
    return errCode;
  }


  public void setErrCode(Integer errCode) {
    this.errCode = errCode;
  }


  public V2StaffsIdMappingFetchResponse errMsg(String errMsg) {
    
    this.errMsg = errMsg;
    return this;
  }

   /**
   * Get errMsg
   * @return errMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrMsg() {
    return errMsg;
  }


  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaffsIdMappingFetchResponse v2StaffsIdMappingFetchResponse = (V2StaffsIdMappingFetchResponse) o;
    return Objects.equals(this.data, v2StaffsIdMappingFetchResponse.data) &&
        Objects.equals(this.errCode, v2StaffsIdMappingFetchResponse.errCode) &&
        Objects.equals(this.errMsg, v2StaffsIdMappingFetchResponse.errMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errCode, errMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaffsIdMappingFetchResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errCode: ").append(toIndentedString(errCode)).append("\n");
    sb.append("    errMsg: ").append(toIndentedString(errMsg)).append("\n");
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

