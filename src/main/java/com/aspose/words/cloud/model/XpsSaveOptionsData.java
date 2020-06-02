/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="XpsSaveOptionsData.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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
    private Integer bookmarksOutlineLevel = null;

    @SerializedName("HeadingsOutlineLevels")
    private Integer headingsOutlineLevels = null;

    @SerializedName("OutlineOptions")
    private OutlineOptionsData outlineOptions = null;

    @SerializedName("UseBookFoldPrintingSettings")
    private Boolean useBookFoldPrintingSettings = null;
    public XpsSaveOptionsData bookmarksOutlineLevel(Integer bookmarksOutlineLevel) {
        this.bookmarksOutlineLevel = bookmarksOutlineLevel;
        return this;
    }

    /**
     * Gets or sets specifies the level in the XPS document outline at which to display Word bookmarks.
    * @return bookmarksOutlineLevel
    **/
    @ApiModelProperty(value = "Gets or sets specifies the level in the XPS document outline at which to display Word bookmarks.")
    public Integer getBookmarksOutlineLevel() {
        return bookmarksOutlineLevel;
    }

    public void setBookmarksOutlineLevel(Integer bookmarksOutlineLevel) {
        this.bookmarksOutlineLevel = bookmarksOutlineLevel;
    }

    public XpsSaveOptionsData headingsOutlineLevels(Integer headingsOutlineLevels) {
        this.headingsOutlineLevels = headingsOutlineLevels;
        return this;
    }

    /**
     * Gets or sets specifies how many levels of headings (paragraphs formatted with the Heading styles) to include in the XPS document outline.
    * @return headingsOutlineLevels
    **/
    @ApiModelProperty(value = "Gets or sets specifies how many levels of headings (paragraphs formatted with the Heading styles) to include in the XPS document outline.")
    public Integer getHeadingsOutlineLevels() {
        return headingsOutlineLevels;
    }

    public void setHeadingsOutlineLevels(Integer headingsOutlineLevels) {
        this.headingsOutlineLevels = headingsOutlineLevels;
    }

    public XpsSaveOptionsData outlineOptions(OutlineOptionsData outlineOptions) {
        this.outlineOptions = outlineOptions;
        return this;
    }

    /**
     * Gets or sets allows to specify outline options.
    * @return outlineOptions
    **/
    @ApiModelProperty(value = "Gets or sets allows to specify outline options.")
    public OutlineOptionsData getOutlineOptions() {
        return outlineOptions;
    }

    public void setOutlineOptions(OutlineOptionsData outlineOptions) {
        this.outlineOptions = outlineOptions;
    }

    public XpsSaveOptionsData useBookFoldPrintingSettings(Boolean useBookFoldPrintingSettings) {
        this.useBookFoldPrintingSettings = useBookFoldPrintingSettings;
        return this;
    }

    /**
     * Gets or sets determines whether the document should be saved using a booklet printing layout.
    * @return useBookFoldPrintingSettings
    **/
    @ApiModelProperty(value = "Gets or sets determines whether the document should be saved using a booklet printing layout.")
    public Boolean getUseBookFoldPrintingSettings() {
        return useBookFoldPrintingSettings;
    }

    public void setUseBookFoldPrintingSettings(Boolean useBookFoldPrintingSettings) {
        this.useBookFoldPrintingSettings = useBookFoldPrintingSettings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    XpsSaveOptionsData xpsSaveOptionsData = (XpsSaveOptionsData)o;
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
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bookmarksOutlineLevel: ").append(toIndentedString(bookmarksOutlineLevel)).append("\n");
    sb.append("    headingsOutlineLevels: ").append(toIndentedString(headingsOutlineLevels)).append("\n");
    sb.append("    outlineOptions: ").append(toIndentedString(outlineOptions)).append("\n");
    sb.append("    useBookFoldPrintingSettings: ").append(toIndentedString(useBookFoldPrintingSettings)).append("\n");
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
