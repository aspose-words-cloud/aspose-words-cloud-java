/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Section.java">
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
 * DTO container with a section element.
 */
@ApiModel(description = "DTO container with a section element.")
public class Section extends LinkElement {
    @SerializedName("ChildNodes")
    protected List<NodeLink> childNodes;

    @SerializedName("HeaderFooters")
    protected LinkElement headerFooters;

    @SerializedName("PageSetup")
    protected LinkElement pageSetup;

    @SerializedName("Paragraphs")
    protected LinkElement paragraphs;

    @SerializedName("Tables")
    protected LinkElement tables;
    /**
     * Gets or sets the list of child nodes.
    * @return childNodes
    **/
    @ApiModelProperty(value = "Gets or sets the list of child nodes.")
    public List<NodeLink> getChildNodes() {
        return childNodes;
    }

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


    public void setChildNodes(List<NodeLink> childNodes) {
        this.childNodes = childNodes;
    }


    /**
     * Gets or sets the link to HeaderFooters resource.
    * @return headerFooters
    **/
    @ApiModelProperty(value = "Gets or sets the link to HeaderFooters resource.")
    public LinkElement getHeaderFooters() {
        return headerFooters;
    }

    public Section headerFooters(LinkElement headerFooters) {
        this.headerFooters = headerFooters;
        return this;
    }

    public void setHeaderFooters(LinkElement headerFooters) {
        this.headerFooters = headerFooters;
    }


    /**
     * Gets or sets the link to PageSetup resource.
    * @return pageSetup
    **/
    @ApiModelProperty(value = "Gets or sets the link to PageSetup resource.")
    public LinkElement getPageSetup() {
        return pageSetup;
    }

    public Section pageSetup(LinkElement pageSetup) {
        this.pageSetup = pageSetup;
        return this;
    }

    public void setPageSetup(LinkElement pageSetup) {
        this.pageSetup = pageSetup;
    }


    /**
     * Gets or sets the link to Paragraphs resource.
    * @return paragraphs
    **/
    @ApiModelProperty(value = "Gets or sets the link to Paragraphs resource.")
    public LinkElement getParagraphs() {
        return paragraphs;
    }

    public Section paragraphs(LinkElement paragraphs) {
        this.paragraphs = paragraphs;
        return this;
    }

    public void setParagraphs(LinkElement paragraphs) {
        this.paragraphs = paragraphs;
    }


    /**
     * Gets or sets the link to Tables resource.
    * @return tables
    **/
    @ApiModelProperty(value = "Gets or sets the link to Tables resource.")
    public LinkElement getTables() {
        return tables;
    }

    public Section tables(LinkElement tables) {
        this.tables = tables;
        return this;
    }

    public void setTables(LinkElement tables) {
        this.tables = tables;
    }


    public Section() {
        super();
        this.childNodes = null;
        this.headerFooters = null;
        this.pageSetup = null;
        this.paragraphs = null;
        this.tables = null;
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
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    childNodes: ").append(toIndentedString(getChildNodes())).append("\n");
    sb.append("    headerFooters: ").append(toIndentedString(getHeaderFooters())).append("\n");
    sb.append("    pageSetup: ").append(toIndentedString(getPageSetup())).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(getParagraphs())).append("\n");
    sb.append("    tables: ").append(toIndentedString(getTables())).append("\n");
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
