/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MetafileRenderingOptionsData.java">
 *   Copyright (c) 2026 Aspose.Words for Cloud
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
import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.model.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Container class for options of metafile rendering.
 */
@ApiModel(description = "Container class for options of metafile rendering.")
public class MetafileRenderingOptionsData implements ModelIfc {
    /**
     * Gets or sets the option that controls how EMF+ Dual metafiles should be rendered.
     */
    @JsonAdapter(EmfPlusDualRenderingModeEnum.Adapter.class)
    public enum EmfPlusDualRenderingModeEnum {
        EMFPLUSWITHFALLBACK("EmfPlusWithFallback"),
        EMFPLUS("EmfPlus"),
        EMF("Emf");

        private String value;

        EmfPlusDualRenderingModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static EmfPlusDualRenderingModeEnum fromValue(String text) {
            for (EmfPlusDualRenderingModeEnum b : EmfPlusDualRenderingModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< EmfPlusDualRenderingModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final EmfPlusDualRenderingModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public EmfPlusDualRenderingModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return EmfPlusDualRenderingModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls how metafile images should be rendered.
     */
    @JsonAdapter(RenderingModeEnum.Adapter.class)
    public enum RenderingModeEnum {
        VECTORWITHFALLBACK("VectorWithFallback"),
        VECTOR("Vector"),
        BITMAP("Bitmap");

        private String value;

        RenderingModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RenderingModeEnum fromValue(String text) {
            for (RenderingModeEnum b : RenderingModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< RenderingModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final RenderingModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RenderingModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RenderingModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("EmfPlusDualRenderingMode")
    protected EmfPlusDualRenderingModeEnum emfPlusDualRenderingMode;

    @SerializedName("EmulateRasterOperations")
    protected Boolean emulateRasterOperations;

    @SerializedName("EmulateRenderingToSizeOnPage")
    protected Boolean emulateRenderingToSizeOnPage;

    @SerializedName("EmulateRenderingToSizeOnPageResolution")
    protected Integer emulateRenderingToSizeOnPageResolution;

    @SerializedName("RenderingMode")
    protected RenderingModeEnum renderingMode;

    @SerializedName("UseEmfEmbeddedToWmf")
    protected Boolean useEmfEmbeddedToWmf;
    /**
     * Gets or sets the option that controls how EMF+ Dual metafiles should be rendered.
    * @return emfPlusDualRenderingMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how EMF+ Dual metafiles should be rendered.")
    public EmfPlusDualRenderingModeEnum getEmfPlusDualRenderingMode() {
        return emfPlusDualRenderingMode;
    }

    public MetafileRenderingOptionsData emfPlusDualRenderingMode(EmfPlusDualRenderingModeEnum emfPlusDualRenderingMode) {
        this.emfPlusDualRenderingMode = emfPlusDualRenderingMode;
        return this;
    }

    public void setEmfPlusDualRenderingMode(EmfPlusDualRenderingModeEnum emfPlusDualRenderingMode) {
        this.emfPlusDualRenderingMode = emfPlusDualRenderingMode;
    }


    /**
     * Gets or sets a value indicating whether the raster operations should be emulated.
     * Specific raster operations could be used in metafiles. They can not be rendered directly to vector graphics. Emulating raster operations requires partial rasterization of the resulting vector graphics which may affect the metafile rendering performance. When this value is set to true, Aspose.Words emulates the raster operations. The resulting output maybe partially rasterized and performance might be slower. When this value is set to false, Aspose.Words does not emulate the raster operations. When Aspose.Words encounters a raster operation in a metafile it fallbacks to rendering the metafile into a bitmap by using the operating system. This option is used only when metafile is rendered as vector graphics. The default value is true.
    * @return emulateRasterOperations
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the raster operations should be emulated. Specific raster operations could be used in metafiles. They can not be rendered directly to vector graphics. Emulating raster operations requires partial rasterization of the resulting vector graphics which may affect the metafile rendering performance. When this value is set to true, Aspose.Words emulates the raster operations. The resulting output maybe partially rasterized and performance might be slower. When this value is set to false, Aspose.Words does not emulate the raster operations. When Aspose.Words encounters a raster operation in a metafile it fallbacks to rendering the metafile into a bitmap by using the operating system. This option is used only when metafile is rendered as vector graphics. The default value is true.")
    public Boolean getEmulateRasterOperations() {
        return emulateRasterOperations;
    }

    public MetafileRenderingOptionsData emulateRasterOperations(Boolean emulateRasterOperations) {
        this.emulateRasterOperations = emulateRasterOperations;
        return this;
    }

    public void setEmulateRasterOperations(Boolean emulateRasterOperations) {
        this.emulateRasterOperations = emulateRasterOperations;
    }


    /**
     * Gets or sets a value determining whether metafile rendering emulates the display of the metafile according to the size on page
     * or the display of the metafile in its default size.
    * @return emulateRenderingToSizeOnPage
    **/
    @ApiModelProperty(value = "Gets or sets a value determining whether metafile rendering emulates the display of the metafile according to the size on page or the display of the metafile in its default size.")
    public Boolean getEmulateRenderingToSizeOnPage() {
        return emulateRenderingToSizeOnPage;
    }

    public MetafileRenderingOptionsData emulateRenderingToSizeOnPage(Boolean emulateRenderingToSizeOnPage) {
        this.emulateRenderingToSizeOnPage = emulateRenderingToSizeOnPage;
        return this;
    }

    public void setEmulateRenderingToSizeOnPage(Boolean emulateRenderingToSizeOnPage) {
        this.emulateRenderingToSizeOnPage = emulateRenderingToSizeOnPage;
    }


    /**
     * Gets or sets the resolution in pixels per inch for the emulation of metafile rendering to the size on page.
     * This option is used only when EmulateRenderingToSizeOnPage is set to true.The default value is 96. This is a default display resolution. I.e. metafile rendering will emulate the display of
     * the metafile in MS Word with a 100% zoom factor.
    * @return emulateRenderingToSizeOnPageResolution
    **/
    @ApiModelProperty(value = "Gets or sets the resolution in pixels per inch for the emulation of metafile rendering to the size on page. This option is used only when EmulateRenderingToSizeOnPage is set to true.The default value is 96. This is a default display resolution. I.e. metafile rendering will emulate the display of the metafile in MS Word with a 100% zoom factor.")
    public Integer getEmulateRenderingToSizeOnPageResolution() {
        return emulateRenderingToSizeOnPageResolution;
    }

    public MetafileRenderingOptionsData emulateRenderingToSizeOnPageResolution(Integer emulateRenderingToSizeOnPageResolution) {
        this.emulateRenderingToSizeOnPageResolution = emulateRenderingToSizeOnPageResolution;
        return this;
    }

    public void setEmulateRenderingToSizeOnPageResolution(Integer emulateRenderingToSizeOnPageResolution) {
        this.emulateRenderingToSizeOnPageResolution = emulateRenderingToSizeOnPageResolution;
    }


    /**
     * Gets or sets the option that controls how metafile images should be rendered.
    * @return renderingMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how metafile images should be rendered.")
    public RenderingModeEnum getRenderingMode() {
        return renderingMode;
    }

    public MetafileRenderingOptionsData renderingMode(RenderingModeEnum renderingMode) {
        this.renderingMode = renderingMode;
        return this;
    }

    public void setRenderingMode(RenderingModeEnum renderingMode) {
        this.renderingMode = renderingMode;
    }


    /**
     * Gets or sets the flag, that controls how WMF metafiles with embedded EMF metafiles should be rendered.
    * @return useEmfEmbeddedToWmf
    **/
    @ApiModelProperty(value = "Gets or sets the flag, that controls how WMF metafiles with embedded EMF metafiles should be rendered.")
    public Boolean getUseEmfEmbeddedToWmf() {
        return useEmfEmbeddedToWmf;
    }

    public MetafileRenderingOptionsData useEmfEmbeddedToWmf(Boolean useEmfEmbeddedToWmf) {
        this.useEmfEmbeddedToWmf = useEmfEmbeddedToWmf;
        return this;
    }

    public void setUseEmfEmbeddedToWmf(Boolean useEmfEmbeddedToWmf) {
        this.useEmfEmbeddedToWmf = useEmfEmbeddedToWmf;
    }


    public MetafileRenderingOptionsData() {
        this.emfPlusDualRenderingMode = null;
        this.emulateRasterOperations = null;
        this.emulateRenderingToSizeOnPage = null;
        this.emulateRenderingToSizeOnPageResolution = null;
        this.renderingMode = null;
        this.useEmfEmbeddedToWmf = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
    }

    /*
     * Validate required properties.
     *
     * @throws ApiException If fails to validate required properties.
     */
    @Override
    public void validate() throws ApiException {
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
        return
            Objects.equals(this.emfPlusDualRenderingMode, metafileRenderingOptionsData.emfPlusDualRenderingMode) &&
            Objects.equals(this.emulateRasterOperations, metafileRenderingOptionsData.emulateRasterOperations) &&
            Objects.equals(this.emulateRenderingToSizeOnPage, metafileRenderingOptionsData.emulateRenderingToSizeOnPage) &&
            Objects.equals(this.emulateRenderingToSizeOnPageResolution, metafileRenderingOptionsData.emulateRenderingToSizeOnPageResolution) &&
            Objects.equals(this.renderingMode, metafileRenderingOptionsData.renderingMode) &&
            Objects.equals(this.useEmfEmbeddedToWmf, metafileRenderingOptionsData.useEmfEmbeddedToWmf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emfPlusDualRenderingMode, emulateRasterOperations, emulateRenderingToSizeOnPage, emulateRenderingToSizeOnPageResolution, renderingMode, useEmfEmbeddedToWmf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetafileRenderingOptionsData {\n");
    sb.append("    emfPlusDualRenderingMode: ").append(toIndentedString(getEmfPlusDualRenderingMode())).append("\n");
    sb.append("    emulateRasterOperations: ").append(toIndentedString(getEmulateRasterOperations())).append("\n");
    sb.append("    emulateRenderingToSizeOnPage: ").append(toIndentedString(getEmulateRenderingToSizeOnPage())).append("\n");
    sb.append("    emulateRenderingToSizeOnPageResolution: ").append(toIndentedString(getEmulateRenderingToSizeOnPageResolution())).append("\n");
    sb.append("    renderingMode: ").append(toIndentedString(getRenderingMode())).append("\n");
    sb.append("    useEmfEmbeddedToWmf: ").append(toIndentedString(getUseEmfEmbeddedToWmf())).append("\n");
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
