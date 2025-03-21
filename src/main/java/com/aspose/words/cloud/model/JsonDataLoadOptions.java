/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="JsonDataLoadOptions.java">
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
 * Represents options for parsing JSON data.
 * An instance of this class can be passed into constructors of Aspose.Words.Reporting.JsonDataSource.
 */
@ApiModel(description = "Represents options for parsing JSON data. An instance of this class can be passed into constructors of Aspose.Words.Reporting.JsonDataSource.")
public class JsonDataLoadOptions implements ModelIfc {
    /**
     * Gets or sets a mode for parsing JSON simple values (null, boolean, number, integer,
     * and string) while loading JSON. Such a mode does not affect parsing of date-time
     * values. The default is Aspose.Words.Reporting.JsonSimpleValueParseMode.Loose.
     */
    @JsonAdapter(SimpleValueParseModeEnum.Adapter.class)
    public enum SimpleValueParseModeEnum {
        LOOSE("Loose"),
        STRICT("Strict");

        private String value;

        SimpleValueParseModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SimpleValueParseModeEnum fromValue(String text) {
            for (SimpleValueParseModeEnum b : SimpleValueParseModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< SimpleValueParseModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final SimpleValueParseModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SimpleValueParseModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SimpleValueParseModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("AlwaysGenerateRootObject")
    protected Boolean alwaysGenerateRootObject;

    @SerializedName("ExactDateTimeParseFormats")
    protected List<String> exactDateTimeParseFormats;

    @SerializedName("SimpleValueParseMode")
    protected SimpleValueParseModeEnum simpleValueParseMode;
    /**
     * Gets or sets a value indicating whether a generated data source will always contain
     * an object for a JSON root element. If a JSON root element contains a single complex
     * property, such an object is not created by default.
     * The default value is false.
    * @return alwaysGenerateRootObject
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether a generated data source will always contain an object for a JSON root element. If a JSON root element contains a single complex property, such an object is not created by default. The default value is false.")
    public Boolean getAlwaysGenerateRootObject() {
        return alwaysGenerateRootObject;
    }

    public JsonDataLoadOptions alwaysGenerateRootObject(Boolean alwaysGenerateRootObject) {
        this.alwaysGenerateRootObject = alwaysGenerateRootObject;
        return this;
    }

    public void setAlwaysGenerateRootObject(Boolean alwaysGenerateRootObject) {
        this.alwaysGenerateRootObject = alwaysGenerateRootObject;
    }


    /**
     * Gets or sets exact formats for parsing JSON date-time values while loading JSON.
     * The default is null.
     * Strings encoded using Microsoft® JSON date-time format (for example, "/Date(1224043200000)/")
     * are always recognized as date-time values regardless of a value of this property.
     * The property defines additional formats to be used while parsing date-time values
     * from strings in the following way:
     * • When Aspose.Words.Reporting.JsonDataLoadOptions.ExactDateTimeParseFormats is
     * null, the ISO-8601 format and all date-time formats supported for the current,
     * English USA, and English New Zealand cultures are used additionally in the mentioned
     * order.
     * • When Aspose.Words.Reporting.JsonDataLoadOptions.ExactDateTimeParseFormats contains
     * strings, they are used as additional date-time formats utilizing the current
     * culture.
     * • When Aspose.Words.Reporting.JsonDataLoadOptions.ExactDateTimeParseFormats is
     * empty, no additional date-time formats are used.
    * @return exactDateTimeParseFormats
    **/
    @ApiModelProperty(value = "Gets or sets exact formats for parsing JSON date-time values while loading JSON. The default is null. Strings encoded using Microsoft® JSON date-time format (for example, \"/Date(1224043200000)/\") are always recognized as date-time values regardless of a value of this property. The property defines additional formats to be used while parsing date-time values from strings in the following way: • When Aspose.Words.Reporting.JsonDataLoadOptions.ExactDateTimeParseFormats is null, the ISO-8601 format and all date-time formats supported for the current, English USA, and English New Zealand cultures are used additionally in the mentioned order. • When Aspose.Words.Reporting.JsonDataLoadOptions.ExactDateTimeParseFormats contains strings, they are used as additional date-time formats utilizing the current culture. • When Aspose.Words.Reporting.JsonDataLoadOptions.ExactDateTimeParseFormats is empty, no additional date-time formats are used.")
    public List<String> getExactDateTimeParseFormats() {
        return exactDateTimeParseFormats;
    }

    public JsonDataLoadOptions exactDateTimeParseFormats(List<String> exactDateTimeParseFormats) {
        this.exactDateTimeParseFormats = exactDateTimeParseFormats;
        return this;
    }

    public JsonDataLoadOptions addExactDateTimeParseFormatsItem(String exactDateTimeParseFormatsItem) {
        if (this.exactDateTimeParseFormats == null) {
            this.exactDateTimeParseFormats = new ArrayList<String>();
        }
        this.exactDateTimeParseFormats.add(exactDateTimeParseFormatsItem);
        return this;
    }


    public void setExactDateTimeParseFormats(List<String> exactDateTimeParseFormats) {
        this.exactDateTimeParseFormats = exactDateTimeParseFormats;
    }


    /**
     * Gets or sets a mode for parsing JSON simple values (null, boolean, number, integer,
     * and string) while loading JSON. Such a mode does not affect parsing of date-time
     * values. The default is Aspose.Words.Reporting.JsonSimpleValueParseMode.Loose.
    * @return simpleValueParseMode
    **/
    @ApiModelProperty(value = "Gets or sets a mode for parsing JSON simple values (null, boolean, number, integer, and string) while loading JSON. Such a mode does not affect parsing of date-time values. The default is Aspose.Words.Reporting.JsonSimpleValueParseMode.Loose.")
    public SimpleValueParseModeEnum getSimpleValueParseMode() {
        return simpleValueParseMode;
    }

    public JsonDataLoadOptions simpleValueParseMode(SimpleValueParseModeEnum simpleValueParseMode) {
        this.simpleValueParseMode = simpleValueParseMode;
        return this;
    }

    public void setSimpleValueParseMode(SimpleValueParseModeEnum simpleValueParseMode) {
        this.simpleValueParseMode = simpleValueParseMode;
    }


    public JsonDataLoadOptions() {
        this.alwaysGenerateRootObject = null;
        this.exactDateTimeParseFormats = null;
        this.simpleValueParseMode = null;
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
        if (this.alwaysGenerateRootObject == null) {
            throw new ApiException(400, "Property AlwaysGenerateRootObject in JsonDataLoadOptions is required.");
        }
        if (this.simpleValueParseMode == null) {
            throw new ApiException(400, "Property SimpleValueParseMode in JsonDataLoadOptions is required.");
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

        JsonDataLoadOptions jsonDataLoadOptions = (JsonDataLoadOptions) o;
        return
            Objects.equals(this.alwaysGenerateRootObject, jsonDataLoadOptions.alwaysGenerateRootObject) &&
            Objects.equals(this.exactDateTimeParseFormats, jsonDataLoadOptions.exactDateTimeParseFormats) &&
            Objects.equals(this.simpleValueParseMode, jsonDataLoadOptions.simpleValueParseMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alwaysGenerateRootObject, exactDateTimeParseFormats, simpleValueParseMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonDataLoadOptions {\n");
    sb.append("    alwaysGenerateRootObject: ").append(toIndentedString(getAlwaysGenerateRootObject())).append("\n");
    sb.append("    exactDateTimeParseFormats: ").append(toIndentedString(getExactDateTimeParseFormats())).append("\n");
    sb.append("    simpleValueParseMode: ").append(toIndentedString(getSimpleValueParseMode())).append("\n");
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
