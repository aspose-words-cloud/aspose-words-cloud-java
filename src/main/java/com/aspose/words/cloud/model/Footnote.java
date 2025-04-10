/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Footnote.java">
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
 * DTO container with a footnote.
 */
@ApiModel(description = "DTO container with a footnote.")
public class Footnote extends FootnoteLink {
    /**
     * Gets or sets the value, that specifies whether this is a footnote or endnote.
     */
    @JsonAdapter(FootnoteTypeEnum.Adapter.class)
    public enum FootnoteTypeEnum {
        FOOTNOTE("Footnote"),
        ENDNOTE("Endnote");

        private String value;

        FootnoteTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FootnoteTypeEnum fromValue(String text) {
            for (FootnoteTypeEnum b : FootnoteTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< FootnoteTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final FootnoteTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FootnoteTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FootnoteTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Position")
    protected DocumentPosition position;

    @SerializedName("FootnoteType")
    protected FootnoteTypeEnum footnoteType;

    @SerializedName("ReferenceMark")
    protected String referenceMark;

    @SerializedName("Text")
    protected String text;

    @SerializedName("Content")
    protected StoryChildNodes content;
    /**
     * Gets or sets the link to comment range start node.
    * @return position
    **/
    @ApiModelProperty(value = "Gets or sets the link to comment range start node.")
    public DocumentPosition getPosition() {
        return position;
    }

    public Footnote position(DocumentPosition position) {
        this.position = position;
        return this;
    }

    public void setPosition(DocumentPosition position) {
        this.position = position;
    }


    /**
     * Gets or sets the value, that specifies whether this is a footnote or endnote.
    * @return footnoteType
    **/
    @ApiModelProperty(value = "Gets or sets the value, that specifies whether this is a footnote or endnote.")
    public FootnoteTypeEnum getFootnoteType() {
        return footnoteType;
    }

    public Footnote footnoteType(FootnoteTypeEnum footnoteType) {
        this.footnoteType = footnoteType;
        return this;
    }

    public void setFootnoteType(FootnoteTypeEnum footnoteType) {
        this.footnoteType = footnoteType;
    }


    /**
     * Gets or sets the custom reference mark to be used for this footnote.
     * Default value is Empty, meaning auto-numbered footnotes are used.
     * RTF-format can only store 1 symbol as custom reference mark, so upon export only the first symbol will be written others will be discard.
    * @return referenceMark
    **/
    @ApiModelProperty(value = "Gets or sets the custom reference mark to be used for this footnote. Default value is Empty, meaning auto-numbered footnotes are used. RTF-format can only store 1 symbol as custom reference mark, so upon export only the first symbol will be written others will be discard.")
    public String getReferenceMark() {
        return referenceMark;
    }

    public Footnote referenceMark(String referenceMark) {
        this.referenceMark = referenceMark;
        return this;
    }

    public void setReferenceMark(String referenceMark) {
        this.referenceMark = referenceMark;
    }


    /**
     * Gets or sets text of the footnote.
     * This method allows to quickly set text of a footnote from a string. The string can contain paragraph breaks, this will create paragraphs of text in the footnote accordingly.
    * @return text
    **/
    @ApiModelProperty(value = "Gets or sets text of the footnote. This method allows to quickly set text of a footnote from a string. The string can contain paragraph breaks, this will create paragraphs of text in the footnote accordingly.")
    public String getText() {
        return text;
    }

    public Footnote text(String text) {
        this.text = text;
        return this;
    }

    public void setText(String text) {
        this.text = text;
    }


    /**
     * Gets or sets the content of the footnote.
    * @return content
    **/
    @ApiModelProperty(value = "Gets or sets the content of the footnote.")
    public StoryChildNodes getContent() {
        return content;
    }

    public Footnote content(StoryChildNodes content) {
        this.content = content;
        return this;
    }

    public void setContent(StoryChildNodes content) {
        this.content = content;
    }


    public Footnote() {
        super();
        this.position = null;
        this.footnoteType = null;
        this.referenceMark = null;
        this.text = null;
        this.content = null;
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

        if (this.position != null) {
            this.position.validate();
        }






        if (this.content != null) {
            this.content.validate();
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

        Footnote footnote = (Footnote) o;
        return
            Objects.equals(this.position, footnote.position) &&
            Objects.equals(this.footnoteType, footnote.footnoteType) &&
            Objects.equals(this.referenceMark, footnote.referenceMark) &&
            Objects.equals(this.text, footnote.text) &&
            Objects.equals(this.content, footnote.content) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, footnoteType, referenceMark, text, content, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Footnote {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(getNodeId())).append("\n");
    sb.append("    position: ").append(toIndentedString(getPosition())).append("\n");
    sb.append("    footnoteType: ").append(toIndentedString(getFootnoteType())).append("\n");
    sb.append("    referenceMark: ").append(toIndentedString(getReferenceMark())).append("\n");
    sb.append("    text: ").append(toIndentedString(getText())).append("\n");
    sb.append("    content: ").append(toIndentedString(getContent())).append("\n");
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
