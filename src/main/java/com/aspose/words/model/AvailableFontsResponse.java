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
import com.aspose.words.model.FontInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The list of fonts, available for document processing
 */
@ApiModel(description = "The list of fonts, available for document processing")

public class AvailableFontsResponse {
  @JsonProperty("Code")
  private Integer code = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("AdditionalFonts")
  private List<FontInfo> additionalFonts = null;

  @JsonProperty("CustomFonts")
  private List<FontInfo> customFonts = null;

  @JsonProperty("SystemFonts")
  private List<FontInfo> systemFonts = null;

  public AvailableFontsResponse code(Integer code) {
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

  public AvailableFontsResponse status(String status) {
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

  public AvailableFontsResponse additionalFonts(List<FontInfo> additionalFonts) {
    this.additionalFonts = additionalFonts;
    return this;
  }

  public AvailableFontsResponse addAdditionalFontsItem(FontInfo additionalFontsItem) {
    if (this.additionalFonts == null) {
      this.additionalFonts = new ArrayList<FontInfo>();
    }
    this.additionalFonts.add(additionalFontsItem);
    return this;
  }

   /**
   * The list of addititional fonts, provided by aspose team
   * @return additionalFonts
  **/
  @ApiModelProperty(value = "The list of addititional fonts, provided by aspose team")
  public List<FontInfo> getAdditionalFonts() {
    return additionalFonts;
  }

  public void setAdditionalFonts(List<FontInfo> additionalFonts) {
    this.additionalFonts = additionalFonts;
  }

  public AvailableFontsResponse customFonts(List<FontInfo> customFonts) {
    this.customFonts = customFonts;
    return this;
  }

  public AvailableFontsResponse addCustomFontsItem(FontInfo customFontsItem) {
    if (this.customFonts == null) {
      this.customFonts = new ArrayList<FontInfo>();
    }
    this.customFonts.add(customFontsItem);
    return this;
  }

   /**
   * Custom user fonts (from user file storage). To use them, you should specify \&quot;fontsLocation\&quot; parameter in any request
   * @return customFonts
  **/
  @ApiModelProperty(value = "Custom user fonts (from user file storage). To use them, you should specify \"fontsLocation\" parameter in any request")
  public List<FontInfo> getCustomFonts() {
    return customFonts;
  }

  public void setCustomFonts(List<FontInfo> customFonts) {
    this.customFonts = customFonts;
  }

  public AvailableFontsResponse systemFonts(List<FontInfo> systemFonts) {
    this.systemFonts = systemFonts;
    return this;
  }

  public AvailableFontsResponse addSystemFontsItem(FontInfo systemFontsItem) {
    if (this.systemFonts == null) {
      this.systemFonts = new ArrayList<FontInfo>();
    }
    this.systemFonts.add(systemFontsItem);
    return this;
  }

   /**
   * The list of system fonts, availiable on the server
   * @return systemFonts
  **/
  @ApiModelProperty(value = "The list of system fonts, availiable on the server")
  public List<FontInfo> getSystemFonts() {
    return systemFonts;
  }

  public void setSystemFonts(List<FontInfo> systemFonts) {
    this.systemFonts = systemFonts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableFontsResponse availableFontsResponse = (AvailableFontsResponse) o;
    return Objects.equals(this.code, availableFontsResponse.code) &&
        Objects.equals(this.status, availableFontsResponse.status) &&
        Objects.equals(this.additionalFonts, availableFontsResponse.additionalFonts) &&
        Objects.equals(this.customFonts, availableFontsResponse.customFonts) &&
        Objects.equals(this.systemFonts, availableFontsResponse.systemFonts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, status, additionalFonts, customFonts, systemFonts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableFontsResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    additionalFonts: ").append(toIndentedString(additionalFonts)).append("\n");
    sb.append("    customFonts: ").append(toIndentedString(customFonts)).append("\n");
    sb.append("    systemFonts: ").append(toIndentedString(systemFonts)).append("\n");
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

