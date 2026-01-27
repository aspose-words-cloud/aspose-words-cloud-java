/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DocumentEntry.java">
 *   Copyright (c) 2026 Aspose.Words for Cloud
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
 * Represents a document which will be appended to the original resource document.
 */
@ApiModel(description = "Represents a document which will be appended to the original resource document.")
public class DocumentEntry extends BaseEntry {
    /**
     * Gets or sets the option that controls formatting will be used: appended or destination document. Can be KeepSourceFormatting or UseDestinationStyles.
     */
    @JsonAdapter(ImportFormatModeEnum.Adapter.class)
    public enum ImportFormatModeEnum {
        USEDESTINATIONSTYLES("UseDestinationStyles"),
        KEEPSOURCEFORMATTING("KeepSourceFormatting"),
        KEEPDIFFERENTSTYLES("KeepDifferentStyles");

        private String value;

        ImportFormatModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ImportFormatModeEnum fromValue(String text) {
            for (ImportFormatModeEnum b : ImportFormatModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< ImportFormatModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final ImportFormatModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ImportFormatModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ImportFormatModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("EncryptedPassword")
    protected String encryptedPassword;

    @SerializedName("ImportFormatMode")
    protected ImportFormatModeEnum importFormatMode;
    /**
     * Gets or sets document password encrypted on API public key. The default value is null (the document has no password).
    * @return encryptedPassword
    **/
    @ApiModelProperty(value = "Gets or sets document password encrypted on API public key. The default value is null (the document has no password).")
    @Deprecated
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    @Deprecated
    public DocumentEntry encryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        return this;
    }

    @Deprecated
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }


    /**
     * Gets or sets the option that controls formatting will be used: appended or destination document. Can be KeepSourceFormatting or UseDestinationStyles.
    * @return importFormatMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls formatting will be used: appended or destination document. Can be KeepSourceFormatting or UseDestinationStyles.")
    public ImportFormatModeEnum getImportFormatMode() {
        return importFormatMode;
    }

    public DocumentEntry importFormatMode(ImportFormatModeEnum importFormatMode) {
        this.importFormatMode = importFormatMode;
        return this;
    }

    public void setImportFormatMode(ImportFormatModeEnum importFormatMode) {
        this.importFormatMode = importFormatMode;
    }


    public DocumentEntry() {
        super();
        this.encryptedPassword = null;
        this.importFormatMode = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
        super.getFilesContent(resultFilesContent);
    }

    /*
     * Validate required properties.
     *
     * @throws ApiException If fails to validate required properties.
     */
    @Override
    public void validate() throws ApiException {
        super.validate();
        if (this.importFormatMode == null) {
            throw new ApiException(400, "Property ImportFormatMode in DocumentEntry is required.");
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

        DocumentEntry documentEntry = (DocumentEntry) o;
        return
            Objects.equals(this.encryptedPassword, documentEntry.encryptedPassword) &&
            Objects.equals(this.importFormatMode, documentEntry.importFormatMode) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedPassword, importFormatMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentEntry {\n");
    sb.append("    fileReference: ").append(toIndentedString(getFileReference())).append("\n");
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
