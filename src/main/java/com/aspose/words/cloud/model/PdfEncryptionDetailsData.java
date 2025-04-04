/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PdfEncryptionDetailsData.java">
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
 * Container class for details of encryption.
 */
@ApiModel(description = "Container class for details of encryption.")
public class PdfEncryptionDetailsData implements ModelIfc {
    @SerializedName("OwnerPassword")
    protected String ownerPassword;

    @SerializedName("Permissions")
    protected List<PdfPermissions> permissions;

    @SerializedName("UserPassword")
    protected String userPassword;
    /**
     * Gets or sets the owner password for the encrypted PDF document.
    * @return ownerPassword
    **/
    @ApiModelProperty(value = "Gets or sets the owner password for the encrypted PDF document.")
    public String getOwnerPassword() {
        return ownerPassword;
    }

    public PdfEncryptionDetailsData ownerPassword(String ownerPassword) {
        this.ownerPassword = ownerPassword;
        return this;
    }

    public void setOwnerPassword(String ownerPassword) {
        this.ownerPassword = ownerPassword;
    }


    /**
     * Gets or sets the operations that are allowed to a user on the encrypted PDF document.
    * @return permissions
    **/
    @ApiModelProperty(value = "Gets or sets the operations that are allowed to a user on the encrypted PDF document.")
    public List<PdfPermissions> getPermissions() {
        return permissions;
    }

    public PdfEncryptionDetailsData permissions(List<PdfPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }

    public PdfEncryptionDetailsData addPermissionsItem(PdfPermissions permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<PdfPermissions>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }


    public void setPermissions(List<PdfPermissions> permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets or sets the user password required for opening the encrypted PDF document.
    * @return userPassword
    **/
    @ApiModelProperty(value = "Gets or sets the user password required for opening the encrypted PDF document.")
    public String getUserPassword() {
        return userPassword;
    }

    public PdfEncryptionDetailsData userPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public PdfEncryptionDetailsData() {
        this.ownerPassword = null;
        this.permissions = null;
        this.userPassword = null;
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
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PdfEncryptionDetailsData pdfEncryptionDetailsData = (PdfEncryptionDetailsData) o;
        return
            Objects.equals(this.ownerPassword, pdfEncryptionDetailsData.ownerPassword) &&
            Objects.equals(this.permissions, pdfEncryptionDetailsData.permissions) &&
            Objects.equals(this.userPassword, pdfEncryptionDetailsData.userPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerPassword, permissions, userPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfEncryptionDetailsData {\n");
    sb.append("    ownerPassword: ").append(toIndentedString(getOwnerPassword())).append("\n");
    sb.append("    permissions: ").append(toIndentedString(getPermissions())).append("\n");
    sb.append("    userPassword: ").append(toIndentedString(getUserPassword())).append("\n");
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
