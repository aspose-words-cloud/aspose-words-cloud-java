/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveResult.java">
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
 * Result of saving.
 */
@ApiModel(description = "Result of saving.")
public class SaveResult {
    @SerializedName("AdditionalItems")
    private List<FileLink> additionalItems = null;

    @SerializedName("DestDocument")
    private FileLink destDocument = null;

    @SerializedName("SourceDocument")
    private FileLink sourceDocument = null;
    public SaveResult additionalItems(List<FileLink> additionalItems) {
        this.additionalItems = additionalItems;
        return this;
    }

    public SaveResult addAdditionalItemsItem(FileLink additionalItemsItem) {
        if (this.additionalItems == null) {
            this.additionalItems = new ArrayList<FileLink>();
        }
        this.additionalItems.add(additionalItemsItem);
        return this;
    }

    /**
     * Gets or sets the list of links to additional items (css, images etc).
    * @return additionalItems
    **/
    @ApiModelProperty(value = "Gets or sets the list of links to additional items (css, images etc).")
    public List<FileLink> getAdditionalItems() {
        return additionalItems;
    }

    public void setAdditionalItems(List<FileLink> additionalItems) {
        this.additionalItems = additionalItems;
    }

    public SaveResult destDocument(FileLink destDocument) {
        this.destDocument = destDocument;
        return this;
    }

    /**
     * Gets or sets the link to destination document.
    * @return destDocument
    **/
    @ApiModelProperty(value = "Gets or sets the link to destination document.")
    public FileLink getDestDocument() {
        return destDocument;
    }

    public void setDestDocument(FileLink destDocument) {
        this.destDocument = destDocument;
    }

    public SaveResult sourceDocument(FileLink sourceDocument) {
        this.sourceDocument = sourceDocument;
        return this;
    }

    /**
     * Gets or sets the link to source document.
    * @return sourceDocument
    **/
    @ApiModelProperty(value = "Gets or sets the link to source document.")
    public FileLink getSourceDocument() {
        return sourceDocument;
    }

    public void setSourceDocument(FileLink sourceDocument) {
        this.sourceDocument = sourceDocument;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SaveResult saveResult = (SaveResult) o;
        return
            Objects.equals(this.additionalItems, saveResult.additionalItems) &&
            Objects.equals(this.destDocument, saveResult.destDocument) &&
            Objects.equals(this.sourceDocument, saveResult.sourceDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalItems, destDocument, sourceDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveResult {\n");
    sb.append("    additionalItems: ").append(toIndentedString(additionalItems)).append("\n");
    sb.append("    destDocument: ").append(toIndentedString(destDocument)).append("\n");
    sb.append("    sourceDocument: ").append(toIndentedString(sourceDocument)).append("\n");
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
