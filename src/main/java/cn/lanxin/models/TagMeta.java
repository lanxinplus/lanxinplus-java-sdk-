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
 * TagMeta
 */

public class TagMeta {
  public static final String SERIALIZED_NAME_TAG_ID = "tagId";
  @SerializedName(SERIALIZED_NAME_TAG_ID)
  private String tagId;

  public static final String SERIALIZED_NAME_TAG_NAME = "tagName";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName;


  public TagMeta tagId(String tagId) {
    
    this.tagId = tagId;
    return this;
  }

   /**
   * 标签ID
   * @return tagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签ID")

  public String getTagId() {
    return tagId;
  }


  public void setTagId(String tagId) {
    this.tagId = tagId;
  }


  public TagMeta tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * 标签名称
   * @return tagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签名称")

  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagMeta tagMeta = (TagMeta) o;
    return Objects.equals(this.tagId, tagMeta.tagId) &&
        Objects.equals(this.tagName, tagMeta.tagName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagId, tagName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagMeta {\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
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

