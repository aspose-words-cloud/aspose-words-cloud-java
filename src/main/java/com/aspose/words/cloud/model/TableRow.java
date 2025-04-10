/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TableRow.java">
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
 * DTO container with a table row element.
 */
@ApiModel(description = "DTO container with a table row element.")
public class TableRow extends NodeLink {
    @SerializedName("TableCellList")
    protected List<TableCell> tableCellList;

    @SerializedName("RowFormat")
    protected TableRowFormat rowFormat;
    /**
     * Gets or sets the collection of rows.
    * @return tableCellList
    **/
    @ApiModelProperty(value = "Gets or sets the collection of rows.")
    public List<TableCell> getTableCellList() {
        return tableCellList;
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


    public void setTableCellList(List<TableCell> tableCellList) {
        this.tableCellList = tableCellList;
    }


    /**
     * Gets or sets the formatting properties of a row.
    * @return rowFormat
    **/
    @ApiModelProperty(value = "Gets or sets the formatting properties of a row.")
    public TableRowFormat getRowFormat() {
        return rowFormat;
    }

    public TableRow rowFormat(TableRowFormat rowFormat) {
        this.rowFormat = rowFormat;
        return this;
    }

    public void setRowFormat(TableRowFormat rowFormat) {
        this.rowFormat = rowFormat;
    }


    public TableRow() {
        super();
        this.tableCellList = null;
        this.rowFormat = null;
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

        if (this.tableCellList != null) {
            for (ModelIfc elementTableCellList : this.tableCellList) {
                if (elementTableCellList != null) {
                    elementTableCellList.validate();
                }
            }
        }



        if (this.rowFormat != null) {
            this.rowFormat.validate();
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

        TableRow tableRow = (TableRow) o;
        return
            Objects.equals(this.tableCellList, tableRow.tableCellList) &&
            Objects.equals(this.rowFormat, tableRow.rowFormat) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableCellList, rowFormat, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRow {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(getNodeId())).append("\n");
    sb.append("    tableCellList: ").append(toIndentedString(getTableCellList())).append("\n");
    sb.append("    rowFormat: ").append(toIndentedString(getRowFormat())).append("\n");
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
