/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FieldBase.java">
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
 * Field.
 */
@ApiModel(description = "Field.")
public abstract class FieldBase implements ModelIfc {
    @SerializedName("LocaleId")
    protected String localeId;

    @SerializedName("FieldCode")
    protected String fieldCode;
    /**
     * Gets or sets the LCID of the field.
    * @return localeId
    **/
    @ApiModelProperty(value = "Gets or sets the LCID of the field.")
    public String getLocaleId() {
        return localeId;
    }

    public FieldBase localeId(String localeId) {
        this.localeId = localeId;
        return this;
    }

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }


    /**
     * Gets or sets the field code.
    * @return fieldCode
    **/
    @ApiModelProperty(value = "Gets or sets the field code.")
    public String getFieldCode() {
        return fieldCode;
    }

    public FieldBase fieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
        return this;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }


    public FieldBase() {
        this.localeId = null;
        this.fieldCode = null;
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
        if (this.fieldCode == null) {
            throw new ApiException(400, "Property FieldCode in FieldBase is required.");
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

        FieldBase fieldBase = (FieldBase) o;
        return
            Objects.equals(this.localeId, fieldBase.localeId) &&
            Objects.equals(this.fieldCode, fieldBase.fieldCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localeId, fieldCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldBase {\n");
    sb.append("    localeId: ").append(toIndentedString(getLocaleId())).append("\n");
    sb.append("    fieldCode: ").append(toIndentedString(getFieldCode())).append("\n");
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
