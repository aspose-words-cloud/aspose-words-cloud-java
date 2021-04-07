/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListInfo.java">
 *   Copyright (c) 2021 Aspose.Words for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.words.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
import com.aspose.words.cloud.model.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DTO container with a single document list.
 */
@ApiModel(description = "DTO container with a single document list.")
public class ListInfo extends LinkElement {
    @SerializedName("IsListStyleDefinition")
    private Boolean isListStyleDefinition = null;

    @SerializedName("IsListStyleReference")
    private Boolean isListStyleReference = null;

    @SerializedName("IsMultiLevel")
    private Boolean isMultiLevel = null;

    @SerializedName("IsRestartAtEachSection")
    private Boolean isRestartAtEachSection = null;

    @SerializedName("ListId")
    private Integer listId = null;

    @SerializedName("ListLevels")
    private ListLevels listLevels = null;

    @SerializedName("Style")
    private Style style = null;
    public ListInfo isListStyleDefinition(Boolean isListStyleDefinition) {
        this.isListStyleDefinition = isListStyleDefinition;
        return this;
    }

    /**
     * Gets or sets a value indicating whether this list is a definition of a list style.
    * @return isListStyleDefinition
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this list is a definition of a list style.")
    public Boolean getIsListStyleDefinition() {
        return isListStyleDefinition;
    }

    public void setIsListStyleDefinition(Boolean isListStyleDefinition) {
        this.isListStyleDefinition = isListStyleDefinition;
    }

    public ListInfo isListStyleReference(Boolean isListStyleReference) {
        this.isListStyleReference = isListStyleReference;
        return this;
    }

    /**
     * Gets or sets a value indicating whether this list is a reference to a list style.
    * @return isListStyleReference
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this list is a reference to a list style.")
    public Boolean getIsListStyleReference() {
        return isListStyleReference;
    }

    public void setIsListStyleReference(Boolean isListStyleReference) {
        this.isListStyleReference = isListStyleReference;
    }

    public ListInfo isMultiLevel(Boolean isMultiLevel) {
        this.isMultiLevel = isMultiLevel;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the list contains 9 levels; false when 1 level.
    * @return isMultiLevel
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the list contains 9 levels; false when 1 level.")
    public Boolean getIsMultiLevel() {
        return isMultiLevel;
    }

    public void setIsMultiLevel(Boolean isMultiLevel) {
        this.isMultiLevel = isMultiLevel;
    }

    public ListInfo isRestartAtEachSection(Boolean isRestartAtEachSection) {
        this.isRestartAtEachSection = isRestartAtEachSection;
        return this;
    }

    /**
     * Gets or sets a value indicating whether list should be restarted at each section. The default value is false.
    * @return isRestartAtEachSection
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether list should be restarted at each section. The default value is false.")
    public Boolean getIsRestartAtEachSection() {
        return isRestartAtEachSection;
    }

    public void setIsRestartAtEachSection(Boolean isRestartAtEachSection) {
        this.isRestartAtEachSection = isRestartAtEachSection;
    }

    public ListInfo listId(Integer listId) {
        this.listId = listId;
        return this;
    }

    /**
     * Gets or sets the unique identifier of the list.
    * @return listId
    **/
    @ApiModelProperty(value = "Gets or sets the unique identifier of the list.")
    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public ListInfo listLevels(ListLevels listLevels) {
        this.listLevels = listLevels;
        return this;
    }

    /**
     * Gets or sets the collection of list levels for this list.
    * @return listLevels
    **/
    @ApiModelProperty(value = "Gets or sets the collection of list levels for this list.")
    public ListLevels getListLevels() {
        return listLevels;
    }

    public void setListLevels(ListLevels listLevels) {
        this.listLevels = listLevels;
    }

    public ListInfo style(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Gets or sets the list style that this list references or defines.
    * @return style
    **/
    @ApiModelProperty(value = "Gets or sets the list style that this list references or defines.")
    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ListInfo listInfo = (ListInfo) o;
        return
            Objects.equals(this.isListStyleDefinition, listInfo.isListStyleDefinition) &&
            Objects.equals(this.isListStyleReference, listInfo.isListStyleReference) &&
            Objects.equals(this.isMultiLevel, listInfo.isMultiLevel) &&
            Objects.equals(this.isRestartAtEachSection, listInfo.isRestartAtEachSection) &&
            Objects.equals(this.listId, listInfo.listId) &&
            Objects.equals(this.listLevels, listInfo.listLevels) &&
            Objects.equals(this.style, listInfo.style) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isListStyleDefinition, isListStyleReference, isMultiLevel, isRestartAtEachSection, listId, listLevels, style, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isListStyleDefinition: ").append(toIndentedString(isListStyleDefinition)).append("\n");
    sb.append("    isListStyleReference: ").append(toIndentedString(isListStyleReference)).append("\n");
    sb.append("    isMultiLevel: ").append(toIndentedString(isMultiLevel)).append("\n");
    sb.append("    isRestartAtEachSection: ").append(toIndentedString(isRestartAtEachSection)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listLevels: ").append(toIndentedString(listLevels)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
