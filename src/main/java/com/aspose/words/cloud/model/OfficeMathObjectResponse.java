/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OfficeMathObjectResponse.java">
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
 * The REST response with a OfficeMath object.
 * This response is returned by the Service when handling "GET https://api.aspose.cloud/v4.0/words/Test.doc/officeMathObjects/0" REST API requests.
 */
@ApiModel(description = "The REST response with a OfficeMath object. This response is returned by the Service when handling \"GET https://api.aspose.cloud/v4.0/words/Test.doc/officeMathObjects/0\" REST API requests.")
public class OfficeMathObjectResponse extends WordsResponse {
    @SerializedName("OfficeMathObject")
    protected OfficeMathObject officeMathObject;
    /**
     * Gets or sets the OfficeMath object.
    * @return officeMathObject
    **/
    @ApiModelProperty(value = "Gets or sets the OfficeMath object.")
    public OfficeMathObject getOfficeMathObject() {
        return officeMathObject;
    }

    public OfficeMathObjectResponse officeMathObject(OfficeMathObject officeMathObject) {
        this.officeMathObject = officeMathObject;
        return this;
    }

    public void setOfficeMathObject(OfficeMathObject officeMathObject) {
        this.officeMathObject = officeMathObject;
    }


    public OfficeMathObjectResponse() {
        super();
        this.officeMathObject = null;
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

        if (this.officeMathObject != null) {
            this.officeMathObject.validate();
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

        OfficeMathObjectResponse officeMathObjectResponse = (OfficeMathObjectResponse) o;
        return
            Objects.equals(this.officeMathObject, officeMathObjectResponse.officeMathObject) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeMathObject, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfficeMathObjectResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(getRequestId())).append("\n");
    sb.append("    officeMathObject: ").append(toIndentedString(getOfficeMathObject())).append("\n");
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
