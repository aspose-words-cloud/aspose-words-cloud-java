/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ApiError.java">
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
 * Api error.
 */
@ApiModel(description = "Api error.")
public class ApiError {
    @SerializedName("Code")
    protected String code;

    @SerializedName("DateTime")
    protected OffsetDateTime dateTime;

    @SerializedName("Description")
    protected String description;

    @SerializedName("InnerError")
    protected ApiError innerError;

    @SerializedName("Message")
    protected String message;
    /**
     * Gets or sets the API error code.
    * @return code
    **/
    @ApiModelProperty(value = "Gets or sets the API error code.")
    public String getCode() {
        return code;
    }

    public ApiError code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Gets or sets the server DateTime.
    * @return dateTime
    **/
    @ApiModelProperty(value = "Gets or sets the server DateTime.")
    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public ApiError dateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets or sets the error description.
    * @return description
    **/
    @ApiModelProperty(value = "Gets or sets the error description.")
    public String getDescription() {
        return description;
    }

    public ApiError description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets or sets the inner error.
    * @return innerError
    **/
    @ApiModelProperty(value = "Gets or sets the inner error.")
    public ApiError getInnerError() {
        return innerError;
    }

    public ApiError innerError(ApiError innerError) {
        this.innerError = innerError;
        return this;
    }

    public void setInnerError(ApiError innerError) {
        this.innerError = innerError;
    }


    /**
     * Gets or sets the error message.
    * @return message
    **/
    @ApiModelProperty(value = "Gets or sets the error message.")
    public String getMessage() {
        return message;
    }

    public ApiError message(String message) {
        this.message = message;
        return this;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public ApiError() {
        this.code = null;
        this.dateTime = null;
        this.description = null;
        this.innerError = null;
        this.message = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ApiError apiError = (ApiError) o;
        return
            Objects.equals(this.code, apiError.code) &&
            Objects.equals(this.dateTime, apiError.dateTime) &&
            Objects.equals(this.description, apiError.description) &&
            Objects.equals(this.innerError, apiError.innerError) &&
            Objects.equals(this.message, apiError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, dateTime, description, innerError, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    sb.append("    code: ").append(toIndentedString(getCode())).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(getDateTime())).append("\n");
    sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
    sb.append("    innerError: ").append(toIndentedString(getInnerError())).append("\n");
    sb.append("    message: ").append(toIndentedString(getMessage())).append("\n");
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
