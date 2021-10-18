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
import cn.lanxin.models.BaseResponse;
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
 * V1MessagesRevokeData
 */

public class V1MessagesRevokeData {
  public static final String SERIALIZED_NAME_SUB_STATUS = "subStatus";
  @SerializedName(SERIALIZED_NAME_SUB_STATUS)
  private List<BaseResponse> subStatus = null;


  public V1MessagesRevokeData subStatus(List<BaseResponse> subStatus) {
    
    this.subStatus = subStatus;
    return this;
  }

  public V1MessagesRevokeData addSubStatusItem(BaseResponse subStatusItem) {
    if (this.subStatus == null) {
      this.subStatus = new ArrayList<BaseResponse>();
    }
    this.subStatus.add(subStatusItem);
    return this;
  }

   /**
   * Get subStatus
   * @return subStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BaseResponse> getSubStatus() {
    return subStatus;
  }


  public void setSubStatus(List<BaseResponse> subStatus) {
    this.subStatus = subStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MessagesRevokeData v1MessagesRevokeData = (V1MessagesRevokeData) o;
    return Objects.equals(this.subStatus, v1MessagesRevokeData.subStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MessagesRevokeData {\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
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

