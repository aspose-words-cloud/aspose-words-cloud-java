/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SplitDocumentResult.java">
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
 * Result of splitting document.
 */
@ApiModel(description = "Result of splitting document.")
public class SplitDocumentResult implements ModelIfc {
    @SerializedName("SourceDocument")
    protected FileLink sourceDocument;

    @SerializedName("ZippedPages")
    protected FileLink zippedPages;

    @SerializedName("Pages")
    protected List<FileLink> pages;
    /**
     * Gets or sets the link to the source document.
    * @return sourceDocument
    **/
    @ApiModelProperty(value = "Gets or sets the link to the source document.")
    public FileLink getSourceDocument() {
        return sourceDocument;
    }

    public SplitDocumentResult sourceDocument(FileLink sourceDocument) {
        this.sourceDocument = sourceDocument;
        return this;
    }

    public void setSourceDocument(FileLink sourceDocument) {
        this.sourceDocument = sourceDocument;
    }


    /**
     * Gets or sets the link to the file archive with pages.
    * @return zippedPages
    **/
    @ApiModelProperty(value = "Gets or sets the link to the file archive with pages.")
    public FileLink getZippedPages() {
        return zippedPages;
    }

    public SplitDocumentResult zippedPages(FileLink zippedPages) {
        this.zippedPages = zippedPages;
        return this;
    }

    public void setZippedPages(FileLink zippedPages) {
        this.zippedPages = zippedPages;
    }


    /**
     * Gets or sets the list of pages.
    * @return pages
    **/
    @ApiModelProperty(value = "Gets or sets the list of pages.")
    public List<FileLink> getPages() {
        return pages;
    }

    public SplitDocumentResult pages(List<FileLink> pages) {
        this.pages = pages;
        return this;
    }

    public SplitDocumentResult addPagesItem(FileLink pagesItem) {
        if (this.pages == null) {
            this.pages = new ArrayList<FileLink>();
        }
        this.pages.add(pagesItem);
        return this;
    }


    public void setPages(List<FileLink> pages) {
        this.pages = pages;
    }


    public SplitDocumentResult() {
        this.sourceDocument = null;
        this.zippedPages = null;
        this.pages = null;
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

        if (this.sourceDocument != null) {
            this.sourceDocument.validate();
        }



        if (this.zippedPages != null) {
            this.zippedPages.validate();
        }



        if (this.pages != null) {
            for (ModelIfc elementPages : this.pages) {
                if (elementPages != null) {
                    elementPages.validate();
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

        SplitDocumentResult splitDocumentResult = (SplitDocumentResult) o;
        return
            Objects.equals(this.sourceDocument, splitDocumentResult.sourceDocument) &&
            Objects.equals(this.zippedPages, splitDocumentResult.zippedPages) &&
            Objects.equals(this.pages, splitDocumentResult.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceDocument, zippedPages, pages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitDocumentResult {\n");
    sb.append("    sourceDocument: ").append(toIndentedString(getSourceDocument())).append("\n");
    sb.append("    zippedPages: ").append(toIndentedString(getZippedPages())).append("\n");
    sb.append("    pages: ").append(toIndentedString(getPages())).append("\n");
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
