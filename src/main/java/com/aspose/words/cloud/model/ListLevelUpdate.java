/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListLevelUpdate.java">
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
 * Represents a document list levels.
 */
@ApiModel(description = "Represents a document list levels.")
public class ListLevelUpdate implements ModelIfc {
    /**
     * Gets or sets the number style for this list level.
     */
    @JsonAdapter(NumberStyleEnum.Adapter.class)
    public enum NumberStyleEnum {
        ARABIC("Arabic"),
        UPPERCASEROMAN("UppercaseRoman"),
        LOWERCASEROMAN("LowercaseRoman"),
        UPPERCASELETTER("UppercaseLetter"),
        LOWERCASELETTER("LowercaseLetter"),
        ORDINAL("Ordinal"),
        NUMBER("Number"),
        ORDINALTEXT("OrdinalText"),
        HEX("Hex"),
        CHICAGOMANUAL("ChicagoManual"),
        KANJI("Kanji"),
        KANJIDIGIT("KanjiDigit"),
        AIUEOHALFWIDTH("AiueoHalfWidth"),
        IROHAHALFWIDTH("IrohaHalfWidth"),
        ARABICFULLWIDTH("ArabicFullWidth"),
        ARABICHALFWIDTH("ArabicHalfWidth"),
        KANJITRADITIONAL("KanjiTraditional"),
        KANJITRADITIONAL2("KanjiTraditional2"),
        NUMBERINCIRCLE("NumberInCircle"),
        DECIMALFULLWIDTH("DecimalFullWidth"),
        AIUEO("Aiueo"),
        IROHA("Iroha"),
        LEADINGZERO("LeadingZero"),
        BULLET("Bullet"),
        GANADA("Ganada"),
        CHOSUNG("Chosung"),
        GB1("GB1"),
        GB2("GB2"),
        GB3("GB3"),
        GB4("GB4"),
        ZODIAC1("Zodiac1"),
        ZODIAC2("Zodiac2"),
        ZODIAC3("Zodiac3"),
        TRADCHINNUM1("TradChinNum1"),
        TRADCHINNUM2("TradChinNum2"),
        TRADCHINNUM3("TradChinNum3"),
        TRADCHINNUM4("TradChinNum4"),
        SIMPCHINNUM1("SimpChinNum1"),
        SIMPCHINNUM2("SimpChinNum2"),
        SIMPCHINNUM3("SimpChinNum3"),
        SIMPCHINNUM4("SimpChinNum4"),
        HANJAREAD("HanjaRead"),
        HANJAREADDIGIT("HanjaReadDigit"),
        HANGUL("Hangul"),
        HANJA("Hanja"),
        HEBREW1("Hebrew1"),
        ARABIC1("Arabic1"),
        HEBREW2("Hebrew2"),
        ARABIC2("Arabic2"),
        HINDILETTER1("HindiLetter1"),
        HINDILETTER2("HindiLetter2"),
        HINDIARABIC("HindiArabic"),
        HINDICARDINALTEXT("HindiCardinalText"),
        THAILETTER("ThaiLetter"),
        THAIARABIC("ThaiArabic"),
        THAICARDINALTEXT("ThaiCardinalText"),
        VIETCARDINALTEXT("VietCardinalText"),
        NUMBERINDASH("NumberInDash"),
        LOWERCASERUSSIAN("LowercaseRussian"),
        UPPERCASERUSSIAN("UppercaseRussian"),
        NONE("None"),
        CUSTOM("Custom");

        private String value;

        NumberStyleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static NumberStyleEnum fromValue(String text) {
            for (NumberStyleEnum b : NumberStyleEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< NumberStyleEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final NumberStyleEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public NumberStyleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return NumberStyleEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the justification of the actual number of the list item.
     * The list label is justified relative to the Aspose.Words.Lists.ListLevel.NumberPosition
     * property.
     */
    @JsonAdapter(AlignmentEnum.Adapter.class)
    public enum AlignmentEnum {
        LEFT("Left"),
        CENTER("Center"),
        RIGHT("Right");

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
     * Gets or sets the character to be inserted after the number for the list level.
     */
    @JsonAdapter(TrailingCharacterEnum.Adapter.class)
    public enum TrailingCharacterEnum {
        TAB("Tab"),
        SPACE("Space"),
        NOTHING("Nothing");

        private String value;

        TrailingCharacterEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TrailingCharacterEnum fromValue(String text) {
            for (TrailingCharacterEnum b : TrailingCharacterEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TrailingCharacterEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TrailingCharacterEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TrailingCharacterEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TrailingCharacterEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("StartAt")
    protected Integer startAt;

    @SerializedName("NumberStyle")
    protected NumberStyleEnum numberStyle;

    @SerializedName("NumberFormat")
    protected String numberFormat;

    @SerializedName("Alignment")
    protected AlignmentEnum alignment;

    @SerializedName("IsLegal")
    protected Boolean isLegal;

    @SerializedName("RestartAfterLevel")
    protected Integer restartAfterLevel;

    @SerializedName("TrailingCharacter")
    protected TrailingCharacterEnum trailingCharacter;

    @SerializedName("TabPosition")
    protected Double tabPosition;

    @SerializedName("NumberPosition")
    protected Double numberPosition;

    @SerializedName("TextPosition")
    protected Double textPosition;
    /**
     * Gets or sets the starting number for this list level.
     * Default value is 1.
    * @return startAt
    **/
    @ApiModelProperty(value = "Gets or sets the starting number for this list level. Default value is 1.")
    public Integer getStartAt() {
        return startAt;
    }

    public ListLevelUpdate startAt(Integer startAt) {
        this.startAt = startAt;
        return this;
    }

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }


    /**
     * Gets or sets the number style for this list level.
    * @return numberStyle
    **/
    @ApiModelProperty(value = "Gets or sets the number style for this list level.")
    public NumberStyleEnum getNumberStyle() {
        return numberStyle;
    }

    public ListLevelUpdate numberStyle(NumberStyleEnum numberStyle) {
        this.numberStyle = numberStyle;
        return this;
    }

    public void setNumberStyle(NumberStyleEnum numberStyle) {
        this.numberStyle = numberStyle;
    }


    /**
     * Gets or sets the number format for the list level.
     * Among normal text characters, the string can contain placeholder characters \\x0000 to \\x0008 representing the numbers from the corresponding list levels. For example, the string "\\x0000.\\x0001)" will generate a list label that looks something like "1.5)". The number "1" is the current number from the 1st list level, the number "5" is the current number from the 2nd list level. Null is not allowed, but an empty string meaning no number is valid.
    * @return numberFormat
    **/
    @ApiModelProperty(value = "Gets or sets the number format for the list level. Among normal text characters, the string can contain placeholder characters \\x0000 to \\x0008 representing the numbers from the corresponding list levels. For example, the string \"\\x0000.\\x0001)\" will generate a list label that looks something like \"1.5)\". The number \"1\" is the current number from the 1st list level, the number \"5\" is the current number from the 2nd list level. Null is not allowed, but an empty string meaning no number is valid.")
    public String getNumberFormat() {
        return numberFormat;
    }

    public ListLevelUpdate numberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
        return this;
    }

    public void setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
    }


    /**
     * Gets or sets the justification of the actual number of the list item.
     * The list label is justified relative to the Aspose.Words.Lists.ListLevel.NumberPosition
     * property.
    * @return alignment
    **/
    @ApiModelProperty(value = "Gets or sets the justification of the actual number of the list item. The list label is justified relative to the Aspose.Words.Lists.ListLevel.NumberPosition property.")
    public AlignmentEnum getAlignment() {
        return alignment;
    }

    public ListLevelUpdate alignment(AlignmentEnum alignment) {
        this.alignment = alignment;
        return this;
    }

    public void setAlignment(AlignmentEnum alignment) {
        this.alignment = alignment;
    }


    /**
     * Gets or sets a value indicating whether the level turns all inherited numbers to Arabic, false if it preserves their number style.
    * @return isLegal
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the level turns all inherited numbers to Arabic, false if it preserves their number style.")
    public Boolean getIsLegal() {
        return isLegal;
    }

    public ListLevelUpdate isLegal(Boolean isLegal) {
        this.isLegal = isLegal;
        return this;
    }

    public void setIsLegal(Boolean isLegal) {
        this.isLegal = isLegal;
    }


    /**
     * Gets or sets the list level that must appear before the specified list level restarts numbering.
     * The value of -1 means the numbering will continue.
    * @return restartAfterLevel
    **/
    @ApiModelProperty(value = "Gets or sets the list level that must appear before the specified list level restarts numbering. The value of -1 means the numbering will continue.")
    public Integer getRestartAfterLevel() {
        return restartAfterLevel;
    }

    public ListLevelUpdate restartAfterLevel(Integer restartAfterLevel) {
        this.restartAfterLevel = restartAfterLevel;
        return this;
    }

    public void setRestartAfterLevel(Integer restartAfterLevel) {
        this.restartAfterLevel = restartAfterLevel;
    }


    /**
     * Gets or sets the character to be inserted after the number for the list level.
    * @return trailingCharacter
    **/
    @ApiModelProperty(value = "Gets or sets the character to be inserted after the number for the list level.")
    public TrailingCharacterEnum getTrailingCharacter() {
        return trailingCharacter;
    }

    public ListLevelUpdate trailingCharacter(TrailingCharacterEnum trailingCharacter) {
        this.trailingCharacter = trailingCharacter;
        return this;
    }

    public void setTrailingCharacter(TrailingCharacterEnum trailingCharacter) {
        this.trailingCharacter = trailingCharacter;
    }


    /**
     * Gets or sets the tab position (in points) for the list level.
     * Has effect only when Aspose.Words.Lists.ListLevel.TrailingCharacter is a tab.
     * Aspose.Words.Lists.ListLevel.NumberPosition Aspose.Words.Lists.ListLevel.TextPosition.
    * @return tabPosition
    **/
    @ApiModelProperty(value = "Gets or sets the tab position (in points) for the list level. Has effect only when Aspose.Words.Lists.ListLevel.TrailingCharacter is a tab. Aspose.Words.Lists.ListLevel.NumberPosition Aspose.Words.Lists.ListLevel.TextPosition.")
    public Double getTabPosition() {
        return tabPosition;
    }

    public ListLevelUpdate tabPosition(Double tabPosition) {
        this.tabPosition = tabPosition;
        return this;
    }

    public void setTabPosition(Double tabPosition) {
        this.tabPosition = tabPosition;
    }


    /**
     * Gets or sets the position (in points) of the number or bullet for the list level.
     * Aspose.Words.Lists.ListLevel.NumberPosition corresponds to LeftIndent plus FirstLineIndent of the paragraph. Aspose.Words.Lists.ListLevel.TextPosition Aspose.Words.Lists.ListLevel.TabPosition.
    * @return numberPosition
    **/
    @ApiModelProperty(value = "Gets or sets the position (in points) of the number or bullet for the list level. Aspose.Words.Lists.ListLevel.NumberPosition corresponds to LeftIndent plus FirstLineIndent of the paragraph. Aspose.Words.Lists.ListLevel.TextPosition Aspose.Words.Lists.ListLevel.TabPosition.")
    public Double getNumberPosition() {
        return numberPosition;
    }

    public ListLevelUpdate numberPosition(Double numberPosition) {
        this.numberPosition = numberPosition;
        return this;
    }

    public void setNumberPosition(Double numberPosition) {
        this.numberPosition = numberPosition;
    }


    /**
     * Gets or sets the position (in points) for the second line of wrapping text for the list level.
     * Aspose.Words.Lists.ListLevel.TextPosition corresponds to LeftIndent of the paragraph.
     * Aspose.Words.Lists.ListLevel.NumberPosition Aspose.Words.Lists.ListLevel.TabPosition.
    * @return textPosition
    **/
    @ApiModelProperty(value = "Gets or sets the position (in points) for the second line of wrapping text for the list level. Aspose.Words.Lists.ListLevel.TextPosition corresponds to LeftIndent of the paragraph. Aspose.Words.Lists.ListLevel.NumberPosition Aspose.Words.Lists.ListLevel.TabPosition.")
    public Double getTextPosition() {
        return textPosition;
    }

    public ListLevelUpdate textPosition(Double textPosition) {
        this.textPosition = textPosition;
        return this;
    }

    public void setTextPosition(Double textPosition) {
        this.textPosition = textPosition;
    }


    public ListLevelUpdate() {
        this.startAt = null;
        this.numberStyle = null;
        this.numberFormat = null;
        this.alignment = null;
        this.isLegal = null;
        this.restartAfterLevel = null;
        this.trailingCharacter = null;
        this.tabPosition = null;
        this.numberPosition = null;
        this.textPosition = null;
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

        ListLevelUpdate listLevelUpdate = (ListLevelUpdate) o;
        return
            Objects.equals(this.startAt, listLevelUpdate.startAt) &&
            Objects.equals(this.numberStyle, listLevelUpdate.numberStyle) &&
            Objects.equals(this.numberFormat, listLevelUpdate.numberFormat) &&
            Objects.equals(this.alignment, listLevelUpdate.alignment) &&
            Objects.equals(this.isLegal, listLevelUpdate.isLegal) &&
            Objects.equals(this.restartAfterLevel, listLevelUpdate.restartAfterLevel) &&
            Objects.equals(this.trailingCharacter, listLevelUpdate.trailingCharacter) &&
            Objects.equals(this.tabPosition, listLevelUpdate.tabPosition) &&
            Objects.equals(this.numberPosition, listLevelUpdate.numberPosition) &&
            Objects.equals(this.textPosition, listLevelUpdate.textPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, numberStyle, numberFormat, alignment, isLegal, restartAfterLevel, trailingCharacter, tabPosition, numberPosition, textPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLevelUpdate {\n");
    sb.append("    startAt: ").append(toIndentedString(getStartAt())).append("\n");
    sb.append("    numberStyle: ").append(toIndentedString(getNumberStyle())).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(getNumberFormat())).append("\n");
    sb.append("    alignment: ").append(toIndentedString(getAlignment())).append("\n");
    sb.append("    isLegal: ").append(toIndentedString(getIsLegal())).append("\n");
    sb.append("    restartAfterLevel: ").append(toIndentedString(getRestartAfterLevel())).append("\n");
    sb.append("    trailingCharacter: ").append(toIndentedString(getTrailingCharacter())).append("\n");
    sb.append("    tabPosition: ").append(toIndentedString(getTabPosition())).append("\n");
    sb.append("    numberPosition: ").append(toIndentedString(getNumberPosition())).append("\n");
    sb.append("    textPosition: ").append(toIndentedString(getTextPosition())).append("\n");
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
