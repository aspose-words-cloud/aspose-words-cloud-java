/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FixedPageSaveOptionsData.java">
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
 * Contains common options that can be specified when saving a document into fixed page formats (PDF, XPS, images etc).
 */
@ApiModel(description = "Contains common options that can be specified when saving a document into fixed page formats (PDF, XPS, images etc).")
public abstract class FixedPageSaveOptionsData extends SaveOptionsData {
    /**
     * Gets or sets the value determining how colors are rendered.
     * { Normal | Grayscale}.
     */
    @JsonAdapter(ColorModeEnum.Adapter.class)
    public enum ColorModeEnum {
        NORMAL("Normal"),
        GRAYSCALE("Grayscale");

        private String value;

        ColorModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ColorModeEnum fromValue(String text) {
            for (ColorModeEnum b : ColorModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< ColorModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final ColorModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ColorModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ColorModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the symbol set, that is used to represent numbers while rendering to fixed page formats.
     */
    @JsonAdapter(NumeralFormatEnum.Adapter.class)
    public enum NumeralFormatEnum {
        EUROPEAN("European"),
        ARABICINDIC("ArabicIndic"),
        EASTERNARABICINDIC("EasternArabicIndic"),
        CONTEXT("Context"),
        SYSTEM("System");

        private String value;

        NumeralFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static NumeralFormatEnum fromValue(String text) {
            for (NumeralFormatEnum b : NumeralFormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< NumeralFormatEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final NumeralFormatEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public NumeralFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return NumeralFormatEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("ColorMode")
    protected ColorModeEnum colorMode;

    @SerializedName("JpegQuality")
    protected Integer jpegQuality;

    @SerializedName("MetafileRenderingOptions")
    protected MetafileRenderingOptionsData metafileRenderingOptions;

    @SerializedName("NumeralFormat")
    protected NumeralFormatEnum numeralFormat;

    @SerializedName("OptimizeOutput")
    protected Boolean optimizeOutput;

    @SerializedName("PageCount")
    protected Integer pageCount;

    @SerializedName("PageIndex")
    protected Integer pageIndex;
    /**
     * Gets or sets the value determining how colors are rendered.
     * { Normal | Grayscale}.
    * @return colorMode
    **/
    @ApiModelProperty(value = "Gets or sets the value determining how colors are rendered. { Normal | Grayscale}.")
    public ColorModeEnum getColorMode() {
        return colorMode;
    }

    public FixedPageSaveOptionsData colorMode(ColorModeEnum colorMode) {
        this.colorMode = colorMode;
        return this;
    }

    public void setColorMode(ColorModeEnum colorMode) {
        this.colorMode = colorMode;
    }


    /**
     * Gets or sets the quality of the JPEG images inside PDF document.
    * @return jpegQuality
    **/
    @ApiModelProperty(value = "Gets or sets the quality of the JPEG images inside PDF document.")
    public Integer getJpegQuality() {
        return jpegQuality;
    }

    public FixedPageSaveOptionsData jpegQuality(Integer jpegQuality) {
        this.jpegQuality = jpegQuality;
        return this;
    }

    public void setJpegQuality(Integer jpegQuality) {
        this.jpegQuality = jpegQuality;
    }


    /**
     * Gets or sets the metafile rendering options.
    * @return metafileRenderingOptions
    **/
    @ApiModelProperty(value = "Gets or sets the metafile rendering options.")
    public MetafileRenderingOptionsData getMetafileRenderingOptions() {
        return metafileRenderingOptions;
    }

    public FixedPageSaveOptionsData metafileRenderingOptions(MetafileRenderingOptionsData metafileRenderingOptions) {
        this.metafileRenderingOptions = metafileRenderingOptions;
        return this;
    }

    public void setMetafileRenderingOptions(MetafileRenderingOptionsData metafileRenderingOptions) {
        this.metafileRenderingOptions = metafileRenderingOptions;
    }


    /**
     * Gets or sets the symbol set, that is used to represent numbers while rendering to fixed page formats.
    * @return numeralFormat
    **/
    @ApiModelProperty(value = "Gets or sets the symbol set, that is used to represent numbers while rendering to fixed page formats.")
    public NumeralFormatEnum getNumeralFormat() {
        return numeralFormat;
    }

    public FixedPageSaveOptionsData numeralFormat(NumeralFormatEnum numeralFormat) {
        this.numeralFormat = numeralFormat;
        return this;
    }

    public void setNumeralFormat(NumeralFormatEnum numeralFormat) {
        this.numeralFormat = numeralFormat;
    }


    /**
     * Gets or sets a value indicating whether it is required to optimize output of XPS.
     * If this flag is set redundant nested canvases and empty canvases are removed, also neighbor glyphs with the same formatting are concatenated.
     * Note: The accuracy of the content display may be affected if this property is set to true.. The default value is false.
    * @return optimizeOutput
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether it is required to optimize output of XPS. If this flag is set redundant nested canvases and empty canvases are removed, also neighbor glyphs with the same formatting are concatenated. Note: The accuracy of the content display may be affected if this property is set to true.. The default value is false.")
    public Boolean getOptimizeOutput() {
        return optimizeOutput;
    }

    public FixedPageSaveOptionsData optimizeOutput(Boolean optimizeOutput) {
        this.optimizeOutput = optimizeOutput;
        return this;
    }

    public void setOptimizeOutput(Boolean optimizeOutput) {
        this.optimizeOutput = optimizeOutput;
    }


    /**
     * Gets or sets the number of pages to render.
    * @return pageCount
    **/
    @ApiModelProperty(value = "Gets or sets the number of pages to render.")
    public Integer getPageCount() {
        return pageCount;
    }

    public FixedPageSaveOptionsData pageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }


    /**
     * Gets or sets the 0-based index of the first page to render.
    * @return pageIndex
    **/
    @ApiModelProperty(value = "Gets or sets the 0-based index of the first page to render.")
    public Integer getPageIndex() {
        return pageIndex;
    }

    public FixedPageSaveOptionsData pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


    public FixedPageSaveOptionsData() {
        super();
        this.colorMode = null;
        this.jpegQuality = null;
        this.metafileRenderingOptions = null;
        this.numeralFormat = null;
        this.optimizeOutput = null;
        this.pageCount = null;
        this.pageIndex = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FixedPageSaveOptionsData fixedPageSaveOptionsData = (FixedPageSaveOptionsData) o;
        return
            Objects.equals(this.colorMode, fixedPageSaveOptionsData.colorMode) &&
            Objects.equals(this.jpegQuality, fixedPageSaveOptionsData.jpegQuality) &&
            Objects.equals(this.metafileRenderingOptions, fixedPageSaveOptionsData.metafileRenderingOptions) &&
            Objects.equals(this.numeralFormat, fixedPageSaveOptionsData.numeralFormat) &&
            Objects.equals(this.optimizeOutput, fixedPageSaveOptionsData.optimizeOutput) &&
            Objects.equals(this.pageCount, fixedPageSaveOptionsData.pageCount) &&
            Objects.equals(this.pageIndex, fixedPageSaveOptionsData.pageIndex) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorMode, jpegQuality, metafileRenderingOptions, numeralFormat, optimizeOutput, pageCount, pageIndex, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedPageSaveOptionsData {\n");
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
    sb.append("    colorMode: ").append(toIndentedString(getColorMode())).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(getJpegQuality())).append("\n");
    sb.append("    metafileRenderingOptions: ").append(toIndentedString(getMetafileRenderingOptions())).append("\n");
    sb.append("    numeralFormat: ").append(toIndentedString(getNumeralFormat())).append("\n");
    sb.append("    optimizeOutput: ").append(toIndentedString(getOptimizeOutput())).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(getPageCount())).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(getPageIndex())).append("\n");
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
