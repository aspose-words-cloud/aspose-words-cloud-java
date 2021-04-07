/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DocumentEntryList.java">
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
 * Represents a list of documents which will be appended to the original resource document.
 */
@ApiModel(description = "Represents a list of documents which will be appended to the original resource document.")
public class DocumentEntryList {
    @SerializedName("ApplyBaseDocumentHeadersAndFootersToAppendingDocuments")
    private Boolean applyBaseDocumentHeadersAndFootersToAppendingDocuments = null;

    @SerializedName("DocumentEntries")
    private List<DocumentEntry> documentEntries = null;
    public DocumentEntryList applyBaseDocumentHeadersAndFootersToAppendingDocuments(Boolean applyBaseDocumentHeadersAndFootersToAppendingDocuments) {
        this.applyBaseDocumentHeadersAndFootersToAppendingDocuments = applyBaseDocumentHeadersAndFootersToAppendingDocuments;
        return this;
    }

    /**
     * Gets or sets a value indicating whether to apply headers and footers from base document to appending documents. The default value is true.
    * @return applyBaseDocumentHeadersAndFootersToAppendingDocuments
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to apply headers and footers from base document to appending documents. The default value is true.")
    public Boolean getApplyBaseDocumentHeadersAndFootersToAppendingDocuments() {
        return applyBaseDocumentHeadersAndFootersToAppendingDocuments;
    }

    public void setApplyBaseDocumentHeadersAndFootersToAppendingDocuments(Boolean applyBaseDocumentHeadersAndFootersToAppendingDocuments) {
        this.applyBaseDocumentHeadersAndFootersToAppendingDocuments = applyBaseDocumentHeadersAndFootersToAppendingDocuments;
    }

    public DocumentEntryList documentEntries(List<DocumentEntry> documentEntries) {
        this.documentEntries = documentEntries;
        return this;
    }

    public DocumentEntryList addDocumentEntriesItem(DocumentEntry documentEntriesItem) {
        if (this.documentEntries == null) {
            this.documentEntries = new ArrayList<DocumentEntry>();
        }
        this.documentEntries.add(documentEntriesItem);
        return this;
    }

    /**
     * Gets or sets the list of documents.
    * @return documentEntries
    **/
    @ApiModelProperty(value = "Gets or sets the list of documents.")
    public List<DocumentEntry> getDocumentEntries() {
        return documentEntries;
    }

    public void setDocumentEntries(List<DocumentEntry> documentEntries) {
        this.documentEntries = documentEntries;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DocumentEntryList documentEntryList = (DocumentEntryList) o;
        return
            Objects.equals(this.applyBaseDocumentHeadersAndFootersToAppendingDocuments, documentEntryList.applyBaseDocumentHeadersAndFootersToAppendingDocuments) &&
            Objects.equals(this.documentEntries, documentEntryList.documentEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyBaseDocumentHeadersAndFootersToAppendingDocuments, documentEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentEntryList {\n");
    sb.append("    applyBaseDocumentHeadersAndFootersToAppendingDocuments: ").append(toIndentedString(applyBaseDocumentHeadersAndFootersToAppendingDocuments)).append("\n");
    sb.append("    documentEntries: ").append(toIndentedString(documentEntries)).append("\n");
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
