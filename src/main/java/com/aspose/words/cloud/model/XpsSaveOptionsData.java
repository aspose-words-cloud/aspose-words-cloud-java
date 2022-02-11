/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="XpsSaveOptionsData.java">
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
 * Container class for xps save options.
 */
@ApiModel(description = "Container class for xps save options.")
public class XpsSaveOptionsData extends FixedPageSaveOptionsData {
    @SerializedName("BookmarksOutlineLevel")
    protected Integer bookmarksOutlineLevel;

    @SerializedName("HeadingsOutlineLevels")
    protected Integer headingsOutlineLevels;

    @SerializedName("OutlineOptions")
    protected OutlineOptionsData outlineOptions;

    @SerializedName("UseBookFoldPrintingSettings")
    protected Boolean useBookFoldPrintingSettings;
    /**
     * Gets or sets the level in the XPS document outline at which to display Word bookmarks.
    * @return bookmarksOutlineLevel
    **/
    @ApiModelProperty(value = "Gets or sets the level in the XPS document outline at which to display Word bookmarks.")
    public Integer getBookmarksOutlineLevel() {
        return bookmarksOutlineLevel;
    }

    public XpsSaveOptionsData bookmarksOutlineLevel(Integer bookmarksOutlineLevel) {
        this.bookmarksOutlineLevel = bookmarksOutlineLevel;
        return this;
    }

    public void setBookmarksOutlineLevel(Integer bookmarksOutlineLevel) {
        this.bookmarksOutlineLevel = bookmarksOutlineLevel;
    }


    /**
     * Gets or sets the number of heading levels (paragraphs formatted with the Heading styles) to include in the XPS document outline.
    * @return headingsOutlineLevels
    **/
    @ApiModelProperty(value = "Gets or sets the number of heading levels (paragraphs formatted with the Heading styles) to include in the XPS document outline.")
    public Integer getHeadingsOutlineLevels() {
        return headingsOutlineLevels;
    }

    public XpsSaveOptionsData headingsOutlineLevels(Integer headingsOutlineLevels) {
        this.headingsOutlineLevels = headingsOutlineLevels;
        return this;
    }

    public void setHeadingsOutlineLevels(Integer headingsOutlineLevels) {
        this.headingsOutlineLevels = headingsOutlineLevels;
    }


    /**
     * Gets or sets the outline options.
    * @return outlineOptions
    **/
    @ApiModelProperty(value = "Gets or sets the outline options.")
    public OutlineOptionsData getOutlineOptions() {
        return outlineOptions;
    }

    public XpsSaveOptionsData outlineOptions(OutlineOptionsData outlineOptions) {
        this.outlineOptions = outlineOptions;
        return this;
    }

    public void setOutlineOptions(OutlineOptionsData outlineOptions) {
        this.outlineOptions = outlineOptions;
    }


    /**
     * Gets or sets a value indicating whether the document should be saved using a booklet printing layout.
    * @return useBookFoldPrintingSettings
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the document should be saved using a booklet printing layout.")
    public Boolean getUseBookFoldPrintingSettings() {
        return useBookFoldPrintingSettings;
    }

    public XpsSaveOptionsData useBookFoldPrintingSettings(Boolean useBookFoldPrintingSettings) {
        this.useBookFoldPrintingSettings = useBookFoldPrintingSettings;
        return this;
    }

    public void setUseBookFoldPrintingSettings(Boolean useBookFoldPrintingSettings) {
        this.useBookFoldPrintingSettings = useBookFoldPrintingSettings;
    }


    public XpsSaveOptionsData() {
        super();
        this.bookmarksOutlineLevel = null;
        this.headingsOutlineLevels = null;
        this.outlineOptions = null;
        this.saveFormat = "xps";
        this.useBookFoldPrintingSettings = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        XpsSaveOptionsData xpsSaveOptionsData = (XpsSaveOptionsData) o;
        return
            Objects.equals(this.bookmarksOutlineLevel, xpsSaveOptionsData.bookmarksOutlineLevel) &&
            Objects.equals(this.headingsOutlineLevels, xpsSaveOptionsData.headingsOutlineLevels) &&
            Objects.equals(this.outlineOptions, xpsSaveOptionsData.outlineOptions) &&
            Objects.equals(this.useBookFoldPrintingSettings, xpsSaveOptionsData.useBookFoldPrintingSettings) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarksOutlineLevel, headingsOutlineLevels, outlineOptions, useBookFoldPrintingSettings, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpsSaveOptionsData {\n");
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
    sb.append("    bookmarksOutlineLevel: ").append(toIndentedString(getBookmarksOutlineLevel())).append("\n");
    sb.append("    headingsOutlineLevels: ").append(toIndentedString(getHeadingsOutlineLevels())).append("\n");
    sb.append("    outlineOptions: ").append(toIndentedString(getOutlineOptions())).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
    sb.append("    useBookFoldPrintingSettings: ").append(toIndentedString(getUseBookFoldPrintingSettings())).append("\n");
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
