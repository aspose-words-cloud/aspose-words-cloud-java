/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PageStatData.java">
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
 * Container for the page's statistical data.
 */
@ApiModel(description = "Container for the page's statistical data.")
public class PageStatData {
    @SerializedName("FootnotesStatData")
    private FootnotesStatData footnotesStatData = null;

    @SerializedName("PageNumber")
    private Integer pageNumber = null;

    @SerializedName("ParagraphCount")
    private Integer paragraphCount = null;

    @SerializedName("WordCount")
    private Integer wordCount = null;
    public PageStatData footnotesStatData(FootnotesStatData footnotesStatData) {
        this.footnotesStatData = footnotesStatData;
        return this;
    }

    /**
     * Gets or sets detailed statistics of footnotes.
    * @return footnotesStatData
    **/
    @ApiModelProperty(value = "Gets or sets detailed statistics of footnotes.")
    public FootnotesStatData getFootnotesStatData() {
        return footnotesStatData;
    }

    public void setFootnotesStatData(FootnotesStatData footnotesStatData) {
        this.footnotesStatData = footnotesStatData;
    }

    public PageStatData pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * Gets or sets page number.
    * @return pageNumber
    **/
    @ApiModelProperty(value = "Gets or sets page number.")
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public PageStatData paragraphCount(Integer paragraphCount) {
        this.paragraphCount = paragraphCount;
        return this;
    }

    /**
     * Gets or sets total count of paragraphs in the page.
    * @return paragraphCount
    **/
    @ApiModelProperty(value = "Gets or sets total count of paragraphs in the page.")
    public Integer getParagraphCount() {
        return paragraphCount;
    }

    public void setParagraphCount(Integer paragraphCount) {
        this.paragraphCount = paragraphCount;
    }

    public PageStatData wordCount(Integer wordCount) {
        this.wordCount = wordCount;
        return this;
    }

    /**
     * Gets or sets total count of words in the page.
    * @return wordCount
    **/
    @ApiModelProperty(value = "Gets or sets total count of words in the page.")
    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    PageStatData pageStatData = (PageStatData)o;
    return
        Objects.equals(this.footnotesStatData, pageStatData.footnotesStatData) &&
        Objects.equals(this.pageNumber, pageStatData.pageNumber) &&
        Objects.equals(this.paragraphCount, pageStatData.paragraphCount) &&
        Objects.equals(this.wordCount, pageStatData.wordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(footnotesStatData, pageNumber, paragraphCount, wordCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageStatData {\n");
    sb.append("    footnotesStatData: ").append(toIndentedString(footnotesStatData)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    paragraphCount: ").append(toIndentedString(paragraphCount)).append("\n");
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
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
