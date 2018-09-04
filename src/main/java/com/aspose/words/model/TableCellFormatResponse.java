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
import com.aspose.words.model.AsposeResponse;
import com.aspose.words.model.TableCellFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This response should be returned by the service when handling: GET http://api.aspose.com/v1.1/words/Test.doc/tables/{0}/rows/{1}/cells/{2}/cellformat
 */
@ApiModel(description = "This response should be returned by the service when handling: GET http://api.aspose.com/v1.1/words/Test.doc/tables/{0}/rows/{1}/cells/{2}/cellformat")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:07:04.469Z")
public class TableCellFormatResponse {
  @JsonProperty("Code")
  private Integer code = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("CellFormat")
  private TableCellFormat cellFormat = null;

  public TableCellFormatResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Response status code.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Response status code.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public TableCellFormatResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Response status.
   * @return status
  **/
  @ApiModelProperty(value = "Response status.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TableCellFormatResponse cellFormat(TableCellFormat cellFormat) {
    this.cellFormat = cellFormat;
    return this;
  }

   /**
   * Table.
   * @return cellFormat
  **/
  @ApiModelProperty(value = "Table.")
  public TableCellFormat getCellFormat() {
    return cellFormat;
  }

  public void setCellFormat(TableCellFormat cellFormat) {
    this.cellFormat = cellFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableCellFormatResponse tableCellFormatResponse = (TableCellFormatResponse) o;
    return Objects.equals(this.code, tableCellFormatResponse.code) &&
        Objects.equals(this.status, tableCellFormatResponse.status) &&
        Objects.equals(this.cellFormat, tableCellFormatResponse.cellFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, status, cellFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableCellFormatResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cellFormat: ").append(toIndentedString(cellFormat)).append("\n");
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

