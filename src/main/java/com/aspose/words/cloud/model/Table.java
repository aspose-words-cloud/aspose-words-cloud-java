/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Table.java">
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
 * Table element.
 */
@ApiModel(description = "Table element.")
public class Table extends NodeLink {
    @SerializedName("TableProperties")
    private TableProperties tableProperties = null;

    @SerializedName("TableRowList")
    private List<TableRow> tableRowList = null;
    public Table tableProperties(TableProperties tableProperties) {
        this.tableProperties = tableProperties;
        return this;
    }

    /**
     * Gets or sets table properties.
    * @return tableProperties
    **/
    @ApiModelProperty(value = "Gets or sets table properties.")
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
     * Gets or sets collection of table's rows.
    * @return tableRowList
    **/
    @ApiModelProperty(value = "Gets or sets collection of table's rows.")
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
    Table table = (Table)o;
    return
        Objects.equals(this.tableProperties, table.tableProperties) &&
        Objects.equals(this.tableRowList, table.tableRowList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableProperties, tableRowList, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
