/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveOptionsData.java">
 *   Copyright (c) 2021 Aspose.Words for Cloud
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
 * base container class for save options data.
 */
@ApiModel(description = "base container class for save options data.")
public class SaveOptionsData {
    /**
     * Gets or sets the value determining how 3D effects are rendered.
     */
    @JsonAdapter(Dml3DEffectsRenderingModeEnum.Adapter.class)
    public enum Dml3DEffectsRenderingModeEnum {
        BASIC("Basic"),
        ADVANCED("Advanced");

        private String value;

        Dml3DEffectsRenderingModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static Dml3DEffectsRenderingModeEnum fromValue(String text) {
            for (Dml3DEffectsRenderingModeEnum b : Dml3DEffectsRenderingModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< Dml3DEffectsRenderingModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final Dml3DEffectsRenderingModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public Dml3DEffectsRenderingModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return Dml3DEffectsRenderingModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("AllowEmbeddingPostScriptFonts")
    private Boolean allowEmbeddingPostScriptFonts = null;

    @SerializedName("CustomTimeZoneInfoData")
    private TimeZoneInfoData customTimeZoneInfoData = null;

    @SerializedName("Dml3DEffectsRenderingMode")
    private Dml3DEffectsRenderingModeEnum dml3DEffectsRenderingMode = null;

    @SerializedName("DmlEffectsRenderingMode")
    private String dmlEffectsRenderingMode = null;

    @SerializedName("DmlRenderingMode")
    private String dmlRenderingMode = null;

    @SerializedName("FileName")
    private String fileName = null;

    @SerializedName("SaveFormat")
    private String saveFormat = null;

    @SerializedName("UpdateCreatedTimeProperty")
    private Boolean updateCreatedTimeProperty = null;

    @SerializedName("UpdateFields")
    private Boolean updateFields = null;

    @SerializedName("UpdateLastPrintedProperty")
    private Boolean updateLastPrintedProperty = null;

    @SerializedName("UpdateLastSavedTimeProperty")
    private Boolean updateLastSavedTimeProperty = null;

    @SerializedName("UpdateSdtContent")
    private Boolean updateSdtContent = null;

    @SerializedName("ZipOutput")
    private Boolean zipOutput = null;
    public SaveOptionsData allowEmbeddingPostScriptFonts(Boolean allowEmbeddingPostScriptFonts) {
        this.allowEmbeddingPostScriptFonts = allowEmbeddingPostScriptFonts;
        return this;
    }

    /**
     * Gets or sets a boolean value indicating whether to allow embedding fonts with PostScript outlines when embedding TrueType fonts in a document upon it is saved. The default value is false..
    * @return allowEmbeddingPostScriptFonts
    **/
    @ApiModelProperty(value = "Gets or sets a boolean value indicating whether to allow embedding fonts with PostScript outlines when embedding TrueType fonts in a document upon it is saved. The default value is false..")
    public Boolean getAllowEmbeddingPostScriptFonts() {
        return allowEmbeddingPostScriptFonts;
    }

    public void setAllowEmbeddingPostScriptFonts(Boolean allowEmbeddingPostScriptFonts) {
        this.allowEmbeddingPostScriptFonts = allowEmbeddingPostScriptFonts;
    }

    public SaveOptionsData customTimeZoneInfoData(TimeZoneInfoData customTimeZoneInfoData) {
        this.customTimeZoneInfoData = customTimeZoneInfoData;
        return this;
    }

    /**
     * Gets or sets CustomTimeZoneInfo.
    * @return customTimeZoneInfoData
    **/
    @ApiModelProperty(value = "Gets or sets CustomTimeZoneInfo.")
    public TimeZoneInfoData getCustomTimeZoneInfoData() {
        return customTimeZoneInfoData;
    }

    public void setCustomTimeZoneInfoData(TimeZoneInfoData customTimeZoneInfoData) {
        this.customTimeZoneInfoData = customTimeZoneInfoData;
    }

    public SaveOptionsData dml3DEffectsRenderingMode(Dml3DEffectsRenderingModeEnum dml3DEffectsRenderingMode) {
        this.dml3DEffectsRenderingMode = dml3DEffectsRenderingMode;
        return this;
    }

    /**
     * Gets or sets the value determining how 3D effects are rendered.
    * @return dml3DEffectsRenderingMode
    **/
    @ApiModelProperty(value = "Gets or sets the value determining how 3D effects are rendered.")
    public Dml3DEffectsRenderingModeEnum getDml3DEffectsRenderingMode() {
        return dml3DEffectsRenderingMode;
    }

    public void setDml3DEffectsRenderingMode(Dml3DEffectsRenderingModeEnum dml3DEffectsRenderingMode) {
        this.dml3DEffectsRenderingMode = dml3DEffectsRenderingMode;
    }

    public SaveOptionsData dmlEffectsRenderingMode(String dmlEffectsRenderingMode) {
        this.dmlEffectsRenderingMode = dmlEffectsRenderingMode;
        return this;
    }

    /**
     * Gets or sets the value determining how DrawingML effects are rendered.
     * { Simplified | None | Fine }.
    * @return dmlEffectsRenderingMode
    **/
    @ApiModelProperty(value = "Gets or sets the value determining how DrawingML effects are rendered. { Simplified | None | Fine }.")
    public String getDmlEffectsRenderingMode() {
        return dmlEffectsRenderingMode;
    }

    public void setDmlEffectsRenderingMode(String dmlEffectsRenderingMode) {
        this.dmlEffectsRenderingMode = dmlEffectsRenderingMode;
    }

    public SaveOptionsData dmlRenderingMode(String dmlRenderingMode) {
        this.dmlRenderingMode = dmlRenderingMode;
        return this;
    }

    /**
     * Gets or sets the option that controls how DrawingML shapes are rendered.
    * @return dmlRenderingMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how DrawingML shapes are rendered.")
    public String getDmlRenderingMode() {
        return dmlRenderingMode;
    }

    public void setDmlRenderingMode(String dmlRenderingMode) {
        this.dmlRenderingMode = dmlRenderingMode;
    }

    public SaveOptionsData fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Gets or sets the name of destination file.
    * @return fileName
    **/
    @ApiModelProperty(value = "Gets or sets the name of destination file.")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public SaveOptionsData saveFormat(String saveFormat) {
        this.saveFormat = saveFormat;
        return this;
    }

    /**
     * Gets or sets the format of save.
    * @return saveFormat
    **/
    @ApiModelProperty(value = "Gets or sets the format of save.")
    public String getSaveFormat() {
        return saveFormat;
    }

    public void setSaveFormat(String saveFormat) {
        this.saveFormat = saveFormat;
    }

    public SaveOptionsData updateCreatedTimeProperty(Boolean updateCreatedTimeProperty) {
        this.updateCreatedTimeProperty = updateCreatedTimeProperty;
        return this;
    }

    /**
     * Gets or sets a value determining whether the Aspose.Words.Properties.BuiltInDocumentProperties.CreatedTime property is updated before saving.
     * Default value is false.
    * @return updateCreatedTimeProperty
    **/
    @ApiModelProperty(value = "Gets or sets a value determining whether the Aspose.Words.Properties.BuiltInDocumentProperties.CreatedTime property is updated before saving. Default value is false.")
    public Boolean getUpdateCreatedTimeProperty() {
        return updateCreatedTimeProperty;
    }

    public void setUpdateCreatedTimeProperty(Boolean updateCreatedTimeProperty) {
        this.updateCreatedTimeProperty = updateCreatedTimeProperty;
    }

    public SaveOptionsData updateFields(Boolean updateFields) {
        this.updateFields = updateFields;
        return this;
    }

    /**
     * Gets or sets a value indicating whether fields should be updated before saving the document to a fixed page format. The default value is true.
    * @return updateFields
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether fields should be updated before saving the document to a fixed page format. The default value is true.")
    public Boolean getUpdateFields() {
        return updateFields;
    }

    public void setUpdateFields(Boolean updateFields) {
        this.updateFields = updateFields;
    }

    public SaveOptionsData updateLastPrintedProperty(Boolean updateLastPrintedProperty) {
        this.updateLastPrintedProperty = updateLastPrintedProperty;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the Aspose.Words.Properties.BuiltInDocumentProperties.LastPrinted property is updated before saving.
    * @return updateLastPrintedProperty
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the Aspose.Words.Properties.BuiltInDocumentProperties.LastPrinted property is updated before saving.")
    public Boolean getUpdateLastPrintedProperty() {
        return updateLastPrintedProperty;
    }

    public void setUpdateLastPrintedProperty(Boolean updateLastPrintedProperty) {
        this.updateLastPrintedProperty = updateLastPrintedProperty;
    }

    public SaveOptionsData updateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
        this.updateLastSavedTimeProperty = updateLastSavedTimeProperty;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the Aspose.Words.Properties.BuiltInDocumentProperties.LastSavedTime property is updated before saving.
    * @return updateLastSavedTimeProperty
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the Aspose.Words.Properties.BuiltInDocumentProperties.LastSavedTime property is updated before saving.")
    public Boolean getUpdateLastSavedTimeProperty() {
        return updateLastSavedTimeProperty;
    }

    public void setUpdateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
        this.updateLastSavedTimeProperty = updateLastSavedTimeProperty;
    }

    public SaveOptionsData updateSdtContent(Boolean updateSdtContent) {
        this.updateSdtContent = updateSdtContent;
        return this;
    }

    /**
     * Gets or sets a value indicating whether content of StructuredDocumentTag is updated before saving.
    * @return updateSdtContent
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether content of StructuredDocumentTag is updated before saving.")
    public Boolean getUpdateSdtContent() {
        return updateSdtContent;
    }

    public void setUpdateSdtContent(Boolean updateSdtContent) {
        this.updateSdtContent = updateSdtContent;
    }

    public SaveOptionsData zipOutput(Boolean zipOutput) {
        this.zipOutput = zipOutput;
        return this;
    }

    /**
     * Gets or sets a value indicating whether to zip output or not.
     * The default value is false.
    * @return zipOutput
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to zip output or not. The default value is false.")
    public Boolean getZipOutput() {
        return zipOutput;
    }

    public void setZipOutput(Boolean zipOutput) {
        this.zipOutput = zipOutput;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SaveOptionsData saveOptionsData = (SaveOptionsData) o;
        return
            Objects.equals(this.allowEmbeddingPostScriptFonts, saveOptionsData.allowEmbeddingPostScriptFonts) &&
            Objects.equals(this.customTimeZoneInfoData, saveOptionsData.customTimeZoneInfoData) &&
            Objects.equals(this.dml3DEffectsRenderingMode, saveOptionsData.dml3DEffectsRenderingMode) &&
            Objects.equals(this.dmlEffectsRenderingMode, saveOptionsData.dmlEffectsRenderingMode) &&
            Objects.equals(this.dmlRenderingMode, saveOptionsData.dmlRenderingMode) &&
            Objects.equals(this.fileName, saveOptionsData.fileName) &&
            Objects.equals(this.saveFormat, saveOptionsData.saveFormat) &&
            Objects.equals(this.updateCreatedTimeProperty, saveOptionsData.updateCreatedTimeProperty) &&
            Objects.equals(this.updateFields, saveOptionsData.updateFields) &&
            Objects.equals(this.updateLastPrintedProperty, saveOptionsData.updateLastPrintedProperty) &&
            Objects.equals(this.updateLastSavedTimeProperty, saveOptionsData.updateLastSavedTimeProperty) &&
            Objects.equals(this.updateSdtContent, saveOptionsData.updateSdtContent) &&
            Objects.equals(this.zipOutput, saveOptionsData.zipOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmbeddingPostScriptFonts, customTimeZoneInfoData, dml3DEffectsRenderingMode, dmlEffectsRenderingMode, dmlRenderingMode, fileName, saveFormat, updateCreatedTimeProperty, updateFields, updateLastPrintedProperty, updateLastSavedTimeProperty, updateSdtContent, zipOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveOptionsData {\n");
    sb.append("    allowEmbeddingPostScriptFonts: ").append(toIndentedString(allowEmbeddingPostScriptFonts)).append("\n");
    sb.append("    customTimeZoneInfoData: ").append(toIndentedString(customTimeZoneInfoData)).append("\n");
    sb.append("    dml3DEffectsRenderingMode: ").append(toIndentedString(dml3DEffectsRenderingMode)).append("\n");
    sb.append("    dmlEffectsRenderingMode: ").append(toIndentedString(dmlEffectsRenderingMode)).append("\n");
    sb.append("    dmlRenderingMode: ").append(toIndentedString(dmlRenderingMode)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    updateCreatedTimeProperty: ").append(toIndentedString(updateCreatedTimeProperty)).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
    sb.append("    updateLastPrintedProperty: ").append(toIndentedString(updateLastPrintedProperty)).append("\n");
    sb.append("    updateLastSavedTimeProperty: ").append(toIndentedString(updateLastSavedTimeProperty)).append("\n");
    sb.append("    updateSdtContent: ").append(toIndentedString(updateSdtContent)).append("\n");
    sb.append("    zipOutput: ").append(toIndentedString(zipOutput)).append("\n");
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
