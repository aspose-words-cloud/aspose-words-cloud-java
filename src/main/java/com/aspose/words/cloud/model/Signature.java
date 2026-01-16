/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Signature.java">
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
 * The REST response with a document signature collection.
 * This response is returned by the Service when handling any "https://api.aspose.cloud/v4.0/words/Test.doc/signatures" REST API requests.
 */
@ApiModel(description = "The REST response with a document signature collection. This response is returned by the Service when handling any \"https://api.aspose.cloud/v4.0/words/Test.doc/signatures\" REST API requests.")
public class Signature implements ModelIfc {
    @SerializedName("Comments")
    protected String comments;

    @SerializedName("IssuerName")
    protected String issuerName;

    @SerializedName("IsValid")
    protected Boolean isValid;

    @SerializedName("SignatureType")
    protected String signatureType;

    @SerializedName("SignatureValue")
    protected String signatureValue;

    @SerializedName("SignTime")
    protected OffsetDateTime signTime;

    @SerializedName("SubjectName")
    protected String subjectName;
    /**
     * Gets or sets the signing purpose comment.
    * @return comments
    **/
    @ApiModelProperty(value = "Gets or sets the signing purpose comment.")
    public String getComments() {
        return comments;
    }

    public Signature comments(String comments) {
        this.comments = comments;
        return this;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    /**
     * Gets or sets the subject distinguished name of the certificate issuer.
    * @return issuerName
    **/
    @ApiModelProperty(value = "Gets or sets the subject distinguished name of the certificate issuer.")
    public String getIssuerName() {
        return issuerName;
    }

    public Signature issuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }


    /**
     * Gets or sets a value indicating whether this digital signature is valid.
    * @return isValid
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this digital signature is valid.")
    public Boolean getIsValid() {
        return isValid;
    }

    public Signature isValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }


    /**
     * Gets or sets the type of the digital signature.
    * @return signatureType
    **/
    @ApiModelProperty(value = "Gets or sets the type of the digital signature.")
    public String getSignatureType() {
        return signatureType;
    }

    public Signature signatureType(String signatureType) {
        this.signatureType = signatureType;
        return this;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }


    /**
     * Gets or sets an array of bytes representing a signature value as base64 string.
    * @return signatureValue
    **/
    @ApiModelProperty(value = "Gets or sets an array of bytes representing a signature value as base64 string.")
    public String getSignatureValue() {
        return signatureValue;
    }

    public Signature signatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
        return this;
    }

    public void setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
    }


    /**
     * Gets or sets the time the document was signed.
    * @return signTime
    **/
    @ApiModelProperty(value = "Gets or sets the time the document was signed.")
    public OffsetDateTime getSignTime() {
        return signTime;
    }

    public Signature signTime(OffsetDateTime signTime) {
        this.signTime = signTime;
        return this;
    }

    public void setSignTime(OffsetDateTime signTime) {
        this.signTime = signTime;
    }


    /**
     * Gets or sets the subject distinguished name of the certificate that was used to sign the document.
    * @return subjectName
    **/
    @ApiModelProperty(value = "Gets or sets the subject distinguished name of the certificate that was used to sign the document.")
    public String getSubjectName() {
        return subjectName;
    }

    public Signature subjectName(String subjectName) {
        this.subjectName = subjectName;
        return this;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


    public Signature() {
        this.comments = null;
        this.issuerName = null;
        this.isValid = null;
        this.signatureType = null;
        this.signatureValue = null;
        this.signTime = null;
        this.subjectName = null;
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
        if (this.isValid == null) {
            throw new ApiException(400, "Property IsValid in Signature is required.");
        }
        if (this.signTime == null) {
            throw new ApiException(400, "Property SignTime in Signature is required.");
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

        Signature signature = (Signature) o;
        return
            Objects.equals(this.comments, signature.comments) &&
            Objects.equals(this.issuerName, signature.issuerName) &&
            Objects.equals(this.isValid, signature.isValid) &&
            Objects.equals(this.signatureType, signature.signatureType) &&
            Objects.equals(this.signatureValue, signature.signatureValue) &&
            Objects.equals(this.signTime, signature.signTime) &&
            Objects.equals(this.subjectName, signature.subjectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, issuerName, isValid, signatureType, signatureValue, signTime, subjectName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    sb.append("    comments: ").append(toIndentedString(getComments())).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(getIssuerName())).append("\n");
    sb.append("    isValid: ").append(toIndentedString(getIsValid())).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(getSignatureType())).append("\n");
    sb.append("    signatureValue: ").append(toIndentedString(getSignatureValue())).append("\n");
    sb.append("    signTime: ").append(toIndentedString(getSignTime())).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(getSubjectName())).append("\n");
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
