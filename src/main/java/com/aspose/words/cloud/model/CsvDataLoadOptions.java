/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CsvDataLoadOptions.java">
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
 * Represents options for parsing CSV data.
 * To learn more, visit the LINQ Reporting Engine documentation article.
 * An instance of this class can be passed into constructors of CsvDataSource.
 */
@ApiModel(description = "Represents options for parsing CSV data. To learn more, visit the LINQ Reporting Engine documentation article. An instance of this class can be passed into constructors of CsvDataSource.")
public class CsvDataLoadOptions implements ModelIfc {
    @SerializedName("CommentChar")
    protected String commentChar;

    @SerializedName("Delimiter")
    protected String delimiter;

    @SerializedName("HasHeaders")
    protected Boolean hasHeaders;

    @SerializedName("QuoteChar")
    protected String quoteChar;
    /**
     * Gets or sets the character that is used to comment lines of CSV data.
     * The default value is '#' (number sign).
    * @return commentChar
    **/
    @ApiModelProperty(value = "Gets or sets the character that is used to comment lines of CSV data. The default value is '#' (number sign).")
    public String getCommentChar() {
        return commentChar;
    }

    public CsvDataLoadOptions commentChar(String commentChar) {
        this.commentChar = commentChar;
        return this;
    }

    public void setCommentChar(String commentChar) {
        this.commentChar = commentChar;
    }


    /**
     * Gets or sets the character to be used as a column delimiter.
     * The default value is ',' (comma).
    * @return delimiter
    **/
    @ApiModelProperty(value = "Gets or sets the character to be used as a column delimiter. The default value is ',' (comma).")
    public String getDelimiter() {
        return delimiter;
    }

    public CsvDataLoadOptions delimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }


    /**
     * Gets or sets a value indicating whether the first record of CSV data contains column names.
     * The default value is false.
    * @return hasHeaders
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the first record of CSV data contains column names. The default value is false.")
    public Boolean getHasHeaders() {
        return hasHeaders;
    }

    public CsvDataLoadOptions hasHeaders(Boolean hasHeaders) {
        this.hasHeaders = hasHeaders;
        return this;
    }

    public void setHasHeaders(Boolean hasHeaders) {
        this.hasHeaders = hasHeaders;
    }


    /**
     * Gets or sets the character that is used to quote field values.
     * The default value is '"' (quotation mark).Double the character to place it into quoted text.
    * @return quoteChar
    **/
    @ApiModelProperty(value = "Gets or sets the character that is used to quote field values. The default value is '\"' (quotation mark).Double the character to place it into quoted text.")
    public String getQuoteChar() {
        return quoteChar;
    }

    public CsvDataLoadOptions quoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }

    public void setQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
    }


    public CsvDataLoadOptions() {
        this.commentChar = null;
        this.delimiter = null;
        this.hasHeaders = null;
        this.quoteChar = null;
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
        if (this.commentChar == null) {
            throw new ApiException(400, "Property CommentChar in CsvDataLoadOptions is required.");
        }
        if (this.delimiter == null) {
            throw new ApiException(400, "Property Delimiter in CsvDataLoadOptions is required.");
        }
        if (this.hasHeaders == null) {
            throw new ApiException(400, "Property HasHeaders in CsvDataLoadOptions is required.");
        }
        if (this.quoteChar == null) {
            throw new ApiException(400, "Property QuoteChar in CsvDataLoadOptions is required.");
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

        CsvDataLoadOptions csvDataLoadOptions = (CsvDataLoadOptions) o;
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
    sb.append("    commentChar: ").append(toIndentedString(getCommentChar())).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(getDelimiter())).append("\n");
    sb.append("    hasHeaders: ").append(toIndentedString(getHasHeaders())).append("\n");
    sb.append("    quoteChar: ").append(toIndentedString(getQuoteChar())).append("\n");
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
