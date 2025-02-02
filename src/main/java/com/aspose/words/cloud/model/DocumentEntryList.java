/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DocumentEntryList.java">
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
 * Represents a list of documents which will be appended to the original resource document.
 */
@ApiModel(description = "Represents a list of documents which will be appended to the original resource document.")
public class DocumentEntryList extends BaseEntryList {
    @SerializedName("AppendAllEntriesToOneSection")
    protected Boolean appendAllEntriesToOneSection;

    @SerializedName("ApplyBaseDocumentHeadersAndFootersToAppendingDocuments")
    protected Boolean applyBaseDocumentHeadersAndFootersToAppendingDocuments;

    @SerializedName("DocumentEntries")
    protected List<DocumentEntry> documentEntries;
    /**
     * Gets or sets a value indicating whether to append all documents to the same section.
    * @return appendAllEntriesToOneSection
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to append all documents to the same section.")
    public Boolean getAppendAllEntriesToOneSection() {
        return appendAllEntriesToOneSection;
    }

    public DocumentEntryList appendAllEntriesToOneSection(Boolean appendAllEntriesToOneSection) {
        this.appendAllEntriesToOneSection = appendAllEntriesToOneSection;
        return this;
    }

    public void setAppendAllEntriesToOneSection(Boolean appendAllEntriesToOneSection) {
        this.appendAllEntriesToOneSection = appendAllEntriesToOneSection;
    }


    /**
     * Gets or sets a value indicating whether to apply headers and footers from base document to appending documents. The default value is true.
    * @return applyBaseDocumentHeadersAndFootersToAppendingDocuments
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to apply headers and footers from base document to appending documents. The default value is true.")
    public Boolean getApplyBaseDocumentHeadersAndFootersToAppendingDocuments() {
        return applyBaseDocumentHeadersAndFootersToAppendingDocuments;
    }

    public DocumentEntryList applyBaseDocumentHeadersAndFootersToAppendingDocuments(Boolean applyBaseDocumentHeadersAndFootersToAppendingDocuments) {
        this.applyBaseDocumentHeadersAndFootersToAppendingDocuments = applyBaseDocumentHeadersAndFootersToAppendingDocuments;
        return this;
    }

    public void setApplyBaseDocumentHeadersAndFootersToAppendingDocuments(Boolean applyBaseDocumentHeadersAndFootersToAppendingDocuments) {
        this.applyBaseDocumentHeadersAndFootersToAppendingDocuments = applyBaseDocumentHeadersAndFootersToAppendingDocuments;
    }


    /**
     * Gets or sets the list of documents.
    * @return documentEntries
    **/
    @ApiModelProperty(value = "Gets or sets the list of documents.")
    public List<DocumentEntry> getDocumentEntries() {
        return documentEntries;
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


    public void setDocumentEntries(List<DocumentEntry> documentEntries) {
        this.documentEntries = documentEntries;
    }


    public DocumentEntryList() {
        super();
        this.appendAllEntriesToOneSection = null;
        this.applyBaseDocumentHeadersAndFootersToAppendingDocuments = null;
        this.documentEntries = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
        super.getFilesContent(resultFilesContent);
        if (this.documentEntries != null) {
            for (ModelIfc element : this.documentEntries) {
                element.getFilesContent(resultFilesContent);
            }
        }

    }

    /*
     * Validate required properties.
     *
     * @throws ApiException If fails to validate required properties.
     */
    @Override
    public void validate() throws ApiException {
        super.validate();
        if (this.documentEntries == null) {
            throw new ApiException(400, "Property DocumentEntries in DocumentEntryList is required.");
        }

        if (this.documentEntries != null) {
            for (ModelIfc elementDocumentEntries : this.documentEntries) {
                if (elementDocumentEntries != null) {
                    elementDocumentEntries.validate();
                }
            }
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

        DocumentEntryList documentEntryList = (DocumentEntryList) o;
        return
            Objects.equals(this.appendAllEntriesToOneSection, documentEntryList.appendAllEntriesToOneSection) &&
            Objects.equals(this.applyBaseDocumentHeadersAndFootersToAppendingDocuments, documentEntryList.applyBaseDocumentHeadersAndFootersToAppendingDocuments) &&
            Objects.equals(this.documentEntries, documentEntryList.documentEntries) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appendAllEntriesToOneSection, applyBaseDocumentHeadersAndFootersToAppendingDocuments, documentEntries, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentEntryList {\n");
    sb.append("    appendAllEntriesToOneSection: ").append(toIndentedString(getAppendAllEntriesToOneSection())).append("\n");
    sb.append("    applyBaseDocumentHeadersAndFootersToAppendingDocuments: ").append(toIndentedString(getApplyBaseDocumentHeadersAndFootersToAppendingDocuments())).append("\n");
    sb.append("    documentEntries: ").append(toIndentedString(getDocumentEntries())).append("\n");
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
