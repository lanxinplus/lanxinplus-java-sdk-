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
import cn.lanxin.models.Department;
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
 * DepartmentData
 */

public class DepartmentData {
  public static final String SERIALIZED_NAME_ANCESTOR_DEPARTMENTS = "ancestorDepartments";
  @SerializedName(SERIALIZED_NAME_ANCESTOR_DEPARTMENTS)
  private List<Department> ancestorDepartments = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_HAS_CHILDREN = "hasChildren";
  @SerializedName(SERIALIZED_NAME_HAS_CHILDREN)
  private Boolean hasChildren;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MEMBERS_COUNT = "membersCount";
  @SerializedName(SERIALIZED_NAME_MEMBERS_COUNT)
  private Integer membersCount;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public DepartmentData ancestorDepartments(List<Department> ancestorDepartments) {
    
    this.ancestorDepartments = ancestorDepartments;
    return this;
  }

  public DepartmentData addAncestorDepartmentsItem(Department ancestorDepartmentsItem) {
    if (this.ancestorDepartments == null) {
      this.ancestorDepartments = new ArrayList<Department>();
    }
    this.ancestorDepartments.add(ancestorDepartmentsItem);
    return this;
  }

   /**
   * 部门祖先列表
   * @return ancestorDepartments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "部门祖先列表")

  public List<Department> getAncestorDepartments() {
    return ancestorDepartments;
  }


  public void setAncestorDepartments(List<Department> ancestorDepartments) {
    this.ancestorDepartments = ancestorDepartments;
  }


  public DepartmentData externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public DepartmentData hasChildren(Boolean hasChildren) {
    
    this.hasChildren = hasChildren;
    return this;
  }

   /**
   * 是否含有子分支
   * @return hasChildren
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否含有子分支")

  public Boolean getHasChildren() {
    return hasChildren;
  }


  public void setHasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
  }


  public DepartmentData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 分支ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分支ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DepartmentData membersCount(Integer membersCount) {
    
    this.membersCount = membersCount;
    return this;
  }

   /**
   * 分支人员数
   * @return membersCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分支人员数")

  public Integer getMembersCount() {
    return membersCount;
  }


  public void setMembersCount(Integer membersCount) {
    this.membersCount = membersCount;
  }


  public DepartmentData name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentData departmentData = (DepartmentData) o;
    return Objects.equals(this.ancestorDepartments, departmentData.ancestorDepartments) &&
        Objects.equals(this.externalId, departmentData.externalId) &&
        Objects.equals(this.hasChildren, departmentData.hasChildren) &&
        Objects.equals(this.id, departmentData.id) &&
        Objects.equals(this.membersCount, departmentData.membersCount) &&
        Objects.equals(this.name, departmentData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestorDepartments, externalId, hasChildren, id, membersCount, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentData {\n");
    sb.append("    ancestorDepartments: ").append(toIndentedString(ancestorDepartments)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    hasChildren: ").append(toIndentedString(hasChildren)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    membersCount: ").append(toIndentedString(membersCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

