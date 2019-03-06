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
 * container class for doc/dot save options
 */
@ApiModel(description = "container class for doc/dot save options")

public class DocSaveOptionsData extends SaveOptionsData {
  @SerializedName("Password")
  private String password = null;

  @SerializedName("SaveRoutingSlip")
  private Boolean saveRoutingSlip = null;

  public DocSaveOptionsData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  @ApiModelProperty(value = "Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DocSaveOptionsData saveRoutingSlip(Boolean saveRoutingSlip) {
    this.saveRoutingSlip = saveRoutingSlip;
    return this;
  }

   /**
   * Determine whether or not save RoutingSlip data saved to output document
   * @return saveRoutingSlip
  **/
  @ApiModelProperty(value = "Determine whether or not save RoutingSlip data saved to output document")
  public Boolean isisSaveRoutingSlip() {
    return saveRoutingSlip;
  }

  public void setSaveRoutingSlip(Boolean saveRoutingSlip) {
    this.saveRoutingSlip = saveRoutingSlip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocSaveOptionsData docSaveOptionsData = (DocSaveOptionsData) o;
    return Objects.equals(this.password, docSaveOptionsData.password) &&
        Objects.equals(this.saveRoutingSlip, docSaveOptionsData.saveRoutingSlip) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, saveRoutingSlip, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    saveRoutingSlip: ").append(toIndentedString(saveRoutingSlip)).append("\n");
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

