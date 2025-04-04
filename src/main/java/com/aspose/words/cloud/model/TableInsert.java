/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TableInsert.java">
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
 * DTO container with a table element.
 */
@ApiModel(description = "DTO container with a table element.")
public class TableInsert implements ModelIfc {
    @SerializedName("ColumnsCount")
    protected Integer columnsCount;

    @SerializedName("Position")
    protected Position position;

    @SerializedName("RowsCount")
    protected Integer rowsCount;
    /**
     * Gets or sets the number of columns. The default value is 2.
    * @return columnsCount
    **/
    @ApiModelProperty(value = "Gets or sets the number of columns. The default value is 2.")
    public Integer getColumnsCount() {
        return columnsCount;
    }

    public TableInsert columnsCount(Integer columnsCount) {
        this.columnsCount = columnsCount;
        return this;
    }

    public void setColumnsCount(Integer columnsCount) {
        this.columnsCount = columnsCount;
    }


    /**
     * Gets or sets the position to insert the table. The table will be inserted using the specified position.
    * @return position
    **/
    @ApiModelProperty(value = "Gets or sets the position to insert the table. The table will be inserted using the specified position.")
    public Position getPosition() {
        return position;
    }

    public TableInsert position(Position position) {
        this.position = position;
        return this;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    /**
     * Gets or sets the number of rows. The default value is 2.
    * @return rowsCount
    **/
    @ApiModelProperty(value = "Gets or sets the number of rows. The default value is 2.")
    public Integer getRowsCount() {
        return rowsCount;
    }

    public TableInsert rowsCount(Integer rowsCount) {
        this.rowsCount = rowsCount;
        return this;
    }

    public void setRowsCount(Integer rowsCount) {
        this.rowsCount = rowsCount;
    }


    public TableInsert() {
        this.columnsCount = null;
        this.position = null;
        this.rowsCount = null;
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
        if (this.columnsCount == null) {
            throw new ApiException(400, "Property ColumnsCount in TableInsert is required.");
        }
        if (this.rowsCount == null) {
            throw new ApiException(400, "Property RowsCount in TableInsert is required.");
        }

        if (this.position != null) {
            this.position.validate();
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

        TableInsert tableInsert = (TableInsert) o;
        return
            Objects.equals(this.columnsCount, tableInsert.columnsCount) &&
            Objects.equals(this.position, tableInsert.position) &&
            Objects.equals(this.rowsCount, tableInsert.rowsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnsCount, position, rowsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableInsert {\n");
    sb.append("    columnsCount: ").append(toIndentedString(getColumnsCount())).append("\n");
    sb.append("    position: ").append(toIndentedString(getPosition())).append("\n");
    sb.append("    rowsCount: ").append(toIndentedString(getRowsCount())).append("\n");
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
