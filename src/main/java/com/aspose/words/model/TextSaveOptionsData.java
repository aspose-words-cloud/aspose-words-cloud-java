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
 * Container class for text save options.
 */
@ApiModel(description = "Container class for text save options.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-24T08:31:47.592+07:00")
public class TextSaveOptionsData {
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

  @JsonProperty("Encoding")
  private String encoding = null;

  @JsonProperty("ExportHeadersFooters")
  private Boolean exportHeadersFooters = null;

  @JsonProperty("ForcePageBreaks")
  private Boolean forcePageBreaks = null;

  @JsonProperty("ParagraphBreak")
  private String paragraphBreak = null;

  @JsonProperty("PreserveTableLayout")
  private Boolean preserveTableLayout = null;

  @JsonProperty("SimplifyListLabels")
  private Boolean simplifyListLabels = null;

  public TextSaveOptionsData colorMode(String colorMode) {
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

  public TextSaveOptionsData saveFormat(String saveFormat) {
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

  public TextSaveOptionsData fileName(String fileName) {
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

  public TextSaveOptionsData dmlRenderingMode(String dmlRenderingMode) {
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

  public TextSaveOptionsData dmlEffectsRenderingMode(String dmlEffectsRenderingMode) {
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

  public TextSaveOptionsData zipOutput(Boolean zipOutput) {
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

  public TextSaveOptionsData updateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
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

  public TextSaveOptionsData updateSdtContent(Boolean updateSdtContent) {
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

  public TextSaveOptionsData updateFields(Boolean updateFields) {
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

  public TextSaveOptionsData encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Specifies the encoding to use when exporting in plain text format
   * @return encoding
  **/
  @ApiModelProperty(value = "Specifies the encoding to use when exporting in plain text format")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public TextSaveOptionsData exportHeadersFooters(Boolean exportHeadersFooters) {
    this.exportHeadersFooters = exportHeadersFooters;
    return this;
  }

   /**
   * Specifies whether to output headers and footers when exporting in plain text format
   * @return exportHeadersFooters
  **/
  @ApiModelProperty(value = "Specifies whether to output headers and footers when exporting in plain text format")
  public Boolean isExportHeadersFooters() {
    return exportHeadersFooters;
  }

  public void setExportHeadersFooters(Boolean exportHeadersFooters) {
    this.exportHeadersFooters = exportHeadersFooters;
  }

  public TextSaveOptionsData forcePageBreaks(Boolean forcePageBreaks) {
    this.forcePageBreaks = forcePageBreaks;
    return this;
  }

   /**
   * Allows to specify whether the page breaks should be preserved during export. The default value is false.
   * @return forcePageBreaks
  **/
  @ApiModelProperty(value = "Allows to specify whether the page breaks should be preserved during export. The default value is false.")
  public Boolean isForcePageBreaks() {
    return forcePageBreaks;
  }

  public void setForcePageBreaks(Boolean forcePageBreaks) {
    this.forcePageBreaks = forcePageBreaks;
  }

  public TextSaveOptionsData paragraphBreak(String paragraphBreak) {
    this.paragraphBreak = paragraphBreak;
    return this;
  }

   /**
   * Specifies the string to use as a paragraph break when exporting in plain text format
   * @return paragraphBreak
  **/
  @ApiModelProperty(value = "Specifies the string to use as a paragraph break when exporting in plain text format")
  public String getParagraphBreak() {
    return paragraphBreak;
  }

  public void setParagraphBreak(String paragraphBreak) {
    this.paragraphBreak = paragraphBreak;
  }

  public TextSaveOptionsData preserveTableLayout(Boolean preserveTableLayout) {
    this.preserveTableLayout = preserveTableLayout;
    return this;
  }

   /**
   * Specifies whether the program should attempt to preserve layout of tables when saving in the plain text format
   * @return preserveTableLayout
  **/
  @ApiModelProperty(value = "Specifies whether the program should attempt to preserve layout of tables when saving in the plain text format")
  public Boolean isPreserveTableLayout() {
    return preserveTableLayout;
  }

  public void setPreserveTableLayout(Boolean preserveTableLayout) {
    this.preserveTableLayout = preserveTableLayout;
  }

  public TextSaveOptionsData simplifyListLabels(Boolean simplifyListLabels) {
    this.simplifyListLabels = simplifyListLabels;
    return this;
  }

   /**
   * Specifies whether the program should simplify list labels in case of complex label formatting not being adequately represented by plain text
   * @return simplifyListLabels
  **/
  @ApiModelProperty(value = "Specifies whether the program should simplify list labels in case of complex label formatting not being adequately represented by plain text")
  public Boolean isSimplifyListLabels() {
    return simplifyListLabels;
  }

  public void setSimplifyListLabels(Boolean simplifyListLabels) {
    this.simplifyListLabels = simplifyListLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextSaveOptionsData textSaveOptionsData = (TextSaveOptionsData) o;
    return Objects.equals(this.colorMode, textSaveOptionsData.colorMode) &&
        Objects.equals(this.saveFormat, textSaveOptionsData.saveFormat) &&
        Objects.equals(this.fileName, textSaveOptionsData.fileName) &&
        Objects.equals(this.dmlRenderingMode, textSaveOptionsData.dmlRenderingMode) &&
        Objects.equals(this.dmlEffectsRenderingMode, textSaveOptionsData.dmlEffectsRenderingMode) &&
        Objects.equals(this.zipOutput, textSaveOptionsData.zipOutput) &&
        Objects.equals(this.updateLastSavedTimeProperty, textSaveOptionsData.updateLastSavedTimeProperty) &&
        Objects.equals(this.updateSdtContent, textSaveOptionsData.updateSdtContent) &&
        Objects.equals(this.updateFields, textSaveOptionsData.updateFields) &&
        Objects.equals(this.encoding, textSaveOptionsData.encoding) &&
        Objects.equals(this.exportHeadersFooters, textSaveOptionsData.exportHeadersFooters) &&
        Objects.equals(this.forcePageBreaks, textSaveOptionsData.forcePageBreaks) &&
        Objects.equals(this.paragraphBreak, textSaveOptionsData.paragraphBreak) &&
        Objects.equals(this.preserveTableLayout, textSaveOptionsData.preserveTableLayout) &&
        Objects.equals(this.simplifyListLabels, textSaveOptionsData.simplifyListLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorMode, saveFormat, fileName, dmlRenderingMode, dmlEffectsRenderingMode, zipOutput, updateLastSavedTimeProperty, updateSdtContent, updateFields, encoding, exportHeadersFooters, forcePageBreaks, paragraphBreak, preserveTableLayout, simplifyListLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextSaveOptionsData {\n");
    
    sb.append("    colorMode: ").append(toIndentedString(colorMode)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    dmlRenderingMode: ").append(toIndentedString(dmlRenderingMode)).append("\n");
    sb.append("    dmlEffectsRenderingMode: ").append(toIndentedString(dmlEffectsRenderingMode)).append("\n");
    sb.append("    zipOutput: ").append(toIndentedString(zipOutput)).append("\n");
    sb.append("    updateLastSavedTimeProperty: ").append(toIndentedString(updateLastSavedTimeProperty)).append("\n");
    sb.append("    updateSdtContent: ").append(toIndentedString(updateSdtContent)).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    exportHeadersFooters: ").append(toIndentedString(exportHeadersFooters)).append("\n");
    sb.append("    forcePageBreaks: ").append(toIndentedString(forcePageBreaks)).append("\n");
    sb.append("    paragraphBreak: ").append(toIndentedString(paragraphBreak)).append("\n");
    sb.append("    preserveTableLayout: ").append(toIndentedString(preserveTableLayout)).append("\n");
    sb.append("    simplifyListLabels: ").append(toIndentedString(simplifyListLabels)).append("\n");
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

