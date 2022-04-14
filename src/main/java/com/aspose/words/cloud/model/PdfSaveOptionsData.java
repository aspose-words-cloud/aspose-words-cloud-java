/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PdfSaveOptionsData.java">
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
 * Container class for pdf save options.
 */
@ApiModel(description = "Container class for pdf save options.")
public class PdfSaveOptionsData extends FixedPageSaveOptionsData {
    /**
     * Gets or sets the PDF standards compliance level for output documents.
     */
    @JsonAdapter(ComplianceEnum.Adapter.class)
    public enum ComplianceEnum {
        PDF17("Pdf17"),
        PDF20("Pdf20"),
        PDFA1A("PdfA1a"),
        PDFA1B("PdfA1b"),
        PDFA2A("PdfA2a"),
        PDFA2U("PdfA2u"),
        PDFA4("PdfA4"),
        PDFUA1("PdfUa1");

        private String value;

        ComplianceEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ComplianceEnum fromValue(String text) {
            for (ComplianceEnum b : ComplianceEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< ComplianceEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final ComplianceEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ComplianceEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ComplianceEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls the way CustomDocumentProperties are exported to PDF file.
     * The default value is None.
     */
    @JsonAdapter(CustomPropertiesExportEnum.Adapter.class)
    public enum CustomPropertiesExportEnum {
        NONE("None"),
        STANDARD("Standard"),
        METADATA("Metadata");

        private String value;

        CustomPropertiesExportEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CustomPropertiesExportEnum fromValue(String text) {
            for (CustomPropertiesExportEnum b : CustomPropertiesExportEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< CustomPropertiesExportEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final CustomPropertiesExportEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CustomPropertiesExportEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CustomPropertiesExportEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the font embedding mode.
     */
    @JsonAdapter(FontEmbeddingModeEnum.Adapter.class)
    public enum FontEmbeddingModeEnum {
        EMBEDALL("EmbedAll"),
        EMBEDNONSTANDARD("EmbedNonstandard"),
        EMBEDNONE("EmbedNone");

        private String value;

        FontEmbeddingModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FontEmbeddingModeEnum fromValue(String text) {
            for (FontEmbeddingModeEnum b : FontEmbeddingModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< FontEmbeddingModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final FontEmbeddingModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FontEmbeddingModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FontEmbeddingModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls how bookmarks in headers/footers are exported.
     * The default value is Aspose.Words.Saving.HeaderFooterBookmarksExportMode.All.
     */
    @JsonAdapter(HeaderFooterBookmarksExportModeEnum.Adapter.class)
    public enum HeaderFooterBookmarksExportModeEnum {
        NONE("None"),
        FIRST("First"),
        ALL("All");

        private String value;

        HeaderFooterBookmarksExportModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static HeaderFooterBookmarksExportModeEnum fromValue(String text) {
            for (HeaderFooterBookmarksExportModeEnum b : HeaderFooterBookmarksExportModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< HeaderFooterBookmarksExportModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final HeaderFooterBookmarksExportModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public HeaderFooterBookmarksExportModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return HeaderFooterBookmarksExportModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls how the color space will be selected for the images in PDF document.
     */
    @JsonAdapter(ImageColorSpaceExportModeEnum.Adapter.class)
    public enum ImageColorSpaceExportModeEnum {
        AUTO("Auto"),
        SIMPLECMYK("SimpleCmyk");

        private String value;

        ImageColorSpaceExportModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ImageColorSpaceExportModeEnum fromValue(String text) {
            for (ImageColorSpaceExportModeEnum b : ImageColorSpaceExportModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< ImageColorSpaceExportModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final ImageColorSpaceExportModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ImageColorSpaceExportModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ImageColorSpaceExportModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls how the PDF document should be displayed when opened in the PDF reader.
     */
    @JsonAdapter(PageModeEnum.Adapter.class)
    public enum PageModeEnum {
        USENONE("UseNone"),
        USEOUTLINES("UseOutlines"),
        USETHUMBS("UseThumbs"),
        FULLSCREEN("FullScreen"),
        USEOC("UseOC"),
        USEATTACHMENTS("UseAttachments");

        private String value;

        PageModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PageModeEnum fromValue(String text) {
            for (PageModeEnum b : PageModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< PageModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final PageModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PageModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PageModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the compression type to be used for all textual content in the document.
     */
    @JsonAdapter(TextCompressionEnum.Adapter.class)
    public enum TextCompressionEnum {
        NONE("None"),
        FLATE("Flate");

        private String value;

        TextCompressionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TextCompressionEnum fromValue(String text) {
            for (TextCompressionEnum b : TextCompressionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TextCompressionEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TextCompressionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TextCompressionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TextCompressionEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls what type of zoom should be applied when a document is opened with a PDF viewer.
     */
    @JsonAdapter(ZoomBehaviorEnum.Adapter.class)
    public enum ZoomBehaviorEnum {
        NONE("None"),
        ZOOMFACTOR("ZoomFactor"),
        FITPAGE("FitPage"),
        FITWIDTH("FitWidth"),
        FITHEIGHT("FitHeight"),
        FITBOX("FitBox");

        private String value;

        ZoomBehaviorEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ZoomBehaviorEnum fromValue(String text) {
            for (ZoomBehaviorEnum b : ZoomBehaviorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< ZoomBehaviorEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final ZoomBehaviorEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ZoomBehaviorEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ZoomBehaviorEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Compliance")
    protected ComplianceEnum compliance;

    @SerializedName("CreateNoteHyperlinks")
    protected Boolean createNoteHyperlinks;

    @SerializedName("CustomPropertiesExport")
    protected CustomPropertiesExportEnum customPropertiesExport;

    @SerializedName("DigitalSignatureDetails")
    protected PdfDigitalSignatureDetailsData digitalSignatureDetails;

    @SerializedName("DisplayDocTitle")
    protected Boolean displayDocTitle;

    @SerializedName("DownsampleOptions")
    protected DownsampleOptionsData downsampleOptions;

    @SerializedName("EmbedFullFonts")
    protected Boolean embedFullFonts;

    @SerializedName("EncryptionDetails")
    protected PdfEncryptionDetailsData encryptionDetails;

    @SerializedName("ExportDocumentStructure")
    protected Boolean exportDocumentStructure;

    @SerializedName("ExportLanguageToSpanTag")
    protected Boolean exportLanguageToSpanTag;

    @SerializedName("FontEmbeddingMode")
    protected FontEmbeddingModeEnum fontEmbeddingMode;

    @SerializedName("HeaderFooterBookmarksExportMode")
    protected HeaderFooterBookmarksExportModeEnum headerFooterBookmarksExportMode;

    @SerializedName("ImageColorSpaceExportMode")
    protected ImageColorSpaceExportModeEnum imageColorSpaceExportMode;

    @SerializedName("ImageCompression")
    protected String imageCompression;

    @SerializedName("InterpolateImages")
    protected Boolean interpolateImages;

    @SerializedName("OpenHyperlinksInNewWindow")
    protected Boolean openHyperlinksInNewWindow;

    @SerializedName("OutlineOptions")
    protected OutlineOptionsData outlineOptions;

    @SerializedName("PageMode")
    protected PageModeEnum pageMode;

    @SerializedName("PreblendImages")
    protected Boolean preblendImages;

    @SerializedName("PreserveFormFields")
    protected Boolean preserveFormFields;

    @SerializedName("TextCompression")
    protected TextCompressionEnum textCompression;

    @SerializedName("UseBookFoldPrintingSettings")
    protected Boolean useBookFoldPrintingSettings;

    @SerializedName("UseCoreFonts")
    protected Boolean useCoreFonts;

    @SerializedName("ZoomBehavior")
    protected ZoomBehaviorEnum zoomBehavior;

    @SerializedName("ZoomFactor")
    protected Integer zoomFactor;
    /**
     * Gets or sets the PDF standards compliance level for output documents.
    * @return compliance
    **/
    @ApiModelProperty(value = "Gets or sets the PDF standards compliance level for output documents.")
    public ComplianceEnum getCompliance() {
        return compliance;
    }

    public PdfSaveOptionsData compliance(ComplianceEnum compliance) {
        this.compliance = compliance;
        return this;
    }

    public void setCompliance(ComplianceEnum compliance) {
        this.compliance = compliance;
    }


    /**
     * Gets or sets a value indicating whether to convert footnote/endnote references in main text story into active hyperlinks.
     * When clicked the hyperlink will lead to the corresponding footnote/endnote.
     * The default value is false.
    * @return createNoteHyperlinks
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to convert footnote/endnote references in main text story into active hyperlinks. When clicked the hyperlink will lead to the corresponding footnote/endnote. The default value is false.")
    public Boolean getCreateNoteHyperlinks() {
        return createNoteHyperlinks;
    }

    public PdfSaveOptionsData createNoteHyperlinks(Boolean createNoteHyperlinks) {
        this.createNoteHyperlinks = createNoteHyperlinks;
        return this;
    }

    public void setCreateNoteHyperlinks(Boolean createNoteHyperlinks) {
        this.createNoteHyperlinks = createNoteHyperlinks;
    }


    /**
     * Gets or sets the option that controls the way CustomDocumentProperties are exported to PDF file.
     * The default value is None.
    * @return customPropertiesExport
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls the way CustomDocumentProperties are exported to PDF file. The default value is None.")
    public CustomPropertiesExportEnum getCustomPropertiesExport() {
        return customPropertiesExport;
    }

    public PdfSaveOptionsData customPropertiesExport(CustomPropertiesExportEnum customPropertiesExport) {
        this.customPropertiesExport = customPropertiesExport;
        return this;
    }

    public void setCustomPropertiesExport(CustomPropertiesExportEnum customPropertiesExport) {
        this.customPropertiesExport = customPropertiesExport;
    }


    /**
     * Gets or sets the details for signing the output PDF document.
    * @return digitalSignatureDetails
    **/
    @ApiModelProperty(value = "Gets or sets the details for signing the output PDF document.")
    public PdfDigitalSignatureDetailsData getDigitalSignatureDetails() {
        return digitalSignatureDetails;
    }

    public PdfSaveOptionsData digitalSignatureDetails(PdfDigitalSignatureDetailsData digitalSignatureDetails) {
        this.digitalSignatureDetails = digitalSignatureDetails;
        return this;
    }

    public void setDigitalSignatureDetails(PdfDigitalSignatureDetailsData digitalSignatureDetails) {
        this.digitalSignatureDetails = digitalSignatureDetails;
    }


    /**
     * Gets or sets a value indicating whether the window’s title bar should display the document title taken from the Title entry of the document information dictionary.
    * @return displayDocTitle
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the window’s title bar should display the document title taken from the Title entry of the document information dictionary.")
    public Boolean getDisplayDocTitle() {
        return displayDocTitle;
    }

    public PdfSaveOptionsData displayDocTitle(Boolean displayDocTitle) {
        this.displayDocTitle = displayDocTitle;
        return this;
    }

    public void setDisplayDocTitle(Boolean displayDocTitle) {
        this.displayDocTitle = displayDocTitle;
    }


    /**
     * Gets or sets the downsample options.
    * @return downsampleOptions
    **/
    @ApiModelProperty(value = "Gets or sets the downsample options.")
    public DownsampleOptionsData getDownsampleOptions() {
        return downsampleOptions;
    }

    public PdfSaveOptionsData downsampleOptions(DownsampleOptionsData downsampleOptions) {
        this.downsampleOptions = downsampleOptions;
        return this;
    }

    public void setDownsampleOptions(DownsampleOptionsData downsampleOptions) {
        this.downsampleOptions = downsampleOptions;
    }


    /**
     * Gets or sets a value indicating whether fonts are embedded into the resulting PDF documents.
    * @return embedFullFonts
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether fonts are embedded into the resulting PDF documents.")
    public Boolean getEmbedFullFonts() {
        return embedFullFonts;
    }

    public PdfSaveOptionsData embedFullFonts(Boolean embedFullFonts) {
        this.embedFullFonts = embedFullFonts;
        return this;
    }

    public void setEmbedFullFonts(Boolean embedFullFonts) {
        this.embedFullFonts = embedFullFonts;
    }


    /**
     * Gets or sets the details for encrypting the output PDF document.
    * @return encryptionDetails
    **/
    @ApiModelProperty(value = "Gets or sets the details for encrypting the output PDF document.")
    public PdfEncryptionDetailsData getEncryptionDetails() {
        return encryptionDetails;
    }

    public PdfSaveOptionsData encryptionDetails(PdfEncryptionDetailsData encryptionDetails) {
        this.encryptionDetails = encryptionDetails;
        return this;
    }

    public void setEncryptionDetails(PdfEncryptionDetailsData encryptionDetails) {
        this.encryptionDetails = encryptionDetails;
    }


    /**
     * Gets or sets a value indicating whether to export document structure.
    * @return exportDocumentStructure
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to export document structure.")
    public Boolean getExportDocumentStructure() {
        return exportDocumentStructure;
    }

    public PdfSaveOptionsData exportDocumentStructure(Boolean exportDocumentStructure) {
        this.exportDocumentStructure = exportDocumentStructure;
        return this;
    }

    public void setExportDocumentStructure(Boolean exportDocumentStructure) {
        this.exportDocumentStructure = exportDocumentStructure;
    }


    /**
     * Gets or sets a value determining whether or not to create a "Span" tag in the document structure to export the text language.
    * @return exportLanguageToSpanTag
    **/
    @ApiModelProperty(value = "Gets or sets a value determining whether or not to create a \"Span\" tag in the document structure to export the text language.")
    public Boolean getExportLanguageToSpanTag() {
        return exportLanguageToSpanTag;
    }

    public PdfSaveOptionsData exportLanguageToSpanTag(Boolean exportLanguageToSpanTag) {
        this.exportLanguageToSpanTag = exportLanguageToSpanTag;
        return this;
    }

    public void setExportLanguageToSpanTag(Boolean exportLanguageToSpanTag) {
        this.exportLanguageToSpanTag = exportLanguageToSpanTag;
    }


    /**
     * Gets or sets the font embedding mode.
    * @return fontEmbeddingMode
    **/
    @ApiModelProperty(value = "Gets or sets the font embedding mode.")
    public FontEmbeddingModeEnum getFontEmbeddingMode() {
        return fontEmbeddingMode;
    }

    public PdfSaveOptionsData fontEmbeddingMode(FontEmbeddingModeEnum fontEmbeddingMode) {
        this.fontEmbeddingMode = fontEmbeddingMode;
        return this;
    }

    public void setFontEmbeddingMode(FontEmbeddingModeEnum fontEmbeddingMode) {
        this.fontEmbeddingMode = fontEmbeddingMode;
    }


    /**
     * Gets or sets the option that controls how bookmarks in headers/footers are exported.
     * The default value is Aspose.Words.Saving.HeaderFooterBookmarksExportMode.All.
    * @return headerFooterBookmarksExportMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how bookmarks in headers/footers are exported. The default value is Aspose.Words.Saving.HeaderFooterBookmarksExportMode.All.")
    public HeaderFooterBookmarksExportModeEnum getHeaderFooterBookmarksExportMode() {
        return headerFooterBookmarksExportMode;
    }

    public PdfSaveOptionsData headerFooterBookmarksExportMode(HeaderFooterBookmarksExportModeEnum headerFooterBookmarksExportMode) {
        this.headerFooterBookmarksExportMode = headerFooterBookmarksExportMode;
        return this;
    }

    public void setHeaderFooterBookmarksExportMode(HeaderFooterBookmarksExportModeEnum headerFooterBookmarksExportMode) {
        this.headerFooterBookmarksExportMode = headerFooterBookmarksExportMode;
    }


    /**
     * Gets or sets the option that controls how the color space will be selected for the images in PDF document.
    * @return imageColorSpaceExportMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how the color space will be selected for the images in PDF document.")
    public ImageColorSpaceExportModeEnum getImageColorSpaceExportMode() {
        return imageColorSpaceExportMode;
    }

    public PdfSaveOptionsData imageColorSpaceExportMode(ImageColorSpaceExportModeEnum imageColorSpaceExportMode) {
        this.imageColorSpaceExportMode = imageColorSpaceExportMode;
        return this;
    }

    public void setImageColorSpaceExportMode(ImageColorSpaceExportModeEnum imageColorSpaceExportMode) {
        this.imageColorSpaceExportMode = imageColorSpaceExportMode;
    }


    /**
     * Gets or sets the compression type to be used for all images in the document.
    * @return imageCompression
    **/
    @ApiModelProperty(value = "Gets or sets the compression type to be used for all images in the document.")
    public String getImageCompression() {
        return imageCompression;
    }

    public PdfSaveOptionsData imageCompression(String imageCompression) {
        this.imageCompression = imageCompression;
        return this;
    }

    public void setImageCompression(String imageCompression) {
        this.imageCompression = imageCompression;
    }


    /**
     * Gets or sets a value indicating whether image interpolation shall be performed by a conforming reader. When false is specified, the flag is not written to the output document and the default behavior of reader is used instead.
    * @return interpolateImages
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether image interpolation shall be performed by a conforming reader. When false is specified, the flag is not written to the output document and the default behavior of reader is used instead.")
    public Boolean getInterpolateImages() {
        return interpolateImages;
    }

    public PdfSaveOptionsData interpolateImages(Boolean interpolateImages) {
        this.interpolateImages = interpolateImages;
        return this;
    }

    public void setInterpolateImages(Boolean interpolateImages) {
        this.interpolateImages = interpolateImages;
    }


    /**
     * Gets or sets a value indicating whether hyperlinks in the output Pdf document are forced to be opened in a new window (or tab) of a browser.
    * @return openHyperlinksInNewWindow
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether hyperlinks in the output Pdf document are forced to be opened in a new window (or tab) of a browser.")
    public Boolean getOpenHyperlinksInNewWindow() {
        return openHyperlinksInNewWindow;
    }

    public PdfSaveOptionsData openHyperlinksInNewWindow(Boolean openHyperlinksInNewWindow) {
        this.openHyperlinksInNewWindow = openHyperlinksInNewWindow;
        return this;
    }

    public void setOpenHyperlinksInNewWindow(Boolean openHyperlinksInNewWindow) {
        this.openHyperlinksInNewWindow = openHyperlinksInNewWindow;
    }


    /**
     * Gets or sets the outline options.
    * @return outlineOptions
    **/
    @ApiModelProperty(value = "Gets or sets the outline options.")
    public OutlineOptionsData getOutlineOptions() {
        return outlineOptions;
    }

    public PdfSaveOptionsData outlineOptions(OutlineOptionsData outlineOptions) {
        this.outlineOptions = outlineOptions;
        return this;
    }

    public void setOutlineOptions(OutlineOptionsData outlineOptions) {
        this.outlineOptions = outlineOptions;
    }


    /**
     * Gets or sets the option that controls how the PDF document should be displayed when opened in the PDF reader.
    * @return pageMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how the PDF document should be displayed when opened in the PDF reader.")
    public PageModeEnum getPageMode() {
        return pageMode;
    }

    public PdfSaveOptionsData pageMode(PageModeEnum pageMode) {
        this.pageMode = pageMode;
        return this;
    }

    public void setPageMode(PageModeEnum pageMode) {
        this.pageMode = pageMode;
    }


    /**
     * Gets or sets a value indicating whether to preblend transparent images with black background color.
    * @return preblendImages
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to preblend transparent images with black background color.")
    public Boolean getPreblendImages() {
        return preblendImages;
    }

    public PdfSaveOptionsData preblendImages(Boolean preblendImages) {
        this.preblendImages = preblendImages;
        return this;
    }

    public void setPreblendImages(Boolean preblendImages) {
        this.preblendImages = preblendImages;
    }


    /**
     * Gets or sets a value indicating whether to preserve Microsoft Word form fields as form fields in PDF or convert them to text.
    * @return preserveFormFields
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to preserve Microsoft Word form fields as form fields in PDF or convert them to text.")
    public Boolean getPreserveFormFields() {
        return preserveFormFields;
    }

    public PdfSaveOptionsData preserveFormFields(Boolean preserveFormFields) {
        this.preserveFormFields = preserveFormFields;
        return this;
    }

    public void setPreserveFormFields(Boolean preserveFormFields) {
        this.preserveFormFields = preserveFormFields;
    }


    /**
     * Gets or sets the compression type to be used for all textual content in the document.
    * @return textCompression
    **/
    @ApiModelProperty(value = "Gets or sets the compression type to be used for all textual content in the document.")
    public TextCompressionEnum getTextCompression() {
        return textCompression;
    }

    public PdfSaveOptionsData textCompression(TextCompressionEnum textCompression) {
        this.textCompression = textCompression;
        return this;
    }

    public void setTextCompression(TextCompressionEnum textCompression) {
        this.textCompression = textCompression;
    }


    /**
     * Gets or sets a value indicating whether the document should be saved using a booklet printing layout.
    * @return useBookFoldPrintingSettings
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the document should be saved using a booklet printing layout.")
    public Boolean getUseBookFoldPrintingSettings() {
        return useBookFoldPrintingSettings;
    }

    public PdfSaveOptionsData useBookFoldPrintingSettings(Boolean useBookFoldPrintingSettings) {
        this.useBookFoldPrintingSettings = useBookFoldPrintingSettings;
        return this;
    }

    public void setUseBookFoldPrintingSettings(Boolean useBookFoldPrintingSettings) {
        this.useBookFoldPrintingSettings = useBookFoldPrintingSettings;
    }


    /**
     * Gets or sets a value indicating whether to substitute TrueType fonts Arial, Times New Roman, Courier New and Symbol with core PDF Type 1 fonts.
    * @return useCoreFonts
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to substitute TrueType fonts Arial, Times New Roman, Courier New and Symbol with core PDF Type 1 fonts.")
    public Boolean getUseCoreFonts() {
        return useCoreFonts;
    }

    public PdfSaveOptionsData useCoreFonts(Boolean useCoreFonts) {
        this.useCoreFonts = useCoreFonts;
        return this;
    }

    public void setUseCoreFonts(Boolean useCoreFonts) {
        this.useCoreFonts = useCoreFonts;
    }


    /**
     * Gets or sets the option that controls what type of zoom should be applied when a document is opened with a PDF viewer.
    * @return zoomBehavior
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls what type of zoom should be applied when a document is opened with a PDF viewer.")
    public ZoomBehaviorEnum getZoomBehavior() {
        return zoomBehavior;
    }

    public PdfSaveOptionsData zoomBehavior(ZoomBehaviorEnum zoomBehavior) {
        this.zoomBehavior = zoomBehavior;
        return this;
    }

    public void setZoomBehavior(ZoomBehaviorEnum zoomBehavior) {
        this.zoomBehavior = zoomBehavior;
    }


    /**
     * Gets or sets the zoom factor (in percentages) for a document.
    * @return zoomFactor
    **/
    @ApiModelProperty(value = "Gets or sets the zoom factor (in percentages) for a document.")
    public Integer getZoomFactor() {
        return zoomFactor;
    }

    public PdfSaveOptionsData zoomFactor(Integer zoomFactor) {
        this.zoomFactor = zoomFactor;
        return this;
    }

    public void setZoomFactor(Integer zoomFactor) {
        this.zoomFactor = zoomFactor;
    }


    public PdfSaveOptionsData() {
        super();
        this.compliance = null;
        this.createNoteHyperlinks = null;
        this.customPropertiesExport = null;
        this.digitalSignatureDetails = null;
        this.displayDocTitle = null;
        this.downsampleOptions = null;
        this.embedFullFonts = null;
        this.encryptionDetails = null;
        this.exportDocumentStructure = null;
        this.exportLanguageToSpanTag = null;
        this.fontEmbeddingMode = null;
        this.headerFooterBookmarksExportMode = null;
        this.imageColorSpaceExportMode = null;
        this.imageCompression = null;
        this.interpolateImages = null;
        this.openHyperlinksInNewWindow = null;
        this.outlineOptions = null;
        this.pageMode = null;
        this.preblendImages = null;
        this.preserveFormFields = null;
        this.saveFormat = "pdf";
        this.textCompression = null;
        this.useBookFoldPrintingSettings = null;
        this.useCoreFonts = null;
        this.zoomBehavior = null;
        this.zoomFactor = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PdfSaveOptionsData pdfSaveOptionsData = (PdfSaveOptionsData) o;
        return
            Objects.equals(this.compliance, pdfSaveOptionsData.compliance) &&
            Objects.equals(this.createNoteHyperlinks, pdfSaveOptionsData.createNoteHyperlinks) &&
            Objects.equals(this.customPropertiesExport, pdfSaveOptionsData.customPropertiesExport) &&
            Objects.equals(this.digitalSignatureDetails, pdfSaveOptionsData.digitalSignatureDetails) &&
            Objects.equals(this.displayDocTitle, pdfSaveOptionsData.displayDocTitle) &&
            Objects.equals(this.downsampleOptions, pdfSaveOptionsData.downsampleOptions) &&
            Objects.equals(this.embedFullFonts, pdfSaveOptionsData.embedFullFonts) &&
            Objects.equals(this.encryptionDetails, pdfSaveOptionsData.encryptionDetails) &&
            Objects.equals(this.exportDocumentStructure, pdfSaveOptionsData.exportDocumentStructure) &&
            Objects.equals(this.exportLanguageToSpanTag, pdfSaveOptionsData.exportLanguageToSpanTag) &&
            Objects.equals(this.fontEmbeddingMode, pdfSaveOptionsData.fontEmbeddingMode) &&
            Objects.equals(this.headerFooterBookmarksExportMode, pdfSaveOptionsData.headerFooterBookmarksExportMode) &&
            Objects.equals(this.imageColorSpaceExportMode, pdfSaveOptionsData.imageColorSpaceExportMode) &&
            Objects.equals(this.imageCompression, pdfSaveOptionsData.imageCompression) &&
            Objects.equals(this.interpolateImages, pdfSaveOptionsData.interpolateImages) &&
            Objects.equals(this.openHyperlinksInNewWindow, pdfSaveOptionsData.openHyperlinksInNewWindow) &&
            Objects.equals(this.outlineOptions, pdfSaveOptionsData.outlineOptions) &&
            Objects.equals(this.pageMode, pdfSaveOptionsData.pageMode) &&
            Objects.equals(this.preblendImages, pdfSaveOptionsData.preblendImages) &&
            Objects.equals(this.preserveFormFields, pdfSaveOptionsData.preserveFormFields) &&
            Objects.equals(this.textCompression, pdfSaveOptionsData.textCompression) &&
            Objects.equals(this.useBookFoldPrintingSettings, pdfSaveOptionsData.useBookFoldPrintingSettings) &&
            Objects.equals(this.useCoreFonts, pdfSaveOptionsData.useCoreFonts) &&
            Objects.equals(this.zoomBehavior, pdfSaveOptionsData.zoomBehavior) &&
            Objects.equals(this.zoomFactor, pdfSaveOptionsData.zoomFactor) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compliance, createNoteHyperlinks, customPropertiesExport, digitalSignatureDetails, displayDocTitle, downsampleOptions, embedFullFonts, encryptionDetails, exportDocumentStructure, exportLanguageToSpanTag, fontEmbeddingMode, headerFooterBookmarksExportMode, imageColorSpaceExportMode, imageCompression, interpolateImages, openHyperlinksInNewWindow, outlineOptions, pageMode, preblendImages, preserveFormFields, textCompression, useBookFoldPrintingSettings, useCoreFonts, zoomBehavior, zoomFactor, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSaveOptionsData {\n");
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
    sb.append("    compliance: ").append(toIndentedString(getCompliance())).append("\n");
    sb.append("    createNoteHyperlinks: ").append(toIndentedString(getCreateNoteHyperlinks())).append("\n");
    sb.append("    customPropertiesExport: ").append(toIndentedString(getCustomPropertiesExport())).append("\n");
    sb.append("    digitalSignatureDetails: ").append(toIndentedString(getDigitalSignatureDetails())).append("\n");
    sb.append("    displayDocTitle: ").append(toIndentedString(getDisplayDocTitle())).append("\n");
    sb.append("    downsampleOptions: ").append(toIndentedString(getDownsampleOptions())).append("\n");
    sb.append("    embedFullFonts: ").append(toIndentedString(getEmbedFullFonts())).append("\n");
    sb.append("    encryptionDetails: ").append(toIndentedString(getEncryptionDetails())).append("\n");
    sb.append("    exportDocumentStructure: ").append(toIndentedString(getExportDocumentStructure())).append("\n");
    sb.append("    exportLanguageToSpanTag: ").append(toIndentedString(getExportLanguageToSpanTag())).append("\n");
    sb.append("    fontEmbeddingMode: ").append(toIndentedString(getFontEmbeddingMode())).append("\n");
    sb.append("    headerFooterBookmarksExportMode: ").append(toIndentedString(getHeaderFooterBookmarksExportMode())).append("\n");
    sb.append("    imageColorSpaceExportMode: ").append(toIndentedString(getImageColorSpaceExportMode())).append("\n");
    sb.append("    imageCompression: ").append(toIndentedString(getImageCompression())).append("\n");
    sb.append("    interpolateImages: ").append(toIndentedString(getInterpolateImages())).append("\n");
    sb.append("    openHyperlinksInNewWindow: ").append(toIndentedString(getOpenHyperlinksInNewWindow())).append("\n");
    sb.append("    outlineOptions: ").append(toIndentedString(getOutlineOptions())).append("\n");
    sb.append("    pageMode: ").append(toIndentedString(getPageMode())).append("\n");
    sb.append("    preblendImages: ").append(toIndentedString(getPreblendImages())).append("\n");
    sb.append("    preserveFormFields: ").append(toIndentedString(getPreserveFormFields())).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
    sb.append("    textCompression: ").append(toIndentedString(getTextCompression())).append("\n");
    sb.append("    useBookFoldPrintingSettings: ").append(toIndentedString(getUseBookFoldPrintingSettings())).append("\n");
    sb.append("    useCoreFonts: ").append(toIndentedString(getUseCoreFonts())).append("\n");
    sb.append("    zoomBehavior: ").append(toIndentedString(getZoomBehavior())).append("\n");
    sb.append("    zoomFactor: ").append(toIndentedString(getZoomFactor())).append("\n");
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
