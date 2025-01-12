/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ProtectionRequest.java">
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
 * @deprecated ProtectionRequest is deprecated and remains for backwards compatibility only.
 */
@ApiModel(description = "Request on changing of protection.")
@Deprecated
public class ProtectionRequest extends ProtectionRequestBase {
    @SerializedName("NewPassword")
    protected String newPassword;

    @SerializedName("Password")
    protected String password;

    @SerializedName("ProtectionType")
    protected String protectionType;
    /**
     * Gets or sets the new password.
    * @return newPassword
    **/
    @ApiModelProperty(value = "Gets or sets the new password.")
    public String getNewPassword() {
        return newPassword;
    }

    public ProtectionRequest newPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }


    /**
     * Gets or sets the current password.
    * @return password
    **/
    @ApiModelProperty(value = "Gets or sets the current password.")
    public String getPassword() {
        return password;
    }

    public ProtectionRequest password(String password) {
        this.password = password;
        return this;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets or sets the new type of protection.
    * @return protectionType
    **/
    @ApiModelProperty(value = "Gets or sets the new type of protection.")
    public String getProtectionType() {
        return protectionType;
    }

    public ProtectionRequest protectionType(String protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }


    public ProtectionRequest() {
        super();
        this.newPassword = null;
        this.password = null;
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
        if (this.password == null) {
            throw new ApiException(400, "Property Password in ProtectionRequest is required.");
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

        ProtectionRequest protectionRequest = (ProtectionRequest) o;
        return
            Objects.equals(this.newPassword, protectionRequest.newPassword) &&
            Objects.equals(this.password, protectionRequest.password) &&
            Objects.equals(this.protectionType, protectionRequest.protectionType) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPassword, password, protectionType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtectionRequest {\n");
    sb.append("    newPassword: ").append(toIndentedString(getNewPassword())).append("\n");
    sb.append("    password: ").append(toIndentedString(getPassword())).append("\n");
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
