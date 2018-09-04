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
import com.aspose.words.model.HeaderFooterLinkCollection;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This response should be returned by the service when handling: GET http://api.aspose.com/v1.1/words/Test.doc/headersfooters 
 */
@ApiModel(description = "This response should be returned by the service when handling: GET http://api.aspose.com/v1.1/words/Test.doc/headersfooters ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:43:27.551Z")
public class HeaderFootersResponse {
  @JsonProperty("Code")
  private Integer code = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("HeaderFooters")
  private HeaderFooterLinkCollection headerFooters = null;

  public HeaderFootersResponse code(Integer code) {
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

  public HeaderFootersResponse status(String status) {
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

  public HeaderFootersResponse headerFooters(HeaderFooterLinkCollection headerFooters) {
    this.headerFooters = headerFooters;
    return this;
  }

   /**
   * Collection of headers/footers
   * @return headerFooters
  **/
  @ApiModelProperty(value = "Collection of headers/footers")
  public HeaderFooterLinkCollection getHeaderFooters() {
    return headerFooters;
  }

  public void setHeaderFooters(HeaderFooterLinkCollection headerFooters) {
    this.headerFooters = headerFooters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderFootersResponse headerFootersResponse = (HeaderFootersResponse) o;
    return Objects.equals(this.code, headerFootersResponse.code) &&
        Objects.equals(this.status, headerFootersResponse.status) &&
        Objects.equals(this.headerFooters, headerFootersResponse.headerFooters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, status, headerFooters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderFootersResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    headerFooters: ").append(toIndentedString(headerFooters)).append("\n");
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

