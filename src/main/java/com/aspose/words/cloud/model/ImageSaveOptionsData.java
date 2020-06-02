/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImageSaveOptionsData.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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
public class ImageSaveOptionsData extends FixedPageSaveOptionsData {
    @SerializedName("GraphicsQualityOptions")
    private GraphicsQualityOptionsData graphicsQualityOptions = null;

    @SerializedName("HorizontalResolution")
    private Double horizontalResolution = null;

    @SerializedName("ImageBrightness")
    private Double imageBrightness = null;

    @SerializedName("ImageColorMode")
    private String imageColorMode = null;

    @SerializedName("ImageContrast")
    private Double imageContrast = null;

    @SerializedName("PaperColor")
    private String paperColor = null;

    @SerializedName("PixelFormat")
    private String pixelFormat = null;

    @SerializedName("Resolution")
    private Double resolution = null;

    @SerializedName("Scale")
    private Double scale = null;

    @SerializedName("UseAntiAliasing")
    private Boolean useAntiAliasing = null;

    @SerializedName("UseGdiEmfRenderer")
    private Boolean useGdiEmfRenderer = null;

    @SerializedName("UseHighQualityRendering")
    private Boolean useHighQualityRendering = null;

    @SerializedName("VerticalResolution")
    private Double verticalResolution = null;
    public ImageSaveOptionsData graphicsQualityOptions(GraphicsQualityOptionsData graphicsQualityOptions) {
        this.graphicsQualityOptions = graphicsQualityOptions;
        return this;
    }

    /**
     * Gets or sets allows to specify additional System.Drawing.Graphics quality options.
    * @return graphicsQualityOptions
    **/
    @ApiModelProperty(value = "Gets or sets allows to specify additional System.Drawing.Graphics quality options.")
    public GraphicsQualityOptionsData getGraphicsQualityOptions() {
        return graphicsQualityOptions;
    }

    public void setGraphicsQualityOptions(GraphicsQualityOptionsData graphicsQualityOptions) {
        this.graphicsQualityOptions = graphicsQualityOptions;
    }

    public ImageSaveOptionsData horizontalResolution(Double horizontalResolution) {
        this.horizontalResolution = horizontalResolution;
        return this;
    }

    /**
     * Gets or sets the horizontal resolution for the generated images, in dots per inch.
     * This property has effect only when saving to raster image formats.
     * The default value is 96.
    * @return horizontalResolution
    **/
    @ApiModelProperty(value = "Gets or sets the horizontal resolution for the generated images, in dots per inch. This property has effect only when saving to raster image formats. The default value is 96.")
    public Double getHorizontalResolution() {
        return horizontalResolution;
    }

    public void setHorizontalResolution(Double horizontalResolution) {
        this.horizontalResolution = horizontalResolution;
    }

    public ImageSaveOptionsData imageBrightness(Double imageBrightness) {
        this.imageBrightness = imageBrightness;
        return this;
    }

    /**
     * Gets or sets brightness of image.
    * @return imageBrightness
    **/
    @ApiModelProperty(value = "Gets or sets brightness of image.")
    public Double getImageBrightness() {
        return imageBrightness;
    }

    public void setImageBrightness(Double imageBrightness) {
        this.imageBrightness = imageBrightness;
    }

    public ImageSaveOptionsData imageColorMode(String imageColorMode) {
        this.imageColorMode = imageColorMode;
        return this;
    }

    /**
     * Gets or sets color mode of image.
    * @return imageColorMode
    **/
    @ApiModelProperty(value = "Gets or sets color mode of image.")
    public String getImageColorMode() {
        return imageColorMode;
    }

    public void setImageColorMode(String imageColorMode) {
        this.imageColorMode = imageColorMode;
    }

    public ImageSaveOptionsData imageContrast(Double imageContrast) {
        this.imageContrast = imageContrast;
        return this;
    }

    /**
     * Gets or sets contrast of image.
    * @return imageContrast
    **/
    @ApiModelProperty(value = "Gets or sets contrast of image.")
    public Double getImageContrast() {
        return imageContrast;
    }

    public void setImageContrast(Double imageContrast) {
        this.imageContrast = imageContrast;
    }

    public ImageSaveOptionsData paperColor(String paperColor) {
        this.paperColor = paperColor;
        return this;
    }

    /**
     * Gets or sets background (paper) color of image.
    * @return paperColor
    **/
    @ApiModelProperty(value = "Gets or sets background (paper) color of image.")
    public String getPaperColor() {
        return paperColor;
    }

    public void setPaperColor(String paperColor) {
        this.paperColor = paperColor;
    }

    public ImageSaveOptionsData pixelFormat(String pixelFormat) {
        this.pixelFormat = pixelFormat;
        return this;
    }

    /**
     * Gets or sets pixel format of image.
    * @return pixelFormat
    **/
    @ApiModelProperty(value = "Gets or sets pixel format of image.")
    public String getPixelFormat() {
        return pixelFormat;
    }

    public void setPixelFormat(String pixelFormat) {
        this.pixelFormat = pixelFormat;
    }

    public ImageSaveOptionsData resolution(Double resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * Gets or sets both horizontal and vertical resolution for the generated images, in dots per inch.
     * This property has effect only when saving to raster image formats.
     * The default value is 96.
    * @return resolution
    **/
    @ApiModelProperty(value = "Gets or sets both horizontal and vertical resolution for the generated images, in dots per inch. This property has effect only when saving to raster image formats. The default value is 96.")
    public Double getResolution() {
        return resolution;
    }

    public void setResolution(Double resolution) {
        this.resolution = resolution;
    }

    public ImageSaveOptionsData scale(Double scale) {
        this.scale = scale;
        return this;
    }

    /**
     * Gets or sets zoom factor of image.
    * @return scale
    **/
    @ApiModelProperty(value = "Gets or sets zoom factor of image.")
    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }

    public ImageSaveOptionsData useAntiAliasing(Boolean useAntiAliasing) {
        this.useAntiAliasing = useAntiAliasing;
        return this;
    }

    /**
     * Gets or sets determine whether or not to use anti-aliasing for rendering.
    * @return useAntiAliasing
    **/
    @ApiModelProperty(value = "Gets or sets determine whether or not to use anti-aliasing for rendering.")
    public Boolean getUseAntiAliasing() {
        return useAntiAliasing;
    }

    public void setUseAntiAliasing(Boolean useAntiAliasing) {
        this.useAntiAliasing = useAntiAliasing;
    }

    public ImageSaveOptionsData useGdiEmfRenderer(Boolean useGdiEmfRenderer) {
        this.useGdiEmfRenderer = useGdiEmfRenderer;
        return this;
    }

    /**
     * Gets or sets a value determining whether to use GDI+ or Aspose.Words metafile renderer when saving to EMF.
    * @return useGdiEmfRenderer
    **/
    @ApiModelProperty(value = "Gets or sets a value determining whether to use GDI+ or Aspose.Words metafile renderer when saving to EMF.")
    public Boolean getUseGdiEmfRenderer() {
        return useGdiEmfRenderer;
    }

    public void setUseGdiEmfRenderer(Boolean useGdiEmfRenderer) {
        this.useGdiEmfRenderer = useGdiEmfRenderer;
    }

    public ImageSaveOptionsData useHighQualityRendering(Boolean useHighQualityRendering) {
        this.useHighQualityRendering = useHighQualityRendering;
        return this;
    }

    /**
     * Gets or sets determine whether or not to use high quality (i.e. slow) rendering algorithms.
    * @return useHighQualityRendering
    **/
    @ApiModelProperty(value = "Gets or sets determine whether or not to use high quality (i.e. slow) rendering algorithms.")
    public Boolean getUseHighQualityRendering() {
        return useHighQualityRendering;
    }

    public void setUseHighQualityRendering(Boolean useHighQualityRendering) {
        this.useHighQualityRendering = useHighQualityRendering;
    }

    public ImageSaveOptionsData verticalResolution(Double verticalResolution) {
        this.verticalResolution = verticalResolution;
        return this;
    }

    /**
     * Gets or sets the vertical resolution for the generated images, in dots per inch.
     * This property has effect only when saving to raster image formats.
     * The default value is 96.
    * @return verticalResolution
    **/
    @ApiModelProperty(value = "Gets or sets the vertical resolution for the generated images, in dots per inch. This property has effect only when saving to raster image formats. The default value is 96.")
    public Double getVerticalResolution() {
        return verticalResolution;
    }

    public void setVerticalResolution(Double verticalResolution) {
        this.verticalResolution = verticalResolution;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    ImageSaveOptionsData imageSaveOptionsData = (ImageSaveOptionsData)o;
    return
        Objects.equals(this.graphicsQualityOptions, imageSaveOptionsData.graphicsQualityOptions) &&
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
    return Objects.hash(graphicsQualityOptions, horizontalResolution, imageBrightness, imageColorMode, imageContrast, paperColor, pixelFormat, resolution, scale, useAntiAliasing, useGdiEmfRenderer, useHighQualityRendering, verticalResolution, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    graphicsQualityOptions: ").append(toIndentedString(graphicsQualityOptions)).append("\n");
    sb.append("    horizontalResolution: ").append(toIndentedString(horizontalResolution)).append("\n");
    sb.append("    imageBrightness: ").append(toIndentedString(imageBrightness)).append("\n");
    sb.append("    imageColorMode: ").append(toIndentedString(imageColorMode)).append("\n");
    sb.append("    imageContrast: ").append(toIndentedString(imageContrast)).append("\n");
    sb.append("    paperColor: ").append(toIndentedString(paperColor)).append("\n");
    sb.append("    pixelFormat: ").append(toIndentedString(pixelFormat)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    useAntiAliasing: ").append(toIndentedString(useAntiAliasing)).append("\n");
    sb.append("    useGdiEmfRenderer: ").append(toIndentedString(useGdiEmfRenderer)).append("\n");
    sb.append("    useHighQualityRendering: ").append(toIndentedString(useHighQualityRendering)).append("\n");
    sb.append("    verticalResolution: ").append(toIndentedString(verticalResolution)).append("\n");
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
