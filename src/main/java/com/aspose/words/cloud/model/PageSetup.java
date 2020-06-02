/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PageSetup.java">
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
 * Represents the page setup properties of a section.
 */
@ApiModel(description = "Represents the page setup properties of a section.")
public class PageSetup extends LinkElement {
    /**
     * Gets or sets specifies which pages the page border is printed on.
     */
    @JsonAdapter(BorderAppliesToEnum.Adapter.class)
    public enum BorderAppliesToEnum {
        ALLPAGES("AllPages"),
        FIRSTPAGE("FirstPage"),
        OTHERPAGES("OtherPages");

        private String value;

        BorderAppliesToEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static BorderAppliesToEnum fromValue(String text) {
            for (BorderAppliesToEnum b : BorderAppliesToEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< BorderAppliesToEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final BorderAppliesToEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public BorderAppliesToEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return BorderAppliesToEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets a value that indicates whether the specified page border is measured from the edge of the page or from
     * the text it surrounds.
     */
    @JsonAdapter(BorderDistanceFromEnum.Adapter.class)
    public enum BorderDistanceFromEnum {
        TEXT("Text"),
        PAGEEDGE("PageEdge");

        private String value;

        BorderDistanceFromEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static BorderDistanceFromEnum fromValue(String text) {
            for (BorderDistanceFromEnum b : BorderDistanceFromEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< BorderDistanceFromEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final BorderDistanceFromEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public BorderDistanceFromEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return BorderDistanceFromEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the way line numbering runs  that is, whether it starts over at the beginning of a new
     * page or section or runs continuously.
     */
    @JsonAdapter(LineNumberRestartModeEnum.Adapter.class)
    public enum LineNumberRestartModeEnum {
        RESTARTPAGE("RestartPage"),
        RESTARTSECTION("RestartSection"),
        CONTINUOUS("Continuous");

        private String value;

        LineNumberRestartModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LineNumberRestartModeEnum fromValue(String text) {
            for (LineNumberRestartModeEnum b : LineNumberRestartModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< LineNumberRestartModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final LineNumberRestartModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LineNumberRestartModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LineNumberRestartModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets returns or sets the orientation of the page.
     */
    @JsonAdapter(OrientationEnum.Adapter.class)
    public enum OrientationEnum {
        PORTRAIT("Portrait"),
        LANDSCAPE("Landscape");

        private String value;

        OrientationEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrientationEnum fromValue(String text) {
            for (OrientationEnum b : OrientationEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< OrientationEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final OrientationEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OrientationEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OrientationEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the page number format.
     */
    @JsonAdapter(PageNumberStyleEnum.Adapter.class)
    public enum PageNumberStyleEnum {
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

        PageNumberStyleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PageNumberStyleEnum fromValue(String text) {
            for (PageNumberStyleEnum b : PageNumberStyleEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< PageNumberStyleEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final PageNumberStyleEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PageNumberStyleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PageNumberStyleEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets returns or sets the paper size.
     */
    @JsonAdapter(PaperSizeEnum.Adapter.class)
    public enum PaperSizeEnum {
        A3("A3"),
        A4("A4"),
        A5("A5"),
        B4("B4"),
        B5("B5"),
        EXECUTIVE("Executive"),
        FOLIO("Folio"),
        LEDGER("Ledger"),
        LEGAL("Legal"),
        LETTER("Letter"),
        ENVELOPEDL("EnvelopeDL"),
        QUARTO("Quarto"),
        STATEMENT("Statement"),
        TABLOID("Tabloid"),
        PAPER10X14("Paper10x14"),
        PAPER11X17("Paper11x17"),
        CUSTOM("Custom");

        private String value;

        PaperSizeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PaperSizeEnum fromValue(String text) {
            for (PaperSizeEnum b : PaperSizeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< PaperSizeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final PaperSizeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PaperSizeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PaperSizeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets returns or sets the type of section break for the specified object.
     */
    @JsonAdapter(SectionStartEnum.Adapter.class)
    public enum SectionStartEnum {
        CONTINUOUS("Continuous"),
        NEWCOLUMN("NewColumn"),
        NEWPAGE("NewPage"),
        EVENPAGE("EvenPage"),
        ODDPAGE("OddPage");

        private String value;

        SectionStartEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SectionStartEnum fromValue(String text) {
            for (SectionStartEnum b : SectionStartEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< SectionStartEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final SectionStartEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SectionStartEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SectionStartEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets returns or sets the vertical alignment of text on each page in a document or section.
     */
    @JsonAdapter(VerticalAlignmentEnum.Adapter.class)
    public enum VerticalAlignmentEnum {
        TOP("Top"),
        CENTER("Center"),
        JUSTIFY("Justify"),
        BOTTOM("Bottom");

        private String value;

        VerticalAlignmentEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static VerticalAlignmentEnum fromValue(String text) {
            for (VerticalAlignmentEnum b : VerticalAlignmentEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< VerticalAlignmentEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final VerticalAlignmentEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VerticalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return VerticalAlignmentEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Bidi")
    private Boolean bidi = null;

    @SerializedName("BorderAlwaysInFront")
    private Boolean borderAlwaysInFront = null;

    @SerializedName("BorderAppliesTo")
    private BorderAppliesToEnum borderAppliesTo = null;

    @SerializedName("BorderDistanceFrom")
    private BorderDistanceFromEnum borderDistanceFrom = null;

    @SerializedName("BottomMargin")
    private Double bottomMargin = null;

    @SerializedName("DifferentFirstPageHeaderFooter")
    private Boolean differentFirstPageHeaderFooter = null;

    @SerializedName("FirstPageTray")
    private Integer firstPageTray = null;

    @SerializedName("FooterDistance")
    private Double footerDistance = null;

    @SerializedName("Gutter")
    private Double gutter = null;

    @SerializedName("HeaderDistance")
    private Double headerDistance = null;

    @SerializedName("LeftMargin")
    private Double leftMargin = null;

    @SerializedName("LineNumberCountBy")
    private Integer lineNumberCountBy = null;

    @SerializedName("LineNumberDistanceFromText")
    private Double lineNumberDistanceFromText = null;

    @SerializedName("LineNumberRestartMode")
    private LineNumberRestartModeEnum lineNumberRestartMode = null;

    @SerializedName("LineStartingNumber")
    private Integer lineStartingNumber = null;

    @SerializedName("Orientation")
    private OrientationEnum orientation = null;

    @SerializedName("OtherPagesTray")
    private Integer otherPagesTray = null;

    @SerializedName("PageHeight")
    private Double pageHeight = null;

    @SerializedName("PageNumberStyle")
    private PageNumberStyleEnum pageNumberStyle = null;

    @SerializedName("PageStartingNumber")
    private Integer pageStartingNumber = null;

    @SerializedName("PageWidth")
    private Double pageWidth = null;

    @SerializedName("PaperSize")
    private PaperSizeEnum paperSize = null;

    @SerializedName("RestartPageNumbering")
    private Boolean restartPageNumbering = null;

    @SerializedName("RightMargin")
    private Double rightMargin = null;

    @SerializedName("RtlGutter")
    private Boolean rtlGutter = null;

    @SerializedName("SectionStart")
    private SectionStartEnum sectionStart = null;

    @SerializedName("SuppressEndnotes")
    private Boolean suppressEndnotes = null;

    @SerializedName("TopMargin")
    private Double topMargin = null;

    @SerializedName("VerticalAlignment")
    private VerticalAlignmentEnum verticalAlignment = null;
    public PageSetup bidi(Boolean bidi) {
        this.bidi = bidi;
        return this;
    }

    /**
     * Gets or sets specifies that this section contains bidirectional (complex scripts) text.
    * @return bidi
    **/
    @ApiModelProperty(value = "Gets or sets specifies that this section contains bidirectional (complex scripts) text.")
    public Boolean getBidi() {
        return bidi;
    }

    public void setBidi(Boolean bidi) {
        this.bidi = bidi;
    }

    public PageSetup borderAlwaysInFront(Boolean borderAlwaysInFront) {
        this.borderAlwaysInFront = borderAlwaysInFront;
        return this;
    }

    /**
     * Gets or sets specifies where the page border is positioned relative to intersecting texts and objects.
    * @return borderAlwaysInFront
    **/
    @ApiModelProperty(value = "Gets or sets specifies where the page border is positioned relative to intersecting texts and objects.")
    public Boolean getBorderAlwaysInFront() {
        return borderAlwaysInFront;
    }

    public void setBorderAlwaysInFront(Boolean borderAlwaysInFront) {
        this.borderAlwaysInFront = borderAlwaysInFront;
    }

    public PageSetup borderAppliesTo(BorderAppliesToEnum borderAppliesTo) {
        this.borderAppliesTo = borderAppliesTo;
        return this;
    }

    /**
     * Gets or sets specifies which pages the page border is printed on.
    * @return borderAppliesTo
    **/
    @ApiModelProperty(value = "Gets or sets specifies which pages the page border is printed on.")
    public BorderAppliesToEnum getBorderAppliesTo() {
        return borderAppliesTo;
    }

    public void setBorderAppliesTo(BorderAppliesToEnum borderAppliesTo) {
        this.borderAppliesTo = borderAppliesTo;
    }

    public PageSetup borderDistanceFrom(BorderDistanceFromEnum borderDistanceFrom) {
        this.borderDistanceFrom = borderDistanceFrom;
        return this;
    }

    /**
     * Gets or sets a value that indicates whether the specified page border is measured from the edge of the page or from
     * the text it surrounds.
    * @return borderDistanceFrom
    **/
    @ApiModelProperty(value = "Gets or sets a value that indicates whether the specified page border is measured from the edge of the page or from the text it surrounds.")
    public BorderDistanceFromEnum getBorderDistanceFrom() {
        return borderDistanceFrom;
    }

    public void setBorderDistanceFrom(BorderDistanceFromEnum borderDistanceFrom) {
        this.borderDistanceFrom = borderDistanceFrom;
    }

    public PageSetup bottomMargin(Double bottomMargin) {
        this.bottomMargin = bottomMargin;
        return this;
    }

    /**
     * Gets or sets returns or sets the distance (in points) between the bottom edge of the page and the bottom boundary of the body
     * text.
    * @return bottomMargin
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the distance (in points) between the bottom edge of the page and the bottom boundary of the body text.")
    public Double getBottomMargin() {
        return bottomMargin;
    }

    public void setBottomMargin(Double bottomMargin) {
        this.bottomMargin = bottomMargin;
    }

    public PageSetup differentFirstPageHeaderFooter(Boolean differentFirstPageHeaderFooter) {
        this.differentFirstPageHeaderFooter = differentFirstPageHeaderFooter;
        return this;
    }

    /**
     * Gets or sets true if a different header or footer is used on the first page.
    * @return differentFirstPageHeaderFooter
    **/
    @ApiModelProperty(value = "Gets or sets true if a different header or footer is used on the first page.")
    public Boolean getDifferentFirstPageHeaderFooter() {
        return differentFirstPageHeaderFooter;
    }

    public void setDifferentFirstPageHeaderFooter(Boolean differentFirstPageHeaderFooter) {
        this.differentFirstPageHeaderFooter = differentFirstPageHeaderFooter;
    }

    public PageSetup firstPageTray(Integer firstPageTray) {
        this.firstPageTray = firstPageTray;
        return this;
    }

    /**
     * Gets or sets the paper tray (bin) to use for the first page of a section.
     * The value is implementation (printer) specific.
    * @return firstPageTray
    **/
    @ApiModelProperty(value = "Gets or sets the paper tray (bin) to use for the first page of a section. The value is implementation (printer) specific.")
    public Integer getFirstPageTray() {
        return firstPageTray;
    }

    public void setFirstPageTray(Integer firstPageTray) {
        this.firstPageTray = firstPageTray;
    }

    public PageSetup footerDistance(Double footerDistance) {
        this.footerDistance = footerDistance;
        return this;
    }

    /**
     * Gets or sets returns or sets the distance (in points) between the footer and the bottom of the page.
    * @return footerDistance
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the distance (in points) between the footer and the bottom of the page.")
    public Double getFooterDistance() {
        return footerDistance;
    }

    public void setFooterDistance(Double footerDistance) {
        this.footerDistance = footerDistance;
    }

    public PageSetup gutter(Double gutter) {
        this.gutter = gutter;
        return this;
    }

    /**
     * Gets or sets the amount of extra space added to the margin for document binding.
    * @return gutter
    **/
    @ApiModelProperty(value = "Gets or sets the amount of extra space added to the margin for document binding.")
    public Double getGutter() {
        return gutter;
    }

    public void setGutter(Double gutter) {
        this.gutter = gutter;
    }

    public PageSetup headerDistance(Double headerDistance) {
        this.headerDistance = headerDistance;
        return this;
    }

    /**
     * Gets or sets returns or sets the distance (in points) between the header and the top of the page.
    * @return headerDistance
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the distance (in points) between the header and the top of the page.")
    public Double getHeaderDistance() {
        return headerDistance;
    }

    public void setHeaderDistance(Double headerDistance) {
        this.headerDistance = headerDistance;
    }

    public PageSetup leftMargin(Double leftMargin) {
        this.leftMargin = leftMargin;
        return this;
    }

    /**
     * Gets or sets returns or sets the distance (in points) between the left edge of the page and the left boundary of the body text.
    * @return leftMargin
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the distance (in points) between the left edge of the page and the left boundary of the body text.")
    public Double getLeftMargin() {
        return leftMargin;
    }

    public void setLeftMargin(Double leftMargin) {
        this.leftMargin = leftMargin;
    }

    public PageSetup lineNumberCountBy(Integer lineNumberCountBy) {
        this.lineNumberCountBy = lineNumberCountBy;
        return this;
    }

    /**
     * Gets or sets returns or sets the numeric increment for line numbers.
    * @return lineNumberCountBy
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the numeric increment for line numbers.")
    public Integer getLineNumberCountBy() {
        return lineNumberCountBy;
    }

    public void setLineNumberCountBy(Integer lineNumberCountBy) {
        this.lineNumberCountBy = lineNumberCountBy;
    }

    public PageSetup lineNumberDistanceFromText(Double lineNumberDistanceFromText) {
        this.lineNumberDistanceFromText = lineNumberDistanceFromText;
        return this;
    }

    /**
     * Gets or sets distance between the right edge of line numbers and the left edge of the document.
    * @return lineNumberDistanceFromText
    **/
    @ApiModelProperty(value = "Gets or sets distance between the right edge of line numbers and the left edge of the document.")
    public Double getLineNumberDistanceFromText() {
        return lineNumberDistanceFromText;
    }

    public void setLineNumberDistanceFromText(Double lineNumberDistanceFromText) {
        this.lineNumberDistanceFromText = lineNumberDistanceFromText;
    }

    public PageSetup lineNumberRestartMode(LineNumberRestartModeEnum lineNumberRestartMode) {
        this.lineNumberRestartMode = lineNumberRestartMode;
        return this;
    }

    /**
     * Gets or sets the way line numbering runs  that is, whether it starts over at the beginning of a new
     * page or section or runs continuously.
    * @return lineNumberRestartMode
    **/
    @ApiModelProperty(value = "Gets or sets the way line numbering runs  that is, whether it starts over at the beginning of a new page or section or runs continuously.")
    public LineNumberRestartModeEnum getLineNumberRestartMode() {
        return lineNumberRestartMode;
    }

    public void setLineNumberRestartMode(LineNumberRestartModeEnum lineNumberRestartMode) {
        this.lineNumberRestartMode = lineNumberRestartMode;
    }

    public PageSetup lineStartingNumber(Integer lineStartingNumber) {
        this.lineStartingNumber = lineStartingNumber;
        return this;
    }

    /**
     * Gets or sets the starting line number.
    * @return lineStartingNumber
    **/
    @ApiModelProperty(value = "Gets or sets the starting line number.")
    public Integer getLineStartingNumber() {
        return lineStartingNumber;
    }

    public void setLineStartingNumber(Integer lineStartingNumber) {
        this.lineStartingNumber = lineStartingNumber;
    }

    public PageSetup orientation(OrientationEnum orientation) {
        this.orientation = orientation;
        return this;
    }

    /**
     * Gets or sets returns or sets the orientation of the page.
    * @return orientation
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the orientation of the page.")
    public OrientationEnum getOrientation() {
        return orientation;
    }

    public void setOrientation(OrientationEnum orientation) {
        this.orientation = orientation;
    }

    public PageSetup otherPagesTray(Integer otherPagesTray) {
        this.otherPagesTray = otherPagesTray;
        return this;
    }

    /**
     * Gets or sets the paper tray (bin) to be used for all but the first page of a section.
     * The value is implementation (printer) specific.
    * @return otherPagesTray
    **/
    @ApiModelProperty(value = "Gets or sets the paper tray (bin) to be used for all but the first page of a section. The value is implementation (printer) specific.")
    public Integer getOtherPagesTray() {
        return otherPagesTray;
    }

    public void setOtherPagesTray(Integer otherPagesTray) {
        this.otherPagesTray = otherPagesTray;
    }

    public PageSetup pageHeight(Double pageHeight) {
        this.pageHeight = pageHeight;
        return this;
    }

    /**
     * Gets or sets returns or sets the height of the page in points.
    * @return pageHeight
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the height of the page in points.")
    public Double getPageHeight() {
        return pageHeight;
    }

    public void setPageHeight(Double pageHeight) {
        this.pageHeight = pageHeight;
    }

    public PageSetup pageNumberStyle(PageNumberStyleEnum pageNumberStyle) {
        this.pageNumberStyle = pageNumberStyle;
        return this;
    }

    /**
     * Gets or sets the page number format.
    * @return pageNumberStyle
    **/
    @ApiModelProperty(value = "Gets or sets the page number format.")
    public PageNumberStyleEnum getPageNumberStyle() {
        return pageNumberStyle;
    }

    public void setPageNumberStyle(PageNumberStyleEnum pageNumberStyle) {
        this.pageNumberStyle = pageNumberStyle;
    }

    public PageSetup pageStartingNumber(Integer pageStartingNumber) {
        this.pageStartingNumber = pageStartingNumber;
        return this;
    }

    /**
     * Gets or sets the starting page number of the section.
    * @return pageStartingNumber
    **/
    @ApiModelProperty(value = "Gets or sets the starting page number of the section.")
    public Integer getPageStartingNumber() {
        return pageStartingNumber;
    }

    public void setPageStartingNumber(Integer pageStartingNumber) {
        this.pageStartingNumber = pageStartingNumber;
    }

    public PageSetup pageWidth(Double pageWidth) {
        this.pageWidth = pageWidth;
        return this;
    }

    /**
     * Gets or sets returns or sets the width of the page in points.
    * @return pageWidth
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the width of the page in points.")
    public Double getPageWidth() {
        return pageWidth;
    }

    public void setPageWidth(Double pageWidth) {
        this.pageWidth = pageWidth;
    }

    public PageSetup paperSize(PaperSizeEnum paperSize) {
        this.paperSize = paperSize;
        return this;
    }

    /**
     * Gets or sets returns or sets the paper size.
    * @return paperSize
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the paper size.")
    public PaperSizeEnum getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(PaperSizeEnum paperSize) {
        this.paperSize = paperSize;
    }

    public PageSetup restartPageNumbering(Boolean restartPageNumbering) {
        this.restartPageNumbering = restartPageNumbering;
        return this;
    }

    /**
     * Gets or sets true if page numbering restarts at the beginning of the section.
    * @return restartPageNumbering
    **/
    @ApiModelProperty(value = "Gets or sets true if page numbering restarts at the beginning of the section.")
    public Boolean getRestartPageNumbering() {
        return restartPageNumbering;
    }

    public void setRestartPageNumbering(Boolean restartPageNumbering) {
        this.restartPageNumbering = restartPageNumbering;
    }

    public PageSetup rightMargin(Double rightMargin) {
        this.rightMargin = rightMargin;
        return this;
    }

    /**
     * Gets or sets returns or sets the distance (in points) between the right edge of the page and the right boundary of the body
     * text.
    * @return rightMargin
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the distance (in points) between the right edge of the page and the right boundary of the body text.")
    public Double getRightMargin() {
        return rightMargin;
    }

    public void setRightMargin(Double rightMargin) {
        this.rightMargin = rightMargin;
    }

    public PageSetup rtlGutter(Boolean rtlGutter) {
        this.rtlGutter = rtlGutter;
        return this;
    }

    /**
     * Gets or sets whether Microsoft Word uses gutters for the section based on a right-to-left language or a
     * left-to-right language.
    * @return rtlGutter
    **/
    @ApiModelProperty(value = "Gets or sets whether Microsoft Word uses gutters for the section based on a right-to-left language or a left-to-right language.")
    public Boolean getRtlGutter() {
        return rtlGutter;
    }

    public void setRtlGutter(Boolean rtlGutter) {
        this.rtlGutter = rtlGutter;
    }

    public PageSetup sectionStart(SectionStartEnum sectionStart) {
        this.sectionStart = sectionStart;
        return this;
    }

    /**
     * Gets or sets returns or sets the type of section break for the specified object.
    * @return sectionStart
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the type of section break for the specified object.")
    public SectionStartEnum getSectionStart() {
        return sectionStart;
    }

    public void setSectionStart(SectionStartEnum sectionStart) {
        this.sectionStart = sectionStart;
    }

    public PageSetup suppressEndnotes(Boolean suppressEndnotes) {
        this.suppressEndnotes = suppressEndnotes;
        return this;
    }

    /**
     * Gets or sets true if endnotes are printed at the end of the next section that doesn't suppress endnotes.
     * Suppressed endnotes are printed before the endnotes in that section.
    * @return suppressEndnotes
    **/
    @ApiModelProperty(value = "Gets or sets true if endnotes are printed at the end of the next section that doesn't suppress endnotes. Suppressed endnotes are printed before the endnotes in that section.")
    public Boolean getSuppressEndnotes() {
        return suppressEndnotes;
    }

    public void setSuppressEndnotes(Boolean suppressEndnotes) {
        this.suppressEndnotes = suppressEndnotes;
    }

    public PageSetup topMargin(Double topMargin) {
        this.topMargin = topMargin;
        return this;
    }

    /**
     * Gets or sets returns or sets the distance (in points) between the top edge of the page and the top boundary of the body text.
    * @return topMargin
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the distance (in points) between the top edge of the page and the top boundary of the body text.")
    public Double getTopMargin() {
        return topMargin;
    }

    public void setTopMargin(Double topMargin) {
        this.topMargin = topMargin;
    }

    public PageSetup verticalAlignment(VerticalAlignmentEnum verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
        return this;
    }

    /**
     * Gets or sets returns or sets the vertical alignment of text on each page in a document or section.
    * @return verticalAlignment
    **/
    @ApiModelProperty(value = "Gets or sets returns or sets the vertical alignment of text on each page in a document or section.")
    public VerticalAlignmentEnum getVerticalAlignment() {
        return verticalAlignment;
    }

    public void setVerticalAlignment(VerticalAlignmentEnum verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    PageSetup pageSetup = (PageSetup)o;
    return
        Objects.equals(this.bidi, pageSetup.bidi) &&
        Objects.equals(this.borderAlwaysInFront, pageSetup.borderAlwaysInFront) &&
        Objects.equals(this.borderAppliesTo, pageSetup.borderAppliesTo) &&
        Objects.equals(this.borderDistanceFrom, pageSetup.borderDistanceFrom) &&
        Objects.equals(this.bottomMargin, pageSetup.bottomMargin) &&
        Objects.equals(this.differentFirstPageHeaderFooter, pageSetup.differentFirstPageHeaderFooter) &&
        Objects.equals(this.firstPageTray, pageSetup.firstPageTray) &&
        Objects.equals(this.footerDistance, pageSetup.footerDistance) &&
        Objects.equals(this.gutter, pageSetup.gutter) &&
        Objects.equals(this.headerDistance, pageSetup.headerDistance) &&
        Objects.equals(this.leftMargin, pageSetup.leftMargin) &&
        Objects.equals(this.lineNumberCountBy, pageSetup.lineNumberCountBy) &&
        Objects.equals(this.lineNumberDistanceFromText, pageSetup.lineNumberDistanceFromText) &&
        Objects.equals(this.lineNumberRestartMode, pageSetup.lineNumberRestartMode) &&
        Objects.equals(this.lineStartingNumber, pageSetup.lineStartingNumber) &&
        Objects.equals(this.orientation, pageSetup.orientation) &&
        Objects.equals(this.otherPagesTray, pageSetup.otherPagesTray) &&
        Objects.equals(this.pageHeight, pageSetup.pageHeight) &&
        Objects.equals(this.pageNumberStyle, pageSetup.pageNumberStyle) &&
        Objects.equals(this.pageStartingNumber, pageSetup.pageStartingNumber) &&
        Objects.equals(this.pageWidth, pageSetup.pageWidth) &&
        Objects.equals(this.paperSize, pageSetup.paperSize) &&
        Objects.equals(this.restartPageNumbering, pageSetup.restartPageNumbering) &&
        Objects.equals(this.rightMargin, pageSetup.rightMargin) &&
        Objects.equals(this.rtlGutter, pageSetup.rtlGutter) &&
        Objects.equals(this.sectionStart, pageSetup.sectionStart) &&
        Objects.equals(this.suppressEndnotes, pageSetup.suppressEndnotes) &&
        Objects.equals(this.topMargin, pageSetup.topMargin) &&
        Objects.equals(this.verticalAlignment, pageSetup.verticalAlignment) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidi, borderAlwaysInFront, borderAppliesTo, borderDistanceFrom, bottomMargin, differentFirstPageHeaderFooter, firstPageTray, footerDistance, gutter, headerDistance, leftMargin, lineNumberCountBy, lineNumberDistanceFromText, lineNumberRestartMode, lineStartingNumber, orientation, otherPagesTray, pageHeight, pageNumberStyle, pageStartingNumber, pageWidth, paperSize, restartPageNumbering, rightMargin, rtlGutter, sectionStart, suppressEndnotes, topMargin, verticalAlignment, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageSetup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bidi: ").append(toIndentedString(bidi)).append("\n");
    sb.append("    borderAlwaysInFront: ").append(toIndentedString(borderAlwaysInFront)).append("\n");
    sb.append("    borderAppliesTo: ").append(toIndentedString(borderAppliesTo)).append("\n");
    sb.append("    borderDistanceFrom: ").append(toIndentedString(borderDistanceFrom)).append("\n");
    sb.append("    bottomMargin: ").append(toIndentedString(bottomMargin)).append("\n");
    sb.append("    differentFirstPageHeaderFooter: ").append(toIndentedString(differentFirstPageHeaderFooter)).append("\n");
    sb.append("    firstPageTray: ").append(toIndentedString(firstPageTray)).append("\n");
    sb.append("    footerDistance: ").append(toIndentedString(footerDistance)).append("\n");
    sb.append("    gutter: ").append(toIndentedString(gutter)).append("\n");
    sb.append("    headerDistance: ").append(toIndentedString(headerDistance)).append("\n");
    sb.append("    leftMargin: ").append(toIndentedString(leftMargin)).append("\n");
    sb.append("    lineNumberCountBy: ").append(toIndentedString(lineNumberCountBy)).append("\n");
    sb.append("    lineNumberDistanceFromText: ").append(toIndentedString(lineNumberDistanceFromText)).append("\n");
    sb.append("    lineNumberRestartMode: ").append(toIndentedString(lineNumberRestartMode)).append("\n");
    sb.append("    lineStartingNumber: ").append(toIndentedString(lineStartingNumber)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    otherPagesTray: ").append(toIndentedString(otherPagesTray)).append("\n");
    sb.append("    pageHeight: ").append(toIndentedString(pageHeight)).append("\n");
    sb.append("    pageNumberStyle: ").append(toIndentedString(pageNumberStyle)).append("\n");
    sb.append("    pageStartingNumber: ").append(toIndentedString(pageStartingNumber)).append("\n");
    sb.append("    pageWidth: ").append(toIndentedString(pageWidth)).append("\n");
    sb.append("    paperSize: ").append(toIndentedString(paperSize)).append("\n");
    sb.append("    restartPageNumbering: ").append(toIndentedString(restartPageNumbering)).append("\n");
    sb.append("    rightMargin: ").append(toIndentedString(rightMargin)).append("\n");
    sb.append("    rtlGutter: ").append(toIndentedString(rtlGutter)).append("\n");
    sb.append("    sectionStart: ").append(toIndentedString(sectionStart)).append("\n");
    sb.append("    suppressEndnotes: ").append(toIndentedString(suppressEndnotes)).append("\n");
    sb.append("    topMargin: ").append(toIndentedString(topMargin)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
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
