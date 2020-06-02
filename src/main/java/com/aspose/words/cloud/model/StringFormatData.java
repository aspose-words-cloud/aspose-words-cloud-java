/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StringFormatData.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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
 * Allows to specify System.Drawing.StringFormat options.
 */
@ApiModel(description = "Allows to specify System.Drawing.StringFormat options.")
public class StringFormatData {
    /**
     * Gets or sets horizontal alignment of the string.
     */
    @JsonAdapter(AlignmentEnum.Adapter.class)
    public enum AlignmentEnum {
        NEAR("Near"),
        CENTER("Center"),
        FAR("Far");

        private String value;

        AlignmentEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AlignmentEnum fromValue(String text) {
            for (AlignmentEnum b : AlignmentEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< AlignmentEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final AlignmentEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AlignmentEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AlignmentEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets a System.Drawing.StringFormatFlags enumeration that contains formatting information.
     */
    @JsonAdapter(FormatFlagsEnum.Adapter.class)
    public enum FormatFlagsEnum {
        DIRECTIONRIGHTTOLEFT("DirectionRightToLeft"),
        DIRECTIONVERTICAL("DirectionVertical"),
        FITBLACKBOX("FitBlackBox"),
        DISPLAYFORMATCONTROL("DisplayFormatControl"),
        NOFONTFALLBACK("NoFontFallback"),
        MEASURETRAILINGSPACES("MeasureTrailingSpaces"),
        NOWRAP("NoWrap"),
        LINELIMIT("LineLimit"),
        NOCLIP("NoClip");

        private String value;

        FormatFlagsEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FormatFlagsEnum fromValue(String text) {
            for (FormatFlagsEnum b : FormatFlagsEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< FormatFlagsEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final FormatFlagsEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FormatFlagsEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FormatFlagsEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the System.Drawing.Text.HotkeyPrefix object for this System.Drawing.StringFormat object.
     */
    @JsonAdapter(HotkeyPrefixEnum.Adapter.class)
    public enum HotkeyPrefixEnum {
        NONE("None"),
        SHOW("Show"),
        HIDE("Hide");

        private String value;

        HotkeyPrefixEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static HotkeyPrefixEnum fromValue(String text) {
            for (HotkeyPrefixEnum b : HotkeyPrefixEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< HotkeyPrefixEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final HotkeyPrefixEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public HotkeyPrefixEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return HotkeyPrefixEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the vertical alignment of the string.
     */
    @JsonAdapter(LineAlignmentEnum.Adapter.class)
    public enum LineAlignmentEnum {
        NEAR("Near"),
        CENTER("Center"),
        FAR("Far");

        private String value;

        LineAlignmentEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LineAlignmentEnum fromValue(String text) {
            for (LineAlignmentEnum b : LineAlignmentEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< LineAlignmentEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final LineAlignmentEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LineAlignmentEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LineAlignmentEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the System.Drawing.StringTrimming enumeration for this System.Drawing.StringFormat object.
     */
    @JsonAdapter(TrimmingEnum.Adapter.class)
    public enum TrimmingEnum {
        NONE("None"),
        CHARACTER("Character"),
        WORD("Word"),
        ELLIPSISCHARACTER("EllipsisCharacter"),
        ELLIPSISWORD("EllipsisWord"),
        ELLIPSISPATH("EllipsisPath");

        private String value;

        TrimmingEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TrimmingEnum fromValue(String text) {
            for (TrimmingEnum b : TrimmingEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TrimmingEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TrimmingEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TrimmingEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TrimmingEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Alignment")
    private AlignmentEnum alignment = null;

    @SerializedName("FormatFlags")
    private FormatFlagsEnum formatFlags = null;

    @SerializedName("HotkeyPrefix")
    private HotkeyPrefixEnum hotkeyPrefix = null;

    @SerializedName("LineAlignment")
    private LineAlignmentEnum lineAlignment = null;

    @SerializedName("Trimming")
    private TrimmingEnum trimming = null;
    public StringFormatData alignment(AlignmentEnum alignment) {
        this.alignment = alignment;
        return this;
    }

    /**
     * Gets or sets horizontal alignment of the string.
    * @return alignment
    **/
    @ApiModelProperty(value = "Gets or sets horizontal alignment of the string.")
    public AlignmentEnum getAlignment() {
        return alignment;
    }

    public void setAlignment(AlignmentEnum alignment) {
        this.alignment = alignment;
    }

    public StringFormatData formatFlags(FormatFlagsEnum formatFlags) {
        this.formatFlags = formatFlags;
        return this;
    }

    /**
     * Gets or sets a System.Drawing.StringFormatFlags enumeration that contains formatting information.
    * @return formatFlags
    **/
    @ApiModelProperty(value = "Gets or sets a System.Drawing.StringFormatFlags enumeration that contains formatting information.")
    public FormatFlagsEnum getFormatFlags() {
        return formatFlags;
    }

    public void setFormatFlags(FormatFlagsEnum formatFlags) {
        this.formatFlags = formatFlags;
    }

    public StringFormatData hotkeyPrefix(HotkeyPrefixEnum hotkeyPrefix) {
        this.hotkeyPrefix = hotkeyPrefix;
        return this;
    }

    /**
     * Gets or sets the System.Drawing.Text.HotkeyPrefix object for this System.Drawing.StringFormat object.
    * @return hotkeyPrefix
    **/
    @ApiModelProperty(value = "Gets or sets the System.Drawing.Text.HotkeyPrefix object for this System.Drawing.StringFormat object.")
    public HotkeyPrefixEnum getHotkeyPrefix() {
        return hotkeyPrefix;
    }

    public void setHotkeyPrefix(HotkeyPrefixEnum hotkeyPrefix) {
        this.hotkeyPrefix = hotkeyPrefix;
    }

    public StringFormatData lineAlignment(LineAlignmentEnum lineAlignment) {
        this.lineAlignment = lineAlignment;
        return this;
    }

    /**
     * Gets or sets the vertical alignment of the string.
    * @return lineAlignment
    **/
    @ApiModelProperty(value = "Gets or sets the vertical alignment of the string.")
    public LineAlignmentEnum getLineAlignment() {
        return lineAlignment;
    }

    public void setLineAlignment(LineAlignmentEnum lineAlignment) {
        this.lineAlignment = lineAlignment;
    }

    public StringFormatData trimming(TrimmingEnum trimming) {
        this.trimming = trimming;
        return this;
    }

    /**
     * Gets or sets the System.Drawing.StringTrimming enumeration for this System.Drawing.StringFormat object.
    * @return trimming
    **/
    @ApiModelProperty(value = "Gets or sets the System.Drawing.StringTrimming enumeration for this System.Drawing.StringFormat object.")
    public TrimmingEnum getTrimming() {
        return trimming;
    }

    public void setTrimming(TrimmingEnum trimming) {
        this.trimming = trimming;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    StringFormatData stringFormatData = (StringFormatData)o;
    return
        Objects.equals(this.alignment, stringFormatData.alignment) &&
        Objects.equals(this.formatFlags, stringFormatData.formatFlags) &&
        Objects.equals(this.hotkeyPrefix, stringFormatData.hotkeyPrefix) &&
        Objects.equals(this.lineAlignment, stringFormatData.lineAlignment) &&
        Objects.equals(this.trimming, stringFormatData.trimming);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, formatFlags, hotkeyPrefix, lineAlignment, trimming);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringFormatData {\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    formatFlags: ").append(toIndentedString(formatFlags)).append("\n");
    sb.append("    hotkeyPrefix: ").append(toIndentedString(hotkeyPrefix)).append("\n");
    sb.append("    lineAlignment: ").append(toIndentedString(lineAlignment)).append("\n");
    sb.append("    trimming: ").append(toIndentedString(trimming)).append("\n");
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
