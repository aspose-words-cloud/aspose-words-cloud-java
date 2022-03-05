/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveOptionsData.java">
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
 * base container class for save options data.
 */
@ApiModel(description = "base container class for save options data.")
public abstract class SaveOptionsData {
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

    /**
     * Gets or sets the value determining how DrawingML effects are rendered.
     * { Simplified | None | Fine }.
     */
    @JsonAdapter(DmlEffectsRenderingModeEnum.Adapter.class)
    public enum DmlEffectsRenderingModeEnum {
        SIMPLIFIED("Simplified"),
        NONE("None"),
        FINE("Fine");

        private String value;

        DmlEffectsRenderingModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DmlEffectsRenderingModeEnum fromValue(String text) {
            for (DmlEffectsRenderingModeEnum b : DmlEffectsRenderingModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< DmlEffectsRenderingModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final DmlEffectsRenderingModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DmlEffectsRenderingModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DmlEffectsRenderingModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls how DrawingML shapes are rendered.
     */
    @JsonAdapter(DmlRenderingModeEnum.Adapter.class)
    public enum DmlRenderingModeEnum {
        FALLBACK("Fallback"),
        DRAWINGML("DrawingML");

        private String value;

        DmlRenderingModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DmlRenderingModeEnum fromValue(String text) {
            for (DmlRenderingModeEnum b : DmlRenderingModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< DmlRenderingModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final DmlRenderingModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DmlRenderingModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DmlRenderingModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the value determining how ink (InkML) objects are rendered.
     */
    @JsonAdapter(ImlRenderingModeEnum.Adapter.class)
    public enum ImlRenderingModeEnum {
        FALLBACK("Fallback"),
        INKML("InkML");

        private String value;

        ImlRenderingModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ImlRenderingModeEnum fromValue(String text) {
            for (ImlRenderingModeEnum b : ImlRenderingModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< ImlRenderingModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final ImlRenderingModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ImlRenderingModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ImlRenderingModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("AllowEmbeddingPostScriptFonts")
    protected Boolean allowEmbeddingPostScriptFonts;

    @SerializedName("CustomTimeZoneInfoData")
    protected TimeZoneInfoData customTimeZoneInfoData;

    @SerializedName("Dml3DEffectsRenderingMode")
    protected Dml3DEffectsRenderingModeEnum dml3DEffectsRenderingMode;

    @SerializedName("DmlEffectsRenderingMode")
    protected DmlEffectsRenderingModeEnum dmlEffectsRenderingMode;

    @SerializedName("DmlRenderingMode")
    protected DmlRenderingModeEnum dmlRenderingMode;

    @SerializedName("FileName")
    protected String fileName;

    @SerializedName("FlatOpcXmlMappingOnly")
    protected Boolean flatOpcXmlMappingOnly;

    @SerializedName("ImlRenderingMode")
    protected ImlRenderingModeEnum imlRenderingMode;

    @SerializedName("SaveFormat")
    protected String saveFormat;

    @SerializedName("UpdateCreatedTimeProperty")
    protected Boolean updateCreatedTimeProperty;

    @SerializedName("UpdateFields")
    protected Boolean updateFields;

    @SerializedName("UpdateLastPrintedProperty")
    protected Boolean updateLastPrintedProperty;

    @SerializedName("UpdateLastSavedTimeProperty")
    protected Boolean updateLastSavedTimeProperty;

    @SerializedName("UpdateSdtContent")
    protected Boolean updateSdtContent;

    @SerializedName("ZipOutput")
    protected Boolean zipOutput;
    /**
     * Gets or sets a boolean value indicating whether to allow embedding fonts with PostScript outlines when embedding TrueType fonts in a document upon it is saved. The default value is false..
    * @return allowEmbeddingPostScriptFonts
    **/
    @ApiModelProperty(value = "Gets or sets a boolean value indicating whether to allow embedding fonts with PostScript outlines when embedding TrueType fonts in a document upon it is saved. The default value is false..")
    public Boolean getAllowEmbeddingPostScriptFonts() {
        return allowEmbeddingPostScriptFonts;
    }

    public SaveOptionsData allowEmbeddingPostScriptFonts(Boolean allowEmbeddingPostScriptFonts) {
        this.allowEmbeddingPostScriptFonts = allowEmbeddingPostScriptFonts;
        return this;
    }

    public void setAllowEmbeddingPostScriptFonts(Boolean allowEmbeddingPostScriptFonts) {
        this.allowEmbeddingPostScriptFonts = allowEmbeddingPostScriptFonts;
    }


    /**
     * Gets or sets CustomTimeZoneInfo.
    * @return customTimeZoneInfoData
    **/
    @ApiModelProperty(value = "Gets or sets CustomTimeZoneInfo.")
    public TimeZoneInfoData getCustomTimeZoneInfoData() {
        return customTimeZoneInfoData;
    }

    public SaveOptionsData customTimeZoneInfoData(TimeZoneInfoData customTimeZoneInfoData) {
        this.customTimeZoneInfoData = customTimeZoneInfoData;
        return this;
    }

    public void setCustomTimeZoneInfoData(TimeZoneInfoData customTimeZoneInfoData) {
        this.customTimeZoneInfoData = customTimeZoneInfoData;
    }


    /**
     * Gets or sets the value determining how 3D effects are rendered.
    * @return dml3DEffectsRenderingMode
    **/
    @ApiModelProperty(value = "Gets or sets the value determining how 3D effects are rendered.")
    public Dml3DEffectsRenderingModeEnum getDml3DEffectsRenderingMode() {
        return dml3DEffectsRenderingMode;
    }

    public SaveOptionsData dml3DEffectsRenderingMode(Dml3DEffectsRenderingModeEnum dml3DEffectsRenderingMode) {
        this.dml3DEffectsRenderingMode = dml3DEffectsRenderingMode;
        return this;
    }

    public void setDml3DEffectsRenderingMode(Dml3DEffectsRenderingModeEnum dml3DEffectsRenderingMode) {
        this.dml3DEffectsRenderingMode = dml3DEffectsRenderingMode;
    }


    /**
     * Gets or sets the value determining how DrawingML effects are rendered.
     * { Simplified | None | Fine }.
    * @return dmlEffectsRenderingMode
    **/
    @ApiModelProperty(value = "Gets or sets the value determining how DrawingML effects are rendered. { Simplified | None | Fine }.")
    public DmlEffectsRenderingModeEnum getDmlEffectsRenderingMode() {
        return dmlEffectsRenderingMode;
    }

    public SaveOptionsData dmlEffectsRenderingMode(DmlEffectsRenderingModeEnum dmlEffectsRenderingMode) {
        this.dmlEffectsRenderingMode = dmlEffectsRenderingMode;
        return this;
    }

    public void setDmlEffectsRenderingMode(DmlEffectsRenderingModeEnum dmlEffectsRenderingMode) {
        this.dmlEffectsRenderingMode = dmlEffectsRenderingMode;
    }


    /**
     * Gets or sets the option that controls how DrawingML shapes are rendered.
    * @return dmlRenderingMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how DrawingML shapes are rendered.")
    public DmlRenderingModeEnum getDmlRenderingMode() {
        return dmlRenderingMode;
    }

    public SaveOptionsData dmlRenderingMode(DmlRenderingModeEnum dmlRenderingMode) {
        this.dmlRenderingMode = dmlRenderingMode;
        return this;
    }

    public void setDmlRenderingMode(DmlRenderingModeEnum dmlRenderingMode) {
        this.dmlRenderingMode = dmlRenderingMode;
    }


    /**
     * Gets or sets the name of destination file.
    * @return fileName
    **/
    @ApiModelProperty(value = "Gets or sets the name of destination file.")
    public String getFileName() {
        return fileName;
    }

    public SaveOptionsData fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets or sets value determining which document formats are allowed to be mapped by Aspose.Words.Markup.StructuredDocumentTag.XmlMapping.
     * By default only Aspose.Words.LoadFormat.FlatOpc document format is allowed to be mapped.
    * @return flatOpcXmlMappingOnly
    **/
    @ApiModelProperty(value = "Gets or sets value determining which document formats are allowed to be mapped by Aspose.Words.Markup.StructuredDocumentTag.XmlMapping. By default only Aspose.Words.LoadFormat.FlatOpc document format is allowed to be mapped.")
    public Boolean getFlatOpcXmlMappingOnly() {
        return flatOpcXmlMappingOnly;
    }

    public SaveOptionsData flatOpcXmlMappingOnly(Boolean flatOpcXmlMappingOnly) {
        this.flatOpcXmlMappingOnly = flatOpcXmlMappingOnly;
        return this;
    }

    public void setFlatOpcXmlMappingOnly(Boolean flatOpcXmlMappingOnly) {
        this.flatOpcXmlMappingOnly = flatOpcXmlMappingOnly;
    }


    /**
     * Gets or sets the value determining how ink (InkML) objects are rendered.
    * @return imlRenderingMode
    **/
    @ApiModelProperty(value = "Gets or sets the value determining how ink (InkML) objects are rendered.")
    public ImlRenderingModeEnum getImlRenderingMode() {
        return imlRenderingMode;
    }

    public SaveOptionsData imlRenderingMode(ImlRenderingModeEnum imlRenderingMode) {
        this.imlRenderingMode = imlRenderingMode;
        return this;
    }

    public void setImlRenderingMode(ImlRenderingModeEnum imlRenderingMode) {
        this.imlRenderingMode = imlRenderingMode;
    }


    /**
     * Gets the format of save.
    * @return saveFormat
    **/
    @ApiModelProperty(value = "Gets the format of save.")
    public String getSaveFormat() {
        return saveFormat;
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

    public SaveOptionsData updateCreatedTimeProperty(Boolean updateCreatedTimeProperty) {
        this.updateCreatedTimeProperty = updateCreatedTimeProperty;
        return this;
    }

    public void setUpdateCreatedTimeProperty(Boolean updateCreatedTimeProperty) {
        this.updateCreatedTimeProperty = updateCreatedTimeProperty;
    }


    /**
     * Gets or sets a value indicating whether fields should be updated before saving the document to a fixed page format. The default value is true.
    * @return updateFields
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether fields should be updated before saving the document to a fixed page format. The default value is true.")
    public Boolean getUpdateFields() {
        return updateFields;
    }

    public SaveOptionsData updateFields(Boolean updateFields) {
        this.updateFields = updateFields;
        return this;
    }

    public void setUpdateFields(Boolean updateFields) {
        this.updateFields = updateFields;
    }


    /**
     * Gets or sets a value indicating whether the Aspose.Words.Properties.BuiltInDocumentProperties.LastPrinted property is updated before saving.
    * @return updateLastPrintedProperty
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the Aspose.Words.Properties.BuiltInDocumentProperties.LastPrinted property is updated before saving.")
    public Boolean getUpdateLastPrintedProperty() {
        return updateLastPrintedProperty;
    }

    public SaveOptionsData updateLastPrintedProperty(Boolean updateLastPrintedProperty) {
        this.updateLastPrintedProperty = updateLastPrintedProperty;
        return this;
    }

    public void setUpdateLastPrintedProperty(Boolean updateLastPrintedProperty) {
        this.updateLastPrintedProperty = updateLastPrintedProperty;
    }


    /**
     * Gets or sets a value indicating whether the Aspose.Words.Properties.BuiltInDocumentProperties.LastSavedTime property is updated before saving.
    * @return updateLastSavedTimeProperty
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the Aspose.Words.Properties.BuiltInDocumentProperties.LastSavedTime property is updated before saving.")
    public Boolean getUpdateLastSavedTimeProperty() {
        return updateLastSavedTimeProperty;
    }

    public SaveOptionsData updateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
        this.updateLastSavedTimeProperty = updateLastSavedTimeProperty;
        return this;
    }

    public void setUpdateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
        this.updateLastSavedTimeProperty = updateLastSavedTimeProperty;
    }


    /**
     * Gets or sets a value indicating whether content of StructuredDocumentTag is updated before saving.
    * @return updateSdtContent
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether content of StructuredDocumentTag is updated before saving.")
    public Boolean getUpdateSdtContent() {
        return updateSdtContent;
    }

    public SaveOptionsData updateSdtContent(Boolean updateSdtContent) {
        this.updateSdtContent = updateSdtContent;
        return this;
    }

    public void setUpdateSdtContent(Boolean updateSdtContent) {
        this.updateSdtContent = updateSdtContent;
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

    public SaveOptionsData zipOutput(Boolean zipOutput) {
        this.zipOutput = zipOutput;
        return this;
    }

    public void setZipOutput(Boolean zipOutput) {
        this.zipOutput = zipOutput;
    }


    public SaveOptionsData() {
        this.allowEmbeddingPostScriptFonts = null;
        this.customTimeZoneInfoData = null;
        this.dml3DEffectsRenderingMode = null;
        this.dmlEffectsRenderingMode = null;
        this.dmlRenderingMode = null;
        this.fileName = null;
        this.flatOpcXmlMappingOnly = null;
        this.imlRenderingMode = null;
        this.saveFormat = null;
        this.updateCreatedTimeProperty = null;
        this.updateFields = null;
        this.updateLastPrintedProperty = null;
        this.updateLastSavedTimeProperty = null;
        this.updateSdtContent = null;
        this.zipOutput = null;
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
            Objects.equals(this.flatOpcXmlMappingOnly, saveOptionsData.flatOpcXmlMappingOnly) &&
            Objects.equals(this.imlRenderingMode, saveOptionsData.imlRenderingMode) &&
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
    return Objects.hash(allowEmbeddingPostScriptFonts, customTimeZoneInfoData, dml3DEffectsRenderingMode, dmlEffectsRenderingMode, dmlRenderingMode, fileName, flatOpcXmlMappingOnly, imlRenderingMode, saveFormat, updateCreatedTimeProperty, updateFields, updateLastPrintedProperty, updateLastSavedTimeProperty, updateSdtContent, zipOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveOptionsData {\n");
    sb.append("    allowEmbeddingPostScriptFonts: ").append(toIndentedString(getAllowEmbeddingPostScriptFonts())).append("\n");
    sb.append("    customTimeZoneInfoData: ").append(toIndentedString(getCustomTimeZoneInfoData())).append("\n");
    sb.append("    dml3DEffectsRenderingMode: ").append(toIndentedString(getDml3DEffectsRenderingMode())).append("\n");
    sb.append("    dmlEffectsRenderingMode: ").append(toIndentedString(getDmlEffectsRenderingMode())).append("\n");
    sb.append("    dmlRenderingMode: ").append(toIndentedString(getDmlRenderingMode())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(getFileName())).append("\n");
    sb.append("    flatOpcXmlMappingOnly: ").append(toIndentedString(getFlatOpcXmlMappingOnly())).append("\n");
    sb.append("    imlRenderingMode: ").append(toIndentedString(getImlRenderingMode())).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
    sb.append("    updateCreatedTimeProperty: ").append(toIndentedString(getUpdateCreatedTimeProperty())).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(getUpdateFields())).append("\n");
    sb.append("    updateLastPrintedProperty: ").append(toIndentedString(getUpdateLastPrintedProperty())).append("\n");
    sb.append("    updateLastSavedTimeProperty: ").append(toIndentedString(getUpdateLastSavedTimeProperty())).append("\n");
    sb.append("    updateSdtContent: ").append(toIndentedString(getUpdateSdtContent())).append("\n");
    sb.append("    zipOutput: ").append(toIndentedString(getZipOutput())).append("\n");
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
