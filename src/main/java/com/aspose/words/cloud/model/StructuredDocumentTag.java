/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StructuredDocumentTag.java">
 *   Copyright (c) 2024 Aspose.Words for Cloud
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
 * DTO container with a StructuredDocumentTag.
 */
@ApiModel(description = "DTO container with a StructuredDocumentTag.")
public class StructuredDocumentTag extends StructuredDocumentTagBase {
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

    @SerializedName("Level")
    protected LevelEnum level;

    @SerializedName("SdtType")
    protected SdtTypeEnum sdtType;
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


    public StructuredDocumentTag() {
        super();
        this.level = null;
        this.sdtType = null;
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
            Objects.equals(this.level, structuredDocumentTag.level) &&
            Objects.equals(this.sdtType, structuredDocumentTag.sdtType) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, sdtType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDocumentTag {\n");
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
    sb.append("    level: ").append(toIndentedString(getLevel())).append("\n");
    sb.append("    sdtType: ").append(toIndentedString(getSdtType())).append("\n");
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
