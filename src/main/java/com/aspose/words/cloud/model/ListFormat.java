/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListFormat.java">
 *   Copyright (c) 2025 Aspose.Words for Cloud
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
 * DTO container with a paragraph list format element.
 */
@ApiModel(description = "DTO container with a paragraph list format element.")
public class ListFormat extends LinkElement {
    @SerializedName("ListLevelNumber")
    protected Integer listLevelNumber;

    @SerializedName("ListId")
    protected Integer listId;

    @SerializedName("IsListItem")
    protected Boolean isListItem;
    /**
     * Gets or sets the list level number (0 to 8) for the paragraph.
     * In Word documents, lists may consist of 1 or 9 levels, numbered 0 to 8. Has effect only when the Aspose.Words.ListFormat.List property is set to reference a valid list. Aspose.Words.ListFormat.List.
    * @return listLevelNumber
    **/
    @ApiModelProperty(value = "Gets or sets the list level number (0 to 8) for the paragraph. In Word documents, lists may consist of 1 or 9 levels, numbered 0 to 8. Has effect only when the Aspose.Words.ListFormat.List property is set to reference a valid list. Aspose.Words.ListFormat.List.")
    public Integer getListLevelNumber() {
        return listLevelNumber;
    }

    public ListFormat listLevelNumber(Integer listLevelNumber) {
        this.listLevelNumber = listLevelNumber;
        return this;
    }

    public void setListLevelNumber(Integer listLevelNumber) {
        this.listLevelNumber = listLevelNumber;
    }


    /**
     * Gets or sets the list id of this paragraph.
     * The list that is being assigned to this property must belong to the current document.The list that is being assigned to this property must not be a list style definition.
    * @return listId
    **/
    @ApiModelProperty(value = "Gets or sets the list id of this paragraph. The list that is being assigned to this property must belong to the current document.The list that is being assigned to this property must not be a list style definition.")
    public Integer getListId() {
        return listId;
    }

    public ListFormat listId(Integer listId) {
        this.listId = listId;
        return this;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }


    /**
     * Gets or sets a value indicating whether the paragraph has bulleted or numbered formatting applied to it.
    * @return isListItem
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the paragraph has bulleted or numbered formatting applied to it.")
    public Boolean getIsListItem() {
        return isListItem;
    }

    public ListFormat isListItem(Boolean isListItem) {
        this.isListItem = isListItem;
        return this;
    }

    public void setIsListItem(Boolean isListItem) {
        this.isListItem = isListItem;
    }


    public ListFormat() {
        super();
        this.listLevelNumber = null;
        this.listId = null;
        this.isListItem = null;
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
        if (this.listLevelNumber == null) {
            throw new ApiException(400, "Property ListLevelNumber in ListFormat is required.");
        }
        if (this.isListItem == null) {
            throw new ApiException(400, "Property IsListItem in ListFormat is required.");
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

        ListFormat listFormat = (ListFormat) o;
        return
            Objects.equals(this.listLevelNumber, listFormat.listLevelNumber) &&
            Objects.equals(this.listId, listFormat.listId) &&
            Objects.equals(this.isListItem, listFormat.isListItem) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listLevelNumber, listId, isListItem, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFormat {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    listLevelNumber: ").append(toIndentedString(getListLevelNumber())).append("\n");
    sb.append("    listId: ").append(toIndentedString(getListId())).append("\n");
    sb.append("    isListItem: ").append(toIndentedString(getIsListItem())).append("\n");
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
