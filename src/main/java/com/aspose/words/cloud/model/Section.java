/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Section.java">
 *   Copyright (c) 2021 Aspose.Words for Cloud
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
 * DTO container with a section element.
 */
@ApiModel(description = "DTO container with a section element.")
public class Section extends LinkElement {
    @SerializedName("ChildNodes")
    private List<NodeLink> childNodes = null;

    @SerializedName("HeaderFooters")
    private LinkElement headerFooters = null;

    @SerializedName("PageSetup")
    private LinkElement pageSetup = null;

    @SerializedName("Paragraphs")
    private LinkElement paragraphs = null;

    @SerializedName("Tables")
    private LinkElement tables = null;
    public Section childNodes(List<NodeLink> childNodes) {
        this.childNodes = childNodes;
        return this;
    }

    public Section addChildNodesItem(NodeLink childNodesItem) {
        if (this.childNodes == null) {
            this.childNodes = new ArrayList<NodeLink>();
        }
        this.childNodes.add(childNodesItem);
        return this;
    }

    /**
     * Gets or sets the list of child nodes.
    * @return childNodes
    **/
    @ApiModelProperty(value = "Gets or sets the list of child nodes.")
    public List<NodeLink> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<NodeLink> childNodes) {
        this.childNodes = childNodes;
    }

    public Section headerFooters(LinkElement headerFooters) {
        this.headerFooters = headerFooters;
        return this;
    }

    /**
     * Gets or sets the link to HeaderFooters resource.
    * @return headerFooters
    **/
    @ApiModelProperty(value = "Gets or sets the link to HeaderFooters resource.")
    public LinkElement getHeaderFooters() {
        return headerFooters;
    }

    public void setHeaderFooters(LinkElement headerFooters) {
        this.headerFooters = headerFooters;
    }

    public Section pageSetup(LinkElement pageSetup) {
        this.pageSetup = pageSetup;
        return this;
    }

    /**
     * Gets or sets the link to PageSetup resource.
    * @return pageSetup
    **/
    @ApiModelProperty(value = "Gets or sets the link to PageSetup resource.")
    public LinkElement getPageSetup() {
        return pageSetup;
    }

    public void setPageSetup(LinkElement pageSetup) {
        this.pageSetup = pageSetup;
    }

    public Section paragraphs(LinkElement paragraphs) {
        this.paragraphs = paragraphs;
        return this;
    }

    /**
     * Gets or sets the link to Paragraphs resource.
    * @return paragraphs
    **/
    @ApiModelProperty(value = "Gets or sets the link to Paragraphs resource.")
    public LinkElement getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(LinkElement paragraphs) {
        this.paragraphs = paragraphs;
    }

    public Section tables(LinkElement tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Gets or sets the link to Tables resource.
    * @return tables
    **/
    @ApiModelProperty(value = "Gets or sets the link to Tables resource.")
    public LinkElement getTables() {
        return tables;
    }

    public void setTables(LinkElement tables) {
        this.tables = tables;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Section section = (Section) o;
        return
            Objects.equals(this.childNodes, section.childNodes) &&
            Objects.equals(this.headerFooters, section.headerFooters) &&
            Objects.equals(this.pageSetup, section.pageSetup) &&
            Objects.equals(this.paragraphs, section.paragraphs) &&
            Objects.equals(this.tables, section.tables) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childNodes, headerFooters, pageSetup, paragraphs, tables, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Section {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    childNodes: ").append(toIndentedString(childNodes)).append("\n");
    sb.append("    headerFooters: ").append(toIndentedString(headerFooters)).append("\n");
    sb.append("    pageSetup: ").append(toIndentedString(pageSetup)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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
