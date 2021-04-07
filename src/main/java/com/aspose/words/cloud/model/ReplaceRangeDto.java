/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReplaceRangeDto.java">
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
 * DTO container with a range element.
 */
@ApiModel(description = "DTO container with a range element.")
public class ReplaceRangeDto {
    /**
     * Gets or sets the range's text type.
     */
    @JsonAdapter(TextTypeEnum.Adapter.class)
    public enum TextTypeEnum {
        TEXT("Text"),
        HTML("Html");

        private String value;

        TextTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TextTypeEnum fromValue(String text) {
            for (TextTypeEnum b : TextTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TextTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TextTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TextTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TextTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Text")
    private String text = null;

    @SerializedName("TextType")
    private TextTypeEnum textType = null;
    public ReplaceRangeDto text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Gets or sets the range's text.
    * @return text
    **/
    @ApiModelProperty(value = "Gets or sets the range's text.")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ReplaceRangeDto textType(TextTypeEnum textType) {
        this.textType = textType;
        return this;
    }

    /**
     * Gets or sets the range's text type.
    * @return textType
    **/
    @ApiModelProperty(value = "Gets or sets the range's text type.")
    public TextTypeEnum getTextType() {
        return textType;
    }

    public void setTextType(TextTypeEnum textType) {
        this.textType = textType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReplaceRangeDto replaceRangeDto = (ReplaceRangeDto) o;
        return
            Objects.equals(this.text, replaceRangeDto.text) &&
            Objects.equals(this.textType, replaceRangeDto.textType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, textType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceRangeDto {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    textType: ").append(toIndentedString(textType)).append("\n");
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
