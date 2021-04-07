/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TxtSaveOptionsBaseData.java">
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
 * Base class for save options of text formats.
 */
@ApiModel(description = "Base class for save options of text formats.")
public class TxtSaveOptionsBaseData extends SaveOptionsData {
    /**
     * Gets or sets the option that controls whether to output headers and footers when exporting in plain text format.
     * default value is TxtExportHeadersFootersMode.PrimaryOnly.
     */
    @JsonAdapter(ExportHeadersFootersModeEnum.Adapter.class)
    public enum ExportHeadersFootersModeEnum {
        NONE("None"),
        PRIMARYONLY("PrimaryOnly"),
        ALLATEND("AllAtEnd");

        private String value;

        ExportHeadersFootersModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ExportHeadersFootersModeEnum fromValue(String text) {
            for (ExportHeadersFootersModeEnum b : ExportHeadersFootersModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< ExportHeadersFootersModeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final ExportHeadersFootersModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ExportHeadersFootersModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ExportHeadersFootersModeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Encoding")
    private String encoding = null;

    @SerializedName("ExportHeadersFootersMode")
    private ExportHeadersFootersModeEnum exportHeadersFootersMode = null;

    @SerializedName("ForcePageBreaks")
    private Boolean forcePageBreaks = null;

    @SerializedName("ParagraphBreak")
    private String paragraphBreak = null;
    public TxtSaveOptionsBaseData encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Gets or sets the character encoding to use when exporting in plain text format.
    * @return encoding
    **/
    @ApiModelProperty(value = "Gets or sets the character encoding to use when exporting in plain text format.")
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public TxtSaveOptionsBaseData exportHeadersFootersMode(ExportHeadersFootersModeEnum exportHeadersFootersMode) {
        this.exportHeadersFootersMode = exportHeadersFootersMode;
        return this;
    }

    /**
     * Gets or sets the option that controls whether to output headers and footers when exporting in plain text format.
     * default value is TxtExportHeadersFootersMode.PrimaryOnly.
    * @return exportHeadersFootersMode
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls whether to output headers and footers when exporting in plain text format. default value is TxtExportHeadersFootersMode.PrimaryOnly.")
    public ExportHeadersFootersModeEnum getExportHeadersFootersMode() {
        return exportHeadersFootersMode;
    }

    public void setExportHeadersFootersMode(ExportHeadersFootersModeEnum exportHeadersFootersMode) {
        this.exportHeadersFootersMode = exportHeadersFootersMode;
    }

    public TxtSaveOptionsBaseData forcePageBreaks(Boolean forcePageBreaks) {
        this.forcePageBreaks = forcePageBreaks;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the page breaks should be preserved during export.
     * The default value is false.
    * @return forcePageBreaks
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the page breaks should be preserved during export. The default value is false.")
    public Boolean getForcePageBreaks() {
        return forcePageBreaks;
    }

    public void setForcePageBreaks(Boolean forcePageBreaks) {
        this.forcePageBreaks = forcePageBreaks;
    }

    public TxtSaveOptionsBaseData paragraphBreak(String paragraphBreak) {
        this.paragraphBreak = paragraphBreak;
        return this;
    }

    /**
     * Gets or sets the string to use as a paragraph break when exporting in plain text format.
    * @return paragraphBreak
    **/
    @ApiModelProperty(value = "Gets or sets the string to use as a paragraph break when exporting in plain text format.")
    public String getParagraphBreak() {
        return paragraphBreak;
    }

    public void setParagraphBreak(String paragraphBreak) {
        this.paragraphBreak = paragraphBreak;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TxtSaveOptionsBaseData txtSaveOptionsBaseData = (TxtSaveOptionsBaseData) o;
        return
            Objects.equals(this.encoding, txtSaveOptionsBaseData.encoding) &&
            Objects.equals(this.exportHeadersFootersMode, txtSaveOptionsBaseData.exportHeadersFootersMode) &&
            Objects.equals(this.forcePageBreaks, txtSaveOptionsBaseData.forcePageBreaks) &&
            Objects.equals(this.paragraphBreak, txtSaveOptionsBaseData.paragraphBreak) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, exportHeadersFootersMode, forcePageBreaks, paragraphBreak, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxtSaveOptionsBaseData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    exportHeadersFootersMode: ").append(toIndentedString(exportHeadersFootersMode)).append("\n");
    sb.append("    forcePageBreaks: ").append(toIndentedString(forcePageBreaks)).append("\n");
    sb.append("    paragraphBreak: ").append(toIndentedString(paragraphBreak)).append("\n");
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
