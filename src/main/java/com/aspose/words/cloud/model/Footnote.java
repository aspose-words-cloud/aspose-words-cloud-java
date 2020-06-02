/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Footnote.java">
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
 * Footnote.
 */
@ApiModel(description = "Footnote.")
public class Footnote extends FootnoteLink {
    /**
     * Gets or sets returns a value that specifies whether this is a footnote or endnote.
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

    @SerializedName("Content")
    private StoryChildNodes content = null;

    @SerializedName("FootnoteType")
    private FootnoteTypeEnum footnoteType = null;

    @SerializedName("Position")
    private DocumentPosition position = null;

    @SerializedName("ReferenceMark")
    private String referenceMark = null;

    @SerializedName("Text")
    private String text = null;
    public Footnote content(StoryChildNodes content) {
        this.content = content;
        return this;
    }

    /**
     * Gets or sets content of footnote.
    * @return content
    **/
    @ApiModelProperty(value = "Gets or sets content of footnote.")
    public StoryChildNodes getContent() {
        return content;
    }

    public void setContent(StoryChildNodes content) {
        this.content = content;
    }

    public Footnote footnoteType(FootnoteTypeEnum footnoteType) {
        this.footnoteType = footnoteType;
        return this;
    }

    /**
     * Gets or sets returns a value that specifies whether this is a footnote or endnote.
    * @return footnoteType
    **/
    @ApiModelProperty(value = "Gets or sets returns a value that specifies whether this is a footnote or endnote.")
    public FootnoteTypeEnum getFootnoteType() {
        return footnoteType;
    }

    public void setFootnoteType(FootnoteTypeEnum footnoteType) {
        this.footnoteType = footnoteType;
    }

    public Footnote position(DocumentPosition position) {
        this.position = position;
        return this;
    }

    /**
     * Gets or sets link to comment range start node.
    * @return position
    **/
    @ApiModelProperty(value = "Gets or sets link to comment range start node.")
    public DocumentPosition getPosition() {
        return position;
    }

    public void setPosition(DocumentPosition position) {
        this.position = position;
    }

    public Footnote referenceMark(String referenceMark) {
        this.referenceMark = referenceMark;
        return this;
    }

    /**
     * Gets or sets /sets custom reference mark to be used for this footnote.
     * Default value is Empty, meaning auto-numbered footnotes are used.
    * @return referenceMark
    **/
    @ApiModelProperty(value = "Gets or sets /sets custom reference mark to be used for this footnote. Default value is Empty, meaning auto-numbered footnotes are used.")
    public String getReferenceMark() {
        return referenceMark;
    }

    public void setReferenceMark(String referenceMark) {
        this.referenceMark = referenceMark;
    }

    public Footnote text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Gets or sets this is a convenience property that allows to easily get or set text of the footnote.
    * @return text
    **/
    @ApiModelProperty(value = "Gets or sets this is a convenience property that allows to easily get or set text of the footnote.")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    Footnote footnote = (Footnote)o;
    return
        Objects.equals(this.content, footnote.content) &&
        Objects.equals(this.footnoteType, footnote.footnoteType) &&
        Objects.equals(this.position, footnote.position) &&
        Objects.equals(this.referenceMark, footnote.referenceMark) &&
        Objects.equals(this.text, footnote.text) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, footnoteType, position, referenceMark, text, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Footnote {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    footnoteType: ").append(toIndentedString(footnoteType)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    referenceMark: ").append(toIndentedString(referenceMark)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
