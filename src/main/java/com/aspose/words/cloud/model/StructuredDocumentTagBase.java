/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StructuredDocumentTagBase.java">
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
 * DTO container with a StructuredDocumentTagBaseDto.
 */
@ApiModel(description = "DTO container with a StructuredDocumentTagBaseDto.")
public abstract class StructuredDocumentTagBase extends NodeLink {
    /**
     * Gets or sets the appearance of a structured document tag.
     */
    @JsonAdapter(AppearanceEnum.Adapter.class)
    public enum AppearanceEnum {
        BOUNDINGBOX("BoundingBox"),
        DEFAULT("Default"),
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
     * Gets or sets format in which the date for a date SDT is stored when the SDT is bound to an XML node in the document's data store.
     * Default value is Aspose.Words.Markup.SdtDateStorageFormat.DateTime.
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type.
     * For all other SDT types exception will occur.
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
     * Gets or sets the type of calendar for this SDT. Default is Aspose.Words.Markup.SdtCalendarType.Default.
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type.
     * For all other SDT types exception will occur.
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

    @SerializedName("ListItems")
    protected List<StructuredDocumentTagListItem> listItems;

    @SerializedName("Checked")
    protected Boolean checked;

    @SerializedName("Appearance")
    protected AppearanceEnum appearance;

    @SerializedName("DateDisplayLocale")
    protected Integer dateDisplayLocale;

    @SerializedName("DateDisplayFormat")
    protected String dateDisplayFormat;

    @SerializedName("FullDate")
    protected OffsetDateTime fullDate;

    @SerializedName("Title")
    protected String title;

    @SerializedName("DateStorageFormat")
    protected DateStorageFormatEnum dateStorageFormat;

    @SerializedName("BuildingBlockGallery")
    protected String buildingBlockGallery;

    @SerializedName("BuildingBlockCategory")
    protected String buildingBlockCategory;

    @SerializedName("Multiline")
    protected Boolean multiline;

    @SerializedName("Color")
    protected XmlColor color;

    @SerializedName("StyleName")
    protected String styleName;

    @SerializedName("CalendarType")
    protected CalendarTypeEnum calendarType;

    @SerializedName("IsTemporary")
    protected Boolean isTemporary;

    @SerializedName("PlaceholderName")
    protected String placeholderName;

    @SerializedName("LockContentControl")
    protected Boolean lockContentControl;

    @SerializedName("LockContents")
    protected Boolean lockContents;

    @SerializedName("IsShowingPlaceholderText")
    protected Boolean isShowingPlaceholderText;

    @SerializedName("Tag")
    protected String tag;

    @SerializedName("Id")
    protected Integer id;

    @SerializedName("WordOpenXML")
    protected String wordOpenXML;
    /**
     * Gets or sets Aspose.Words.Markup.SdtListItemCollection associated with this SDT.
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.ComboBox or Aspose.Words.Markup.SdtType.DropDownList SDT types.
     * For all other SDT types exception will occur.
    * @return listItems
    **/
    @ApiModelProperty(value = "Gets or sets Aspose.Words.Markup.SdtListItemCollection associated with this SDT. Accessing this property will only work for Aspose.Words.Markup.SdtType.ComboBox or Aspose.Words.Markup.SdtType.DropDownList SDT types. For all other SDT types exception will occur.")
    public List<StructuredDocumentTagListItem> getListItems() {
        return listItems;
    }

    public StructuredDocumentTagBase listItems(List<StructuredDocumentTagListItem> listItems) {
        this.listItems = listItems;
        return this;
    }

    public StructuredDocumentTagBase addListItemsItem(StructuredDocumentTagListItem listItemsItem) {
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
     * Gets or sets a value indicating whether current state of the Checkbox SDT. Default value for this property.
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.Checkbox SDT types.
     * For all other SDT types exception will occur.
    * @return checked
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether current state of the Checkbox SDT. Default value for this property. Accessing this property will only work for Aspose.Words.Markup.SdtType.Checkbox SDT types. For all other SDT types exception will occur.")
    public Boolean getChecked() {
        return checked;
    }

    public StructuredDocumentTagBase checked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }


    /**
     * Gets or sets the appearance of a structured document tag.
    * @return appearance
    **/
    @ApiModelProperty(value = "Gets or sets the appearance of a structured document tag.")
    public AppearanceEnum getAppearance() {
        return appearance;
    }

    public StructuredDocumentTagBase appearance(AppearanceEnum appearance) {
        this.appearance = appearance;
        return this;
    }

    public void setAppearance(AppearanceEnum appearance) {
        this.appearance = appearance;
    }


    /**
     * Gets or sets the language format for the date displayed in this SDT.
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type.
     * For all other SDT types exception will occur.
    * @return dateDisplayLocale
    **/
    @ApiModelProperty(value = "Gets or sets the language format for the date displayed in this SDT. Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type. For all other SDT types exception will occur.")
    public Integer getDateDisplayLocale() {
        return dateDisplayLocale;
    }

    public StructuredDocumentTagBase dateDisplayLocale(Integer dateDisplayLocale) {
        this.dateDisplayLocale = dateDisplayLocale;
        return this;
    }

    public void setDateDisplayLocale(Integer dateDisplayLocale) {
        this.dateDisplayLocale = dateDisplayLocale;
    }


    /**
     * Gets or sets String that represents the format in which dates are displayed. Can not be null. The dates for English (U.S.) is "mm/dd/yyyy".
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type.
     * For all other SDT types exception will occur.
    * @return dateDisplayFormat
    **/
    @ApiModelProperty(value = "Gets or sets String that represents the format in which dates are displayed. Can not be null. The dates for English (U.S.) is \"mm/dd/yyyy\". Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type. For all other SDT types exception will occur.")
    public String getDateDisplayFormat() {
        return dateDisplayFormat;
    }

    public StructuredDocumentTagBase dateDisplayFormat(String dateDisplayFormat) {
        this.dateDisplayFormat = dateDisplayFormat;
        return this;
    }

    public void setDateDisplayFormat(String dateDisplayFormat) {
        this.dateDisplayFormat = dateDisplayFormat;
    }


    /**
     * Gets or sets the full date and time last entered into this SDT.
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type.
     * For all other SDT types exception will occur.
    * @return fullDate
    **/
    @ApiModelProperty(value = "Gets or sets the full date and time last entered into this SDT. Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type. For all other SDT types exception will occur.")
    public OffsetDateTime getFullDate() {
        return fullDate;
    }

    public StructuredDocumentTagBase fullDate(OffsetDateTime fullDate) {
        this.fullDate = fullDate;
        return this;
    }

    public void setFullDate(OffsetDateTime fullDate) {
        this.fullDate = fullDate;
    }


    /**
     * Gets or sets the friendly name associated with this SDT. Can not be null.
    * @return title
    **/
    @ApiModelProperty(value = "Gets or sets the friendly name associated with this SDT. Can not be null.")
    public String getTitle() {
        return title;
    }

    public StructuredDocumentTagBase title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets or sets format in which the date for a date SDT is stored when the SDT is bound to an XML node in the document's data store.
     * Default value is Aspose.Words.Markup.SdtDateStorageFormat.DateTime.
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type.
     * For all other SDT types exception will occur.
    * @return dateStorageFormat
    **/
    @ApiModelProperty(value = "Gets or sets format in which the date for a date SDT is stored when the SDT is bound to an XML node in the document's data store. Default value is Aspose.Words.Markup.SdtDateStorageFormat.DateTime. Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type. For all other SDT types exception will occur.")
    public DateStorageFormatEnum getDateStorageFormat() {
        return dateStorageFormat;
    }

    public StructuredDocumentTagBase dateStorageFormat(DateStorageFormatEnum dateStorageFormat) {
        this.dateStorageFormat = dateStorageFormat;
        return this;
    }

    public void setDateStorageFormat(DateStorageFormatEnum dateStorageFormat) {
        this.dateStorageFormat = dateStorageFormat;
    }


    /**
     * Gets or sets type of building block for this SDT. Can not be null.
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.BuildingBlockGallery and Aspose.Words.Markup.SdtType.DocPartObj SDT types.
     * It is read-only for SDT of the document part type.
     * For all other SDT types exception will occur.
    * @return buildingBlockGallery
    **/
    @ApiModelProperty(value = "Gets or sets type of building block for this SDT. Can not be null. Accessing this property will only work for Aspose.Words.Markup.SdtType.BuildingBlockGallery and Aspose.Words.Markup.SdtType.DocPartObj SDT types. It is read-only for SDT of the document part type. For all other SDT types exception will occur.")
    public String getBuildingBlockGallery() {
        return buildingBlockGallery;
    }

    public StructuredDocumentTagBase buildingBlockGallery(String buildingBlockGallery) {
        this.buildingBlockGallery = buildingBlockGallery;
        return this;
    }

    public void setBuildingBlockGallery(String buildingBlockGallery) {
        this.buildingBlockGallery = buildingBlockGallery;
    }


    /**
     * Gets or sets category of building block for this SDT node. Can not be null.
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.BuildingBlockGallery and Aspose.Words.Markup.SdtType.DocPartObj SDT types.
     * It is read-only for SDT of the document part type. For all other SDT types exception will occur.
    * @return buildingBlockCategory
    **/
    @ApiModelProperty(value = "Gets or sets category of building block for this SDT node. Can not be null. Accessing this property will only work for Aspose.Words.Markup.SdtType.BuildingBlockGallery and Aspose.Words.Markup.SdtType.DocPartObj SDT types. It is read-only for SDT of the document part type. For all other SDT types exception will occur.")
    public String getBuildingBlockCategory() {
        return buildingBlockCategory;
    }

    public StructuredDocumentTagBase buildingBlockCategory(String buildingBlockCategory) {
        this.buildingBlockCategory = buildingBlockCategory;
        return this;
    }

    public void setBuildingBlockCategory(String buildingBlockCategory) {
        this.buildingBlockCategory = buildingBlockCategory;
    }


    /**
     * Gets or sets a value indicating whether this SDT allows multiple lines of text.
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.RichText and Aspose.Words.Markup.SdtType.PlainText SDT type.
     * For all other SDT types exception will occur.
    * @return multiline
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this SDT allows multiple lines of text. Accessing this property will only work for Aspose.Words.Markup.SdtType.RichText and Aspose.Words.Markup.SdtType.PlainText SDT type. For all other SDT types exception will occur.")
    public Boolean getMultiline() {
        return multiline;
    }

    public StructuredDocumentTagBase multiline(Boolean multiline) {
        this.multiline = multiline;
        return this;
    }

    public void setMultiline(Boolean multiline) {
        this.multiline = multiline;
    }


    /**
     * Gets or sets the color of the structured document tag.
    * @return color
    **/
    @ApiModelProperty(value = "Gets or sets the color of the structured document tag.")
    public XmlColor getColor() {
        return color;
    }

    public StructuredDocumentTagBase color(XmlColor color) {
        this.color = color;
        return this;
    }

    public void setColor(XmlColor color) {
        this.color = color;
    }


    /**
     * Gets or sets the name of the style applied to the structured document tag.
    * @return styleName
    **/
    @ApiModelProperty(value = "Gets or sets the name of the style applied to the structured document tag.")
    public String getStyleName() {
        return styleName;
    }

    public StructuredDocumentTagBase styleName(String styleName) {
        this.styleName = styleName;
        return this;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }


    /**
     * Gets or sets the type of calendar for this SDT. Default is Aspose.Words.Markup.SdtCalendarType.Default.
     * Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type.
     * For all other SDT types exception will occur.
    * @return calendarType
    **/
    @ApiModelProperty(value = "Gets or sets the type of calendar for this SDT. Default is Aspose.Words.Markup.SdtCalendarType.Default. Accessing this property will only work for Aspose.Words.Markup.SdtType.Date SDT type. For all other SDT types exception will occur.")
    public CalendarTypeEnum getCalendarType() {
        return calendarType;
    }

    public StructuredDocumentTagBase calendarType(CalendarTypeEnum calendarType) {
        this.calendarType = calendarType;
        return this;
    }

    public void setCalendarType(CalendarTypeEnum calendarType) {
        this.calendarType = calendarType;
    }


    /**
     * Gets or sets a value indicating whether this SDT shall be removed from the WordProcessingML document when its contents are modified.
    * @return isTemporary
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether this SDT shall be removed from the WordProcessingML document when its contents are modified.")
    public Boolean getIsTemporary() {
        return isTemporary;
    }

    public StructuredDocumentTagBase isTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
        return this;
    }

    public void setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
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

    public StructuredDocumentTagBase placeholderName(String placeholderName) {
        this.placeholderName = placeholderName;
        return this;
    }

    public void setPlaceholderName(String placeholderName) {
        this.placeholderName = placeholderName;
    }


    /**
     * Gets or sets a value indicating whether, this property will prohibit a user from deleting this SDT.
    * @return lockContentControl
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether, this property will prohibit a user from deleting this SDT.")
    public Boolean getLockContentControl() {
        return lockContentControl;
    }

    public StructuredDocumentTagBase lockContentControl(Boolean lockContentControl) {
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

    public StructuredDocumentTagBase lockContents(Boolean lockContents) {
        this.lockContents = lockContents;
        return this;
    }

    public void setLockContents(Boolean lockContents) {
        this.lockContents = lockContents;
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

    public StructuredDocumentTagBase isShowingPlaceholderText(Boolean isShowingPlaceholderText) {
        this.isShowingPlaceholderText = isShowingPlaceholderText;
        return this;
    }

    public void setIsShowingPlaceholderText(Boolean isShowingPlaceholderText) {
        this.isShowingPlaceholderText = isShowingPlaceholderText;
    }


    /**
     * Gets or sets a tag associated with the current SDT node. Can not be null.
     * A tag is an arbitrary string which applications can associate with SDT in order to identify it without providing a visible friendly name.
    * @return tag
    **/
    @ApiModelProperty(value = "Gets or sets a tag associated with the current SDT node. Can not be null. A tag is an arbitrary string which applications can associate with SDT in order to identify it without providing a visible friendly name.")
    public String getTag() {
        return tag;
    }

    public StructuredDocumentTagBase tag(String tag) {
        this.tag = tag;
        return this;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


    /**
     * Gets or sets a unique read-only persistent numerical Id for this SDT.
     * Id attribute shall follow these rules:
     * - The document shall retain SDT ids only if the whole document is cloned Aspose.Words.Document.Clone.
     * - During Aspose.Words.DocumentBase.ImportNode(Aspose.Words.Node,System.Boolean)
     * - Id shall be retained if import does not cause conflicts with other SDT Ids in the target document.
     * - If multiple SDT nodes specify the same decimal number value for the Id attribute, then the first SDT in the document shall maintain this original Id, and all subsequent
     * - SDT nodes shall have new identifiers assigned to them when the document is loaded.
     * - During standalone SDT Aspose.Words.Markup.StructuredDocumentTag.Clone(System.Boolean,Aspose.Words.INodeCloningListener) operation new unique ID will be generated for the cloned SDT node.
     * - If Id is not specified in the source document, then the SDT node shall have a new unique identifier assigned to it when the document is loaded.
    * @return id
    **/
    @ApiModelProperty(value = "Gets or sets a unique read-only persistent numerical Id for this SDT. Id attribute shall follow these rules: - The document shall retain SDT ids only if the whole document is cloned Aspose.Words.Document.Clone. - During Aspose.Words.DocumentBase.ImportNode(Aspose.Words.Node,System.Boolean) - Id shall be retained if import does not cause conflicts with other SDT Ids in the target document. - If multiple SDT nodes specify the same decimal number value for the Id attribute, then the first SDT in the document shall maintain this original Id, and all subsequent - SDT nodes shall have new identifiers assigned to them when the document is loaded. - During standalone SDT Aspose.Words.Markup.StructuredDocumentTag.Clone(System.Boolean,Aspose.Words.INodeCloningListener) operation new unique ID will be generated for the cloned SDT node. - If Id is not specified in the source document, then the SDT node shall have a new unique identifier assigned to it when the document is loaded.")
    public Integer getId() {
        return id;
    }

    public StructuredDocumentTagBase id(Integer id) {
        this.id = id;
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * Gets a string that represents the XML contained within the node in the Aspose.Words.SaveFormat.FlatOpc format.
    * @return wordOpenXML
    **/
    @ApiModelProperty(value = "Gets a string that represents the XML contained within the node in the Aspose.Words.SaveFormat.FlatOpc format.")
    public String getWordOpenXML() {
        return wordOpenXML;
    }



    public StructuredDocumentTagBase() {
        super();
        this.listItems = null;
        this.checked = null;
        this.appearance = null;
        this.dateDisplayLocale = null;
        this.dateDisplayFormat = null;
        this.fullDate = null;
        this.title = null;
        this.dateStorageFormat = null;
        this.buildingBlockGallery = null;
        this.buildingBlockCategory = null;
        this.multiline = null;
        this.color = null;
        this.styleName = null;
        this.calendarType = null;
        this.isTemporary = null;
        this.placeholderName = null;
        this.lockContentControl = null;
        this.lockContents = null;
        this.isShowingPlaceholderText = null;
        this.tag = null;
        this.id = null;
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

    /*
     * Validate required properties.
     *
     * @throws ApiException If fails to validate required properties.
     */
    @Override
    public void validate() throws ApiException {
        super.validate();

        if (this.listItems != null) {
            for (ModelIfc elementListItems : this.listItems) {
                if (elementListItems != null) {
                    elementListItems.validate();
                }
            }
        }













        if (this.color != null) {
            this.color.validate();
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

        StructuredDocumentTagBase structuredDocumentTagBase = (StructuredDocumentTagBase) o;
        return
            Objects.equals(this.listItems, structuredDocumentTagBase.listItems) &&
            Objects.equals(this.checked, structuredDocumentTagBase.checked) &&
            Objects.equals(this.appearance, structuredDocumentTagBase.appearance) &&
            Objects.equals(this.dateDisplayLocale, structuredDocumentTagBase.dateDisplayLocale) &&
            Objects.equals(this.dateDisplayFormat, structuredDocumentTagBase.dateDisplayFormat) &&
            Objects.equals(this.fullDate, structuredDocumentTagBase.fullDate) &&
            Objects.equals(this.title, structuredDocumentTagBase.title) &&
            Objects.equals(this.dateStorageFormat, structuredDocumentTagBase.dateStorageFormat) &&
            Objects.equals(this.buildingBlockGallery, structuredDocumentTagBase.buildingBlockGallery) &&
            Objects.equals(this.buildingBlockCategory, structuredDocumentTagBase.buildingBlockCategory) &&
            Objects.equals(this.multiline, structuredDocumentTagBase.multiline) &&
            Objects.equals(this.color, structuredDocumentTagBase.color) &&
            Objects.equals(this.styleName, structuredDocumentTagBase.styleName) &&
            Objects.equals(this.calendarType, structuredDocumentTagBase.calendarType) &&
            Objects.equals(this.isTemporary, structuredDocumentTagBase.isTemporary) &&
            Objects.equals(this.placeholderName, structuredDocumentTagBase.placeholderName) &&
            Objects.equals(this.lockContentControl, structuredDocumentTagBase.lockContentControl) &&
            Objects.equals(this.lockContents, structuredDocumentTagBase.lockContents) &&
            Objects.equals(this.isShowingPlaceholderText, structuredDocumentTagBase.isShowingPlaceholderText) &&
            Objects.equals(this.tag, structuredDocumentTagBase.tag) &&
            Objects.equals(this.id, structuredDocumentTagBase.id) &&
            Objects.equals(this.wordOpenXML, structuredDocumentTagBase.wordOpenXML) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listItems, checked, appearance, dateDisplayLocale, dateDisplayFormat, fullDate, title, dateStorageFormat, buildingBlockGallery, buildingBlockCategory, multiline, color, styleName, calendarType, isTemporary, placeholderName, lockContentControl, lockContents, isShowingPlaceholderText, tag, id, wordOpenXML, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDocumentTagBase {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(getNodeId())).append("\n");
    sb.append("    listItems: ").append(toIndentedString(getListItems())).append("\n");
    sb.append("    checked: ").append(toIndentedString(getChecked())).append("\n");
    sb.append("    appearance: ").append(toIndentedString(getAppearance())).append("\n");
    sb.append("    dateDisplayLocale: ").append(toIndentedString(getDateDisplayLocale())).append("\n");
    sb.append("    dateDisplayFormat: ").append(toIndentedString(getDateDisplayFormat())).append("\n");
    sb.append("    fullDate: ").append(toIndentedString(getFullDate())).append("\n");
    sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
    sb.append("    dateStorageFormat: ").append(toIndentedString(getDateStorageFormat())).append("\n");
    sb.append("    buildingBlockGallery: ").append(toIndentedString(getBuildingBlockGallery())).append("\n");
    sb.append("    buildingBlockCategory: ").append(toIndentedString(getBuildingBlockCategory())).append("\n");
    sb.append("    multiline: ").append(toIndentedString(getMultiline())).append("\n");
    sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
    sb.append("    styleName: ").append(toIndentedString(getStyleName())).append("\n");
    sb.append("    calendarType: ").append(toIndentedString(getCalendarType())).append("\n");
    sb.append("    isTemporary: ").append(toIndentedString(getIsTemporary())).append("\n");
    sb.append("    placeholderName: ").append(toIndentedString(getPlaceholderName())).append("\n");
    sb.append("    lockContentControl: ").append(toIndentedString(getLockContentControl())).append("\n");
    sb.append("    lockContents: ").append(toIndentedString(getLockContents())).append("\n");
    sb.append("    isShowingPlaceholderText: ").append(toIndentedString(getIsShowingPlaceholderText())).append("\n");
    sb.append("    tag: ").append(toIndentedString(getTag())).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
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
