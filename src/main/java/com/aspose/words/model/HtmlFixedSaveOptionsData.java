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
import com.aspose.words.cloud.model.FixedPageSaveOptionsData;
import com.aspose.words.cloud.model.MetafileRenderingOptionsData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * container class for fixed html save options
 */
@ApiModel(description = "container class for fixed html save options")

public class HtmlFixedSaveOptionsData extends FixedPageSaveOptionsData {
  @SerializedName("CssClassNamesPrefix")
  private String cssClassNamesPrefix = null;

  @SerializedName("Encoding")
  private String encoding = null;

  @SerializedName("ExportEmbeddedCss")
  private Boolean exportEmbeddedCss = null;

  @SerializedName("ExportEmbeddedFonts")
  private Boolean exportEmbeddedFonts = null;

  @SerializedName("ExportEmbeddedImages")
  private Boolean exportEmbeddedImages = null;

  @SerializedName("ExportFormFields")
  private Boolean exportFormFields = null;

  @SerializedName("FontFormat")
  private String fontFormat = null;

  @SerializedName("PageHorizontalAlignment")
  private String pageHorizontalAlignment = null;

  @SerializedName("PageMargins")
  private Double pageMargins = null;

  @SerializedName("ResourcesFolder")
  private String resourcesFolder = null;

  @SerializedName("ResourcesFolderAlias")
  private String resourcesFolderAlias = null;

  @SerializedName("SaveFontFaceCssSeparately")
  private Boolean saveFontFaceCssSeparately = null;

  @SerializedName("ShowPageBorder")
  private Boolean showPageBorder = null;

  public HtmlFixedSaveOptionsData cssClassNamesPrefix(String cssClassNamesPrefix) {
    this.cssClassNamesPrefix = cssClassNamesPrefix;
    return this;
  }

   /**
   * Specifies prefix which is added to all class names in style.css file. Default value is \&quot;aw\&quot;.
   * @return cssClassNamesPrefix
  **/
  @ApiModelProperty(value = "Specifies prefix which is added to all class names in style.css file. Default value is \"aw\".")
  public String getCssClassNamesPrefix() {
    return cssClassNamesPrefix;
  }

  public void setCssClassNamesPrefix(String cssClassNamesPrefix) {
    this.cssClassNamesPrefix = cssClassNamesPrefix;
  }

  public HtmlFixedSaveOptionsData encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Encoding.
   * @return encoding
  **/
  @ApiModelProperty(value = "Encoding.")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public HtmlFixedSaveOptionsData exportEmbeddedCss(Boolean exportEmbeddedCss) {
    this.exportEmbeddedCss = exportEmbeddedCss;
    return this;
  }

   /**
   * Specifies whether the CSS (Cascading Style Sheet) should be embedded into Html document.
   * @return exportEmbeddedCss
  **/
  @ApiModelProperty(value = "Specifies whether the CSS (Cascading Style Sheet) should be embedded into Html document.")
  public Boolean isisExportEmbeddedCss() {
    return exportEmbeddedCss;
  }

  public void setExportEmbeddedCss(Boolean exportEmbeddedCss) {
    this.exportEmbeddedCss = exportEmbeddedCss;
  }

  public HtmlFixedSaveOptionsData exportEmbeddedFonts(Boolean exportEmbeddedFonts) {
    this.exportEmbeddedFonts = exportEmbeddedFonts;
    return this;
  }

   /**
   * Specifies whether fonts should be embedded into Html document in Base64 format.
   * @return exportEmbeddedFonts
  **/
  @ApiModelProperty(value = "Specifies whether fonts should be embedded into Html document in Base64 format.")
  public Boolean isisExportEmbeddedFonts() {
    return exportEmbeddedFonts;
  }

  public void setExportEmbeddedFonts(Boolean exportEmbeddedFonts) {
    this.exportEmbeddedFonts = exportEmbeddedFonts;
  }

  public HtmlFixedSaveOptionsData exportEmbeddedImages(Boolean exportEmbeddedImages) {
    this.exportEmbeddedImages = exportEmbeddedImages;
    return this;
  }

   /**
   * Specifies whether images should be embedded into Html document in Base64 format.
   * @return exportEmbeddedImages
  **/
  @ApiModelProperty(value = "Specifies whether images should be embedded into Html document in Base64 format.")
  public Boolean isisExportEmbeddedImages() {
    return exportEmbeddedImages;
  }

  public void setExportEmbeddedImages(Boolean exportEmbeddedImages) {
    this.exportEmbeddedImages = exportEmbeddedImages;
  }

  public HtmlFixedSaveOptionsData exportFormFields(Boolean exportFormFields) {
    this.exportFormFields = exportFormFields;
    return this;
  }

   /**
   * Gets or sets indication of whether form fields are exported as interactive items (as &#39;input&#39; tag) rather than converted to text or graphics.
   * @return exportFormFields
  **/
  @ApiModelProperty(value = "Gets or sets indication of whether form fields are exported as interactive items (as 'input' tag) rather than converted to text or graphics.")
  public Boolean isisExportFormFields() {
    return exportFormFields;
  }

  public void setExportFormFields(Boolean exportFormFields) {
    this.exportFormFields = exportFormFields;
  }

  public HtmlFixedSaveOptionsData fontFormat(String fontFormat) {
    this.fontFormat = fontFormat;
    return this;
  }

   /**
   * Specifies export format of fonts
   * @return fontFormat
  **/
  @ApiModelProperty(value = "Specifies export format of fonts")
  public String getFontFormat() {
    return fontFormat;
  }

  public void setFontFormat(String fontFormat) {
    this.fontFormat = fontFormat;
  }

  public HtmlFixedSaveOptionsData pageHorizontalAlignment(String pageHorizontalAlignment) {
    this.pageHorizontalAlignment = pageHorizontalAlignment;
    return this;
  }

   /**
   * Specifies the horizontal alignment of pages in an HTML document. Default value is HtmlFixedHorizontalPageAlignment.Center.
   * @return pageHorizontalAlignment
  **/
  @ApiModelProperty(value = "Specifies the horizontal alignment of pages in an HTML document. Default value is HtmlFixedHorizontalPageAlignment.Center.")
  public String getPageHorizontalAlignment() {
    return pageHorizontalAlignment;
  }

  public void setPageHorizontalAlignment(String pageHorizontalAlignment) {
    this.pageHorizontalAlignment = pageHorizontalAlignment;
  }

  public HtmlFixedSaveOptionsData pageMargins(Double pageMargins) {
    this.pageMargins = pageMargins;
    return this;
  }

   /**
   * Specifies the margins around pages in an HTML document. The margins value is measured in points and should be equal to or greater than 0. Default value is 10 points.
   * @return pageMargins
  **/
  @ApiModelProperty(value = "Specifies the margins around pages in an HTML document. The margins value is measured in points and should be equal to or greater than 0. Default value is 10 points.")
  public Double getPageMargins() {
    return pageMargins;
  }

  public void setPageMargins(Double pageMargins) {
    this.pageMargins = pageMargins;
  }

  public HtmlFixedSaveOptionsData resourcesFolder(String resourcesFolder) {
    this.resourcesFolder = resourcesFolder;
    return this;
  }

   /**
   * Specifies the physical folder where resources are saved when exporting a document
   * @return resourcesFolder
  **/
  @ApiModelProperty(value = "Specifies the physical folder where resources are saved when exporting a document")
  public String getResourcesFolder() {
    return resourcesFolder;
  }

  public void setResourcesFolder(String resourcesFolder) {
    this.resourcesFolder = resourcesFolder;
  }

  public HtmlFixedSaveOptionsData resourcesFolderAlias(String resourcesFolderAlias) {
    this.resourcesFolderAlias = resourcesFolderAlias;
    return this;
  }

   /**
   * Specifies the name of the folder used to construct resource URIs
   * @return resourcesFolderAlias
  **/
  @ApiModelProperty(value = "Specifies the name of the folder used to construct resource URIs")
  public String getResourcesFolderAlias() {
    return resourcesFolderAlias;
  }

  public void setResourcesFolderAlias(String resourcesFolderAlias) {
    this.resourcesFolderAlias = resourcesFolderAlias;
  }

  public HtmlFixedSaveOptionsData saveFontFaceCssSeparately(Boolean saveFontFaceCssSeparately) {
    this.saveFontFaceCssSeparately = saveFontFaceCssSeparately;
    return this;
  }

   /**
   * Flag indicates whether \&quot;@font-face\&quot; CSS rules should be placed into a separate file \&quot;fontFaces.css\&quot; when a document is being saved with external stylesheet (that is, when Aspose.Words.Saving.HtmlFixedSaveOptions.ExportEmbeddedCss is false). Default value is false, all CSS rules are written into single file \&quot;styles.css\&quot;.
   * @return saveFontFaceCssSeparately
  **/
  @ApiModelProperty(value = "Flag indicates whether \"@font-face\" CSS rules should be placed into a separate file \"fontFaces.css\" when a document is being saved with external stylesheet (that is, when Aspose.Words.Saving.HtmlFixedSaveOptions.ExportEmbeddedCss is false). Default value is false, all CSS rules are written into single file \"styles.css\".")
  public Boolean isisSaveFontFaceCssSeparately() {
    return saveFontFaceCssSeparately;
  }

  public void setSaveFontFaceCssSeparately(Boolean saveFontFaceCssSeparately) {
    this.saveFontFaceCssSeparately = saveFontFaceCssSeparately;
  }

  public HtmlFixedSaveOptionsData showPageBorder(Boolean showPageBorder) {
    this.showPageBorder = showPageBorder;
    return this;
  }

   /**
   * Specifies whether border around pages should be shown.
   * @return showPageBorder
  **/
  @ApiModelProperty(value = "Specifies whether border around pages should be shown.")
  public Boolean isisShowPageBorder() {
    return showPageBorder;
  }

  public void setShowPageBorder(Boolean showPageBorder) {
    this.showPageBorder = showPageBorder;
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
    return Objects.equals(this.cssClassNamesPrefix, htmlFixedSaveOptionsData.cssClassNamesPrefix) &&
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
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cssClassNamesPrefix, encoding, exportEmbeddedCss, exportEmbeddedFonts, exportEmbeddedImages, exportFormFields, fontFormat, pageHorizontalAlignment, pageMargins, resourcesFolder, resourcesFolderAlias, saveFontFaceCssSeparately, showPageBorder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlFixedSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cssClassNamesPrefix: ").append(toIndentedString(cssClassNamesPrefix)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    exportEmbeddedCss: ").append(toIndentedString(exportEmbeddedCss)).append("\n");
    sb.append("    exportEmbeddedFonts: ").append(toIndentedString(exportEmbeddedFonts)).append("\n");
    sb.append("    exportEmbeddedImages: ").append(toIndentedString(exportEmbeddedImages)).append("\n");
    sb.append("    exportFormFields: ").append(toIndentedString(exportFormFields)).append("\n");
    sb.append("    fontFormat: ").append(toIndentedString(fontFormat)).append("\n");
    sb.append("    pageHorizontalAlignment: ").append(toIndentedString(pageHorizontalAlignment)).append("\n");
    sb.append("    pageMargins: ").append(toIndentedString(pageMargins)).append("\n");
    sb.append("    resourcesFolder: ").append(toIndentedString(resourcesFolder)).append("\n");
    sb.append("    resourcesFolderAlias: ").append(toIndentedString(resourcesFolderAlias)).append("\n");
    sb.append("    saveFontFaceCssSeparately: ").append(toIndentedString(saveFontFaceCssSeparately)).append("\n");
    sb.append("    showPageBorder: ").append(toIndentedString(showPageBorder)).append("\n");
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

