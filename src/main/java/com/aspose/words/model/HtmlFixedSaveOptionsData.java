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
 * container class for fixed html save options
 */
@ApiModel(description = "container class for fixed html save options")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T12:28:34.829Z")
public class HtmlFixedSaveOptionsData {
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

  @JsonProperty("CssClassNamesPrefix")
  private String cssClassNamesPrefix = null;

  @JsonProperty("Encoding")
  private String encoding = null;

  @JsonProperty("ExportEmbeddedCss")
  private Boolean exportEmbeddedCss = null;

  @JsonProperty("ExportEmbeddedFonts")
  private Boolean exportEmbeddedFonts = null;

  @JsonProperty("ExportEmbeddedImages")
  private Boolean exportEmbeddedImages = null;

  @JsonProperty("ExportFormFields")
  private Boolean exportFormFields = null;

  @JsonProperty("FontFormat")
  private String fontFormat = null;

  @JsonProperty("PageHorizontalAlignment")
  private String pageHorizontalAlignment = null;

  @JsonProperty("PageMargins")
  private Double pageMargins = null;

  @JsonProperty("ResourcesFolder")
  private String resourcesFolder = null;

  @JsonProperty("ResourcesFolderAlias")
  private String resourcesFolderAlias = null;

  @JsonProperty("ShowPageBorder")
  private Boolean showPageBorder = null;

  public HtmlFixedSaveOptionsData colorMode(String colorMode) {
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

  public HtmlFixedSaveOptionsData saveFormat(String saveFormat) {
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

  public HtmlFixedSaveOptionsData fileName(String fileName) {
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

  public HtmlFixedSaveOptionsData dmlRenderingMode(String dmlRenderingMode) {
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

  public HtmlFixedSaveOptionsData dmlEffectsRenderingMode(String dmlEffectsRenderingMode) {
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

  public HtmlFixedSaveOptionsData zipOutput(Boolean zipOutput) {
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

  public HtmlFixedSaveOptionsData updateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
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

  public HtmlFixedSaveOptionsData updateSdtContent(Boolean updateSdtContent) {
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

  public HtmlFixedSaveOptionsData updateFields(Boolean updateFields) {
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

  public HtmlFixedSaveOptionsData jpegQuality(Integer jpegQuality) {
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

  public HtmlFixedSaveOptionsData metafileRenderingOptions(MetafileRenderingOptionsData metafileRenderingOptions) {
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

  public HtmlFixedSaveOptionsData numeralFormat(String numeralFormat) {
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

  public HtmlFixedSaveOptionsData optimizeOutput(Boolean optimizeOutput) {
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

  public HtmlFixedSaveOptionsData pageCount(Integer pageCount) {
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

  public HtmlFixedSaveOptionsData pageIndex(Integer pageIndex) {
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

  public HtmlFixedSaveOptionsData cssClassNamesPrefix(String cssClassNamesPrefix) {
    this.cssClassNamesPrefix = cssClassNamesPrefix;
    return this;
  }

   /**
   * Specifies prefix which is added to all class names in style.css file. Default value is \&quot;aw\&quot;.
   * @return cssClassNamesPrefix
  **/
  @ApiModelProperty(value = "Specifies prefix which is added to all class names in style.css file. Default value is \"aw\".")
  public String getCssClassNamesPrefix() {
    return cssClassNamesPrefix;
  }

  public void setCssClassNamesPrefix(String cssClassNamesPrefix) {
    this.cssClassNamesPrefix = cssClassNamesPrefix;
  }

  public HtmlFixedSaveOptionsData encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Encoding.
   * @return encoding
  **/
  @ApiModelProperty(value = "Encoding.")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public HtmlFixedSaveOptionsData exportEmbeddedCss(Boolean exportEmbeddedCss) {
    this.exportEmbeddedCss = exportEmbeddedCss;
    return this;
  }

   /**
   * Specifies whether the CSS (Cascading Style Sheet) should be embedded into Html document.
   * @return exportEmbeddedCss
  **/
  @ApiModelProperty(value = "Specifies whether the CSS (Cascading Style Sheet) should be embedded into Html document.")
  public Boolean isExportEmbeddedCss() {
    return exportEmbeddedCss;
  }

  public void setExportEmbeddedCss(Boolean exportEmbeddedCss) {
    this.exportEmbeddedCss = exportEmbeddedCss;
  }

  public HtmlFixedSaveOptionsData exportEmbeddedFonts(Boolean exportEmbeddedFonts) {
    this.exportEmbeddedFonts = exportEmbeddedFonts;
    return this;
  }

   /**
   * Specifies whether fonts should be embedded into Html document in Base64 format.
   * @return exportEmbeddedFonts
  **/
  @ApiModelProperty(value = "Specifies whether fonts should be embedded into Html document in Base64 format.")
  public Boolean isExportEmbeddedFonts() {
    return exportEmbeddedFonts;
  }

  public void setExportEmbeddedFonts(Boolean exportEmbeddedFonts) {
    this.exportEmbeddedFonts = exportEmbeddedFonts;
  }

  public HtmlFixedSaveOptionsData exportEmbeddedImages(Boolean exportEmbeddedImages) {
    this.exportEmbeddedImages = exportEmbeddedImages;
    return this;
  }

   /**
   * Specifies whether images should be embedded into Html document in Base64 format.
   * @return exportEmbeddedImages
  **/
  @ApiModelProperty(value = "Specifies whether images should be embedded into Html document in Base64 format.")
  public Boolean isExportEmbeddedImages() {
    return exportEmbeddedImages;
  }

  public void setExportEmbeddedImages(Boolean exportEmbeddedImages) {
    this.exportEmbeddedImages = exportEmbeddedImages;
  }

  public HtmlFixedSaveOptionsData exportFormFields(Boolean exportFormFields) {
    this.exportFormFields = exportFormFields;
    return this;
  }

   /**
   * Gets or sets indication of whether form fields are exported as interactive items (as &#39;input&#39; tag) rather than converted to text or graphics.
   * @return exportFormFields
  **/
  @ApiModelProperty(value = "Gets or sets indication of whether form fields are exported as interactive items (as 'input' tag) rather than converted to text or graphics.")
  public Boolean isExportFormFields() {
    return exportFormFields;
  }

  public void setExportFormFields(Boolean exportFormFields) {
    this.exportFormFields = exportFormFields;
  }

  public HtmlFixedSaveOptionsData fontFormat(String fontFormat) {
    this.fontFormat = fontFormat;
    return this;
  }

   /**
   * Specifies export format of fonts
   * @return fontFormat
  **/
  @ApiModelProperty(value = "Specifies export format of fonts")
  public String getFontFormat() {
    return fontFormat;
  }

  public void setFontFormat(String fontFormat) {
    this.fontFormat = fontFormat;
  }

  public HtmlFixedSaveOptionsData pageHorizontalAlignment(String pageHorizontalAlignment) {
    this.pageHorizontalAlignment = pageHorizontalAlignment;
    return this;
  }

   /**
   * Specifies the horizontal alignment of pages in an HTML document. Default value is HtmlFixedHorizontalPageAlignment.Center.
   * @return pageHorizontalAlignment
  **/
  @ApiModelProperty(value = "Specifies the horizontal alignment of pages in an HTML document. Default value is HtmlFixedHorizontalPageAlignment.Center.")
  public String getPageHorizontalAlignment() {
    return pageHorizontalAlignment;
  }

  public void setPageHorizontalAlignment(String pageHorizontalAlignment) {
    this.pageHorizontalAlignment = pageHorizontalAlignment;
  }

  public HtmlFixedSaveOptionsData pageMargins(Double pageMargins) {
    this.pageMargins = pageMargins;
    return this;
  }

   /**
   * Specifies the margins around pages in an HTML document. The margins value is measured in points and should be equal to or greater than 0. Default value is 10 points.
   * @return pageMargins
  **/
  @ApiModelProperty(value = "Specifies the margins around pages in an HTML document. The margins value is measured in points and should be equal to or greater than 0. Default value is 10 points.")
  public Double getPageMargins() {
    return pageMargins;
  }

  public void setPageMargins(Double pageMargins) {
    this.pageMargins = pageMargins;
  }

  public HtmlFixedSaveOptionsData resourcesFolder(String resourcesFolder) {
    this.resourcesFolder = resourcesFolder;
    return this;
  }

   /**
   * Specifies the physical folder where resources are saved when exporting a document
   * @return resourcesFolder
  **/
  @ApiModelProperty(value = "Specifies the physical folder where resources are saved when exporting a document")
  public String getResourcesFolder() {
    return resourcesFolder;
  }

  public void setResourcesFolder(String resourcesFolder) {
    this.resourcesFolder = resourcesFolder;
  }

  public HtmlFixedSaveOptionsData resourcesFolderAlias(String resourcesFolderAlias) {
    this.resourcesFolderAlias = resourcesFolderAlias;
    return this;
  }

   /**
   * Specifies the name of the folder used to construct resource URIs
   * @return resourcesFolderAlias
  **/
  @ApiModelProperty(value = "Specifies the name of the folder used to construct resource URIs")
  public String getResourcesFolderAlias() {
    return resourcesFolderAlias;
  }

  public void setResourcesFolderAlias(String resourcesFolderAlias) {
    this.resourcesFolderAlias = resourcesFolderAlias;
  }

  public HtmlFixedSaveOptionsData showPageBorder(Boolean showPageBorder) {
    this.showPageBorder = showPageBorder;
    return this;
  }

   /**
   * Specifies whether border around pages should be shown.
   * @return showPageBorder
  **/
  @ApiModelProperty(value = "Specifies whether border around pages should be shown.")
  public Boolean isShowPageBorder() {
    return showPageBorder;
  }

  public void setShowPageBorder(Boolean showPageBorder) {
    this.showPageBorder = showPageBorder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlFixedSaveOptionsData htmlFixedSaveOptionsData = (HtmlFixedSaveOptionsData) o;
    return Objects.equals(this.colorMode, htmlFixedSaveOptionsData.colorMode) &&
        Objects.equals(this.saveFormat, htmlFixedSaveOptionsData.saveFormat) &&
        Objects.equals(this.fileName, htmlFixedSaveOptionsData.fileName) &&
        Objects.equals(this.dmlRenderingMode, htmlFixedSaveOptionsData.dmlRenderingMode) &&
        Objects.equals(this.dmlEffectsRenderingMode, htmlFixedSaveOptionsData.dmlEffectsRenderingMode) &&
        Objects.equals(this.zipOutput, htmlFixedSaveOptionsData.zipOutput) &&
        Objects.equals(this.updateLastSavedTimeProperty, htmlFixedSaveOptionsData.updateLastSavedTimeProperty) &&
        Objects.equals(this.updateSdtContent, htmlFixedSaveOptionsData.updateSdtContent) &&
        Objects.equals(this.updateFields, htmlFixedSaveOptionsData.updateFields) &&
        Objects.equals(this.jpegQuality, htmlFixedSaveOptionsData.jpegQuality) &&
        Objects.equals(this.metafileRenderingOptions, htmlFixedSaveOptionsData.metafileRenderingOptions) &&
        Objects.equals(this.numeralFormat, htmlFixedSaveOptionsData.numeralFormat) &&
        Objects.equals(this.optimizeOutput, htmlFixedSaveOptionsData.optimizeOutput) &&
        Objects.equals(this.pageCount, htmlFixedSaveOptionsData.pageCount) &&
        Objects.equals(this.pageIndex, htmlFixedSaveOptionsData.pageIndex) &&
        Objects.equals(this.cssClassNamesPrefix, htmlFixedSaveOptionsData.cssClassNamesPrefix) &&
        Objects.equals(this.encoding, htmlFixedSaveOptionsData.encoding) &&
        Objects.equals(this.exportEmbeddedCss, htmlFixedSaveOptionsData.exportEmbeddedCss) &&
        Objects.equals(this.exportEmbeddedFonts, htmlFixedSaveOptionsData.exportEmbeddedFonts) &&
        Objects.equals(this.exportEmbeddedImages, htmlFixedSaveOptionsData.exportEmbeddedImages) &&
        Objects.equals(this.exportFormFields, htmlFixedSaveOptionsData.exportFormFields) &&
        Objects.equals(this.fontFormat, htmlFixedSaveOptionsData.fontFormat) &&
        Objects.equals(this.pageHorizontalAlignment, htmlFixedSaveOptionsData.pageHorizontalAlignment) &&
        Objects.equals(this.pageMargins, htmlFixedSaveOptionsData.pageMargins) &&
        Objects.equals(this.resourcesFolder, htmlFixedSaveOptionsData.resourcesFolder) &&
        Objects.equals(this.resourcesFolderAlias, htmlFixedSaveOptionsData.resourcesFolderAlias) &&
        Objects.equals(this.showPageBorder, htmlFixedSaveOptionsData.showPageBorder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorMode, saveFormat, fileName, dmlRenderingMode, dmlEffectsRenderingMode, zipOutput, updateLastSavedTimeProperty, updateSdtContent, updateFields, jpegQuality, metafileRenderingOptions, numeralFormat, optimizeOutput, pageCount, pageIndex, cssClassNamesPrefix, encoding, exportEmbeddedCss, exportEmbeddedFonts, exportEmbeddedImages, exportFormFields, fontFormat, pageHorizontalAlignment, pageMargins, resourcesFolder, resourcesFolderAlias, showPageBorder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlFixedSaveOptionsData {\n");
    
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
    sb.append("    cssClassNamesPrefix: ").append(toIndentedString(cssClassNamesPrefix)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    exportEmbeddedCss: ").append(toIndentedString(exportEmbeddedCss)).append("\n");
    sb.append("    exportEmbeddedFonts: ").append(toIndentedString(exportEmbeddedFonts)).append("\n");
    sb.append("    exportEmbeddedImages: ").append(toIndentedString(exportEmbeddedImages)).append("\n");
    sb.append("    exportFormFields: ").append(toIndentedString(exportFormFields)).append("\n");
    sb.append("    fontFormat: ").append(toIndentedString(fontFormat)).append("\n");
    sb.append("    pageHorizontalAlignment: ").append(toIndentedString(pageHorizontalAlignment)).append("\n");
    sb.append("    pageMargins: ").append(toIndentedString(pageMargins)).append("\n");
    sb.append("    resourcesFolder: ").append(toIndentedString(resourcesFolder)).append("\n");
    sb.append("    resourcesFolderAlias: ").append(toIndentedString(resourcesFolderAlias)).append("\n");
    sb.append("    showPageBorder: ").append(toIndentedString(showPageBorder)).append("\n");
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

