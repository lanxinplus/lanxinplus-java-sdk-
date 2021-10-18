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
import java.util.ArrayList;
import java.util.List;

/**
 * V1RoleMemberCreateRequestBody
 */

public class V1RoleMemberCreateRequestBody {
  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private String creator;

  public static final String SERIALIZED_NAME_ROLE_ID = "roleId";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private String roleId;

  public static final String SERIALIZED_NAME_STAFF_IDS = "staffIds";
  @SerializedName(SERIALIZED_NAME_STAFF_IDS)
  private List<String> staffIds = null;


  public V1RoleMemberCreateRequestBody creator(String creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * 创建者
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建者")

  public String getCreator() {
    return creator;
  }


  public void setCreator(String creator) {
    this.creator = creator;
  }


  public V1RoleMemberCreateRequestBody roleId(String roleId) {
    
    this.roleId = roleId;
    return this;
  }

   /**
   * 角色ID
   * @return roleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "角色ID")

  public String getRoleId() {
    return roleId;
  }


  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public V1RoleMemberCreateRequestBody staffIds(List<String> staffIds) {
    
    this.staffIds = staffIds;
    return this;
  }

  public V1RoleMemberCreateRequestBody addStaffIdsItem(String staffIdsItem) {
    if (this.staffIds == null) {
      this.staffIds = new ArrayList<String>();
    }
    this.staffIds.add(staffIdsItem);
    return this;
  }

   /**
   * 角色成员列表
   * @return staffIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "角色成员列表")

  public List<String> getStaffIds() {
    return staffIds;
  }


  public void setStaffIds(List<String> staffIds) {
    this.staffIds = staffIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RoleMemberCreateRequestBody v1RoleMemberCreateRequestBody = (V1RoleMemberCreateRequestBody) o;
    return Objects.equals(this.creator, v1RoleMemberCreateRequestBody.creator) &&
        Objects.equals(this.roleId, v1RoleMemberCreateRequestBody.roleId) &&
        Objects.equals(this.staffIds, v1RoleMemberCreateRequestBody.staffIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, roleId, staffIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RoleMemberCreateRequestBody {\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    staffIds: ").append(toIndentedString(staffIds)).append("\n");
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

