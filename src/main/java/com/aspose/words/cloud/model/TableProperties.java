/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TableProperties.java">
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
 * DTO container with table properties.
 */
@ApiModel(description = "DTO container with table properties.")
public class TableProperties extends LinkElement {
    /**
     * Gets or sets the option that controls how an inline table is aligned in the document.
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
     * Gets or sets the locale independent style identifier of the table style applied to this table.
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
     * Gets or sets the bit flags, that specify how a table style is applied to this table.
     */
    @JsonAdapter(StyleOptionsEnum.Adapter.class)
    public enum StyleOptionsEnum {
        NONE("None"),
        FIRSTROW("FirstRow"),
        LASTROW("LastRow"),
        FIRSTCOLUMN("FirstColumn"),
        LASTCOLUMN("LastColumn"),
        ROWBANDS("RowBands"),
        DEFAULT("Default"),
        COLUMNBANDS("ColumnBands"),
        DEFAULT2003("Default2003");

        private String value;

        StyleOptionsEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StyleOptionsEnum fromValue(String text) {
            for (StyleOptionsEnum b : StyleOptionsEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< StyleOptionsEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final StyleOptionsEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StyleOptionsEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StyleOptionsEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls text wrapping for the table.
     */
    @JsonAdapter(TextWrappingEnum.Adapter.class)
    public enum TextWrappingEnum {
        DEFAULT("Default"),
        NONE("None"),
        AROUND("Around");

        private String value;

        TextWrappingEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TextWrappingEnum fromValue(String text) {
            for (TextWrappingEnum b : TextWrappingEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TextWrappingEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TextWrappingEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TextWrappingEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TextWrappingEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Alignment")
    private AlignmentEnum alignment = null;

    @SerializedName("AllowAutoFit")
    private Boolean allowAutoFit = null;

    @SerializedName("Bidi")
    private Boolean bidi = null;

    @SerializedName("BottomPadding")
    private Double bottomPadding = null;

    @SerializedName("CellSpacing")
    private Double cellSpacing = null;

    @SerializedName("LeftIndent")
    private Double leftIndent = null;

    @SerializedName("LeftPadding")
    private Double leftPadding = null;

    @SerializedName("PreferredWidth")
    private PreferredWidth preferredWidth = null;

    @SerializedName("RightPadding")
    private Double rightPadding = null;

    @SerializedName("StyleIdentifier")
    private StyleIdentifierEnum styleIdentifier = null;

    @SerializedName("StyleName")
    private String styleName = null;

    @SerializedName("StyleOptions")
    private StyleOptionsEnum styleOptions = null;

    @SerializedName("TextWrapping")
    private TextWrappingEnum textWrapping = null;

    @SerializedName("TopPadding")
    private Double topPadding = null;
    public TableProperties alignment(AlignmentEnum alignment) {
        this.alignment = alignment;
        return this;
    }

    /**
     * Gets or sets the option that controls how an inline table is aligned in the document.
    * @return alignment
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how an inline table is aligned in the document.")
    public AlignmentEnum getAlignment() {
        return alignment;
    }

    public void setAlignment(AlignmentEnum alignment) {
        this.alignment = alignment;
    }

    public TableProperties allowAutoFit(Boolean allowAutoFit) {
        this.allowAutoFit = allowAutoFit;
        return this;
    }

    /**
     * Gets or sets a value indicating whether to automatically resize cells in a table to fit their contents.
    * @return allowAutoFit
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to automatically resize cells in a table to fit their contents.")
    public Boolean getAllowAutoFit() {
        return allowAutoFit;
    }

    public void setAllowAutoFit(Boolean allowAutoFit) {
        this.allowAutoFit = allowAutoFit;
    }

    public TableProperties bidi(Boolean bidi) {
        this.bidi = bidi;
        return this;
    }

    /**
     * Gets or sets a value indicating whether this is a right-to-left table.
    * @return bidi
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this is a right-to-left table.")
    public Boolean getBidi() {
        return bidi;
    }

    public void setBidi(Boolean bidi) {
        this.bidi = bidi;
    }

    public TableProperties bottomPadding(Double bottomPadding) {
        this.bottomPadding = bottomPadding;
        return this;
    }

    /**
     * Gets or sets the amount of space (in points) to add below the contents of cells.
    * @return bottomPadding
    **/
    @ApiModelProperty(value = "Gets or sets the amount of space (in points) to add below the contents of cells.")
    public Double getBottomPadding() {
        return bottomPadding;
    }

    public void setBottomPadding(Double bottomPadding) {
        this.bottomPadding = bottomPadding;
    }

    public TableProperties cellSpacing(Double cellSpacing) {
        this.cellSpacing = cellSpacing;
        return this;
    }

    /**
     * Gets or sets the amount of space (in points) between the cells.
    * @return cellSpacing
    **/
    @ApiModelProperty(value = "Gets or sets the amount of space (in points) between the cells.")
    public Double getCellSpacing() {
        return cellSpacing;
    }

    public void setCellSpacing(Double cellSpacing) {
        this.cellSpacing = cellSpacing;
    }

    public TableProperties leftIndent(Double leftIndent) {
        this.leftIndent = leftIndent;
        return this;
    }

    /**
     * Gets or sets the value, that represents the left indent of the table.
    * @return leftIndent
    **/
    @ApiModelProperty(value = "Gets or sets the value, that represents the left indent of the table.")
    public Double getLeftIndent() {
        return leftIndent;
    }

    public void setLeftIndent(Double leftIndent) {
        this.leftIndent = leftIndent;
    }

    public TableProperties leftPadding(Double leftPadding) {
        this.leftPadding = leftPadding;
        return this;
    }

    /**
     * Gets or sets the amount of space (in points) to add to the left of the contents of cells.
    * @return leftPadding
    **/
    @ApiModelProperty(value = "Gets or sets the amount of space (in points) to add to the left of the contents of cells.")
    public Double getLeftPadding() {
        return leftPadding;
    }

    public void setLeftPadding(Double leftPadding) {
        this.leftPadding = leftPadding;
    }

    public TableProperties preferredWidth(PreferredWidth preferredWidth) {
        this.preferredWidth = preferredWidth;
        return this;
    }

    /**
     * Gets or sets the table preferred width.
     * Preferred width can be specified as a percentage, number of points or a special "auto" value.
    * @return preferredWidth
    **/
    @ApiModelProperty(value = "Gets or sets the table preferred width. Preferred width can be specified as a percentage, number of points or a special \"auto\" value.")
    public PreferredWidth getPreferredWidth() {
        return preferredWidth;
    }

    public void setPreferredWidth(PreferredWidth preferredWidth) {
        this.preferredWidth = preferredWidth;
    }

    public TableProperties rightPadding(Double rightPadding) {
        this.rightPadding = rightPadding;
        return this;
    }

    /**
     * Gets or sets the amount of space (in points) to add to the right of the contents of cells.
    * @return rightPadding
    **/
    @ApiModelProperty(value = "Gets or sets the amount of space (in points) to add to the right of the contents of cells.")
    public Double getRightPadding() {
        return rightPadding;
    }

    public void setRightPadding(Double rightPadding) {
        this.rightPadding = rightPadding;
    }

    public TableProperties styleIdentifier(StyleIdentifierEnum styleIdentifier) {
        this.styleIdentifier = styleIdentifier;
        return this;
    }

    /**
     * Gets or sets the locale independent style identifier of the table style applied to this table.
    * @return styleIdentifier
    **/
    @ApiModelProperty(value = "Gets or sets the locale independent style identifier of the table style applied to this table.")
    public StyleIdentifierEnum getStyleIdentifier() {
        return styleIdentifier;
    }

    public void setStyleIdentifier(StyleIdentifierEnum styleIdentifier) {
        this.styleIdentifier = styleIdentifier;
    }

    public TableProperties styleName(String styleName) {
        this.styleName = styleName;
        return this;
    }

    /**
     * Gets or sets the name of the table style applied to this table.
    * @return styleName
    **/
    @ApiModelProperty(value = "Gets or sets the name of the table style applied to this table.")
    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public TableProperties styleOptions(StyleOptionsEnum styleOptions) {
        this.styleOptions = styleOptions;
        return this;
    }

    /**
     * Gets or sets the bit flags, that specify how a table style is applied to this table.
    * @return styleOptions
    **/
    @ApiModelProperty(value = "Gets or sets the bit flags, that specify how a table style is applied to this table.")
    public StyleOptionsEnum getStyleOptions() {
        return styleOptions;
    }

    public void setStyleOptions(StyleOptionsEnum styleOptions) {
        this.styleOptions = styleOptions;
    }

    public TableProperties textWrapping(TextWrappingEnum textWrapping) {
        this.textWrapping = textWrapping;
        return this;
    }

    /**
     * Gets or sets the option that controls text wrapping for the table.
    * @return textWrapping
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls text wrapping for the table.")
    public TextWrappingEnum getTextWrapping() {
        return textWrapping;
    }

    public void setTextWrapping(TextWrappingEnum textWrapping) {
        this.textWrapping = textWrapping;
    }

    public TableProperties topPadding(Double topPadding) {
        this.topPadding = topPadding;
        return this;
    }

    /**
     * Gets or sets the amount of space (in points) to add above the contents of cells.
    * @return topPadding
    **/
    @ApiModelProperty(value = "Gets or sets the amount of space (in points) to add above the contents of cells.")
    public Double getTopPadding() {
        return topPadding;
    }

    public void setTopPadding(Double topPadding) {
        this.topPadding = topPadding;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TableProperties tableProperties = (TableProperties) o;
        return
            Objects.equals(this.alignment, tableProperties.alignment) &&
            Objects.equals(this.allowAutoFit, tableProperties.allowAutoFit) &&
            Objects.equals(this.bidi, tableProperties.bidi) &&
            Objects.equals(this.bottomPadding, tableProperties.bottomPadding) &&
            Objects.equals(this.cellSpacing, tableProperties.cellSpacing) &&
            Objects.equals(this.leftIndent, tableProperties.leftIndent) &&
            Objects.equals(this.leftPadding, tableProperties.leftPadding) &&
            Objects.equals(this.preferredWidth, tableProperties.preferredWidth) &&
            Objects.equals(this.rightPadding, tableProperties.rightPadding) &&
            Objects.equals(this.styleIdentifier, tableProperties.styleIdentifier) &&
            Objects.equals(this.styleName, tableProperties.styleName) &&
            Objects.equals(this.styleOptions, tableProperties.styleOptions) &&
            Objects.equals(this.textWrapping, tableProperties.textWrapping) &&
            Objects.equals(this.topPadding, tableProperties.topPadding) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, allowAutoFit, bidi, bottomPadding, cellSpacing, leftIndent, leftPadding, preferredWidth, rightPadding, styleIdentifier, styleName, styleOptions, textWrapping, topPadding, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    allowAutoFit: ").append(toIndentedString(allowAutoFit)).append("\n");
    sb.append("    bidi: ").append(toIndentedString(bidi)).append("\n");
    sb.append("    bottomPadding: ").append(toIndentedString(bottomPadding)).append("\n");
    sb.append("    cellSpacing: ").append(toIndentedString(cellSpacing)).append("\n");
    sb.append("    leftIndent: ").append(toIndentedString(leftIndent)).append("\n");
    sb.append("    leftPadding: ").append(toIndentedString(leftPadding)).append("\n");
    sb.append("    preferredWidth: ").append(toIndentedString(preferredWidth)).append("\n");
    sb.append("    rightPadding: ").append(toIndentedString(rightPadding)).append("\n");
    sb.append("    styleIdentifier: ").append(toIndentedString(styleIdentifier)).append("\n");
    sb.append("    styleName: ").append(toIndentedString(styleName)).append("\n");
    sb.append("    styleOptions: ").append(toIndentedString(styleOptions)).append("\n");
    sb.append("    textWrapping: ").append(toIndentedString(textWrapping)).append("\n");
    sb.append("    topPadding: ").append(toIndentedString(topPadding)).append("\n");
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
