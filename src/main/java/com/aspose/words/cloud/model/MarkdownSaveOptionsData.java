/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MarkdownSaveOptionsData.java">
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
 * Container class for markdown save options.
 */
@ApiModel(description = "Container class for markdown save options.")
public class MarkdownSaveOptionsData extends TxtSaveOptionsBaseData {
    /**
     * Gets or sets the value, that specifies how to align contents in tables when exporting into the Markdown format.
     * The default value is Auto.
     */
    @JsonAdapter(TableContentAlignmentEnum.Adapter.class)
    public enum TableContentAlignmentEnum {
        AUTO("Auto"),
        LEFT("Left"),
        CENTER("Center"),
        RIGHT("Right");

        private String value;

        TableContentAlignmentEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TableContentAlignmentEnum fromValue(String text) {
            for (TableContentAlignmentEnum b : TableContentAlignmentEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TableContentAlignmentEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TableContentAlignmentEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TableContentAlignmentEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TableContentAlignmentEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("TableContentAlignment")
    private TableContentAlignmentEnum tableContentAlignment = null;
    public MarkdownSaveOptionsData tableContentAlignment(TableContentAlignmentEnum tableContentAlignment) {
        this.tableContentAlignment = tableContentAlignment;
        return this;
    }

    /**
     * Gets or sets the value, that specifies how to align contents in tables when exporting into the Markdown format.
     * The default value is Auto.
    * @return tableContentAlignment
    **/
    @ApiModelProperty(value = "Gets or sets the value, that specifies how to align contents in tables when exporting into the Markdown format. The default value is Auto.")
    public TableContentAlignmentEnum getTableContentAlignment() {
        return tableContentAlignment;
    }

    public void setTableContentAlignment(TableContentAlignmentEnum tableContentAlignment) {
        this.tableContentAlignment = tableContentAlignment;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MarkdownSaveOptionsData markdownSaveOptionsData = (MarkdownSaveOptionsData) o;
        return
            Objects.equals(this.tableContentAlignment, markdownSaveOptionsData.tableContentAlignment) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableContentAlignment, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkdownSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tableContentAlignment: ").append(toIndentedString(tableContentAlignment)).append("\n");
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
