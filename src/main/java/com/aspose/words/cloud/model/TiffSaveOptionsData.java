/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TiffSaveOptionsData.java">
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
 * Container class for tiff save options.
 */
@ApiModel(description = "Container class for tiff save options.")
public class TiffSaveOptionsData extends ImageSaveOptionsData {
    /**
     * Gets or sets the method used while converting images to 1 bpp format.
     */
    @JsonAdapter(TiffBinarizationMethodEnum.Adapter.class)
    public enum TiffBinarizationMethodEnum {
        THRESHOLD("Threshold"),
        FLOYDSTEINBERGDITHERING("FloydSteinbergDithering");

        private String value;

        TiffBinarizationMethodEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TiffBinarizationMethodEnum fromValue(String text) {
            for (TiffBinarizationMethodEnum b : TiffBinarizationMethodEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TiffBinarizationMethodEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TiffBinarizationMethodEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TiffBinarizationMethodEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TiffBinarizationMethodEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the type of compression.
     */
    @JsonAdapter(TiffCompressionEnum.Adapter.class)
    public enum TiffCompressionEnum {
        NONE("None"),
        RLE("Rle"),
        LZW("Lzw"),
        CCITT3("Ccitt3"),
        CCITT4("Ccitt4");

        private String value;

        TiffCompressionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TiffCompressionEnum fromValue(String text) {
            for (TiffCompressionEnum b : TiffCompressionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TiffCompressionEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TiffCompressionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TiffCompressionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TiffCompressionEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("ThresholdForFloydSteinbergDithering")
    protected Integer thresholdForFloydSteinbergDithering;

    @SerializedName("TiffBinarizationMethod")
    protected TiffBinarizationMethodEnum tiffBinarizationMethod;

    @SerializedName("TiffCompression")
    protected TiffCompressionEnum tiffCompression;
    /**
     * Gets or sets the threshold that determines the value of the binarization error in the Floyd-Steinberg method. when ImageBinarizationMethod is ImageBinarizationMethod.FloydSteinbergDithering.
     * Default value is 128.
    * @return thresholdForFloydSteinbergDithering
    **/
    @ApiModelProperty(value = "Gets or sets the threshold that determines the value of the binarization error in the Floyd-Steinberg method. when ImageBinarizationMethod is ImageBinarizationMethod.FloydSteinbergDithering. Default value is 128.")
    public Integer getThresholdForFloydSteinbergDithering() {
        return thresholdForFloydSteinbergDithering;
    }

    public TiffSaveOptionsData thresholdForFloydSteinbergDithering(Integer thresholdForFloydSteinbergDithering) {
        this.thresholdForFloydSteinbergDithering = thresholdForFloydSteinbergDithering;
        return this;
    }

    public void setThresholdForFloydSteinbergDithering(Integer thresholdForFloydSteinbergDithering) {
        this.thresholdForFloydSteinbergDithering = thresholdForFloydSteinbergDithering;
    }


    /**
     * Gets or sets the method used while converting images to 1 bpp format.
    * @return tiffBinarizationMethod
    **/
    @ApiModelProperty(value = "Gets or sets the method used while converting images to 1 bpp format.")
    public TiffBinarizationMethodEnum getTiffBinarizationMethod() {
        return tiffBinarizationMethod;
    }

    public TiffSaveOptionsData tiffBinarizationMethod(TiffBinarizationMethodEnum tiffBinarizationMethod) {
        this.tiffBinarizationMethod = tiffBinarizationMethod;
        return this;
    }

    public void setTiffBinarizationMethod(TiffBinarizationMethodEnum tiffBinarizationMethod) {
        this.tiffBinarizationMethod = tiffBinarizationMethod;
    }


    /**
     * Gets or sets the type of compression.
    * @return tiffCompression
    **/
    @ApiModelProperty(value = "Gets or sets the type of compression.")
    public TiffCompressionEnum getTiffCompression() {
        return tiffCompression;
    }

    public TiffSaveOptionsData tiffCompression(TiffCompressionEnum tiffCompression) {
        this.tiffCompression = tiffCompression;
        return this;
    }

    public void setTiffCompression(TiffCompressionEnum tiffCompression) {
        this.tiffCompression = tiffCompression;
    }


    public TiffSaveOptionsData() {
        super();
        this.saveFormat = "tiff";
        this.thresholdForFloydSteinbergDithering = null;
        this.tiffBinarizationMethod = null;
        this.tiffCompression = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TiffSaveOptionsData tiffSaveOptionsData = (TiffSaveOptionsData) o;
        return
            Objects.equals(this.thresholdForFloydSteinbergDithering, tiffSaveOptionsData.thresholdForFloydSteinbergDithering) &&
            Objects.equals(this.tiffBinarizationMethod, tiffSaveOptionsData.tiffBinarizationMethod) &&
            Objects.equals(this.tiffCompression, tiffSaveOptionsData.tiffCompression) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thresholdForFloydSteinbergDithering, tiffBinarizationMethod, tiffCompression, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffSaveOptionsData {\n");
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
    sb.append("    colorMode: ").append(toIndentedString(getColorMode())).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(getJpegQuality())).append("\n");
    sb.append("    metafileRenderingOptions: ").append(toIndentedString(getMetafileRenderingOptions())).append("\n");
    sb.append("    numeralFormat: ").append(toIndentedString(getNumeralFormat())).append("\n");
    sb.append("    optimizeOutput: ").append(toIndentedString(getOptimizeOutput())).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(getPageCount())).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(getPageIndex())).append("\n");
    sb.append("    horizontalResolution: ").append(toIndentedString(getHorizontalResolution())).append("\n");
    sb.append("    imageBrightness: ").append(toIndentedString(getImageBrightness())).append("\n");
    sb.append("    imageColorMode: ").append(toIndentedString(getImageColorMode())).append("\n");
    sb.append("    imageContrast: ").append(toIndentedString(getImageContrast())).append("\n");
    sb.append("    paperColor: ").append(toIndentedString(getPaperColor())).append("\n");
    sb.append("    pixelFormat: ").append(toIndentedString(getPixelFormat())).append("\n");
    sb.append("    resolution: ").append(toIndentedString(getResolution())).append("\n");
    sb.append("    scale: ").append(toIndentedString(getScale())).append("\n");
    sb.append("    useAntiAliasing: ").append(toIndentedString(getUseAntiAliasing())).append("\n");
    sb.append("    useGdiEmfRenderer: ").append(toIndentedString(getUseGdiEmfRenderer())).append("\n");
    sb.append("    useHighQualityRendering: ").append(toIndentedString(getUseHighQualityRendering())).append("\n");
    sb.append("    verticalResolution: ").append(toIndentedString(getVerticalResolution())).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
    sb.append("    thresholdForFloydSteinbergDithering: ").append(toIndentedString(getThresholdForFloydSteinbergDithering())).append("\n");
    sb.append("    tiffBinarizationMethod: ").append(toIndentedString(getTiffBinarizationMethod())).append("\n");
    sb.append("    tiffCompression: ").append(toIndentedString(getTiffCompression())).append("\n");
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
