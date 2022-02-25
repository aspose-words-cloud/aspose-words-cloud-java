/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="HtmlFixedSaveOptionsData.java">
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
 * Container class for fixed html save options.
 */
@ApiModel(description = "Container class for fixed html save options.")
public class HtmlFixedSaveOptionsData extends FixedPageSaveOptionsData {
    /**
     * Gets or sets the export format of fonts.
     */
    @JsonAdapter(FontFormatEnum.Adapter.class)
    public enum FontFormatEnum {
        WOFF("Woff"),
        TTF("Ttf");

        private String value;

        FontFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FontFormatEnum fromValue(String text) {
            for (FontFormatEnum b : FontFormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< FontFormatEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final FontFormatEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FontFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FontFormatEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the horizontal alignment of pages in the HTML document.
     * The default value is HtmlFixedHorizontalPageAlignment.Center.
     */
    @JsonAdapter(PageHorizontalAlignmentEnum.Adapter.class)
    public enum PageHorizontalAlignmentEnum {
        LEFT("Left"),
        CENTER("Center"),
        RIGHT("Right");

        private String value;

        PageHorizontalAlignmentEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PageHorizontalAlignmentEnum fromValue(String text) {
            for (PageHorizontalAlignmentEnum b : PageHorizontalAlignmentEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< PageHorizontalAlignmentEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final PageHorizontalAlignmentEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PageHorizontalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PageHorizontalAlignmentEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("CssClassNamesPrefix")
    protected String cssClassNamesPrefix;

    @SerializedName("Encoding")
    protected String encoding;

    @SerializedName("ExportEmbeddedCss")
    protected Boolean exportEmbeddedCss;

    @SerializedName("ExportEmbeddedFonts")
    protected Boolean exportEmbeddedFonts;

    @SerializedName("ExportEmbeddedImages")
    protected Boolean exportEmbeddedImages;

    @SerializedName("ExportFormFields")
    protected Boolean exportFormFields;

    @SerializedName("FontFormat")
    protected FontFormatEnum fontFormat;

    @SerializedName("PageHorizontalAlignment")
    protected PageHorizontalAlignmentEnum pageHorizontalAlignment;

    @SerializedName("PageMargins")
    protected Double pageMargins;

    @SerializedName("ResourcesFolder")
    protected String resourcesFolder;

    @SerializedName("ResourcesFolderAlias")
    protected String resourcesFolderAlias;

    @SerializedName("SaveFontFaceCssSeparately")
    protected Boolean saveFontFaceCssSeparately;

    @SerializedName("ShowPageBorder")
    protected Boolean showPageBorder;

    @SerializedName("UseTargetMachineFonts")
    protected Boolean useTargetMachineFonts;
    /**
     * Gets or sets the prefix which is added to all class names in style.css file.
     * Default value is "aw".
    * @return cssClassNamesPrefix
    **/
    @ApiModelProperty(value = "Gets or sets the prefix which is added to all class names in style.css file. Default value is \"aw\".")
    public String getCssClassNamesPrefix() {
        return cssClassNamesPrefix;
    }

    public HtmlFixedSaveOptionsData cssClassNamesPrefix(String cssClassNamesPrefix) {
        this.cssClassNamesPrefix = cssClassNamesPrefix;
        return this;
    }

    public void setCssClassNamesPrefix(String cssClassNamesPrefix) {
        this.cssClassNamesPrefix = cssClassNamesPrefix;
    }


    /**
     * Gets or sets the character encoding.
    * @return encoding
    **/
    @ApiModelProperty(value = "Gets or sets the character encoding.")
    public String getEncoding() {
        return encoding;
    }

    public HtmlFixedSaveOptionsData encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }


    /**
     * Gets or sets a value indicating whether the CSS (Cascading Style Sheet) should be embedded into the Html document.
    * @return exportEmbeddedCss
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the CSS (Cascading Style Sheet) should be embedded into the Html document.")
    public Boolean getExportEmbeddedCss() {
        return exportEmbeddedCss;
    }

    public HtmlFixedSaveOptionsData exportEmbeddedCss(Boolean exportEmbeddedCss) {
        this.exportEmbeddedCss = exportEmbeddedCss;
        return this;
    }

    public void setExportEmbeddedCss(Boolean exportEmbeddedCss) {
        this.exportEmbeddedCss = exportEmbeddedCss;
    }


    /**
     * Gets or sets a value indicating whether fonts should be embedded into the Html document in Base64 format.
    * @return exportEmbeddedFonts
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether fonts should be embedded into the Html document in Base64 format.")
    public Boolean getExportEmbeddedFonts() {
        return exportEmbeddedFonts;
    }

    public HtmlFixedSaveOptionsData exportEmbeddedFonts(Boolean exportEmbeddedFonts) {
        this.exportEmbeddedFonts = exportEmbeddedFonts;
        return this;
    }

    public void setExportEmbeddedFonts(Boolean exportEmbeddedFonts) {
        this.exportEmbeddedFonts = exportEmbeddedFonts;
    }


    /**
     * Gets or sets a value indicating whether images should be embedded into the Html document in Base64 format.
    * @return exportEmbeddedImages
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether images should be embedded into the Html document in Base64 format.")
    public Boolean getExportEmbeddedImages() {
        return exportEmbeddedImages;
    }

    public HtmlFixedSaveOptionsData exportEmbeddedImages(Boolean exportEmbeddedImages) {
        this.exportEmbeddedImages = exportEmbeddedImages;
        return this;
    }

    public void setExportEmbeddedImages(Boolean exportEmbeddedImages) {
        this.exportEmbeddedImages = exportEmbeddedImages;
    }


    /**
     * Gets or sets a value indicating whether form fields are exported as interactive items (as 'input' tag) rather than converted to text or graphics.
    * @return exportFormFields
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether form fields are exported as interactive items (as 'input' tag) rather than converted to text or graphics.")
    public Boolean getExportFormFields() {
        return exportFormFields;
    }

    public HtmlFixedSaveOptionsData exportFormFields(Boolean exportFormFields) {
        this.exportFormFields = exportFormFields;
        return this;
    }

    public void setExportFormFields(Boolean exportFormFields) {
        this.exportFormFields = exportFormFields;
    }


    /**
     * Gets or sets the export format of fonts.
    * @return fontFormat
    **/
    @ApiModelProperty(value = "Gets or sets the export format of fonts.")
    public FontFormatEnum getFontFormat() {
        return fontFormat;
    }

    public HtmlFixedSaveOptionsData fontFormat(FontFormatEnum fontFormat) {
        this.fontFormat = fontFormat;
        return this;
    }

    public void setFontFormat(FontFormatEnum fontFormat) {
        this.fontFormat = fontFormat;
    }


    /**
     * Gets or sets the horizontal alignment of pages in the HTML document.
     * The default value is HtmlFixedHorizontalPageAlignment.Center.
    * @return pageHorizontalAlignment
    **/
    @ApiModelProperty(value = "Gets or sets the horizontal alignment of pages in the HTML document. The default value is HtmlFixedHorizontalPageAlignment.Center.")
    public PageHorizontalAlignmentEnum getPageHorizontalAlignment() {
        return pageHorizontalAlignment;
    }

    public HtmlFixedSaveOptionsData pageHorizontalAlignment(PageHorizontalAlignmentEnum pageHorizontalAlignment) {
        this.pageHorizontalAlignment = pageHorizontalAlignment;
        return this;
    }

    public void setPageHorizontalAlignment(PageHorizontalAlignmentEnum pageHorizontalAlignment) {
        this.pageHorizontalAlignment = pageHorizontalAlignment;
    }


    /**
     * Gets or sets the margin around pages in HTML document.
     * The margins value is measured in points and should be equal to or greater than 0.
     * Default value is 10 points.
    * @return pageMargins
    **/
    @ApiModelProperty(value = "Gets or sets the margin around pages in HTML document. The margins value is measured in points and should be equal to or greater than 0. Default value is 10 points.")
    public Double getPageMargins() {
        return pageMargins;
    }

    public HtmlFixedSaveOptionsData pageMargins(Double pageMargins) {
        this.pageMargins = pageMargins;
        return this;
    }

    public void setPageMargins(Double pageMargins) {
        this.pageMargins = pageMargins;
    }


    /**
     * Gets or sets the physical folder where resources are saved when exporting the document.
    * @return resourcesFolder
    **/
    @ApiModelProperty(value = "Gets or sets the physical folder where resources are saved when exporting the document.")
    public String getResourcesFolder() {
        return resourcesFolder;
    }

    public HtmlFixedSaveOptionsData resourcesFolder(String resourcesFolder) {
        this.resourcesFolder = resourcesFolder;
        return this;
    }

    public void setResourcesFolder(String resourcesFolder) {
        this.resourcesFolder = resourcesFolder;
    }


    /**
     * Gets or sets the name of the folder used to construct resource URIs.
    * @return resourcesFolderAlias
    **/
    @ApiModelProperty(value = "Gets or sets the name of the folder used to construct resource URIs.")
    public String getResourcesFolderAlias() {
        return resourcesFolderAlias;
    }

    public HtmlFixedSaveOptionsData resourcesFolderAlias(String resourcesFolderAlias) {
        this.resourcesFolderAlias = resourcesFolderAlias;
        return this;
    }

    public void setResourcesFolderAlias(String resourcesFolderAlias) {
        this.resourcesFolderAlias = resourcesFolderAlias;
    }


    /**
     * Gets or sets a value indicating whether "@font-face" CSS rules should be placed into a separate file "fontFaces.css" when a document is being saved with external stylesheet (that is, when Aspose.Words.Saving.HtmlFixedSaveOptions.ExportEmbeddedCss is false). The default value is false, all CSS rules are written into single file "styles.css".
    * @return saveFontFaceCssSeparately
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether \"@font-face\" CSS rules should be placed into a separate file \"fontFaces.css\" when a document is being saved with external stylesheet (that is, when Aspose.Words.Saving.HtmlFixedSaveOptions.ExportEmbeddedCss is false). The default value is false, all CSS rules are written into single file \"styles.css\".")
    public Boolean getSaveFontFaceCssSeparately() {
        return saveFontFaceCssSeparately;
    }

    public HtmlFixedSaveOptionsData saveFontFaceCssSeparately(Boolean saveFontFaceCssSeparately) {
        this.saveFontFaceCssSeparately = saveFontFaceCssSeparately;
        return this;
    }

    public void setSaveFontFaceCssSeparately(Boolean saveFontFaceCssSeparately) {
        this.saveFontFaceCssSeparately = saveFontFaceCssSeparately;
    }


    /**
     * Gets or sets a value indicating whether to show border around pages.
    * @return showPageBorder
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to show border around pages.")
    public Boolean getShowPageBorder() {
        return showPageBorder;
    }

    public HtmlFixedSaveOptionsData showPageBorder(Boolean showPageBorder) {
        this.showPageBorder = showPageBorder;
        return this;
    }

    public void setShowPageBorder(Boolean showPageBorder) {
        this.showPageBorder = showPageBorder;
    }


    /**
     * Gets or sets a value indicating whether fonts from target machine must be used to display the document. If this flag is set to true, Aspose.Words.Saving.HtmlFixedSaveOptions.FontFormat and Aspose.Words.Saving.HtmlFixedSaveOptions.ExportEmbeddedFonts properties do not have effect, also Aspose.Words.Saving.HtmlFixedSaveOptions.ResourceSavingCallback is not fired for fonts. The default value is false.
    * @return useTargetMachineFonts
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether fonts from target machine must be used to display the document. If this flag is set to true, Aspose.Words.Saving.HtmlFixedSaveOptions.FontFormat and Aspose.Words.Saving.HtmlFixedSaveOptions.ExportEmbeddedFonts properties do not have effect, also Aspose.Words.Saving.HtmlFixedSaveOptions.ResourceSavingCallback is not fired for fonts. The default value is false.")
    public Boolean getUseTargetMachineFonts() {
        return useTargetMachineFonts;
    }

    public HtmlFixedSaveOptionsData useTargetMachineFonts(Boolean useTargetMachineFonts) {
        this.useTargetMachineFonts = useTargetMachineFonts;
        return this;
    }

    public void setUseTargetMachineFonts(Boolean useTargetMachineFonts) {
        this.useTargetMachineFonts = useTargetMachineFonts;
    }


    public HtmlFixedSaveOptionsData() {
        super();
        this.cssClassNamesPrefix = null;
        this.encoding = null;
        this.exportEmbeddedCss = null;
        this.exportEmbeddedFonts = null;
        this.exportEmbeddedImages = null;
        this.exportFormFields = null;
        this.fontFormat = null;
        this.pageHorizontalAlignment = null;
        this.pageMargins = null;
        this.resourcesFolder = null;
        this.resourcesFolderAlias = null;
        this.saveFontFaceCssSeparately = null;
        this.saveFormat = "htmlfixed";
        this.showPageBorder = null;
        this.useTargetMachineFonts = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        HtmlFixedSaveOptionsData htmlFixedSaveOptionsData = (HtmlFixedSaveOptionsData) o;
        return
            Objects.equals(this.cssClassNamesPrefix, htmlFixedSaveOptionsData.cssClassNamesPrefix) &&
            Objects.equals(this.encoding, htmlFixedSaveOptionsData.encoding) &&
            Objects.equals(this.exportEmbeddedCss, htmlFixedSaveOptionsData.exportEmbeddedCss) &&
            Objects.equals(this.exportEmbeddedFonts, htmlFixedSaveOptionsData.exportEmbeddedFonts) &&
            Objects.equals(this.exportEmbeddedImages, htmlFixedSaveOptionsData.exportEmbeddedImages) &&
            Objects.equals(this.exportFormFields, htmlFixedSaveOptionsData.exportFormFields) &&
            Objects.equals(this.fontFormat, htmlFixedSaveOptionsData.fontFormat) &&
            Objects.equals(this.pageHorizontalAlignment, htmlFixedSaveOptionsData.pageHorizontalAlignment) &&
            Objects.equals(this.pageMargins, htmlFixedSaveOptionsData.pageMargins) &&
            Objects.equals(this.resourcesFolder, htmlFixedSaveOptionsData.resourcesFolder) &&
            Objects.equals(this.resourcesFolderAlias, htmlFixedSaveOptionsData.resourcesFolderAlias) &&
            Objects.equals(this.saveFontFaceCssSeparately, htmlFixedSaveOptionsData.saveFontFaceCssSeparately) &&
            Objects.equals(this.showPageBorder, htmlFixedSaveOptionsData.showPageBorder) &&
            Objects.equals(this.useTargetMachineFonts, htmlFixedSaveOptionsData.useTargetMachineFonts) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cssClassNamesPrefix, encoding, exportEmbeddedCss, exportEmbeddedFonts, exportEmbeddedImages, exportFormFields, fontFormat, pageHorizontalAlignment, pageMargins, resourcesFolder, resourcesFolderAlias, saveFontFaceCssSeparately, showPageBorder, useTargetMachineFonts, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlFixedSaveOptionsData {\n");
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
    sb.append("    cssClassNamesPrefix: ").append(toIndentedString(getCssClassNamesPrefix())).append("\n");
    sb.append("    encoding: ").append(toIndentedString(getEncoding())).append("\n");
    sb.append("    exportEmbeddedCss: ").append(toIndentedString(getExportEmbeddedCss())).append("\n");
    sb.append("    exportEmbeddedFonts: ").append(toIndentedString(getExportEmbeddedFonts())).append("\n");
    sb.append("    exportEmbeddedImages: ").append(toIndentedString(getExportEmbeddedImages())).append("\n");
    sb.append("    exportFormFields: ").append(toIndentedString(getExportFormFields())).append("\n");
    sb.append("    fontFormat: ").append(toIndentedString(getFontFormat())).append("\n");
    sb.append("    pageHorizontalAlignment: ").append(toIndentedString(getPageHorizontalAlignment())).append("\n");
    sb.append("    pageMargins: ").append(toIndentedString(getPageMargins())).append("\n");
    sb.append("    resourcesFolder: ").append(toIndentedString(getResourcesFolder())).append("\n");
    sb.append("    resourcesFolderAlias: ").append(toIndentedString(getResourcesFolderAlias())).append("\n");
    sb.append("    saveFontFaceCssSeparately: ").append(toIndentedString(getSaveFontFaceCssSeparately())).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
    sb.append("    showPageBorder: ").append(toIndentedString(getShowPageBorder())).append("\n");
    sb.append("    useTargetMachineFonts: ").append(toIndentedString(getUseTargetMachineFonts())).append("\n");
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
