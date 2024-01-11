/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StyleUpdate.java">
 *   Copyright (c) 2024 Aspose.Words for Cloud
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
 * Represents a single document style properties to update.
 */
@ApiModel(description = "Represents a single document style properties to update.")
public class StyleUpdate implements ModelIfc {
    @SerializedName("NextParagraphStyleName")
    protected String nextParagraphStyleName;

    @SerializedName("BaseStyleName")
    protected String baseStyleName;

    @SerializedName("IsQuickStyle")
    protected Boolean isQuickStyle;

    @SerializedName("Name")
    protected String name;
    /**
     * Gets or sets the name of the style to be applied automatically to a new paragraph inserted after a paragraph formatted with the specified style.
     * This property is not used by Aspose.Words. The next paragraph style will only be applied automatically when you edit the document in MS Word.
    * @return nextParagraphStyleName
    **/
    @ApiModelProperty(value = "Gets or sets the name of the style to be applied automatically to a new paragraph inserted after a paragraph formatted with the specified style. This property is not used by Aspose.Words. The next paragraph style will only be applied automatically when you edit the document in MS Word.")
    public String getNextParagraphStyleName() {
        return nextParagraphStyleName;
    }

    public StyleUpdate nextParagraphStyleName(String nextParagraphStyleName) {
        this.nextParagraphStyleName = nextParagraphStyleName;
        return this;
    }

    public void setNextParagraphStyleName(String nextParagraphStyleName) {
        this.nextParagraphStyleName = nextParagraphStyleName;
    }


    /**
     * Gets or sets the name of the style this style is based on.
     * This will be an empty string if the style is not based on any other style and it can be set to an empty string.
    * @return baseStyleName
    **/
    @ApiModelProperty(value = "Gets or sets the name of the style this style is based on. This will be an empty string if the style is not based on any other style and it can be set to an empty string.")
    public String getBaseStyleName() {
        return baseStyleName;
    }

    public StyleUpdate baseStyleName(String baseStyleName) {
        this.baseStyleName = baseStyleName;
        return this;
    }

    public void setBaseStyleName(String baseStyleName) {
        this.baseStyleName = baseStyleName;
    }


    /**
     * Gets or sets a value indicating whether this style is shown in the Quick Style gallery inside MS Word UI.
    * @return isQuickStyle
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this style is shown in the Quick Style gallery inside MS Word UI.")
    public Boolean getIsQuickStyle() {
        return isQuickStyle;
    }

    public StyleUpdate isQuickStyle(Boolean isQuickStyle) {
        this.isQuickStyle = isQuickStyle;
        return this;
    }

    public void setIsQuickStyle(Boolean isQuickStyle) {
        this.isQuickStyle = isQuickStyle;
    }


    /**
     * Gets or sets the name of the style.
     * Can not be empty string. If there already is a style with such name in the collection, than this style will override it. All affected nodes will reference new style.
    * @return name
    **/
    @ApiModelProperty(value = "Gets or sets the name of the style. Can not be empty string. If there already is a style with such name in the collection, than this style will override it. All affected nodes will reference new style.")
    public String getName() {
        return name;
    }

    public StyleUpdate name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }


    public StyleUpdate() {
        this.nextParagraphStyleName = null;
        this.baseStyleName = null;
        this.isQuickStyle = null;
        this.name = null;
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
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StyleUpdate styleUpdate = (StyleUpdate) o;
        return
            Objects.equals(this.nextParagraphStyleName, styleUpdate.nextParagraphStyleName) &&
            Objects.equals(this.baseStyleName, styleUpdate.baseStyleName) &&
            Objects.equals(this.isQuickStyle, styleUpdate.isQuickStyle) &&
            Objects.equals(this.name, styleUpdate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextParagraphStyleName, baseStyleName, isQuickStyle, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StyleUpdate {\n");
    sb.append("    nextParagraphStyleName: ").append(toIndentedString(getNextParagraphStyleName())).append("\n");
    sb.append("    baseStyleName: ").append(toIndentedString(getBaseStyleName())).append("\n");
    sb.append("    isQuickStyle: ").append(toIndentedString(getIsQuickStyle())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
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
