/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FilesUploadResult.java">
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
 * File upload result.
 */
@ApiModel(description = "File upload result.")
public class FilesUploadResult implements ModelIfc {
    @SerializedName("Errors")
    protected List<Error> errors;

    @SerializedName("Uploaded")
    protected List<String> uploaded;
    /**
     * List of errors.
    * @return errors
    **/
    @ApiModelProperty(value = "List of errors.")
    public List<Error> getErrors() {
        return errors;
    }

    public FilesUploadResult errors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    public FilesUploadResult addErrorsItem(Error errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<Error>();
        }
        this.errors.add(errorsItem);
        return this;
    }


    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }


    /**
     * List of uploaded file names.
    * @return uploaded
    **/
    @ApiModelProperty(value = "List of uploaded file names.")
    public List<String> getUploaded() {
        return uploaded;
    }

    public FilesUploadResult uploaded(List<String> uploaded) {
        this.uploaded = uploaded;
        return this;
    }

    public FilesUploadResult addUploadedItem(String uploadedItem) {
        if (this.uploaded == null) {
            this.uploaded = new ArrayList<String>();
        }
        this.uploaded.add(uploadedItem);
        return this;
    }


    public void setUploaded(List<String> uploaded) {
        this.uploaded = uploaded;
    }


    public FilesUploadResult() {
        this.errors = null;
        this.uploaded = null;
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

        if (this.errors != null) {
            for (ModelIfc elementErrors : this.errors) {
                if (elementErrors != null) {
                    elementErrors.validate();
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

        FilesUploadResult filesUploadResult = (FilesUploadResult) o;
        return
            Objects.equals(this.errors, filesUploadResult.errors) &&
            Objects.equals(this.uploaded, filesUploadResult.uploaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, uploaded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesUploadResult {\n");
    sb.append("    errors: ").append(toIndentedString(getErrors())).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(getUploaded())).append("\n");
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
