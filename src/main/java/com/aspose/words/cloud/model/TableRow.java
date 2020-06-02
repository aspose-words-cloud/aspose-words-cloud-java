/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TableRow.java">
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
 * Table row element.
 */
@ApiModel(description = "Table row element.")
public class TableRow extends NodeLink {
    @SerializedName("RowFormat")
    private TableRowFormat rowFormat = null;

    @SerializedName("TableCellList")
    private List<TableCell> tableCellList = null;
    public TableRow rowFormat(TableRowFormat rowFormat) {
        this.rowFormat = rowFormat;
        return this;
    }

    /**
     * Gets or sets provides access to the formatting properties of the row.
    * @return rowFormat
    **/
    @ApiModelProperty(value = "Gets or sets provides access to the formatting properties of the row.")
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
     * Gets or sets collection of table's rows.
    * @return tableCellList
    **/
    @ApiModelProperty(value = "Gets or sets collection of table's rows.")
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
    TableRow tableRow = (TableRow)o;
    return
        Objects.equals(this.rowFormat, tableRow.rowFormat) &&
        Objects.equals(this.tableCellList, tableRow.tableCellList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowFormat, tableCellList, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRow {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
