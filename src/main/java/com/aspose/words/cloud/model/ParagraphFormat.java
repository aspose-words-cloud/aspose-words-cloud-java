/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ParagraphFormat.java">
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
 * Paragraph format element.
 */
@ApiModel(description = "Paragraph format element.")
public class ParagraphFormat extends ParagraphFormatBase {
    @SerializedName("IsHeading")
    private Boolean isHeading = null;

    @SerializedName("IsListItem")
    private Boolean isListItem = null;
    public ParagraphFormat isHeading(Boolean isHeading) {
        this.isHeading = isHeading;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the paragraph style is one of the built-in Heading styles.
    * @return isHeading
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the paragraph style is one of the built-in Heading styles.")
    public Boolean getIsHeading() {
        return isHeading;
    }

    public void setIsHeading(Boolean isHeading) {
        this.isHeading = isHeading;
    }

    public ParagraphFormat isListItem(Boolean isListItem) {
        this.isListItem = isListItem;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the paragraph is an item in a bulleted or numbered list.
    * @return isListItem
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the paragraph is an item in a bulleted or numbered list.")
    public Boolean getIsListItem() {
        return isListItem;
    }

    public void setIsListItem(Boolean isListItem) {
        this.isListItem = isListItem;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ParagraphFormat paragraphFormat = (ParagraphFormat) o;
        return
            Objects.equals(this.isHeading, paragraphFormat.isHeading) &&
            Objects.equals(this.isListItem, paragraphFormat.isListItem) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHeading, isListItem, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParagraphFormat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isHeading: ").append(toIndentedString(isHeading)).append("\n");
    sb.append("    isListItem: ").append(toIndentedString(isListItem)).append("\n");
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
