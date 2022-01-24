/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="XmlDataLoadOptions.java">
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
 * Represents options for XML data loading.
 */
@ApiModel(description = "Represents options for XML data loading.")
public class XmlDataLoadOptions {
    @SerializedName("AlwaysGenerateRootObject")
    protected Boolean alwaysGenerateRootObject;
    /**
     * Gets or sets a flag indicating whether a generated data source will always contain an object for an XML root
     * element. If an XML root element has no attributes and all its child elements have same names, such an object
     * is not created by default.
    * @return alwaysGenerateRootObject
    **/
    @ApiModelProperty(value = "Gets or sets a flag indicating whether a generated data source will always contain an object for an XML root element. If an XML root element has no attributes and all its child elements have same names, such an object is not created by default.")
    public Boolean getAlwaysGenerateRootObject() {
        return alwaysGenerateRootObject;
    }

    public XmlDataLoadOptions alwaysGenerateRootObject(Boolean alwaysGenerateRootObject) {
        this.alwaysGenerateRootObject = alwaysGenerateRootObject;
        return this;
    }

    public void setAlwaysGenerateRootObject(Boolean alwaysGenerateRootObject) {
        this.alwaysGenerateRootObject = alwaysGenerateRootObject;
    }


    public XmlDataLoadOptions() {
        this.alwaysGenerateRootObject = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        XmlDataLoadOptions xmlDataLoadOptions = (XmlDataLoadOptions) o;
        return
            Objects.equals(this.alwaysGenerateRootObject, xmlDataLoadOptions.alwaysGenerateRootObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alwaysGenerateRootObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlDataLoadOptions {\n");
    sb.append("    alwaysGenerateRootObject: ").append(toIndentedString(getAlwaysGenerateRootObject())).append("\n");
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
