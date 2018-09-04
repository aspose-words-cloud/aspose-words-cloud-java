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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * container class for options of metafile rendering
 */
@ApiModel(description = "container class for options of metafile rendering")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T12:20:41.870Z")
public class MetafileRenderingOptionsData {
  @JsonProperty("EmfPlusDualRenderingMode")
  private String emfPlusDualRenderingMode = null;

  @JsonProperty("EmulateRasterOperations")
  private Boolean emulateRasterOperations = null;

  @JsonProperty("RenderingMode")
  private String renderingMode = null;

  @JsonProperty("UseEmfEmbeddedToWmf")
  private Boolean useEmfEmbeddedToWmf = null;

  public MetafileRenderingOptionsData emfPlusDualRenderingMode(String emfPlusDualRenderingMode) {
    this.emfPlusDualRenderingMode = emfPlusDualRenderingMode;
    return this;
  }

   /**
   * Determines how EMF+ Dual metafiles should be rendered
   * @return emfPlusDualRenderingMode
  **/
  @ApiModelProperty(value = "Determines how EMF+ Dual metafiles should be rendered")
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
  @ApiModelProperty(value = "Gets or sets a value determining whether or not the raster operations should be emulated.             ")
  public Boolean isEmulateRasterOperations() {
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
   * Determines how metafile images should be rendered
   * @return renderingMode
  **/
  @ApiModelProperty(value = "Determines how metafile images should be rendered")
  public String getRenderingMode() {
    return renderingMode;
  }

  public void setRenderingMode(String renderingMode) {
    this.renderingMode = renderingMode;
  }

  public MetafileRenderingOptionsData useEmfEmbeddedToWmf(Boolean useEmfEmbeddedToWmf) {
    this.useEmfEmbeddedToWmf = useEmfEmbeddedToWmf;
    return this;
  }

   /**
   * Determines how WMF metafiles with embedded EMF metafiles should be rendered
   * @return useEmfEmbeddedToWmf
  **/
  @ApiModelProperty(value = "Determines how WMF metafiles with embedded EMF metafiles should be rendered")
  public Boolean isUseEmfEmbeddedToWmf() {
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
    MetafileRenderingOptionsData metafileRenderingOptionsData = (MetafileRenderingOptionsData) o;
    return Objects.equals(this.emfPlusDualRenderingMode, metafileRenderingOptionsData.emfPlusDualRenderingMode) &&
        Objects.equals(this.emulateRasterOperations, metafileRenderingOptionsData.emulateRasterOperations) &&
        Objects.equals(this.renderingMode, metafileRenderingOptionsData.renderingMode) &&
        Objects.equals(this.useEmfEmbeddedToWmf, metafileRenderingOptionsData.useEmfEmbeddedToWmf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emfPlusDualRenderingMode, emulateRasterOperations, renderingMode, useEmfEmbeddedToWmf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetafileRenderingOptionsData {\n");
    
    sb.append("    emfPlusDualRenderingMode: ").append(toIndentedString(emfPlusDualRenderingMode)).append("\n");
    sb.append("    emulateRasterOperations: ").append(toIndentedString(emulateRasterOperations)).append("\n");
    sb.append("    renderingMode: ").append(toIndentedString(renderingMode)).append("\n");
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

