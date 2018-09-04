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
import com.aspose.words.model.NodeLink;
import com.aspose.words.model.WordsApiLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Table cell element.
 */
@ApiModel(description = "Table cell element.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:47:31.656Z")
public class TableCell {
  @JsonProperty("link")
  private WordsApiLink link = null;

  @JsonProperty("NodeId")
  private String nodeId = null;

  @JsonProperty("ChildNodes")
  private List<NodeLink> childNodes = null;

  public TableCell link(WordsApiLink link) {
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

  public TableCell nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Node id
   * @return nodeId
  **/
  @ApiModelProperty(value = "Node id")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public TableCell childNodes(List<NodeLink> childNodes) {
    this.childNodes = childNodes;
    return this;
  }

  public TableCell addChildNodesItem(NodeLink childNodesItem) {
    if (this.childNodes == null) {
      this.childNodes = new ArrayList<NodeLink>();
    }
    this.childNodes.add(childNodesItem);
    return this;
  }

   /**
   * Child nodes.
   * @return childNodes
  **/
  @ApiModelProperty(value = "Child nodes.")
  public List<NodeLink> getChildNodes() {
    return childNodes;
  }

  public void setChildNodes(List<NodeLink> childNodes) {
    this.childNodes = childNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableCell tableCell = (TableCell) o;
    return Objects.equals(this.link, tableCell.link) &&
        Objects.equals(this.nodeId, tableCell.nodeId) &&
        Objects.equals(this.childNodes, tableCell.childNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, nodeId, childNodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableCell {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    childNodes: ").append(toIndentedString(childNodes)).append("\n");
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

