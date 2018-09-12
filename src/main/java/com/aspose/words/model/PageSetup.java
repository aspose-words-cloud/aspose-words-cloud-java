/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Words for Cloud
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

package com.aspose.words.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.words.model.LinkElement;
import com.aspose.words.model.WordsApiLink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PageSetup
 */

public class PageSetup extends LinkElement {
  @SerializedName("Bidi")
  private Boolean bidi = null;

  @SerializedName("BorderAlwaysInFront")
  private Boolean borderAlwaysInFront = null;

  /**
   * Gets or Sets borderAppliesTo
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

    public static class Adapter extends TypeAdapter<BorderAppliesToEnum> {
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

  @SerializedName("BorderAppliesTo")
  private BorderAppliesToEnum borderAppliesTo = null;

  /**
   * Gets or Sets borderDistanceFrom
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

    public static class Adapter extends TypeAdapter<BorderDistanceFromEnum> {
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

  /**
   * Gets or Sets lineNumberRestartMode
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

    public static class Adapter extends TypeAdapter<LineNumberRestartModeEnum> {
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

  @SerializedName("LineNumberRestartMode")
  private LineNumberRestartModeEnum lineNumberRestartMode = null;

  @SerializedName("LineStartingNumber")
  private Integer lineStartingNumber = null;

  /**
   * Gets or Sets orientation
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

    public static class Adapter extends TypeAdapter<OrientationEnum> {
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

  @SerializedName("Orientation")
  private OrientationEnum orientation = null;

  @SerializedName("OtherPagesTray")
  private Integer otherPagesTray = null;

  @SerializedName("PageHeight")
  private Double pageHeight = null;

  /**
   * Gets or Sets pageNumberStyle
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

    public static class Adapter extends TypeAdapter<PageNumberStyleEnum> {
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

  @SerializedName("PageNumberStyle")
  private PageNumberStyleEnum pageNumberStyle = null;

  @SerializedName("PageStartingNumber")
  private Integer pageStartingNumber = null;

  @SerializedName("PageWidth")
  private Double pageWidth = null;

  /**
   * Gets or Sets paperSize
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

    public static class Adapter extends TypeAdapter<PaperSizeEnum> {
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

  @SerializedName("PaperSize")
  private PaperSizeEnum paperSize = null;

  @SerializedName("RestartPageNumbering")
  private Boolean restartPageNumbering = null;

  @SerializedName("RightMargin")
  private Double rightMargin = null;

  @SerializedName("RtlGutter")
  private Boolean rtlGutter = null;

  /**
   * Gets or Sets sectionStart
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

    public static class Adapter extends TypeAdapter<SectionStartEnum> {
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

  @SerializedName("SectionStart")
  private SectionStartEnum sectionStart = null;

  @SerializedName("SuppressEndnotes")
  private Boolean suppressEndnotes = null;

  @SerializedName("TopMargin")
  private Double topMargin = null;

  /**
   * Gets or Sets verticalAlignment
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

    public static class Adapter extends TypeAdapter<VerticalAlignmentEnum> {
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

  @SerializedName("VerticalAlignment")
  private VerticalAlignmentEnum verticalAlignment = null;

  public PageSetup bidi(Boolean bidi) {
    this.bidi = bidi;
    return this;
  }

   /**
   * Get bidi
   * @return bidi
  **/
  @ApiModelProperty(value = "")
  public Boolean isisBidi() {
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
   * Get borderAlwaysInFront
   * @return borderAlwaysInFront
  **/
  @ApiModelProperty(value = "")
  public Boolean isisBorderAlwaysInFront() {
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
   * Get borderAppliesTo
   * @return borderAppliesTo
  **/
  @ApiModelProperty(value = "")
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
   * Get borderDistanceFrom
   * @return borderDistanceFrom
  **/
  @ApiModelProperty(value = "")
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
   * Get bottomMargin
   * @return bottomMargin
  **/
  @ApiModelProperty(value = "")
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
   * Get differentFirstPageHeaderFooter
   * @return differentFirstPageHeaderFooter
  **/
  @ApiModelProperty(value = "")
  public Boolean isisDifferentFirstPageHeaderFooter() {
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
   * Get firstPageTray
   * @return firstPageTray
  **/
  @ApiModelProperty(value = "")
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
   * Get footerDistance
   * @return footerDistance
  **/
  @ApiModelProperty(value = "")
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
   * Get gutter
   * @return gutter
  **/
  @ApiModelProperty(value = "")
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
   * Get headerDistance
   * @return headerDistance
  **/
  @ApiModelProperty(value = "")
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
   * Get leftMargin
   * @return leftMargin
  **/
  @ApiModelProperty(value = "")
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
   * Get lineNumberCountBy
   * @return lineNumberCountBy
  **/
  @ApiModelProperty(value = "")
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
   * Get lineNumberDistanceFromText
   * @return lineNumberDistanceFromText
  **/
  @ApiModelProperty(value = "")
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
   * Get lineNumberRestartMode
   * @return lineNumberRestartMode
  **/
  @ApiModelProperty(value = "")
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
   * Get lineStartingNumber
   * @return lineStartingNumber
  **/
  @ApiModelProperty(value = "")
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
   * Get orientation
   * @return orientation
  **/
  @ApiModelProperty(value = "")
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
   * Get otherPagesTray
   * @return otherPagesTray
  **/
  @ApiModelProperty(value = "")
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
   * Get pageHeight
   * @return pageHeight
  **/
  @ApiModelProperty(value = "")
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
   * Get pageNumberStyle
   * @return pageNumberStyle
  **/
  @ApiModelProperty(value = "")
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
   * Get pageStartingNumber
   * @return pageStartingNumber
  **/
  @ApiModelProperty(value = "")
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
   * Get pageWidth
   * @return pageWidth
  **/
  @ApiModelProperty(value = "")
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
   * Get paperSize
   * @return paperSize
  **/
  @ApiModelProperty(value = "")
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
   * Get restartPageNumbering
   * @return restartPageNumbering
  **/
  @ApiModelProperty(value = "")
  public Boolean isisRestartPageNumbering() {
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
   * Get rightMargin
   * @return rightMargin
  **/
  @ApiModelProperty(value = "")
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
   * Get rtlGutter
   * @return rtlGutter
  **/
  @ApiModelProperty(value = "")
  public Boolean isisRtlGutter() {
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
   * Get sectionStart
   * @return sectionStart
  **/
  @ApiModelProperty(value = "")
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
   * Get suppressEndnotes
   * @return suppressEndnotes
  **/
  @ApiModelProperty(value = "")
  public Boolean isisSuppressEndnotes() {
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
   * Get topMargin
   * @return topMargin
  **/
  @ApiModelProperty(value = "")
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
   * Get verticalAlignment
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "")
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
    PageSetup pageSetup = (PageSetup) o;
    return Objects.equals(this.bidi, pageSetup.bidi) &&
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

