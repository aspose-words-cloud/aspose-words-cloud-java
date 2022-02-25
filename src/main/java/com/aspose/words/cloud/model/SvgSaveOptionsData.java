/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SvgSaveOptionsData.java">
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
 * Container class for svg save options.
 */
@ApiModel(description = "Container class for svg save options.")
public class SvgSaveOptionsData extends FixedPageSaveOptionsData {
    /**
     * Gets or sets the option that controls how text should be rendered.
     */
    @JsonAdapter(TextOutputModeEnum.Adapter.class)
    public enum TextOutputModeEnum {
        USESVGFONTS("UseSvgFonts"),
        USETARGETMACHINEFONTS("UseTargetMachineFonts"),
        USEPLACEDGLYPHS("UsePlacedGlyphs");

        private String value;

        TextOutputModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TextOutputModeEnum fromValue(String text) {
            for (TextOutputModeEnum b : TextOutputModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TextOutputModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TextOutputModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TextOutputModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TextOutputModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("ExportEmbeddedImages")
    protected Boolean exportEmbeddedImages;

    @SerializedName("FitToViewPort")
    protected Boolean fitToViewPort;

    @SerializedName("ResourcesFolder")
    protected String resourcesFolder;

    @SerializedName("ResourcesFolderAlias")
    protected String resourcesFolderAlias;

    @SerializedName("ShowPageBorder")
    protected Boolean showPageBorder;

    @SerializedName("TextOutputMode")
    protected TextOutputModeEnum textOutputMode;
    /**
     * Gets or sets a value indicating whether images should be embedded into SVG document as base64.
    * @return exportEmbeddedImages
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether images should be embedded into SVG document as base64.")
    public Boolean getExportEmbeddedImages() {
        return exportEmbeddedImages;
    }

    public SvgSaveOptionsData exportEmbeddedImages(Boolean exportEmbeddedImages) {
        this.exportEmbeddedImages = exportEmbeddedImages;
        return this;
    }

    public void setExportEmbeddedImages(Boolean exportEmbeddedImages) {
        this.exportEmbeddedImages = exportEmbeddedImages;
    }


    /**
     * Gets or sets a value indicating whether the output SVG should fill the available viewport area (browser window or container). When set to true width and height of output SVG are set to 100%.
    * @return fitToViewPort
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the output SVG should fill the available viewport area (browser window or container). When set to true width and height of output SVG are set to 100%.")
    public Boolean getFitToViewPort() {
        return fitToViewPort;
    }

    public SvgSaveOptionsData fitToViewPort(Boolean fitToViewPort) {
        this.fitToViewPort = fitToViewPort;
        return this;
    }

    public void setFitToViewPort(Boolean fitToViewPort) {
        this.fitToViewPort = fitToViewPort;
    }


    /**
     * Gets or sets the physical folder where resources (images) are saved when exporting.
    * @return resourcesFolder
    **/
    @ApiModelProperty(value = "Gets or sets the physical folder where resources (images) are saved when exporting.")
    public String getResourcesFolder() {
        return resourcesFolder;
    }

    public SvgSaveOptionsData resourcesFolder(String resourcesFolder) {
        this.resourcesFolder = resourcesFolder;
        return this;
    }

    public void setResourcesFolder(String resourcesFolder) {
        this.resourcesFolder = resourcesFolder;
    }


    /**
     * Gets or sets the name of the folder used to construct image URIs.
    * @return resourcesFolderAlias
    **/
    @ApiModelProperty(value = "Gets or sets the name of the folder used to construct image URIs.")
    public String getResourcesFolderAlias() {
        return resourcesFolderAlias;
    }

    public SvgSaveOptionsData resourcesFolderAlias(String resourcesFolderAlias) {
        this.resourcesFolderAlias = resourcesFolderAlias;
        return this;
    }

    public void setResourcesFolderAlias(String resourcesFolderAlias) {
        this.resourcesFolderAlias = resourcesFolderAlias;
    }


    /**
     * Gets or sets a value indicating whether to show or hide page stepper.
    * @return showPageBorder
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to show or hide page stepper.")
    public Boolean getShowPageBorder() {
        return showPageBorder;
    }

    public SvgSaveOptionsData showPageBorder(Boolean showPageBorder) {
        this.showPageBorder = showPageBorder;
        return this;
    }

    public void setShowPageBorder(Boolean showPageBorder) {
        this.showPageBorder = showPageBorder;
    }


    /**
     * Gets or sets the option that controls how text should be rendered.
    * @return textOutputMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how text should be rendered.")
    public TextOutputModeEnum getTextOutputMode() {
        return textOutputMode;
    }

    public SvgSaveOptionsData textOutputMode(TextOutputModeEnum textOutputMode) {
        this.textOutputMode = textOutputMode;
        return this;
    }

    public void setTextOutputMode(TextOutputModeEnum textOutputMode) {
        this.textOutputMode = textOutputMode;
    }


    public SvgSaveOptionsData() {
        super();
        this.exportEmbeddedImages = null;
        this.fitToViewPort = null;
        this.resourcesFolder = null;
        this.resourcesFolderAlias = null;
        this.saveFormat = "svg";
        this.showPageBorder = null;
        this.textOutputMode = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SvgSaveOptionsData svgSaveOptionsData = (SvgSaveOptionsData) o;
        return
            Objects.equals(this.exportEmbeddedImages, svgSaveOptionsData.exportEmbeddedImages) &&
            Objects.equals(this.fitToViewPort, svgSaveOptionsData.fitToViewPort) &&
            Objects.equals(this.resourcesFolder, svgSaveOptionsData.resourcesFolder) &&
            Objects.equals(this.resourcesFolderAlias, svgSaveOptionsData.resourcesFolderAlias) &&
            Objects.equals(this.showPageBorder, svgSaveOptionsData.showPageBorder) &&
            Objects.equals(this.textOutputMode, svgSaveOptionsData.textOutputMode) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportEmbeddedImages, fitToViewPort, resourcesFolder, resourcesFolderAlias, showPageBorder, textOutputMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SvgSaveOptionsData {\n");
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
    sb.append("    exportEmbeddedImages: ").append(toIndentedString(getExportEmbeddedImages())).append("\n");
    sb.append("    fitToViewPort: ").append(toIndentedString(getFitToViewPort())).append("\n");
    sb.append("    resourcesFolder: ").append(toIndentedString(getResourcesFolder())).append("\n");
    sb.append("    resourcesFolderAlias: ").append(toIndentedString(getResourcesFolderAlias())).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
    sb.append("    showPageBorder: ").append(toIndentedString(getShowPageBorder())).append("\n");
    sb.append("    textOutputMode: ").append(toIndentedString(getTextOutputMode())).append("\n");
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
