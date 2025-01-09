/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ProtectionRequestV2.java">
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
 * Request on changing of protection.
 */
@ApiModel(description = "Request on changing of protection.")
public class ProtectionRequestV2 extends ProtectionRequestBase {
    /**
     * Gets or sets the new type of the document protection.
     */
    @JsonAdapter(ProtectionTypeEnum.Adapter.class)
    public enum ProtectionTypeEnum {
        ALLOWONLYREVISIONS("AllowOnlyRevisions"),
        ALLOWONLYCOMMENTS("AllowOnlyComments"),
        ALLOWONLYFORMFIELDS("AllowOnlyFormFields"),
        READONLY("ReadOnly"),
        NOPROTECTION("NoProtection");

        private String value;

        ProtectionTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ProtectionTypeEnum fromValue(String text) {
            for (ProtectionTypeEnum b : ProtectionTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< ProtectionTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final ProtectionTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ProtectionTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ProtectionTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("ProtectionPassword")
    protected String protectionPassword;

    @SerializedName("ProtectionType")
    protected ProtectionTypeEnum protectionType;
    /**
     * Gets or sets the new password for the document protection.
     * This property is required, but empty value is allowed.
    * @return protectionPassword
    **/
    @ApiModelProperty(value = "Gets or sets the new password for the document protection. This property is required, but empty value is allowed.")
    public String getProtectionPassword() {
        return protectionPassword;
    }

    public ProtectionRequestV2 protectionPassword(String protectionPassword) {
        this.protectionPassword = protectionPassword;
        return this;
    }

    public void setProtectionPassword(String protectionPassword) {
        this.protectionPassword = protectionPassword;
    }


    /**
     * Gets or sets the new type of the document protection.
    * @return protectionType
    **/
    @ApiModelProperty(value = "Gets or sets the new type of the document protection.")
    public ProtectionTypeEnum getProtectionType() {
        return protectionType;
    }

    public ProtectionRequestV2 protectionType(ProtectionTypeEnum protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    public void setProtectionType(ProtectionTypeEnum protectionType) {
        this.protectionType = protectionType;
    }


    public ProtectionRequestV2() {
        super();
        this.protectionPassword = null;
        this.protectionType = null;
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
        if (this.protectionPassword == null) {
            throw new ApiException(400, "Property ProtectionPassword in ProtectionRequestV2 is required.");
        }
        if (this.protectionType == null) {
            throw new ApiException(400, "Property ProtectionType in ProtectionRequestV2 is required.");
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

        ProtectionRequestV2 protectionRequestV2 = (ProtectionRequestV2) o;
        return
            Objects.equals(this.protectionPassword, protectionRequestV2.protectionPassword) &&
            Objects.equals(this.protectionType, protectionRequestV2.protectionType) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protectionPassword, protectionType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtectionRequestV2 {\n");
    sb.append("    protectionPassword: ").append(toIndentedString(getProtectionPassword())).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(getProtectionType())).append("\n");
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
