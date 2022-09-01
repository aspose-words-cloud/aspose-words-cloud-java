/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OnlineImageEntryList.java">
 *   Copyright (c) 2022 Aspose.Words for Cloud
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
 * Represents a list of images which will be appended to the original resource document or image.
 */
@ApiModel(description = "Represents a list of images which will be appended to the original resource document or image.")
public class OnlineImageEntryList extends BaseImageEntryList {
    @SerializedName("OnlineImageEntries")
    protected List<OnlineImageEntry> onlineImageEntries;
    /**
     * Gets or sets the list of images.
    * @return onlineImageEntries
    **/
    @ApiModelProperty(value = "Gets or sets the list of images.")
    public List<OnlineImageEntry> getOnlineImageEntries() {
        return onlineImageEntries;
    }

    public OnlineImageEntryList onlineImageEntries(List<OnlineImageEntry> onlineImageEntries) {
        this.onlineImageEntries = onlineImageEntries;
        return this;
    }

    public OnlineImageEntryList addOnlineImageEntriesItem(OnlineImageEntry onlineImageEntriesItem) {
        if (this.onlineImageEntries == null) {
            this.onlineImageEntries = new ArrayList<OnlineImageEntry>();
        }
        this.onlineImageEntries.add(onlineImageEntriesItem);
        return this;
    }


    public void setOnlineImageEntries(List<OnlineImageEntry> onlineImageEntries) {
        this.onlineImageEntries = onlineImageEntries;
    }


    public OnlineImageEntryList() {
        super();
        this.onlineImageEntries = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileContent> instance.
     */
    @Override
    public void getFilesContent(List<FileContent> resultFilesContent)
    {
        super.getFilesContent(resultFilesContent);
        if (this.onlineImageEntries != null)
        {
            for (ModelIfc element : this.onlineImageEntries)
            {
                element.getFilesContent(resultFilesContent);
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

        OnlineImageEntryList onlineImageEntryList = (OnlineImageEntryList) o;
        return
            Objects.equals(this.onlineImageEntries, onlineImageEntryList.onlineImageEntries) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineImageEntries, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlineImageEntryList {\n");
    sb.append("    appendEachImageOnNewPage: ").append(toIndentedString(getAppendEachImageOnNewPage())).append("\n");
    sb.append("    onlineImageEntries: ").append(toIndentedString(getOnlineImageEntries())).append("\n");
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
