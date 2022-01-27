/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListInfo.java">
 *   Copyright (c) 2022 Aspose.Words for Cloud
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
    protected Boolean isListStyleDefinition;

    @SerializedName("IsListStyleReference")
    protected Boolean isListStyleReference;

    @SerializedName("IsMultiLevel")
    protected Boolean isMultiLevel;

    @SerializedName("IsRestartAtEachSection")
    protected Boolean isRestartAtEachSection;

    @SerializedName("ListId")
    protected Integer listId;

    @SerializedName("ListLevels")
    protected ListLevels listLevels;

    @SerializedName("Style")
    protected Style style;
    /**
     * Gets or sets a value indicating whether this list is a definition of a list style.
    * @return isListStyleDefinition
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this list is a definition of a list style.")
    public Boolean getIsListStyleDefinition() {
        return isListStyleDefinition;
    }

    public ListInfo isListStyleDefinition(Boolean isListStyleDefinition) {
        this.isListStyleDefinition = isListStyleDefinition;
        return this;
    }

    public void setIsListStyleDefinition(Boolean isListStyleDefinition) {
        this.isListStyleDefinition = isListStyleDefinition;
    }


    /**
     * Gets or sets a value indicating whether this list is a reference to a list style.
    * @return isListStyleReference
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this list is a reference to a list style.")
    public Boolean getIsListStyleReference() {
        return isListStyleReference;
    }

    public ListInfo isListStyleReference(Boolean isListStyleReference) {
        this.isListStyleReference = isListStyleReference;
        return this;
    }

    public void setIsListStyleReference(Boolean isListStyleReference) {
        this.isListStyleReference = isListStyleReference;
    }


    /**
     * Gets or sets a value indicating whether the list contains 9 levels; false when 1 level.
    * @return isMultiLevel
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the list contains 9 levels; false when 1 level.")
    public Boolean getIsMultiLevel() {
        return isMultiLevel;
    }

    public ListInfo isMultiLevel(Boolean isMultiLevel) {
        this.isMultiLevel = isMultiLevel;
        return this;
    }

    public void setIsMultiLevel(Boolean isMultiLevel) {
        this.isMultiLevel = isMultiLevel;
    }


    /**
     * Gets or sets a value indicating whether list should be restarted at each section. The default value is false.
    * @return isRestartAtEachSection
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether list should be restarted at each section. The default value is false.")
    public Boolean getIsRestartAtEachSection() {
        return isRestartAtEachSection;
    }

    public ListInfo isRestartAtEachSection(Boolean isRestartAtEachSection) {
        this.isRestartAtEachSection = isRestartAtEachSection;
        return this;
    }

    public void setIsRestartAtEachSection(Boolean isRestartAtEachSection) {
        this.isRestartAtEachSection = isRestartAtEachSection;
    }


    /**
     * Gets or sets the unique identifier of the list.
    * @return listId
    **/
    @ApiModelProperty(value = "Gets or sets the unique identifier of the list.")
    public Integer getListId() {
        return listId;
    }

    public ListInfo listId(Integer listId) {
        this.listId = listId;
        return this;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }


    /**
     * Gets or sets the collection of list levels for this list.
    * @return listLevels
    **/
    @ApiModelProperty(value = "Gets or sets the collection of list levels for this list.")
    public ListLevels getListLevels() {
        return listLevels;
    }

    public ListInfo listLevels(ListLevels listLevels) {
        this.listLevels = listLevels;
        return this;
    }

    public void setListLevels(ListLevels listLevels) {
        this.listLevels = listLevels;
    }


    /**
     * Gets or sets the list style that this list references or defines.
    * @return style
    **/
    @ApiModelProperty(value = "Gets or sets the list style that this list references or defines.")
    public Style getStyle() {
        return style;
    }

    public ListInfo style(Style style) {
        this.style = style;
        return this;
    }

    public void setStyle(Style style) {
        this.style = style;
    }


    public ListInfo() {
        super();
        this.isListStyleDefinition = null;
        this.isListStyleReference = null;
        this.isMultiLevel = null;
        this.isRestartAtEachSection = null;
        this.listId = null;
        this.listLevels = null;
        this.style = null;
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
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    isListStyleDefinition: ").append(toIndentedString(getIsListStyleDefinition())).append("\n");
    sb.append("    isListStyleReference: ").append(toIndentedString(getIsListStyleReference())).append("\n");
    sb.append("    isMultiLevel: ").append(toIndentedString(getIsMultiLevel())).append("\n");
    sb.append("    isRestartAtEachSection: ").append(toIndentedString(getIsRestartAtEachSection())).append("\n");
    sb.append("    listId: ").append(toIndentedString(getListId())).append("\n");
    sb.append("    listLevels: ").append(toIndentedString(getListLevels())).append("\n");
    sb.append("    style: ").append(toIndentedString(getStyle())).append("\n");
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
