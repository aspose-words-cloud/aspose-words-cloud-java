/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ParagraphLinkCollection.java">
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
 * Collection of links to paragraphs.
 */
@ApiModel(description = "Collection of links to paragraphs.")
public class ParagraphLinkCollection extends LinkElement {
    @SerializedName("ParagraphLinkList")
    private List<ParagraphLink> paragraphLinkList = null;
    public ParagraphLinkCollection paragraphLinkList(List<ParagraphLink> paragraphLinkList) {
        this.paragraphLinkList = paragraphLinkList;
        return this;
    }

    public ParagraphLinkCollection addParagraphLinkListItem(ParagraphLink paragraphLinkListItem) {
        if (this.paragraphLinkList == null) {
            this.paragraphLinkList = new ArrayList<ParagraphLink>();
        }
        this.paragraphLinkList.add(paragraphLinkListItem);
        return this;
    }

    /**
     * Gets or sets collection of paragraph's links.
    * @return paragraphLinkList
    **/
    @ApiModelProperty(value = "Gets or sets collection of paragraph's links.")
    public List<ParagraphLink> getParagraphLinkList() {
        return paragraphLinkList;
    }

    public void setParagraphLinkList(List<ParagraphLink> paragraphLinkList) {
        this.paragraphLinkList = paragraphLinkList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    ParagraphLinkCollection paragraphLinkCollection = (ParagraphLinkCollection)o;
    return
        Objects.equals(this.paragraphLinkList, paragraphLinkCollection.paragraphLinkList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paragraphLinkList, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParagraphLinkCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    paragraphLinkList: ").append(toIndentedString(paragraphLinkList)).append("\n");
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
