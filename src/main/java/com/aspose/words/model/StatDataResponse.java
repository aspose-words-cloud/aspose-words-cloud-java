/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Words for Cloud
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
import com.aspose.words.cloud.model.AsposeResponse;
import com.aspose.words.cloud.model.DocumentStatData;
import com.aspose.words.cloud.model.FileLink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response for the request of the document&#39;s statistical data
 */
@ApiModel(description = "Response for the request of the document's statistical data")

public class StatDataResponse extends AsposeResponse {
  @SerializedName("DocumentLink")
  private FileLink documentLink = null;

  @SerializedName("StatData")
  private DocumentStatData statData = null;

  public StatDataResponse documentLink(FileLink documentLink) {
    this.documentLink = documentLink;
    return this;
  }

   /**
   * Link to the document
   * @return documentLink
  **/
  @ApiModelProperty(value = "Link to the document")
  public FileLink getDocumentLink() {
    return documentLink;
  }

  public void setDocumentLink(FileLink documentLink) {
    this.documentLink = documentLink;
  }

  public StatDataResponse statData(DocumentStatData statData) {
    this.statData = statData;
    return this;
  }

   /**
   * Statistical data of the document
   * @return statData
  **/
  @ApiModelProperty(value = "Statistical data of the document")
  public DocumentStatData getStatData() {
    return statData;
  }

  public void setStatData(DocumentStatData statData) {
    this.statData = statData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatDataResponse statDataResponse = (StatDataResponse) o;
    return Objects.equals(this.documentLink, statDataResponse.documentLink) &&
        Objects.equals(this.statData, statDataResponse.statData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentLink, statData, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatDataResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    documentLink: ").append(toIndentedString(documentLink)).append("\n");
    sb.append("    statData: ").append(toIndentedString(statData)).append("\n");
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

