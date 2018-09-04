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
import com.aspose.words.model.OutlineOptionsData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Container class for xps save options.
 */
@ApiModel(description = "Container class for xps save options.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:07:04.469Z")
public class XpsSaveOptionsData {
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

  @JsonProperty("BookmarksOutlineLevel")
  private Integer bookmarksOutlineLevel = null;

  @JsonProperty("HeadingsOutlineLevels")
  private Integer headingsOutlineLevels = null;

  @JsonProperty("OutlineOptions")
  private OutlineOptionsData outlineOptions = null;

  @JsonProperty("UseBookFoldPrintingSettings")
  private Boolean useBookFoldPrintingSettings = null;

  public XpsSaveOptionsData colorMode(String colorMode) {
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

  public XpsSaveOptionsData saveFormat(String saveFormat) {
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

  public XpsSaveOptionsData fileName(String fileName) {
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

  public XpsSaveOptionsData dmlRenderingMode(String dmlRenderingMode) {
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

  public XpsSaveOptionsData dmlEffectsRenderingMode(String dmlEffectsRenderingMode) {
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

  public XpsSaveOptionsData zipOutput(Boolean zipOutput) {
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

  public XpsSaveOptionsData updateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
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

  public XpsSaveOptionsData updateSdtContent(Boolean updateSdtContent) {
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

  public XpsSaveOptionsData updateFields(Boolean updateFields) {
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

  public XpsSaveOptionsData jpegQuality(Integer jpegQuality) {
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

  public XpsSaveOptionsData metafileRenderingOptions(MetafileRenderingOptionsData metafileRenderingOptions) {
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

  public XpsSaveOptionsData numeralFormat(String numeralFormat) {
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

  public XpsSaveOptionsData optimizeOutput(Boolean optimizeOutput) {
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

  public XpsSaveOptionsData pageCount(Integer pageCount) {
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

  public XpsSaveOptionsData pageIndex(Integer pageIndex) {
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

  public XpsSaveOptionsData bookmarksOutlineLevel(Integer bookmarksOutlineLevel) {
    this.bookmarksOutlineLevel = bookmarksOutlineLevel;
    return this;
  }

   /**
   * Specifies the level in the XPS document outline at which to display Word bookmarks.
   * @return bookmarksOutlineLevel
  **/
  @ApiModelProperty(value = "Specifies the level in the XPS document outline at which to display Word bookmarks.")
  public Integer getBookmarksOutlineLevel() {
    return bookmarksOutlineLevel;
  }

  public void setBookmarksOutlineLevel(Integer bookmarksOutlineLevel) {
    this.bookmarksOutlineLevel = bookmarksOutlineLevel;
  }

  public XpsSaveOptionsData headingsOutlineLevels(Integer headingsOutlineLevels) {
    this.headingsOutlineLevels = headingsOutlineLevels;
    return this;
  }

   /**
   * Specifies how many levels of headings (paragraphs formatted with the Heading styles) to include in the XPS document outline.
   * @return headingsOutlineLevels
  **/
  @ApiModelProperty(value = "Specifies how many levels of headings (paragraphs formatted with the Heading styles) to include in the XPS document outline.")
  public Integer getHeadingsOutlineLevels() {
    return headingsOutlineLevels;
  }

  public void setHeadingsOutlineLevels(Integer headingsOutlineLevels) {
    this.headingsOutlineLevels = headingsOutlineLevels;
  }

  public XpsSaveOptionsData outlineOptions(OutlineOptionsData outlineOptions) {
    this.outlineOptions = outlineOptions;
    return this;
  }

   /**
   * Allows to specify outline options
   * @return outlineOptions
  **/
  @ApiModelProperty(value = "Allows to specify outline options")
  public OutlineOptionsData getOutlineOptions() {
    return outlineOptions;
  }

  public void setOutlineOptions(OutlineOptionsData outlineOptions) {
    this.outlineOptions = outlineOptions;
  }

  public XpsSaveOptionsData useBookFoldPrintingSettings(Boolean useBookFoldPrintingSettings) {
    this.useBookFoldPrintingSettings = useBookFoldPrintingSettings;
    return this;
  }

   /**
   * Determines whether the document should be saved using a booklet printing layout
   * @return useBookFoldPrintingSettings
  **/
  @ApiModelProperty(value = "Determines whether the document should be saved using a booklet printing layout")
  public Boolean isUseBookFoldPrintingSettings() {
    return useBookFoldPrintingSettings;
  }

  public void setUseBookFoldPrintingSettings(Boolean useBookFoldPrintingSettings) {
    this.useBookFoldPrintingSettings = useBookFoldPrintingSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XpsSaveOptionsData xpsSaveOptionsData = (XpsSaveOptionsData) o;
    return Objects.equals(this.colorMode, xpsSaveOptionsData.colorMode) &&
        Objects.equals(this.saveFormat, xpsSaveOptionsData.saveFormat) &&
        Objects.equals(this.fileName, xpsSaveOptionsData.fileName) &&
        Objects.equals(this.dmlRenderingMode, xpsSaveOptionsData.dmlRenderingMode) &&
        Objects.equals(this.dmlEffectsRenderingMode, xpsSaveOptionsData.dmlEffectsRenderingMode) &&
        Objects.equals(this.zipOutput, xpsSaveOptionsData.zipOutput) &&
        Objects.equals(this.updateLastSavedTimeProperty, xpsSaveOptionsData.updateLastSavedTimeProperty) &&
        Objects.equals(this.updateSdtContent, xpsSaveOptionsData.updateSdtContent) &&
        Objects.equals(this.updateFields, xpsSaveOptionsData.updateFields) &&
        Objects.equals(this.jpegQuality, xpsSaveOptionsData.jpegQuality) &&
        Objects.equals(this.metafileRenderingOptions, xpsSaveOptionsData.metafileRenderingOptions) &&
        Objects.equals(this.numeralFormat, xpsSaveOptionsData.numeralFormat) &&
        Objects.equals(this.optimizeOutput, xpsSaveOptionsData.optimizeOutput) &&
        Objects.equals(this.pageCount, xpsSaveOptionsData.pageCount) &&
        Objects.equals(this.pageIndex, xpsSaveOptionsData.pageIndex) &&
        Objects.equals(this.bookmarksOutlineLevel, xpsSaveOptionsData.bookmarksOutlineLevel) &&
        Objects.equals(this.headingsOutlineLevels, xpsSaveOptionsData.headingsOutlineLevels) &&
        Objects.equals(this.outlineOptions, xpsSaveOptionsData.outlineOptions) &&
        Objects.equals(this.useBookFoldPrintingSettings, xpsSaveOptionsData.useBookFoldPrintingSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorMode, saveFormat, fileName, dmlRenderingMode, dmlEffectsRenderingMode, zipOutput, updateLastSavedTimeProperty, updateSdtContent, updateFields, jpegQuality, metafileRenderingOptions, numeralFormat, optimizeOutput, pageCount, pageIndex, bookmarksOutlineLevel, headingsOutlineLevels, outlineOptions, useBookFoldPrintingSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpsSaveOptionsData {\n");
    
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
    sb.append("    bookmarksOutlineLevel: ").append(toIndentedString(bookmarksOutlineLevel)).append("\n");
    sb.append("    headingsOutlineLevels: ").append(toIndentedString(headingsOutlineLevels)).append("\n");
    sb.append("    outlineOptions: ").append(toIndentedString(outlineOptions)).append("\n");
    sb.append("    useBookFoldPrintingSettings: ").append(toIndentedString(useBookFoldPrintingSettings)).append("\n");
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

