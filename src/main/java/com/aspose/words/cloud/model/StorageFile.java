/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StorageFile.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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
 * File or folder information.
 */
@ApiModel(description = "File or folder information.")
public class StorageFile {
    @SerializedName("IsFolder")
    private Boolean isFolder = null;

    @SerializedName("ModifiedDate")
    private OffsetDateTime modifiedDate = null;

    @SerializedName("Name")
    private String name = null;

    @SerializedName("Path")
    private String path = null;

    @SerializedName("Size")
    private Integer size = null;
    public StorageFile isFolder(Boolean isFolder) {
        this.isFolder = isFolder;
        return this;
    }

    /**
     * True if it is a folder.
    * @return isFolder
    **/
    @ApiModelProperty(value = "True if it is a folder.")
    public Boolean getIsFolder() {
        return isFolder;
    }

    public void setIsFolder(Boolean isFolder) {
        this.isFolder = isFolder;
    }

    public StorageFile modifiedDate(OffsetDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * File or folder last modified DateTime.
    * @return modifiedDate
    **/
    @ApiModelProperty(value = "File or folder last modified DateTime.")
    public OffsetDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(OffsetDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public StorageFile name(String name) {
        this.name = name;
        return this;
    }

    /**
     * File or folder name.
    * @return name
    **/
    @ApiModelProperty(value = "File or folder name.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StorageFile path(String path) {
        this.path = path;
        return this;
    }

    /**
     * File or folder path.
    * @return path
    **/
    @ApiModelProperty(value = "File or folder path.")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public StorageFile size(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * File or folder size.
    * @return size
    **/
    @ApiModelProperty(value = "File or folder size.")
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    StorageFile storageFile = (StorageFile)o;
    return
        Objects.equals(this.isFolder, storageFile.isFolder) &&
        Objects.equals(this.modifiedDate, storageFile.modifiedDate) &&
        Objects.equals(this.name, storageFile.name) &&
        Objects.equals(this.path, storageFile.path) &&
        Objects.equals(this.size, storageFile.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFolder, modifiedDate, name, path, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageFile {\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
