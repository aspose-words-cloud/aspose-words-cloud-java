/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Lists.java">
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
 * DTO container with an array of document lists.
 */
@ApiModel(description = "DTO container with an array of document lists.")
public class Lists extends LinkElement {
    @SerializedName("ListInfo")
    protected List<ListInfo> listInfo;
    /**
     * Gets or sets the array of document lists.
    * @return listInfo
    **/
    @ApiModelProperty(value = "Gets or sets the array of document lists.")
    public List<ListInfo> getListInfo() {
        return listInfo;
    }

    public Lists listInfo(List<ListInfo> listInfo) {
        this.listInfo = listInfo;
        return this;
    }

    public Lists addListInfoItem(ListInfo listInfoItem) {
        if (this.listInfo == null) {
            this.listInfo = new ArrayList<ListInfo>();
        }
        this.listInfo.add(listInfoItem);
        return this;
    }


    public void setListInfo(List<ListInfo> listInfo) {
        this.listInfo = listInfo;
    }


    public Lists() {
        super();
        this.listInfo = null;
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
        super.validate();

        if (this.listInfo != null) {
            for (ModelIfc elementListInfo : this.listInfo) {
                if (elementListInfo != null) {
                    elementListInfo.validate();
                }
            }
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

        Lists lists = (Lists) o;
        return
            Objects.equals(this.listInfo, lists.listInfo) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listInfo, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lists {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    listInfo: ").append(toIndentedString(getListInfo())).append("\n");
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
