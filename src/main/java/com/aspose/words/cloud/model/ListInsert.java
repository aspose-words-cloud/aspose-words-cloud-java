/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListInsert.java">
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
 * Insert document to document list.
 */
@ApiModel(description = "Insert document to document list.")
public class ListInsert {
    /**
     * Gets or sets the option that controls how list should be restarted at each section.
     */
    @JsonAdapter(TemplateEnum.Adapter.class)
    public enum TemplateEnum {
        BULLETDEFAULT("BulletDefault"),
        BULLETDISK("BulletDisk"),
        BULLETCIRCLE("BulletCircle"),
        BULLETSQUARE("BulletSquare"),
        BULLETDIAMONDS("BulletDiamonds"),
        BULLETARROWHEAD("BulletArrowHead"),
        BULLETTICK("BulletTick"),
        NUMBERDEFAULT("NumberDefault"),
        NUMBERARABICDOT("NumberArabicDot"),
        NUMBERARABICPARENTHESIS("NumberArabicParenthesis"),
        NUMBERUPPERCASEROMANDOT("NumberUppercaseRomanDot"),
        NUMBERUPPERCASELETTERDOT("NumberUppercaseLetterDot"),
        NUMBERLOWERCASELETTERPARENTHESIS("NumberLowercaseLetterParenthesis"),
        NUMBERLOWERCASELETTERDOT("NumberLowercaseLetterDot"),
        NUMBERLOWERCASEROMANDOT("NumberLowercaseRomanDot"),
        OUTLINENUMBERS("OutlineNumbers"),
        OUTLINELEGAL("OutlineLegal"),
        OUTLINEBULLETS("OutlineBullets"),
        OUTLINEHEADINGSARTICLESECTION("OutlineHeadingsArticleSection"),
        OUTLINEHEADINGSLEGAL("OutlineHeadingsLegal"),
        OUTLINEHEADINGSNUMBERS("OutlineHeadingsNumbers"),
        OUTLINEHEADINGSCHAPTER("OutlineHeadingsChapter");

        private String value;

        TemplateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TemplateEnum fromValue(String text) {
            for (TemplateEnum b : TemplateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TemplateEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TemplateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TemplateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TemplateEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Template")
    private TemplateEnum template = null;
    public ListInsert template(TemplateEnum template) {
        this.template = template;
        return this;
    }

    /**
     * Gets or sets the option that controls how list should be restarted at each section.
    * @return template
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how list should be restarted at each section.")
    public TemplateEnum getTemplate() {
        return template;
    }

    public void setTemplate(TemplateEnum template) {
        this.template = template;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ListInsert listInsert = (ListInsert) o;
        return
            Objects.equals(this.template, listInsert.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListInsert {\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
