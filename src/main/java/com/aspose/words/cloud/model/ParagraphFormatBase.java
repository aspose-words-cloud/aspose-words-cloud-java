/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ParagraphFormatBase.java">
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
 * Paragraph format element base class.
 */
@ApiModel(description = "Paragraph format element base class.")
public abstract class ParagraphFormatBase extends LinkElement {
    /**
     * Gets or sets text alignment for the paragraph.
     */
    @JsonAdapter(AlignmentEnum.Adapter.class)
    public enum AlignmentEnum {
        LEFT("Left"),
        CENTER("Center"),
        RIGHT("Right"),
        JUSTIFY("Justify"),
        DISTRIBUTED("Distributed"),
        ARABICMEDIUMKASHIDA("ArabicMediumKashida"),
        ARABICHIGHKASHIDA("ArabicHighKashida"),
        ARABICLOWKASHIDA("ArabicLowKashida"),
        THAIDISTRIBUTED("ThaiDistributed"),
        MATHELEMENTCENTERASGROUP("MathElementCenterAsGroup");

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
     * Gets or sets the position for a drop cap text.
     */
    @JsonAdapter(DropCapPositionEnum.Adapter.class)
    public enum DropCapPositionEnum {
        NONE("None"),
        NORMAL("Normal"),
        MARGIN("Margin");

        private String value;

        DropCapPositionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DropCapPositionEnum fromValue(String text) {
            for (DropCapPositionEnum b : DropCapPositionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< DropCapPositionEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final DropCapPositionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DropCapPositionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DropCapPositionEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the line spacing for the paragraph.
     */
    @JsonAdapter(LineSpacingRuleEnum.Adapter.class)
    public enum LineSpacingRuleEnum {
        ATLEAST("AtLeast"),
        EXACTLY("Exactly"),
        MULTIPLE("Multiple");

        private String value;

        LineSpacingRuleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LineSpacingRuleEnum fromValue(String text) {
            for (LineSpacingRuleEnum b : LineSpacingRuleEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< LineSpacingRuleEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final LineSpacingRuleEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LineSpacingRuleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LineSpacingRuleEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the outline level of the paragraph in the document.
     */
    @JsonAdapter(OutlineLevelEnum.Adapter.class)
    public enum OutlineLevelEnum {
        LEVEL1("Level1"),
        LEVEL2("Level2"),
        LEVEL3("Level3"),
        LEVEL4("Level4"),
        LEVEL5("Level5"),
        LEVEL6("Level6"),
        LEVEL7("Level7"),
        LEVEL8("Level8"),
        LEVEL9("Level9"),
        BODYTEXT("BodyText");

        private String value;

        OutlineLevelEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OutlineLevelEnum fromValue(String text) {
            for (OutlineLevelEnum b : OutlineLevelEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< OutlineLevelEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final OutlineLevelEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OutlineLevelEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OutlineLevelEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the locale independent style identifier of the paragraph style applied to this formatting.
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

    @SerializedName("AddSpaceBetweenFarEastAndAlpha")
    protected Boolean addSpaceBetweenFarEastAndAlpha;

    @SerializedName("AddSpaceBetweenFarEastAndDigit")
    protected Boolean addSpaceBetweenFarEastAndDigit;

    @SerializedName("Alignment")
    protected AlignmentEnum alignment;

    @SerializedName("Bidi")
    protected Boolean bidi;

    @SerializedName("DropCapPosition")
    protected DropCapPositionEnum dropCapPosition;

    @SerializedName("FirstLineIndent")
    protected Double firstLineIndent;

    @SerializedName("KeepTogether")
    protected Boolean keepTogether;

    @SerializedName("KeepWithNext")
    protected Boolean keepWithNext;

    @SerializedName("LeftIndent")
    protected Double leftIndent;

    @SerializedName("LineSpacing")
    protected Double lineSpacing;

    @SerializedName("LineSpacingRule")
    protected LineSpacingRuleEnum lineSpacingRule;

    @SerializedName("LinesToDrop")
    protected Integer linesToDrop;

    @SerializedName("NoSpaceBetweenParagraphsOfSameStyle")
    protected Boolean noSpaceBetweenParagraphsOfSameStyle;

    @SerializedName("OutlineLevel")
    protected OutlineLevelEnum outlineLevel;

    @SerializedName("PageBreakBefore")
    protected Boolean pageBreakBefore;

    @SerializedName("RightIndent")
    protected Double rightIndent;

    @SerializedName("SpaceAfter")
    protected Double spaceAfter;

    @SerializedName("SpaceAfterAuto")
    protected Boolean spaceAfterAuto;

    @SerializedName("SpaceBefore")
    protected Double spaceBefore;

    @SerializedName("SpaceBeforeAuto")
    protected Boolean spaceBeforeAuto;

    @SerializedName("StyleIdentifier")
    protected StyleIdentifierEnum styleIdentifier;

    @SerializedName("StyleName")
    protected String styleName;

    @SerializedName("SuppressAutoHyphens")
    protected Boolean suppressAutoHyphens;

    @SerializedName("SuppressLineNumbers")
    protected Boolean suppressLineNumbers;

    @SerializedName("WidowControl")
    protected Boolean widowControl;

    @SerializedName("Shading")
    protected Shading shading;
    /**
     * Gets or sets a value indicating whether inter-character spacing is automatically adjusted between regions of Latin text and regions of East Asian text in the current paragraph.
    * @return addSpaceBetweenFarEastAndAlpha
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether inter-character spacing is automatically adjusted between regions of Latin text and regions of East Asian text in the current paragraph.")
    public Boolean getAddSpaceBetweenFarEastAndAlpha() {
        return addSpaceBetweenFarEastAndAlpha;
    }

    public ParagraphFormatBase addSpaceBetweenFarEastAndAlpha(Boolean addSpaceBetweenFarEastAndAlpha) {
        this.addSpaceBetweenFarEastAndAlpha = addSpaceBetweenFarEastAndAlpha;
        return this;
    }

    public void setAddSpaceBetweenFarEastAndAlpha(Boolean addSpaceBetweenFarEastAndAlpha) {
        this.addSpaceBetweenFarEastAndAlpha = addSpaceBetweenFarEastAndAlpha;
    }


    /**
     * Gets or sets a value indicating whether inter-character spacing is automatically adjusted between regions of numbers and regions of East Asian text in the current paragraph.
    * @return addSpaceBetweenFarEastAndDigit
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether inter-character spacing is automatically adjusted between regions of numbers and regions of East Asian text in the current paragraph.")
    public Boolean getAddSpaceBetweenFarEastAndDigit() {
        return addSpaceBetweenFarEastAndDigit;
    }

    public ParagraphFormatBase addSpaceBetweenFarEastAndDigit(Boolean addSpaceBetweenFarEastAndDigit) {
        this.addSpaceBetweenFarEastAndDigit = addSpaceBetweenFarEastAndDigit;
        return this;
    }

    public void setAddSpaceBetweenFarEastAndDigit(Boolean addSpaceBetweenFarEastAndDigit) {
        this.addSpaceBetweenFarEastAndDigit = addSpaceBetweenFarEastAndDigit;
    }


    /**
     * Gets or sets text alignment for the paragraph.
    * @return alignment
    **/
    @ApiModelProperty(value = "Gets or sets text alignment for the paragraph.")
    public AlignmentEnum getAlignment() {
        return alignment;
    }

    public ParagraphFormatBase alignment(AlignmentEnum alignment) {
        this.alignment = alignment;
        return this;
    }

    public void setAlignment(AlignmentEnum alignment) {
        this.alignment = alignment;
    }


    /**
     * Gets or sets a value indicating whether this is a right-to-left paragraph.
     * When true, the runs and other inline objects in this paragraph are laid out right to left.
    * @return bidi
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this is a right-to-left paragraph. When true, the runs and other inline objects in this paragraph are laid out right to left.")
    public Boolean getBidi() {
        return bidi;
    }

    public ParagraphFormatBase bidi(Boolean bidi) {
        this.bidi = bidi;
        return this;
    }

    public void setBidi(Boolean bidi) {
        this.bidi = bidi;
    }


    /**
     * Gets or sets the position for a drop cap text.
    * @return dropCapPosition
    **/
    @ApiModelProperty(value = "Gets or sets the position for a drop cap text.")
    public DropCapPositionEnum getDropCapPosition() {
        return dropCapPosition;
    }

    public ParagraphFormatBase dropCapPosition(DropCapPositionEnum dropCapPosition) {
        this.dropCapPosition = dropCapPosition;
        return this;
    }

    public void setDropCapPosition(DropCapPositionEnum dropCapPosition) {
        this.dropCapPosition = dropCapPosition;
    }


    /**
     * Gets or sets the value (in points) for a first line or hanging indent.
     * Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    * @return firstLineIndent
    **/
    @ApiModelProperty(value = "Gets or sets the value (in points) for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.")
    public Double getFirstLineIndent() {
        return firstLineIndent;
    }

    public ParagraphFormatBase firstLineIndent(Double firstLineIndent) {
        this.firstLineIndent = firstLineIndent;
        return this;
    }

    public void setFirstLineIndent(Double firstLineIndent) {
        this.firstLineIndent = firstLineIndent;
    }


    /**
     * Gets or sets a value indicating whether all lines in the paragraph are to remain on the same page.
    * @return keepTogether
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether all lines in the paragraph are to remain on the same page.")
    public Boolean getKeepTogether() {
        return keepTogether;
    }

    public ParagraphFormatBase keepTogether(Boolean keepTogether) {
        this.keepTogether = keepTogether;
        return this;
    }

    public void setKeepTogether(Boolean keepTogether) {
        this.keepTogether = keepTogether;
    }


    /**
     * Gets or sets a value indicating whether the paragraph is to remains on the same page as the paragraph that follows it.
    * @return keepWithNext
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the paragraph is to remains on the same page as the paragraph that follows it.")
    public Boolean getKeepWithNext() {
        return keepWithNext;
    }

    public ParagraphFormatBase keepWithNext(Boolean keepWithNext) {
        this.keepWithNext = keepWithNext;
        return this;
    }

    public void setKeepWithNext(Boolean keepWithNext) {
        this.keepWithNext = keepWithNext;
    }


    /**
     * Gets or sets the value (in points), that represents the left indent for paragraph.
    * @return leftIndent
    **/
    @ApiModelProperty(value = "Gets or sets the value (in points), that represents the left indent for paragraph.")
    public Double getLeftIndent() {
        return leftIndent;
    }

    public ParagraphFormatBase leftIndent(Double leftIndent) {
        this.leftIndent = leftIndent;
        return this;
    }

    public void setLeftIndent(Double leftIndent) {
        this.leftIndent = leftIndent;
    }


    /**
     * Gets or sets the line spacing (in points) for the paragraph.
     * When LineSpacingRule property is set to AtLeast, the line spacing can be greater than or equal to, but never less than the specified LineSpacing value.When LineSpacingRule property is set to Exactly, the line spacing never changes from the specified LineSpacing value, even if a larger font is used within the paragraph.
    * @return lineSpacing
    **/
    @ApiModelProperty(value = "Gets or sets the line spacing (in points) for the paragraph. When LineSpacingRule property is set to AtLeast, the line spacing can be greater than or equal to, but never less than the specified LineSpacing value.When LineSpacingRule property is set to Exactly, the line spacing never changes from the specified LineSpacing value, even if a larger font is used within the paragraph.")
    public Double getLineSpacing() {
        return lineSpacing;
    }

    public ParagraphFormatBase lineSpacing(Double lineSpacing) {
        this.lineSpacing = lineSpacing;
        return this;
    }

    public void setLineSpacing(Double lineSpacing) {
        this.lineSpacing = lineSpacing;
    }


    /**
     * Gets or sets the line spacing for the paragraph.
    * @return lineSpacingRule
    **/
    @ApiModelProperty(value = "Gets or sets the line spacing for the paragraph.")
    public LineSpacingRuleEnum getLineSpacingRule() {
        return lineSpacingRule;
    }

    public ParagraphFormatBase lineSpacingRule(LineSpacingRuleEnum lineSpacingRule) {
        this.lineSpacingRule = lineSpacingRule;
        return this;
    }

    public void setLineSpacingRule(LineSpacingRuleEnum lineSpacingRule) {
        this.lineSpacingRule = lineSpacingRule;
    }


    /**
     * Gets or sets the number of lines of the paragraph text used to calculate the drop cap height.
    * @return linesToDrop
    **/
    @ApiModelProperty(value = "Gets or sets the number of lines of the paragraph text used to calculate the drop cap height.")
    public Integer getLinesToDrop() {
        return linesToDrop;
    }

    public ParagraphFormatBase linesToDrop(Integer linesToDrop) {
        this.linesToDrop = linesToDrop;
        return this;
    }

    public void setLinesToDrop(Integer linesToDrop) {
        this.linesToDrop = linesToDrop;
    }


    /**
     * Gets or sets a value indicating whether SpaceBefore and SpaceAfter will be ignored between the paragraphs of the same style.
     * This setting only takes affect when applied to a paragraph style. If applied to a paragraph directly, it has no effect.
    * @return noSpaceBetweenParagraphsOfSameStyle
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether SpaceBefore and SpaceAfter will be ignored between the paragraphs of the same style. This setting only takes affect when applied to a paragraph style. If applied to a paragraph directly, it has no effect.")
    public Boolean getNoSpaceBetweenParagraphsOfSameStyle() {
        return noSpaceBetweenParagraphsOfSameStyle;
    }

    public ParagraphFormatBase noSpaceBetweenParagraphsOfSameStyle(Boolean noSpaceBetweenParagraphsOfSameStyle) {
        this.noSpaceBetweenParagraphsOfSameStyle = noSpaceBetweenParagraphsOfSameStyle;
        return this;
    }

    public void setNoSpaceBetweenParagraphsOfSameStyle(Boolean noSpaceBetweenParagraphsOfSameStyle) {
        this.noSpaceBetweenParagraphsOfSameStyle = noSpaceBetweenParagraphsOfSameStyle;
    }


    /**
     * Gets or sets the outline level of the paragraph in the document.
    * @return outlineLevel
    **/
    @ApiModelProperty(value = "Gets or sets the outline level of the paragraph in the document.")
    public OutlineLevelEnum getOutlineLevel() {
        return outlineLevel;
    }

    public ParagraphFormatBase outlineLevel(OutlineLevelEnum outlineLevel) {
        this.outlineLevel = outlineLevel;
        return this;
    }

    public void setOutlineLevel(OutlineLevelEnum outlineLevel) {
        this.outlineLevel = outlineLevel;
    }


    /**
     * Gets or sets a value indicating whether a page break is forced before the paragraph.
    * @return pageBreakBefore
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether a page break is forced before the paragraph.")
    public Boolean getPageBreakBefore() {
        return pageBreakBefore;
    }

    public ParagraphFormatBase pageBreakBefore(Boolean pageBreakBefore) {
        this.pageBreakBefore = pageBreakBefore;
        return this;
    }

    public void setPageBreakBefore(Boolean pageBreakBefore) {
        this.pageBreakBefore = pageBreakBefore;
    }


    /**
     * Gets or sets the value (in points) that represents the right indent for paragraph.
    * @return rightIndent
    **/
    @ApiModelProperty(value = "Gets or sets the value (in points) that represents the right indent for paragraph.")
    public Double getRightIndent() {
        return rightIndent;
    }

    public ParagraphFormatBase rightIndent(Double rightIndent) {
        this.rightIndent = rightIndent;
        return this;
    }

    public void setRightIndent(Double rightIndent) {
        this.rightIndent = rightIndent;
    }


    /**
     * Gets or sets the amount of spacing (in points) after the paragraph.
     * Has no effect when SpaceAfterAuto is true.
    * @return spaceAfter
    **/
    @ApiModelProperty(value = "Gets or sets the amount of spacing (in points) after the paragraph. Has no effect when SpaceAfterAuto is true.")
    public Double getSpaceAfter() {
        return spaceAfter;
    }

    public ParagraphFormatBase spaceAfter(Double spaceAfter) {
        this.spaceAfter = spaceAfter;
        return this;
    }

    public void setSpaceAfter(Double spaceAfter) {
        this.spaceAfter = spaceAfter;
    }


    /**
     * Gets or sets a value indicating whether the amount of spacing after the paragraph is set automatically.
     * When set to true, overrides the effect of SpaceAfter.
    * @return spaceAfterAuto
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the amount of spacing after the paragraph is set automatically. When set to true, overrides the effect of SpaceAfter.")
    public Boolean getSpaceAfterAuto() {
        return spaceAfterAuto;
    }

    public ParagraphFormatBase spaceAfterAuto(Boolean spaceAfterAuto) {
        this.spaceAfterAuto = spaceAfterAuto;
        return this;
    }

    public void setSpaceAfterAuto(Boolean spaceAfterAuto) {
        this.spaceAfterAuto = spaceAfterAuto;
    }


    /**
     * Gets or sets the amount of spacing (in points) before the paragraph.
     * Has no effect when SpaceBeforeAuto is true.
    * @return spaceBefore
    **/
    @ApiModelProperty(value = "Gets or sets the amount of spacing (in points) before the paragraph. Has no effect when SpaceBeforeAuto is true.")
    public Double getSpaceBefore() {
        return spaceBefore;
    }

    public ParagraphFormatBase spaceBefore(Double spaceBefore) {
        this.spaceBefore = spaceBefore;
        return this;
    }

    public void setSpaceBefore(Double spaceBefore) {
        this.spaceBefore = spaceBefore;
    }


    /**
     * Gets or sets a value indicating whether the amount of spacing before the paragraph is set automatically.
     * When set to true, overrides the effect of SpaceBefore.
    * @return spaceBeforeAuto
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the amount of spacing before the paragraph is set automatically. When set to true, overrides the effect of SpaceBefore.")
    public Boolean getSpaceBeforeAuto() {
        return spaceBeforeAuto;
    }

    public ParagraphFormatBase spaceBeforeAuto(Boolean spaceBeforeAuto) {
        this.spaceBeforeAuto = spaceBeforeAuto;
        return this;
    }

    public void setSpaceBeforeAuto(Boolean spaceBeforeAuto) {
        this.spaceBeforeAuto = spaceBeforeAuto;
    }


    /**
     * Gets or sets the locale independent style identifier of the paragraph style applied to this formatting.
    * @return styleIdentifier
    **/
    @ApiModelProperty(value = "Gets or sets the locale independent style identifier of the paragraph style applied to this formatting.")
    public StyleIdentifierEnum getStyleIdentifier() {
        return styleIdentifier;
    }

    public ParagraphFormatBase styleIdentifier(StyleIdentifierEnum styleIdentifier) {
        this.styleIdentifier = styleIdentifier;
        return this;
    }

    public void setStyleIdentifier(StyleIdentifierEnum styleIdentifier) {
        this.styleIdentifier = styleIdentifier;
    }


    /**
     * Gets or sets the name of the paragraph style applied to this formatting.
    * @return styleName
    **/
    @ApiModelProperty(value = "Gets or sets the name of the paragraph style applied to this formatting.")
    public String getStyleName() {
        return styleName;
    }

    public ParagraphFormatBase styleName(String styleName) {
        this.styleName = styleName;
        return this;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }


    /**
     * Gets or sets a value indicating whether the current paragraph should be exempted from any hyphenation which is applied in the document settings.
    * @return suppressAutoHyphens
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the current paragraph should be exempted from any hyphenation which is applied in the document settings.")
    public Boolean getSuppressAutoHyphens() {
        return suppressAutoHyphens;
    }

    public ParagraphFormatBase suppressAutoHyphens(Boolean suppressAutoHyphens) {
        this.suppressAutoHyphens = suppressAutoHyphens;
        return this;
    }

    public void setSuppressAutoHyphens(Boolean suppressAutoHyphens) {
        this.suppressAutoHyphens = suppressAutoHyphens;
    }


    /**
     * Gets or sets a value indicating whether the current paragraph's lines should be exempted from line numbering which is applied in the parent section.
    * @return suppressLineNumbers
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the current paragraph's lines should be exempted from line numbering which is applied in the parent section.")
    public Boolean getSuppressLineNumbers() {
        return suppressLineNumbers;
    }

    public ParagraphFormatBase suppressLineNumbers(Boolean suppressLineNumbers) {
        this.suppressLineNumbers = suppressLineNumbers;
        return this;
    }

    public void setSuppressLineNumbers(Boolean suppressLineNumbers) {
        this.suppressLineNumbers = suppressLineNumbers;
    }


    /**
     * Gets or sets a value indicating whether the first and last lines in the paragraph are to remain on the same page as the rest of the paragraph.
    * @return widowControl
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the first and last lines in the paragraph are to remain on the same page as the rest of the paragraph.")
    public Boolean getWidowControl() {
        return widowControl;
    }

    public ParagraphFormatBase widowControl(Boolean widowControl) {
        this.widowControl = widowControl;
        return this;
    }

    public void setWidowControl(Boolean widowControl) {
        this.widowControl = widowControl;
    }


    /**
     * Gets or sets the Shading object, that refers to the shading formatting for the paragraph.
    * @return shading
    **/
    @ApiModelProperty(value = "Gets or sets the Shading object, that refers to the shading formatting for the paragraph.")
    public Shading getShading() {
        return shading;
    }

    public ParagraphFormatBase shading(Shading shading) {
        this.shading = shading;
        return this;
    }

    public void setShading(Shading shading) {
        this.shading = shading;
    }


    public ParagraphFormatBase() {
        super();
        this.addSpaceBetweenFarEastAndAlpha = null;
        this.addSpaceBetweenFarEastAndDigit = null;
        this.alignment = null;
        this.bidi = null;
        this.dropCapPosition = null;
        this.firstLineIndent = null;
        this.keepTogether = null;
        this.keepWithNext = null;
        this.leftIndent = null;
        this.lineSpacing = null;
        this.lineSpacingRule = null;
        this.linesToDrop = null;
        this.noSpaceBetweenParagraphsOfSameStyle = null;
        this.outlineLevel = null;
        this.pageBreakBefore = null;
        this.rightIndent = null;
        this.spaceAfter = null;
        this.spaceAfterAuto = null;
        this.spaceBefore = null;
        this.spaceBeforeAuto = null;
        this.styleIdentifier = null;
        this.styleName = null;
        this.suppressAutoHyphens = null;
        this.suppressLineNumbers = null;
        this.widowControl = null;
        this.shading = null;
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

        if (this.shading != null) {
            this.shading.validate();
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

        ParagraphFormatBase paragraphFormatBase = (ParagraphFormatBase) o;
        return
            Objects.equals(this.addSpaceBetweenFarEastAndAlpha, paragraphFormatBase.addSpaceBetweenFarEastAndAlpha) &&
            Objects.equals(this.addSpaceBetweenFarEastAndDigit, paragraphFormatBase.addSpaceBetweenFarEastAndDigit) &&
            Objects.equals(this.alignment, paragraphFormatBase.alignment) &&
            Objects.equals(this.bidi, paragraphFormatBase.bidi) &&
            Objects.equals(this.dropCapPosition, paragraphFormatBase.dropCapPosition) &&
            Objects.equals(this.firstLineIndent, paragraphFormatBase.firstLineIndent) &&
            Objects.equals(this.keepTogether, paragraphFormatBase.keepTogether) &&
            Objects.equals(this.keepWithNext, paragraphFormatBase.keepWithNext) &&
            Objects.equals(this.leftIndent, paragraphFormatBase.leftIndent) &&
            Objects.equals(this.lineSpacing, paragraphFormatBase.lineSpacing) &&
            Objects.equals(this.lineSpacingRule, paragraphFormatBase.lineSpacingRule) &&
            Objects.equals(this.linesToDrop, paragraphFormatBase.linesToDrop) &&
            Objects.equals(this.noSpaceBetweenParagraphsOfSameStyle, paragraphFormatBase.noSpaceBetweenParagraphsOfSameStyle) &&
            Objects.equals(this.outlineLevel, paragraphFormatBase.outlineLevel) &&
            Objects.equals(this.pageBreakBefore, paragraphFormatBase.pageBreakBefore) &&
            Objects.equals(this.rightIndent, paragraphFormatBase.rightIndent) &&
            Objects.equals(this.spaceAfter, paragraphFormatBase.spaceAfter) &&
            Objects.equals(this.spaceAfterAuto, paragraphFormatBase.spaceAfterAuto) &&
            Objects.equals(this.spaceBefore, paragraphFormatBase.spaceBefore) &&
            Objects.equals(this.spaceBeforeAuto, paragraphFormatBase.spaceBeforeAuto) &&
            Objects.equals(this.styleIdentifier, paragraphFormatBase.styleIdentifier) &&
            Objects.equals(this.styleName, paragraphFormatBase.styleName) &&
            Objects.equals(this.suppressAutoHyphens, paragraphFormatBase.suppressAutoHyphens) &&
            Objects.equals(this.suppressLineNumbers, paragraphFormatBase.suppressLineNumbers) &&
            Objects.equals(this.widowControl, paragraphFormatBase.widowControl) &&
            Objects.equals(this.shading, paragraphFormatBase.shading) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addSpaceBetweenFarEastAndAlpha, addSpaceBetweenFarEastAndDigit, alignment, bidi, dropCapPosition, firstLineIndent, keepTogether, keepWithNext, leftIndent, lineSpacing, lineSpacingRule, linesToDrop, noSpaceBetweenParagraphsOfSameStyle, outlineLevel, pageBreakBefore, rightIndent, spaceAfter, spaceAfterAuto, spaceBefore, spaceBeforeAuto, styleIdentifier, styleName, suppressAutoHyphens, suppressLineNumbers, widowControl, shading, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParagraphFormatBase {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    addSpaceBetweenFarEastAndAlpha: ").append(toIndentedString(getAddSpaceBetweenFarEastAndAlpha())).append("\n");
    sb.append("    addSpaceBetweenFarEastAndDigit: ").append(toIndentedString(getAddSpaceBetweenFarEastAndDigit())).append("\n");
    sb.append("    alignment: ").append(toIndentedString(getAlignment())).append("\n");
    sb.append("    bidi: ").append(toIndentedString(getBidi())).append("\n");
    sb.append("    dropCapPosition: ").append(toIndentedString(getDropCapPosition())).append("\n");
    sb.append("    firstLineIndent: ").append(toIndentedString(getFirstLineIndent())).append("\n");
    sb.append("    keepTogether: ").append(toIndentedString(getKeepTogether())).append("\n");
    sb.append("    keepWithNext: ").append(toIndentedString(getKeepWithNext())).append("\n");
    sb.append("    leftIndent: ").append(toIndentedString(getLeftIndent())).append("\n");
    sb.append("    lineSpacing: ").append(toIndentedString(getLineSpacing())).append("\n");
    sb.append("    lineSpacingRule: ").append(toIndentedString(getLineSpacingRule())).append("\n");
    sb.append("    linesToDrop: ").append(toIndentedString(getLinesToDrop())).append("\n");
    sb.append("    noSpaceBetweenParagraphsOfSameStyle: ").append(toIndentedString(getNoSpaceBetweenParagraphsOfSameStyle())).append("\n");
    sb.append("    outlineLevel: ").append(toIndentedString(getOutlineLevel())).append("\n");
    sb.append("    pageBreakBefore: ").append(toIndentedString(getPageBreakBefore())).append("\n");
    sb.append("    rightIndent: ").append(toIndentedString(getRightIndent())).append("\n");
    sb.append("    spaceAfter: ").append(toIndentedString(getSpaceAfter())).append("\n");
    sb.append("    spaceAfterAuto: ").append(toIndentedString(getSpaceAfterAuto())).append("\n");
    sb.append("    spaceBefore: ").append(toIndentedString(getSpaceBefore())).append("\n");
    sb.append("    spaceBeforeAuto: ").append(toIndentedString(getSpaceBeforeAuto())).append("\n");
    sb.append("    styleIdentifier: ").append(toIndentedString(getStyleIdentifier())).append("\n");
    sb.append("    styleName: ").append(toIndentedString(getStyleName())).append("\n");
    sb.append("    suppressAutoHyphens: ").append(toIndentedString(getSuppressAutoHyphens())).append("\n");
    sb.append("    suppressLineNumbers: ").append(toIndentedString(getSuppressLineNumbers())).append("\n");
    sb.append("    widowControl: ").append(toIndentedString(getWidowControl())).append("\n");
    sb.append("    shading: ").append(toIndentedString(getShading())).append("\n");
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
