/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PdfDigitalSignatureDetailsData.java">
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
 * container class for details of digital signature.
 */
@ApiModel(description = "container class for details of digital signature.")
public class PdfDigitalSignatureDetailsData {
    @SerializedName("CertificateFilename")
    private String certificateFilename = null;

    @SerializedName("HashAlgorithm")
    private String hashAlgorithm = null;

    @SerializedName("Location")
    private String location = null;

    @SerializedName("Reason")
    private String reason = null;

    @SerializedName("SignatureDate")
    private OffsetDateTime signatureDate = null;
    public PdfDigitalSignatureDetailsData certificateFilename(String certificateFilename) {
        this.certificateFilename = certificateFilename;
        return this;
    }

    /**
     * Gets or sets certificate's filename using for signing.
    * @return certificateFilename
    **/
    @ApiModelProperty(value = "Gets or sets certificate's filename using for signing.")
    public String getCertificateFilename() {
        return certificateFilename;
    }

    public void setCertificateFilename(String certificateFilename) {
        this.certificateFilename = certificateFilename;
    }

    public PdfDigitalSignatureDetailsData hashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }

    /**
     * Gets or sets hash algorithm.
    * @return hashAlgorithm
    **/
    @ApiModelProperty(value = "Gets or sets hash algorithm.")
    public String getHashAlgorithm() {
        return hashAlgorithm;
    }

    public void setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    public PdfDigitalSignatureDetailsData location(String location) {
        this.location = location;
        return this;
    }

    /**
     * Gets or sets location of the signing.
    * @return location
    **/
    @ApiModelProperty(value = "Gets or sets location of the signing.")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public PdfDigitalSignatureDetailsData reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Gets or sets reason for the signing.
    * @return reason
    **/
    @ApiModelProperty(value = "Gets or sets reason for the signing.")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public PdfDigitalSignatureDetailsData signatureDate(OffsetDateTime signatureDate) {
        this.signatureDate = signatureDate;
        return this;
    }

    /**
     * Gets or sets date of the signing.
    * @return signatureDate
    **/
    @ApiModelProperty(value = "Gets or sets date of the signing.")
    public OffsetDateTime getSignatureDate() {
        return signatureDate;
    }

    public void setSignatureDate(OffsetDateTime signatureDate) {
        this.signatureDate = signatureDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    PdfDigitalSignatureDetailsData pdfDigitalSignatureDetailsData = (PdfDigitalSignatureDetailsData)o;
    return
        Objects.equals(this.certificateFilename, pdfDigitalSignatureDetailsData.certificateFilename) &&
        Objects.equals(this.hashAlgorithm, pdfDigitalSignatureDetailsData.hashAlgorithm) &&
        Objects.equals(this.location, pdfDigitalSignatureDetailsData.location) &&
        Objects.equals(this.reason, pdfDigitalSignatureDetailsData.reason) &&
        Objects.equals(this.signatureDate, pdfDigitalSignatureDetailsData.signatureDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateFilename, hashAlgorithm, location, reason, signatureDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfDigitalSignatureDetailsData {\n");
    sb.append("    certificateFilename: ").append(toIndentedString(certificateFilename)).append("\n");
    sb.append("    hashAlgorithm: ").append(toIndentedString(hashAlgorithm)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    signatureDate: ").append(toIndentedString(signatureDate)).append("\n");
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
