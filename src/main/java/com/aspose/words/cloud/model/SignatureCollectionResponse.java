/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SignatureCollectionResponse.java">
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
 * The REST response with a document signature collection.
 * This response is returned by the Service when handling any "https://api.aspose.cloud/v4.0/words/Test.doc/signatures" REST API requests.
 */
@ApiModel(description = "The REST response with a document signature collection. This response is returned by the Service when handling any \"https://api.aspose.cloud/v4.0/words/Test.doc/signatures\" REST API requests.")
public class SignatureCollectionResponse extends WordsResponse {
    @SerializedName("IsValid")
    protected Boolean isValid;

    @SerializedName("Signatures")
    protected List<Signature> signatures;
    /**
     * Gets or sets a value indicating whether all signatures are valid. Returns true if there is no signatures.
    * @return isValid
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether all signatures are valid. Returns true if there is no signatures.")
    public Boolean getIsValid() {
        return isValid;
    }

    public SignatureCollectionResponse isValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }


    /**
     * Gets or sets signatures.
    * @return signatures
    **/
    @ApiModelProperty(value = "Gets or sets signatures.")
    public List<Signature> getSignatures() {
        return signatures;
    }

    public SignatureCollectionResponse signatures(List<Signature> signatures) {
        this.signatures = signatures;
        return this;
    }

    public SignatureCollectionResponse addSignaturesItem(Signature signaturesItem) {
        if (this.signatures == null) {
            this.signatures = new ArrayList<Signature>();
        }
        this.signatures.add(signaturesItem);
        return this;
    }


    public void setSignatures(List<Signature> signatures) {
        this.signatures = signatures;
    }


    public SignatureCollectionResponse() {
        super();
        this.isValid = null;
        this.signatures = null;
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
        if (this.isValid == null) {
            throw new ApiException(400, "Property IsValid in SignatureCollectionResponse is required.");
        }

        if (this.signatures != null) {
            for (ModelIfc elementSignatures : this.signatures) {
                if (elementSignatures != null) {
                    elementSignatures.validate();
                }
            }
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

        SignatureCollectionResponse signatureCollectionResponse = (SignatureCollectionResponse) o;
        return
            Objects.equals(this.isValid, signatureCollectionResponse.isValid) &&
            Objects.equals(this.signatures, signatureCollectionResponse.signatures) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, signatures, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureCollectionResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(getRequestId())).append("\n");
    sb.append("    isValid: ").append(toIndentedString(getIsValid())).append("\n");
    sb.append("    signatures: ").append(toIndentedString(getSignatures())).append("\n");
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
