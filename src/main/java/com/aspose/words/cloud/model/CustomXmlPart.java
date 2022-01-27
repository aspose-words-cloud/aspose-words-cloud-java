/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CustomXmlPart.java">
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
 * DTO container with a CustomXmlPart.
 */
@ApiModel(description = "DTO container with a CustomXmlPart.")
public class CustomXmlPart extends CustomXmlPartLink {
    @SerializedName("Data")
    protected String data;

    @SerializedName("Id")
    protected String id;
    /**
     * Gets or sets the custom xml part data.
    * @return data
    **/
    @ApiModelProperty(value = "Gets or sets the custom xml part data.")
    public String getData() {
        return data;
    }

    public CustomXmlPart data(String data) {
        this.data = data;
        return this;
    }

    public void setData(String data) {
        this.data = data;
    }


    /**
     * Gets or sets the custom xml part id.
    * @return id
    **/
    @ApiModelProperty(value = "Gets or sets the custom xml part id.")
    public String getId() {
        return id;
    }

    public CustomXmlPart id(String id) {
        this.id = id;
        return this;
    }

    public void setId(String id) {
        this.id = id;
    }


    public CustomXmlPart() {
        super();
        this.data = null;
        this.id = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CustomXmlPart customXmlPart = (CustomXmlPart) o;
        return
            Objects.equals(this.data, customXmlPart.data) &&
            Objects.equals(this.id, customXmlPart.id) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, id, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomXmlPart {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    data: ").append(toIndentedString(getData())).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
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
