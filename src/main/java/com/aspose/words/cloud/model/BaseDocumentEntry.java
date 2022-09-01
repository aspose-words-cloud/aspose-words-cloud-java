/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BaseDocumentEntry.java">
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
 * Represents a base document entry.
 */
@ApiModel(description = "Represents a base document entry.")
public abstract class BaseDocumentEntry implements ModelIfc {
    @SerializedName("EncryptedPassword")
    protected String encryptedPassword;

    @SerializedName("ImportFormatMode")
    protected String importFormatMode;
    /**
     * Gets or sets document password encrypted on API public key. The default value is null (the document has no password).
    * @return encryptedPassword
    **/
    @ApiModelProperty(value = "Gets or sets document password encrypted on API public key. The default value is null (the document has no password).")
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public BaseDocumentEntry encryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        return this;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }


    /**
     * Gets or sets the option that controls formatting will be used: appended or destination document. Can be KeepSourceFormatting or UseDestinationStyles.
    * @return importFormatMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls formatting will be used: appended or destination document. Can be KeepSourceFormatting or UseDestinationStyles.")
    public String getImportFormatMode() {
        return importFormatMode;
    }

    public BaseDocumentEntry importFormatMode(String importFormatMode) {
        this.importFormatMode = importFormatMode;
        return this;
    }

    public void setImportFormatMode(String importFormatMode) {
        this.importFormatMode = importFormatMode;
    }


    public BaseDocumentEntry() {
        this.encryptedPassword = null;
        this.importFormatMode = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileContent> instance.
     */
    @Override
    public void getFilesContent(List<FileContent> resultFilesContent)
    {
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BaseDocumentEntry baseDocumentEntry = (BaseDocumentEntry) o;
        return
            Objects.equals(this.encryptedPassword, baseDocumentEntry.encryptedPassword) &&
            Objects.equals(this.importFormatMode, baseDocumentEntry.importFormatMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedPassword, importFormatMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseDocumentEntry {\n");
    sb.append("    encryptedPassword: ").append(toIndentedString(getEncryptedPassword())).append("\n");
    sb.append("    importFormatMode: ").append(toIndentedString(getImportFormatMode())).append("\n");
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
