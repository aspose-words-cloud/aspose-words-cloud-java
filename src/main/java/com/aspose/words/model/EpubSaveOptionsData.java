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
import com.aspose.words.model.HtmlSaveOptionsData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Container class for epub save options.
 */
@ApiModel(description = "Container class for epub save options.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-24T08:31:47.592+07:00")
public class EpubSaveOptionsData {
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

  @JsonProperty("AllowNegativeIndent")
  private Boolean allowNegativeIndent = null;

  @JsonProperty("CssClassNamePrefix")
  private String cssClassNamePrefix = null;

  @JsonProperty("CssStyleSheetFileName")
  private String cssStyleSheetFileName = null;

  @JsonProperty("CssStyleSheetType")
  private String cssStyleSheetType = null;

  @JsonProperty("DocumentSplitCriteria")
  private String documentSplitCriteria = null;

  @JsonProperty("DocumentSplitHeadingLevel")
  private Integer documentSplitHeadingLevel = null;

  @JsonProperty("Encoding")
  private String encoding = null;

  @JsonProperty("ExportDocumentProperties")
  private Boolean exportDocumentProperties = null;

  @JsonProperty("ExportDropDownFormFieldAsText")
  private Boolean exportDropDownFormFieldAsText = null;

  @JsonProperty("ExportFontResources")
  private Boolean exportFontResources = null;

  @JsonProperty("ExportFontsAsBase64")
  private Boolean exportFontsAsBase64 = null;

  @JsonProperty("ExportHeadersFootersMode")
  private String exportHeadersFootersMode = null;

  @JsonProperty("ExportImagesAsBase64")
  private Boolean exportImagesAsBase64 = null;

  @JsonProperty("ExportLanguageInformation")
  private Boolean exportLanguageInformation = null;

  @JsonProperty("ExportListLabels")
  private String exportListLabels = null;

  @JsonProperty("ExportOriginalUrlForLinkedImages")
  private Boolean exportOriginalUrlForLinkedImages = null;

  @JsonProperty("ExportPageMargins")
  private Boolean exportPageMargins = null;

  @JsonProperty("ExportPageSetup")
  private Boolean exportPageSetup = null;

  @JsonProperty("ExportRelativeFontSize")
  private Boolean exportRelativeFontSize = null;

  @JsonProperty("ExportRoundtripInformation")
  private Boolean exportRoundtripInformation = null;

  @JsonProperty("ExportTextBoxAsSvg")
  private Boolean exportTextBoxAsSvg = null;

  @JsonProperty("ExportTextInputFormFieldAsText")
  private Boolean exportTextInputFormFieldAsText = null;

  @JsonProperty("ExportTocPageNumbers")
  private Boolean exportTocPageNumbers = null;

  @JsonProperty("ExportXhtmlTransitional")
  private Boolean exportXhtmlTransitional = null;

  @JsonProperty("FontResourcesSubsettingSizeThreshold")
  private Integer fontResourcesSubsettingSizeThreshold = null;

  @JsonProperty("FontsFolder")
  private String fontsFolder = null;

  @JsonProperty("FontsFolderAlias")
  private String fontsFolderAlias = null;

  /**
   * Specifies version of HTML standard that should be used when saving the document to HTML or MHTML.   Default value is Aspose.Words.Saving.HtmlVersion.Xhtml.
   */
  public enum HtmlVersionEnum {
    XHTML("Xhtml"),
    
    HTML5("Html5");

    private String value;

    HtmlVersionEnum(String value) {
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
    public static HtmlVersionEnum fromValue(String text) {
      for (HtmlVersionEnum b : HtmlVersionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("HtmlVersion")
  private HtmlVersionEnum htmlVersion = null;

  @JsonProperty("ImageResolution")
  private Integer imageResolution = null;

  @JsonProperty("ImagesFolder")
  private String imagesFolder = null;

  @JsonProperty("ImagesFolderAlias")
  private String imagesFolderAlias = null;

  /**
   * Specifies in what format metafiles are saved when exporting to HTML, MHTML, or EPUB.  Default value is Aspose.Words.Saving.HtmlMetafileFormat.Png, meaning that metafiles are rendered to raster PNG images.  Metafiles are not natively displayed by HTML browsers. By default, Aspose.Words converts WMF and EMF images into PNG files when exporting to HTML.Other options are to convert metafiles to SVG images or to export them as is without conversion. Some image transforms, in particular image cropping, will not be applied to metafile images if they are exported to HTML without conversion.
   */
  public enum MetafileFormatEnum {
    PNG("Png"),
    
    SVG("Svg"),
    
    EMFORWMF("EmfOrWmf");

    private String value;

    MetafileFormatEnum(String value) {
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
    public static MetafileFormatEnum fromValue(String text) {
      for (MetafileFormatEnum b : MetafileFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("MetafileFormat")
  private MetafileFormatEnum metafileFormat = null;

  /**
   * Controls how OfficeMath objects are exported to HTML, MHTML or EPUB.  Default value is HtmlOfficeMathOutputMode.Image.
   */
  public enum OfficeMathOutputModeEnum {
    IMAGE("Image"),
    
    MATHML("MathML"),
    
    TEXT("Text");

    private String value;

    OfficeMathOutputModeEnum(String value) {
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
    public static OfficeMathOutputModeEnum fromValue(String text) {
      for (OfficeMathOutputModeEnum b : OfficeMathOutputModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("OfficeMathOutputMode")
  private OfficeMathOutputModeEnum officeMathOutputMode = null;

  @JsonProperty("PrettyFormat")
  private Boolean prettyFormat = null;

  @JsonProperty("ResourceFolder")
  private String resourceFolder = null;

  @JsonProperty("ResourceFolderAlias")
  private String resourceFolderAlias = null;

  @JsonProperty("ScaleImageToShapeSize")
  private Boolean scaleImageToShapeSize = null;

  @JsonProperty("TableWidthOutputMode")
  private String tableWidthOutputMode = null;

  @JsonProperty("EpubNavigationMapLevel")
  private Integer epubNavigationMapLevel = null;

  public EpubSaveOptionsData colorMode(String colorMode) {
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

  public EpubSaveOptionsData saveFormat(String saveFormat) {
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

  public EpubSaveOptionsData fileName(String fileName) {
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

  public EpubSaveOptionsData dmlRenderingMode(String dmlRenderingMode) {
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

  public EpubSaveOptionsData dmlEffectsRenderingMode(String dmlEffectsRenderingMode) {
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

  public EpubSaveOptionsData zipOutput(Boolean zipOutput) {
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

  public EpubSaveOptionsData updateLastSavedTimeProperty(Boolean updateLastSavedTimeProperty) {
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

  public EpubSaveOptionsData updateSdtContent(Boolean updateSdtContent) {
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

  public EpubSaveOptionsData updateFields(Boolean updateFields) {
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

  public EpubSaveOptionsData allowNegativeIndent(Boolean allowNegativeIndent) {
    this.allowNegativeIndent = allowNegativeIndent;
    return this;
  }

   /**
   * Specifies whether negative left and right indents of paragraphs are allowed (not normalized)
   * @return allowNegativeIndent
  **/
  @ApiModelProperty(value = "Specifies whether negative left and right indents of paragraphs are allowed (not normalized)")
  public Boolean isAllowNegativeIndent() {
    return allowNegativeIndent;
  }

  public void setAllowNegativeIndent(Boolean allowNegativeIndent) {
    this.allowNegativeIndent = allowNegativeIndent;
  }

  public EpubSaveOptionsData cssClassNamePrefix(String cssClassNamePrefix) {
    this.cssClassNamePrefix = cssClassNamePrefix;
    return this;
  }

   /**
   * Specifies a prefix which is added to all CSS class names. Default value is an empty string and generated CSS class names have no common prefix.  If this value is not empty, all CSS classes generated by Aspose.Words will start with the specified prefix.This might be useful, for example, if you add custom CSS to generated documents and want to prevent class name conflicts. If the value is not null or empty, it must be a valid CSS identifier.
   * @return cssClassNamePrefix
  **/
  @ApiModelProperty(value = "Specifies a prefix which is added to all CSS class names. Default value is an empty string and generated CSS class names have no common prefix.  If this value is not empty, all CSS classes generated by Aspose.Words will start with the specified prefix.This might be useful, for example, if you add custom CSS to generated documents and want to prevent class name conflicts. If the value is not null or empty, it must be a valid CSS identifier.")
  public String getCssClassNamePrefix() {
    return cssClassNamePrefix;
  }

  public void setCssClassNamePrefix(String cssClassNamePrefix) {
    this.cssClassNamePrefix = cssClassNamePrefix;
  }

  public EpubSaveOptionsData cssStyleSheetFileName(String cssStyleSheetFileName) {
    this.cssStyleSheetFileName = cssStyleSheetFileName;
    return this;
  }

   /**
   * Specifies the name of the CSS file written when the document is exported to HTML
   * @return cssStyleSheetFileName
  **/
  @ApiModelProperty(value = "Specifies the name of the CSS file written when the document is exported to HTML")
  public String getCssStyleSheetFileName() {
    return cssStyleSheetFileName;
  }

  public void setCssStyleSheetFileName(String cssStyleSheetFileName) {
    this.cssStyleSheetFileName = cssStyleSheetFileName;
  }

  public EpubSaveOptionsData cssStyleSheetType(String cssStyleSheetType) {
    this.cssStyleSheetType = cssStyleSheetType;
    return this;
  }

   /**
   * Specifies how CSS styles are exported
   * @return cssStyleSheetType
  **/
  @ApiModelProperty(value = "Specifies how CSS styles are exported")
  public String getCssStyleSheetType() {
    return cssStyleSheetType;
  }

  public void setCssStyleSheetType(String cssStyleSheetType) {
    this.cssStyleSheetType = cssStyleSheetType;
  }

  public EpubSaveOptionsData documentSplitCriteria(String documentSplitCriteria) {
    this.documentSplitCriteria = documentSplitCriteria;
    return this;
  }

   /**
   * Specifies how the document should be split when saving
   * @return documentSplitCriteria
  **/
  @ApiModelProperty(value = "Specifies how the document should be split when saving")
  public String getDocumentSplitCriteria() {
    return documentSplitCriteria;
  }

  public void setDocumentSplitCriteria(String documentSplitCriteria) {
    this.documentSplitCriteria = documentSplitCriteria;
  }

  public EpubSaveOptionsData documentSplitHeadingLevel(Integer documentSplitHeadingLevel) {
    this.documentSplitHeadingLevel = documentSplitHeadingLevel;
    return this;
  }

   /**
   * Specifies the maximum level of headings at which to split the document
   * @return documentSplitHeadingLevel
  **/
  @ApiModelProperty(value = "Specifies the maximum level of headings at which to split the document")
  public Integer getDocumentSplitHeadingLevel() {
    return documentSplitHeadingLevel;
  }

  public void setDocumentSplitHeadingLevel(Integer documentSplitHeadingLevel) {
    this.documentSplitHeadingLevel = documentSplitHeadingLevel;
  }

  public EpubSaveOptionsData encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Specifies the encoding to use when exporting
   * @return encoding
  **/
  @ApiModelProperty(value = "Specifies the encoding to use when exporting")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public EpubSaveOptionsData exportDocumentProperties(Boolean exportDocumentProperties) {
    this.exportDocumentProperties = exportDocumentProperties;
    return this;
  }

   /**
   * Specifies whether to export built-in and custom document properties
   * @return exportDocumentProperties
  **/
  @ApiModelProperty(value = "Specifies whether to export built-in and custom document properties")
  public Boolean isExportDocumentProperties() {
    return exportDocumentProperties;
  }

  public void setExportDocumentProperties(Boolean exportDocumentProperties) {
    this.exportDocumentProperties = exportDocumentProperties;
  }

  public EpubSaveOptionsData exportDropDownFormFieldAsText(Boolean exportDropDownFormFieldAsText) {
    this.exportDropDownFormFieldAsText = exportDropDownFormFieldAsText;
    return this;
  }

   /**
   * Controls how drop-down form fields are saved to HTML. Default value is false.
   * @return exportDropDownFormFieldAsText
  **/
  @ApiModelProperty(value = "Controls how drop-down form fields are saved to HTML. Default value is false.")
  public Boolean isExportDropDownFormFieldAsText() {
    return exportDropDownFormFieldAsText;
  }

  public void setExportDropDownFormFieldAsText(Boolean exportDropDownFormFieldAsText) {
    this.exportDropDownFormFieldAsText = exportDropDownFormFieldAsText;
  }

  public EpubSaveOptionsData exportFontResources(Boolean exportFontResources) {
    this.exportFontResources = exportFontResources;
    return this;
  }

   /**
   * Specifies whether font resources should be exported
   * @return exportFontResources
  **/
  @ApiModelProperty(value = "Specifies whether font resources should be exported")
  public Boolean isExportFontResources() {
    return exportFontResources;
  }

  public void setExportFontResources(Boolean exportFontResources) {
    this.exportFontResources = exportFontResources;
  }

  public EpubSaveOptionsData exportFontsAsBase64(Boolean exportFontsAsBase64) {
    this.exportFontsAsBase64 = exportFontsAsBase64;
    return this;
  }

   /**
   * Specifies whether fonts resources should be embedded to HTML in Base64 encoding.  Default is false.
   * @return exportFontsAsBase64
  **/
  @ApiModelProperty(value = "Specifies whether fonts resources should be embedded to HTML in Base64 encoding.  Default is false.")
  public Boolean isExportFontsAsBase64() {
    return exportFontsAsBase64;
  }

  public void setExportFontsAsBase64(Boolean exportFontsAsBase64) {
    this.exportFontsAsBase64 = exportFontsAsBase64;
  }

  public EpubSaveOptionsData exportHeadersFootersMode(String exportHeadersFootersMode) {
    this.exportHeadersFootersMode = exportHeadersFootersMode;
    return this;
  }

   /**
   * Specifies how headers and footers are output
   * @return exportHeadersFootersMode
  **/
  @ApiModelProperty(value = "Specifies how headers and footers are output")
  public String getExportHeadersFootersMode() {
    return exportHeadersFootersMode;
  }

  public void setExportHeadersFootersMode(String exportHeadersFootersMode) {
    this.exportHeadersFootersMode = exportHeadersFootersMode;
  }

  public EpubSaveOptionsData exportImagesAsBase64(Boolean exportImagesAsBase64) {
    this.exportImagesAsBase64 = exportImagesAsBase64;
    return this;
  }

   /**
   * Specifies whether images are saved in Base64 format
   * @return exportImagesAsBase64
  **/
  @ApiModelProperty(value = "Specifies whether images are saved in Base64 format")
  public Boolean isExportImagesAsBase64() {
    return exportImagesAsBase64;
  }

  public void setExportImagesAsBase64(Boolean exportImagesAsBase64) {
    this.exportImagesAsBase64 = exportImagesAsBase64;
  }

  public EpubSaveOptionsData exportLanguageInformation(Boolean exportLanguageInformation) {
    this.exportLanguageInformation = exportLanguageInformation;
    return this;
  }

   /**
   * Specifies whether language information is exported
   * @return exportLanguageInformation
  **/
  @ApiModelProperty(value = "Specifies whether language information is exported")
  public Boolean isExportLanguageInformation() {
    return exportLanguageInformation;
  }

  public void setExportLanguageInformation(Boolean exportLanguageInformation) {
    this.exportLanguageInformation = exportLanguageInformation;
  }

  public EpubSaveOptionsData exportListLabels(String exportListLabels) {
    this.exportListLabels = exportListLabels;
    return this;
  }

   /**
   * Controls how list labels are output
   * @return exportListLabels
  **/
  @ApiModelProperty(value = "Controls how list labels are output")
  public String getExportListLabels() {
    return exportListLabels;
  }

  public void setExportListLabels(String exportListLabels) {
    this.exportListLabels = exportListLabels;
  }

  public EpubSaveOptionsData exportOriginalUrlForLinkedImages(Boolean exportOriginalUrlForLinkedImages) {
    this.exportOriginalUrlForLinkedImages = exportOriginalUrlForLinkedImages;
    return this;
  }

   /**
   * Specifies whether original URL should be used as the URL of the linked images. Default value is false.
   * @return exportOriginalUrlForLinkedImages
  **/
  @ApiModelProperty(value = "Specifies whether original URL should be used as the URL of the linked images. Default value is false.")
  public Boolean isExportOriginalUrlForLinkedImages() {
    return exportOriginalUrlForLinkedImages;
  }

  public void setExportOriginalUrlForLinkedImages(Boolean exportOriginalUrlForLinkedImages) {
    this.exportOriginalUrlForLinkedImages = exportOriginalUrlForLinkedImages;
  }

  public EpubSaveOptionsData exportPageMargins(Boolean exportPageMargins) {
    this.exportPageMargins = exportPageMargins;
    return this;
  }

   /**
   * Specifies whether page margins is exported to HTML, MHTML or EPUB. Default is false.
   * @return exportPageMargins
  **/
  @ApiModelProperty(value = "Specifies whether page margins is exported to HTML, MHTML or EPUB. Default is false.")
  public Boolean isExportPageMargins() {
    return exportPageMargins;
  }

  public void setExportPageMargins(Boolean exportPageMargins) {
    this.exportPageMargins = exportPageMargins;
  }

  public EpubSaveOptionsData exportPageSetup(Boolean exportPageSetup) {
    this.exportPageSetup = exportPageSetup;
    return this;
  }

   /**
   * Specifies whether page setup is exported
   * @return exportPageSetup
  **/
  @ApiModelProperty(value = "Specifies whether page setup is exported")
  public Boolean isExportPageSetup() {
    return exportPageSetup;
  }

  public void setExportPageSetup(Boolean exportPageSetup) {
    this.exportPageSetup = exportPageSetup;
  }

  public EpubSaveOptionsData exportRelativeFontSize(Boolean exportRelativeFontSize) {
    this.exportRelativeFontSize = exportRelativeFontSize;
    return this;
  }

   /**
   * Specifies whether font sizes should be output in relative units when saving
   * @return exportRelativeFontSize
  **/
  @ApiModelProperty(value = "Specifies whether font sizes should be output in relative units when saving")
  public Boolean isExportRelativeFontSize() {
    return exportRelativeFontSize;
  }

  public void setExportRelativeFontSize(Boolean exportRelativeFontSize) {
    this.exportRelativeFontSize = exportRelativeFontSize;
  }

  public EpubSaveOptionsData exportRoundtripInformation(Boolean exportRoundtripInformation) {
    this.exportRoundtripInformation = exportRoundtripInformation;
    return this;
  }

   /**
   * Specifies whether to write the roundtrip information when saving to HTML Default value is true.
   * @return exportRoundtripInformation
  **/
  @ApiModelProperty(value = "Specifies whether to write the roundtrip information when saving to HTML Default value is true.")
  public Boolean isExportRoundtripInformation() {
    return exportRoundtripInformation;
  }

  public void setExportRoundtripInformation(Boolean exportRoundtripInformation) {
    this.exportRoundtripInformation = exportRoundtripInformation;
  }

  public EpubSaveOptionsData exportTextBoxAsSvg(Boolean exportTextBoxAsSvg) {
    this.exportTextBoxAsSvg = exportTextBoxAsSvg;
    return this;
  }

   /**
   * Controls how textboxes represented by Aspose.Words.Drawing.Shape are saved to HTML, MHTML or EPUB. Default value is false.    When set to true, exports textboxes as inline \&quot;svg\&quot; elements. When false, exports as \&quot;image\&quot; elements.
   * @return exportTextBoxAsSvg
  **/
  @ApiModelProperty(value = "Controls how textboxes represented by Aspose.Words.Drawing.Shape are saved to HTML, MHTML or EPUB. Default value is false.    When set to true, exports textboxes as inline \"svg\" elements. When false, exports as \"image\" elements.")
  public Boolean isExportTextBoxAsSvg() {
    return exportTextBoxAsSvg;
  }

  public void setExportTextBoxAsSvg(Boolean exportTextBoxAsSvg) {
    this.exportTextBoxAsSvg = exportTextBoxAsSvg;
  }

  public EpubSaveOptionsData exportTextInputFormFieldAsText(Boolean exportTextInputFormFieldAsText) {
    this.exportTextInputFormFieldAsText = exportTextInputFormFieldAsText;
    return this;
  }

   /**
   * Controls how text input form fields are saved
   * @return exportTextInputFormFieldAsText
  **/
  @ApiModelProperty(value = "Controls how text input form fields are saved")
  public Boolean isExportTextInputFormFieldAsText() {
    return exportTextInputFormFieldAsText;
  }

  public void setExportTextInputFormFieldAsText(Boolean exportTextInputFormFieldAsText) {
    this.exportTextInputFormFieldAsText = exportTextInputFormFieldAsText;
  }

  public EpubSaveOptionsData exportTocPageNumbers(Boolean exportTocPageNumbers) {
    this.exportTocPageNumbers = exportTocPageNumbers;
    return this;
  }

   /**
   * Specifies whether to write page numbers to table of contents when saving
   * @return exportTocPageNumbers
  **/
  @ApiModelProperty(value = "Specifies whether to write page numbers to table of contents when saving")
  public Boolean isExportTocPageNumbers() {
    return exportTocPageNumbers;
  }

  public void setExportTocPageNumbers(Boolean exportTocPageNumbers) {
    this.exportTocPageNumbers = exportTocPageNumbers;
  }

  public EpubSaveOptionsData exportXhtmlTransitional(Boolean exportXhtmlTransitional) {
    this.exportXhtmlTransitional = exportXhtmlTransitional;
    return this;
  }

   /**
   * Specifies whether to write the DOCTYPE declaration when saving
   * @return exportXhtmlTransitional
  **/
  @ApiModelProperty(value = "Specifies whether to write the DOCTYPE declaration when saving")
  public Boolean isExportXhtmlTransitional() {
    return exportXhtmlTransitional;
  }

  public void setExportXhtmlTransitional(Boolean exportXhtmlTransitional) {
    this.exportXhtmlTransitional = exportXhtmlTransitional;
  }

  public EpubSaveOptionsData fontResourcesSubsettingSizeThreshold(Integer fontResourcesSubsettingSizeThreshold) {
    this.fontResourcesSubsettingSizeThreshold = fontResourcesSubsettingSizeThreshold;
    return this;
  }

   /**
   * Controls which font resources need subsetting when saving
   * @return fontResourcesSubsettingSizeThreshold
  **/
  @ApiModelProperty(value = "Controls which font resources need subsetting when saving")
  public Integer getFontResourcesSubsettingSizeThreshold() {
    return fontResourcesSubsettingSizeThreshold;
  }

  public void setFontResourcesSubsettingSizeThreshold(Integer fontResourcesSubsettingSizeThreshold) {
    this.fontResourcesSubsettingSizeThreshold = fontResourcesSubsettingSizeThreshold;
  }

  public EpubSaveOptionsData fontsFolder(String fontsFolder) {
    this.fontsFolder = fontsFolder;
    return this;
  }

   /**
   * Specifies the physical folder where fonts are saved when exporting a document
   * @return fontsFolder
  **/
  @ApiModelProperty(value = "Specifies the physical folder where fonts are saved when exporting a document")
  public String getFontsFolder() {
    return fontsFolder;
  }

  public void setFontsFolder(String fontsFolder) {
    this.fontsFolder = fontsFolder;
  }

  public EpubSaveOptionsData fontsFolderAlias(String fontsFolderAlias) {
    this.fontsFolderAlias = fontsFolderAlias;
    return this;
  }

   /**
   * Specifies the name of the folder used to construct font URIs
   * @return fontsFolderAlias
  **/
  @ApiModelProperty(value = "Specifies the name of the folder used to construct font URIs")
  public String getFontsFolderAlias() {
    return fontsFolderAlias;
  }

  public void setFontsFolderAlias(String fontsFolderAlias) {
    this.fontsFolderAlias = fontsFolderAlias;
  }

  public EpubSaveOptionsData htmlVersion(HtmlVersionEnum htmlVersion) {
    this.htmlVersion = htmlVersion;
    return this;
  }

   /**
   * Specifies version of HTML standard that should be used when saving the document to HTML or MHTML.   Default value is Aspose.Words.Saving.HtmlVersion.Xhtml.
   * @return htmlVersion
  **/
  @ApiModelProperty(value = "Specifies version of HTML standard that should be used when saving the document to HTML or MHTML.   Default value is Aspose.Words.Saving.HtmlVersion.Xhtml.")
  public HtmlVersionEnum getHtmlVersion() {
    return htmlVersion;
  }

  public void setHtmlVersion(HtmlVersionEnum htmlVersion) {
    this.htmlVersion = htmlVersion;
  }

  public EpubSaveOptionsData imageResolution(Integer imageResolution) {
    this.imageResolution = imageResolution;
    return this;
  }

   /**
   * Specifies the output resolution for images when exporting
   * @return imageResolution
  **/
  @ApiModelProperty(value = "Specifies the output resolution for images when exporting")
  public Integer getImageResolution() {
    return imageResolution;
  }

  public void setImageResolution(Integer imageResolution) {
    this.imageResolution = imageResolution;
  }

  public EpubSaveOptionsData imagesFolder(String imagesFolder) {
    this.imagesFolder = imagesFolder;
    return this;
  }

   /**
   * Specifies the physical folder where images are saved when exporting a document
   * @return imagesFolder
  **/
  @ApiModelProperty(value = "Specifies the physical folder where images are saved when exporting a document")
  public String getImagesFolder() {
    return imagesFolder;
  }

  public void setImagesFolder(String imagesFolder) {
    this.imagesFolder = imagesFolder;
  }

  public EpubSaveOptionsData imagesFolderAlias(String imagesFolderAlias) {
    this.imagesFolderAlias = imagesFolderAlias;
    return this;
  }

   /**
   * Specifies the name of the folder used to construct image URIs
   * @return imagesFolderAlias
  **/
  @ApiModelProperty(value = "Specifies the name of the folder used to construct image URIs")
  public String getImagesFolderAlias() {
    return imagesFolderAlias;
  }

  public void setImagesFolderAlias(String imagesFolderAlias) {
    this.imagesFolderAlias = imagesFolderAlias;
  }

  public EpubSaveOptionsData metafileFormat(MetafileFormatEnum metafileFormat) {
    this.metafileFormat = metafileFormat;
    return this;
  }

   /**
   * Specifies in what format metafiles are saved when exporting to HTML, MHTML, or EPUB.  Default value is Aspose.Words.Saving.HtmlMetafileFormat.Png, meaning that metafiles are rendered to raster PNG images.  Metafiles are not natively displayed by HTML browsers. By default, Aspose.Words converts WMF and EMF images into PNG files when exporting to HTML.Other options are to convert metafiles to SVG images or to export them as is without conversion. Some image transforms, in particular image cropping, will not be applied to metafile images if they are exported to HTML without conversion.
   * @return metafileFormat
  **/
  @ApiModelProperty(value = "Specifies in what format metafiles are saved when exporting to HTML, MHTML, or EPUB.  Default value is Aspose.Words.Saving.HtmlMetafileFormat.Png, meaning that metafiles are rendered to raster PNG images.  Metafiles are not natively displayed by HTML browsers. By default, Aspose.Words converts WMF and EMF images into PNG files when exporting to HTML.Other options are to convert metafiles to SVG images or to export them as is without conversion. Some image transforms, in particular image cropping, will not be applied to metafile images if they are exported to HTML without conversion.")
  public MetafileFormatEnum getMetafileFormat() {
    return metafileFormat;
  }

  public void setMetafileFormat(MetafileFormatEnum metafileFormat) {
    this.metafileFormat = metafileFormat;
  }

  public EpubSaveOptionsData officeMathOutputMode(OfficeMathOutputModeEnum officeMathOutputMode) {
    this.officeMathOutputMode = officeMathOutputMode;
    return this;
  }

   /**
   * Controls how OfficeMath objects are exported to HTML, MHTML or EPUB.  Default value is HtmlOfficeMathOutputMode.Image.
   * @return officeMathOutputMode
  **/
  @ApiModelProperty(value = "Controls how OfficeMath objects are exported to HTML, MHTML or EPUB.  Default value is HtmlOfficeMathOutputMode.Image.")
  public OfficeMathOutputModeEnum getOfficeMathOutputMode() {
    return officeMathOutputMode;
  }

  public void setOfficeMathOutputMode(OfficeMathOutputModeEnum officeMathOutputMode) {
    this.officeMathOutputMode = officeMathOutputMode;
  }

  public EpubSaveOptionsData prettyFormat(Boolean prettyFormat) {
    this.prettyFormat = prettyFormat;
    return this;
  }

   /**
   * Specifies whether or not use pretty formats output
   * @return prettyFormat
  **/
  @ApiModelProperty(value = "Specifies whether or not use pretty formats output")
  public Boolean isPrettyFormat() {
    return prettyFormat;
  }

  public void setPrettyFormat(Boolean prettyFormat) {
    this.prettyFormat = prettyFormat;
  }

  public EpubSaveOptionsData resourceFolder(String resourceFolder) {
    this.resourceFolder = resourceFolder;
    return this;
  }

   /**
   * Specifies a physical folder where all resources like images, fonts, and external CSS are saved when a document is exported to HTML. Default is an empty string.
   * @return resourceFolder
  **/
  @ApiModelProperty(value = "Specifies a physical folder where all resources like images, fonts, and external CSS are saved when a document is exported to HTML. Default is an empty string.")
  public String getResourceFolder() {
    return resourceFolder;
  }

  public void setResourceFolder(String resourceFolder) {
    this.resourceFolder = resourceFolder;
  }

  public EpubSaveOptionsData resourceFolderAlias(String resourceFolderAlias) {
    this.resourceFolderAlias = resourceFolderAlias;
    return this;
  }

   /**
   * Specifies the name of the folder used to construct URIs of all resources written into an HTML document.  Default is an empty string.
   * @return resourceFolderAlias
  **/
  @ApiModelProperty(value = "Specifies the name of the folder used to construct URIs of all resources written into an HTML document.  Default is an empty string.")
  public String getResourceFolderAlias() {
    return resourceFolderAlias;
  }

  public void setResourceFolderAlias(String resourceFolderAlias) {
    this.resourceFolderAlias = resourceFolderAlias;
  }

  public EpubSaveOptionsData scaleImageToShapeSize(Boolean scaleImageToShapeSize) {
    this.scaleImageToShapeSize = scaleImageToShapeSize;
    return this;
  }

   /**
   * Specifies whether images are scaled by Aspose.Words to the bounding shape size when exporting
   * @return scaleImageToShapeSize
  **/
  @ApiModelProperty(value = "Specifies whether images are scaled by Aspose.Words to the bounding shape size when exporting")
  public Boolean isScaleImageToShapeSize() {
    return scaleImageToShapeSize;
  }

  public void setScaleImageToShapeSize(Boolean scaleImageToShapeSize) {
    this.scaleImageToShapeSize = scaleImageToShapeSize;
  }

  public EpubSaveOptionsData tableWidthOutputMode(String tableWidthOutputMode) {
    this.tableWidthOutputMode = tableWidthOutputMode;
    return this;
  }

   /**
   * Controls how table, row and cell widths are exported
   * @return tableWidthOutputMode
  **/
  @ApiModelProperty(value = "Controls how table, row and cell widths are exported")
  public String getTableWidthOutputMode() {
    return tableWidthOutputMode;
  }

  public void setTableWidthOutputMode(String tableWidthOutputMode) {
    this.tableWidthOutputMode = tableWidthOutputMode;
  }

  public EpubSaveOptionsData epubNavigationMapLevel(Integer epubNavigationMapLevel) {
    this.epubNavigationMapLevel = epubNavigationMapLevel;
    return this;
  }

   /**
   * Specifies the maximum level of headings populated to the navigation map when exporting
   * @return epubNavigationMapLevel
  **/
  @ApiModelProperty(value = "Specifies the maximum level of headings populated to the navigation map when exporting")
  public Integer getEpubNavigationMapLevel() {
    return epubNavigationMapLevel;
  }

  public void setEpubNavigationMapLevel(Integer epubNavigationMapLevel) {
    this.epubNavigationMapLevel = epubNavigationMapLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EpubSaveOptionsData epubSaveOptionsData = (EpubSaveOptionsData) o;
    return Objects.equals(this.colorMode, epubSaveOptionsData.colorMode) &&
        Objects.equals(this.saveFormat, epubSaveOptionsData.saveFormat) &&
        Objects.equals(this.fileName, epubSaveOptionsData.fileName) &&
        Objects.equals(this.dmlRenderingMode, epubSaveOptionsData.dmlRenderingMode) &&
        Objects.equals(this.dmlEffectsRenderingMode, epubSaveOptionsData.dmlEffectsRenderingMode) &&
        Objects.equals(this.zipOutput, epubSaveOptionsData.zipOutput) &&
        Objects.equals(this.updateLastSavedTimeProperty, epubSaveOptionsData.updateLastSavedTimeProperty) &&
        Objects.equals(this.updateSdtContent, epubSaveOptionsData.updateSdtContent) &&
        Objects.equals(this.updateFields, epubSaveOptionsData.updateFields) &&
        Objects.equals(this.allowNegativeIndent, epubSaveOptionsData.allowNegativeIndent) &&
        Objects.equals(this.cssClassNamePrefix, epubSaveOptionsData.cssClassNamePrefix) &&
        Objects.equals(this.cssStyleSheetFileName, epubSaveOptionsData.cssStyleSheetFileName) &&
        Objects.equals(this.cssStyleSheetType, epubSaveOptionsData.cssStyleSheetType) &&
        Objects.equals(this.documentSplitCriteria, epubSaveOptionsData.documentSplitCriteria) &&
        Objects.equals(this.documentSplitHeadingLevel, epubSaveOptionsData.documentSplitHeadingLevel) &&
        Objects.equals(this.encoding, epubSaveOptionsData.encoding) &&
        Objects.equals(this.exportDocumentProperties, epubSaveOptionsData.exportDocumentProperties) &&
        Objects.equals(this.exportDropDownFormFieldAsText, epubSaveOptionsData.exportDropDownFormFieldAsText) &&
        Objects.equals(this.exportFontResources, epubSaveOptionsData.exportFontResources) &&
        Objects.equals(this.exportFontsAsBase64, epubSaveOptionsData.exportFontsAsBase64) &&
        Objects.equals(this.exportHeadersFootersMode, epubSaveOptionsData.exportHeadersFootersMode) &&
        Objects.equals(this.exportImagesAsBase64, epubSaveOptionsData.exportImagesAsBase64) &&
        Objects.equals(this.exportLanguageInformation, epubSaveOptionsData.exportLanguageInformation) &&
        Objects.equals(this.exportListLabels, epubSaveOptionsData.exportListLabels) &&
        Objects.equals(this.exportOriginalUrlForLinkedImages, epubSaveOptionsData.exportOriginalUrlForLinkedImages) &&
        Objects.equals(this.exportPageMargins, epubSaveOptionsData.exportPageMargins) &&
        Objects.equals(this.exportPageSetup, epubSaveOptionsData.exportPageSetup) &&
        Objects.equals(this.exportRelativeFontSize, epubSaveOptionsData.exportRelativeFontSize) &&
        Objects.equals(this.exportRoundtripInformation, epubSaveOptionsData.exportRoundtripInformation) &&
        Objects.equals(this.exportTextBoxAsSvg, epubSaveOptionsData.exportTextBoxAsSvg) &&
        Objects.equals(this.exportTextInputFormFieldAsText, epubSaveOptionsData.exportTextInputFormFieldAsText) &&
        Objects.equals(this.exportTocPageNumbers, epubSaveOptionsData.exportTocPageNumbers) &&
        Objects.equals(this.exportXhtmlTransitional, epubSaveOptionsData.exportXhtmlTransitional) &&
        Objects.equals(this.fontResourcesSubsettingSizeThreshold, epubSaveOptionsData.fontResourcesSubsettingSizeThreshold) &&
        Objects.equals(this.fontsFolder, epubSaveOptionsData.fontsFolder) &&
        Objects.equals(this.fontsFolderAlias, epubSaveOptionsData.fontsFolderAlias) &&
        Objects.equals(this.htmlVersion, epubSaveOptionsData.htmlVersion) &&
        Objects.equals(this.imageResolution, epubSaveOptionsData.imageResolution) &&
        Objects.equals(this.imagesFolder, epubSaveOptionsData.imagesFolder) &&
        Objects.equals(this.imagesFolderAlias, epubSaveOptionsData.imagesFolderAlias) &&
        Objects.equals(this.metafileFormat, epubSaveOptionsData.metafileFormat) &&
        Objects.equals(this.officeMathOutputMode, epubSaveOptionsData.officeMathOutputMode) &&
        Objects.equals(this.prettyFormat, epubSaveOptionsData.prettyFormat) &&
        Objects.equals(this.resourceFolder, epubSaveOptionsData.resourceFolder) &&
        Objects.equals(this.resourceFolderAlias, epubSaveOptionsData.resourceFolderAlias) &&
        Objects.equals(this.scaleImageToShapeSize, epubSaveOptionsData.scaleImageToShapeSize) &&
        Objects.equals(this.tableWidthOutputMode, epubSaveOptionsData.tableWidthOutputMode) &&
        Objects.equals(this.epubNavigationMapLevel, epubSaveOptionsData.epubNavigationMapLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorMode, saveFormat, fileName, dmlRenderingMode, dmlEffectsRenderingMode, zipOutput, updateLastSavedTimeProperty, updateSdtContent, updateFields, allowNegativeIndent, cssClassNamePrefix, cssStyleSheetFileName, cssStyleSheetType, documentSplitCriteria, documentSplitHeadingLevel, encoding, exportDocumentProperties, exportDropDownFormFieldAsText, exportFontResources, exportFontsAsBase64, exportHeadersFootersMode, exportImagesAsBase64, exportLanguageInformation, exportListLabels, exportOriginalUrlForLinkedImages, exportPageMargins, exportPageSetup, exportRelativeFontSize, exportRoundtripInformation, exportTextBoxAsSvg, exportTextInputFormFieldAsText, exportTocPageNumbers, exportXhtmlTransitional, fontResourcesSubsettingSizeThreshold, fontsFolder, fontsFolderAlias, htmlVersion, imageResolution, imagesFolder, imagesFolderAlias, metafileFormat, officeMathOutputMode, prettyFormat, resourceFolder, resourceFolderAlias, scaleImageToShapeSize, tableWidthOutputMode, epubNavigationMapLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EpubSaveOptionsData {\n");
    
    sb.append("    colorMode: ").append(toIndentedString(colorMode)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    dmlRenderingMode: ").append(toIndentedString(dmlRenderingMode)).append("\n");
    sb.append("    dmlEffectsRenderingMode: ").append(toIndentedString(dmlEffectsRenderingMode)).append("\n");
    sb.append("    zipOutput: ").append(toIndentedString(zipOutput)).append("\n");
    sb.append("    updateLastSavedTimeProperty: ").append(toIndentedString(updateLastSavedTimeProperty)).append("\n");
    sb.append("    updateSdtContent: ").append(toIndentedString(updateSdtContent)).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
    sb.append("    allowNegativeIndent: ").append(toIndentedString(allowNegativeIndent)).append("\n");
    sb.append("    cssClassNamePrefix: ").append(toIndentedString(cssClassNamePrefix)).append("\n");
    sb.append("    cssStyleSheetFileName: ").append(toIndentedString(cssStyleSheetFileName)).append("\n");
    sb.append("    cssStyleSheetType: ").append(toIndentedString(cssStyleSheetType)).append("\n");
    sb.append("    documentSplitCriteria: ").append(toIndentedString(documentSplitCriteria)).append("\n");
    sb.append("    documentSplitHeadingLevel: ").append(toIndentedString(documentSplitHeadingLevel)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    exportDocumentProperties: ").append(toIndentedString(exportDocumentProperties)).append("\n");
    sb.append("    exportDropDownFormFieldAsText: ").append(toIndentedString(exportDropDownFormFieldAsText)).append("\n");
    sb.append("    exportFontResources: ").append(toIndentedString(exportFontResources)).append("\n");
    sb.append("    exportFontsAsBase64: ").append(toIndentedString(exportFontsAsBase64)).append("\n");
    sb.append("    exportHeadersFootersMode: ").append(toIndentedString(exportHeadersFootersMode)).append("\n");
    sb.append("    exportImagesAsBase64: ").append(toIndentedString(exportImagesAsBase64)).append("\n");
    sb.append("    exportLanguageInformation: ").append(toIndentedString(exportLanguageInformation)).append("\n");
    sb.append("    exportListLabels: ").append(toIndentedString(exportListLabels)).append("\n");
    sb.append("    exportOriginalUrlForLinkedImages: ").append(toIndentedString(exportOriginalUrlForLinkedImages)).append("\n");
    sb.append("    exportPageMargins: ").append(toIndentedString(exportPageMargins)).append("\n");
    sb.append("    exportPageSetup: ").append(toIndentedString(exportPageSetup)).append("\n");
    sb.append("    exportRelativeFontSize: ").append(toIndentedString(exportRelativeFontSize)).append("\n");
    sb.append("    exportRoundtripInformation: ").append(toIndentedString(exportRoundtripInformation)).append("\n");
    sb.append("    exportTextBoxAsSvg: ").append(toIndentedString(exportTextBoxAsSvg)).append("\n");
    sb.append("    exportTextInputFormFieldAsText: ").append(toIndentedString(exportTextInputFormFieldAsText)).append("\n");
    sb.append("    exportTocPageNumbers: ").append(toIndentedString(exportTocPageNumbers)).append("\n");
    sb.append("    exportXhtmlTransitional: ").append(toIndentedString(exportXhtmlTransitional)).append("\n");
    sb.append("    fontResourcesSubsettingSizeThreshold: ").append(toIndentedString(fontResourcesSubsettingSizeThreshold)).append("\n");
    sb.append("    fontsFolder: ").append(toIndentedString(fontsFolder)).append("\n");
    sb.append("    fontsFolderAlias: ").append(toIndentedString(fontsFolderAlias)).append("\n");
    sb.append("    htmlVersion: ").append(toIndentedString(htmlVersion)).append("\n");
    sb.append("    imageResolution: ").append(toIndentedString(imageResolution)).append("\n");
    sb.append("    imagesFolder: ").append(toIndentedString(imagesFolder)).append("\n");
    sb.append("    imagesFolderAlias: ").append(toIndentedString(imagesFolderAlias)).append("\n");
    sb.append("    metafileFormat: ").append(toIndentedString(metafileFormat)).append("\n");
    sb.append("    officeMathOutputMode: ").append(toIndentedString(officeMathOutputMode)).append("\n");
    sb.append("    prettyFormat: ").append(toIndentedString(prettyFormat)).append("\n");
    sb.append("    resourceFolder: ").append(toIndentedString(resourceFolder)).append("\n");
    sb.append("    resourceFolderAlias: ").append(toIndentedString(resourceFolderAlias)).append("\n");
    sb.append("    scaleImageToShapeSize: ").append(toIndentedString(scaleImageToShapeSize)).append("\n");
    sb.append("    tableWidthOutputMode: ").append(toIndentedString(tableWidthOutputMode)).append("\n");
    sb.append("    epubNavigationMapLevel: ").append(toIndentedString(epubNavigationMapLevel)).append("\n");
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

