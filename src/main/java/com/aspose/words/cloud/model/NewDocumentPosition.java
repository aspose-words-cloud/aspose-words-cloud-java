/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="NewDocumentPosition.java">
 *   Copyright (c) 2023 Aspose.Words for Cloud
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
 * DTO container with a new position in the document tree.
 */
@ApiModel(description = "DTO container with a new position in the document tree.")
public class NewDocumentPosition implements ModelIfc {
    @SerializedName("NodeId")
    protected String nodeId;

    @SerializedName("Offset")
    protected Integer offset;
    /**
     * Gets or sets the node id.
    * @return nodeId
    **/
    @ApiModelProperty(value = "Gets or sets the node id.")
    public String getNodeId() {
        return nodeId;
    }

    public NewDocumentPosition nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }


    /**
     * Gets or sets the offset in the node.
    * @return offset
    **/
    @ApiModelProperty(value = "Gets or sets the offset in the node.")
    public Integer getOffset() {
        return offset;
    }

    public NewDocumentPosition offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }


    public NewDocumentPosition() {
        this.nodeId = null;
        this.offset = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        NewDocumentPosition newDocumentPosition = (NewDocumentPosition) o;
        return
            Objects.equals(this.nodeId, newDocumentPosition.nodeId) &&
            Objects.equals(this.offset, newDocumentPosition.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewDocumentPosition {\n");
    sb.append("    nodeId: ").append(toIndentedString(getNodeId())).append("\n");
    sb.append("    offset: ").append(toIndentedString(getOffset())).append("\n");
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
