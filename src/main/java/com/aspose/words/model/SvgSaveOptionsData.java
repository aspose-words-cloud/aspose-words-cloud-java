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
import com.aspose.words.model.FixedPageSaveOptionsData;
import com.aspose.words.model.MetafileRenderingOptionsData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * container class for svg save options
 */
@ApiModel(description = "container class for svg save options")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:14:42.822Z")
public class SvgSaveOptionsData {
  @JsonProperty("ColorMode")
  private String colorMode = null;

  @JsonProperty("SaveFormat")
  private String saveFormat = null;

  @JsonProperty("FileName")
  private String fileName = null;

  @JsonProperty("DmlRenderingMode")
  private String dmlRenderingMode = null;

  @JsonProperty("DmlEffectsRenderingMode")
  private String dmlEffectsRenderingMode = null;

  @JsonProperty("ZipOutput")
  private Boolean zipOutput = null;

  @JsonProperty("UpdateLastSavedTimeProperty")
  private Boolean updateLastSavedTimeProperty = null;

  @JsonProperty("UpdateSdtContent")
  private Boolean updateSdtContent = null;

  @JsonProperty("UpdateFields")
  private Boolean updateFields = null;

  @JsonProperty("JpegQuality")
  private Integer jpegQuality = null;

  @JsonProperty("MetafileRenderingOptions")
  private MetafileRenderingOptionsData metafileRenderingOptions = null;

  @JsonProperty("NumeralFormat")
  private String numeralFormat = null;

  @JsonProperty("OptimizeOutput")
  private Boolean optimizeOutput = null;

  @JsonProperty("PageCount")
  private Integer pageCount = null;

  @JsonProperty("PageIndex")
  private Integer pageIndex = null;

  @JsonProperty("ExportEmbeddedImages")
  private Boolean exportEmbeddedImages = null;

  @JsonProperty("FitToViewPort")
  private Boolean fitToViewPort = null;

  @JsonProperty("ResourcesFolder")
  private String resourcesFolder = null;

  @JsonProperty("ResourcesFolderAlias")
  private String resourcesFolderAlias = null;

  @JsonProperty("ShowPageBorder")
  private Boolean showPageBorder = null;

  @JsonProperty("TextOutputMode")
  private String textOutputMode = null;

  public SvgSaveOptionsData colorMode(String colorMode) {
    this.colorMode = colorMode;
    return this;
  }

   /**
   * Gets or sets a value determining how colors are rendered. { Normal | Grayscale}
   * @return colorMode
  **/
  @ApiModelProperty(value = "Gets or sets a value determining how colors are rendered. { Normal | Grayscale}")
  public String getColorMode() {
    return colorMode;
  }

  public void setColorMode(String colorMode) {
    this.colorMode = colorMode;
  }

  public SvgSaveOptionsData saveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
    return this;
  }

   /**
   * format of save
   * @return saveFormat
  **/
  @ApiModelProperty(value = "format of save")
  public String getSaveFormat() {
    return saveFormat;
  }

  public void setSaveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
  }

  public SvgSaveOptionsData fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * name of destination file
   * @return fileName
  **/
  @ApiModelProperty(value = "name of destination file")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public SvgSaveOptionsData dmlRenderingMode(String dmlRenderingMode) {
    this.dmlRenderingMode = dmlRenderingMode;
    return this;
  }

   /**
   * Gets or sets a value determining how DrawingML shapes are rendered. { Fallback | DrawingML }
   * @return dmlRenderingMode
  **/
  @ApiModelProperty(value = "Gets or sets a value determining how DrawingML shapes are rendered. { Fallback | DrawingML }")
  public String getDmlRenderingMode() {
    return dmlRenderingMode;
  }

  public void setDmlRenderingMode(String dmlRenderingMode) {
    this.dmlRenderingMode = dmlRenderingMode;
  }

  public SvgSaveOptionsData dmlEffectsRenderingMode(String dmlEffectsRenderingMode) {
    this.dmlEffectsRenderingMode = dmlEffectsRenderingMode;
    return this;
  }

   /**
   * Gets or sets a value determining how DrawingML effects are rendered. { Simplified | None | Fine }
   * @return dmlEffectsRenderingMode
  **/
  @ApiModelProperty(value = "Gets or sets a value determining how DrawingML effects are rendered. { Simplified | None | Fine }")
  public String getDmlEffectsRenderingMode() {
    return dmlEffectsRenderingMode;
  }

  public void setDmlEffectsRenderingMode(String dmlEffectsRenderingMode) {
    this.dmlEffectsRenderingMode = dmlEffectsRenderingMode;
  }

  public SvgSaveOptionsData zipOutput(Boolean zipOutput) {
    this.zipOutput = zipOutput;
    return this;
  }

   /**
   * Controls zip output or not. Default value is false.
   * @return zipOutput
  **/
  @ApiModelProperty(value = "Controls zip output or not. Default value is false.")
  public Boolean isZipOutput() {
    return zipOutput;
  }

  public void setZipOutput(Boolean zipOutput) {
    this.zipOutput = zipOutput;
  }

  public SvgSaveOptionsData updateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
    this.updateLastSavedTimeProperty = updateLastSavedTimeProperty;
    return this;
  }

   /**
   * Gets or sets a value determining whether the Aspose.Words.Properties.BuiltInDocumentProperties.LastSavedTime property is updated before saving.
   * @return updateLastSavedTimeProperty
  **/
  @ApiModelProperty(value = "Gets or sets a value determining whether the Aspose.Words.Properties.BuiltInDocumentProperties.LastSavedTime property is updated before saving.")
  public Boolean isUpdateLastSavedTimeProperty() {
    return updateLastSavedTimeProperty;
  }

  public void setUpdateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
    this.updateLastSavedTimeProperty = updateLastSavedTimeProperty;
  }

  public SvgSaveOptionsData updateSdtContent(Boolean updateSdtContent) {
    this.updateSdtContent = updateSdtContent;
    return this;
  }

   /**
   * Gets or sets value determining whether content of  is updated before saving.
   * @return updateSdtContent
  **/
  @ApiModelProperty(value = "Gets or sets value determining whether content of  is updated before saving.")
  public Boolean isUpdateSdtContent() {
    return updateSdtContent;
  }

  public void setUpdateSdtContent(Boolean updateSdtContent) {
    this.updateSdtContent = updateSdtContent;
  }

  public SvgSaveOptionsData updateFields(Boolean updateFields) {
    this.updateFields = updateFields;
    return this;
  }

   /**
   * Gets or sets a value determining if fields should be updated before saving the document to a fixed page format. Default value for this property is true
   * @return updateFields
  **/
  @ApiModelProperty(value = "Gets or sets a value determining if fields should be updated before saving the document to a fixed page format. Default value for this property is true")
  public Boolean isUpdateFields() {
    return updateFields;
  }

  public void setUpdateFields(Boolean updateFields) {
    this.updateFields = updateFields;
  }

  public SvgSaveOptionsData jpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
    return this;
  }

   /**
   * Determines the quality of the JPEG images inside PDF document.
   * @return jpegQuality
  **/
  @ApiModelProperty(value = "Determines the quality of the JPEG images inside PDF document.")
  public Integer getJpegQuality() {
    return jpegQuality;
  }

  public void setJpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
  }

  public SvgSaveOptionsData metafileRenderingOptions(MetafileRenderingOptionsData metafileRenderingOptions) {
    this.metafileRenderingOptions = metafileRenderingOptions;
    return this;
  }

   /**
   * Allows to specify metafile rendering options.
   * @return metafileRenderingOptions
  **/
  @ApiModelProperty(value = "Allows to specify metafile rendering options.")
  public MetafileRenderingOptionsData getMetafileRenderingOptions() {
    return metafileRenderingOptions;
  }

  public void setMetafileRenderingOptions(MetafileRenderingOptionsData metafileRenderingOptions) {
    this.metafileRenderingOptions = metafileRenderingOptions;
  }

  public SvgSaveOptionsData numeralFormat(String numeralFormat) {
    this.numeralFormat = numeralFormat;
    return this;
  }

   /**
   * Indicates the symbol set that is used to represent numbers while rendering to fixed page formats
   * @return numeralFormat
  **/
  @ApiModelProperty(value = "Indicates the symbol set that is used to represent numbers while rendering to fixed page formats")
  public String getNumeralFormat() {
    return numeralFormat;
  }

  public void setNumeralFormat(String numeralFormat) {
    this.numeralFormat = numeralFormat;
  }

  public SvgSaveOptionsData optimizeOutput(Boolean optimizeOutput) {
    this.optimizeOutput = optimizeOutput;
    return this;
  }

   /**
   * Flag indicates whether it is required to optimize output of XPS.  If this flag is set redundant nested canvases and empty canvases are removed, also neighbor glyphs with the same formatting are concatenated.  Note: The accuracy of the content display may be affected if this property is set to true.  Default is false.
   * @return optimizeOutput
  **/
  @ApiModelProperty(value = "Flag indicates whether it is required to optimize output of XPS.  If this flag is set redundant nested canvases and empty canvases are removed, also neighbor glyphs with the same formatting are concatenated.  Note: The accuracy of the content display may be affected if this property is set to true.  Default is false.")
  public Boolean isOptimizeOutput() {
    return optimizeOutput;
  }

  public void setOptimizeOutput(Boolean optimizeOutput) {
    this.optimizeOutput = optimizeOutput;
  }

  public SvgSaveOptionsData pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Determines number of pages to render
   * @return pageCount
  **/
  @ApiModelProperty(value = "Determines number of pages to render")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public SvgSaveOptionsData pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Determines 0-based index of the first page to render
   * @return pageIndex
  **/
  @ApiModelProperty(value = "Determines 0-based index of the first page to render")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public SvgSaveOptionsData exportEmbeddedImages(Boolean exportEmbeddedImages) {
    this.exportEmbeddedImages = exportEmbeddedImages;
    return this;
  }

   /**
   * Specified whether images should be embedded into SVG document as base64
   * @return exportEmbeddedImages
  **/
  @ApiModelProperty(value = "Specified whether images should be embedded into SVG document as base64")
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
   * Specifies if the output SVG should fill the available viewport area (browser window or container). When set to true width and height of output SVG are set to 100%.
   * @return fitToViewPort
  **/
  @ApiModelProperty(value = "Specifies if the output SVG should fill the available viewport area (browser window or container). When set to true width and height of output SVG are set to 100%.")
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
   * Specifies the physical folder where resources (images) are saved when exporting
   * @return resourcesFolder
  **/
  @ApiModelProperty(value = "Specifies the physical folder where resources (images) are saved when exporting")
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
   * Specifies the name of the folder used to construct image URIs
   * @return resourcesFolderAlias
  **/
  @ApiModelProperty(value = "Specifies the name of the folder used to construct image URIs")
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
   * Show/hide page stepper
   * @return showPageBorder
  **/
  @ApiModelProperty(value = "Show/hide page stepper")
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
   * Determines how text should be rendered
   * @return textOutputMode
  **/
  @ApiModelProperty(value = "Determines how text should be rendered")
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
    return Objects.equals(this.colorMode, svgSaveOptionsData.colorMode) &&
        Objects.equals(this.saveFormat, svgSaveOptionsData.saveFormat) &&
        Objects.equals(this.fileName, svgSaveOptionsData.fileName) &&
        Objects.equals(this.dmlRenderingMode, svgSaveOptionsData.dmlRenderingMode) &&
        Objects.equals(this.dmlEffectsRenderingMode, svgSaveOptionsData.dmlEffectsRenderingMode) &&
        Objects.equals(this.zipOutput, svgSaveOptionsData.zipOutput) &&
        Objects.equals(this.updateLastSavedTimeProperty, svgSaveOptionsData.updateLastSavedTimeProperty) &&
        Objects.equals(this.updateSdtContent, svgSaveOptionsData.updateSdtContent) &&
        Objects.equals(this.updateFields, svgSaveOptionsData.updateFields) &&
        Objects.equals(this.jpegQuality, svgSaveOptionsData.jpegQuality) &&
        Objects.equals(this.metafileRenderingOptions, svgSaveOptionsData.metafileRenderingOptions) &&
        Objects.equals(this.numeralFormat, svgSaveOptionsData.numeralFormat) &&
        Objects.equals(this.optimizeOutput, svgSaveOptionsData.optimizeOutput) &&
        Objects.equals(this.pageCount, svgSaveOptionsData.pageCount) &&
        Objects.equals(this.pageIndex, svgSaveOptionsData.pageIndex) &&
        Objects.equals(this.exportEmbeddedImages, svgSaveOptionsData.exportEmbeddedImages) &&
        Objects.equals(this.fitToViewPort, svgSaveOptionsData.fitToViewPort) &&
        Objects.equals(this.resourcesFolder, svgSaveOptionsData.resourcesFolder) &&
        Objects.equals(this.resourcesFolderAlias, svgSaveOptionsData.resourcesFolderAlias) &&
        Objects.equals(this.showPageBorder, svgSaveOptionsData.showPageBorder) &&
        Objects.equals(this.textOutputMode, svgSaveOptionsData.textOutputMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorMode, saveFormat, fileName, dmlRenderingMode, dmlEffectsRenderingMode, zipOutput, updateLastSavedTimeProperty, updateSdtContent, updateFields, jpegQuality, metafileRenderingOptions, numeralFormat, optimizeOutput, pageCount, pageIndex, exportEmbeddedImages, fitToViewPort, resourcesFolder, resourcesFolderAlias, showPageBorder, textOutputMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SvgSaveOptionsData {\n");
    
    sb.append("    colorMode: ").append(toIndentedString(colorMode)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    dmlRenderingMode: ").append(toIndentedString(dmlRenderingMode)).append("\n");
    sb.append("    dmlEffectsRenderingMode: ").append(toIndentedString(dmlEffectsRenderingMode)).append("\n");
    sb.append("    zipOutput: ").append(toIndentedString(zipOutput)).append("\n");
    sb.append("    updateLastSavedTimeProperty: ").append(toIndentedString(updateLastSavedTimeProperty)).append("\n");
    sb.append("    updateSdtContent: ").append(toIndentedString(updateSdtContent)).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    metafileRenderingOptions: ").append(toIndentedString(metafileRenderingOptions)).append("\n");
    sb.append("    numeralFormat: ").append(toIndentedString(numeralFormat)).append("\n");
    sb.append("    optimizeOutput: ").append(toIndentedString(optimizeOutput)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
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

