/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BaseEntry.java">
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
 * Represents a base class for document which will be appended to the original resource document.
 */
@ApiModel(description = "Represents a base class for document which will be appended to the original resource document.")
public abstract class BaseEntry implements ModelIfc {
    @SerializedName("FileReference")
    protected FileReference fileReference;
    /**
     * Gets or sets the file reference.
    * @return fileReference
    **/
    @ApiModelProperty(value = "Gets or sets the file reference.")
    public FileReference getFileReference() {
        return fileReference;
    }

    public BaseEntry fileReference(FileReference fileReference) {
        this.fileReference = fileReference;
        return this;
    }

    public void setFileReference(FileReference fileReference) {
        this.fileReference = fileReference;
    }


    public BaseEntry() {
        this.fileReference = null;
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
        if (this.fileReference == null) {
            throw new ApiException(400, "Property FileReference in BaseEntry is required.");
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

        BaseEntry baseEntry = (BaseEntry) o;
        return
            Objects.equals(this.fileReference, baseEntry.fileReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseEntry {\n");
    sb.append("    fileReference: ").append(toIndentedString(getFileReference())).append("\n");
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
