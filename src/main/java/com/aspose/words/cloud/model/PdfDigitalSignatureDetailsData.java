/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PdfDigitalSignatureDetailsData.java">
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
 * Container class for details of digital signature.
 */
@ApiModel(description = "Container class for details of digital signature.")
public class PdfDigitalSignatureDetailsData {
    /**
     * Gets or sets the hash algorithm.
     */
    @JsonAdapter(HashAlgorithmEnum.Adapter.class)
    public enum HashAlgorithmEnum {
        SHA256("Sha256"),
        SHA384("Sha384"),
        SHA512("Sha512"),
        RIPEMD160("RipeMD160");

        private String value;

        HashAlgorithmEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static HashAlgorithmEnum fromValue(String text) {
            for (HashAlgorithmEnum b : HashAlgorithmEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< HashAlgorithmEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final HashAlgorithmEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public HashAlgorithmEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return HashAlgorithmEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("CertificateFilename")
    protected String certificateFilename;

    @SerializedName("HashAlgorithm")
    protected HashAlgorithmEnum hashAlgorithm;

    @SerializedName("Location")
    protected String location;

    @SerializedName("Reason")
    protected String reason;

    @SerializedName("SignatureDate")
    protected OffsetDateTime signatureDate;
    /**
     * Gets or sets the certificate's filename using for signing.
    * @return certificateFilename
    **/
    @ApiModelProperty(value = "Gets or sets the certificate's filename using for signing.")
    public String getCertificateFilename() {
        return certificateFilename;
    }

    public PdfDigitalSignatureDetailsData certificateFilename(String certificateFilename) {
        this.certificateFilename = certificateFilename;
        return this;
    }

    public void setCertificateFilename(String certificateFilename) {
        this.certificateFilename = certificateFilename;
    }


    /**
     * Gets or sets the hash algorithm.
    * @return hashAlgorithm
    **/
    @ApiModelProperty(value = "Gets or sets the hash algorithm.")
    public HashAlgorithmEnum getHashAlgorithm() {
        return hashAlgorithm;
    }

    public PdfDigitalSignatureDetailsData hashAlgorithm(HashAlgorithmEnum hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }

    public void setHashAlgorithm(HashAlgorithmEnum hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }


    /**
     * Gets or sets the location of the signing.
    * @return location
    **/
    @ApiModelProperty(value = "Gets or sets the location of the signing.")
    public String getLocation() {
        return location;
    }

    public PdfDigitalSignatureDetailsData location(String location) {
        this.location = location;
        return this;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    /**
     * Gets or sets the reason for the signing.
    * @return reason
    **/
    @ApiModelProperty(value = "Gets or sets the reason for the signing.")
    public String getReason() {
        return reason;
    }

    public PdfDigitalSignatureDetailsData reason(String reason) {
        this.reason = reason;
        return this;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    /**
     * Gets or sets the date of the signing.
    * @return signatureDate
    **/
    @ApiModelProperty(value = "Gets or sets the date of the signing.")
    public OffsetDateTime getSignatureDate() {
        return signatureDate;
    }

    public PdfDigitalSignatureDetailsData signatureDate(OffsetDateTime signatureDate) {
        this.signatureDate = signatureDate;
        return this;
    }

    public void setSignatureDate(OffsetDateTime signatureDate) {
        this.signatureDate = signatureDate;
    }


    public PdfDigitalSignatureDetailsData() {
        this.certificateFilename = null;
        this.hashAlgorithm = null;
        this.location = null;
        this.reason = null;
        this.signatureDate = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PdfDigitalSignatureDetailsData pdfDigitalSignatureDetailsData = (PdfDigitalSignatureDetailsData) o;
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
    sb.append("    certificateFilename: ").append(toIndentedString(getCertificateFilename())).append("\n");
    sb.append("    hashAlgorithm: ").append(toIndentedString(getHashAlgorithm())).append("\n");
    sb.append("    location: ").append(toIndentedString(getLocation())).append("\n");
    sb.append("    reason: ").append(toIndentedString(getReason())).append("\n");
    sb.append("    signatureDate: ").append(toIndentedString(getSignatureDate())).append("\n");
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
