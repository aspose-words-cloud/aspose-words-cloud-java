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
import com.aspose.words.cloud.model.FileLink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * result of the operation which modifies the original document and saves the result
 */
@ApiModel(description = "result of the operation which modifies the original document and saves the result")

public class ModificationOperationResult {
  @SerializedName("Source")
  private FileLink source = null;

  @SerializedName("Dest")
  private FileLink dest = null;

  public ModificationOperationResult source(FileLink source) {
    this.source = source;
    return this;
  }

   /**
   * Link to the source document (source for the modification operation)
   * @return source
  **/
  @ApiModelProperty(value = "Link to the source document (source for the modification operation)")
  public FileLink getSource() {
    return source;
  }

  public void setSource(FileLink source) {
    this.source = source;
  }

  public ModificationOperationResult dest(FileLink dest) {
    this.dest = dest;
    return this;
  }

   /**
   * Link to the dest document (result of the modification operation)
   * @return dest
  **/
  @ApiModelProperty(value = "Link to the dest document (result of the modification operation)")
  public FileLink getDest() {
    return dest;
  }

  public void setDest(FileLink dest) {
    this.dest = dest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModificationOperationResult modificationOperationResult = (ModificationOperationResult) o;
    return Objects.equals(this.source, modificationOperationResult.source) &&
        Objects.equals(this.dest, modificationOperationResult.dest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, dest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationOperationResult {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
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

