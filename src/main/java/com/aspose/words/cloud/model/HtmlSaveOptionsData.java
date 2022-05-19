/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="HtmlSaveOptionsData.java">
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
 * Container class for html save options.
 */
@ApiModel(description = "Container class for html save options.")
public class HtmlSaveOptionsData extends SaveOptionsData {
    /**
     * Gets or sets the option that controls how the CSS styles are exported.
     */
    @JsonAdapter(CssStyleSheetTypeEnum.Adapter.class)
    public enum CssStyleSheetTypeEnum {
        INLINE("Inline"),
        EMBEDDED("Embedded"),
        EXTERNAL("External");

        private String value;

        CssStyleSheetTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CssStyleSheetTypeEnum fromValue(String text) {
            for (CssStyleSheetTypeEnum b : CssStyleSheetTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< CssStyleSheetTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final CssStyleSheetTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CssStyleSheetTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CssStyleSheetTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls how the document should be split when saving.
     */
    @JsonAdapter(DocumentSplitCriteriaEnum.Adapter.class)
    public enum DocumentSplitCriteriaEnum {
        NONE("None"),
        PAGEBREAK("PageBreak"),
        COLUMNBREAK("ColumnBreak"),
        SECTIONBREAK("SectionBreak"),
        HEADINGPARAGRAPH("HeadingParagraph");

        private String value;

        DocumentSplitCriteriaEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DocumentSplitCriteriaEnum fromValue(String text) {
            for (DocumentSplitCriteriaEnum b : DocumentSplitCriteriaEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< DocumentSplitCriteriaEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final DocumentSplitCriteriaEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DocumentSplitCriteriaEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DocumentSplitCriteriaEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls how headers and footers are exported.
     */
    @JsonAdapter(ExportHeadersFootersModeEnum.Adapter.class)
    public enum ExportHeadersFootersModeEnum {
        NONE("None"),
        PERSECTION("PerSection"),
        FIRSTSECTIONHEADERLASTSECTIONFOOTER("FirstSectionHeaderLastSectionFooter"),
        FIRSTPAGEHEADERFOOTERPERSECTION("FirstPageHeaderFooterPerSection");

        private String value;

        ExportHeadersFootersModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ExportHeadersFootersModeEnum fromValue(String text) {
            for (ExportHeadersFootersModeEnum b : ExportHeadersFootersModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< ExportHeadersFootersModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final ExportHeadersFootersModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ExportHeadersFootersModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ExportHeadersFootersModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls how list labels are exported.
     */
    @JsonAdapter(ExportListLabelsEnum.Adapter.class)
    public enum ExportListLabelsEnum {
        AUTO("Auto"),
        ASINLINETEXT("AsInlineText"),
        BYHTMLTAGS("ByHtmlTags");

        private String value;

        ExportListLabelsEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ExportListLabelsEnum fromValue(String text) {
            for (ExportListLabelsEnum b : ExportListLabelsEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< ExportListLabelsEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final ExportListLabelsEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ExportListLabelsEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ExportListLabelsEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the version of HTML standard, that should be used when saving the document to HTML or MHTML.
     * Default value is Aspose.Words.Saving.HtmlVersion.Xhtml.
     */
    @JsonAdapter(HtmlVersionEnum.Adapter.class)
    public enum HtmlVersionEnum {
        XHTML("Xhtml"),
        HTML5("Html5");

        private String value;

        HtmlVersionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static HtmlVersionEnum fromValue(String text) {
            for (HtmlVersionEnum b : HtmlVersionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< HtmlVersionEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final HtmlVersionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public HtmlVersionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return HtmlVersionEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the options, that controls in what format metafiles are saved when exporting to HTML, MHTML, or EPUB.
     * The default value is Aspose.Words.Saving.HtmlMetafileFormat.Png, meaning that metafiles are rendered to raster PNG images.
     * Metafiles are not natively displayed by HTML browsers. By default, Aspose.Words converts WMF and EMF images into PNG files when exporting to HTML.Other options are to convert metafiles to SVG images or to export them as is without conversion.
     * Some image transforms, in particular image cropping, will not be applied to metafile images if they are exported to HTML without conversion.
     */
    @JsonAdapter(MetafileFormatEnum.Adapter.class)
    public enum MetafileFormatEnum {
        PNG("Png"),
        SVG("Svg"),
        EMFORWMF("EmfOrWmf");

        private String value;

        MetafileFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MetafileFormatEnum fromValue(String text) {
            for (MetafileFormatEnum b : MetafileFormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< MetafileFormatEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final MetafileFormatEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MetafileFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MetafileFormatEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls how OfficeMath objects are exported to HTML, MHTML or EPUB. The default value is HtmlOfficeMathOutputMode.Image.
     */
    @JsonAdapter(OfficeMathOutputModeEnum.Adapter.class)
    public enum OfficeMathOutputModeEnum {
        IMAGE("Image"),
        MATHML("MathML"),
        TEXT("Text");

        private String value;

        OfficeMathOutputModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OfficeMathOutputModeEnum fromValue(String text) {
            for (OfficeMathOutputModeEnum b : OfficeMathOutputModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< OfficeMathOutputModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final OfficeMathOutputModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OfficeMathOutputModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OfficeMathOutputModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls how table, row and cell widths are exported.
     */
    @JsonAdapter(TableWidthOutputModeEnum.Adapter.class)
    public enum TableWidthOutputModeEnum {
        ALL("All"),
        RELATIVEONLY("RelativeOnly"),
        NONE("None");

        private String value;

        TableWidthOutputModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TableWidthOutputModeEnum fromValue(String text) {
            for (TableWidthOutputModeEnum b : TableWidthOutputModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TableWidthOutputModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TableWidthOutputModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TableWidthOutputModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TableWidthOutputModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("AllowNegativeIndent")
    protected Boolean allowNegativeIndent;

    @SerializedName("CssClassNamePrefix")
    protected String cssClassNamePrefix;

    @SerializedName("CssStyleSheetFileName")
    protected String cssStyleSheetFileName;

    @SerializedName("CssStyleSheetType")
    protected CssStyleSheetTypeEnum cssStyleSheetType;

    @SerializedName("DocumentSplitCriteria")
    protected DocumentSplitCriteriaEnum documentSplitCriteria;

    @SerializedName("DocumentSplitHeadingLevel")
    protected Integer documentSplitHeadingLevel;

    @SerializedName("Encoding")
    protected String encoding;

    @SerializedName("ExportDocumentProperties")
    protected Boolean exportDocumentProperties;

    @SerializedName("ExportDropDownFormFieldAsText")
    protected Boolean exportDropDownFormFieldAsText;

    @SerializedName("ExportFontResources")
    protected Boolean exportFontResources;

    @SerializedName("ExportFontsAsBase64")
    protected Boolean exportFontsAsBase64;

    @SerializedName("ExportHeadersFootersMode")
    protected ExportHeadersFootersModeEnum exportHeadersFootersMode;

    @SerializedName("ExportImagesAsBase64")
    protected Boolean exportImagesAsBase64;

    @SerializedName("ExportLanguageInformation")
    protected Boolean exportLanguageInformation;

    @SerializedName("ExportListLabels")
    protected ExportListLabelsEnum exportListLabels;

    @SerializedName("ExportOriginalUrlForLinkedImages")
    protected Boolean exportOriginalUrlForLinkedImages;

    @SerializedName("ExportPageMargins")
    protected Boolean exportPageMargins;

    @SerializedName("ExportPageSetup")
    protected Boolean exportPageSetup;

    @SerializedName("ExportRelativeFontSize")
    protected Boolean exportRelativeFontSize;

    @SerializedName("ExportRoundtripInformation")
    protected Boolean exportRoundtripInformation;

    @SerializedName("ExportTextInputFormFieldAsText")
    protected Boolean exportTextInputFormFieldAsText;

    @SerializedName("ExportTocPageNumbers")
    protected Boolean exportTocPageNumbers;

    @SerializedName("ExportXhtmlTransitional")
    protected Boolean exportXhtmlTransitional;

    @SerializedName("FontResourcesSubsettingSizeThreshold")
    protected Integer fontResourcesSubsettingSizeThreshold;

    @SerializedName("FontsFolder")
    protected String fontsFolder;

    @SerializedName("FontsFolderAlias")
    protected String fontsFolderAlias;

    @SerializedName("HtmlVersion")
    protected HtmlVersionEnum htmlVersion;

    @SerializedName("ImageResolution")
    protected Integer imageResolution;

    @SerializedName("ImagesFolder")
    protected String imagesFolder;

    @SerializedName("ImagesFolderAlias")
    protected String imagesFolderAlias;

    @SerializedName("MetafileFormat")
    protected MetafileFormatEnum metafileFormat;

    @SerializedName("OfficeMathOutputMode")
    protected OfficeMathOutputModeEnum officeMathOutputMode;

    @SerializedName("PrettyFormat")
    protected Boolean prettyFormat;

    @SerializedName("ResolveFontNames")
    protected Boolean resolveFontNames;

    @SerializedName("ResourceFolder")
    protected String resourceFolder;

    @SerializedName("ResourceFolderAlias")
    protected String resourceFolderAlias;

    @SerializedName("ScaleImageToShapeSize")
    protected Boolean scaleImageToShapeSize;

    @SerializedName("TableWidthOutputMode")
    protected TableWidthOutputModeEnum tableWidthOutputMode;
    /**
     * Gets or sets a value indicating whether negative left and right indents of paragraphs are allowed (not normalized).
    * @return allowNegativeIndent
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether negative left and right indents of paragraphs are allowed (not normalized).")
    public Boolean getAllowNegativeIndent() {
        return allowNegativeIndent;
    }

    public HtmlSaveOptionsData allowNegativeIndent(Boolean allowNegativeIndent) {
        this.allowNegativeIndent = allowNegativeIndent;
        return this;
    }

    public void setAllowNegativeIndent(Boolean allowNegativeIndent) {
        this.allowNegativeIndent = allowNegativeIndent;
    }


    /**
     * Gets or sets the prefix which is added to all CSS class names. The default value is an empty string and generated CSS class names have no common prefix.
     * If this value is not empty, all CSS classes generated by Aspose.Words will start with the specified prefix.This might be useful, for example, if you add custom CSS to generated documents and want to prevent class name conflicts.
     * If the value is not null or empty, it must be a valid CSS identifier.
    * @return cssClassNamePrefix
    **/
    @ApiModelProperty(value = "Gets or sets the prefix which is added to all CSS class names. The default value is an empty string and generated CSS class names have no common prefix. If this value is not empty, all CSS classes generated by Aspose.Words will start with the specified prefix.This might be useful, for example, if you add custom CSS to generated documents and want to prevent class name conflicts. If the value is not null or empty, it must be a valid CSS identifier.")
    public String getCssClassNamePrefix() {
        return cssClassNamePrefix;
    }

    public HtmlSaveOptionsData cssClassNamePrefix(String cssClassNamePrefix) {
        this.cssClassNamePrefix = cssClassNamePrefix;
        return this;
    }

    public void setCssClassNamePrefix(String cssClassNamePrefix) {
        this.cssClassNamePrefix = cssClassNamePrefix;
    }


    /**
     * Gets or sets the name of the CSS file written when the document is exported to HTML.
    * @return cssStyleSheetFileName
    **/
    @ApiModelProperty(value = "Gets or sets the name of the CSS file written when the document is exported to HTML.")
    public String getCssStyleSheetFileName() {
        return cssStyleSheetFileName;
    }

    public HtmlSaveOptionsData cssStyleSheetFileName(String cssStyleSheetFileName) {
        this.cssStyleSheetFileName = cssStyleSheetFileName;
        return this;
    }

    public void setCssStyleSheetFileName(String cssStyleSheetFileName) {
        this.cssStyleSheetFileName = cssStyleSheetFileName;
    }


    /**
     * Gets or sets the option that controls how the CSS styles are exported.
    * @return cssStyleSheetType
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how the CSS styles are exported.")
    public CssStyleSheetTypeEnum getCssStyleSheetType() {
        return cssStyleSheetType;
    }

    public HtmlSaveOptionsData cssStyleSheetType(CssStyleSheetTypeEnum cssStyleSheetType) {
        this.cssStyleSheetType = cssStyleSheetType;
        return this;
    }

    public void setCssStyleSheetType(CssStyleSheetTypeEnum cssStyleSheetType) {
        this.cssStyleSheetType = cssStyleSheetType;
    }


    /**
     * Gets or sets the option that controls how the document should be split when saving.
    * @return documentSplitCriteria
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how the document should be split when saving.")
    public DocumentSplitCriteriaEnum getDocumentSplitCriteria() {
        return documentSplitCriteria;
    }

    public HtmlSaveOptionsData documentSplitCriteria(DocumentSplitCriteriaEnum documentSplitCriteria) {
        this.documentSplitCriteria = documentSplitCriteria;
        return this;
    }

    public void setDocumentSplitCriteria(DocumentSplitCriteriaEnum documentSplitCriteria) {
        this.documentSplitCriteria = documentSplitCriteria;
    }


    /**
     * Gets or sets the maximum level of headings at which to split the document.
    * @return documentSplitHeadingLevel
    **/
    @ApiModelProperty(value = "Gets or sets the maximum level of headings at which to split the document.")
    public Integer getDocumentSplitHeadingLevel() {
        return documentSplitHeadingLevel;
    }

    public HtmlSaveOptionsData documentSplitHeadingLevel(Integer documentSplitHeadingLevel) {
        this.documentSplitHeadingLevel = documentSplitHeadingLevel;
        return this;
    }

    public void setDocumentSplitHeadingLevel(Integer documentSplitHeadingLevel) {
        this.documentSplitHeadingLevel = documentSplitHeadingLevel;
    }


    /**
     * Gets or sets the character encoding to use when exporting.
    * @return encoding
    **/
    @ApiModelProperty(value = "Gets or sets the character encoding to use when exporting.")
    public String getEncoding() {
        return encoding;
    }

    public HtmlSaveOptionsData encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }


    /**
     * Gets or sets a value indicating whether to export built-in and custom document properties.
    * @return exportDocumentProperties
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to export built-in and custom document properties.")
    public Boolean getExportDocumentProperties() {
        return exportDocumentProperties;
    }

    public HtmlSaveOptionsData exportDocumentProperties(Boolean exportDocumentProperties) {
        this.exportDocumentProperties = exportDocumentProperties;
        return this;
    }

    public void setExportDocumentProperties(Boolean exportDocumentProperties) {
        this.exportDocumentProperties = exportDocumentProperties;
    }


    /**
     * Gets or sets the flag, that controls how drop-down form fields are saved to HTML.
     * The default value is false.
    * @return exportDropDownFormFieldAsText
    **/
    @ApiModelProperty(value = "Gets or sets the flag, that controls how drop-down form fields are saved to HTML. The default value is false.")
    public Boolean getExportDropDownFormFieldAsText() {
        return exportDropDownFormFieldAsText;
    }

    public HtmlSaveOptionsData exportDropDownFormFieldAsText(Boolean exportDropDownFormFieldAsText) {
        this.exportDropDownFormFieldAsText = exportDropDownFormFieldAsText;
        return this;
    }

    public void setExportDropDownFormFieldAsText(Boolean exportDropDownFormFieldAsText) {
        this.exportDropDownFormFieldAsText = exportDropDownFormFieldAsText;
    }


    /**
     * Gets or sets a value indicating whether font resources should be exported.
    * @return exportFontResources
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether font resources should be exported.")
    public Boolean getExportFontResources() {
        return exportFontResources;
    }

    public HtmlSaveOptionsData exportFontResources(Boolean exportFontResources) {
        this.exportFontResources = exportFontResources;
        return this;
    }

    public void setExportFontResources(Boolean exportFontResources) {
        this.exportFontResources = exportFontResources;
    }


    /**
     * Gets or sets a value indicating whether fonts resources should be embedded to HTML in Base64 encoding. The default value is false.
    * @return exportFontsAsBase64
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether fonts resources should be embedded to HTML in Base64 encoding. The default value is false.")
    public Boolean getExportFontsAsBase64() {
        return exportFontsAsBase64;
    }

    public HtmlSaveOptionsData exportFontsAsBase64(Boolean exportFontsAsBase64) {
        this.exportFontsAsBase64 = exportFontsAsBase64;
        return this;
    }

    public void setExportFontsAsBase64(Boolean exportFontsAsBase64) {
        this.exportFontsAsBase64 = exportFontsAsBase64;
    }


    /**
     * Gets or sets the option that controls how headers and footers are exported.
    * @return exportHeadersFootersMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how headers and footers are exported.")
    public ExportHeadersFootersModeEnum getExportHeadersFootersMode() {
        return exportHeadersFootersMode;
    }

    public HtmlSaveOptionsData exportHeadersFootersMode(ExportHeadersFootersModeEnum exportHeadersFootersMode) {
        this.exportHeadersFootersMode = exportHeadersFootersMode;
        return this;
    }

    public void setExportHeadersFootersMode(ExportHeadersFootersModeEnum exportHeadersFootersMode) {
        this.exportHeadersFootersMode = exportHeadersFootersMode;
    }


    /**
     * Gets or sets a value indicating whether images are saved in Base64 format.
    * @return exportImagesAsBase64
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether images are saved in Base64 format.")
    public Boolean getExportImagesAsBase64() {
        return exportImagesAsBase64;
    }

    public HtmlSaveOptionsData exportImagesAsBase64(Boolean exportImagesAsBase64) {
        this.exportImagesAsBase64 = exportImagesAsBase64;
        return this;
    }

    public void setExportImagesAsBase64(Boolean exportImagesAsBase64) {
        this.exportImagesAsBase64 = exportImagesAsBase64;
    }


    /**
     * Gets or sets a value indicating whether language information is exported.
    * @return exportLanguageInformation
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether language information is exported.")
    public Boolean getExportLanguageInformation() {
        return exportLanguageInformation;
    }

    public HtmlSaveOptionsData exportLanguageInformation(Boolean exportLanguageInformation) {
        this.exportLanguageInformation = exportLanguageInformation;
        return this;
    }

    public void setExportLanguageInformation(Boolean exportLanguageInformation) {
        this.exportLanguageInformation = exportLanguageInformation;
    }


    /**
     * Gets or sets the option that controls how list labels are exported.
    * @return exportListLabels
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how list labels are exported.")
    public ExportListLabelsEnum getExportListLabels() {
        return exportListLabels;
    }

    public HtmlSaveOptionsData exportListLabels(ExportListLabelsEnum exportListLabels) {
        this.exportListLabels = exportListLabels;
        return this;
    }

    public void setExportListLabels(ExportListLabelsEnum exportListLabels) {
        this.exportListLabels = exportListLabels;
    }


    /**
     * Gets or sets a value indicating whether the original URL should be used as the URL of the linked images.
     * The default value is false.
    * @return exportOriginalUrlForLinkedImages
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the original URL should be used as the URL of the linked images. The default value is false.")
    public Boolean getExportOriginalUrlForLinkedImages() {
        return exportOriginalUrlForLinkedImages;
    }

    public HtmlSaveOptionsData exportOriginalUrlForLinkedImages(Boolean exportOriginalUrlForLinkedImages) {
        this.exportOriginalUrlForLinkedImages = exportOriginalUrlForLinkedImages;
        return this;
    }

    public void setExportOriginalUrlForLinkedImages(Boolean exportOriginalUrlForLinkedImages) {
        this.exportOriginalUrlForLinkedImages = exportOriginalUrlForLinkedImages;
    }


    /**
     * Gets or sets a value indicating whether page margins are exported to HTML, MHTML or EPUB.
     * The default value is false.
    * @return exportPageMargins
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether page margins are exported to HTML, MHTML or EPUB. The default value is false.")
    public Boolean getExportPageMargins() {
        return exportPageMargins;
    }

    public HtmlSaveOptionsData exportPageMargins(Boolean exportPageMargins) {
        this.exportPageMargins = exportPageMargins;
        return this;
    }

    public void setExportPageMargins(Boolean exportPageMargins) {
        this.exportPageMargins = exportPageMargins;
    }


    /**
     * Gets or sets a value indicating whether page setup is exported.
    * @return exportPageSetup
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether page setup is exported.")
    public Boolean getExportPageSetup() {
        return exportPageSetup;
    }

    public HtmlSaveOptionsData exportPageSetup(Boolean exportPageSetup) {
        this.exportPageSetup = exportPageSetup;
        return this;
    }

    public void setExportPageSetup(Boolean exportPageSetup) {
        this.exportPageSetup = exportPageSetup;
    }


    /**
     * Gets or sets a value indicating whether font sizes should be output in relative units when saving.
    * @return exportRelativeFontSize
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether font sizes should be output in relative units when saving.")
    public Boolean getExportRelativeFontSize() {
        return exportRelativeFontSize;
    }

    public HtmlSaveOptionsData exportRelativeFontSize(Boolean exportRelativeFontSize) {
        this.exportRelativeFontSize = exportRelativeFontSize;
        return this;
    }

    public void setExportRelativeFontSize(Boolean exportRelativeFontSize) {
        this.exportRelativeFontSize = exportRelativeFontSize;
    }


    /**
     * Gets or sets a value indicating whether to write the roundtrip information when saving to HTML. The default value is true.
    * @return exportRoundtripInformation
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to write the roundtrip information when saving to HTML. The default value is true.")
    public Boolean getExportRoundtripInformation() {
        return exportRoundtripInformation;
    }

    public HtmlSaveOptionsData exportRoundtripInformation(Boolean exportRoundtripInformation) {
        this.exportRoundtripInformation = exportRoundtripInformation;
        return this;
    }

    public void setExportRoundtripInformation(Boolean exportRoundtripInformation) {
        this.exportRoundtripInformation = exportRoundtripInformation;
    }


    /**
     * Gets or sets the flag, that controls how text input form fields are saved.
    * @return exportTextInputFormFieldAsText
    **/
    @ApiModelProperty(value = "Gets or sets the flag, that controls how text input form fields are saved.")
    public Boolean getExportTextInputFormFieldAsText() {
        return exportTextInputFormFieldAsText;
    }

    public HtmlSaveOptionsData exportTextInputFormFieldAsText(Boolean exportTextInputFormFieldAsText) {
        this.exportTextInputFormFieldAsText = exportTextInputFormFieldAsText;
        return this;
    }

    public void setExportTextInputFormFieldAsText(Boolean exportTextInputFormFieldAsText) {
        this.exportTextInputFormFieldAsText = exportTextInputFormFieldAsText;
    }


    /**
     * Gets or sets a value indicating whether to write page numbers to table of contents when saving.
    * @return exportTocPageNumbers
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to write page numbers to table of contents when saving.")
    public Boolean getExportTocPageNumbers() {
        return exportTocPageNumbers;
    }

    public HtmlSaveOptionsData exportTocPageNumbers(Boolean exportTocPageNumbers) {
        this.exportTocPageNumbers = exportTocPageNumbers;
        return this;
    }

    public void setExportTocPageNumbers(Boolean exportTocPageNumbers) {
        this.exportTocPageNumbers = exportTocPageNumbers;
    }


    /**
     * Gets or sets a value indicating whether to write the DOCTYPE declaration when saving.
    * @return exportXhtmlTransitional
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to write the DOCTYPE declaration when saving.")
    public Boolean getExportXhtmlTransitional() {
        return exportXhtmlTransitional;
    }

    public HtmlSaveOptionsData exportXhtmlTransitional(Boolean exportXhtmlTransitional) {
        this.exportXhtmlTransitional = exportXhtmlTransitional;
        return this;
    }

    public void setExportXhtmlTransitional(Boolean exportXhtmlTransitional) {
        this.exportXhtmlTransitional = exportXhtmlTransitional;
    }


    /**
     * Gets or sets the option that controls which font resources need subsetting when saving.
    * @return fontResourcesSubsettingSizeThreshold
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls which font resources need subsetting when saving.")
    public Integer getFontResourcesSubsettingSizeThreshold() {
        return fontResourcesSubsettingSizeThreshold;
    }

    public HtmlSaveOptionsData fontResourcesSubsettingSizeThreshold(Integer fontResourcesSubsettingSizeThreshold) {
        this.fontResourcesSubsettingSizeThreshold = fontResourcesSubsettingSizeThreshold;
        return this;
    }

    public void setFontResourcesSubsettingSizeThreshold(Integer fontResourcesSubsettingSizeThreshold) {
        this.fontResourcesSubsettingSizeThreshold = fontResourcesSubsettingSizeThreshold;
    }


    /**
     * Gets or sets the physical folder where fonts are saved when exporting a document.
    * @return fontsFolder
    **/
    @ApiModelProperty(value = "Gets or sets the physical folder where fonts are saved when exporting a document.")
    public String getFontsFolder() {
        return fontsFolder;
    }

    public HtmlSaveOptionsData fontsFolder(String fontsFolder) {
        this.fontsFolder = fontsFolder;
        return this;
    }

    public void setFontsFolder(String fontsFolder) {
        this.fontsFolder = fontsFolder;
    }


    /**
     * Gets or sets the name of the folder used to construct font URIs.
    * @return fontsFolderAlias
    **/
    @ApiModelProperty(value = "Gets or sets the name of the folder used to construct font URIs.")
    public String getFontsFolderAlias() {
        return fontsFolderAlias;
    }

    public HtmlSaveOptionsData fontsFolderAlias(String fontsFolderAlias) {
        this.fontsFolderAlias = fontsFolderAlias;
        return this;
    }

    public void setFontsFolderAlias(String fontsFolderAlias) {
        this.fontsFolderAlias = fontsFolderAlias;
    }


    /**
     * Gets or sets the version of HTML standard, that should be used when saving the document to HTML or MHTML.
     * Default value is Aspose.Words.Saving.HtmlVersion.Xhtml.
    * @return htmlVersion
    **/
    @ApiModelProperty(value = "Gets or sets the version of HTML standard, that should be used when saving the document to HTML or MHTML. Default value is Aspose.Words.Saving.HtmlVersion.Xhtml.")
    public HtmlVersionEnum getHtmlVersion() {
        return htmlVersion;
    }

    public HtmlSaveOptionsData htmlVersion(HtmlVersionEnum htmlVersion) {
        this.htmlVersion = htmlVersion;
        return this;
    }

    public void setHtmlVersion(HtmlVersionEnum htmlVersion) {
        this.htmlVersion = htmlVersion;
    }


    /**
     * Gets or sets the output resolution for images when exporting.
    * @return imageResolution
    **/
    @ApiModelProperty(value = "Gets or sets the output resolution for images when exporting.")
    public Integer getImageResolution() {
        return imageResolution;
    }

    public HtmlSaveOptionsData imageResolution(Integer imageResolution) {
        this.imageResolution = imageResolution;
        return this;
    }

    public void setImageResolution(Integer imageResolution) {
        this.imageResolution = imageResolution;
    }


    /**
     * Gets or sets the physical folder where images are saved when exporting a document.
    * @return imagesFolder
    **/
    @ApiModelProperty(value = "Gets or sets the physical folder where images are saved when exporting a document.")
    public String getImagesFolder() {
        return imagesFolder;
    }

    public HtmlSaveOptionsData imagesFolder(String imagesFolder) {
        this.imagesFolder = imagesFolder;
        return this;
    }

    public void setImagesFolder(String imagesFolder) {
        this.imagesFolder = imagesFolder;
    }


    /**
     * Gets or sets the name of the folder used to construct image URIs.
    * @return imagesFolderAlias
    **/
    @ApiModelProperty(value = "Gets or sets the name of the folder used to construct image URIs.")
    public String getImagesFolderAlias() {
        return imagesFolderAlias;
    }

    public HtmlSaveOptionsData imagesFolderAlias(String imagesFolderAlias) {
        this.imagesFolderAlias = imagesFolderAlias;
        return this;
    }

    public void setImagesFolderAlias(String imagesFolderAlias) {
        this.imagesFolderAlias = imagesFolderAlias;
    }


    /**
     * Gets or sets the options, that controls in what format metafiles are saved when exporting to HTML, MHTML, or EPUB.
     * The default value is Aspose.Words.Saving.HtmlMetafileFormat.Png, meaning that metafiles are rendered to raster PNG images.
     * Metafiles are not natively displayed by HTML browsers. By default, Aspose.Words converts WMF and EMF images into PNG files when exporting to HTML.Other options are to convert metafiles to SVG images or to export them as is without conversion.
     * Some image transforms, in particular image cropping, will not be applied to metafile images if they are exported to HTML without conversion.
    * @return metafileFormat
    **/
    @ApiModelProperty(value = "Gets or sets the options, that controls in what format metafiles are saved when exporting to HTML, MHTML, or EPUB. The default value is Aspose.Words.Saving.HtmlMetafileFormat.Png, meaning that metafiles are rendered to raster PNG images. Metafiles are not natively displayed by HTML browsers. By default, Aspose.Words converts WMF and EMF images into PNG files when exporting to HTML.Other options are to convert metafiles to SVG images or to export them as is without conversion. Some image transforms, in particular image cropping, will not be applied to metafile images if they are exported to HTML without conversion.")
    public MetafileFormatEnum getMetafileFormat() {
        return metafileFormat;
    }

    public HtmlSaveOptionsData metafileFormat(MetafileFormatEnum metafileFormat) {
        this.metafileFormat = metafileFormat;
        return this;
    }

    public void setMetafileFormat(MetafileFormatEnum metafileFormat) {
        this.metafileFormat = metafileFormat;
    }


    /**
     * Gets or sets the option that controls how OfficeMath objects are exported to HTML, MHTML or EPUB. The default value is HtmlOfficeMathOutputMode.Image.
    * @return officeMathOutputMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how OfficeMath objects are exported to HTML, MHTML or EPUB. The default value is HtmlOfficeMathOutputMode.Image.")
    public OfficeMathOutputModeEnum getOfficeMathOutputMode() {
        return officeMathOutputMode;
    }

    public HtmlSaveOptionsData officeMathOutputMode(OfficeMathOutputModeEnum officeMathOutputMode) {
        this.officeMathOutputMode = officeMathOutputMode;
        return this;
    }

    public void setOfficeMathOutputMode(OfficeMathOutputModeEnum officeMathOutputMode) {
        this.officeMathOutputMode = officeMathOutputMode;
    }


    /**
     * Gets or sets a value indicating whether to use pretty formats output.
    * @return prettyFormat
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to use pretty formats output.")
    public Boolean getPrettyFormat() {
        return prettyFormat;
    }

    public HtmlSaveOptionsData prettyFormat(Boolean prettyFormat) {
        this.prettyFormat = prettyFormat;
        return this;
    }

    public void setPrettyFormat(Boolean prettyFormat) {
        this.prettyFormat = prettyFormat;
    }


    /**
     * Gets or sets a value indicating whether font family names used in the document are resolved and substituted according to FontSettings when being written into HTML-based formats.
     * The default value is false.
    * @return resolveFontNames
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether font family names used in the document are resolved and substituted according to FontSettings when being written into HTML-based formats. The default value is false.")
    public Boolean getResolveFontNames() {
        return resolveFontNames;
    }

    public HtmlSaveOptionsData resolveFontNames(Boolean resolveFontNames) {
        this.resolveFontNames = resolveFontNames;
        return this;
    }

    public void setResolveFontNames(Boolean resolveFontNames) {
        this.resolveFontNames = resolveFontNames;
    }


    /**
     * Gets or sets the physical folder where all resources like images, fonts, and external CSS are saved when a document is exported to HTML. The default value is an empty string.
    * @return resourceFolder
    **/
    @ApiModelProperty(value = "Gets or sets the physical folder where all resources like images, fonts, and external CSS are saved when a document is exported to HTML. The default value is an empty string.")
    public String getResourceFolder() {
        return resourceFolder;
    }

    public HtmlSaveOptionsData resourceFolder(String resourceFolder) {
        this.resourceFolder = resourceFolder;
        return this;
    }

    public void setResourceFolder(String resourceFolder) {
        this.resourceFolder = resourceFolder;
    }


    /**
     * Gets or sets the name of the folder used to construct URIs of all resources written into HTML document. The default value is an empty string.
    * @return resourceFolderAlias
    **/
    @ApiModelProperty(value = "Gets or sets the name of the folder used to construct URIs of all resources written into HTML document. The default value is an empty string.")
    public String getResourceFolderAlias() {
        return resourceFolderAlias;
    }

    public HtmlSaveOptionsData resourceFolderAlias(String resourceFolderAlias) {
        this.resourceFolderAlias = resourceFolderAlias;
        return this;
    }

    public void setResourceFolderAlias(String resourceFolderAlias) {
        this.resourceFolderAlias = resourceFolderAlias;
    }


    /**
     * Gets or sets a value indicating whether images are scaled by Aspose.Words to the bounding shape size when exporting.
    * @return scaleImageToShapeSize
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether images are scaled by Aspose.Words to the bounding shape size when exporting.")
    public Boolean getScaleImageToShapeSize() {
        return scaleImageToShapeSize;
    }

    public HtmlSaveOptionsData scaleImageToShapeSize(Boolean scaleImageToShapeSize) {
        this.scaleImageToShapeSize = scaleImageToShapeSize;
        return this;
    }

    public void setScaleImageToShapeSize(Boolean scaleImageToShapeSize) {
        this.scaleImageToShapeSize = scaleImageToShapeSize;
    }


    /**
     * Gets or sets the option that controls how table, row and cell widths are exported.
    * @return tableWidthOutputMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how table, row and cell widths are exported.")
    public TableWidthOutputModeEnum getTableWidthOutputMode() {
        return tableWidthOutputMode;
    }

    public HtmlSaveOptionsData tableWidthOutputMode(TableWidthOutputModeEnum tableWidthOutputMode) {
        this.tableWidthOutputMode = tableWidthOutputMode;
        return this;
    }

    public void setTableWidthOutputMode(TableWidthOutputModeEnum tableWidthOutputMode) {
        this.tableWidthOutputMode = tableWidthOutputMode;
    }


    public HtmlSaveOptionsData() {
        super();
        this.allowNegativeIndent = null;
        this.cssClassNamePrefix = null;
        this.cssStyleSheetFileName = null;
        this.cssStyleSheetType = null;
        this.documentSplitCriteria = null;
        this.documentSplitHeadingLevel = null;
        this.encoding = null;
        this.exportDocumentProperties = null;
        this.exportDropDownFormFieldAsText = null;
        this.exportFontResources = null;
        this.exportFontsAsBase64 = null;
        this.exportHeadersFootersMode = null;
        this.exportImagesAsBase64 = null;
        this.exportLanguageInformation = null;
        this.exportListLabels = null;
        this.exportOriginalUrlForLinkedImages = null;
        this.exportPageMargins = null;
        this.exportPageSetup = null;
        this.exportRelativeFontSize = null;
        this.exportRoundtripInformation = null;
        this.exportTextInputFormFieldAsText = null;
        this.exportTocPageNumbers = null;
        this.exportXhtmlTransitional = null;
        this.fontResourcesSubsettingSizeThreshold = null;
        this.fontsFolder = null;
        this.fontsFolderAlias = null;
        this.htmlVersion = null;
        this.imageResolution = null;
        this.imagesFolder = null;
        this.imagesFolderAlias = null;
        this.metafileFormat = null;
        this.officeMathOutputMode = null;
        this.prettyFormat = null;
        this.resolveFontNames = null;
        this.resourceFolder = null;
        this.resourceFolderAlias = null;
        this.saveFormat = "html";
        this.scaleImageToShapeSize = null;
        this.tableWidthOutputMode = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        HtmlSaveOptionsData htmlSaveOptionsData = (HtmlSaveOptionsData) o;
        return
            Objects.equals(this.allowNegativeIndent, htmlSaveOptionsData.allowNegativeIndent) &&
            Objects.equals(this.cssClassNamePrefix, htmlSaveOptionsData.cssClassNamePrefix) &&
            Objects.equals(this.cssStyleSheetFileName, htmlSaveOptionsData.cssStyleSheetFileName) &&
            Objects.equals(this.cssStyleSheetType, htmlSaveOptionsData.cssStyleSheetType) &&
            Objects.equals(this.documentSplitCriteria, htmlSaveOptionsData.documentSplitCriteria) &&
            Objects.equals(this.documentSplitHeadingLevel, htmlSaveOptionsData.documentSplitHeadingLevel) &&
            Objects.equals(this.encoding, htmlSaveOptionsData.encoding) &&
            Objects.equals(this.exportDocumentProperties, htmlSaveOptionsData.exportDocumentProperties) &&
            Objects.equals(this.exportDropDownFormFieldAsText, htmlSaveOptionsData.exportDropDownFormFieldAsText) &&
            Objects.equals(this.exportFontResources, htmlSaveOptionsData.exportFontResources) &&
            Objects.equals(this.exportFontsAsBase64, htmlSaveOptionsData.exportFontsAsBase64) &&
            Objects.equals(this.exportHeadersFootersMode, htmlSaveOptionsData.exportHeadersFootersMode) &&
            Objects.equals(this.exportImagesAsBase64, htmlSaveOptionsData.exportImagesAsBase64) &&
            Objects.equals(this.exportLanguageInformation, htmlSaveOptionsData.exportLanguageInformation) &&
            Objects.equals(this.exportListLabels, htmlSaveOptionsData.exportListLabels) &&
            Objects.equals(this.exportOriginalUrlForLinkedImages, htmlSaveOptionsData.exportOriginalUrlForLinkedImages) &&
            Objects.equals(this.exportPageMargins, htmlSaveOptionsData.exportPageMargins) &&
            Objects.equals(this.exportPageSetup, htmlSaveOptionsData.exportPageSetup) &&
            Objects.equals(this.exportRelativeFontSize, htmlSaveOptionsData.exportRelativeFontSize) &&
            Objects.equals(this.exportRoundtripInformation, htmlSaveOptionsData.exportRoundtripInformation) &&
            Objects.equals(this.exportTextInputFormFieldAsText, htmlSaveOptionsData.exportTextInputFormFieldAsText) &&
            Objects.equals(this.exportTocPageNumbers, htmlSaveOptionsData.exportTocPageNumbers) &&
            Objects.equals(this.exportXhtmlTransitional, htmlSaveOptionsData.exportXhtmlTransitional) &&
            Objects.equals(this.fontResourcesSubsettingSizeThreshold, htmlSaveOptionsData.fontResourcesSubsettingSizeThreshold) &&
            Objects.equals(this.fontsFolder, htmlSaveOptionsData.fontsFolder) &&
            Objects.equals(this.fontsFolderAlias, htmlSaveOptionsData.fontsFolderAlias) &&
            Objects.equals(this.htmlVersion, htmlSaveOptionsData.htmlVersion) &&
            Objects.equals(this.imageResolution, htmlSaveOptionsData.imageResolution) &&
            Objects.equals(this.imagesFolder, htmlSaveOptionsData.imagesFolder) &&
            Objects.equals(this.imagesFolderAlias, htmlSaveOptionsData.imagesFolderAlias) &&
            Objects.equals(this.metafileFormat, htmlSaveOptionsData.metafileFormat) &&
            Objects.equals(this.officeMathOutputMode, htmlSaveOptionsData.officeMathOutputMode) &&
            Objects.equals(this.prettyFormat, htmlSaveOptionsData.prettyFormat) &&
            Objects.equals(this.resolveFontNames, htmlSaveOptionsData.resolveFontNames) &&
            Objects.equals(this.resourceFolder, htmlSaveOptionsData.resourceFolder) &&
            Objects.equals(this.resourceFolderAlias, htmlSaveOptionsData.resourceFolderAlias) &&
            Objects.equals(this.scaleImageToShapeSize, htmlSaveOptionsData.scaleImageToShapeSize) &&
            Objects.equals(this.tableWidthOutputMode, htmlSaveOptionsData.tableWidthOutputMode) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowNegativeIndent, cssClassNamePrefix, cssStyleSheetFileName, cssStyleSheetType, documentSplitCriteria, documentSplitHeadingLevel, encoding, exportDocumentProperties, exportDropDownFormFieldAsText, exportFontResources, exportFontsAsBase64, exportHeadersFootersMode, exportImagesAsBase64, exportLanguageInformation, exportListLabels, exportOriginalUrlForLinkedImages, exportPageMargins, exportPageSetup, exportRelativeFontSize, exportRoundtripInformation, exportTextInputFormFieldAsText, exportTocPageNumbers, exportXhtmlTransitional, fontResourcesSubsettingSizeThreshold, fontsFolder, fontsFolderAlias, htmlVersion, imageResolution, imagesFolder, imagesFolderAlias, metafileFormat, officeMathOutputMode, prettyFormat, resolveFontNames, resourceFolder, resourceFolderAlias, scaleImageToShapeSize, tableWidthOutputMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlSaveOptionsData {\n");
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
    sb.append("    allowNegativeIndent: ").append(toIndentedString(getAllowNegativeIndent())).append("\n");
    sb.append("    cssClassNamePrefix: ").append(toIndentedString(getCssClassNamePrefix())).append("\n");
    sb.append("    cssStyleSheetFileName: ").append(toIndentedString(getCssStyleSheetFileName())).append("\n");
    sb.append("    cssStyleSheetType: ").append(toIndentedString(getCssStyleSheetType())).append("\n");
    sb.append("    documentSplitCriteria: ").append(toIndentedString(getDocumentSplitCriteria())).append("\n");
    sb.append("    documentSplitHeadingLevel: ").append(toIndentedString(getDocumentSplitHeadingLevel())).append("\n");
    sb.append("    encoding: ").append(toIndentedString(getEncoding())).append("\n");
    sb.append("    exportDocumentProperties: ").append(toIndentedString(getExportDocumentProperties())).append("\n");
    sb.append("    exportDropDownFormFieldAsText: ").append(toIndentedString(getExportDropDownFormFieldAsText())).append("\n");
    sb.append("    exportFontResources: ").append(toIndentedString(getExportFontResources())).append("\n");
    sb.append("    exportFontsAsBase64: ").append(toIndentedString(getExportFontsAsBase64())).append("\n");
    sb.append("    exportHeadersFootersMode: ").append(toIndentedString(getExportHeadersFootersMode())).append("\n");
    sb.append("    exportImagesAsBase64: ").append(toIndentedString(getExportImagesAsBase64())).append("\n");
    sb.append("    exportLanguageInformation: ").append(toIndentedString(getExportLanguageInformation())).append("\n");
    sb.append("    exportListLabels: ").append(toIndentedString(getExportListLabels())).append("\n");
    sb.append("    exportOriginalUrlForLinkedImages: ").append(toIndentedString(getExportOriginalUrlForLinkedImages())).append("\n");
    sb.append("    exportPageMargins: ").append(toIndentedString(getExportPageMargins())).append("\n");
    sb.append("    exportPageSetup: ").append(toIndentedString(getExportPageSetup())).append("\n");
    sb.append("    exportRelativeFontSize: ").append(toIndentedString(getExportRelativeFontSize())).append("\n");
    sb.append("    exportRoundtripInformation: ").append(toIndentedString(getExportRoundtripInformation())).append("\n");
    sb.append("    exportTextInputFormFieldAsText: ").append(toIndentedString(getExportTextInputFormFieldAsText())).append("\n");
    sb.append("    exportTocPageNumbers: ").append(toIndentedString(getExportTocPageNumbers())).append("\n");
    sb.append("    exportXhtmlTransitional: ").append(toIndentedString(getExportXhtmlTransitional())).append("\n");
    sb.append("    fontResourcesSubsettingSizeThreshold: ").append(toIndentedString(getFontResourcesSubsettingSizeThreshold())).append("\n");
    sb.append("    fontsFolder: ").append(toIndentedString(getFontsFolder())).append("\n");
    sb.append("    fontsFolderAlias: ").append(toIndentedString(getFontsFolderAlias())).append("\n");
    sb.append("    htmlVersion: ").append(toIndentedString(getHtmlVersion())).append("\n");
    sb.append("    imageResolution: ").append(toIndentedString(getImageResolution())).append("\n");
    sb.append("    imagesFolder: ").append(toIndentedString(getImagesFolder())).append("\n");
    sb.append("    imagesFolderAlias: ").append(toIndentedString(getImagesFolderAlias())).append("\n");
    sb.append("    metafileFormat: ").append(toIndentedString(getMetafileFormat())).append("\n");
    sb.append("    officeMathOutputMode: ").append(toIndentedString(getOfficeMathOutputMode())).append("\n");
    sb.append("    prettyFormat: ").append(toIndentedString(getPrettyFormat())).append("\n");
    sb.append("    resolveFontNames: ").append(toIndentedString(getResolveFontNames())).append("\n");
    sb.append("    resourceFolder: ").append(toIndentedString(getResourceFolder())).append("\n");
    sb.append("    resourceFolderAlias: ").append(toIndentedString(getResourceFolderAlias())).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
    sb.append("    scaleImageToShapeSize: ").append(toIndentedString(getScaleImageToShapeSize())).append("\n");
    sb.append("    tableWidthOutputMode: ").append(toIndentedString(getTableWidthOutputMode())).append("\n");
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
