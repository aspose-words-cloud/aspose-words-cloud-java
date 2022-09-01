/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OnlineDocumentEntry.java">
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
 * Represents a document which will be appended to the original resource document.
 */
@ApiModel(description = "Represents a document which will be appended to the original resource document.")
public class OnlineDocumentEntry extends BaseDocumentEntry {
    @SerializedName("File")
    protected FileContent file;
    /**
     * Gets or sets the path to document to append at the server.
    * @return file
    **/
    @ApiModelProperty(value = "Gets or sets the path to document to append at the server.")
    public FileContent getFile() {
        return file;
    }

    public OnlineDocumentEntry file(FileContent file) {
        this.file = file;
        return this;
    }

    public void setFile(FileContent file) {
        this.file = file;
    }


    public OnlineDocumentEntry() {
        super();
        this.file = null;
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
        if (this.file != null)
        {
            this.file.getFilesContent(resultFilesContent);
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

        OnlineDocumentEntry onlineDocumentEntry = (OnlineDocumentEntry) o;
        return
            Objects.equals(this.file, onlineDocumentEntry.file) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlineDocumentEntry {\n");
    sb.append("    encryptedPassword: ").append(toIndentedString(getEncryptedPassword())).append("\n");
    sb.append("    importFormatMode: ").append(toIndentedString(getImportFormatMode())).append("\n");
    sb.append("    file: ").append(toIndentedString(getFile())).append("\n");
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
