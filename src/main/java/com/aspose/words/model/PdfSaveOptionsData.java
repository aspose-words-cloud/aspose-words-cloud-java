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

package com.aspose.words.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.words.cloud.model.DownsampleOptionsData;
import com.aspose.words.cloud.model.FixedPageSaveOptionsData;
import com.aspose.words.cloud.model.MetafileRenderingOptionsData;
import com.aspose.words.cloud.model.OutlineOptionsData;
import com.aspose.words.cloud.model.PdfDigitalSignatureDetailsData;
import com.aspose.words.cloud.model.PdfEncryptionDetailsData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * container class for pdf save options
 */
@ApiModel(description = "container class for pdf save options")

public class PdfSaveOptionsData extends FixedPageSaveOptionsData {
  @SerializedName("Compliance")
  private String compliance = null;

  @SerializedName("CreateNoteHyperlinks")
  private Boolean createNoteHyperlinks = null;

  @SerializedName("CustomPropertiesExport")
  private String customPropertiesExport = null;

  @SerializedName("DigitalSignatureDetails")
  private PdfDigitalSignatureDetailsData digitalSignatureDetails = null;

  @SerializedName("DisplayDocTitle")
  private Boolean displayDocTitle = null;

  @SerializedName("DownsampleOptions")
  private DownsampleOptionsData downsampleOptions = null;

  @SerializedName("EmbedFullFonts")
  private Boolean embedFullFonts = null;

  @SerializedName("EncryptionDetails")
  private PdfEncryptionDetailsData encryptionDetails = null;

  @SerializedName("EscapeUri")
  private Boolean escapeUri = null;

  @SerializedName("ExportDocumentStructure")
  private Boolean exportDocumentStructure = null;

  @SerializedName("FontEmbeddingMode")
  private String fontEmbeddingMode = null;

  /**
   * Determines how bookmarks in headers/footers are exported. The default value is Aspose.Words.Saving.HeaderFooterBookmarksExportMode.All.
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

    public static class Adapter extends TypeAdapter<HeaderFooterBookmarksExportModeEnum> {
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

  @SerializedName("HeaderFooterBookmarksExportMode")
  private HeaderFooterBookmarksExportModeEnum headerFooterBookmarksExportMode = null;

  @SerializedName("ImageColorSpaceExportMode")
  private String imageColorSpaceExportMode = null;

  @SerializedName("ImageCompression")
  private String imageCompression = null;

  @SerializedName("OpenHyperlinksInNewWindow")
  private Boolean openHyperlinksInNewWindow = null;

  @SerializedName("OutlineOptions")
  private OutlineOptionsData outlineOptions = null;

  @SerializedName("PageMode")
  private String pageMode = null;

  @SerializedName("PreblendImages")
  private Boolean preblendImages = null;

  @SerializedName("PreserveFormFields")
  private Boolean preserveFormFields = null;

  @SerializedName("TextCompression")
  private String textCompression = null;

  @SerializedName("UseBookFoldPrintingSettings")
  private Boolean useBookFoldPrintingSettings = null;

  @SerializedName("UseCoreFonts")
  private Boolean useCoreFonts = null;

  @SerializedName("ZoomBehavior")
  private String zoomBehavior = null;

  @SerializedName("ZoomFactor")
  private Integer zoomFactor = null;

  public PdfSaveOptionsData compliance(String compliance) {
    this.compliance = compliance;
    return this;
  }

   /**
   * Specifies the PDF standards compliance level for output documents
   * @return compliance
  **/
  @ApiModelProperty(value = "Specifies the PDF standards compliance level for output documents")
  public String getCompliance() {
    return compliance;
  }

  public void setCompliance(String compliance) {
    this.compliance = compliance;
  }

  public PdfSaveOptionsData createNoteHyperlinks(Boolean createNoteHyperlinks) {
    this.createNoteHyperlinks = createNoteHyperlinks;
    return this;
  }

   /**
   * Specifies whether to convert footnote/endnote references in main text story into active hyperlinks. When clicked the hyperlink will lead to the corresponding footnote/endnote. Default is false.
   * @return createNoteHyperlinks
  **/
  @ApiModelProperty(value = "Specifies whether to convert footnote/endnote references in main text story into active hyperlinks. When clicked the hyperlink will lead to the corresponding footnote/endnote. Default is false.")
  public Boolean isisCreateNoteHyperlinks() {
    return createNoteHyperlinks;
  }

  public void setCreateNoteHyperlinks(Boolean createNoteHyperlinks) {
    this.createNoteHyperlinks = createNoteHyperlinks;
  }

  public PdfSaveOptionsData customPropertiesExport(String customPropertiesExport) {
    this.customPropertiesExport = customPropertiesExport;
    return this;
  }

   /**
   * Gets or sets a value determining the way  are exported to PDF file. Default value is .
   * @return customPropertiesExport
  **/
  @ApiModelProperty(value = "Gets or sets a value determining the way  are exported to PDF file. Default value is .")
  public String getCustomPropertiesExport() {
    return customPropertiesExport;
  }

  public void setCustomPropertiesExport(String customPropertiesExport) {
    this.customPropertiesExport = customPropertiesExport;
  }

  public PdfSaveOptionsData digitalSignatureDetails(PdfDigitalSignatureDetailsData digitalSignatureDetails) {
    this.digitalSignatureDetails = digitalSignatureDetails;
    return this;
  }

   /**
   * Specifies the details for signing the output PDF document
   * @return digitalSignatureDetails
  **/
  @ApiModelProperty(value = "Specifies the details for signing the output PDF document")
  public PdfDigitalSignatureDetailsData getDigitalSignatureDetails() {
    return digitalSignatureDetails;
  }

  public void setDigitalSignatureDetails(PdfDigitalSignatureDetailsData digitalSignatureDetails) {
    this.digitalSignatureDetails = digitalSignatureDetails;
  }

  public PdfSaveOptionsData displayDocTitle(Boolean displayDocTitle) {
    this.displayDocTitle = displayDocTitle;
    return this;
  }

   /**
   * A flag specifying whether the window’s title bar should display the document title taken from the Title entry of the document information dictionary.
   * @return displayDocTitle
  **/
  @ApiModelProperty(value = "A flag specifying whether the window’s title bar should display the document title taken from the Title entry of the document information dictionary.")
  public Boolean isisDisplayDocTitle() {
    return displayDocTitle;
  }

  public void setDisplayDocTitle(Boolean displayDocTitle) {
    this.displayDocTitle = displayDocTitle;
  }

  public PdfSaveOptionsData downsampleOptions(DownsampleOptionsData downsampleOptions) {
    this.downsampleOptions = downsampleOptions;
    return this;
  }

   /**
   * Allows to specify downsample options.
   * @return downsampleOptions
  **/
  @ApiModelProperty(value = "Allows to specify downsample options.")
  public DownsampleOptionsData getDownsampleOptions() {
    return downsampleOptions;
  }

  public void setDownsampleOptions(DownsampleOptionsData downsampleOptions) {
    this.downsampleOptions = downsampleOptions;
  }

  public PdfSaveOptionsData embedFullFonts(Boolean embedFullFonts) {
    this.embedFullFonts = embedFullFonts;
    return this;
  }

   /**
   * Controls how fonts are embedded into the resulting PDF documents
   * @return embedFullFonts
  **/
  @ApiModelProperty(value = "Controls how fonts are embedded into the resulting PDF documents")
  public Boolean isisEmbedFullFonts() {
    return embedFullFonts;
  }

  public void setEmbedFullFonts(Boolean embedFullFonts) {
    this.embedFullFonts = embedFullFonts;
  }

  public PdfSaveOptionsData encryptionDetails(PdfEncryptionDetailsData encryptionDetails) {
    this.encryptionDetails = encryptionDetails;
    return this;
  }

   /**
   * Specifies the details for encrypting the output PDF document
   * @return encryptionDetails
  **/
  @ApiModelProperty(value = "Specifies the details for encrypting the output PDF document")
  public PdfEncryptionDetailsData getEncryptionDetails() {
    return encryptionDetails;
  }

  public void setEncryptionDetails(PdfEncryptionDetailsData encryptionDetails) {
    this.encryptionDetails = encryptionDetails;
  }

  public PdfSaveOptionsData escapeUri(Boolean escapeUri) {
    this.escapeUri = escapeUri;
    return this;
  }

   /**
   * A flag specifying whether URI should be escaped before writing.             
   * @return escapeUri
  **/
  @ApiModelProperty(value = "A flag specifying whether URI should be escaped before writing.             ")
  public Boolean isisEscapeUri() {
    return escapeUri;
  }

  public void setEscapeUri(Boolean escapeUri) {
    this.escapeUri = escapeUri;
  }

  public PdfSaveOptionsData exportDocumentStructure(Boolean exportDocumentStructure) {
    this.exportDocumentStructure = exportDocumentStructure;
    return this;
  }

   /**
   * Determines whether or not to export document structure
   * @return exportDocumentStructure
  **/
  @ApiModelProperty(value = "Determines whether or not to export document structure")
  public Boolean isisExportDocumentStructure() {
    return exportDocumentStructure;
  }

  public void setExportDocumentStructure(Boolean exportDocumentStructure) {
    this.exportDocumentStructure = exportDocumentStructure;
  }

  public PdfSaveOptionsData fontEmbeddingMode(String fontEmbeddingMode) {
    this.fontEmbeddingMode = fontEmbeddingMode;
    return this;
  }

   /**
   * Specifies the font embedding mode
   * @return fontEmbeddingMode
  **/
  @ApiModelProperty(value = "Specifies the font embedding mode")
  public String getFontEmbeddingMode() {
    return fontEmbeddingMode;
  }

  public void setFontEmbeddingMode(String fontEmbeddingMode) {
    this.fontEmbeddingMode = fontEmbeddingMode;
  }

  public PdfSaveOptionsData headerFooterBookmarksExportMode(HeaderFooterBookmarksExportModeEnum headerFooterBookmarksExportMode) {
    this.headerFooterBookmarksExportMode = headerFooterBookmarksExportMode;
    return this;
  }

   /**
   * Determines how bookmarks in headers/footers are exported. The default value is Aspose.Words.Saving.HeaderFooterBookmarksExportMode.All.
   * @return headerFooterBookmarksExportMode
  **/
  @ApiModelProperty(value = "Determines how bookmarks in headers/footers are exported. The default value is Aspose.Words.Saving.HeaderFooterBookmarksExportMode.All.")
  public HeaderFooterBookmarksExportModeEnum getHeaderFooterBookmarksExportMode() {
    return headerFooterBookmarksExportMode;
  }

  public void setHeaderFooterBookmarksExportMode(HeaderFooterBookmarksExportModeEnum headerFooterBookmarksExportMode) {
    this.headerFooterBookmarksExportMode = headerFooterBookmarksExportMode;
  }

  public PdfSaveOptionsData imageColorSpaceExportMode(String imageColorSpaceExportMode) {
    this.imageColorSpaceExportMode = imageColorSpaceExportMode;
    return this;
  }

   /**
   * Specifies how the color space will be selected for the images in PDF document.
   * @return imageColorSpaceExportMode
  **/
  @ApiModelProperty(value = "Specifies how the color space will be selected for the images in PDF document.")
  public String getImageColorSpaceExportMode() {
    return imageColorSpaceExportMode;
  }

  public void setImageColorSpaceExportMode(String imageColorSpaceExportMode) {
    this.imageColorSpaceExportMode = imageColorSpaceExportMode;
  }

  public PdfSaveOptionsData imageCompression(String imageCompression) {
    this.imageCompression = imageCompression;
    return this;
  }

   /**
   * Specifies compression type to be used for all images in the document
   * @return imageCompression
  **/
  @ApiModelProperty(value = "Specifies compression type to be used for all images in the document")
  public String getImageCompression() {
    return imageCompression;
  }

  public void setImageCompression(String imageCompression) {
    this.imageCompression = imageCompression;
  }

  public PdfSaveOptionsData openHyperlinksInNewWindow(Boolean openHyperlinksInNewWindow) {
    this.openHyperlinksInNewWindow = openHyperlinksInNewWindow;
    return this;
  }

   /**
   * Determines whether hyperlinks in the output Pdf document are forced to be opened in a new window (or tab) of a browser
   * @return openHyperlinksInNewWindow
  **/
  @ApiModelProperty(value = "Determines whether hyperlinks in the output Pdf document are forced to be opened in a new window (or tab) of a browser")
  public Boolean isisOpenHyperlinksInNewWindow() {
    return openHyperlinksInNewWindow;
  }

  public void setOpenHyperlinksInNewWindow(Boolean openHyperlinksInNewWindow) {
    this.openHyperlinksInNewWindow = openHyperlinksInNewWindow;
  }

  public PdfSaveOptionsData outlineOptions(OutlineOptionsData outlineOptions) {
    this.outlineOptions = outlineOptions;
    return this;
  }

   /**
   * Allows to specify outline options
   * @return outlineOptions
  **/
  @ApiModelProperty(value = "Allows to specify outline options")
  public OutlineOptionsData getOutlineOptions() {
    return outlineOptions;
  }

  public void setOutlineOptions(OutlineOptionsData outlineOptions) {
    this.outlineOptions = outlineOptions;
  }

  public PdfSaveOptionsData pageMode(String pageMode) {
    this.pageMode = pageMode;
    return this;
  }

   /**
   * Specifies how the PDF document should be displayed when opened in the PDF reader
   * @return pageMode
  **/
  @ApiModelProperty(value = "Specifies how the PDF document should be displayed when opened in the PDF reader")
  public String getPageMode() {
    return pageMode;
  }

  public void setPageMode(String pageMode) {
    this.pageMode = pageMode;
  }

  public PdfSaveOptionsData preblendImages(Boolean preblendImages) {
    this.preblendImages = preblendImages;
    return this;
  }

   /**
   * Gets or sets a value determining whether or not to preblend transparent images with black background color.
   * @return preblendImages
  **/
  @ApiModelProperty(value = "Gets or sets a value determining whether or not to preblend transparent images with black background color.")
  public Boolean isisPreblendImages() {
    return preblendImages;
  }

  public void setPreblendImages(Boolean preblendImages) {
    this.preblendImages = preblendImages;
  }

  public PdfSaveOptionsData preserveFormFields(Boolean preserveFormFields) {
    this.preserveFormFields = preserveFormFields;
    return this;
  }

   /**
   * Specifies whether to preserve Microsoft Word form fields as form fields in PDF or convert them to text
   * @return preserveFormFields
  **/
  @ApiModelProperty(value = "Specifies whether to preserve Microsoft Word form fields as form fields in PDF or convert them to text")
  public Boolean isisPreserveFormFields() {
    return preserveFormFields;
  }

  public void setPreserveFormFields(Boolean preserveFormFields) {
    this.preserveFormFields = preserveFormFields;
  }

  public PdfSaveOptionsData textCompression(String textCompression) {
    this.textCompression = textCompression;
    return this;
  }

   /**
   * Specifies compression type to be used for all textual content in the document
   * @return textCompression
  **/
  @ApiModelProperty(value = "Specifies compression type to be used for all textual content in the document")
  public String getTextCompression() {
    return textCompression;
  }

  public void setTextCompression(String textCompression) {
    this.textCompression = textCompression;
  }

  public PdfSaveOptionsData useBookFoldPrintingSettings(Boolean useBookFoldPrintingSettings) {
    this.useBookFoldPrintingSettings = useBookFoldPrintingSettings;
    return this;
  }

   /**
   * Determines whether the document should be saved using a booklet printing layout
   * @return useBookFoldPrintingSettings
  **/
  @ApiModelProperty(value = "Determines whether the document should be saved using a booklet printing layout")
  public Boolean isisUseBookFoldPrintingSettings() {
    return useBookFoldPrintingSettings;
  }

  public void setUseBookFoldPrintingSettings(Boolean useBookFoldPrintingSettings) {
    this.useBookFoldPrintingSettings = useBookFoldPrintingSettings;
  }

  public PdfSaveOptionsData useCoreFonts(Boolean useCoreFonts) {
    this.useCoreFonts = useCoreFonts;
    return this;
  }

   /**
   * Determines whether or not to substitute TrueType fonts Arial, Times New Roman, Courier New and Symbol with core PDF Type 1 fonts
   * @return useCoreFonts
  **/
  @ApiModelProperty(value = "Determines whether or not to substitute TrueType fonts Arial, Times New Roman, Courier New and Symbol with core PDF Type 1 fonts")
  public Boolean isisUseCoreFonts() {
    return useCoreFonts;
  }

  public void setUseCoreFonts(Boolean useCoreFonts) {
    this.useCoreFonts = useCoreFonts;
  }

  public PdfSaveOptionsData zoomBehavior(String zoomBehavior) {
    this.zoomBehavior = zoomBehavior;
    return this;
  }

   /**
   * Determines what type of zoom should be applied when a document is opened with a PDF viewer
   * @return zoomBehavior
  **/
  @ApiModelProperty(value = "Determines what type of zoom should be applied when a document is opened with a PDF viewer")
  public String getZoomBehavior() {
    return zoomBehavior;
  }

  public void setZoomBehavior(String zoomBehavior) {
    this.zoomBehavior = zoomBehavior;
  }

  public PdfSaveOptionsData zoomFactor(Integer zoomFactor) {
    this.zoomFactor = zoomFactor;
    return this;
  }

   /**
   * Determines zoom factor (in percentages) for a document
   * @return zoomFactor
  **/
  @ApiModelProperty(value = "Determines zoom factor (in percentages) for a document")
  public Integer getZoomFactor() {
    return zoomFactor;
  }

  public void setZoomFactor(Integer zoomFactor) {
    this.zoomFactor = zoomFactor;
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
    return Objects.equals(this.compliance, pdfSaveOptionsData.compliance) &&
        Objects.equals(this.createNoteHyperlinks, pdfSaveOptionsData.createNoteHyperlinks) &&
        Objects.equals(this.customPropertiesExport, pdfSaveOptionsData.customPropertiesExport) &&
        Objects.equals(this.digitalSignatureDetails, pdfSaveOptionsData.digitalSignatureDetails) &&
        Objects.equals(this.displayDocTitle, pdfSaveOptionsData.displayDocTitle) &&
        Objects.equals(this.downsampleOptions, pdfSaveOptionsData.downsampleOptions) &&
        Objects.equals(this.embedFullFonts, pdfSaveOptionsData.embedFullFonts) &&
        Objects.equals(this.encryptionDetails, pdfSaveOptionsData.encryptionDetails) &&
        Objects.equals(this.escapeUri, pdfSaveOptionsData.escapeUri) &&
        Objects.equals(this.exportDocumentStructure, pdfSaveOptionsData.exportDocumentStructure) &&
        Objects.equals(this.fontEmbeddingMode, pdfSaveOptionsData.fontEmbeddingMode) &&
        Objects.equals(this.headerFooterBookmarksExportMode, pdfSaveOptionsData.headerFooterBookmarksExportMode) &&
        Objects.equals(this.imageColorSpaceExportMode, pdfSaveOptionsData.imageColorSpaceExportMode) &&
        Objects.equals(this.imageCompression, pdfSaveOptionsData.imageCompression) &&
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
    return Objects.hash(compliance, createNoteHyperlinks, customPropertiesExport, digitalSignatureDetails, displayDocTitle, downsampleOptions, embedFullFonts, encryptionDetails, escapeUri, exportDocumentStructure, fontEmbeddingMode, headerFooterBookmarksExportMode, imageColorSpaceExportMode, imageCompression, openHyperlinksInNewWindow, outlineOptions, pageMode, preblendImages, preserveFormFields, textCompression, useBookFoldPrintingSettings, useCoreFonts, zoomBehavior, zoomFactor, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    createNoteHyperlinks: ").append(toIndentedString(createNoteHyperlinks)).append("\n");
    sb.append("    customPropertiesExport: ").append(toIndentedString(customPropertiesExport)).append("\n");
    sb.append("    digitalSignatureDetails: ").append(toIndentedString(digitalSignatureDetails)).append("\n");
    sb.append("    displayDocTitle: ").append(toIndentedString(displayDocTitle)).append("\n");
    sb.append("    downsampleOptions: ").append(toIndentedString(downsampleOptions)).append("\n");
    sb.append("    embedFullFonts: ").append(toIndentedString(embedFullFonts)).append("\n");
    sb.append("    encryptionDetails: ").append(toIndentedString(encryptionDetails)).append("\n");
    sb.append("    escapeUri: ").append(toIndentedString(escapeUri)).append("\n");
    sb.append("    exportDocumentStructure: ").append(toIndentedString(exportDocumentStructure)).append("\n");
    sb.append("    fontEmbeddingMode: ").append(toIndentedString(fontEmbeddingMode)).append("\n");
    sb.append("    headerFooterBookmarksExportMode: ").append(toIndentedString(headerFooterBookmarksExportMode)).append("\n");
    sb.append("    imageColorSpaceExportMode: ").append(toIndentedString(imageColorSpaceExportMode)).append("\n");
    sb.append("    imageCompression: ").append(toIndentedString(imageCompression)).append("\n");
    sb.append("    openHyperlinksInNewWindow: ").append(toIndentedString(openHyperlinksInNewWindow)).append("\n");
    sb.append("    outlineOptions: ").append(toIndentedString(outlineOptions)).append("\n");
    sb.append("    pageMode: ").append(toIndentedString(pageMode)).append("\n");
    sb.append("    preblendImages: ").append(toIndentedString(preblendImages)).append("\n");
    sb.append("    preserveFormFields: ").append(toIndentedString(preserveFormFields)).append("\n");
    sb.append("    textCompression: ").append(toIndentedString(textCompression)).append("\n");
    sb.append("    useBookFoldPrintingSettings: ").append(toIndentedString(useBookFoldPrintingSettings)).append("\n");
    sb.append("    useCoreFonts: ").append(toIndentedString(useCoreFonts)).append("\n");
    sb.append("    zoomBehavior: ").append(toIndentedString(zoomBehavior)).append("\n");
    sb.append("    zoomFactor: ").append(toIndentedString(zoomFactor)).append("\n");
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

