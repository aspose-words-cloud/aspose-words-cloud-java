/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MetafileRenderingOptionsData.java">
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
 * Container class for options of metafile rendering.
 */
@ApiModel(description = "Container class for options of metafile rendering.")
public class MetafileRenderingOptionsData {
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

    @SerializedName("RenderingMode")
    protected RenderingModeEnum renderingMode;

    @SerializedName("ScaleWmfFontsToMetafileSize")
    protected Boolean scaleWmfFontsToMetafileSize;

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
    * @return emulateRasterOperations
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the raster operations should be emulated.")
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
     * Gets or sets a value indicating whether to scale fonts in WMF metafile according to metafile size on the page.
     * The default value is true.
    * @return scaleWmfFontsToMetafileSize
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to scale fonts in WMF metafile according to metafile size on the page. The default value is true.")
    public Boolean getScaleWmfFontsToMetafileSize() {
        return scaleWmfFontsToMetafileSize;
    }

    public MetafileRenderingOptionsData scaleWmfFontsToMetafileSize(Boolean scaleWmfFontsToMetafileSize) {
        this.scaleWmfFontsToMetafileSize = scaleWmfFontsToMetafileSize;
        return this;
    }

    public void setScaleWmfFontsToMetafileSize(Boolean scaleWmfFontsToMetafileSize) {
        this.scaleWmfFontsToMetafileSize = scaleWmfFontsToMetafileSize;
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
        this.renderingMode = null;
        this.scaleWmfFontsToMetafileSize = null;
        this.useEmfEmbeddedToWmf = null;
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
    sb.append("    emfPlusDualRenderingMode: ").append(toIndentedString(getEmfPlusDualRenderingMode())).append("\n");
    sb.append("    emulateRasterOperations: ").append(toIndentedString(getEmulateRasterOperations())).append("\n");
    sb.append("    renderingMode: ").append(toIndentedString(getRenderingMode())).append("\n");
    sb.append("    scaleWmfFontsToMetafileSize: ").append(toIndentedString(getScaleWmfFontsToMetafileSize())).append("\n");
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
