/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Font.java">
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
 * DTO container with a font element.
 */
@ApiModel(description = "DTO container with a font element.")
public class Font extends LinkElement {
    /**
     * Gets or sets the locale independent style identifier of the character style applied to this formatting.
     */
    @JsonAdapter(StyleIdentifierEnum.Adapter.class)
    public enum StyleIdentifierEnum {
        NORMAL("Normal"),
        HEADING1("Heading1"),
        HEADING2("Heading2"),
        HEADING3("Heading3"),
        HEADING4("Heading4"),
        HEADING5("Heading5"),
        HEADING6("Heading6"),
        HEADING7("Heading7"),
        HEADING8("Heading8"),
        HEADING9("Heading9"),
        INDEX1("Index1"),
        INDEX2("Index2"),
        INDEX3("Index3"),
        INDEX4("Index4"),
        INDEX5("Index5"),
        INDEX6("Index6"),
        INDEX7("Index7"),
        INDEX8("Index8"),
        INDEX9("Index9"),
        TOC1("Toc1"),
        TOC2("Toc2"),
        TOC3("Toc3"),
        TOC4("Toc4"),
        TOC5("Toc5"),
        TOC6("Toc6"),
        TOC7("Toc7"),
        TOC8("Toc8"),
        TOC9("Toc9"),
        NORMALINDENT("NormalIndent"),
        FOOTNOTETEXT("FootnoteText"),
        COMMENTTEXT("CommentText"),
        HEADER("Header"),
        FOOTER("Footer"),
        INDEXHEADING("IndexHeading"),
        CAPTION("Caption"),
        TABLEOFFIGURES("TableOfFigures"),
        ENVELOPEADDRESS("EnvelopeAddress"),
        ENVELOPERETURN("EnvelopeReturn"),
        FOOTNOTEREFERENCE("FootnoteReference"),
        COMMENTREFERENCE("CommentReference"),
        LINENUMBER("LineNumber"),
        PAGENUMBER("PageNumber"),
        ENDNOTEREFERENCE("EndnoteReference"),
        ENDNOTETEXT("EndnoteText"),
        TABLEOFAUTHORITIES("TableOfAuthorities"),
        MACRO("Macro"),
        TOAHEADING("ToaHeading"),
        LIST("List"),
        LISTBULLET("ListBullet"),
        LISTNUMBER("ListNumber"),
        LIST2("List2"),
        LIST3("List3"),
        LIST4("List4"),
        LIST5("List5"),
        LISTBULLET2("ListBullet2"),
        LISTBULLET3("ListBullet3"),
        LISTBULLET4("ListBullet4"),
        LISTBULLET5("ListBullet5"),
        LISTNUMBER2("ListNumber2"),
        LISTNUMBER3("ListNumber3"),
        LISTNUMBER4("ListNumber4"),
        LISTNUMBER5("ListNumber5"),
        TITLE("Title"),
        CLOSING("Closing"),
        SIGNATURE("Signature"),
        DEFAULTPARAGRAPHFONT("DefaultParagraphFont"),
        BODYTEXT("BodyText"),
        BODYTEXTIND("BodyTextInd"),
        LISTCONTINUE("ListContinue"),
        LISTCONTINUE2("ListContinue2"),
        LISTCONTINUE3("ListContinue3"),
        LISTCONTINUE4("ListContinue4"),
        LISTCONTINUE5("ListContinue5"),
        MESSAGEHEADER("MessageHeader"),
        SUBTITLE("Subtitle"),
        SALUTATION("Salutation"),
        DATE("Date"),
        BODYTEXT1I("BodyText1I"),
        BODYTEXT1I2("BodyText1I2"),
        NOTEHEADING("NoteHeading"),
        BODYTEXT2("BodyText2"),
        BODYTEXT3("BodyText3"),
        BODYTEXTIND2("BodyTextInd2"),
        BODYTEXTIND3("BodyTextInd3"),
        BLOCKTEXT("BlockText"),
        HYPERLINK("Hyperlink"),
        FOLLOWEDHYPERLINK("FollowedHyperlink"),
        STRONG("Strong"),
        EMPHASIS("Emphasis"),
        DOCUMENTMAP("DocumentMap"),
        PLAINTEXT("PlainText"),
        EMAILSIGNATURE("EmailSignature"),
        HTMLTOPOFFORM("HtmlTopOfForm"),
        HTMLBOTTOMOFFORM("HtmlBottomOfForm"),
        NORMALWEB("NormalWeb"),
        HTMLACRONYM("HtmlAcronym"),
        HTMLADDRESS("HtmlAddress"),
        HTMLCITE("HtmlCite"),
        HTMLCODE("HtmlCode"),
        HTMLDEFINITION("HtmlDefinition"),
        HTMLKEYBOARD("HtmlKeyboard"),
        HTMLPREFORMATTED("HtmlPreformatted"),
        HTMLSAMPLE("HtmlSample"),
        HTMLTYPEWRITER("HtmlTypewriter"),
        HTMLVARIABLE("HtmlVariable"),
        TABLENORMAL("TableNormal"),
        COMMENTSUBJECT("CommentSubject"),
        NOLIST("NoList"),
        OUTLINELIST1("OutlineList1"),
        OUTLINELIST2("OutlineList2"),
        OUTLINELIST3("OutlineList3"),
        TABLESIMPLE1("TableSimple1"),
        TABLESIMPLE2("TableSimple2"),
        TABLESIMPLE3("TableSimple3"),
        TABLECLASSIC1("TableClassic1"),
        TABLECLASSIC2("TableClassic2"),
        TABLECLASSIC3("TableClassic3"),
        TABLECLASSIC4("TableClassic4"),
        TABLECOLORFUL1("TableColorful1"),
        TABLECOLORFUL2("TableColorful2"),
        TABLECOLORFUL3("TableColorful3"),
        TABLECOLUMNS1("TableColumns1"),
        TABLECOLUMNS2("TableColumns2"),
        TABLECOLUMNS3("TableColumns3"),
        TABLECOLUMNS4("TableColumns4"),
        TABLECOLUMNS5("TableColumns5"),
        TABLEGRID1("TableGrid1"),
        TABLEGRID2("TableGrid2"),
        TABLEGRID3("TableGrid3"),
        TABLEGRID4("TableGrid4"),
        TABLEGRID5("TableGrid5"),
        TABLEGRID6("TableGrid6"),
        TABLEGRID7("TableGrid7"),
        TABLEGRID8("TableGrid8"),
        TABLELIST1("TableList1"),
        TABLELIST2("TableList2"),
        TABLELIST3("TableList3"),
        TABLELIST4("TableList4"),
        TABLELIST5("TableList5"),
        TABLELIST6("TableList6"),
        TABLELIST7("TableList7"),
        TABLELIST8("TableList8"),
        TABLE3DEFFECTS1("Table3DEffects1"),
        TABLE3DEFFECTS2("Table3DEffects2"),
        TABLE3DEFFECTS3("Table3DEffects3"),
        TABLECONTEMPORARY("TableContemporary"),
        TABLEELEGANT("TableElegant"),
        TABLEPROFESSIONAL("TableProfessional"),
        TABLESUBTLE1("TableSubtle1"),
        TABLESUBTLE2("TableSubtle2"),
        TABLEWEB1("TableWeb1"),
        TABLEWEB2("TableWeb2"),
        TABLEWEB3("TableWeb3"),
        BALLOONTEXT("BalloonText"),
        TABLEGRID("TableGrid"),
        TABLETHEME("TableTheme"),
        PLACEHOLDERTEXT("PlaceholderText"),
        NOSPACING("NoSpacing"),
        LIGHTSHADING("LightShading"),
        LIGHTLIST("LightList"),
        LIGHTGRID("LightGrid"),
        MEDIUMSHADING1("MediumShading1"),
        MEDIUMSHADING2("MediumShading2"),
        MEDIUMLIST1("MediumList1"),
        MEDIUMLIST2("MediumList2"),
        MEDIUMGRID1("MediumGrid1"),
        MEDIUMGRID2("MediumGrid2"),
        MEDIUMGRID3("MediumGrid3"),
        DARKLIST("DarkList"),
        COLORFULSHADING("ColorfulShading"),
        COLORFULLIST("ColorfulList"),
        COLORFULGRID("ColorfulGrid"),
        LIGHTSHADINGACCENT1("LightShadingAccent1"),
        LIGHTLISTACCENT1("LightListAccent1"),
        LIGHTGRIDACCENT1("LightGridAccent1"),
        MEDIUMSHADING1ACCENT1("MediumShading1Accent1"),
        MEDIUMSHADING2ACCENT1("MediumShading2Accent1"),
        MEDIUMLIST1ACCENT1("MediumList1Accent1"),
        REVISION("Revision"),
        LISTPARAGRAPH("ListParagraph"),
        QUOTE("Quote"),
        INTENSEQUOTE("IntenseQuote"),
        MEDIUMLIST2ACCENT1("MediumList2Accent1"),
        MEDIUMGRID1ACCENT1("MediumGrid1Accent1"),
        MEDIUMGRID2ACCENT1("MediumGrid2Accent1"),
        MEDIUMGRID3ACCENT1("MediumGrid3Accent1"),
        DARKLISTACCENT1("DarkListAccent1"),
        COLORFULSHADINGACCENT1("ColorfulShadingAccent1"),
        COLORFULLISTACCENT1("ColorfulListAccent1"),
        COLORFULGRIDACCENT1("ColorfulGridAccent1"),
        LIGHTSHADINGACCENT2("LightShadingAccent2"),
        LIGHTLISTACCENT2("LightListAccent2"),
        LIGHTGRIDACCENT2("LightGridAccent2"),
        MEDIUMSHADING1ACCENT2("MediumShading1Accent2"),
        MEDIUMSHADING2ACCENT2("MediumShading2Accent2"),
        MEDIUMLIST1ACCENT2("MediumList1Accent2"),
        MEDIUMLIST2ACCENT2("MediumList2Accent2"),
        MEDIUMGRID1ACCENT2("MediumGrid1Accent2"),
        MEDIUMGRID2ACCENT2("MediumGrid2Accent2"),
        MEDIUMGRID3ACCENT2("MediumGrid3Accent2"),
        DARKLISTACCENT2("DarkListAccent2"),
        COLORFULSHADINGACCENT2("ColorfulShadingAccent2"),
        COLORFULLISTACCENT2("ColorfulListAccent2"),
        COLORFULGRIDACCENT2("ColorfulGridAccent2"),
        LIGHTSHADINGACCENT3("LightShadingAccent3"),
        LIGHTLISTACCENT3("LightListAccent3"),
        LIGHTGRIDACCENT3("LightGridAccent3"),
        MEDIUMSHADING1ACCENT3("MediumShading1Accent3"),
        MEDIUMSHADING2ACCENT3("MediumShading2Accent3"),
        MEDIUMLIST1ACCENT3("MediumList1Accent3"),
        MEDIUMLIST2ACCENT3("MediumList2Accent3"),
        MEDIUMGRID1ACCENT3("MediumGrid1Accent3"),
        MEDIUMGRID2ACCENT3("MediumGrid2Accent3"),
        MEDIUMGRID3ACCENT3("MediumGrid3Accent3"),
        DARKLISTACCENT3("DarkListAccent3"),
        COLORFULSHADINGACCENT3("ColorfulShadingAccent3"),
        COLORFULLISTACCENT3("ColorfulListAccent3"),
        COLORFULGRIDACCENT3("ColorfulGridAccent3"),
        LIGHTSHADINGACCENT4("LightShadingAccent4"),
        LIGHTLISTACCENT4("LightListAccent4"),
        LIGHTGRIDACCENT4("LightGridAccent4"),
        MEDIUMSHADING1ACCENT4("MediumShading1Accent4"),
        MEDIUMSHADING2ACCENT4("MediumShading2Accent4"),
        MEDIUMLIST1ACCENT4("MediumList1Accent4"),
        MEDIUMLIST2ACCENT4("MediumList2Accent4"),
        MEDIUMGRID1ACCENT4("MediumGrid1Accent4"),
        MEDIUMGRID2ACCENT4("MediumGrid2Accent4"),
        MEDIUMGRID3ACCENT4("MediumGrid3Accent4"),
        DARKLISTACCENT4("DarkListAccent4"),
        COLORFULSHADINGACCENT4("ColorfulShadingAccent4"),
        COLORFULLISTACCENT4("ColorfulListAccent4"),
        COLORFULGRIDACCENT4("ColorfulGridAccent4"),
        LIGHTSHADINGACCENT5("LightShadingAccent5"),
        LIGHTLISTACCENT5("LightListAccent5"),
        LIGHTGRIDACCENT5("LightGridAccent5"),
        MEDIUMSHADING1ACCENT5("MediumShading1Accent5"),
        MEDIUMSHADING2ACCENT5("MediumShading2Accent5"),
        MEDIUMLIST1ACCENT5("MediumList1Accent5"),
        MEDIUMLIST2ACCENT5("MediumList2Accent5"),
        MEDIUMGRID1ACCENT5("MediumGrid1Accent5"),
        MEDIUMGRID2ACCENT5("MediumGrid2Accent5"),
        MEDIUMGRID3ACCENT5("MediumGrid3Accent5"),
        DARKLISTACCENT5("DarkListAccent5"),
        COLORFULSHADINGACCENT5("ColorfulShadingAccent5"),
        COLORFULLISTACCENT5("ColorfulListAccent5"),
        COLORFULGRIDACCENT5("ColorfulGridAccent5"),
        LIGHTSHADINGACCENT6("LightShadingAccent6"),
        LIGHTLISTACCENT6("LightListAccent6"),
        LIGHTGRIDACCENT6("LightGridAccent6"),
        MEDIUMSHADING1ACCENT6("MediumShading1Accent6"),
        MEDIUMSHADING2ACCENT6("MediumShading2Accent6"),
        MEDIUMLIST1ACCENT6("MediumList1Accent6"),
        MEDIUMLIST2ACCENT6("MediumList2Accent6"),
        MEDIUMGRID1ACCENT6("MediumGrid1Accent6"),
        MEDIUMGRID2ACCENT6("MediumGrid2Accent6"),
        MEDIUMGRID3ACCENT6("MediumGrid3Accent6"),
        DARKLISTACCENT6("DarkListAccent6"),
        COLORFULSHADINGACCENT6("ColorfulShadingAccent6"),
        COLORFULLISTACCENT6("ColorfulListAccent6"),
        COLORFULGRIDACCENT6("ColorfulGridAccent6"),
        SUBTLEEMPHASIS("SubtleEmphasis"),
        INTENSEEMPHASIS("IntenseEmphasis"),
        SUBTLEREFERENCE("SubtleReference"),
        INTENSEREFERENCE("IntenseReference"),
        BOOKTITLE("BookTitle"),
        BIBLIOGRAPHY("Bibliography"),
        TOCHEADING("TocHeading"),
        PLAINTABLE1("PlainTable1"),
        PLAINTABLE2("PlainTable2"),
        PLAINTABLE3("PlainTable3"),
        PLAINTABLE4("PlainTable4"),
        PLAINTABLE5("PlainTable5"),
        TABLEGRIDLIGHT("TableGridLight"),
        GRIDTABLE1LIGHT("GridTable1Light"),
        GRIDTABLE2("GridTable2"),
        GRIDTABLE3("GridTable3"),
        GRIDTABLE4("GridTable4"),
        GRIDTABLE5DARK("GridTable5Dark"),
        GRIDTABLE6COLORFUL("GridTable6Colorful"),
        GRIDTABLE7COLORFUL("GridTable7Colorful"),
        GRIDTABLE1LIGHTACCENT1("GridTable1LightAccent1"),
        GRIDTABLE2ACCENT1("GridTable2Accent1"),
        GRIDTABLE3ACCENT1("GridTable3Accent1"),
        GRIDTABLE4ACCENT1("GridTable4Accent1"),
        GRIDTABLE5DARKACCENT1("GridTable5DarkAccent1"),
        GRIDTABLE6COLORFULACCENT1("GridTable6ColorfulAccent1"),
        GRIDTABLE7COLORFULACCENT1("GridTable7ColorfulAccent1"),
        GRIDTABLE1LIGHTACCENT2("GridTable1LightAccent2"),
        GRIDTABLE2ACCENT2("GridTable2Accent2"),
        GRIDTABLE3ACCENT2("GridTable3Accent2"),
        GRIDTABLE4ACCENT2("GridTable4Accent2"),
        GRIDTABLE5DARKACCENT2("GridTable5DarkAccent2"),
        GRIDTABLE6COLORFULACCENT2("GridTable6ColorfulAccent2"),
        GRIDTABLE7COLORFULACCENT2("GridTable7ColorfulAccent2"),
        GRIDTABLE1LIGHTACCENT3("GridTable1LightAccent3"),
        GRIDTABLE2ACCENT3("GridTable2Accent3"),
        GRIDTABLE3ACCENT3("GridTable3Accent3"),
        GRIDTABLE4ACCENT3("GridTable4Accent3"),
        GRIDTABLE5DARKACCENT3("GridTable5DarkAccent3"),
        GRIDTABLE6COLORFULACCENT3("GridTable6ColorfulAccent3"),
        GRIDTABLE7COLORFULACCENT3("GridTable7ColorfulAccent3"),
        GRIDTABLE1LIGHTACCENT4("GridTable1LightAccent4"),
        GRIDTABLE2ACCENT4("GridTable2Accent4"),
        GRIDTABLE3ACCENT4("GridTable3Accent4"),
        GRIDTABLE4ACCENT4("GridTable4Accent4"),
        GRIDTABLE5DARKACCENT4("GridTable5DarkAccent4"),
        GRIDTABLE6COLORFULACCENT4("GridTable6ColorfulAccent4"),
        GRIDTABLE7COLORFULACCENT4("GridTable7ColorfulAccent4"),
        GRIDTABLE1LIGHTACCENT5("GridTable1LightAccent5"),
        GRIDTABLE2ACCENT5("GridTable2Accent5"),
        GRIDTABLE3ACCENT5("GridTable3Accent5"),
        GRIDTABLE4ACCENT5("GridTable4Accent5"),
        GRIDTABLE5DARKACCENT5("GridTable5DarkAccent5"),
        GRIDTABLE6COLORFULACCENT5("GridTable6ColorfulAccent5"),
        GRIDTABLE7COLORFULACCENT5("GridTable7ColorfulAccent5"),
        GRIDTABLE1LIGHTACCENT6("GridTable1LightAccent6"),
        GRIDTABLE2ACCENT6("GridTable2Accent6"),
        GRIDTABLE3ACCENT6("GridTable3Accent6"),
        GRIDTABLE4ACCENT6("GridTable4Accent6"),
        GRIDTABLE5DARKACCENT6("GridTable5DarkAccent6"),
        GRIDTABLE6COLORFULACCENT6("GridTable6ColorfulAccent6"),
        GRIDTABLE7COLORFULACCENT6("GridTable7ColorfulAccent6"),
        LISTTABLE1LIGHT("ListTable1Light"),
        LISTTABLE2("ListTable2"),
        LISTTABLE3("ListTable3"),
        LISTTABLE4("ListTable4"),
        LISTTABLE5DARK("ListTable5Dark"),
        LISTTABLE6COLORFUL("ListTable6Colorful"),
        LISTTABLE7COLORFUL("ListTable7Colorful"),
        LISTTABLE1LIGHTACCENT1("ListTable1LightAccent1"),
        LISTTABLE2ACCENT1("ListTable2Accent1"),
        LISTTABLE3ACCENT1("ListTable3Accent1"),
        LISTTABLE4ACCENT1("ListTable4Accent1"),
        LISTTABLE5DARKACCENT1("ListTable5DarkAccent1"),
        LISTTABLE6COLORFULACCENT1("ListTable6ColorfulAccent1"),
        LISTTABLE7COLORFULACCENT1("ListTable7ColorfulAccent1"),
        LISTTABLE1LIGHTACCENT2("ListTable1LightAccent2"),
        LISTTABLE2ACCENT2("ListTable2Accent2"),
        LISTTABLE3ACCENT2("ListTable3Accent2"),
        LISTTABLE4ACCENT2("ListTable4Accent2"),
        LISTTABLE5DARKACCENT2("ListTable5DarkAccent2"),
        LISTTABLE6COLORFULACCENT2("ListTable6ColorfulAccent2"),
        LISTTABLE7COLORFULACCENT2("ListTable7ColorfulAccent2"),
        LISTTABLE1LIGHTACCENT3("ListTable1LightAccent3"),
        LISTTABLE2ACCENT3("ListTable2Accent3"),
        LISTTABLE3ACCENT3("ListTable3Accent3"),
        LISTTABLE4ACCENT3("ListTable4Accent3"),
        LISTTABLE5DARKACCENT3("ListTable5DarkAccent3"),
        LISTTABLE6COLORFULACCENT3("ListTable6ColorfulAccent3"),
        LISTTABLE7COLORFULACCENT3("ListTable7ColorfulAccent3"),
        LISTTABLE1LIGHTACCENT4("ListTable1LightAccent4"),
        LISTTABLE2ACCENT4("ListTable2Accent4"),
        LISTTABLE3ACCENT4("ListTable3Accent4"),
        LISTTABLE4ACCENT4("ListTable4Accent4"),
        LISTTABLE5DARKACCENT4("ListTable5DarkAccent4"),
        LISTTABLE6COLORFULACCENT4("ListTable6ColorfulAccent4"),
        LISTTABLE7COLORFULACCENT4("ListTable7ColorfulAccent4"),
        LISTTABLE1LIGHTACCENT5("ListTable1LightAccent5"),
        LISTTABLE2ACCENT5("ListTable2Accent5"),
        LISTTABLE3ACCENT5("ListTable3Accent5"),
        LISTTABLE4ACCENT5("ListTable4Accent5"),
        LISTTABLE5DARKACCENT5("ListTable5DarkAccent5"),
        LISTTABLE6COLORFULACCENT5("ListTable6ColorfulAccent5"),
        LISTTABLE7COLORFULACCENT5("ListTable7ColorfulAccent5"),
        LISTTABLE1LIGHTACCENT6("ListTable1LightAccent6"),
        LISTTABLE2ACCENT6("ListTable2Accent6"),
        LISTTABLE3ACCENT6("ListTable3Accent6"),
        LISTTABLE4ACCENT6("ListTable4Accent6"),
        LISTTABLE5DARKACCENT6("ListTable5DarkAccent6"),
        LISTTABLE6COLORFULACCENT6("ListTable6ColorfulAccent6"),
        LISTTABLE7COLORFULACCENT6("ListTable7ColorfulAccent6"),
        SMARTLINK("SmartLink"),
        MENTION("Mention"),
        SMARTHYPERLINK("SmartHyperlink"),
        HASHTAG("Hashtag"),
        UNRESOLVEDMENTION("UnresolvedMention"),
        USER("User"),
        NIL("Nil");

        private String value;

        StyleIdentifierEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StyleIdentifierEnum fromValue(String text) {
            for (StyleIdentifierEnum b : StyleIdentifierEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< StyleIdentifierEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final StyleIdentifierEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StyleIdentifierEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StyleIdentifierEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the font animation effect.
     */
    @JsonAdapter(TextEffectEnum.Adapter.class)
    public enum TextEffectEnum {
        NONE("None"),
        LASVEGASLIGHTS("LasVegasLights"),
        BLINKINGBACKGROUND("BlinkingBackground"),
        SPARKLETEXT("SparkleText"),
        MARCHINGBLACKANTS("MarchingBlackAnts"),
        MARCHINGREDANTS("MarchingRedAnts"),
        SHIMMER("Shimmer");

        private String value;

        TextEffectEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TextEffectEnum fromValue(String text) {
            for (TextEffectEnum b : TextEffectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TextEffectEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TextEffectEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TextEffectEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TextEffectEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the type of underline applied to the font.
     */
    @JsonAdapter(UnderlineEnum.Adapter.class)
    public enum UnderlineEnum {
        NONE("None"),
        SINGLE("Single"),
        WORDS("Words"),
        DOUBLE("Double"),
        DOTTED("Dotted"),
        THICK("Thick"),
        DASH("Dash"),
        DOTDASH("DotDash"),
        DOTDOTDASH("DotDotDash"),
        WAVY("Wavy"),
        DOTTEDHEAVY("DottedHeavy"),
        DASHHEAVY("DashHeavy"),
        DOTDASHHEAVY("DotDashHeavy"),
        DOTDOTDASHHEAVY("DotDotDashHeavy"),
        WAVYHEAVY("WavyHeavy"),
        DASHLONG("DashLong"),
        WAVYDOUBLE("WavyDouble"),
        DASHLONGHEAVY("DashLongHeavy");

        private String value;

        UnderlineEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static UnderlineEnum fromValue(String text) {
            for (UnderlineEnum b : UnderlineEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< UnderlineEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final UnderlineEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public UnderlineEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return UnderlineEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("AllCaps")
    protected Boolean allCaps;

    @SerializedName("Bidi")
    protected Boolean bidi;

    @SerializedName("Bold")
    protected Boolean bold;

    @SerializedName("BoldBi")
    protected Boolean boldBi;

    @SerializedName("Border")
    protected Border border;

    @SerializedName("Color")
    protected XmlColor color;

    @SerializedName("ComplexScript")
    protected Boolean complexScript;

    @SerializedName("DoubleStrikeThrough")
    protected Boolean doubleStrikeThrough;

    @SerializedName("Emboss")
    protected Boolean emboss;

    @SerializedName("Engrave")
    protected Boolean engrave;

    @SerializedName("Hidden")
    protected Boolean hidden;

    @SerializedName("HighlightColor")
    protected XmlColor highlightColor;

    @SerializedName("Italic")
    protected Boolean italic;

    @SerializedName("ItalicBi")
    protected Boolean italicBi;

    @SerializedName("Kerning")
    protected Double kerning;

    @SerializedName("LocaleId")
    protected Integer localeId;

    @SerializedName("LocaleIdBi")
    protected Integer localeIdBi;

    @SerializedName("LocaleIdFarEast")
    protected Integer localeIdFarEast;

    @SerializedName("Name")
    protected String name;

    @SerializedName("NameAscii")
    protected String nameAscii;

    @SerializedName("NameBi")
    protected String nameBi;

    @SerializedName("NameFarEast")
    protected String nameFarEast;

    @SerializedName("NameOther")
    protected String nameOther;

    @SerializedName("NoProofing")
    protected Boolean noProofing;

    @SerializedName("Outline")
    protected Boolean outline;

    @SerializedName("Position")
    protected Double position;

    @SerializedName("Scaling")
    protected Integer scaling;

    @SerializedName("Shadow")
    protected Boolean shadow;

    @SerializedName("Size")
    protected Double size;

    @SerializedName("SizeBi")
    protected Double sizeBi;

    @SerializedName("SmallCaps")
    protected Boolean smallCaps;

    @SerializedName("Spacing")
    protected Double spacing;

    @SerializedName("StrikeThrough")
    protected Boolean strikeThrough;

    @SerializedName("StyleIdentifier")
    protected StyleIdentifierEnum styleIdentifier;

    @SerializedName("StyleName")
    protected String styleName;

    @SerializedName("Subscript")
    protected Boolean subscript;

    @SerializedName("Superscript")
    protected Boolean superscript;

    @SerializedName("TextEffect")
    protected TextEffectEnum textEffect;

    @SerializedName("Underline")
    protected UnderlineEnum underline;

    @SerializedName("UnderlineColor")
    protected XmlColor underlineColor;
    /**
     * Gets or sets a value indicating whether the font is formatted as all capital letters.
    * @return allCaps
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as all capital letters.")
    public Boolean getAllCaps() {
        return allCaps;
    }

    public Font allCaps(Boolean allCaps) {
        this.allCaps = allCaps;
        return this;
    }

    public void setAllCaps(Boolean allCaps) {
        this.allCaps = allCaps;
    }


    /**
     * Gets or sets a value indicating whether the contents of this run shall have right-to-left characteristics.
     * This property, when on, shall not be used with strongly left-to-right text. Any behavior under that condition is unspecified. This property, when off, shall not be used with strong right-to-left text. Any behavior under that condition is unspecified.When the contents of this run are displayed, all characters shall be treated as complex script characters for formatting purposes. This means that BoldBi, ItalicBi, SizeBi and a corresponding font name will be used when rendering this run.Also, when the contents of this run are displayed, this property acts as a right-to-left override for characters which are classified as "weak types" and "neutral types".
    * @return bidi
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the contents of this run shall have right-to-left characteristics. This property, when on, shall not be used with strongly left-to-right text. Any behavior under that condition is unspecified. This property, when off, shall not be used with strong right-to-left text. Any behavior under that condition is unspecified.When the contents of this run are displayed, all characters shall be treated as complex script characters for formatting purposes. This means that BoldBi, ItalicBi, SizeBi and a corresponding font name will be used when rendering this run.Also, when the contents of this run are displayed, this property acts as a right-to-left override for characters which are classified as \"weak types\" and \"neutral types\".")
    public Boolean getBidi() {
        return bidi;
    }

    public Font bidi(Boolean bidi) {
        this.bidi = bidi;
        return this;
    }

    public void setBidi(Boolean bidi) {
        this.bidi = bidi;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as bold.
    * @return bold
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as bold.")
    public Boolean getBold() {
        return bold;
    }

    public Font bold(Boolean bold) {
        this.bold = bold;
        return this;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }


    /**
     * Gets or sets a value indicating whether the right-to-left text is formatted as bold.
    * @return boldBi
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the right-to-left text is formatted as bold.")
    public Boolean getBoldBi() {
        return boldBi;
    }

    public Font boldBi(Boolean boldBi) {
        this.boldBi = boldBi;
        return this;
    }

    public void setBoldBi(Boolean boldBi) {
        this.boldBi = boldBi;
    }


    /**
     * Gets or sets the border object, that specifies border for the font.
    * @return border
    **/
    @ApiModelProperty(value = "Gets or sets the border object, that specifies border for the font.")
    public Border getBorder() {
        return border;
    }

    public Font border(Border border) {
        this.border = border;
        return this;
    }

    public void setBorder(Border border) {
        this.border = border;
    }


    /**
     * Gets or sets the color of the font.
    * @return color
    **/
    @ApiModelProperty(value = "Gets or sets the color of the font.")
    public XmlColor getColor() {
        return color;
    }

    public Font color(XmlColor color) {
        this.color = color;
        return this;
    }

    public void setColor(XmlColor color) {
        this.color = color;
    }


    /**
     * Gets or sets a value indicating whether the contents of this run shall be treated as complex script text regardless of their Unicode character values when determining the formatting for this run.
    * @return complexScript
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the contents of this run shall be treated as complex script text regardless of their Unicode character values when determining the formatting for this run.")
    public Boolean getComplexScript() {
        return complexScript;
    }

    public Font complexScript(Boolean complexScript) {
        this.complexScript = complexScript;
        return this;
    }

    public void setComplexScript(Boolean complexScript) {
        this.complexScript = complexScript;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as double strikethrough text.
    * @return doubleStrikeThrough
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as double strikethrough text.")
    public Boolean getDoubleStrikeThrough() {
        return doubleStrikeThrough;
    }

    public Font doubleStrikeThrough(Boolean doubleStrikeThrough) {
        this.doubleStrikeThrough = doubleStrikeThrough;
        return this;
    }

    public void setDoubleStrikeThrough(Boolean doubleStrikeThrough) {
        this.doubleStrikeThrough = doubleStrikeThrough;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as embossed.
    * @return emboss
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as embossed.")
    public Boolean getEmboss() {
        return emboss;
    }

    public Font emboss(Boolean emboss) {
        this.emboss = emboss;
        return this;
    }

    public void setEmboss(Boolean emboss) {
        this.emboss = emboss;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as engraved.
    * @return engrave
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as engraved.")
    public Boolean getEngrave() {
        return engrave;
    }

    public Font engrave(Boolean engrave) {
        this.engrave = engrave;
        return this;
    }

    public void setEngrave(Boolean engrave) {
        this.engrave = engrave;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as hidden text.
    * @return hidden
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as hidden text.")
    public Boolean getHidden() {
        return hidden;
    }

    public Font hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }


    /**
     * Gets or sets the highlight (marker) color.
    * @return highlightColor
    **/
    @ApiModelProperty(value = "Gets or sets the highlight (marker) color.")
    public XmlColor getHighlightColor() {
        return highlightColor;
    }

    public Font highlightColor(XmlColor highlightColor) {
        this.highlightColor = highlightColor;
        return this;
    }

    public void setHighlightColor(XmlColor highlightColor) {
        this.highlightColor = highlightColor;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as italic.
    * @return italic
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as italic.")
    public Boolean getItalic() {
        return italic;
    }

    public Font italic(Boolean italic) {
        this.italic = italic;
        return this;
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }


    /**
     * Gets or sets a value indicating whether the right-to-left text is formatted as italic.
    * @return italicBi
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the right-to-left text is formatted as italic.")
    public Boolean getItalicBi() {
        return italicBi;
    }

    public Font italicBi(Boolean italicBi) {
        this.italicBi = italicBi;
        return this;
    }

    public void setItalicBi(Boolean italicBi) {
        this.italicBi = italicBi;
    }


    /**
     * Gets or sets the font size at which kerning starts.
    * @return kerning
    **/
    @ApiModelProperty(value = "Gets or sets the font size at which kerning starts.")
    public Double getKerning() {
        return kerning;
    }

    public Font kerning(Double kerning) {
        this.kerning = kerning;
        return this;
    }

    public void setKerning(Double kerning) {
        this.kerning = kerning;
    }


    /**
     * Gets or sets the locale identifier (language) of the formatted characters.
     * For the list of locale identifiers see http://www.microsoft.com/globaldev/reference/lcid-all.mspx.
    * @return localeId
    **/
    @ApiModelProperty(value = "Gets or sets the locale identifier (language) of the formatted characters. For the list of locale identifiers see http://www.microsoft.com/globaldev/reference/lcid-all.mspx.")
    public Integer getLocaleId() {
        return localeId;
    }

    public Font localeId(Integer localeId) {
        this.localeId = localeId;
        return this;
    }

    public void setLocaleId(Integer localeId) {
        this.localeId = localeId;
    }


    /**
     * Gets or sets the locale identifier (language) of the formatted right-to-left characters.
     * For the list of locale identifiers see http://www.microsoft.com/globaldev/reference/lcid-all.mspx.
    * @return localeIdBi
    **/
    @ApiModelProperty(value = "Gets or sets the locale identifier (language) of the formatted right-to-left characters. For the list of locale identifiers see http://www.microsoft.com/globaldev/reference/lcid-all.mspx.")
    public Integer getLocaleIdBi() {
        return localeIdBi;
    }

    public Font localeIdBi(Integer localeIdBi) {
        this.localeIdBi = localeIdBi;
        return this;
    }

    public void setLocaleIdBi(Integer localeIdBi) {
        this.localeIdBi = localeIdBi;
    }


    /**
     * Gets or sets the locale identifier (language) of the formatted Asian characters.
     * For the list of locale identifiers see http://www.microsoft.com/globaldev/reference/lcid-all.mspx.
    * @return localeIdFarEast
    **/
    @ApiModelProperty(value = "Gets or sets the locale identifier (language) of the formatted Asian characters. For the list of locale identifiers see http://www.microsoft.com/globaldev/reference/lcid-all.mspx.")
    public Integer getLocaleIdFarEast() {
        return localeIdFarEast;
    }

    public Font localeIdFarEast(Integer localeIdFarEast) {
        this.localeIdFarEast = localeIdFarEast;
        return this;
    }

    public void setLocaleIdFarEast(Integer localeIdFarEast) {
        this.localeIdFarEast = localeIdFarEast;
    }


    /**
     * Gets or sets the name of the font.
    * @return name
    **/
    @ApiModelProperty(value = "Gets or sets the name of the font.")
    public String getName() {
        return name;
    }

    public Font name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets or sets the font used for Latin text (characters with character codes from 0 (zero) through 127).
    * @return nameAscii
    **/
    @ApiModelProperty(value = "Gets or sets the font used for Latin text (characters with character codes from 0 (zero) through 127).")
    public String getNameAscii() {
        return nameAscii;
    }

    public Font nameAscii(String nameAscii) {
        this.nameAscii = nameAscii;
        return this;
    }

    public void setNameAscii(String nameAscii) {
        this.nameAscii = nameAscii;
    }


    /**
     * Gets or sets the name of the font in a right-to-left language document.
    * @return nameBi
    **/
    @ApiModelProperty(value = "Gets or sets the name of the font in a right-to-left language document.")
    public String getNameBi() {
        return nameBi;
    }

    public Font nameBi(String nameBi) {
        this.nameBi = nameBi;
        return this;
    }

    public void setNameBi(String nameBi) {
        this.nameBi = nameBi;
    }


    /**
     * Gets or sets the East Asian font name.
    * @return nameFarEast
    **/
    @ApiModelProperty(value = "Gets or sets the East Asian font name.")
    public String getNameFarEast() {
        return nameFarEast;
    }

    public Font nameFarEast(String nameFarEast) {
        this.nameFarEast = nameFarEast;
        return this;
    }

    public void setNameFarEast(String nameFarEast) {
        this.nameFarEast = nameFarEast;
    }


    /**
     * Gets or sets the font used for characters with character codes from 128 through 255.
    * @return nameOther
    **/
    @ApiModelProperty(value = "Gets or sets the font used for characters with character codes from 128 through 255.")
    public String getNameOther() {
        return nameOther;
    }

    public Font nameOther(String nameOther) {
        this.nameOther = nameOther;
        return this;
    }

    public void setNameOther(String nameOther) {
        this.nameOther = nameOther;
    }


    /**
     * Gets or sets a value indicating whether the formatted characters are not to be spell checked.
    * @return noProofing
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the formatted characters are not to be spell checked.")
    public Boolean getNoProofing() {
        return noProofing;
    }

    public Font noProofing(Boolean noProofing) {
        this.noProofing = noProofing;
        return this;
    }

    public void setNoProofing(Boolean noProofing) {
        this.noProofing = noProofing;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as outline.
    * @return outline
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as outline.")
    public Boolean getOutline() {
        return outline;
    }

    public Font outline(Boolean outline) {
        this.outline = outline;
        return this;
    }

    public void setOutline(Boolean outline) {
        this.outline = outline;
    }


    /**
     * Gets or sets the position of text (in points) relative to the base line.
     * A positive number raises the text, and a negative number lowers it.
    * @return position
    **/
    @ApiModelProperty(value = "Gets or sets the position of text (in points) relative to the base line. A positive number raises the text, and a negative number lowers it.")
    public Double getPosition() {
        return position;
    }

    public Font position(Double position) {
        this.position = position;
        return this;
    }

    public void setPosition(Double position) {
        this.position = position;
    }


    /**
     * Gets or sets character width scaling in percent.
    * @return scaling
    **/
    @ApiModelProperty(value = "Gets or sets character width scaling in percent.")
    public Integer getScaling() {
        return scaling;
    }

    public Font scaling(Integer scaling) {
        this.scaling = scaling;
        return this;
    }

    public void setScaling(Integer scaling) {
        this.scaling = scaling;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as shadowed.
    * @return shadow
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as shadowed.")
    public Boolean getShadow() {
        return shadow;
    }

    public Font shadow(Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }


    /**
     * Gets or sets the font size in points.
    * @return size
    **/
    @ApiModelProperty(value = "Gets or sets the font size in points.")
    public Double getSize() {
        return size;
    }

    public Font size(Double size) {
        this.size = size;
        return this;
    }

    public void setSize(Double size) {
        this.size = size;
    }


    /**
     * Gets or sets the font size in points used in a right-to-left document.
    * @return sizeBi
    **/
    @ApiModelProperty(value = "Gets or sets the font size in points used in a right-to-left document.")
    public Double getSizeBi() {
        return sizeBi;
    }

    public Font sizeBi(Double sizeBi) {
        this.sizeBi = sizeBi;
        return this;
    }

    public void setSizeBi(Double sizeBi) {
        this.sizeBi = sizeBi;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as small capital letters.
    * @return smallCaps
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as small capital letters.")
    public Boolean getSmallCaps() {
        return smallCaps;
    }

    public Font smallCaps(Boolean smallCaps) {
        this.smallCaps = smallCaps;
        return this;
    }

    public void setSmallCaps(Boolean smallCaps) {
        this.smallCaps = smallCaps;
    }


    /**
     * Gets or sets the spacing (in points) between characters.
    * @return spacing
    **/
    @ApiModelProperty(value = "Gets or sets the spacing (in points) between characters.")
    public Double getSpacing() {
        return spacing;
    }

    public Font spacing(Double spacing) {
        this.spacing = spacing;
        return this;
    }

    public void setSpacing(Double spacing) {
        this.spacing = spacing;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as strikethrough text.
    * @return strikeThrough
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as strikethrough text.")
    public Boolean getStrikeThrough() {
        return strikeThrough;
    }

    public Font strikeThrough(Boolean strikeThrough) {
        this.strikeThrough = strikeThrough;
        return this;
    }

    public void setStrikeThrough(Boolean strikeThrough) {
        this.strikeThrough = strikeThrough;
    }


    /**
     * Gets or sets the locale independent style identifier of the character style applied to this formatting.
    * @return styleIdentifier
    **/
    @ApiModelProperty(value = "Gets or sets the locale independent style identifier of the character style applied to this formatting.")
    public StyleIdentifierEnum getStyleIdentifier() {
        return styleIdentifier;
    }

    public Font styleIdentifier(StyleIdentifierEnum styleIdentifier) {
        this.styleIdentifier = styleIdentifier;
        return this;
    }

    public void setStyleIdentifier(StyleIdentifierEnum styleIdentifier) {
        this.styleIdentifier = styleIdentifier;
    }


    /**
     * Gets or sets the name of the character style applied to this formatting.
    * @return styleName
    **/
    @ApiModelProperty(value = "Gets or sets the name of the character style applied to this formatting.")
    public String getStyleName() {
        return styleName;
    }

    public Font styleName(String styleName) {
        this.styleName = styleName;
        return this;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as subscript.
    * @return subscript
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as subscript.")
    public Boolean getSubscript() {
        return subscript;
    }

    public Font subscript(Boolean subscript) {
        this.subscript = subscript;
        return this;
    }

    public void setSubscript(Boolean subscript) {
        this.subscript = subscript;
    }


    /**
     * Gets or sets a value indicating whether the font is formatted as superscript.
    * @return superscript
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the font is formatted as superscript.")
    public Boolean getSuperscript() {
        return superscript;
    }

    public Font superscript(Boolean superscript) {
        this.superscript = superscript;
        return this;
    }

    public void setSuperscript(Boolean superscript) {
        this.superscript = superscript;
    }


    /**
     * Gets or sets the font animation effect.
    * @return textEffect
    **/
    @ApiModelProperty(value = "Gets or sets the font animation effect.")
    public TextEffectEnum getTextEffect() {
        return textEffect;
    }

    public Font textEffect(TextEffectEnum textEffect) {
        this.textEffect = textEffect;
        return this;
    }

    public void setTextEffect(TextEffectEnum textEffect) {
        this.textEffect = textEffect;
    }


    /**
     * Gets or sets the type of underline applied to the font.
    * @return underline
    **/
    @ApiModelProperty(value = "Gets or sets the type of underline applied to the font.")
    public UnderlineEnum getUnderline() {
        return underline;
    }

    public Font underline(UnderlineEnum underline) {
        this.underline = underline;
        return this;
    }

    public void setUnderline(UnderlineEnum underline) {
        this.underline = underline;
    }


    /**
     * Gets or sets the color of the underline applied to the font.
    * @return underlineColor
    **/
    @ApiModelProperty(value = "Gets or sets the color of the underline applied to the font.")
    public XmlColor getUnderlineColor() {
        return underlineColor;
    }

    public Font underlineColor(XmlColor underlineColor) {
        this.underlineColor = underlineColor;
        return this;
    }

    public void setUnderlineColor(XmlColor underlineColor) {
        this.underlineColor = underlineColor;
    }


    public Font() {
        super();
        this.allCaps = null;
        this.bidi = null;
        this.bold = null;
        this.boldBi = null;
        this.border = null;
        this.color = null;
        this.complexScript = null;
        this.doubleStrikeThrough = null;
        this.emboss = null;
        this.engrave = null;
        this.hidden = null;
        this.highlightColor = null;
        this.italic = null;
        this.italicBi = null;
        this.kerning = null;
        this.localeId = null;
        this.localeIdBi = null;
        this.localeIdFarEast = null;
        this.name = null;
        this.nameAscii = null;
        this.nameBi = null;
        this.nameFarEast = null;
        this.nameOther = null;
        this.noProofing = null;
        this.outline = null;
        this.position = null;
        this.scaling = null;
        this.shadow = null;
        this.size = null;
        this.sizeBi = null;
        this.smallCaps = null;
        this.spacing = null;
        this.strikeThrough = null;
        this.styleIdentifier = null;
        this.styleName = null;
        this.subscript = null;
        this.superscript = null;
        this.textEffect = null;
        this.underline = null;
        this.underlineColor = null;
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
        super.validate();

        if (this.border != null) {
            this.border.validate();
        }



        if (this.color != null) {
            this.color.validate();
        }








        if (this.highlightColor != null) {
            this.highlightColor.validate();
        }






























        if (this.underlineColor != null) {
            this.underlineColor.validate();
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

        Font font = (Font) o;
        return
            Objects.equals(this.allCaps, font.allCaps) &&
            Objects.equals(this.bidi, font.bidi) &&
            Objects.equals(this.bold, font.bold) &&
            Objects.equals(this.boldBi, font.boldBi) &&
            Objects.equals(this.border, font.border) &&
            Objects.equals(this.color, font.color) &&
            Objects.equals(this.complexScript, font.complexScript) &&
            Objects.equals(this.doubleStrikeThrough, font.doubleStrikeThrough) &&
            Objects.equals(this.emboss, font.emboss) &&
            Objects.equals(this.engrave, font.engrave) &&
            Objects.equals(this.hidden, font.hidden) &&
            Objects.equals(this.highlightColor, font.highlightColor) &&
            Objects.equals(this.italic, font.italic) &&
            Objects.equals(this.italicBi, font.italicBi) &&
            Objects.equals(this.kerning, font.kerning) &&
            Objects.equals(this.localeId, font.localeId) &&
            Objects.equals(this.localeIdBi, font.localeIdBi) &&
            Objects.equals(this.localeIdFarEast, font.localeIdFarEast) &&
            Objects.equals(this.name, font.name) &&
            Objects.equals(this.nameAscii, font.nameAscii) &&
            Objects.equals(this.nameBi, font.nameBi) &&
            Objects.equals(this.nameFarEast, font.nameFarEast) &&
            Objects.equals(this.nameOther, font.nameOther) &&
            Objects.equals(this.noProofing, font.noProofing) &&
            Objects.equals(this.outline, font.outline) &&
            Objects.equals(this.position, font.position) &&
            Objects.equals(this.scaling, font.scaling) &&
            Objects.equals(this.shadow, font.shadow) &&
            Objects.equals(this.size, font.size) &&
            Objects.equals(this.sizeBi, font.sizeBi) &&
            Objects.equals(this.smallCaps, font.smallCaps) &&
            Objects.equals(this.spacing, font.spacing) &&
            Objects.equals(this.strikeThrough, font.strikeThrough) &&
            Objects.equals(this.styleIdentifier, font.styleIdentifier) &&
            Objects.equals(this.styleName, font.styleName) &&
            Objects.equals(this.subscript, font.subscript) &&
            Objects.equals(this.superscript, font.superscript) &&
            Objects.equals(this.textEffect, font.textEffect) &&
            Objects.equals(this.underline, font.underline) &&
            Objects.equals(this.underlineColor, font.underlineColor) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allCaps, bidi, bold, boldBi, border, color, complexScript, doubleStrikeThrough, emboss, engrave, hidden, highlightColor, italic, italicBi, kerning, localeId, localeIdBi, localeIdFarEast, name, nameAscii, nameBi, nameFarEast, nameOther, noProofing, outline, position, scaling, shadow, size, sizeBi, smallCaps, spacing, strikeThrough, styleIdentifier, styleName, subscript, superscript, textEffect, underline, underlineColor, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Font {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    allCaps: ").append(toIndentedString(getAllCaps())).append("\n");
    sb.append("    bidi: ").append(toIndentedString(getBidi())).append("\n");
    sb.append("    bold: ").append(toIndentedString(getBold())).append("\n");
    sb.append("    boldBi: ").append(toIndentedString(getBoldBi())).append("\n");
    sb.append("    border: ").append(toIndentedString(getBorder())).append("\n");
    sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
    sb.append("    complexScript: ").append(toIndentedString(getComplexScript())).append("\n");
    sb.append("    doubleStrikeThrough: ").append(toIndentedString(getDoubleStrikeThrough())).append("\n");
    sb.append("    emboss: ").append(toIndentedString(getEmboss())).append("\n");
    sb.append("    engrave: ").append(toIndentedString(getEngrave())).append("\n");
    sb.append("    hidden: ").append(toIndentedString(getHidden())).append("\n");
    sb.append("    highlightColor: ").append(toIndentedString(getHighlightColor())).append("\n");
    sb.append("    italic: ").append(toIndentedString(getItalic())).append("\n");
    sb.append("    italicBi: ").append(toIndentedString(getItalicBi())).append("\n");
    sb.append("    kerning: ").append(toIndentedString(getKerning())).append("\n");
    sb.append("    localeId: ").append(toIndentedString(getLocaleId())).append("\n");
    sb.append("    localeIdBi: ").append(toIndentedString(getLocaleIdBi())).append("\n");
    sb.append("    localeIdFarEast: ").append(toIndentedString(getLocaleIdFarEast())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    nameAscii: ").append(toIndentedString(getNameAscii())).append("\n");
    sb.append("    nameBi: ").append(toIndentedString(getNameBi())).append("\n");
    sb.append("    nameFarEast: ").append(toIndentedString(getNameFarEast())).append("\n");
    sb.append("    nameOther: ").append(toIndentedString(getNameOther())).append("\n");
    sb.append("    noProofing: ").append(toIndentedString(getNoProofing())).append("\n");
    sb.append("    outline: ").append(toIndentedString(getOutline())).append("\n");
    sb.append("    position: ").append(toIndentedString(getPosition())).append("\n");
    sb.append("    scaling: ").append(toIndentedString(getScaling())).append("\n");
    sb.append("    shadow: ").append(toIndentedString(getShadow())).append("\n");
    sb.append("    size: ").append(toIndentedString(getSize())).append("\n");
    sb.append("    sizeBi: ").append(toIndentedString(getSizeBi())).append("\n");
    sb.append("    smallCaps: ").append(toIndentedString(getSmallCaps())).append("\n");
    sb.append("    spacing: ").append(toIndentedString(getSpacing())).append("\n");
    sb.append("    strikeThrough: ").append(toIndentedString(getStrikeThrough())).append("\n");
    sb.append("    styleIdentifier: ").append(toIndentedString(getStyleIdentifier())).append("\n");
    sb.append("    styleName: ").append(toIndentedString(getStyleName())).append("\n");
    sb.append("    subscript: ").append(toIndentedString(getSubscript())).append("\n");
    sb.append("    superscript: ").append(toIndentedString(getSuperscript())).append("\n");
    sb.append("    textEffect: ").append(toIndentedString(getTextEffect())).append("\n");
    sb.append("    underline: ").append(toIndentedString(getUnderline())).append("\n");
    sb.append("    underlineColor: ").append(toIndentedString(getUnderlineColor())).append("\n");
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
