/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Style.java">
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
 * DTO container with a single document style.
 */
@ApiModel(description = "DTO container with a single document style.")
public class Style extends LinkElement {
    /**
     * Gets or sets the locale independent style identifier for a built-in style.
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
     * Gets or sets the style type (paragraph or character).
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        PARAGRAPH("Paragraph"),
        CHARACTER("Character"),
        TABLE("Table"),
        LIST("List");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Aliases")
    private List<String> aliases = null;

    @SerializedName("BaseStyleName")
    private String baseStyleName = null;

    @SerializedName("BuiltIn")
    private Boolean builtIn = null;

    @SerializedName("Font")
    private Font font = null;

    @SerializedName("IsHeading")
    private Boolean isHeading = null;

    @SerializedName("IsQuickStyle")
    private Boolean isQuickStyle = null;

    @SerializedName("LinkedStyleName")
    private String linkedStyleName = null;

    @SerializedName("Name")
    private String name = null;

    @SerializedName("NextParagraphStyleName")
    private String nextParagraphStyleName = null;

    @SerializedName("StyleIdentifier")
    private StyleIdentifierEnum styleIdentifier = null;

    @SerializedName("Type")
    private TypeEnum type = null;
    public Style aliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    public Style addAliasesItem(String aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<String>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    /**
     * Gets or sets all aliases of this style. If style has no aliases then empty array of string is returned.
    * @return aliases
    **/
    @ApiModelProperty(value = "Gets or sets all aliases of this style. If style has no aliases then empty array of string is returned.")
    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public Style baseStyleName(String baseStyleName) {
        this.baseStyleName = baseStyleName;
        return this;
    }

    /**
     * Gets or sets the name of the style this style is based on.
    * @return baseStyleName
    **/
    @ApiModelProperty(value = "Gets or sets the name of the style this style is based on.")
    public String getBaseStyleName() {
        return baseStyleName;
    }

    public void setBaseStyleName(String baseStyleName) {
        this.baseStyleName = baseStyleName;
    }

    public Style builtIn(Boolean builtIn) {
        this.builtIn = builtIn;
        return this;
    }

    /**
     * Gets or sets a value indicating whether this style is one of the built-in styles in MS Word.
    * @return builtIn
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this style is one of the built-in styles in MS Word.")
    public Boolean getBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(Boolean builtIn) {
        this.builtIn = builtIn;
    }

    public Style font(Font font) {
        this.font = font;
        return this;
    }

    /**
     * Gets or sets the character formatting of the style.
    * @return font
    **/
    @ApiModelProperty(value = "Gets or sets the character formatting of the style.")
    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Style isHeading(Boolean isHeading) {
        this.isHeading = isHeading;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the style is one of the built-in Heading styles.
    * @return isHeading
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the style is one of the built-in Heading styles.")
    public Boolean getIsHeading() {
        return isHeading;
    }

    public void setIsHeading(Boolean isHeading) {
        this.isHeading = isHeading;
    }

    public Style isQuickStyle(Boolean isQuickStyle) {
        this.isQuickStyle = isQuickStyle;
        return this;
    }

    /**
     * Gets or sets a value indicating whether this style is shown in the Quick Style gallery inside MS Word UI.
    * @return isQuickStyle
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this style is shown in the Quick Style gallery inside MS Word UI.")
    public Boolean getIsQuickStyle() {
        return isQuickStyle;
    }

    public void setIsQuickStyle(Boolean isQuickStyle) {
        this.isQuickStyle = isQuickStyle;
    }

    public Style linkedStyleName(String linkedStyleName) {
        this.linkedStyleName = linkedStyleName;
        return this;
    }

    /**
     * Gets or sets the name of the Style linked to this one. Returns Empty string if no styles are linked.
    * @return linkedStyleName
    **/
    @ApiModelProperty(value = "Gets or sets the name of the Style linked to this one. Returns Empty string if no styles are linked.")
    public String getLinkedStyleName() {
        return linkedStyleName;
    }

    public void setLinkedStyleName(String linkedStyleName) {
        this.linkedStyleName = linkedStyleName;
    }

    public Style name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Gets or sets the name of the style.
    * @return name
    **/
    @ApiModelProperty(value = "Gets or sets the name of the style.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Style nextParagraphStyleName(String nextParagraphStyleName) {
        this.nextParagraphStyleName = nextParagraphStyleName;
        return this;
    }

    /**
     * Gets or sets the name of the style to be applied automatically to a new paragraph inserted after a paragraph formatted with the specified style.
    * @return nextParagraphStyleName
    **/
    @ApiModelProperty(value = "Gets or sets the name of the style to be applied automatically to a new paragraph inserted after a paragraph formatted with the specified style.")
    public String getNextParagraphStyleName() {
        return nextParagraphStyleName;
    }

    public void setNextParagraphStyleName(String nextParagraphStyleName) {
        this.nextParagraphStyleName = nextParagraphStyleName;
    }

    public Style styleIdentifier(StyleIdentifierEnum styleIdentifier) {
        this.styleIdentifier = styleIdentifier;
        return this;
    }

    /**
     * Gets or sets the locale independent style identifier for a built-in style.
    * @return styleIdentifier
    **/
    @ApiModelProperty(value = "Gets or sets the locale independent style identifier for a built-in style.")
    public StyleIdentifierEnum getStyleIdentifier() {
        return styleIdentifier;
    }

    public void setStyleIdentifier(StyleIdentifierEnum styleIdentifier) {
        this.styleIdentifier = styleIdentifier;
    }

    public Style type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Gets or sets the style type (paragraph or character).
    * @return type
    **/
    @ApiModelProperty(value = "Gets or sets the style type (paragraph or character).")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Style style = (Style) o;
        return
            Objects.equals(this.aliases, style.aliases) &&
            Objects.equals(this.baseStyleName, style.baseStyleName) &&
            Objects.equals(this.builtIn, style.builtIn) &&
            Objects.equals(this.font, style.font) &&
            Objects.equals(this.isHeading, style.isHeading) &&
            Objects.equals(this.isQuickStyle, style.isQuickStyle) &&
            Objects.equals(this.linkedStyleName, style.linkedStyleName) &&
            Objects.equals(this.name, style.name) &&
            Objects.equals(this.nextParagraphStyleName, style.nextParagraphStyleName) &&
            Objects.equals(this.styleIdentifier, style.styleIdentifier) &&
            Objects.equals(this.type, style.type) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, baseStyleName, builtIn, font, isHeading, isQuickStyle, linkedStyleName, name, nextParagraphStyleName, styleIdentifier, type, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Style {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    baseStyleName: ").append(toIndentedString(baseStyleName)).append("\n");
    sb.append("    builtIn: ").append(toIndentedString(builtIn)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    isHeading: ").append(toIndentedString(isHeading)).append("\n");
    sb.append("    isQuickStyle: ").append(toIndentedString(isQuickStyle)).append("\n");
    sb.append("    linkedStyleName: ").append(toIndentedString(linkedStyleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextParagraphStyleName: ").append(toIndentedString(nextParagraphStyleName)).append("\n");
    sb.append("    styleIdentifier: ").append(toIndentedString(styleIdentifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
