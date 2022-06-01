/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BookmarkInsert.java">
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
 * Represents a bookmark to insert.
 */
@ApiModel(description = "Represents a bookmark to insert.")
public class BookmarkInsert extends BookmarkData {
    @SerializedName("EndRange")
    protected DocumentPosition endRange;

    @SerializedName("StartRange")
    protected DocumentPosition startRange;
    /**
     * Gets or sets the link to end bookmark node.
    * @return endRange
    **/
    @ApiModelProperty(value = "Gets or sets the link to end bookmark node.")
    public DocumentPosition getEndRange() {
        return endRange;
    }

    public BookmarkInsert endRange(DocumentPosition endRange) {
        this.endRange = endRange;
        return this;
    }

    public void setEndRange(DocumentPosition endRange) {
        this.endRange = endRange;
    }


    /**
     * Gets or sets the link to start bookmark node.
    * @return startRange
    **/
    @ApiModelProperty(value = "Gets or sets the link to start bookmark node.")
    public DocumentPosition getStartRange() {
        return startRange;
    }

    public BookmarkInsert startRange(DocumentPosition startRange) {
        this.startRange = startRange;
        return this;
    }

    public void setStartRange(DocumentPosition startRange) {
        this.startRange = startRange;
    }


    public BookmarkInsert() {
        super();
        this.endRange = null;
        this.startRange = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BookmarkInsert bookmarkInsert = (BookmarkInsert) o;
        return
            Objects.equals(this.endRange, bookmarkInsert.endRange) &&
            Objects.equals(this.startRange, bookmarkInsert.startRange) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endRange, startRange, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookmarkInsert {\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    text: ").append(toIndentedString(getText())).append("\n");
    sb.append("    endRange: ").append(toIndentedString(getEndRange())).append("\n");
    sb.append("    startRange: ").append(toIndentedString(getStartRange())).append("\n");
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
