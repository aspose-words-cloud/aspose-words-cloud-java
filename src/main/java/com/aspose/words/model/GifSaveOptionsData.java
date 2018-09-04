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
import com.aspose.words.model.GraphicsQualityOptionsData;
import com.aspose.words.model.ImageSaveOptionsData;
import com.aspose.words.model.MetafileRenderingOptionsData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Container class for gif save options.
 */
@ApiModel(description = "Container class for gif save options.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:28:29.802Z")
public class GifSaveOptionsData {
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

  @JsonProperty("GraphicsQualityOptions")
  private GraphicsQualityOptionsData graphicsQualityOptions = null;

  @JsonProperty("HorizontalResolution")
  private Double horizontalResolution = null;

  @JsonProperty("ImageBrightness")
  private Double imageBrightness = null;

  @JsonProperty("ImageColorMode")
  private String imageColorMode = null;

  @JsonProperty("ImageContrast")
  private Double imageContrast = null;

  @JsonProperty("PaperColor")
  private String paperColor = null;

  @JsonProperty("PixelFormat")
  private String pixelFormat = null;

  @JsonProperty("Resolution")
  private Double resolution = null;

  @JsonProperty("Scale")
  private Double scale = null;

  @JsonProperty("UseAntiAliasing")
  private Boolean useAntiAliasing = null;

  @JsonProperty("UseGdiEmfRenderer")
  private Boolean useGdiEmfRenderer = null;

  @JsonProperty("UseHighQualityRendering")
  private Boolean useHighQualityRendering = null;

  @JsonProperty("VerticalResolution")
  private Double verticalResolution = null;

  public GifSaveOptionsData colorMode(String colorMode) {
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

  public GifSaveOptionsData saveFormat(String saveFormat) {
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

  public GifSaveOptionsData fileName(String fileName) {
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

  public GifSaveOptionsData dmlRenderingMode(String dmlRenderingMode) {
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

  public GifSaveOptionsData dmlEffectsRenderingMode(String dmlEffectsRenderingMode) {
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

  public GifSaveOptionsData zipOutput(Boolean zipOutput) {
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

  public GifSaveOptionsData updateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
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

  public GifSaveOptionsData updateSdtContent(Boolean updateSdtContent) {
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

  public GifSaveOptionsData updateFields(Boolean updateFields) {
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

  public GifSaveOptionsData jpegQuality(Integer jpegQuality) {
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

  public GifSaveOptionsData metafileRenderingOptions(MetafileRenderingOptionsData metafileRenderingOptions) {
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

  public GifSaveOptionsData numeralFormat(String numeralFormat) {
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

  public GifSaveOptionsData optimizeOutput(Boolean optimizeOutput) {
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

  public GifSaveOptionsData pageCount(Integer pageCount) {
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

  public GifSaveOptionsData pageIndex(Integer pageIndex) {
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

  public GifSaveOptionsData graphicsQualityOptions(GraphicsQualityOptionsData graphicsQualityOptions) {
    this.graphicsQualityOptions = graphicsQualityOptions;
    return this;
  }

   /**
   * Allows to specify additional System.Drawing.Graphics quality options.
   * @return graphicsQualityOptions
  **/
  @ApiModelProperty(value = "Allows to specify additional System.Drawing.Graphics quality options.")
  public GraphicsQualityOptionsData getGraphicsQualityOptions() {
    return graphicsQualityOptions;
  }

  public void setGraphicsQualityOptions(GraphicsQualityOptionsData graphicsQualityOptions) {
    this.graphicsQualityOptions = graphicsQualityOptions;
  }

  public GifSaveOptionsData horizontalResolution(Double horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
    return this;
  }

   /**
   * Gets or sets the horizontal resolution for the generated images, in dots per inch.  This property has effect only when saving to raster image formats. The default value is 96.
   * @return horizontalResolution
  **/
  @ApiModelProperty(value = "Gets or sets the horizontal resolution for the generated images, in dots per inch.  This property has effect only when saving to raster image formats. The default value is 96.")
  public Double getHorizontalResolution() {
    return horizontalResolution;
  }

  public void setHorizontalResolution(Double horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
  }

  public GifSaveOptionsData imageBrightness(Double imageBrightness) {
    this.imageBrightness = imageBrightness;
    return this;
  }

   /**
   * Brightness of image
   * @return imageBrightness
  **/
  @ApiModelProperty(value = "Brightness of image")
  public Double getImageBrightness() {
    return imageBrightness;
  }

  public void setImageBrightness(Double imageBrightness) {
    this.imageBrightness = imageBrightness;
  }

  public GifSaveOptionsData imageColorMode(String imageColorMode) {
    this.imageColorMode = imageColorMode;
    return this;
  }

   /**
   * Color mode of image
   * @return imageColorMode
  **/
  @ApiModelProperty(value = "Color mode of image")
  public String getImageColorMode() {
    return imageColorMode;
  }

  public void setImageColorMode(String imageColorMode) {
    this.imageColorMode = imageColorMode;
  }

  public GifSaveOptionsData imageContrast(Double imageContrast) {
    this.imageContrast = imageContrast;
    return this;
  }

   /**
   * Contrast of image
   * @return imageContrast
  **/
  @ApiModelProperty(value = "Contrast of image")
  public Double getImageContrast() {
    return imageContrast;
  }

  public void setImageContrast(Double imageContrast) {
    this.imageContrast = imageContrast;
  }

  public GifSaveOptionsData paperColor(String paperColor) {
    this.paperColor = paperColor;
    return this;
  }

   /**
   * Background (paper) color of image
   * @return paperColor
  **/
  @ApiModelProperty(value = "Background (paper) color of image")
  public String getPaperColor() {
    return paperColor;
  }

  public void setPaperColor(String paperColor) {
    this.paperColor = paperColor;
  }

  public GifSaveOptionsData pixelFormat(String pixelFormat) {
    this.pixelFormat = pixelFormat;
    return this;
  }

   /**
   * Pixel format of image
   * @return pixelFormat
  **/
  @ApiModelProperty(value = "Pixel format of image")
  public String getPixelFormat() {
    return pixelFormat;
  }

  public void setPixelFormat(String pixelFormat) {
    this.pixelFormat = pixelFormat;
  }

  public GifSaveOptionsData resolution(Double resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Sets both horizontal and vertical resolution for the generated images, in dots per inch.  This property has effect only when saving to raster image formats. The default value is 96.
   * @return resolution
  **/
  @ApiModelProperty(value = "Sets both horizontal and vertical resolution for the generated images, in dots per inch.  This property has effect only when saving to raster image formats. The default value is 96.")
  public Double getResolution() {
    return resolution;
  }

  public void setResolution(Double resolution) {
    this.resolution = resolution;
  }

  public GifSaveOptionsData scale(Double scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Zoom factor of image
   * @return scale
  **/
  @ApiModelProperty(value = "Zoom factor of image")
  public Double getScale() {
    return scale;
  }

  public void setScale(Double scale) {
    this.scale = scale;
  }

  public GifSaveOptionsData useAntiAliasing(Boolean useAntiAliasing) {
    this.useAntiAliasing = useAntiAliasing;
    return this;
  }

   /**
   * Determine whether or not to use anti-aliasing for rendering
   * @return useAntiAliasing
  **/
  @ApiModelProperty(value = "Determine whether or not to use anti-aliasing for rendering")
  public Boolean isUseAntiAliasing() {
    return useAntiAliasing;
  }

  public void setUseAntiAliasing(Boolean useAntiAliasing) {
    this.useAntiAliasing = useAntiAliasing;
  }

  public GifSaveOptionsData useGdiEmfRenderer(Boolean useGdiEmfRenderer) {
    this.useGdiEmfRenderer = useGdiEmfRenderer;
    return this;
  }

   /**
   * Gets or sets a value determining whether to use GDI+ or Aspose.Words metafile renderer when saving to EMF.
   * @return useGdiEmfRenderer
  **/
  @ApiModelProperty(value = "Gets or sets a value determining whether to use GDI+ or Aspose.Words metafile renderer when saving to EMF.")
  public Boolean isUseGdiEmfRenderer() {
    return useGdiEmfRenderer;
  }

  public void setUseGdiEmfRenderer(Boolean useGdiEmfRenderer) {
    this.useGdiEmfRenderer = useGdiEmfRenderer;
  }

  public GifSaveOptionsData useHighQualityRendering(Boolean useHighQualityRendering) {
    this.useHighQualityRendering = useHighQualityRendering;
    return this;
  }

   /**
   * Determine whether or not to use high quality (i.e. slow) rendering algorithms
   * @return useHighQualityRendering
  **/
  @ApiModelProperty(value = "Determine whether or not to use high quality (i.e. slow) rendering algorithms")
  public Boolean isUseHighQualityRendering() {
    return useHighQualityRendering;
  }

  public void setUseHighQualityRendering(Boolean useHighQualityRendering) {
    this.useHighQualityRendering = useHighQualityRendering;
  }

  public GifSaveOptionsData verticalResolution(Double verticalResolution) {
    this.verticalResolution = verticalResolution;
    return this;
  }

   /**
   * Gets or sets the vertical resolution for the generated images, in dots per inch.  This property has effect only when saving to raster image formats. The default value is 96.
   * @return verticalResolution
  **/
  @ApiModelProperty(value = "Gets or sets the vertical resolution for the generated images, in dots per inch.  This property has effect only when saving to raster image formats. The default value is 96.")
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
    GifSaveOptionsData gifSaveOptionsData = (GifSaveOptionsData) o;
    return Objects.equals(this.colorMode, gifSaveOptionsData.colorMode) &&
        Objects.equals(this.saveFormat, gifSaveOptionsData.saveFormat) &&
        Objects.equals(this.fileName, gifSaveOptionsData.fileName) &&
        Objects.equals(this.dmlRenderingMode, gifSaveOptionsData.dmlRenderingMode) &&
        Objects.equals(this.dmlEffectsRenderingMode, gifSaveOptionsData.dmlEffectsRenderingMode) &&
        Objects.equals(this.zipOutput, gifSaveOptionsData.zipOutput) &&
        Objects.equals(this.updateLastSavedTimeProperty, gifSaveOptionsData.updateLastSavedTimeProperty) &&
        Objects.equals(this.updateSdtContent, gifSaveOptionsData.updateSdtContent) &&
        Objects.equals(this.updateFields, gifSaveOptionsData.updateFields) &&
        Objects.equals(this.jpegQuality, gifSaveOptionsData.jpegQuality) &&
        Objects.equals(this.metafileRenderingOptions, gifSaveOptionsData.metafileRenderingOptions) &&
        Objects.equals(this.numeralFormat, gifSaveOptionsData.numeralFormat) &&
        Objects.equals(this.optimizeOutput, gifSaveOptionsData.optimizeOutput) &&
        Objects.equals(this.pageCount, gifSaveOptionsData.pageCount) &&
        Objects.equals(this.pageIndex, gifSaveOptionsData.pageIndex) &&
        Objects.equals(this.graphicsQualityOptions, gifSaveOptionsData.graphicsQualityOptions) &&
        Objects.equals(this.horizontalResolution, gifSaveOptionsData.horizontalResolution) &&
        Objects.equals(this.imageBrightness, gifSaveOptionsData.imageBrightness) &&
        Objects.equals(this.imageColorMode, gifSaveOptionsData.imageColorMode) &&
        Objects.equals(this.imageContrast, gifSaveOptionsData.imageContrast) &&
        Objects.equals(this.paperColor, gifSaveOptionsData.paperColor) &&
        Objects.equals(this.pixelFormat, gifSaveOptionsData.pixelFormat) &&
        Objects.equals(this.resolution, gifSaveOptionsData.resolution) &&
        Objects.equals(this.scale, gifSaveOptionsData.scale) &&
        Objects.equals(this.useAntiAliasing, gifSaveOptionsData.useAntiAliasing) &&
        Objects.equals(this.useGdiEmfRenderer, gifSaveOptionsData.useGdiEmfRenderer) &&
        Objects.equals(this.useHighQualityRendering, gifSaveOptionsData.useHighQualityRendering) &&
        Objects.equals(this.verticalResolution, gifSaveOptionsData.verticalResolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorMode, saveFormat, fileName, dmlRenderingMode, dmlEffectsRenderingMode, zipOutput, updateLastSavedTimeProperty, updateSdtContent, updateFields, jpegQuality, metafileRenderingOptions, numeralFormat, optimizeOutput, pageCount, pageIndex, graphicsQualityOptions, horizontalResolution, imageBrightness, imageColorMode, imageContrast, paperColor, pixelFormat, resolution, scale, useAntiAliasing, useGdiEmfRenderer, useHighQualityRendering, verticalResolution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GifSaveOptionsData {\n");
    
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

