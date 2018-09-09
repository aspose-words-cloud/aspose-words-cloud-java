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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * container class for wml save options
 */
@ApiModel(description = "container class for wml save options")

public class WordMLSaveOptionsData {
  @SerializedName("ColorMode")
  private String colorMode = null;

  @SerializedName("SaveFormat")
  private String saveFormat = null;

  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("DmlRenderingMode")
  private String dmlRenderingMode = null;

  @SerializedName("DmlEffectsRenderingMode")
  private String dmlEffectsRenderingMode = null;

  @SerializedName("ZipOutput")
  private Boolean zipOutput = null;

  @SerializedName("UpdateLastSavedTimeProperty")
  private Boolean updateLastSavedTimeProperty = null;

  @SerializedName("UpdateSdtContent")
  private Boolean updateSdtContent = null;

  @SerializedName("UpdateFields")
  private Boolean updateFields = null;

  @SerializedName("PrettyFormat")
  private Boolean prettyFormat = null;

  public WordMLSaveOptionsData colorMode(String colorMode) {
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

  public WordMLSaveOptionsData saveFormat(String saveFormat) {
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

  public WordMLSaveOptionsData fileName(String fileName) {
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

  public WordMLSaveOptionsData dmlRenderingMode(String dmlRenderingMode) {
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

  public WordMLSaveOptionsData dmlEffectsRenderingMode(String dmlEffectsRenderingMode) {
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

  public WordMLSaveOptionsData zipOutput(Boolean zipOutput) {
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

  public WordMLSaveOptionsData updateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
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

  public WordMLSaveOptionsData updateSdtContent(Boolean updateSdtContent) {
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

  public WordMLSaveOptionsData updateFields(Boolean updateFields) {
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

  public WordMLSaveOptionsData prettyFormat(Boolean prettyFormat) {
    this.prettyFormat = prettyFormat;
    return this;
  }

   /**
   * Specifies whether or not use pretty formats output
   * @return prettyFormat
  **/
  @ApiModelProperty(value = "Specifies whether or not use pretty formats output")
  public Boolean isPrettyFormat() {
    return prettyFormat;
  }

  public void setPrettyFormat(Boolean prettyFormat) {
    this.prettyFormat = prettyFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordMLSaveOptionsData wordMLSaveOptionsData = (WordMLSaveOptionsData) o;
    return Objects.equals(this.colorMode, wordMLSaveOptionsData.colorMode) &&
        Objects.equals(this.saveFormat, wordMLSaveOptionsData.saveFormat) &&
        Objects.equals(this.fileName, wordMLSaveOptionsData.fileName) &&
        Objects.equals(this.dmlRenderingMode, wordMLSaveOptionsData.dmlRenderingMode) &&
        Objects.equals(this.dmlEffectsRenderingMode, wordMLSaveOptionsData.dmlEffectsRenderingMode) &&
        Objects.equals(this.zipOutput, wordMLSaveOptionsData.zipOutput) &&
        Objects.equals(this.updateLastSavedTimeProperty, wordMLSaveOptionsData.updateLastSavedTimeProperty) &&
        Objects.equals(this.updateSdtContent, wordMLSaveOptionsData.updateSdtContent) &&
        Objects.equals(this.updateFields, wordMLSaveOptionsData.updateFields) &&
        Objects.equals(this.prettyFormat, wordMLSaveOptionsData.prettyFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorMode, saveFormat, fileName, dmlRenderingMode, dmlEffectsRenderingMode, zipOutput, updateLastSavedTimeProperty, updateSdtContent, updateFields, prettyFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordMLSaveOptionsData {\n");
    
    sb.append("    colorMode: ").append(toIndentedString(colorMode)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    dmlRenderingMode: ").append(toIndentedString(dmlRenderingMode)).append("\n");
    sb.append("    dmlEffectsRenderingMode: ").append(toIndentedString(dmlEffectsRenderingMode)).append("\n");
    sb.append("    zipOutput: ").append(toIndentedString(zipOutput)).append("\n");
    sb.append("    updateLastSavedTimeProperty: ").append(toIndentedString(updateLastSavedTimeProperty)).append("\n");
    sb.append("    updateSdtContent: ").append(toIndentedString(updateSdtContent)).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
    sb.append("    prettyFormat: ").append(toIndentedString(prettyFormat)).append("\n");
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

