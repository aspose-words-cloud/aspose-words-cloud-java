/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StructuredDocumentTagListItem.java">
 *   Copyright (c) 2023 Aspose.Words for Cloud
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
 * DTO container with a SdtListItem for StructuredDocumentTag.
 */
@ApiModel(description = "DTO container with a SdtListItem for StructuredDocumentTag.")
public class StructuredDocumentTagListItem implements ModelIfc {
    @SerializedName("DisplayText")
    protected String displayText;

    @SerializedName("Value")
    protected String value;
    /**
     * Gets or sets the text to display in the run content in place of the Aspose.Words.Markup.SdtListItem.Value attribute contents for this list item.
     * Cannot be null and cannot be an empty string.
    * @return displayText
    **/
    @ApiModelProperty(value = "Gets or sets the text to display in the run content in place of the Aspose.Words.Markup.SdtListItem.Value attribute contents for this list item. Cannot be null and cannot be an empty string.")
    public String getDisplayText() {
        return displayText;
    }

    public StructuredDocumentTagListItem displayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }


    /**
     * Gets or sets the value of this list item.
     * Cannot be null and cannot be an empty string.
    * @return value
    **/
    @ApiModelProperty(value = "Gets or sets the value of this list item. Cannot be null and cannot be an empty string.")
    public String getValue() {
        return value;
    }

    public StructuredDocumentTagListItem value(String value) {
        this.value = value;
        return this;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public StructuredDocumentTagListItem() {
        this.displayText = null;
        this.value = null;
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
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StructuredDocumentTagListItem structuredDocumentTagListItem = (StructuredDocumentTagListItem) o;
        return
            Objects.equals(this.displayText, structuredDocumentTagListItem.displayText) &&
            Objects.equals(this.value, structuredDocumentTagListItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayText, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDocumentTagListItem {\n");
    sb.append("    displayText: ").append(toIndentedString(getDisplayText())).append("\n");
    sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
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
