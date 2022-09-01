/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OnlineDocumentEntryList.java">
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
 * Represents a list of documents which will be appended to the original resource document.
 */
@ApiModel(description = "Represents a list of documents which will be appended to the original resource document.")
public class OnlineDocumentEntryList extends BaseDocumentEntryList {
    @SerializedName("OnlineDocumentEntries")
    protected List<OnlineDocumentEntry> onlineDocumentEntries;
    /**
     * Gets or sets the list of documents.
    * @return onlineDocumentEntries
    **/
    @ApiModelProperty(value = "Gets or sets the list of documents.")
    public List<OnlineDocumentEntry> getOnlineDocumentEntries() {
        return onlineDocumentEntries;
    }

    public OnlineDocumentEntryList onlineDocumentEntries(List<OnlineDocumentEntry> onlineDocumentEntries) {
        this.onlineDocumentEntries = onlineDocumentEntries;
        return this;
    }

    public OnlineDocumentEntryList addOnlineDocumentEntriesItem(OnlineDocumentEntry onlineDocumentEntriesItem) {
        if (this.onlineDocumentEntries == null) {
            this.onlineDocumentEntries = new ArrayList<OnlineDocumentEntry>();
        }
        this.onlineDocumentEntries.add(onlineDocumentEntriesItem);
        return this;
    }


    public void setOnlineDocumentEntries(List<OnlineDocumentEntry> onlineDocumentEntries) {
        this.onlineDocumentEntries = onlineDocumentEntries;
    }


    public OnlineDocumentEntryList() {
        super();
        this.onlineDocumentEntries = null;
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
        if (this.onlineDocumentEntries != null)
        {
            for (ModelIfc element : this.onlineDocumentEntries)
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

        OnlineDocumentEntryList onlineDocumentEntryList = (OnlineDocumentEntryList) o;
        return
            Objects.equals(this.onlineDocumentEntries, onlineDocumentEntryList.onlineDocumentEntries) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineDocumentEntries, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlineDocumentEntryList {\n");
    sb.append("    applyBaseDocumentHeadersAndFootersToAppendingDocuments: ").append(toIndentedString(getApplyBaseDocumentHeadersAndFootersToAppendingDocuments())).append("\n");
    sb.append("    onlineDocumentEntries: ").append(toIndentedString(getOnlineDocumentEntries())).append("\n");
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
