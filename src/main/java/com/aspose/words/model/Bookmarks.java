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
import com.aspose.words.model.Bookmark;
import com.aspose.words.model.LinkElement;
import com.aspose.words.model.WordsApiLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an array of bookmarks.
 */
@ApiModel(description = "Represents an array of bookmarks.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:03:27.428Z")
public class Bookmarks {
  @JsonProperty("link")
  private WordsApiLink link = null;

  @JsonProperty("BookmarkList")
  private List<Bookmark> bookmarkList = null;

  public Bookmarks link(WordsApiLink link) {
    this.link = link;
    return this;
  }

   /**
   * Link to the document.
   * @return link
  **/
  @ApiModelProperty(value = "Link to the document.")
  public WordsApiLink getLink() {
    return link;
  }

  public void setLink(WordsApiLink link) {
    this.link = link;
  }

  public Bookmarks bookmarkList(List<Bookmark> bookmarkList) {
    this.bookmarkList = bookmarkList;
    return this;
  }

  public Bookmarks addBookmarkListItem(Bookmark bookmarkListItem) {
    if (this.bookmarkList == null) {
      this.bookmarkList = new ArrayList<Bookmark>();
    }
    this.bookmarkList.add(bookmarkListItem);
    return this;
  }

   /**
   * Array of bookmarks.
   * @return bookmarkList
  **/
  @ApiModelProperty(value = "Array of bookmarks.")
  public List<Bookmark> getBookmarkList() {
    return bookmarkList;
  }

  public void setBookmarkList(List<Bookmark> bookmarkList) {
    this.bookmarkList = bookmarkList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bookmarks bookmarks = (Bookmarks) o;
    return Objects.equals(this.link, bookmarks.link) &&
        Objects.equals(this.bookmarkList, bookmarks.bookmarkList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, bookmarkList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bookmarks {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    bookmarkList: ").append(toIndentedString(bookmarkList)).append("\n");
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

