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
import com.aspose.words.cloud.model.FootnotesStatData;
import com.aspose.words.cloud.model.PageStatData;
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
 * Container for the document&#39;s statistical data
 */
@ApiModel(description = "Container for the document's statistical data")

public class DocumentStatData {
  @SerializedName("WordCount")
  private Integer wordCount = null;

  @SerializedName("ParagraphCount")
  private Integer paragraphCount = null;

  @SerializedName("PageCount")
  private Integer pageCount = null;

  @SerializedName("FootnotesStatData")
  private FootnotesStatData footnotesStatData = null;

  @SerializedName("PageStatData")
  private List<PageStatData> pageStatData = null;

  public DocumentStatData wordCount(Integer wordCount) {
    this.wordCount = wordCount;
    return this;
  }

   /**
   * Total count of words in the document
   * @return wordCount
  **/
  @ApiModelProperty(required = true, value = "Total count of words in the document")
  public Integer getWordCount() {
    return wordCount;
  }

  public void setWordCount(Integer wordCount) {
    this.wordCount = wordCount;
  }

  public DocumentStatData paragraphCount(Integer paragraphCount) {
    this.paragraphCount = paragraphCount;
    return this;
  }

   /**
   * Total count of paragraphs in the document
   * @return paragraphCount
  **/
  @ApiModelProperty(required = true, value = "Total count of paragraphs in the document")
  public Integer getParagraphCount() {
    return paragraphCount;
  }

  public void setParagraphCount(Integer paragraphCount) {
    this.paragraphCount = paragraphCount;
  }

  public DocumentStatData pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Total count of pages in the document
   * @return pageCount
  **/
  @ApiModelProperty(required = true, value = "Total count of pages in the document")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public DocumentStatData footnotesStatData(FootnotesStatData footnotesStatData) {
    this.footnotesStatData = footnotesStatData;
    return this;
  }

   /**
   * Detailed statistics of footnotes
   * @return footnotesStatData
  **/
  @ApiModelProperty(value = "Detailed statistics of footnotes")
  public FootnotesStatData getFootnotesStatData() {
    return footnotesStatData;
  }

  public void setFootnotesStatData(FootnotesStatData footnotesStatData) {
    this.footnotesStatData = footnotesStatData;
  }

  public DocumentStatData pageStatData(List<PageStatData> pageStatData) {
    this.pageStatData = pageStatData;
    return this;
  }

  public DocumentStatData addPageStatDataItem(PageStatData pageStatDataItem) {
    if (this.pageStatData == null) {
      this.pageStatData = new ArrayList<PageStatData>();
    }
    this.pageStatData.add(pageStatDataItem);
    return this;
  }

   /**
   * Detailed statistics of all pages
   * @return pageStatData
  **/
  @ApiModelProperty(value = "Detailed statistics of all pages")
  public List<PageStatData> getPageStatData() {
    return pageStatData;
  }

  public void setPageStatData(List<PageStatData> pageStatData) {
    this.pageStatData = pageStatData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentStatData documentStatData = (DocumentStatData) o;
    return Objects.equals(this.wordCount, documentStatData.wordCount) &&
        Objects.equals(this.paragraphCount, documentStatData.paragraphCount) &&
        Objects.equals(this.pageCount, documentStatData.pageCount) &&
        Objects.equals(this.footnotesStatData, documentStatData.footnotesStatData) &&
        Objects.equals(this.pageStatData, documentStatData.pageStatData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordCount, paragraphCount, pageCount, footnotesStatData, pageStatData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentStatData {\n");
    
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
    sb.append("    paragraphCount: ").append(toIndentedString(paragraphCount)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    footnotesStatData: ").append(toIndentedString(footnotesStatData)).append("\n");
    sb.append("    pageStatData: ").append(toIndentedString(pageStatData)).append("\n");
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

