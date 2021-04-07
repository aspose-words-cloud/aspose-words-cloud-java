/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OdtSaveOptionsData.java">
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
 * Container class for odt/ott save options.
 */
@ApiModel(description = "Container class for odt/ott save options.")
public class OdtSaveOptionsData extends SaveOptionsData {
    /**
     * Gets or sets the units of measure to apply to document content. The default value is Aspose.Words.Saving.OdtSaveMeasureUnit.Centimeters.
     * Open Office uses centimeters when specifying lengths, widths and other measurable formatting and content properties in documents whereas MS Office uses inches.
     */
    @JsonAdapter(MeasureUnitEnum.Adapter.class)
    public enum MeasureUnitEnum {
        CENTIMETERS("Centimeters"),
        INCHES("Inches");

        private String value;

        MeasureUnitEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MeasureUnitEnum fromValue(String text) {
            for (MeasureUnitEnum b : MeasureUnitEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< MeasureUnitEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final MeasureUnitEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MeasureUnitEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MeasureUnitEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("IsStrictSchema11")
    private Boolean isStrictSchema11 = null;

    @SerializedName("MeasureUnit")
    private MeasureUnitEnum measureUnit = null;

    @SerializedName("Password")
    private String password = null;

    @SerializedName("PrettyFormat")
    private Boolean prettyFormat = null;
    public OdtSaveOptionsData isStrictSchema11(Boolean isStrictSchema11) {
        this.isStrictSchema11 = isStrictSchema11;
        return this;
    }

    /**
     * Gets or sets a value indicating whether export should correspond to ODT specification 1.1 strictly.
    * @return isStrictSchema11
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether export should correspond to ODT specification 1.1 strictly.")
    public Boolean getIsStrictSchema11() {
        return isStrictSchema11;
    }

    public void setIsStrictSchema11(Boolean isStrictSchema11) {
        this.isStrictSchema11 = isStrictSchema11;
    }

    public OdtSaveOptionsData measureUnit(MeasureUnitEnum measureUnit) {
        this.measureUnit = measureUnit;
        return this;
    }

    /**
     * Gets or sets the units of measure to apply to document content. The default value is Aspose.Words.Saving.OdtSaveMeasureUnit.Centimeters.
     * Open Office uses centimeters when specifying lengths, widths and other measurable formatting and content properties in documents whereas MS Office uses inches.
    * @return measureUnit
    **/
    @ApiModelProperty(value = "Gets or sets the units of measure to apply to document content. The default value is Aspose.Words.Saving.OdtSaveMeasureUnit.Centimeters. Open Office uses centimeters when specifying lengths, widths and other measurable formatting and content properties in documents whereas MS Office uses inches.")
    public MeasureUnitEnum getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(MeasureUnitEnum measureUnit) {
        this.measureUnit = measureUnit;
    }

    public OdtSaveOptionsData password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Gets or sets the password to encrypt document.
    * @return password
    **/
    @ApiModelProperty(value = "Gets or sets the password to encrypt document.")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public OdtSaveOptionsData prettyFormat(Boolean prettyFormat) {
        this.prettyFormat = prettyFormat;
        return this;
    }

    /**
     * Gets or sets a value indicating whether to use pretty formats output.
    * @return prettyFormat
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to use pretty formats output.")
    public Boolean getPrettyFormat() {
        return prettyFormat;
    }

    public void setPrettyFormat(Boolean prettyFormat) {
        this.prettyFormat = prettyFormat;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OdtSaveOptionsData odtSaveOptionsData = (OdtSaveOptionsData) o;
        return
            Objects.equals(this.isStrictSchema11, odtSaveOptionsData.isStrictSchema11) &&
            Objects.equals(this.measureUnit, odtSaveOptionsData.measureUnit) &&
            Objects.equals(this.password, odtSaveOptionsData.password) &&
            Objects.equals(this.prettyFormat, odtSaveOptionsData.prettyFormat) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isStrictSchema11, measureUnit, password, prettyFormat, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OdtSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isStrictSchema11: ").append(toIndentedString(isStrictSchema11)).append("\n");
    sb.append("    measureUnit: ").append(toIndentedString(measureUnit)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    prettyFormat: ").append(toIndentedString(prettyFormat)).append("\n");
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
