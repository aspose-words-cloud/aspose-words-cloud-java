/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CompareData.java">
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
 * Container class for compare documents.
 */
@ApiModel(description = "Container class for compare documents.")
public class CompareData implements ModelIfc {
    @SerializedName("Author")
    protected String author;

    @SerializedName("CompareOptions")
    protected CompareOptions compareOptions;

    @SerializedName("ComparingWithDocument")
    protected String comparingWithDocument;

    @SerializedName("DateTime")
    protected OffsetDateTime dateTime;

    @SerializedName("FileReference")
    protected FileReference fileReference;

    @SerializedName("ResultDocumentFormat")
    protected String resultDocumentFormat;
    /**
     * Gets or sets the initials of the author to use for revisions.
    * @return author
    **/
    @ApiModelProperty(value = "Gets or sets the initials of the author to use for revisions.")
    public String getAuthor() {
        return author;
    }

    public CompareData author(String author) {
        this.author = author;
        return this;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    /**
     * Gets or sets the compare options.
    * @return compareOptions
    **/
    @ApiModelProperty(value = "Gets or sets the compare options.")
    public CompareOptions getCompareOptions() {
        return compareOptions;
    }

    public CompareData compareOptions(CompareOptions compareOptions) {
        this.compareOptions = compareOptions;
        return this;
    }

    public void setCompareOptions(CompareOptions compareOptions) {
        this.compareOptions = compareOptions;
    }


    /**
     * Gets or sets the path to document to compare at the server.
    * @return comparingWithDocument
    **/
    @ApiModelProperty(value = "Gets or sets the path to document to compare at the server.")
    @Deprecated
    public String getComparingWithDocument() {
        return comparingWithDocument;
    }

    @Deprecated
    public CompareData comparingWithDocument(String comparingWithDocument) {
        this.comparingWithDocument = comparingWithDocument;
        return this;
    }

    @Deprecated
    public void setComparingWithDocument(String comparingWithDocument) {
        this.comparingWithDocument = comparingWithDocument;
    }


    /**
     * Gets or sets the date and time to use for revisions.
    * @return dateTime
    **/
    @ApiModelProperty(value = "Gets or sets the date and time to use for revisions.")
    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public CompareData dateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets or sets the file reference.
    * @return fileReference
    **/
    @ApiModelProperty(value = "Gets or sets the file reference.")
    public FileReference getFileReference() {
        return fileReference;
    }

    public CompareData fileReference(FileReference fileReference) {
        this.fileReference = fileReference;
        return this;
    }

    public void setFileReference(FileReference fileReference) {
        this.fileReference = fileReference;
    }


    /**
     * Gets or sets the result document format.
    * @return resultDocumentFormat
    **/
    @ApiModelProperty(value = "Gets or sets the result document format.")
    public String getResultDocumentFormat() {
        return resultDocumentFormat;
    }

    public CompareData resultDocumentFormat(String resultDocumentFormat) {
        this.resultDocumentFormat = resultDocumentFormat;
        return this;
    }

    public void setResultDocumentFormat(String resultDocumentFormat) {
        this.resultDocumentFormat = resultDocumentFormat;
    }


    public CompareData() {
        this.author = null;
        this.compareOptions = null;
        this.comparingWithDocument = null;
        this.dateTime = null;
        this.fileReference = null;
        this.resultDocumentFormat = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
        if (this.fileReference != null) {
            this.fileReference.getFilesContent(resultFilesContent);
        }


    }

    /*
     * Validate required properties.
     *
     * @throws ApiException If fails to validate required properties.
     */
    @Override
    public void validate() throws ApiException {
        if (this.author == null) {
            throw new ApiException(400, "Property Author in CompareData is required.");
        }
        if (this.fileReference == null) {
            throw new ApiException(400, "Property FileReference in CompareData is required.");
        }

        if (this.compareOptions != null) {
            this.compareOptions.validate();
        }





        if (this.fileReference != null) {
            this.fileReference.validate();
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

        CompareData compareData = (CompareData) o;
        return
            Objects.equals(this.author, compareData.author) &&
            Objects.equals(this.compareOptions, compareData.compareOptions) &&
            Objects.equals(this.comparingWithDocument, compareData.comparingWithDocument) &&
            Objects.equals(this.dateTime, compareData.dateTime) &&
            Objects.equals(this.fileReference, compareData.fileReference) &&
            Objects.equals(this.resultDocumentFormat, compareData.resultDocumentFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, compareOptions, comparingWithDocument, dateTime, fileReference, resultDocumentFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompareData {\n");
    sb.append("    author: ").append(toIndentedString(getAuthor())).append("\n");
    sb.append("    compareOptions: ").append(toIndentedString(getCompareOptions())).append("\n");
    sb.append("    comparingWithDocument: ").append(toIndentedString(getComparingWithDocument())).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(getDateTime())).append("\n");
    sb.append("    fileReference: ").append(toIndentedString(getFileReference())).append("\n");
    sb.append("    resultDocumentFormat: ").append(toIndentedString(getResultDocumentFormat())).append("\n");
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
