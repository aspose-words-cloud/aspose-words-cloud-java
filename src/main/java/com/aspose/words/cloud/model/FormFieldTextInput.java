/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FormFieldTextInput.java">
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
 * FormField text input element.
 */
@ApiModel(description = "FormField text input element.")
public class FormFieldTextInput extends FormField {
    /**
     * Gets or sets the type of the text form field.
     */
    @JsonAdapter(TextInputTypeEnum.Adapter.class)
    public enum TextInputTypeEnum {
        REGULAR("Regular"),
        NUMBER("Number"),
        DATE("Date"),
        CURRENTDATE("CurrentDate"),
        CURRENTTIME("CurrentTime"),
        CALCULATED("Calculated");

        private String value;

        TextInputTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TextInputTypeEnum fromValue(String text) {
            for (TextInputTypeEnum b : TextInputTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TextInputTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TextInputTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TextInputTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TextInputTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("MaxLength")
    private Integer maxLength = null;

    @SerializedName("TextInputDefault")
    private String textInputDefault = null;

    @SerializedName("TextInputFormat")
    private String textInputFormat = null;

    @SerializedName("TextInputType")
    private TextInputTypeEnum textInputType = null;
    public FormFieldTextInput maxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * Gets or sets the maximum length for the text field. Zero when the length is not limited.
    * @return maxLength
    **/
    @ApiModelProperty(value = "Gets or sets the maximum length for the text field. Zero when the length is not limited.")
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public FormFieldTextInput textInputDefault(String textInputDefault) {
        this.textInputDefault = textInputDefault;
        return this;
    }

    /**
     * Gets or sets the default string or a calculation expression of the text form field.
    * @return textInputDefault
    **/
    @ApiModelProperty(value = "Gets or sets the default string or a calculation expression of the text form field.")
    public String getTextInputDefault() {
        return textInputDefault;
    }

    public void setTextInputDefault(String textInputDefault) {
        this.textInputDefault = textInputDefault;
    }

    public FormFieldTextInput textInputFormat(String textInputFormat) {
        this.textInputFormat = textInputFormat;
        return this;
    }

    /**
     * Gets or sets text formatting for the text form field.
    * @return textInputFormat
    **/
    @ApiModelProperty(value = "Gets or sets text formatting for the text form field.")
    public String getTextInputFormat() {
        return textInputFormat;
    }

    public void setTextInputFormat(String textInputFormat) {
        this.textInputFormat = textInputFormat;
    }

    public FormFieldTextInput textInputType(TextInputTypeEnum textInputType) {
        this.textInputType = textInputType;
        return this;
    }

    /**
     * Gets or sets the type of the text form field.
    * @return textInputType
    **/
    @ApiModelProperty(value = "Gets or sets the type of the text form field.")
    public TextInputTypeEnum getTextInputType() {
        return textInputType;
    }

    public void setTextInputType(TextInputTypeEnum textInputType) {
        this.textInputType = textInputType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FormFieldTextInput formFieldTextInput = (FormFieldTextInput) o;
        return
            Objects.equals(this.maxLength, formFieldTextInput.maxLength) &&
            Objects.equals(this.textInputDefault, formFieldTextInput.textInputDefault) &&
            Objects.equals(this.textInputFormat, formFieldTextInput.textInputFormat) &&
            Objects.equals(this.textInputType, formFieldTextInput.textInputType) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxLength, textInputDefault, textInputFormat, textInputType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldTextInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    textInputDefault: ").append(toIndentedString(textInputDefault)).append("\n");
    sb.append("    textInputFormat: ").append(toIndentedString(textInputFormat)).append("\n");
    sb.append("    textInputType: ").append(toIndentedString(textInputType)).append("\n");
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
