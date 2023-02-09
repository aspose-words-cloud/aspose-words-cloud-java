/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StructuredDocumentTag.java">
 *   Copyright (c) 2023 Aspose.Words for Cloud
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
 * DTO container with a StructuredDocumentTag.
 */
@ApiModel(description = "DTO container with a StructuredDocumentTag.")
public class StructuredDocumentTag extends NodeLink {
    /**
     * Gets or sets the appearance of a structured document tag.
     */
    @JsonAdapter(AppearanceEnum.Adapter.class)
    public enum AppearanceEnum {
        DEFAULT("Default"),
        BOUNDINGBOX("BoundingBox"),
        TAGS("Tags"),
        HIDDEN("Hidden");

        private String value;

        AppearanceEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AppearanceEnum fromValue(String text) {
            for (AppearanceEnum b : AppearanceEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< AppearanceEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final AppearanceEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AppearanceEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AppearanceEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the type of calendar for this SDT. Default is Aspose.Words.Markup.SdtCalendarType.Default.
     */
    @JsonAdapter(CalendarTypeEnum.Adapter.class)
    public enum CalendarTypeEnum {
        DEFAULT("Default"),
        GREGORIAN("Gregorian"),
        GREGORIANARABIC("GregorianArabic"),
        GREGORIANMEFRENCH("GregorianMeFrench"),
        GREGORIANUS("GregorianUs"),
        GREGORIANXLITENGLISH("GregorianXlitEnglish"),
        GREGORIANXLITFRENCH("GregorianXlitFrench"),
        HEBREW("Hebrew"),
        HIJRI("Hijri"),
        JAPAN("Japan"),
        KOREA("Korea"),
        NONE("None"),
        SAKA("Saka"),
        TAIWAN("Taiwan"),
        THAI("Thai");

        private String value;

        CalendarTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CalendarTypeEnum fromValue(String text) {
            for (CalendarTypeEnum b : CalendarTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< CalendarTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final CalendarTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CalendarTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CalendarTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets format in which the date for a date SDT is stored when the SDT is bound to an XML node in the document's data store.
     * Default value is Aspose.Words.Markup.SdtDateStorageFormat.DateTime.
     */
    @JsonAdapter(DateStorageFormatEnum.Adapter.class)
    public enum DateStorageFormatEnum {
        DATE("Date"),
        DATETIME("DateTime"),
        DEFAULT("Default"),
        TEXT("Text");

        private String value;

        DateStorageFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DateStorageFormatEnum fromValue(String text) {
            for (DateStorageFormatEnum b : DateStorageFormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< DateStorageFormatEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final DateStorageFormatEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DateStorageFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DateStorageFormatEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the level at which this SDT occurs in the document tree.
     */
    @JsonAdapter(LevelEnum.Adapter.class)
    public enum LevelEnum {
        UNKNOWN("Unknown"),
        INLINE("Inline"),
        BLOCK("Block"),
        ROW("Row"),
        CELL("Cell");

        private String value;

        LevelEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LevelEnum fromValue(String text) {
            for (LevelEnum b : LevelEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< LevelEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final LevelEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LevelEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LevelEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets type of this Structured document tag.
     */
    @JsonAdapter(SdtTypeEnum.Adapter.class)
    public enum SdtTypeEnum {
        NONE("None"),
        BIBLIOGRAPHY("Bibliography"),
        CITATION("Citation"),
        EQUATION("Equation"),
        DROPDOWNLIST("DropDownList"),
        COMBOBOX("ComboBox"),
        DATE("Date"),
        BUILDINGBLOCKGALLERY("BuildingBlockGallery"),
        DOCPARTOBJ("DocPartObj"),
        GROUP("Group"),
        PICTURE("Picture"),
        RICHTEXT("RichText"),
        PLAINTEXT("PlainText"),
        CHECKBOX("Checkbox"),
        REPEATINGSECTION("RepeatingSection"),
        REPEATINGSECTIONITEM("RepeatingSectionItem"),
        ENTITYPICKER("EntityPicker");

        private String value;

        SdtTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SdtTypeEnum fromValue(String text) {
            for (SdtTypeEnum b : SdtTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< SdtTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final SdtTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SdtTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SdtTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Appearance")
    protected AppearanceEnum appearance;

    @SerializedName("BuildingBlockCategory")
    protected String buildingBlockCategory;

    @SerializedName("BuildingBlockGallery")
    protected String buildingBlockGallery;

    @SerializedName("CalendarType")
    protected CalendarTypeEnum calendarType;

    @SerializedName("Checked")
    protected Boolean checked;

    @SerializedName("Color")
    protected String color;

    @SerializedName("DateDisplayFormat")
    protected String dateDisplayFormat;

    @SerializedName("DateDisplayLocale")
    protected Integer dateDisplayLocale;

    @SerializedName("DateStorageFormat")
    protected DateStorageFormatEnum dateStorageFormat;

    @SerializedName("FullDate")
    protected OffsetDateTime fullDate;

    @SerializedName("Id")
    protected Integer id;

    @SerializedName("IsShowingPlaceholderText")
    protected Boolean isShowingPlaceholderText;

    @SerializedName("IsTemporary")
    protected Boolean isTemporary;

    @SerializedName("Level")
    protected LevelEnum level;

    @SerializedName("ListItems")
    protected List<StructuredDocumentTagListItem> listItems;

    @SerializedName("LockContentControl")
    protected Boolean lockContentControl;

    @SerializedName("LockContents")
    protected Boolean lockContents;

    @SerializedName("Multiline")
    protected Boolean multiline;

    @SerializedName("PlaceholderName")
    protected String placeholderName;

    @SerializedName("SdtType")
    protected SdtTypeEnum sdtType;

    @SerializedName("StyleName")
    protected String styleName;

    @SerializedName("Tag")
    protected String tag;

    @SerializedName("Title")
    protected String title;

    @SerializedName("WordOpenXML")
    protected String wordOpenXML;
    /**
     * Gets or sets the appearance of a structured document tag.
    * @return appearance
    **/
    @ApiModelProperty(value = "Gets or sets the appearance of a structured document tag.")
    public AppearanceEnum getAppearance() {
        return appearance;
    }

    public StructuredDocumentTag appearance(AppearanceEnum appearance) {
        this.appearance = appearance;
        return this;
    }

    public void setAppearance(AppearanceEnum appearance) {
        this.appearance = appearance;
    }


    /**
     * Gets or sets category of building block for this SDT node. Can not be null.
    * @return buildingBlockCategory
    **/
    @ApiModelProperty(value = "Gets or sets category of building block for this SDT node. Can not be null.")
    public String getBuildingBlockCategory() {
        return buildingBlockCategory;
    }

    public StructuredDocumentTag buildingBlockCategory(String buildingBlockCategory) {
        this.buildingBlockCategory = buildingBlockCategory;
        return this;
    }

    public void setBuildingBlockCategory(String buildingBlockCategory) {
        this.buildingBlockCategory = buildingBlockCategory;
    }


    /**
     * Gets or sets type of building block for this SDT. Can not be null.
    * @return buildingBlockGallery
    **/
    @ApiModelProperty(value = "Gets or sets type of building block for this SDT. Can not be null.")
    public String getBuildingBlockGallery() {
        return buildingBlockGallery;
    }

    public StructuredDocumentTag buildingBlockGallery(String buildingBlockGallery) {
        this.buildingBlockGallery = buildingBlockGallery;
        return this;
    }

    public void setBuildingBlockGallery(String buildingBlockGallery) {
        this.buildingBlockGallery = buildingBlockGallery;
    }


    /**
     * Gets or sets the type of calendar for this SDT. Default is Aspose.Words.Markup.SdtCalendarType.Default.
    * @return calendarType
    **/
    @ApiModelProperty(value = "Gets or sets the type of calendar for this SDT. Default is Aspose.Words.Markup.SdtCalendarType.Default.")
    public CalendarTypeEnum getCalendarType() {
        return calendarType;
    }

    public StructuredDocumentTag calendarType(CalendarTypeEnum calendarType) {
        this.calendarType = calendarType;
        return this;
    }

    public void setCalendarType(CalendarTypeEnum calendarType) {
        this.calendarType = calendarType;
    }


    /**
     * Gets or sets a value indicating whether current state of the Checkbox SDT. Default value for this property.
    * @return checked
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether current state of the Checkbox SDT. Default value for this property.")
    public Boolean getChecked() {
        return checked;
    }

    public StructuredDocumentTag checked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }


    /**
     * Gets or sets the color of the structured document tag.
    * @return color
    **/
    @ApiModelProperty(value = "Gets or sets the color of the structured document tag.")
    public String getColor() {
        return color;
    }

    public StructuredDocumentTag color(String color) {
        this.color = color;
        return this;
    }

    public void setColor(String color) {
        this.color = color;
    }


    /**
     * Gets or sets String that represents the format in which dates are displayed. Can not be null. The dates for English (U.S.) is "mm/dd/yyyy".
    * @return dateDisplayFormat
    **/
    @ApiModelProperty(value = "Gets or sets String that represents the format in which dates are displayed. Can not be null. The dates for English (U.S.) is \"mm/dd/yyyy\".")
    public String getDateDisplayFormat() {
        return dateDisplayFormat;
    }

    public StructuredDocumentTag dateDisplayFormat(String dateDisplayFormat) {
        this.dateDisplayFormat = dateDisplayFormat;
        return this;
    }

    public void setDateDisplayFormat(String dateDisplayFormat) {
        this.dateDisplayFormat = dateDisplayFormat;
    }


    /**
     * Gets or sets the language format for the date displayed in this SDT.
    * @return dateDisplayLocale
    **/
    @ApiModelProperty(value = "Gets or sets the language format for the date displayed in this SDT.")
    public Integer getDateDisplayLocale() {
        return dateDisplayLocale;
    }

    public StructuredDocumentTag dateDisplayLocale(Integer dateDisplayLocale) {
        this.dateDisplayLocale = dateDisplayLocale;
        return this;
    }

    public void setDateDisplayLocale(Integer dateDisplayLocale) {
        this.dateDisplayLocale = dateDisplayLocale;
    }


    /**
     * Gets or sets format in which the date for a date SDT is stored when the SDT is bound to an XML node in the document's data store.
     * Default value is Aspose.Words.Markup.SdtDateStorageFormat.DateTime.
    * @return dateStorageFormat
    **/
    @ApiModelProperty(value = "Gets or sets format in which the date for a date SDT is stored when the SDT is bound to an XML node in the document's data store. Default value is Aspose.Words.Markup.SdtDateStorageFormat.DateTime.")
    public DateStorageFormatEnum getDateStorageFormat() {
        return dateStorageFormat;
    }

    public StructuredDocumentTag dateStorageFormat(DateStorageFormatEnum dateStorageFormat) {
        this.dateStorageFormat = dateStorageFormat;
        return this;
    }

    public void setDateStorageFormat(DateStorageFormatEnum dateStorageFormat) {
        this.dateStorageFormat = dateStorageFormat;
    }


    /**
     * Gets or sets the full date and time last entered into this SDT.
    * @return fullDate
    **/
    @ApiModelProperty(value = "Gets or sets the full date and time last entered into this SDT.")
    public OffsetDateTime getFullDate() {
        return fullDate;
    }

    public StructuredDocumentTag fullDate(OffsetDateTime fullDate) {
        this.fullDate = fullDate;
        return this;
    }

    public void setFullDate(OffsetDateTime fullDate) {
        this.fullDate = fullDate;
    }


    /**
     * Gets or sets a unique read-only persistent numerical Id for this SDT.
    * @return id
    **/
    @ApiModelProperty(value = "Gets or sets a unique read-only persistent numerical Id for this SDT.")
    public Integer getId() {
        return id;
    }

    public StructuredDocumentTag id(Integer id) {
        this.id = id;
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * Gets or sets a value indicating whether the content of this SDT shall be interpreted to contain placeholder text (as opposed to regular text contents within the SDT).
     * If set to true, this state shall be resumed (showing placeholder text) upon opening his document.
    * @return isShowingPlaceholderText
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the content of this SDT shall be interpreted to contain placeholder text (as opposed to regular text contents within the SDT). If set to true, this state shall be resumed (showing placeholder text) upon opening his document.")
    public Boolean getIsShowingPlaceholderText() {
        return isShowingPlaceholderText;
    }

    public StructuredDocumentTag isShowingPlaceholderText(Boolean isShowingPlaceholderText) {
        this.isShowingPlaceholderText = isShowingPlaceholderText;
        return this;
    }

    public void setIsShowingPlaceholderText(Boolean isShowingPlaceholderText) {
        this.isShowingPlaceholderText = isShowingPlaceholderText;
    }


    /**
     * Gets or sets a value indicating whether this SDT shall be removed from the WordProcessingML document when its contents are modified.
    * @return isTemporary
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this SDT shall be removed from the WordProcessingML document when its contents are modified.")
    public Boolean getIsTemporary() {
        return isTemporary;
    }

    public StructuredDocumentTag isTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
        return this;
    }

    public void setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
    }


    /**
     * Gets or sets the level at which this SDT occurs in the document tree.
    * @return level
    **/
    @ApiModelProperty(value = "Gets or sets the level at which this SDT occurs in the document tree.")
    public LevelEnum getLevel() {
        return level;
    }

    public StructuredDocumentTag level(LevelEnum level) {
        this.level = level;
        return this;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }


    /**
     * Gets or sets Aspose.Words.Markup.SdtListItemCollection associated with this SDT.
    * @return listItems
    **/
    @ApiModelProperty(value = "Gets or sets Aspose.Words.Markup.SdtListItemCollection associated with this SDT.")
    public List<StructuredDocumentTagListItem> getListItems() {
        return listItems;
    }

    public StructuredDocumentTag listItems(List<StructuredDocumentTagListItem> listItems) {
        this.listItems = listItems;
        return this;
    }

    public StructuredDocumentTag addListItemsItem(StructuredDocumentTagListItem listItemsItem) {
        if (this.listItems == null) {
            this.listItems = new ArrayList<StructuredDocumentTagListItem>();
        }
        this.listItems.add(listItemsItem);
        return this;
    }


    public void setListItems(List<StructuredDocumentTagListItem> listItems) {
        this.listItems = listItems;
    }


    /**
     * Gets or sets a value indicating whether, this property will prohibit a user from deleting this SDT.
    * @return lockContentControl
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether, this property will prohibit a user from deleting this SDT.")
    public Boolean getLockContentControl() {
        return lockContentControl;
    }

    public StructuredDocumentTag lockContentControl(Boolean lockContentControl) {
        this.lockContentControl = lockContentControl;
        return this;
    }

    public void setLockContentControl(Boolean lockContentControl) {
        this.lockContentControl = lockContentControl;
    }


    /**
     * Gets or sets a value indicating whether, this property will prohibit a user from editing the contents of this SDT.
    * @return lockContents
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether, this property will prohibit a user from editing the contents of this SDT.")
    public Boolean getLockContents() {
        return lockContents;
    }

    public StructuredDocumentTag lockContents(Boolean lockContents) {
        this.lockContents = lockContents;
        return this;
    }

    public void setLockContents(Boolean lockContents) {
        this.lockContents = lockContents;
    }


    /**
     * Gets or sets a value indicating whether this SDT allows multiple lines of text.
    * @return multiline
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this SDT allows multiple lines of text.")
    public Boolean getMultiline() {
        return multiline;
    }

    public StructuredDocumentTag multiline(Boolean multiline) {
        this.multiline = multiline;
        return this;
    }

    public void setMultiline(Boolean multiline) {
        this.multiline = multiline;
    }


    /**
     * Gets or sets Name of the Aspose.Words.BuildingBlocks.BuildingBlock containing placeholder text.
     * Aspose.Words.BuildingBlocks.BuildingBlock with this name Aspose.Words.BuildingBlocks.BuildingBlock.Name has to be present in the Aspose.Words.Document.GlossaryDocument otherwise System.InvalidOperationException will occur.
    * @return placeholderName
    **/
    @ApiModelProperty(value = "Gets or sets Name of the Aspose.Words.BuildingBlocks.BuildingBlock containing placeholder text. Aspose.Words.BuildingBlocks.BuildingBlock with this name Aspose.Words.BuildingBlocks.BuildingBlock.Name has to be present in the Aspose.Words.Document.GlossaryDocument otherwise System.InvalidOperationException will occur.")
    public String getPlaceholderName() {
        return placeholderName;
    }

    public StructuredDocumentTag placeholderName(String placeholderName) {
        this.placeholderName = placeholderName;
        return this;
    }

    public void setPlaceholderName(String placeholderName) {
        this.placeholderName = placeholderName;
    }


    /**
     * Gets or sets type of this Structured document tag.
    * @return sdtType
    **/
    @ApiModelProperty(value = "Gets or sets type of this Structured document tag.")
    public SdtTypeEnum getSdtType() {
        return sdtType;
    }

    public StructuredDocumentTag sdtType(SdtTypeEnum sdtType) {
        this.sdtType = sdtType;
        return this;
    }

    public void setSdtType(SdtTypeEnum sdtType) {
        this.sdtType = sdtType;
    }


    /**
     * Gets or sets the name of the style applied to the structured document tag.
    * @return styleName
    **/
    @ApiModelProperty(value = "Gets or sets the name of the style applied to the structured document tag.")
    public String getStyleName() {
        return styleName;
    }

    public StructuredDocumentTag styleName(String styleName) {
        this.styleName = styleName;
        return this;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }


    /**
     * Gets or sets a tag associated with the current SDT node. Can not be null.
    * @return tag
    **/
    @ApiModelProperty(value = "Gets or sets a tag associated with the current SDT node. Can not be null.")
    public String getTag() {
        return tag;
    }

    public StructuredDocumentTag tag(String tag) {
        this.tag = tag;
        return this;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


    /**
     * Gets or sets the friendly name associated with this SDT. Can not be null.
    * @return title
    **/
    @ApiModelProperty(value = "Gets or sets the friendly name associated with this SDT. Can not be null.")
    public String getTitle() {
        return title;
    }

    public StructuredDocumentTag title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets a string that represents the XML contained within the node in the Aspose.Words.SaveFormat.FlatOpc format.
    * @return wordOpenXML
    **/
    @ApiModelProperty(value = "Gets a string that represents the XML contained within the node in the Aspose.Words.SaveFormat.FlatOpc format.")
    public String getWordOpenXML() {
        return wordOpenXML;
    }

    public StructuredDocumentTag wordOpenXML(String wordOpenXML) {
        this.wordOpenXML = wordOpenXML;
        return this;
    }

    public void setWordOpenXML(String wordOpenXML) {
        this.wordOpenXML = wordOpenXML;
    }


    public StructuredDocumentTag() {
        super();
        this.appearance = null;
        this.buildingBlockCategory = null;
        this.buildingBlockGallery = null;
        this.calendarType = null;
        this.checked = null;
        this.color = null;
        this.dateDisplayFormat = null;
        this.dateDisplayLocale = null;
        this.dateStorageFormat = null;
        this.fullDate = null;
        this.id = null;
        this.isShowingPlaceholderText = null;
        this.isTemporary = null;
        this.level = null;
        this.listItems = null;
        this.lockContentControl = null;
        this.lockContents = null;
        this.multiline = null;
        this.placeholderName = null;
        this.sdtType = null;
        this.styleName = null;
        this.tag = null;
        this.title = null;
        this.wordOpenXML = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) o;
        return
            Objects.equals(this.appearance, structuredDocumentTag.appearance) &&
            Objects.equals(this.buildingBlockCategory, structuredDocumentTag.buildingBlockCategory) &&
            Objects.equals(this.buildingBlockGallery, structuredDocumentTag.buildingBlockGallery) &&
            Objects.equals(this.calendarType, structuredDocumentTag.calendarType) &&
            Objects.equals(this.checked, structuredDocumentTag.checked) &&
            Objects.equals(this.color, structuredDocumentTag.color) &&
            Objects.equals(this.dateDisplayFormat, structuredDocumentTag.dateDisplayFormat) &&
            Objects.equals(this.dateDisplayLocale, structuredDocumentTag.dateDisplayLocale) &&
            Objects.equals(this.dateStorageFormat, structuredDocumentTag.dateStorageFormat) &&
            Objects.equals(this.fullDate, structuredDocumentTag.fullDate) &&
            Objects.equals(this.id, structuredDocumentTag.id) &&
            Objects.equals(this.isShowingPlaceholderText, structuredDocumentTag.isShowingPlaceholderText) &&
            Objects.equals(this.isTemporary, structuredDocumentTag.isTemporary) &&
            Objects.equals(this.level, structuredDocumentTag.level) &&
            Objects.equals(this.listItems, structuredDocumentTag.listItems) &&
            Objects.equals(this.lockContentControl, structuredDocumentTag.lockContentControl) &&
            Objects.equals(this.lockContents, structuredDocumentTag.lockContents) &&
            Objects.equals(this.multiline, structuredDocumentTag.multiline) &&
            Objects.equals(this.placeholderName, structuredDocumentTag.placeholderName) &&
            Objects.equals(this.sdtType, structuredDocumentTag.sdtType) &&
            Objects.equals(this.styleName, structuredDocumentTag.styleName) &&
            Objects.equals(this.tag, structuredDocumentTag.tag) &&
            Objects.equals(this.title, structuredDocumentTag.title) &&
            Objects.equals(this.wordOpenXML, structuredDocumentTag.wordOpenXML) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appearance, buildingBlockCategory, buildingBlockGallery, calendarType, checked, color, dateDisplayFormat, dateDisplayLocale, dateStorageFormat, fullDate, id, isShowingPlaceholderText, isTemporary, level, listItems, lockContentControl, lockContents, multiline, placeholderName, sdtType, styleName, tag, title, wordOpenXML, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDocumentTag {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(getNodeId())).append("\n");
    sb.append("    appearance: ").append(toIndentedString(getAppearance())).append("\n");
    sb.append("    buildingBlockCategory: ").append(toIndentedString(getBuildingBlockCategory())).append("\n");
    sb.append("    buildingBlockGallery: ").append(toIndentedString(getBuildingBlockGallery())).append("\n");
    sb.append("    calendarType: ").append(toIndentedString(getCalendarType())).append("\n");
    sb.append("    checked: ").append(toIndentedString(getChecked())).append("\n");
    sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
    sb.append("    dateDisplayFormat: ").append(toIndentedString(getDateDisplayFormat())).append("\n");
    sb.append("    dateDisplayLocale: ").append(toIndentedString(getDateDisplayLocale())).append("\n");
    sb.append("    dateStorageFormat: ").append(toIndentedString(getDateStorageFormat())).append("\n");
    sb.append("    fullDate: ").append(toIndentedString(getFullDate())).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    isShowingPlaceholderText: ").append(toIndentedString(getIsShowingPlaceholderText())).append("\n");
    sb.append("    isTemporary: ").append(toIndentedString(getIsTemporary())).append("\n");
    sb.append("    level: ").append(toIndentedString(getLevel())).append("\n");
    sb.append("    listItems: ").append(toIndentedString(getListItems())).append("\n");
    sb.append("    lockContentControl: ").append(toIndentedString(getLockContentControl())).append("\n");
    sb.append("    lockContents: ").append(toIndentedString(getLockContents())).append("\n");
    sb.append("    multiline: ").append(toIndentedString(getMultiline())).append("\n");
    sb.append("    placeholderName: ").append(toIndentedString(getPlaceholderName())).append("\n");
    sb.append("    sdtType: ").append(toIndentedString(getSdtType())).append("\n");
    sb.append("    styleName: ").append(toIndentedString(getStyleName())).append("\n");
    sb.append("    tag: ").append(toIndentedString(getTag())).append("\n");
    sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
    sb.append("    wordOpenXML: ").append(toIndentedString(getWordOpenXML())).append("\n");
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
