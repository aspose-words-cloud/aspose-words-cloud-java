/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ModificationOperationResult.java">
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
 * result of the operation which modifies the original document and saves the result.
 */
@ApiModel(description = "result of the operation which modifies the original document and saves the result.")
public class ModificationOperationResult implements ModelIfc {
    @SerializedName("Dest")
    protected FileLink dest;

    @SerializedName("Source")
    protected FileLink source;
    /**
     * Gets or sets the link to the dest document (result of the modification operation).
    * @return dest
    **/
    @ApiModelProperty(value = "Gets or sets the link to the dest document (result of the modification operation).")
    public FileLink getDest() {
        return dest;
    }

    public ModificationOperationResult dest(FileLink dest) {
        this.dest = dest;
        return this;
    }

    public void setDest(FileLink dest) {
        this.dest = dest;
    }


    /**
     * Gets or sets the link to the source document (source for the modification operation).
    * @return source
    **/
    @ApiModelProperty(value = "Gets or sets the link to the source document (source for the modification operation).")
    public FileLink getSource() {
        return source;
    }

    public ModificationOperationResult source(FileLink source) {
        this.source = source;
        return this;
    }

    public void setSource(FileLink source) {
        this.source = source;
    }


    public ModificationOperationResult() {
        this.dest = null;
        this.source = null;
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

        if (this.dest != null) {
            this.dest.validate();
        }



        if (this.source != null) {
            this.source.validate();
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

        ModificationOperationResult modificationOperationResult = (ModificationOperationResult) o;
        return
            Objects.equals(this.dest, modificationOperationResult.dest) &&
            Objects.equals(this.source, modificationOperationResult.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dest, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationOperationResult {\n");
    sb.append("    dest: ").append(toIndentedString(getDest())).append("\n");
    sb.append("    source: ").append(toIndentedString(getSource())).append("\n");
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
