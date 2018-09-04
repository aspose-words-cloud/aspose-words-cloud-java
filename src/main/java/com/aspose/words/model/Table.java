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
import com.aspose.words.model.TableProperties;
import com.aspose.words.model.TableRow;
import com.aspose.words.model.WordsApiLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Table element
 */
@ApiModel(description = "Table element")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T12:36:42.079Z")
public class Table {
  @JsonProperty("link")
  private WordsApiLink link = null;

  @JsonProperty("NodeId")
  private String nodeId = null;

  @JsonProperty("TableProperties")
  private TableProperties tableProperties = null;

  @JsonProperty("TableRowList")
  private List<TableRow> tableRowList = null;

  public Table link(WordsApiLink link) {
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

  public Table nodeId(String nodeId) {
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

  public Table tableProperties(TableProperties tableProperties) {
    this.tableProperties = tableProperties;
    return this;
  }

   /**
   * Table properties.
   * @return tableProperties
  **/
  @ApiModelProperty(value = "Table properties.")
  public TableProperties getTableProperties() {
    return tableProperties;
  }

  public void setTableProperties(TableProperties tableProperties) {
    this.tableProperties = tableProperties;
  }

  public Table tableRowList(List<TableRow> tableRowList) {
    this.tableRowList = tableRowList;
    return this;
  }

  public Table addTableRowListItem(TableRow tableRowListItem) {
    if (this.tableRowList == null) {
      this.tableRowList = new ArrayList<TableRow>();
    }
    this.tableRowList.add(tableRowListItem);
    return this;
  }

   /**
   * Collection of table&#39;s rows.
   * @return tableRowList
  **/
  @ApiModelProperty(value = "Collection of table's rows.")
  public List<TableRow> getTableRowList() {
    return tableRowList;
  }

  public void setTableRowList(List<TableRow> tableRowList) {
    this.tableRowList = tableRowList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Table table = (Table) o;
    return Objects.equals(this.link, table.link) &&
        Objects.equals(this.nodeId, table.nodeId) &&
        Objects.equals(this.tableProperties, table.tableProperties) &&
        Objects.equals(this.tableRowList, table.tableRowList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, nodeId, tableProperties, tableRowList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    tableProperties: ").append(toIndentedString(tableProperties)).append("\n");
    sb.append("    tableRowList: ").append(toIndentedString(tableRowList)).append("\n");
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

