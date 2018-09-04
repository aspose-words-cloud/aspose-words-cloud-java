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

package com.aspose.words.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.words.model.SaveOptionsData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains data for load web document
 */
@ApiModel(description = "Contains data for load web document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:24:51.214Z")
public class LoadWebDocumentData {
  @JsonProperty("LoadingDocumentUrl")
  private String loadingDocumentUrl = null;

  @JsonProperty("SaveOptions")
  private SaveOptionsData saveOptions = null;

  public LoadWebDocumentData loadingDocumentUrl(String loadingDocumentUrl) {
    this.loadingDocumentUrl = loadingDocumentUrl;
    return this;
  }

   /**
   * Web document url
   * @return loadingDocumentUrl
  **/
  @ApiModelProperty(value = "Web document url")
  public String getLoadingDocumentUrl() {
    return loadingDocumentUrl;
  }

  public void setLoadingDocumentUrl(String loadingDocumentUrl) {
    this.loadingDocumentUrl = loadingDocumentUrl;
  }

  public LoadWebDocumentData saveOptions(SaveOptionsData saveOptions) {
    this.saveOptions = saveOptions;
    return this;
  }

   /**
   * Save options
   * @return saveOptions
  **/
  @ApiModelProperty(value = "Save options")
  public SaveOptionsData getSaveOptions() {
    return saveOptions;
  }

  public void setSaveOptions(SaveOptionsData saveOptions) {
    this.saveOptions = saveOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadWebDocumentData loadWebDocumentData = (LoadWebDocumentData) o;
    return Objects.equals(this.loadingDocumentUrl, loadWebDocumentData.loadingDocumentUrl) &&
        Objects.equals(this.saveOptions, loadWebDocumentData.saveOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadingDocumentUrl, saveOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadWebDocumentData {\n");
    
    sb.append("    loadingDocumentUrl: ").append(toIndentedString(loadingDocumentUrl)).append("\n");
    sb.append("    saveOptions: ").append(toIndentedString(saveOptions)).append("\n");
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

