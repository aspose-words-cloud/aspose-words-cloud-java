/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PageNumber.java">
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
 * Class is used for insert page number request building.
 */
@ApiModel(description = "Class is used for insert page number request building.")
public class PageNumber {
    @SerializedName("Alignment")
    protected String alignment;

    @SerializedName("Format")
    protected String format;

    @SerializedName("IsTop")
    protected Boolean isTop;

    @SerializedName("SetPageNumberOnFirstPage")
    protected Boolean setPageNumberOnFirstPage;
    /**
     * Gets or sets text alignment, possible values are left, right, center or justify.
    * @return alignment
    **/
    @ApiModelProperty(value = "Gets or sets text alignment, possible values are left, right, center or justify.")
    public String getAlignment() {
        return alignment;
    }

    public PageNumber alignment(String alignment) {
        this.alignment = alignment;
        return this;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }


    /**
     * Gets or sets the page number format, e.g. "{PAGE} of {NUMPAGES}".
    * @return format
    **/
    @ApiModelProperty(value = "Gets or sets the page number format, e.g. \"{PAGE} of {NUMPAGES}\".")
    public String getFormat() {
        return format;
    }

    public PageNumber format(String format) {
        this.format = format;
        return this;
    }

    public void setFormat(String format) {
        this.format = format;
    }


    /**
     * Gets or sets a value indicating whether if true the page number is added at the top of the page, else at the bottom.
    * @return isTop
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether if true the page number is added at the top of the page, else at the bottom.")
    public Boolean getIsTop() {
        return isTop;
    }

    public PageNumber isTop(Boolean isTop) {
        this.isTop = isTop;
        return this;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }


    /**
     * Gets or sets a value indicating whether if true the page number is added on first page too.
    * @return setPageNumberOnFirstPage
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether if true the page number is added on first page too.")
    public Boolean getSetPageNumberOnFirstPage() {
        return setPageNumberOnFirstPage;
    }

    public PageNumber setPageNumberOnFirstPage(Boolean setPageNumberOnFirstPage) {
        this.setPageNumberOnFirstPage = setPageNumberOnFirstPage;
        return this;
    }

    public void setSetPageNumberOnFirstPage(Boolean setPageNumberOnFirstPage) {
        this.setPageNumberOnFirstPage = setPageNumberOnFirstPage;
    }


    public PageNumber() {
        this.alignment = null;
        this.format = null;
        this.isTop = null;
        this.setPageNumberOnFirstPage = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PageNumber pageNumber = (PageNumber) o;
        return
            Objects.equals(this.alignment, pageNumber.alignment) &&
            Objects.equals(this.format, pageNumber.format) &&
            Objects.equals(this.isTop, pageNumber.isTop) &&
            Objects.equals(this.setPageNumberOnFirstPage, pageNumber.setPageNumberOnFirstPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, format, isTop, setPageNumberOnFirstPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageNumber {\n");
    sb.append("    alignment: ").append(toIndentedString(getAlignment())).append("\n");
    sb.append("    format: ").append(toIndentedString(getFormat())).append("\n");
    sb.append("    isTop: ").append(toIndentedString(getIsTop())).append("\n");
    sb.append("    setPageNumberOnFirstPage: ").append(toIndentedString(getSetPageNumberOnFirstPage())).append("\n");
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
