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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * container class for individual bookmarks outline level
 */
@ApiModel(description = "container class for individual bookmarks outline level")

public class BookmarksOutlineLevelData {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("BookmarksOutlineLevel")
  private Integer bookmarksOutlineLevel = null;

  public BookmarksOutlineLevelData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specify the bookmark&#39;s name
   * @return name
  **/
  @ApiModelProperty(value = "Specify the bookmark's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BookmarksOutlineLevelData bookmarksOutlineLevel(Integer bookmarksOutlineLevel) {
    this.bookmarksOutlineLevel = bookmarksOutlineLevel;
    return this;
  }

   /**
   * Specify the bookmark&#39;s level
   * @return bookmarksOutlineLevel
  **/
  @ApiModelProperty(required = true, value = "Specify the bookmark's level")
  public Integer getBookmarksOutlineLevel() {
    return bookmarksOutlineLevel;
  }

  public void setBookmarksOutlineLevel(Integer bookmarksOutlineLevel) {
    this.bookmarksOutlineLevel = bookmarksOutlineLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookmarksOutlineLevelData bookmarksOutlineLevelData = (BookmarksOutlineLevelData) o;
    return Objects.equals(this.name, bookmarksOutlineLevelData.name) &&
        Objects.equals(this.bookmarksOutlineLevel, bookmarksOutlineLevelData.bookmarksOutlineLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, bookmarksOutlineLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookmarksOutlineLevelData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bookmarksOutlineLevel: ").append(toIndentedString(bookmarksOutlineLevel)).append("\n");
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

