/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SignOptions.java">
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
 * Container class for digital signature options.
 */
@ApiModel(description = "Container class for digital signature options.")
public class SignOptions implements ModelIfc {
    @SerializedName("Comments")
    protected String comments;

    @SerializedName("DecryptionPassword")
    protected String decryptionPassword;

    @SerializedName("ProviderId")
    protected String providerId;

    @SerializedName("SignatureLineId")
    protected String signatureLineId;

    @SerializedName("SignatureLineImageFilename")
    protected String signatureLineImageFilename;

    @SerializedName("SignTime")
    protected OffsetDateTime signTime;
    /**
     * Gets or sets comments on the digital signature. The default value is an empty string.
    * @return comments
    **/
    @ApiModelProperty(value = "Gets or sets comments on the digital signature. The default value is an empty string.")
    public String getComments() {
        return comments;
    }

    public SignOptions comments(String comments) {
        this.comments = comments;
        return this;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    /**
     * Gets or sets the password to decrypt source document. The default value is an empty string.
    * @return decryptionPassword
    **/
    @ApiModelProperty(value = "Gets or sets the password to decrypt source document. The default value is an empty string.")
    public String getDecryptionPassword() {
        return decryptionPassword;
    }

    public SignOptions decryptionPassword(String decryptionPassword) {
        this.decryptionPassword = decryptionPassword;
        return this;
    }

    public void setDecryptionPassword(String decryptionPassword) {
        this.decryptionPassword = decryptionPassword;
    }


    /**
     * Gets or sets the class Guid of the signature cryptography provider. The default value is Empty (all zeroes) Guid.
    * @return providerId
    **/
    @ApiModelProperty(value = "Gets or sets the class Guid of the signature cryptography provider. The default value is Empty (all zeroes) Guid.")
    public String getProviderId() {
        return providerId;
    }

    public SignOptions providerId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }


    /**
     * Gets or sets user defined signature line Guid. The default value is Empty (all zeroes) Guid.
    * @return signatureLineId
    **/
    @ApiModelProperty(value = "Gets or sets user defined signature line Guid. The default value is Empty (all zeroes) Guid.")
    public String getSignatureLineId() {
        return signatureLineId;
    }

    public SignOptions signatureLineId(String signatureLineId) {
        this.signatureLineId = signatureLineId;
        return this;
    }

    public void setSignatureLineId(String signatureLineId) {
        this.signatureLineId = signatureLineId;
    }


    /**
     * Gets or sets the image that will be shown in associated SignatureLine. The default value is an empty string.
    * @return signatureLineImageFilename
    **/
    @ApiModelProperty(value = "Gets or sets the image that will be shown in associated SignatureLine. The default value is an empty string.")
    public String getSignatureLineImageFilename() {
        return signatureLineImageFilename;
    }

    public SignOptions signatureLineImageFilename(String signatureLineImageFilename) {
        this.signatureLineImageFilename = signatureLineImageFilename;
        return this;
    }

    public void setSignatureLineImageFilename(String signatureLineImageFilename) {
        this.signatureLineImageFilename = signatureLineImageFilename;
    }


    /**
     * Gets or sets the date of signing. The default value is current time (Now).
    * @return signTime
    **/
    @ApiModelProperty(value = "Gets or sets the date of signing. The default value is current time (Now).")
    public OffsetDateTime getSignTime() {
        return signTime;
    }

    public SignOptions signTime(OffsetDateTime signTime) {
        this.signTime = signTime;
        return this;
    }

    public void setSignTime(OffsetDateTime signTime) {
        this.signTime = signTime;
    }


    public SignOptions() {
        this.comments = null;
        this.decryptionPassword = null;
        this.providerId = null;
        this.signatureLineId = null;
        this.signatureLineImageFilename = null;
        this.signTime = null;
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

        SignOptions signOptions = (SignOptions) o;
        return
            Objects.equals(this.comments, signOptions.comments) &&
            Objects.equals(this.decryptionPassword, signOptions.decryptionPassword) &&
            Objects.equals(this.providerId, signOptions.providerId) &&
            Objects.equals(this.signatureLineId, signOptions.signatureLineId) &&
            Objects.equals(this.signatureLineImageFilename, signOptions.signatureLineImageFilename) &&
            Objects.equals(this.signTime, signOptions.signTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, decryptionPassword, providerId, signatureLineId, signatureLineImageFilename, signTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignOptions {\n");
    sb.append("    comments: ").append(toIndentedString(getComments())).append("\n");
    sb.append("    decryptionPassword: ").append(toIndentedString(getDecryptionPassword())).append("\n");
    sb.append("    providerId: ").append(toIndentedString(getProviderId())).append("\n");
    sb.append("    signatureLineId: ").append(toIndentedString(getSignatureLineId())).append("\n");
    sb.append("    signatureLineImageFilename: ").append(toIndentedString(getSignatureLineImageFilename())).append("\n");
    sb.append("    signTime: ").append(toIndentedString(getSignTime())).append("\n");
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
