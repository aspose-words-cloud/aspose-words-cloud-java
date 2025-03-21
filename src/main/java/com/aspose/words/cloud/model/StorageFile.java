/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StorageFile.java">
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
 * File or folder information.
 */
@ApiModel(description = "File or folder information.")
public class StorageFile implements ModelIfc {
    @SerializedName("IsFolder")
    protected Boolean isFolder;

    @SerializedName("ModifiedDate")
    protected OffsetDateTime modifiedDate;

    @SerializedName("Name")
    protected String name;

    @SerializedName("Path")
    protected String path;

    @SerializedName("Size")
    protected Integer size;
    /**
     * True if it is a folder.
    * @return isFolder
    **/
    @ApiModelProperty(value = "True if it is a folder.")
    public Boolean getIsFolder() {
        return isFolder;
    }

    public StorageFile isFolder(Boolean isFolder) {
        this.isFolder = isFolder;
        return this;
    }

    public void setIsFolder(Boolean isFolder) {
        this.isFolder = isFolder;
    }


    /**
     * File or folder last modified DateTime.
    * @return modifiedDate
    **/
    @ApiModelProperty(value = "File or folder last modified DateTime.")
    public OffsetDateTime getModifiedDate() {
        return modifiedDate;
    }

    public StorageFile modifiedDate(OffsetDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public void setModifiedDate(OffsetDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * File or folder name.
    * @return name
    **/
    @ApiModelProperty(value = "File or folder name.")
    public String getName() {
        return name;
    }

    public StorageFile name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * File or folder path.
    * @return path
    **/
    @ApiModelProperty(value = "File or folder path.")
    public String getPath() {
        return path;
    }

    public StorageFile path(String path) {
        this.path = path;
        return this;
    }

    public void setPath(String path) {
        this.path = path;
    }


    /**
     * File or folder size.
    * @return size
    **/
    @ApiModelProperty(value = "File or folder size.")
    public Integer getSize() {
        return size;
    }

    public StorageFile size(Integer size) {
        this.size = size;
        return this;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    public StorageFile() {
        this.isFolder = null;
        this.modifiedDate = null;
        this.name = null;
        this.path = null;
        this.size = null;
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
        if (this.isFolder == null) {
            throw new ApiException(400, "Property IsFolder in StorageFile is required.");
        }
        if (this.size == null) {
            throw new ApiException(400, "Property Size in StorageFile is required.");
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

        StorageFile storageFile = (StorageFile) o;
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
    sb.append("    isFolder: ").append(toIndentedString(getIsFolder())).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(getModifiedDate())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    path: ").append(toIndentedString(getPath())).append("\n");
    sb.append("    size: ").append(toIndentedString(getSize())).append("\n");
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
