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
import com.aspose.words.model.DownsampleOptionsData;
import com.aspose.words.model.FixedPageSaveOptionsData;
import com.aspose.words.model.MetafileRenderingOptionsData;
import com.aspose.words.model.OutlineOptionsData;
import com.aspose.words.model.PdfDigitalSignatureDetailsData;
import com.aspose.words.model.PdfEncryptionDetailsData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * container class for pdf save options
 */
@ApiModel(description = "container class for pdf save options")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:10:48.387Z")
public class PdfSaveOptionsData {
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

  @JsonProperty("Compliance")
  private String compliance = null;

  @JsonProperty("CreateNoteHyperlinks")
  private Boolean createNoteHyperlinks = null;

  @JsonProperty("CustomPropertiesExport")
  private String customPropertiesExport = null;

  @JsonProperty("DigitalSignatureDetails")
  private PdfDigitalSignatureDetailsData digitalSignatureDetails = null;

  @JsonProperty("DisplayDocTitle")
  private Boolean displayDocTitle = null;

  @JsonProperty("DownsampleOptions")
  private DownsampleOptionsData downsampleOptions = null;

  @JsonProperty("EmbedFullFonts")
  private Boolean embedFullFonts = null;

  @JsonProperty("EncryptionDetails")
  private PdfEncryptionDetailsData encryptionDetails = null;

  @JsonProperty("EscapeUri")
  private Boolean escapeUri = null;

  @JsonProperty("ExportDocumentStructure")
  private Boolean exportDocumentStructure = null;

  @JsonProperty("FontEmbeddingMode")
  private String fontEmbeddingMode = null;

  /**
   * Determines how bookmarks in headers/footers are exported. The default value is Aspose.Words.Saving.HeaderFooterBookmarksExportMode.All.
   */
  public enum HeaderFooterBookmarksExportModeEnum {
    NONE("None"),
    
    FIRST("First"),
    
    ALL("All");

    private String value;

    HeaderFooterBookmarksExportModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HeaderFooterBookmarksExportModeEnum fromValue(String text) {
      for (HeaderFooterBookmarksExportModeEnum b : HeaderFooterBookmarksExportModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("HeaderFooterBookmarksExportMode")
  private HeaderFooterBookmarksExportModeEnum headerFooterBookmarksExportMode = null;

  @JsonProperty("ImageColorSpaceExportMode")
  private String imageColorSpaceExportMode = null;

  @JsonProperty("ImageCompression")
  private String imageCompression = null;

  @JsonProperty("OpenHyperlinksInNewWindow")
  private Boolean openHyperlinksInNewWindow = null;

  @JsonProperty("OutlineOptions")
  private OutlineOptionsData outlineOptions = null;

  @JsonProperty("PageMode")
  private String pageMode = null;

  @JsonProperty("PreblendImages")
  private Boolean preblendImages = null;

  @JsonProperty("PreserveFormFields")
  private Boolean preserveFormFields = null;

  @JsonProperty("TextCompression")
  private String textCompression = null;

  @JsonProperty("UseBookFoldPrintingSettings")
  private Boolean useBookFoldPrintingSettings = null;

  @JsonProperty("UseCoreFonts")
  private Boolean useCoreFonts = null;

  @JsonProperty("ZoomBehavior")
  private String zoomBehavior = null;

  @JsonProperty("ZoomFactor")
  private Integer zoomFactor = null;

  public PdfSaveOptionsData colorMode(String colorMode) {
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

  public PdfSaveOptionsData saveFormat(String saveFormat) {
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

  public PdfSaveOptionsData fileName(String fileName) {
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

  public PdfSaveOptionsData dmlRenderingMode(String dmlRenderingMode) {
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

  public PdfSaveOptionsData dmlEffectsRenderingMode(String dmlEffectsRenderingMode) {
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

  public PdfSaveOptionsData zipOutput(Boolean zipOutput) {
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

  public PdfSaveOptionsData updateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
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

  public PdfSaveOptionsData updateSdtContent(Boolean updateSdtContent) {
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

  public PdfSaveOptionsData updateFields(Boolean updateFields) {
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

  public PdfSaveOptionsData jpegQuality(Integer jpegQuality) {
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

  public PdfSaveOptionsData metafileRenderingOptions(MetafileRenderingOptionsData metafileRenderingOptions) {
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

  public PdfSaveOptionsData numeralFormat(String numeralFormat) {
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

  public PdfSaveOptionsData optimizeOutput(Boolean optimizeOutput) {
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

  public PdfSaveOptionsData pageCount(Integer pageCount) {
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

  public PdfSaveOptionsData pageIndex(Integer pageIndex) {
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
  public Boolean isCreateNoteHyperlinks() {
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
  public Boolean isDisplayDocTitle() {
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
  public Boolean isEmbedFullFonts() {
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
  public Boolean isEscapeUri() {
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
  public Boolean isExportDocumentStructure() {
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
  public Boolean isOpenHyperlinksInNewWindow() {
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
  public Boolean isPreblendImages() {
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
  public Boolean isPreserveFormFields() {
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
  public Boolean isUseBookFoldPrintingSettings() {
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
  public Boolean isUseCoreFonts() {
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
    return Objects.equals(this.colorMode, pdfSaveOptionsData.colorMode) &&
        Objects.equals(this.saveFormat, pdfSaveOptionsData.saveFormat) &&
        Objects.equals(this.fileName, pdfSaveOptionsData.fileName) &&
        Objects.equals(this.dmlRenderingMode, pdfSaveOptionsData.dmlRenderingMode) &&
        Objects.equals(this.dmlEffectsRenderingMode, pdfSaveOptionsData.dmlEffectsRenderingMode) &&
        Objects.equals(this.zipOutput, pdfSaveOptionsData.zipOutput) &&
        Objects.equals(this.updateLastSavedTimeProperty, pdfSaveOptionsData.updateLastSavedTimeProperty) &&
        Objects.equals(this.updateSdtContent, pdfSaveOptionsData.updateSdtContent) &&
        Objects.equals(this.updateFields, pdfSaveOptionsData.updateFields) &&
        Objects.equals(this.jpegQuality, pdfSaveOptionsData.jpegQuality) &&
        Objects.equals(this.metafileRenderingOptions, pdfSaveOptionsData.metafileRenderingOptions) &&
        Objects.equals(this.numeralFormat, pdfSaveOptionsData.numeralFormat) &&
        Objects.equals(this.optimizeOutput, pdfSaveOptionsData.optimizeOutput) &&
        Objects.equals(this.pageCount, pdfSaveOptionsData.pageCount) &&
        Objects.equals(this.pageIndex, pdfSaveOptionsData.pageIndex) &&
        Objects.equals(this.compliance, pdfSaveOptionsData.compliance) &&
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
        Objects.equals(this.zoomFactor, pdfSaveOptionsData.zoomFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorMode, saveFormat, fileName, dmlRenderingMode, dmlEffectsRenderingMode, zipOutput, updateLastSavedTimeProperty, updateSdtContent, updateFields, jpegQuality, metafileRenderingOptions, numeralFormat, optimizeOutput, pageCount, pageIndex, compliance, createNoteHyperlinks, customPropertiesExport, digitalSignatureDetails, displayDocTitle, downsampleOptions, embedFullFonts, encryptionDetails, escapeUri, exportDocumentStructure, fontEmbeddingMode, headerFooterBookmarksExportMode, imageColorSpaceExportMode, imageCompression, openHyperlinksInNewWindow, outlineOptions, pageMode, preblendImages, preserveFormFields, textCompression, useBookFoldPrintingSettings, useCoreFonts, zoomBehavior, zoomFactor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSaveOptionsData {\n");
    
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

