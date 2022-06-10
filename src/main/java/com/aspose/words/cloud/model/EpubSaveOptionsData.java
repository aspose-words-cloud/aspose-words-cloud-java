/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="EpubSaveOptionsData.java">
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
 * Container class for epub save options.
 */
@ApiModel(description = "Container class for epub save options.")
public class EpubSaveOptionsData extends HtmlSaveOptionsData {
    @SerializedName("EpubNavigationMapLevel")
    protected Integer epubNavigationMapLevel;
    /**
     * Gets or sets the maximum level of headings populated to the navigation map when exporting.
    * @return epubNavigationMapLevel
    **/
    @ApiModelProperty(value = "Gets or sets the maximum level of headings populated to the navigation map when exporting.")
    public Integer getEpubNavigationMapLevel() {
        return epubNavigationMapLevel;
    }

    public EpubSaveOptionsData epubNavigationMapLevel(Integer epubNavigationMapLevel) {
        this.epubNavigationMapLevel = epubNavigationMapLevel;
        return this;
    }

    public void setEpubNavigationMapLevel(Integer epubNavigationMapLevel) {
        this.epubNavigationMapLevel = epubNavigationMapLevel;
    }


    public EpubSaveOptionsData() {
        super();
        this.epubNavigationMapLevel = null;
        this.saveFormat = "epub";
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
        return
            Objects.equals(this.epubNavigationMapLevel, epubSaveOptionsData.epubNavigationMapLevel) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epubNavigationMapLevel, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EpubSaveOptionsData {\n");
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
    sb.append("    scaleImageToShapeSize: ").append(toIndentedString(getScaleImageToShapeSize())).append("\n");
    sb.append("    tableWidthOutputMode: ").append(toIndentedString(getTableWidthOutputMode())).append("\n");
    sb.append("    epubNavigationMapLevel: ").append(toIndentedString(getEpubNavigationMapLevel())).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
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
