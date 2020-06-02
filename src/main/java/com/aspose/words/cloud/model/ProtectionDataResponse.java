/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ProtectionDataResponse.java">
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
 * Response for the request of data about protection.
 */
@ApiModel(description = "Response for the request of data about protection.")
public class ProtectionDataResponse extends WordsResponse {
    @SerializedName("DocumentLink")
    private FileLink documentLink = null;

    @SerializedName("ProtectionData")
    private ProtectionData protectionData = null;
    public ProtectionDataResponse documentLink(FileLink documentLink) {
        this.documentLink = documentLink;
        return this;
    }

    /**
     * Gets or sets link to the document.
    * @return documentLink
    **/
    @ApiModelProperty(value = "Gets or sets link to the document.")
    public FileLink getDocumentLink() {
        return documentLink;
    }

    public void setDocumentLink(FileLink documentLink) {
        this.documentLink = documentLink;
    }

    public ProtectionDataResponse protectionData(ProtectionData protectionData) {
        this.protectionData = protectionData;
        return this;
    }

    /**
     * Gets or sets protection's data of the document.
    * @return protectionData
    **/
    @ApiModelProperty(value = "Gets or sets protection's data of the document.")
    public ProtectionData getProtectionData() {
        return protectionData;
    }

    public void setProtectionData(ProtectionData protectionData) {
        this.protectionData = protectionData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    ProtectionDataResponse protectionDataResponse = (ProtectionDataResponse)o;
    return
        Objects.equals(this.documentLink, protectionDataResponse.documentLink) &&
        Objects.equals(this.protectionData, protectionDataResponse.protectionData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentLink, protectionData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtectionDataResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    documentLink: ").append(toIndentedString(documentLink)).append("\n");
    sb.append("    protectionData: ").append(toIndentedString(protectionData)).append("\n");
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
