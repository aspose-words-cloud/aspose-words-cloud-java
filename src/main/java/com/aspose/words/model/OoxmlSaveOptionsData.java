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

package com.aspose.words.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.words.cloud.model.SaveOptionsData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * container class for docx/docm/dotx/dotm/flatopc save options
 */
@ApiModel(description = "container class for docx/docm/dotx/dotm/flatopc save options")

public class OoxmlSaveOptionsData extends SaveOptionsData {
  @SerializedName("Compliance")
  private String compliance = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("PrettyFormat")
  private Boolean prettyFormat = null;

  public OoxmlSaveOptionsData compliance(String compliance) {
    this.compliance = compliance;
    return this;
  }

   /**
   * Specifies the OOXML version for the output document
   * @return compliance
  **/
  @ApiModelProperty(value = "Specifies the OOXML version for the output document")
  public String getCompliance() {
    return compliance;
  }

  public void setCompliance(String compliance) {
    this.compliance = compliance;
  }

  public OoxmlSaveOptionsData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Specifies a password to encrypt document using ECMA376 Standard encryption algorithm
   * @return password
  **/
  @ApiModelProperty(value = "Specifies a password to encrypt document using ECMA376 Standard encryption algorithm")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public OoxmlSaveOptionsData prettyFormat(Boolean prettyFormat) {
    this.prettyFormat = prettyFormat;
    return this;
  }

   /**
   * Specifies whether or not use pretty formats output
   * @return prettyFormat
  **/
  @ApiModelProperty(value = "Specifies whether or not use pretty formats output")
  public Boolean isisPrettyFormat() {
    return prettyFormat;
  }

  public void setPrettyFormat(Boolean prettyFormat) {
    this.prettyFormat = prettyFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OoxmlSaveOptionsData ooxmlSaveOptionsData = (OoxmlSaveOptionsData) o;
    return Objects.equals(this.compliance, ooxmlSaveOptionsData.compliance) &&
        Objects.equals(this.password, ooxmlSaveOptionsData.password) &&
        Objects.equals(this.prettyFormat, ooxmlSaveOptionsData.prettyFormat) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compliance, password, prettyFormat, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OoxmlSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    prettyFormat: ").append(toIndentedString(prettyFormat)).append("\n");
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

