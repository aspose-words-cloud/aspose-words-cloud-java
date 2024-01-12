/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TableRowInsert.java">
 *   Copyright (c) 2024 Aspose.Words for Cloud
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
public class TableRowInsert implements ModelIfc {
    @SerializedName("ColumnsCount")
    protected Integer columnsCount;

    @SerializedName("ExistingRowPosition")
    protected Position existingRowPosition;

    @SerializedName("InsertAfter")
    protected Integer insertAfter;
    /**
     * Gets or sets the count of columns. The default value is 1.
    * @return columnsCount
    **/
    @ApiModelProperty(value = "Gets or sets the count of columns. The default value is 1.")
    public Integer getColumnsCount() {
        return columnsCount;
    }

    public TableRowInsert columnsCount(Integer columnsCount) {
        this.columnsCount = columnsCount;
        return this;
    }

    public void setColumnsCount(Integer columnsCount) {
        this.columnsCount = columnsCount;
    }


    /**
     * Gets or sets the position of the table row that will be used to determine the placement of a new row.
    * @return existingRowPosition
    **/
    @ApiModelProperty(value = "Gets or sets the position of the table row that will be used to determine the placement of a new row.")
    public Position getExistingRowPosition() {
        return existingRowPosition;
    }

    public TableRowInsert existingRowPosition(Position existingRowPosition) {
        this.existingRowPosition = existingRowPosition;
        return this;
    }

    public void setExistingRowPosition(Position existingRowPosition) {
        this.existingRowPosition = existingRowPosition;
    }


    /**
     * Gets or sets table row will be inserted after row with specified 0-based index.
    * @return insertAfter
    **/
    @ApiModelProperty(value = "Gets or sets table row will be inserted after row with specified 0-based index.")
    @Deprecated
    public Integer getInsertAfter() {
        return insertAfter;
    }

    @Deprecated
    public TableRowInsert insertAfter(Integer insertAfter) {
        this.insertAfter = insertAfter;
        return this;
    }

    @Deprecated
    public void setInsertAfter(Integer insertAfter) {
        this.insertAfter = insertAfter;
    }


    public TableRowInsert() {
        this.columnsCount = null;
        this.existingRowPosition = null;
        this.insertAfter = null;
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
            throw new ApiException(400, "Property ColumnsCount in TableRowInsert is required.");
        }

        if (this.existingRowPosition != null) {
            this.existingRowPosition.validate();
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

        TableRowInsert tableRowInsert = (TableRowInsert) o;
        return
            Objects.equals(this.columnsCount, tableRowInsert.columnsCount) &&
            Objects.equals(this.existingRowPosition, tableRowInsert.existingRowPosition) &&
            Objects.equals(this.insertAfter, tableRowInsert.insertAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnsCount, existingRowPosition, insertAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRowInsert {\n");
    sb.append("    columnsCount: ").append(toIndentedString(getColumnsCount())).append("\n");
    sb.append("    existingRowPosition: ").append(toIndentedString(getExistingRowPosition())).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(getInsertAfter())).append("\n");
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
