/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2019 Aspose.Words for Cloud
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
 * container class for svg save options.
 */
@ApiModel(description = "container class for svg save options.")
public class SvgSaveOptionsData extends FixedPageSaveOptionsData {
  @SerializedName("ExportEmbeddedImages")
  private Boolean exportEmbeddedImages = null;

  @SerializedName("FitToViewPort")
  private Boolean fitToViewPort = null;

  @SerializedName("ResourcesFolder")
  private String resourcesFolder = null;

  @SerializedName("ResourcesFolderAlias")
  private String resourcesFolderAlias = null;

  @SerializedName("ShowPageBorder")
  private Boolean showPageBorder = null;

  @SerializedName("TextOutputMode")
  private String textOutputMode = null;

  public SvgSaveOptionsData exportEmbeddedImages(Boolean exportEmbeddedImages) {
    this.exportEmbeddedImages = exportEmbeddedImages;
    return this;
  }

   /**
   * Gets or sets specified whether images should be embedded into SVG document as base64.
   * @return exportEmbeddedImages
  **/
  @ApiModelProperty(value = "Gets or sets specified whether images should be embedded into SVG document as base64.")
  public Boolean isExportEmbeddedImages() {
    return exportEmbeddedImages;
  }

  public void setExportEmbeddedImages(Boolean exportEmbeddedImages) {
    this.exportEmbeddedImages = exportEmbeddedImages;
  }

  public SvgSaveOptionsData fitToViewPort(Boolean fitToViewPort) {
    this.fitToViewPort = fitToViewPort;
    return this;
  }

   /**
   * Gets or sets specifies if the output SVG should fill the available viewport area (browser window or container). When set to true width and height of output SVG are set to 100%.
   * @return fitToViewPort
  **/
  @ApiModelProperty(value = "Gets or sets specifies if the output SVG should fill the available viewport area (browser window or container). When set to true width and height of output SVG are set to 100%.")
  public Boolean isFitToViewPort() {
    return fitToViewPort;
  }

  public void setFitToViewPort(Boolean fitToViewPort) {
    this.fitToViewPort = fitToViewPort;
  }

  public SvgSaveOptionsData resourcesFolder(String resourcesFolder) {
    this.resourcesFolder = resourcesFolder;
    return this;
  }

   /**
   * Gets or sets specifies the physical folder where resources (images) are saved when exporting.
   * @return resourcesFolder
  **/
  @ApiModelProperty(value = "Gets or sets specifies the physical folder where resources (images) are saved when exporting.")
  public String getResourcesFolder() {
    return resourcesFolder;
  }

  public void setResourcesFolder(String resourcesFolder) {
    this.resourcesFolder = resourcesFolder;
  }

  public SvgSaveOptionsData resourcesFolderAlias(String resourcesFolderAlias) {
    this.resourcesFolderAlias = resourcesFolderAlias;
    return this;
  }

   /**
   * Gets or sets specifies the name of the folder used to construct image URIs.
   * @return resourcesFolderAlias
  **/
  @ApiModelProperty(value = "Gets or sets specifies the name of the folder used to construct image URIs.")
  public String getResourcesFolderAlias() {
    return resourcesFolderAlias;
  }

  public void setResourcesFolderAlias(String resourcesFolderAlias) {
    this.resourcesFolderAlias = resourcesFolderAlias;
  }

  public SvgSaveOptionsData showPageBorder(Boolean showPageBorder) {
    this.showPageBorder = showPageBorder;
    return this;
  }

   /**
   * Gets or sets show/hide page stepper.
   * @return showPageBorder
  **/
  @ApiModelProperty(value = "Gets or sets show/hide page stepper.")
  public Boolean isShowPageBorder() {
    return showPageBorder;
  }

  public void setShowPageBorder(Boolean showPageBorder) {
    this.showPageBorder = showPageBorder;
  }

  public SvgSaveOptionsData textOutputMode(String textOutputMode) {
    this.textOutputMode = textOutputMode;
    return this;
  }

   /**
   * Gets or sets determines how text should be rendered.
   * @return textOutputMode
  **/
  @ApiModelProperty(value = "Gets or sets determines how text should be rendered.")
  public String getTextOutputMode() {
    return textOutputMode;
  }

  public void setTextOutputMode(String textOutputMode) {
    this.textOutputMode = textOutputMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SvgSaveOptionsData svgSaveOptionsData = (SvgSaveOptionsData) o;
    return Objects.equals(this.exportEmbeddedImages, svgSaveOptionsData.exportEmbeddedImages) &&
        Objects.equals(this.fitToViewPort, svgSaveOptionsData.fitToViewPort) &&
        Objects.equals(this.resourcesFolder, svgSaveOptionsData.resourcesFolder) &&
        Objects.equals(this.resourcesFolderAlias, svgSaveOptionsData.resourcesFolderAlias) &&
        Objects.equals(this.showPageBorder, svgSaveOptionsData.showPageBorder) &&
        Objects.equals(this.textOutputMode, svgSaveOptionsData.textOutputMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportEmbeddedImages, fitToViewPort, resourcesFolder, resourcesFolderAlias, showPageBorder, textOutputMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SvgSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportEmbeddedImages: ").append(toIndentedString(exportEmbeddedImages)).append("\n");
    sb.append("    fitToViewPort: ").append(toIndentedString(fitToViewPort)).append("\n");
    sb.append("    resourcesFolder: ").append(toIndentedString(resourcesFolder)).append("\n");
    sb.append("    resourcesFolderAlias: ").append(toIndentedString(resourcesFolderAlias)).append("\n");
    sb.append("    showPageBorder: ").append(toIndentedString(showPageBorder)).append("\n");
    sb.append("    textOutputMode: ").append(toIndentedString(textOutputMode)).append("\n");
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

