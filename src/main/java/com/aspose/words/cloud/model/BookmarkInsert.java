/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BookmarkInsert.java">
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
 * Represents a bookmark to insert.
 */
@ApiModel(description = "Represents a bookmark to insert.")
public class BookmarkInsert implements ModelIfc {
    @SerializedName("Name")
    protected String name;

    @SerializedName("Text")
    protected String text;

    @SerializedName("StartRange")
    protected NewDocumentPosition startRange;

    @SerializedName("EndRange")
    protected NewDocumentPosition endRange;
    /**
     * Gets or sets the name of the bookmark.
    * @return name
    **/
    @ApiModelProperty(value = "Gets or sets the name of the bookmark.")
    public String getName() {
        return name;
    }

    public BookmarkInsert name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets or sets text, enclosed in the bookmark.
    * @return text
    **/
    @ApiModelProperty(value = "Gets or sets text, enclosed in the bookmark.")
    public String getText() {
        return text;
    }

    public BookmarkInsert text(String text) {
        this.text = text;
        return this;
    }

    public void setText(String text) {
        this.text = text;
    }


    /**
     * Gets or sets the link to start bookmark node.
    * @return startRange
    **/
    @ApiModelProperty(value = "Gets or sets the link to start bookmark node.")
    public NewDocumentPosition getStartRange() {
        return startRange;
    }

    public BookmarkInsert startRange(NewDocumentPosition startRange) {
        this.startRange = startRange;
        return this;
    }

    public void setStartRange(NewDocumentPosition startRange) {
        this.startRange = startRange;
    }


    /**
     * Gets or sets the link to end bookmark node.
    * @return endRange
    **/
    @ApiModelProperty(value = "Gets or sets the link to end bookmark node.")
    public NewDocumentPosition getEndRange() {
        return endRange;
    }

    public BookmarkInsert endRange(NewDocumentPosition endRange) {
        this.endRange = endRange;
        return this;
    }

    public void setEndRange(NewDocumentPosition endRange) {
        this.endRange = endRange;
    }


    public BookmarkInsert() {
        this.name = null;
        this.text = null;
        this.startRange = null;
        this.endRange = null;
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
        if (this.name == null) {
            throw new ApiException(400, "Property Name in BookmarkInsert is required.");
        }
        if (this.text == null) {
            throw new ApiException(400, "Property Text in BookmarkInsert is required.");
        }
        if (this.startRange == null) {
            throw new ApiException(400, "Property StartRange in BookmarkInsert is required.");
        }
        if (this.endRange == null) {
            throw new ApiException(400, "Property EndRange in BookmarkInsert is required.");
        }

        if (this.startRange != null) {
            this.startRange.validate();
        }



        if (this.endRange != null) {
            this.endRange.validate();
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

        BookmarkInsert bookmarkInsert = (BookmarkInsert) o;
        return
            Objects.equals(this.name, bookmarkInsert.name) &&
            Objects.equals(this.text, bookmarkInsert.text) &&
            Objects.equals(this.startRange, bookmarkInsert.startRange) &&
            Objects.equals(this.endRange, bookmarkInsert.endRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, text, startRange, endRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookmarkInsert {\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    text: ").append(toIndentedString(getText())).append("\n");
    sb.append("    startRange: ").append(toIndentedString(getStartRange())).append("\n");
    sb.append("    endRange: ").append(toIndentedString(getEndRange())).append("\n");
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
