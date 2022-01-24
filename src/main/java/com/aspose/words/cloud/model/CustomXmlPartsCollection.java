/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CustomXmlPartsCollection.java">
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
 * The collection of CustomXmlPart.
 */
@ApiModel(description = "The collection of CustomXmlPart.")
public class CustomXmlPartsCollection extends LinkElement {
    @SerializedName("CustomXmlPartsList")
    protected List<CustomXmlPart> customXmlPartsList;
    /**
     * Gets or sets the collection of CustomXmlPart.
    * @return customXmlPartsList
    **/
    @ApiModelProperty(value = "Gets or sets the collection of CustomXmlPart.")
    public List<CustomXmlPart> getCustomXmlPartsList() {
        return customXmlPartsList;
    }

    public CustomXmlPartsCollection customXmlPartsList(List<CustomXmlPart> customXmlPartsList) {
        this.customXmlPartsList = customXmlPartsList;
        return this;
    }

    public CustomXmlPartsCollection addCustomXmlPartsListItem(CustomXmlPart customXmlPartsListItem) {
        if (this.customXmlPartsList == null) {
            this.customXmlPartsList = new ArrayList<CustomXmlPart>();
        }
        this.customXmlPartsList.add(customXmlPartsListItem);
        return this;
    }


    public void setCustomXmlPartsList(List<CustomXmlPart> customXmlPartsList) {
        this.customXmlPartsList = customXmlPartsList;
    }


    public CustomXmlPartsCollection() {
        super();
        this.customXmlPartsList = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CustomXmlPartsCollection customXmlPartsCollection = (CustomXmlPartsCollection) o;
        return
            Objects.equals(this.customXmlPartsList, customXmlPartsCollection.customXmlPartsList) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customXmlPartsList, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomXmlPartsCollection {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    customXmlPartsList: ").append(toIndentedString(getCustomXmlPartsList())).append("\n");
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
