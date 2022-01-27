/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="XamlFlowSaveOptionsData.java">
 *   Copyright (c) 2022 Aspose.Words for Cloud
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
 * Container class for xaml flow save options.
 */
@ApiModel(description = "Container class for xaml flow save options.")
public class XamlFlowSaveOptionsData extends SaveOptionsData {
    @SerializedName("ImagesFolder")
    protected String imagesFolder;

    @SerializedName("ImagesFolderAlias")
    protected String imagesFolderAlias;
    /**
     * Gets or sets the physical folder where images are saved when exporting.
    * @return imagesFolder
    **/
    @ApiModelProperty(value = "Gets or sets the physical folder where images are saved when exporting.")
    public String getImagesFolder() {
        return imagesFolder;
    }

    public XamlFlowSaveOptionsData imagesFolder(String imagesFolder) {
        this.imagesFolder = imagesFolder;
        return this;
    }

    public void setImagesFolder(String imagesFolder) {
        this.imagesFolder = imagesFolder;
    }


    /**
     * Gets or sets the name of the folder used to construct image URIs.
    * @return imagesFolderAlias
    **/
    @ApiModelProperty(value = "Gets or sets the name of the folder used to construct image URIs.")
    public String getImagesFolderAlias() {
        return imagesFolderAlias;
    }

    public XamlFlowSaveOptionsData imagesFolderAlias(String imagesFolderAlias) {
        this.imagesFolderAlias = imagesFolderAlias;
        return this;
    }

    public void setImagesFolderAlias(String imagesFolderAlias) {
        this.imagesFolderAlias = imagesFolderAlias;
    }


    public XamlFlowSaveOptionsData() {
        super();
        this.imagesFolder = null;
        this.imagesFolderAlias = null;
        this.saveFormat = "xamlflow";
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        XamlFlowSaveOptionsData xamlFlowSaveOptionsData = (XamlFlowSaveOptionsData) o;
        return
            Objects.equals(this.imagesFolder, xamlFlowSaveOptionsData.imagesFolder) &&
            Objects.equals(this.imagesFolderAlias, xamlFlowSaveOptionsData.imagesFolderAlias) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imagesFolder, imagesFolderAlias, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XamlFlowSaveOptionsData {\n");
    sb.append("    allowEmbeddingPostScriptFonts: ").append(toIndentedString(getAllowEmbeddingPostScriptFonts())).append("\n");
    sb.append("    customTimeZoneInfoData: ").append(toIndentedString(getCustomTimeZoneInfoData())).append("\n");
    sb.append("    dml3DEffectsRenderingMode: ").append(toIndentedString(getDml3DEffectsRenderingMode())).append("\n");
    sb.append("    dmlEffectsRenderingMode: ").append(toIndentedString(getDmlEffectsRenderingMode())).append("\n");
    sb.append("    dmlRenderingMode: ").append(toIndentedString(getDmlRenderingMode())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(getFileName())).append("\n");
    sb.append("    flatOpcXmlMappingOnly: ").append(toIndentedString(getFlatOpcXmlMappingOnly())).append("\n");
    sb.append("    imlRenderingMode: ").append(toIndentedString(getImlRenderingMode())).append("\n");
    sb.append("    updateCreatedTimeProperty: ").append(toIndentedString(getUpdateCreatedTimeProperty())).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(getUpdateFields())).append("\n");
    sb.append("    updateLastPrintedProperty: ").append(toIndentedString(getUpdateLastPrintedProperty())).append("\n");
    sb.append("    updateLastSavedTimeProperty: ").append(toIndentedString(getUpdateLastSavedTimeProperty())).append("\n");
    sb.append("    updateSdtContent: ").append(toIndentedString(getUpdateSdtContent())).append("\n");
    sb.append("    zipOutput: ").append(toIndentedString(getZipOutput())).append("\n");
    sb.append("    imagesFolder: ").append(toIndentedString(getImagesFolder())).append("\n");
    sb.append("    imagesFolderAlias: ").append(toIndentedString(getImagesFolderAlias())).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
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
