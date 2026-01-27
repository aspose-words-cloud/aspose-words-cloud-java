/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListInfo.java">
 *   Copyright (c) 2026 Aspose.Words for Cloud
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
import com.aspose.words.cloud.ApiException;
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
    @SerializedName("ListId")
    protected Integer listId;

    @SerializedName("IsMultiLevel")
    protected Boolean isMultiLevel;

    @SerializedName("IsRestartAtEachSection")
    protected Boolean isRestartAtEachSection;

    @SerializedName("IsListStyleDefinition")
    protected Boolean isListStyleDefinition;

    @SerializedName("IsListStyleReference")
    protected Boolean isListStyleReference;

    @SerializedName("Style")
    protected Style style;

    @SerializedName("ListLevels")
    protected ListLevels listLevels;
    /**
     * Gets or sets the unique identifier of the list.
     * You do not normally need to use this property. But if you use it, you normally do so in conjunction with the Aspose.Words.Lists.ListCollection.GetListByListId(System.Int32) method to find a list by its identifier.
    * @return listId
    **/
    @ApiModelProperty(value = "Gets or sets the unique identifier of the list. You do not normally need to use this property. But if you use it, you normally do so in conjunction with the Aspose.Words.Lists.ListCollection.GetListByListId(System.Int32) method to find a list by its identifier.")
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
     * Gets or sets a value indicating whether the list contains 9 levels; false when 1 level.
     * The lists that you create with Aspose.Words are always multi-level lists and contain 9 levels. Microsoft Word 2003 and later always create multi-level lists with 9 levels. But in some documents, created with earlier versions of Microsoft Word you might encounter lists that have 1 level only.
    * @return isMultiLevel
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the list contains 9 levels; false when 1 level. The lists that you create with Aspose.Words are always multi-level lists and contain 9 levels. Microsoft Word 2003 and later always create multi-level lists with 9 levels. But in some documents, created with earlier versions of Microsoft Word you might encounter lists that have 1 level only.")
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
     * This option is supported only in RTF, DOC and DOCX document formats. This option will be written to DOCX only if Aspose.Words.Saving.OoxmlCompliance is higher then Aspose.Words.Saving.OoxmlCompliance.Ecma376_2006.
    * @return isRestartAtEachSection
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether list should be restarted at each section. The default value is false. This option is supported only in RTF, DOC and DOCX document formats. This option will be written to DOCX only if Aspose.Words.Saving.OoxmlCompliance is higher then Aspose.Words.Saving.OoxmlCompliance.Ecma376_2006.")
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
     * Gets or sets a value indicating whether this list is a definition of a list style.
     * When this property is true, the Aspose.Words.Lists.List.Style property returns the list style that this list defines. By modifying properties of a list that defines a list style, you modify The properties of the list style. A list that is a definition of a list style cannot be applied directly to paragraphs to make them numbered. Aspose.Words.Lists.List.Style Aspose.Words.Lists.List.IsListStyleReference.
    * @return isListStyleDefinition
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this list is a definition of a list style. When this property is true, the Aspose.Words.Lists.List.Style property returns the list style that this list defines. By modifying properties of a list that defines a list style, you modify The properties of the list style. A list that is a definition of a list style cannot be applied directly to paragraphs to make them numbered. Aspose.Words.Lists.List.Style Aspose.Words.Lists.List.IsListStyleReference.")
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
     * Note, modifying properties of a list that is a reference to list style has no effect. The list formatting specified in the list style itself always takes precedence. Aspose.Words.Lists.List.Style Aspose.Words.Lists.List.IsListStyleDefinition.
    * @return isListStyleReference
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this list is a reference to a list style. Note, modifying properties of a list that is a reference to list style has no effect. The list formatting specified in the list style itself always takes precedence. Aspose.Words.Lists.List.Style Aspose.Words.Lists.List.IsListStyleDefinition.")
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
     * Gets or sets the list style that this list references or defines.
     * If this list is not associated with a list style, the property will return null. A list could be a reference to a list style, in this case Aspose.Words.Lists.List.IsListStyleReference will be true. A list could be a definition of a list style, in this case Aspose.Words.Lists.List.IsListStyleDefinition will be true. Such a list cannot be applied to paragraphs in the document directly.
    * @return style
    **/
    @ApiModelProperty(value = "Gets or sets the list style that this list references or defines. If this list is not associated with a list style, the property will return null. A list could be a reference to a list style, in this case Aspose.Words.Lists.List.IsListStyleReference will be true. A list could be a definition of a list style, in this case Aspose.Words.Lists.List.IsListStyleDefinition will be true. Such a list cannot be applied to paragraphs in the document directly.")
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


    /**
     * Gets or sets the collection of list levels for this list.
     * Use this property to access and modify formatting individual to each level of the list.
    * @return listLevels
    **/
    @ApiModelProperty(value = "Gets or sets the collection of list levels for this list. Use this property to access and modify formatting individual to each level of the list.")
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


    public ListInfo() {
        super();
        this.listId = null;
        this.isMultiLevel = null;
        this.isRestartAtEachSection = null;
        this.isListStyleDefinition = null;
        this.isListStyleReference = null;
        this.style = null;
        this.listLevels = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
    }

    /*
     * Validate required properties.
     *
     * @throws ApiException If fails to validate required properties.
     */
    @Override
    public void validate() throws ApiException {
        super.validate();
        if (this.listId == null) {
            throw new ApiException(400, "Property ListId in ListInfo is required.");
        }
        if (this.isMultiLevel == null) {
            throw new ApiException(400, "Property IsMultiLevel in ListInfo is required.");
        }
        if (this.isRestartAtEachSection == null) {
            throw new ApiException(400, "Property IsRestartAtEachSection in ListInfo is required.");
        }
        if (this.isListStyleDefinition == null) {
            throw new ApiException(400, "Property IsListStyleDefinition in ListInfo is required.");
        }
        if (this.isListStyleReference == null) {
            throw new ApiException(400, "Property IsListStyleReference in ListInfo is required.");
        }

        if (this.style != null) {
            this.style.validate();
        }



        if (this.listLevels != null) {
            this.listLevels.validate();
        }

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
            Objects.equals(this.listId, listInfo.listId) &&
            Objects.equals(this.isMultiLevel, listInfo.isMultiLevel) &&
            Objects.equals(this.isRestartAtEachSection, listInfo.isRestartAtEachSection) &&
            Objects.equals(this.isListStyleDefinition, listInfo.isListStyleDefinition) &&
            Objects.equals(this.isListStyleReference, listInfo.isListStyleReference) &&
            Objects.equals(this.style, listInfo.style) &&
            Objects.equals(this.listLevels, listInfo.listLevels) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, isMultiLevel, isRestartAtEachSection, isListStyleDefinition, isListStyleReference, style, listLevels, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListInfo {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    listId: ").append(toIndentedString(getListId())).append("\n");
    sb.append("    isMultiLevel: ").append(toIndentedString(getIsMultiLevel())).append("\n");
    sb.append("    isRestartAtEachSection: ").append(toIndentedString(getIsRestartAtEachSection())).append("\n");
    sb.append("    isListStyleDefinition: ").append(toIndentedString(getIsListStyleDefinition())).append("\n");
    sb.append("    isListStyleReference: ").append(toIndentedString(getIsListStyleReference())).append("\n");
    sb.append("    style: ").append(toIndentedString(getStyle())).append("\n");
    sb.append("    listLevels: ").append(toIndentedString(getListLevels())).append("\n");
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
