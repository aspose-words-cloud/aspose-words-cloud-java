/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OutlineOptionsData.java">
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
 * Container class for outline options.
 */
@ApiModel(description = "Container class for outline options.")
public class OutlineOptionsData {
    @SerializedName("BookmarksOutlineLevels")
    protected List<BookmarksOutlineLevelData> bookmarksOutlineLevels;

    @SerializedName("CreateMissingOutlineLevels")
    protected Boolean createMissingOutlineLevels;

    @SerializedName("CreateOutlinesForHeadingsInTables")
    protected Boolean createOutlinesForHeadingsInTables;

    @SerializedName("DefaultBookmarksOutlineLevel")
    protected Integer defaultBookmarksOutlineLevel;

    @SerializedName("ExpandedOutlineLevels")
    protected Integer expandedOutlineLevels;

    @SerializedName("HeadingsOutlineLevels")
    protected Integer headingsOutlineLevels;
    /**
     * Gets or sets the individual bookmarks outline level.
    * @return bookmarksOutlineLevels
    **/
    @ApiModelProperty(value = "Gets or sets the individual bookmarks outline level.")
    public List<BookmarksOutlineLevelData> getBookmarksOutlineLevels() {
        return bookmarksOutlineLevels;
    }

    public OutlineOptionsData bookmarksOutlineLevels(List<BookmarksOutlineLevelData> bookmarksOutlineLevels) {
        this.bookmarksOutlineLevels = bookmarksOutlineLevels;
        return this;
    }

    public OutlineOptionsData addBookmarksOutlineLevelsItem(BookmarksOutlineLevelData bookmarksOutlineLevelsItem) {
        if (this.bookmarksOutlineLevels == null) {
            this.bookmarksOutlineLevels = new ArrayList<BookmarksOutlineLevelData>();
        }
        this.bookmarksOutlineLevels.add(bookmarksOutlineLevelsItem);
        return this;
    }


    public void setBookmarksOutlineLevels(List<BookmarksOutlineLevelData> bookmarksOutlineLevels) {
        this.bookmarksOutlineLevels = bookmarksOutlineLevels;
    }


    /**
     * Gets or sets a value indicating whether to create missing outline levels when the document is exported. The default value is false.
    * @return createMissingOutlineLevels
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to create missing outline levels when the document is exported. The default value is false.")
    public Boolean getCreateMissingOutlineLevels() {
        return createMissingOutlineLevels;
    }

    public OutlineOptionsData createMissingOutlineLevels(Boolean createMissingOutlineLevels) {
        this.createMissingOutlineLevels = createMissingOutlineLevels;
        return this;
    }

    public void setCreateMissingOutlineLevels(Boolean createMissingOutlineLevels) {
        this.createMissingOutlineLevels = createMissingOutlineLevels;
    }


    /**
     * Gets or sets a value indicating whether to create outlines for headings (paragraphs formatted with the Heading styles) inside tables.
    * @return createOutlinesForHeadingsInTables
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to create outlines for headings (paragraphs formatted with the Heading styles) inside tables.")
    public Boolean getCreateOutlinesForHeadingsInTables() {
        return createOutlinesForHeadingsInTables;
    }

    public OutlineOptionsData createOutlinesForHeadingsInTables(Boolean createOutlinesForHeadingsInTables) {
        this.createOutlinesForHeadingsInTables = createOutlinesForHeadingsInTables;
        return this;
    }

    public void setCreateOutlinesForHeadingsInTables(Boolean createOutlinesForHeadingsInTables) {
        this.createOutlinesForHeadingsInTables = createOutlinesForHeadingsInTables;
    }


    /**
     * Gets or sets the default level in the document outline at which to display Word bookmarks.
    * @return defaultBookmarksOutlineLevel
    **/
    @ApiModelProperty(value = "Gets or sets the default level in the document outline at which to display Word bookmarks.")
    public Integer getDefaultBookmarksOutlineLevel() {
        return defaultBookmarksOutlineLevel;
    }

    public OutlineOptionsData defaultBookmarksOutlineLevel(Integer defaultBookmarksOutlineLevel) {
        this.defaultBookmarksOutlineLevel = defaultBookmarksOutlineLevel;
        return this;
    }

    public void setDefaultBookmarksOutlineLevel(Integer defaultBookmarksOutlineLevel) {
        this.defaultBookmarksOutlineLevel = defaultBookmarksOutlineLevel;
    }


    /**
     * Gets or sets the number of levels in the document outline to show expanded when the file is viewed.
    * @return expandedOutlineLevels
    **/
    @ApiModelProperty(value = "Gets or sets the number of levels in the document outline to show expanded when the file is viewed.")
    public Integer getExpandedOutlineLevels() {
        return expandedOutlineLevels;
    }

    public OutlineOptionsData expandedOutlineLevels(Integer expandedOutlineLevels) {
        this.expandedOutlineLevels = expandedOutlineLevels;
        return this;
    }

    public void setExpandedOutlineLevels(Integer expandedOutlineLevels) {
        this.expandedOutlineLevels = expandedOutlineLevels;
    }


    /**
     * Gets or sets the number of levels of headings (paragraphs formatted with the Heading styles) to include in the document outline.
    * @return headingsOutlineLevels
    **/
    @ApiModelProperty(value = "Gets or sets the number of levels of headings (paragraphs formatted with the Heading styles) to include in the document outline.")
    public Integer getHeadingsOutlineLevels() {
        return headingsOutlineLevels;
    }

    public OutlineOptionsData headingsOutlineLevels(Integer headingsOutlineLevels) {
        this.headingsOutlineLevels = headingsOutlineLevels;
        return this;
    }

    public void setHeadingsOutlineLevels(Integer headingsOutlineLevels) {
        this.headingsOutlineLevels = headingsOutlineLevels;
    }


    public OutlineOptionsData() {
        this.bookmarksOutlineLevels = null;
        this.createMissingOutlineLevels = null;
        this.createOutlinesForHeadingsInTables = null;
        this.defaultBookmarksOutlineLevel = null;
        this.expandedOutlineLevels = null;
        this.headingsOutlineLevels = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OutlineOptionsData outlineOptionsData = (OutlineOptionsData) o;
        return
            Objects.equals(this.bookmarksOutlineLevels, outlineOptionsData.bookmarksOutlineLevels) &&
            Objects.equals(this.createMissingOutlineLevels, outlineOptionsData.createMissingOutlineLevels) &&
            Objects.equals(this.createOutlinesForHeadingsInTables, outlineOptionsData.createOutlinesForHeadingsInTables) &&
            Objects.equals(this.defaultBookmarksOutlineLevel, outlineOptionsData.defaultBookmarksOutlineLevel) &&
            Objects.equals(this.expandedOutlineLevels, outlineOptionsData.expandedOutlineLevels) &&
            Objects.equals(this.headingsOutlineLevels, outlineOptionsData.headingsOutlineLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarksOutlineLevels, createMissingOutlineLevels, createOutlinesForHeadingsInTables, defaultBookmarksOutlineLevel, expandedOutlineLevels, headingsOutlineLevels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineOptionsData {\n");
    sb.append("    bookmarksOutlineLevels: ").append(toIndentedString(getBookmarksOutlineLevels())).append("\n");
    sb.append("    createMissingOutlineLevels: ").append(toIndentedString(getCreateMissingOutlineLevels())).append("\n");
    sb.append("    createOutlinesForHeadingsInTables: ").append(toIndentedString(getCreateOutlinesForHeadingsInTables())).append("\n");
    sb.append("    defaultBookmarksOutlineLevel: ").append(toIndentedString(getDefaultBookmarksOutlineLevel())).append("\n");
    sb.append("    expandedOutlineLevels: ").append(toIndentedString(getExpandedOutlineLevels())).append("\n");
    sb.append("    headingsOutlineLevels: ").append(toIndentedString(getHeadingsOutlineLevels())).append("\n");
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
