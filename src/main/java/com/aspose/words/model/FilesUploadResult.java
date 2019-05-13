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
import com.aspose.words.cloud.model.Error;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * File upload result
 */
@ApiModel(description = "File upload result")

public class FilesUploadResult {
  @SerializedName("Uploaded")
  private List<String> uploaded = null;

  @SerializedName("Errors")
  private List<Error> errors = null;

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

   /**
   * List of uploaded file names
   * @return uploaded
  **/
  @ApiModelProperty(value = "List of uploaded file names")
  public List<String> getUploaded() {
    return uploaded;
  }

  public void setUploaded(List<String> uploaded) {
    this.uploaded = uploaded;
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

   /**
   * List of errors.
   * @return errors
  **/
  @ApiModelProperty(value = "List of errors.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
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
    return Objects.equals(this.uploaded, filesUploadResult.uploaded) &&
        Objects.equals(this.errors, filesUploadResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploaded, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesUploadResult {\n");
    
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

