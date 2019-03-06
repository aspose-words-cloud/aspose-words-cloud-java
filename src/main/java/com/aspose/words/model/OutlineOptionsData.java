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
import com.aspose.words.cloud.model.BookmarksOutlineLevelData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * container class for outline options
 */
@ApiModel(description = "container class for outline options")

public class OutlineOptionsData {
  @SerializedName("BookmarksOutlineLevels")
  private List<BookmarksOutlineLevelData> bookmarksOutlineLevels = null;

  @SerializedName("DefaultBookmarksOutlineLevel")
  private Integer defaultBookmarksOutlineLevel = null;

  @SerializedName("CreateMissingOutlineLevels")
  private Boolean createMissingOutlineLevels = null;

  @SerializedName("CreateOutlinesForHeadingsInTables")
  private Boolean createOutlinesForHeadingsInTables = null;

  @SerializedName("ExpandedOutlineLevels")
  private Integer expandedOutlineLevels = null;

  @SerializedName("HeadingsOutlineLevels")
  private Integer headingsOutlineLevels = null;

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

   /**
   * Allows to specify individual bookmarks outline level
   * @return bookmarksOutlineLevels
  **/
  @ApiModelProperty(value = "Allows to specify individual bookmarks outline level")
  public List<BookmarksOutlineLevelData> getBookmarksOutlineLevels() {
    return bookmarksOutlineLevels;
  }

  public void setBookmarksOutlineLevels(List<BookmarksOutlineLevelData> bookmarksOutlineLevels) {
    this.bookmarksOutlineLevels = bookmarksOutlineLevels;
  }

  public OutlineOptionsData defaultBookmarksOutlineLevel(Integer defaultBookmarksOutlineLevel) {
    this.defaultBookmarksOutlineLevel = defaultBookmarksOutlineLevel;
    return this;
  }

   /**
   * Specifies the default level in the document outline at which to display Word bookmarks
   * @return defaultBookmarksOutlineLevel
  **/
  @ApiModelProperty(value = "Specifies the default level in the document outline at which to display Word bookmarks")
  public Integer getDefaultBookmarksOutlineLevel() {
    return defaultBookmarksOutlineLevel;
  }

  public void setDefaultBookmarksOutlineLevel(Integer defaultBookmarksOutlineLevel) {
    this.defaultBookmarksOutlineLevel = defaultBookmarksOutlineLevel;
  }

  public OutlineOptionsData createMissingOutlineLevels(Boolean createMissingOutlineLevels) {
    this.createMissingOutlineLevels = createMissingOutlineLevels;
    return this;
  }

   /**
   * Gets or sets a value determining whether or not to create missing outline levels     when the document is exported.     Default value for this property is false.
   * @return createMissingOutlineLevels
  **/
  @ApiModelProperty(value = "Gets or sets a value determining whether or not to create missing outline levels     when the document is exported.     Default value for this property is false.")
  public Boolean isisCreateMissingOutlineLevels() {
    return createMissingOutlineLevels;
  }

  public void setCreateMissingOutlineLevels(Boolean createMissingOutlineLevels) {
    this.createMissingOutlineLevels = createMissingOutlineLevels;
  }

  public OutlineOptionsData createOutlinesForHeadingsInTables(Boolean createOutlinesForHeadingsInTables) {
    this.createOutlinesForHeadingsInTables = createOutlinesForHeadingsInTables;
    return this;
  }

   /**
   * Specifies whether or not to create outlines for headings (paragraphs formatted     with the Heading styles) inside tables.
   * @return createOutlinesForHeadingsInTables
  **/
  @ApiModelProperty(value = "Specifies whether or not to create outlines for headings (paragraphs formatted     with the Heading styles) inside tables.")
  public Boolean isisCreateOutlinesForHeadingsInTables() {
    return createOutlinesForHeadingsInTables;
  }

  public void setCreateOutlinesForHeadingsInTables(Boolean createOutlinesForHeadingsInTables) {
    this.createOutlinesForHeadingsInTables = createOutlinesForHeadingsInTables;
  }

  public OutlineOptionsData expandedOutlineLevels(Integer expandedOutlineLevels) {
    this.expandedOutlineLevels = expandedOutlineLevels;
    return this;
  }

   /**
   * Specifies how many levels in the document outline to show expanded when the file is viewed
   * @return expandedOutlineLevels
  **/
  @ApiModelProperty(value = "Specifies how many levels in the document outline to show expanded when the file is viewed")
  public Integer getExpandedOutlineLevels() {
    return expandedOutlineLevels;
  }

  public void setExpandedOutlineLevels(Integer expandedOutlineLevels) {
    this.expandedOutlineLevels = expandedOutlineLevels;
  }

  public OutlineOptionsData headingsOutlineLevels(Integer headingsOutlineLevels) {
    this.headingsOutlineLevels = headingsOutlineLevels;
    return this;
  }

   /**
   * Specifies how many levels of headings (paragraphs formatted with the Heading styles) to include in the document outline
   * @return headingsOutlineLevels
  **/
  @ApiModelProperty(value = "Specifies how many levels of headings (paragraphs formatted with the Heading styles) to include in the document outline")
  public Integer getHeadingsOutlineLevels() {
    return headingsOutlineLevels;
  }

  public void setHeadingsOutlineLevels(Integer headingsOutlineLevels) {
    this.headingsOutlineLevels = headingsOutlineLevels;
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
    return Objects.equals(this.bookmarksOutlineLevels, outlineOptionsData.bookmarksOutlineLevels) &&
        Objects.equals(this.defaultBookmarksOutlineLevel, outlineOptionsData.defaultBookmarksOutlineLevel) &&
        Objects.equals(this.createMissingOutlineLevels, outlineOptionsData.createMissingOutlineLevels) &&
        Objects.equals(this.createOutlinesForHeadingsInTables, outlineOptionsData.createOutlinesForHeadingsInTables) &&
        Objects.equals(this.expandedOutlineLevels, outlineOptionsData.expandedOutlineLevels) &&
        Objects.equals(this.headingsOutlineLevels, outlineOptionsData.headingsOutlineLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarksOutlineLevels, defaultBookmarksOutlineLevel, createMissingOutlineLevels, createOutlinesForHeadingsInTables, expandedOutlineLevels, headingsOutlineLevels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineOptionsData {\n");
    
    sb.append("    bookmarksOutlineLevels: ").append(toIndentedString(bookmarksOutlineLevels)).append("\n");
    sb.append("    defaultBookmarksOutlineLevel: ").append(toIndentedString(defaultBookmarksOutlineLevel)).append("\n");
    sb.append("    createMissingOutlineLevels: ").append(toIndentedString(createMissingOutlineLevels)).append("\n");
    sb.append("    createOutlinesForHeadingsInTables: ").append(toIndentedString(createOutlinesForHeadingsInTables)).append("\n");
    sb.append("    expandedOutlineLevels: ").append(toIndentedString(expandedOutlineLevels)).append("\n");
    sb.append("    headingsOutlineLevels: ").append(toIndentedString(headingsOutlineLevels)).append("\n");
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

