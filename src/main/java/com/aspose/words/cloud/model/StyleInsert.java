/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StyleInsert.java">
 *   Copyright (c) 2021 Aspose.Words for Cloud
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
 * Represents a single document style to insert.
 */
@ApiModel(description = "Represents a single document style to insert.")
public class StyleInsert {
    /**
     * Gets or sets the StyleType value that specifies the type of the style to create.
     */
    @JsonAdapter(StyleTypeEnum.Adapter.class)
    public enum StyleTypeEnum {
        PARAGRAPH("Paragraph"),
        CHARACTER("Character"),
        TABLE("Table"),
        LIST("List");

        private String value;

        StyleTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StyleTypeEnum fromValue(String text) {
            for (StyleTypeEnum b : StyleTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< StyleTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final StyleTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StyleTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StyleTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("StyleName")
    private String styleName = null;

    @SerializedName("StyleType")
    private StyleTypeEnum styleType = null;
    public StyleInsert styleName(String styleName) {
        this.styleName = styleName;
        return this;
    }

    /**
     * Gets or sets the case sensitive name of the style to create.
    * @return styleName
    **/
    @ApiModelProperty(value = "Gets or sets the case sensitive name of the style to create.")
    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public StyleInsert styleType(StyleTypeEnum styleType) {
        this.styleType = styleType;
        return this;
    }

    /**
     * Gets or sets the StyleType value that specifies the type of the style to create.
    * @return styleType
    **/
    @ApiModelProperty(value = "Gets or sets the StyleType value that specifies the type of the style to create.")
    public StyleTypeEnum getStyleType() {
        return styleType;
    }

    public void setStyleType(StyleTypeEnum styleType) {
        this.styleType = styleType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StyleInsert styleInsert = (StyleInsert) o;
        return
            Objects.equals(this.styleName, styleInsert.styleName) &&
            Objects.equals(this.styleType, styleInsert.styleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(styleName, styleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StyleInsert {\n");
    sb.append("    styleName: ").append(toIndentedString(styleName)).append("\n");
    sb.append("    styleType: ").append(toIndentedString(styleType)).append("\n");
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
