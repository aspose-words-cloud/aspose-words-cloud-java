/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImageSaveOptionsData.java">
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
 * Container abstract class for image save options.
 */
@ApiModel(description = "Container abstract class for image save options.")
public abstract class ImageSaveOptionsData extends FixedPageSaveOptionsData {
    /**
     * Gets or sets the color mode of the image.
     */
    @JsonAdapter(ImageColorModeEnum.Adapter.class)
    public enum ImageColorModeEnum {
        NONE("None"),
        GRAYSCALE("Grayscale"),
        BLACKANDWHITE("BlackAndWhite");

        private String value;

        ImageColorModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ImageColorModeEnum fromValue(String text) {
            for (ImageColorModeEnum b : ImageColorModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< ImageColorModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final ImageColorModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ImageColorModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ImageColorModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the pixel format of the image.
     */
    @JsonAdapter(PixelFormatEnum.Adapter.class)
    public enum PixelFormatEnum {
        FORMAT16BPPRGB555("Format16BppRgb555"),
        FORMAT16BPPRGB565("Format16BppRgb565"),
        FORMAT16BPPARGB1555("Format16BppArgb1555"),
        FORMAT24BPPRGB("Format24BppRgb"),
        FORMAT32BPPRGB("Format32BppRgb"),
        FORMAT32BPPARGB("Format32BppArgb"),
        FORMAT32BPPPARGB("Format32BppPArgb"),
        FORMAT48BPPRGB("Format48BppRgb"),
        FORMAT64BPPARGB("Format64BppArgb"),
        FORMAT64BPPPARGB("Format64BppPArgb"),
        FORMAT1BPPINDEXED("Format1bppIndexed");

        private String value;

        PixelFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PixelFormatEnum fromValue(String text) {
            for (PixelFormatEnum b : PixelFormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< PixelFormatEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final PixelFormatEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PixelFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PixelFormatEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("HorizontalResolution")
    protected Double horizontalResolution;

    @SerializedName("ImageBrightness")
    protected Double imageBrightness;

    @SerializedName("ImageColorMode")
    protected ImageColorModeEnum imageColorMode;

    @SerializedName("ImageContrast")
    protected Double imageContrast;

    @SerializedName("PaperColor")
    protected String paperColor;

    @SerializedName("PixelFormat")
    protected PixelFormatEnum pixelFormat;

    @SerializedName("Resolution")
    protected Double resolution;

    @SerializedName("Scale")
    protected Double scale;

    @SerializedName("UseAntiAliasing")
    protected Boolean useAntiAliasing;

    @SerializedName("UseGdiEmfRenderer")
    protected Boolean useGdiEmfRenderer;

    @SerializedName("UseHighQualityRendering")
    protected Boolean useHighQualityRendering;

    @SerializedName("VerticalResolution")
    protected Double verticalResolution;
    /**
     * Gets or sets the horizontal resolution in dots per inch for the generated images.
     * This property has effect only when saving to raster image formats.
     * The default value is 96.
    * @return horizontalResolution
    **/
    @ApiModelProperty(value = "Gets or sets the horizontal resolution in dots per inch for the generated images. This property has effect only when saving to raster image formats. The default value is 96.")
    public Double getHorizontalResolution() {
        return horizontalResolution;
    }

    public ImageSaveOptionsData horizontalResolution(Double horizontalResolution) {
        this.horizontalResolution = horizontalResolution;
        return this;
    }

    public void setHorizontalResolution(Double horizontalResolution) {
        this.horizontalResolution = horizontalResolution;
    }


    /**
     * Gets or sets the brightness level of the image.
    * @return imageBrightness
    **/
    @ApiModelProperty(value = "Gets or sets the brightness level of the image.")
    public Double getImageBrightness() {
        return imageBrightness;
    }

    public ImageSaveOptionsData imageBrightness(Double imageBrightness) {
        this.imageBrightness = imageBrightness;
        return this;
    }

    public void setImageBrightness(Double imageBrightness) {
        this.imageBrightness = imageBrightness;
    }


    /**
     * Gets or sets the color mode of the image.
    * @return imageColorMode
    **/
    @ApiModelProperty(value = "Gets or sets the color mode of the image.")
    public ImageColorModeEnum getImageColorMode() {
        return imageColorMode;
    }

    public ImageSaveOptionsData imageColorMode(ImageColorModeEnum imageColorMode) {
        this.imageColorMode = imageColorMode;
        return this;
    }

    public void setImageColorMode(ImageColorModeEnum imageColorMode) {
        this.imageColorMode = imageColorMode;
    }


    /**
     * Gets or sets the contrast level of the image.
    * @return imageContrast
    **/
    @ApiModelProperty(value = "Gets or sets the contrast level of the image.")
    public Double getImageContrast() {
        return imageContrast;
    }

    public ImageSaveOptionsData imageContrast(Double imageContrast) {
        this.imageContrast = imageContrast;
        return this;
    }

    public void setImageContrast(Double imageContrast) {
        this.imageContrast = imageContrast;
    }


    /**
     * Gets or sets the background (paper) color of the image.
    * @return paperColor
    **/
    @ApiModelProperty(value = "Gets or sets the background (paper) color of the image.")
    public String getPaperColor() {
        return paperColor;
    }

    public ImageSaveOptionsData paperColor(String paperColor) {
        this.paperColor = paperColor;
        return this;
    }

    public void setPaperColor(String paperColor) {
        this.paperColor = paperColor;
    }


    /**
     * Gets or sets the pixel format of the image.
    * @return pixelFormat
    **/
    @ApiModelProperty(value = "Gets or sets the pixel format of the image.")
    public PixelFormatEnum getPixelFormat() {
        return pixelFormat;
    }

    public ImageSaveOptionsData pixelFormat(PixelFormatEnum pixelFormat) {
        this.pixelFormat = pixelFormat;
        return this;
    }

    public void setPixelFormat(PixelFormatEnum pixelFormat) {
        this.pixelFormat = pixelFormat;
    }


    /**
     * Gets or sets both horizontal and vertical resolution in dots per inch for the generated images.
     * This property has effect only when saving to raster image formats.
     * The default value is 96.
    * @return resolution
    **/
    @ApiModelProperty(value = "Gets or sets both horizontal and vertical resolution in dots per inch for the generated images. This property has effect only when saving to raster image formats. The default value is 96.")
    public Double getResolution() {
        return resolution;
    }

    public ImageSaveOptionsData resolution(Double resolution) {
        this.resolution = resolution;
        return this;
    }

    public void setResolution(Double resolution) {
        this.resolution = resolution;
    }


    /**
     * Gets or sets the zoom factor of the image.
    * @return scale
    **/
    @ApiModelProperty(value = "Gets or sets the zoom factor of the image.")
    public Double getScale() {
        return scale;
    }

    public ImageSaveOptionsData scale(Double scale) {
        this.scale = scale;
        return this;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }


    /**
     * Gets or sets a value indicating whether to use anti-aliasing for rendering.
    * @return useAntiAliasing
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to use anti-aliasing for rendering.")
    public Boolean getUseAntiAliasing() {
        return useAntiAliasing;
    }

    public ImageSaveOptionsData useAntiAliasing(Boolean useAntiAliasing) {
        this.useAntiAliasing = useAntiAliasing;
        return this;
    }

    public void setUseAntiAliasing(Boolean useAntiAliasing) {
        this.useAntiAliasing = useAntiAliasing;
    }


    /**
     * Gets or sets a value indicating whether to use GDI+ or Aspose.Words metafile renderer when saving to EMF.
    * @return useGdiEmfRenderer
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to use GDI+ or Aspose.Words metafile renderer when saving to EMF.")
    public Boolean getUseGdiEmfRenderer() {
        return useGdiEmfRenderer;
    }

    public ImageSaveOptionsData useGdiEmfRenderer(Boolean useGdiEmfRenderer) {
        this.useGdiEmfRenderer = useGdiEmfRenderer;
        return this;
    }

    public void setUseGdiEmfRenderer(Boolean useGdiEmfRenderer) {
        this.useGdiEmfRenderer = useGdiEmfRenderer;
    }


    /**
     * Gets or sets a value indicating whether to use high quality (i.e. slow) rendering algorithms.
    * @return useHighQualityRendering
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to use high quality (i.e. slow) rendering algorithms.")
    public Boolean getUseHighQualityRendering() {
        return useHighQualityRendering;
    }

    public ImageSaveOptionsData useHighQualityRendering(Boolean useHighQualityRendering) {
        this.useHighQualityRendering = useHighQualityRendering;
        return this;
    }

    public void setUseHighQualityRendering(Boolean useHighQualityRendering) {
        this.useHighQualityRendering = useHighQualityRendering;
    }


    /**
     * Gets or sets the vertical resolution in dots per inch for the generated images.
     * This property has effect only when saving to raster image formats.
     * The default value is 96.
    * @return verticalResolution
    **/
    @ApiModelProperty(value = "Gets or sets the vertical resolution in dots per inch for the generated images. This property has effect only when saving to raster image formats. The default value is 96.")
    public Double getVerticalResolution() {
        return verticalResolution;
    }

    public ImageSaveOptionsData verticalResolution(Double verticalResolution) {
        this.verticalResolution = verticalResolution;
        return this;
    }

    public void setVerticalResolution(Double verticalResolution) {
        this.verticalResolution = verticalResolution;
    }


    public ImageSaveOptionsData() {
        super();
        this.horizontalResolution = null;
        this.imageBrightness = null;
        this.imageColorMode = null;
        this.imageContrast = null;
        this.paperColor = null;
        this.pixelFormat = null;
        this.resolution = null;
        this.scale = null;
        this.useAntiAliasing = null;
        this.useGdiEmfRenderer = null;
        this.useHighQualityRendering = null;
        this.verticalResolution = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImageSaveOptionsData imageSaveOptionsData = (ImageSaveOptionsData) o;
        return
            Objects.equals(this.horizontalResolution, imageSaveOptionsData.horizontalResolution) &&
            Objects.equals(this.imageBrightness, imageSaveOptionsData.imageBrightness) &&
            Objects.equals(this.imageColorMode, imageSaveOptionsData.imageColorMode) &&
            Objects.equals(this.imageContrast, imageSaveOptionsData.imageContrast) &&
            Objects.equals(this.paperColor, imageSaveOptionsData.paperColor) &&
            Objects.equals(this.pixelFormat, imageSaveOptionsData.pixelFormat) &&
            Objects.equals(this.resolution, imageSaveOptionsData.resolution) &&
            Objects.equals(this.scale, imageSaveOptionsData.scale) &&
            Objects.equals(this.useAntiAliasing, imageSaveOptionsData.useAntiAliasing) &&
            Objects.equals(this.useGdiEmfRenderer, imageSaveOptionsData.useGdiEmfRenderer) &&
            Objects.equals(this.useHighQualityRendering, imageSaveOptionsData.useHighQualityRendering) &&
            Objects.equals(this.verticalResolution, imageSaveOptionsData.verticalResolution) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(horizontalResolution, imageBrightness, imageColorMode, imageContrast, paperColor, pixelFormat, resolution, scale, useAntiAliasing, useGdiEmfRenderer, useHighQualityRendering, verticalResolution, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSaveOptionsData {\n");
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
