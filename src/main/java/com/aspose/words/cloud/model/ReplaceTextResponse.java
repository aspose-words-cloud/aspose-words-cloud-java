/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReplaceTextResponse.java">
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
 * The REST response with a number of occurrences of the captured text in the document.
 */
@ApiModel(description = "The REST response with a number of occurrences of the captured text in the document.")
public class ReplaceTextResponse extends WordsResponse {
    @SerializedName("DocumentLink")
    protected FileLink documentLink;

    @SerializedName("Matches")
    protected Integer matches;
    /**
     * Gets or sets the link to the document.
    * @return documentLink
    **/
    @ApiModelProperty(value = "Gets or sets the link to the document.")
    public FileLink getDocumentLink() {
        return documentLink;
    }

    public ReplaceTextResponse documentLink(FileLink documentLink) {
        this.documentLink = documentLink;
        return this;
    }

    public void setDocumentLink(FileLink documentLink) {
        this.documentLink = documentLink;
    }


    /**
     * Gets or sets the number of occurrences of the captured text in the document.
    * @return matches
    **/
    @ApiModelProperty(value = "Gets or sets the number of occurrences of the captured text in the document.")
    public Integer getMatches() {
        return matches;
    }

    public ReplaceTextResponse matches(Integer matches) {
        this.matches = matches;
        return this;
    }

    public void setMatches(Integer matches) {
        this.matches = matches;
    }


    public ReplaceTextResponse() {
        super();
        this.documentLink = null;
        this.matches = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReplaceTextResponse replaceTextResponse = (ReplaceTextResponse) o;
        return
            Objects.equals(this.documentLink, replaceTextResponse.documentLink) &&
            Objects.equals(this.matches, replaceTextResponse.matches) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentLink, matches, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceTextResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(getRequestId())).append("\n");
    sb.append("    documentLink: ").append(toIndentedString(getDocumentLink())).append("\n");
    sb.append("    matches: ").append(toIndentedString(getMatches())).append("\n");
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
