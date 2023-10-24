/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DocumentStatData.java">
 *   Copyright (c) 2023 Aspose.Words for Cloud
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
 * Container for the document's statistical data.
 */
@ApiModel(description = "Container for the document's statistical data.")
public class DocumentStatData implements ModelIfc {
    @SerializedName("FootnotesStatData")
    protected FootnotesStatData footnotesStatData;

    @SerializedName("PageCount")
    protected Integer pageCount;

    @SerializedName("ParagraphCount")
    protected Integer paragraphCount;

    @SerializedName("WordCount")
    protected Integer wordCount;

    @SerializedName("PageStatData")
    protected List<PageStatData> pageStatData;
    /**
     * Gets or sets the detailed statistics on footnotes.
    * @return footnotesStatData
    **/
    @ApiModelProperty(value = "Gets or sets the detailed statistics on footnotes.")
    public FootnotesStatData getFootnotesStatData() {
        return footnotesStatData;
    }

    public DocumentStatData footnotesStatData(FootnotesStatData footnotesStatData) {
        this.footnotesStatData = footnotesStatData;
        return this;
    }

    public void setFootnotesStatData(FootnotesStatData footnotesStatData) {
        this.footnotesStatData = footnotesStatData;
    }


    /**
     * Gets or sets the total count of pages in the document.
    * @return pageCount
    **/
    @ApiModelProperty(value = "Gets or sets the total count of pages in the document.")
    public Integer getPageCount() {
        return pageCount;
    }

    public DocumentStatData pageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }


    /**
     * Gets or sets the total count of paragraphs in the document.
    * @return paragraphCount
    **/
    @ApiModelProperty(value = "Gets or sets the total count of paragraphs in the document.")
    public Integer getParagraphCount() {
        return paragraphCount;
    }

    public DocumentStatData paragraphCount(Integer paragraphCount) {
        this.paragraphCount = paragraphCount;
        return this;
    }

    public void setParagraphCount(Integer paragraphCount) {
        this.paragraphCount = paragraphCount;
    }


    /**
     * Gets or sets the total count of words in the document.
    * @return wordCount
    **/
    @ApiModelProperty(value = "Gets or sets the total count of words in the document.")
    public Integer getWordCount() {
        return wordCount;
    }

    public DocumentStatData wordCount(Integer wordCount) {
        this.wordCount = wordCount;
        return this;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }


    /**
     * Gets or sets the detailed statistics on all pages.
    * @return pageStatData
    **/
    @ApiModelProperty(value = "Gets or sets the detailed statistics on all pages.")
    public List<PageStatData> getPageStatData() {
        return pageStatData;
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


    public void setPageStatData(List<PageStatData> pageStatData) {
        this.pageStatData = pageStatData;
    }


    public DocumentStatData() {
        this.footnotesStatData = null;
        this.pageCount = null;
        this.paragraphCount = null;
        this.wordCount = null;
        this.pageStatData = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
    }

    /*
     * Validate required properties.
     *
     * @throws ApiException If fails to validate required properties.
     */
    @Override
    public void validate() throws ApiException {
        if (this.pageCount == null) {
            throw new ApiException(400, "Property PageCount in DocumentStatData is required.");
        }
        if (this.paragraphCount == null) {
            throw new ApiException(400, "Property ParagraphCount in DocumentStatData is required.");
        }
        if (this.wordCount == null) {
            throw new ApiException(400, "Property WordCount in DocumentStatData is required.");
        }

        if (this.footnotesStatData != null) {
            this.footnotesStatData.validate();
        }






        if (this.pageStatData != null) {
            for (ModelIfc elementPageStatData : this.pageStatData) {
                if (elementPageStatData != null) {
                    elementPageStatData.validate();
                }
            }
        }

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
        return
            Objects.equals(this.footnotesStatData, documentStatData.footnotesStatData) &&
            Objects.equals(this.pageCount, documentStatData.pageCount) &&
            Objects.equals(this.paragraphCount, documentStatData.paragraphCount) &&
            Objects.equals(this.wordCount, documentStatData.wordCount) &&
            Objects.equals(this.pageStatData, documentStatData.pageStatData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(footnotesStatData, pageCount, paragraphCount, wordCount, pageStatData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentStatData {\n");
    sb.append("    footnotesStatData: ").append(toIndentedString(getFootnotesStatData())).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(getPageCount())).append("\n");
    sb.append("    paragraphCount: ").append(toIndentedString(getParagraphCount())).append("\n");
    sb.append("    wordCount: ").append(toIndentedString(getWordCount())).append("\n");
    sb.append("    pageStatData: ").append(toIndentedString(getPageStatData())).append("\n");
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
