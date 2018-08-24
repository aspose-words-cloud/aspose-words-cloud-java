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
import com.aspose.words.model.TableCell;
import com.aspose.words.model.TableRowFormat;
import com.aspose.words.model.WordsApiLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Table row element.
 */
@ApiModel(description = "Table row element.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-24T08:31:47.592+07:00")
public class TableRow {
  @JsonProperty("link")
  private WordsApiLink link = null;

  @JsonProperty("NodeId")
  private String nodeId = null;

  @JsonProperty("RowFormat")
  private TableRowFormat rowFormat = null;

  @JsonProperty("TableCellList")
  private List<TableCell> tableCellList = null;

  public TableRow link(WordsApiLink link) {
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

  public TableRow nodeId(String nodeId) {
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

  public TableRow rowFormat(TableRowFormat rowFormat) {
    this.rowFormat = rowFormat;
    return this;
  }

   /**
   * Provides access to the formatting properties of the row.
   * @return rowFormat
  **/
  @ApiModelProperty(value = "Provides access to the formatting properties of the row.")
  public TableRowFormat getRowFormat() {
    return rowFormat;
  }

  public void setRowFormat(TableRowFormat rowFormat) {
    this.rowFormat = rowFormat;
  }

  public TableRow tableCellList(List<TableCell> tableCellList) {
    this.tableCellList = tableCellList;
    return this;
  }

  public TableRow addTableCellListItem(TableCell tableCellListItem) {
    if (this.tableCellList == null) {
      this.tableCellList = new ArrayList<TableCell>();
    }
    this.tableCellList.add(tableCellListItem);
    return this;
  }

   /**
   * Collection of table&#39;s rows.
   * @return tableCellList
  **/
  @ApiModelProperty(value = "Collection of table's rows.")
  public List<TableCell> getTableCellList() {
    return tableCellList;
  }

  public void setTableCellList(List<TableCell> tableCellList) {
    this.tableCellList = tableCellList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRow tableRow = (TableRow) o;
    return Objects.equals(this.link, tableRow.link) &&
        Objects.equals(this.nodeId, tableRow.nodeId) &&
        Objects.equals(this.rowFormat, tableRow.rowFormat) &&
        Objects.equals(this.tableCellList, tableRow.tableCellList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, nodeId, rowFormat, tableCellList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRow {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    rowFormat: ").append(toIndentedString(rowFormat)).append("\n");
    sb.append("    tableCellList: ").append(toIndentedString(tableCellList)).append("\n");
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

