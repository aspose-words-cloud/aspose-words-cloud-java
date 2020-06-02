/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MetafileRenderingOptionsData.java">
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
 * container class for options of metafile rendering.
 */
@ApiModel(description = "container class for options of metafile rendering.")
public class MetafileRenderingOptionsData {
    @SerializedName("EmfPlusDualRenderingMode")
    private String emfPlusDualRenderingMode = null;

    @SerializedName("EmulateRasterOperations")
    private Boolean emulateRasterOperations = null;

    @SerializedName("RenderingMode")
    private String renderingMode = null;

    @SerializedName("ScaleWmfFontsToMetafileSize")
    private Boolean scaleWmfFontsToMetafileSize = null;

    @SerializedName("UseEmfEmbeddedToWmf")
    private Boolean useEmfEmbeddedToWmf = null;
    public MetafileRenderingOptionsData emfPlusDualRenderingMode(String emfPlusDualRenderingMode) {
        this.emfPlusDualRenderingMode = emfPlusDualRenderingMode;
        return this;
    }

    /**
     * Gets or sets determines how EMF+ Dual metafiles should be rendered.
    * @return emfPlusDualRenderingMode
    **/
    @ApiModelProperty(value = "Gets or sets determines how EMF+ Dual metafiles should be rendered.")
    public String getEmfPlusDualRenderingMode() {
        return emfPlusDualRenderingMode;
    }

    public void setEmfPlusDualRenderingMode(String emfPlusDualRenderingMode) {
        this.emfPlusDualRenderingMode = emfPlusDualRenderingMode;
    }

    public MetafileRenderingOptionsData emulateRasterOperations(Boolean emulateRasterOperations) {
        this.emulateRasterOperations = emulateRasterOperations;
        return this;
    }

    /**
     * Gets or sets a value determining whether or not the raster operations should be emulated.
    * @return emulateRasterOperations
    **/
    @ApiModelProperty(value = "Gets or sets a value determining whether or not the raster operations should be emulated.")
    public Boolean getEmulateRasterOperations() {
        return emulateRasterOperations;
    }

    public void setEmulateRasterOperations(Boolean emulateRasterOperations) {
        this.emulateRasterOperations = emulateRasterOperations;
    }

    public MetafileRenderingOptionsData renderingMode(String renderingMode) {
        this.renderingMode = renderingMode;
        return this;
    }

    /**
     * Gets or sets determines how metafile images should be rendered.
    * @return renderingMode
    **/
    @ApiModelProperty(value = "Gets or sets determines how metafile images should be rendered.")
    public String getRenderingMode() {
        return renderingMode;
    }

    public void setRenderingMode(String renderingMode) {
        this.renderingMode = renderingMode;
    }

    public MetafileRenderingOptionsData scaleWmfFontsToMetafileSize(Boolean scaleWmfFontsToMetafileSize) {
        this.scaleWmfFontsToMetafileSize = scaleWmfFontsToMetafileSize;
        return this;
    }

    /**
     * Gets or sets a value determining whether or not to scale fonts in WMF metafile according to metafile size on the page.
     * The default value is true.
    * @return scaleWmfFontsToMetafileSize
    **/
    @ApiModelProperty(value = "Gets or sets a value determining whether or not to scale fonts in WMF metafile according to metafile size on the page. The default value is true.")
    public Boolean getScaleWmfFontsToMetafileSize() {
        return scaleWmfFontsToMetafileSize;
    }

    public void setScaleWmfFontsToMetafileSize(Boolean scaleWmfFontsToMetafileSize) {
        this.scaleWmfFontsToMetafileSize = scaleWmfFontsToMetafileSize;
    }

    public MetafileRenderingOptionsData useEmfEmbeddedToWmf(Boolean useEmfEmbeddedToWmf) {
        this.useEmfEmbeddedToWmf = useEmfEmbeddedToWmf;
        return this;
    }

    /**
     * Gets or sets determines how WMF metafiles with embedded EMF metafiles should be rendered.
    * @return useEmfEmbeddedToWmf
    **/
    @ApiModelProperty(value = "Gets or sets determines how WMF metafiles with embedded EMF metafiles should be rendered.")
    public Boolean getUseEmfEmbeddedToWmf() {
        return useEmfEmbeddedToWmf;
    }

    public void setUseEmfEmbeddedToWmf(Boolean useEmfEmbeddedToWmf) {
        this.useEmfEmbeddedToWmf = useEmfEmbeddedToWmf;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    MetafileRenderingOptionsData metafileRenderingOptionsData = (MetafileRenderingOptionsData)o;
    return
        Objects.equals(this.emfPlusDualRenderingMode, metafileRenderingOptionsData.emfPlusDualRenderingMode) &&
        Objects.equals(this.emulateRasterOperations, metafileRenderingOptionsData.emulateRasterOperations) &&
        Objects.equals(this.renderingMode, metafileRenderingOptionsData.renderingMode) &&
        Objects.equals(this.scaleWmfFontsToMetafileSize, metafileRenderingOptionsData.scaleWmfFontsToMetafileSize) &&
        Objects.equals(this.useEmfEmbeddedToWmf, metafileRenderingOptionsData.useEmfEmbeddedToWmf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emfPlusDualRenderingMode, emulateRasterOperations, renderingMode, scaleWmfFontsToMetafileSize, useEmfEmbeddedToWmf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetafileRenderingOptionsData {\n");
    sb.append("    emfPlusDualRenderingMode: ").append(toIndentedString(emfPlusDualRenderingMode)).append("\n");
    sb.append("    emulateRasterOperations: ").append(toIndentedString(emulateRasterOperations)).append("\n");
    sb.append("    renderingMode: ").append(toIndentedString(renderingMode)).append("\n");
    sb.append("    scaleWmfFontsToMetafileSize: ").append(toIndentedString(scaleWmfFontsToMetafileSize)).append("\n");
    sb.append("    useEmfEmbeddedToWmf: ").append(toIndentedString(useEmfEmbeddedToWmf)).append("\n");
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
