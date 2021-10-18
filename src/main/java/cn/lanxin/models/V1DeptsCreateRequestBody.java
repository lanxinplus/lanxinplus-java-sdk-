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
 * V1DeptsCreateRequestBody
 */

public class V1DeptsCreateRequestBody {
  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Integer orderNumber;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;


  public V1DeptsCreateRequestBody externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * 分支外部ID，组织通讯录数据源唯一标识分支的ID。创建后不可修改，组织内必须唯一
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分支外部ID，组织通讯录数据源唯一标识分支的ID。创建后不可修改，组织内必须唯一")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public V1DeptsCreateRequestBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 分支名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分支名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1DeptsCreateRequestBody orderNumber(Integer orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * 在父分支中的次序值，值越小排序越靠前
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "在父分支中的次序值，值越小排序越靠前")

  public Integer getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }


  public V1DeptsCreateRequestBody parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * 父节点分支Id，根分支可以用”组织ID-0“代替，例如：524288-0， 创建根分支的时候需要指定组织，创建其他子分支的时候根据父分支决定组织。
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "父节点分支Id，根分支可以用”组织ID-0“代替，例如：524288-0， 创建根分支的时候需要指定组织，创建其他子分支的时候根据父分支决定组织。")

  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public V1DeptsCreateRequestBody tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public V1DeptsCreateRequestBody addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 分支标签
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分支标签")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DeptsCreateRequestBody v1DeptsCreateRequestBody = (V1DeptsCreateRequestBody) o;
    return Objects.equals(this.externalId, v1DeptsCreateRequestBody.externalId) &&
        Objects.equals(this.name, v1DeptsCreateRequestBody.name) &&
        Objects.equals(this.orderNumber, v1DeptsCreateRequestBody.orderNumber) &&
        Objects.equals(this.parentId, v1DeptsCreateRequestBody.parentId) &&
        Objects.equals(this.tags, v1DeptsCreateRequestBody.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, name, orderNumber, parentId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeptsCreateRequestBody {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

