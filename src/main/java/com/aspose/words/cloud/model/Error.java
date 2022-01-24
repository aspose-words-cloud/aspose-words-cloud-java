/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Error.java">
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
 * Error.
 */
@ApiModel(description = "Error.")
public class Error {
    @SerializedName("Code")
    protected String code;

    @SerializedName("Description")
    protected String description;

    @SerializedName("InnerError")
    protected ErrorDetails innerError;

    @SerializedName("Message")
    protected String message;
    /**
     * Code.
    * @return code
    **/
    @ApiModelProperty(value = "Code.")
    public String getCode() {
        return code;
    }

    public Error code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }


    /**
     * Description.
    * @return description
    **/
    @ApiModelProperty(value = "Description.")
    public String getDescription() {
        return description;
    }

    public Error description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Inner Error.
    * @return innerError
    **/
    @ApiModelProperty(value = "Inner Error.")
    public ErrorDetails getInnerError() {
        return innerError;
    }

    public Error innerError(ErrorDetails innerError) {
        this.innerError = innerError;
        return this;
    }

    public void setInnerError(ErrorDetails innerError) {
        this.innerError = innerError;
    }


    /**
     * Message.
    * @return message
    **/
    @ApiModelProperty(value = "Message.")
    public String getMessage() {
        return message;
    }

    public Error message(String message) {
        this.message = message;
        return this;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Error() {
        this.code = null;
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

        Error error = (Error) o;
        return
            Objects.equals(this.code, error.code) &&
            Objects.equals(this.description, error.description) &&
            Objects.equals(this.innerError, error.innerError) &&
            Objects.equals(this.message, error.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, innerError, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    code: ").append(toIndentedString(getCode())).append("\n");
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
