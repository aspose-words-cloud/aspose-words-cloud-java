/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="HeaderFooter.java">
 *   Copyright (c) 2025 Aspose.Words for Cloud
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
import com.aspose.words.cloud.ApiException;
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
public class HeaderFooter extends HeaderFooterLink {
    @SerializedName("ChildNodes")
    protected List<NodeLink> childNodes;

    @SerializedName("Paragraphs")
    protected LinkElement paragraphs;

    @SerializedName("DrawingObjects")
    protected LinkElement drawingObjects;
    /**
     * Gets or sets the child nodes.
    * @return childNodes
    **/
    @ApiModelProperty(value = "Gets or sets the child nodes.")
    public List<NodeLink> getChildNodes() {
        return childNodes;
    }

    public HeaderFooter childNodes(List<NodeLink> childNodes) {
        this.childNodes = childNodes;
        return this;
    }

    public HeaderFooter addChildNodesItem(NodeLink childNodesItem) {
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
     * Gets or sets the link to Paragraphs resource.
    * @return paragraphs
    **/
    @ApiModelProperty(value = "Gets or sets the link to Paragraphs resource.")
    public LinkElement getParagraphs() {
        return paragraphs;
    }

    public HeaderFooter paragraphs(LinkElement paragraphs) {
        this.paragraphs = paragraphs;
        return this;
    }

    public void setParagraphs(LinkElement paragraphs) {
        this.paragraphs = paragraphs;
    }


    /**
     * Gets or sets the link to DrawingObjects resource.
    * @return drawingObjects
    **/
    @ApiModelProperty(value = "Gets or sets the link to DrawingObjects resource.")
    public LinkElement getDrawingObjects() {
        return drawingObjects;
    }

    public HeaderFooter drawingObjects(LinkElement drawingObjects) {
        this.drawingObjects = drawingObjects;
        return this;
    }

    public void setDrawingObjects(LinkElement drawingObjects) {
        this.drawingObjects = drawingObjects;
    }


    public HeaderFooter() {
        super();
        this.childNodes = null;
        this.paragraphs = null;
        this.drawingObjects = null;
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
        super.validate();

        if (this.childNodes != null) {
            for (ModelIfc elementChildNodes : this.childNodes) {
                if (elementChildNodes != null) {
                    elementChildNodes.validate();
                }
            }
        }



        if (this.paragraphs != null) {
            this.paragraphs.validate();
        }



        if (this.drawingObjects != null) {
            this.drawingObjects.validate();
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

        HeaderFooter headerFooter = (HeaderFooter) o;
        return
            Objects.equals(this.childNodes, headerFooter.childNodes) &&
            Objects.equals(this.paragraphs, headerFooter.paragraphs) &&
            Objects.equals(this.drawingObjects, headerFooter.drawingObjects) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childNodes, paragraphs, drawingObjects, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderFooter {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    type: ").append(toIndentedString(getType())).append("\n");
    sb.append("    childNodes: ").append(toIndentedString(getChildNodes())).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(getParagraphs())).append("\n");
    sb.append("    drawingObjects: ").append(toIndentedString(getDrawingObjects())).append("\n");
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
