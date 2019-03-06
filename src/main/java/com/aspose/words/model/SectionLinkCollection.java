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
import com.aspose.words.cloud.model.LinkElement;
import com.aspose.words.cloud.model.SectionLink;
import com.aspose.words.cloud.model.WordsApiLink;
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
 * Collection of links to sections
 */
@ApiModel(description = "Collection of links to sections")

public class SectionLinkCollection extends LinkElement {
  @SerializedName("SectionLinkList")
  private List<SectionLink> sectionLinkList = null;

  public SectionLinkCollection sectionLinkList(List<SectionLink> sectionLinkList) {
    this.sectionLinkList = sectionLinkList;
    return this;
  }

  public SectionLinkCollection addSectionLinkListItem(SectionLink sectionLinkListItem) {
    if (this.sectionLinkList == null) {
      this.sectionLinkList = new ArrayList<SectionLink>();
    }
    this.sectionLinkList.add(sectionLinkListItem);
    return this;
  }

   /**
   * Collection of section&#39;s links
   * @return sectionLinkList
  **/
  @ApiModelProperty(value = "Collection of section's links")
  public List<SectionLink> getSectionLinkList() {
    return sectionLinkList;
  }

  public void setSectionLinkList(List<SectionLink> sectionLinkList) {
    this.sectionLinkList = sectionLinkList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionLinkCollection sectionLinkCollection = (SectionLinkCollection) o;
    return Objects.equals(this.sectionLinkList, sectionLinkCollection.sectionLinkList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionLinkList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionLinkCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sectionLinkList: ").append(toIndentedString(sectionLinkList)).append("\n");
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

