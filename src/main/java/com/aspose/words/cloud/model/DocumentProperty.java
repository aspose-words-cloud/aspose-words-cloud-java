/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DocumentProperty.java">
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
 * Words document property DTO.
 */
@ApiModel(description = "Words document property DTO.")
public class DocumentProperty extends LinkElement {
    @SerializedName("Name")
    protected String name;

    @SerializedName("Value")
    protected String value;

    @SerializedName("BuiltIn")
    protected Boolean builtIn;
    /**
     * Gets or sets the name of the document property.
    * @return name
    **/
    @ApiModelProperty(value = "Gets or sets the name of the document property.")
    public String getName() {
        return name;
    }

    public DocumentProperty name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets or sets the value of the document property.
    * @return value
    **/
    @ApiModelProperty(value = "Gets or sets the value of the document property.")
    public String getValue() {
        return value;
    }

    public DocumentProperty value(String value) {
        this.value = value;
        return this;
    }

    public void setValue(String value) {
        this.value = value;
    }


    /**
     * Gets or sets a value indicating whether the property is built-in or not.
     * If true the property is built-in, if false the property is custom.
    * @return builtIn
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the property is built-in or not. If true the property is built-in, if false the property is custom.")
    public Boolean getBuiltIn() {
        return builtIn;
    }

    public DocumentProperty builtIn(Boolean builtIn) {
        this.builtIn = builtIn;
        return this;
    }

    public void setBuiltIn(Boolean builtIn) {
        this.builtIn = builtIn;
    }


    public DocumentProperty() {
        super();
        this.name = null;
        this.value = null;
        this.builtIn = null;
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
        if (this.builtIn == null) {
            throw new ApiException(400, "Property BuiltIn in DocumentProperty is required.");
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

        DocumentProperty documentProperty = (DocumentProperty) o;
        return
            Objects.equals(this.name, documentProperty.name) &&
            Objects.equals(this.value, documentProperty.value) &&
            Objects.equals(this.builtIn, documentProperty.builtIn) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, builtIn, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentProperty {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
    sb.append("    builtIn: ").append(toIndentedString(getBuiltIn())).append("\n");
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
