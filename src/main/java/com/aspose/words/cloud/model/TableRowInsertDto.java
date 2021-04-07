/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TableRowInsertDto.java">
 *   Copyright (c) 2021 Aspose.Words for Cloud
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
 * DTO container with a table row element.
 */
@ApiModel(description = "DTO container with a table row element.")
public class TableRowInsertDto {
    @SerializedName("ColumnsCount")
    private Integer columnsCount = null;

    @SerializedName("InsertAfter")
    private Integer insertAfter = null;
    public TableRowInsertDto columnsCount(Integer columnsCount) {
        this.columnsCount = columnsCount;
        return this;
    }

    /**
     * Gets or sets the count of columns. The default value is 1.
    * @return columnsCount
    **/
    @ApiModelProperty(value = "Gets or sets the count of columns. The default value is 1.")
    public Integer getColumnsCount() {
        return columnsCount;
    }

    public void setColumnsCount(Integer columnsCount) {
        this.columnsCount = columnsCount;
    }

    public TableRowInsertDto insertAfter(Integer insertAfter) {
        this.insertAfter = insertAfter;
        return this;
    }

    /**
     * Gets or sets table row will be inserted after row with specified 0-based index.
    * @return insertAfter
    **/
    @ApiModelProperty(value = "Gets or sets table row will be inserted after row with specified 0-based index.")
    public Integer getInsertAfter() {
        return insertAfter;
    }

    public void setInsertAfter(Integer insertAfter) {
        this.insertAfter = insertAfter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TableRowInsertDto tableRowInsertDto = (TableRowInsertDto) o;
        return
            Objects.equals(this.columnsCount, tableRowInsertDto.columnsCount) &&
            Objects.equals(this.insertAfter, tableRowInsertDto.insertAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnsCount, insertAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRowInsertDto {\n");
    sb.append("    columnsCount: ").append(toIndentedString(columnsCount)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
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
