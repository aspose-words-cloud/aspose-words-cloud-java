/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="LoadWebDocumentData.java">
 *   Copyright (c) 2024 Aspose.Words for Cloud
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
 * Contains data for load web document.
 */
@ApiModel(description = "Contains data for load web document.")
public class LoadWebDocumentData implements ModelIfc {
    @SerializedName("SaveOptions")
    protected SaveOptionsData saveOptions;

    @SerializedName("LoadingDocumentUrl")
    protected String loadingDocumentUrl;
    /**
     * Gets or sets the save options.
    * @return saveOptions
    **/
    @ApiModelProperty(value = "Gets or sets the save options.")
    public SaveOptionsData getSaveOptions() {
        return saveOptions;
    }

    public LoadWebDocumentData saveOptions(SaveOptionsData saveOptions) {
        this.saveOptions = saveOptions;
        return this;
    }

    public void setSaveOptions(SaveOptionsData saveOptions) {
        this.saveOptions = saveOptions;
    }


    /**
     * Gets or sets the web document URL.
    * @return loadingDocumentUrl
    **/
    @ApiModelProperty(value = "Gets or sets the web document URL.")
    public String getLoadingDocumentUrl() {
        return loadingDocumentUrl;
    }

    public LoadWebDocumentData loadingDocumentUrl(String loadingDocumentUrl) {
        this.loadingDocumentUrl = loadingDocumentUrl;
        return this;
    }

    public void setLoadingDocumentUrl(String loadingDocumentUrl) {
        this.loadingDocumentUrl = loadingDocumentUrl;
    }


    public LoadWebDocumentData() {
        this.saveOptions = null;
        this.loadingDocumentUrl = null;
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
        if (this.loadingDocumentUrl == null) {
            throw new ApiException(400, "Property LoadingDocumentUrl in LoadWebDocumentData is required.");
        }

        if (this.saveOptions != null) {
            this.saveOptions.validate();
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

        LoadWebDocumentData loadWebDocumentData = (LoadWebDocumentData) o;
        return
            Objects.equals(this.saveOptions, loadWebDocumentData.saveOptions) &&
            Objects.equals(this.loadingDocumentUrl, loadWebDocumentData.loadingDocumentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saveOptions, loadingDocumentUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadWebDocumentData {\n");
    sb.append("    saveOptions: ").append(toIndentedString(getSaveOptions())).append("\n");
    sb.append("    loadingDocumentUrl: ").append(toIndentedString(getLoadingDocumentUrl())).append("\n");
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
