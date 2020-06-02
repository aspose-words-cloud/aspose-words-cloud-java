/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CsvDataLoadOptions.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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
 * Represents options for parsing CSV data.
 */
@ApiModel(description = "Represents options for parsing CSV data.")
public class CsvDataLoadOptions {
    @SerializedName("CommentChar")
    private String commentChar = null;

    @SerializedName("Delimiter")
    private String delimiter = null;

    @SerializedName("HasHeaders")
    private Boolean hasHeaders = null;

    @SerializedName("QuoteChar")
    private String quoteChar = null;
    public CsvDataLoadOptions commentChar(String commentChar) {
        this.commentChar = commentChar;
        return this;
    }

    /**
     * Gets or sets the character that is used to comment lines of CSV data.
    * @return commentChar
    **/
    @ApiModelProperty(value = "Gets or sets the character that is used to comment lines of CSV data.")
    public String getCommentChar() {
        return commentChar;
    }

    public void setCommentChar(String commentChar) {
        this.commentChar = commentChar;
    }

    public CsvDataLoadOptions delimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * Gets or sets the character to be used as a column delimiter.
    * @return delimiter
    **/
    @ApiModelProperty(value = "Gets or sets the character to be used as a column delimiter.")
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public CsvDataLoadOptions hasHeaders(Boolean hasHeaders) {
        this.hasHeaders = hasHeaders;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the first record of CSV data contains column names.
    * @return hasHeaders
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the first record of CSV data contains column names.")
    public Boolean getHasHeaders() {
        return hasHeaders;
    }

    public void setHasHeaders(Boolean hasHeaders) {
        this.hasHeaders = hasHeaders;
    }

    public CsvDataLoadOptions quoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }

    /**
     * Gets or sets the character that is used to quote field values.
    * @return quoteChar
    **/
    @ApiModelProperty(value = "Gets or sets the character that is used to quote field values.")
    public String getQuoteChar() {
        return quoteChar;
    }

    public void setQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    CsvDataLoadOptions csvDataLoadOptions = (CsvDataLoadOptions)o;
    return
        Objects.equals(this.commentChar, csvDataLoadOptions.commentChar) &&
        Objects.equals(this.delimiter, csvDataLoadOptions.delimiter) &&
        Objects.equals(this.hasHeaders, csvDataLoadOptions.hasHeaders) &&
        Objects.equals(this.quoteChar, csvDataLoadOptions.quoteChar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentChar, delimiter, hasHeaders, quoteChar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvDataLoadOptions {\n");
    sb.append("    commentChar: ").append(toIndentedString(commentChar)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    hasHeaders: ").append(toIndentedString(hasHeaders)).append("\n");
    sb.append("    quoteChar: ").append(toIndentedString(quoteChar)).append("\n");
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
