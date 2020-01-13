/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2019 Aspose.Words for Cloud
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
import com.aspose.words.cloud.model.SaveOptionsData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Container class for text save options.
 */
@ApiModel(description = "Container class for text save options.")

public class TextSaveOptionsData extends SaveOptionsData {
  @SerializedName("AddBidiMarks")
  private Boolean addBidiMarks = null;

  @SerializedName("Encoding")
  private String encoding = null;

  /**
   * Gets or sets specifies whether to output headers and footers when exporting in plain text format. default value is TxtExportHeadersFootersMode.PrimaryOnly.
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

    public static class Adapter extends TypeAdapter<ExportHeadersFootersModeEnum> {
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

  @SerializedName("ExportHeadersFootersMode")
  private ExportHeadersFootersModeEnum exportHeadersFootersMode = null;

  @SerializedName("ForcePageBreaks")
  private Boolean forcePageBreaks = null;

  @SerializedName("ParagraphBreak")
  private String paragraphBreak = null;

  @SerializedName("PreserveTableLayout")
  private Boolean preserveTableLayout = null;

  @SerializedName("SimplifyListLabels")
  private Boolean simplifyListLabels = null;

  public TextSaveOptionsData addBidiMarks(Boolean addBidiMarks) {
    this.addBidiMarks = addBidiMarks;
    return this;
  }

   /**
   * Gets or sets specifies whether to add bi-directional marks before each BiDi run when exporting in plain text format. The default value is true.
   * @return addBidiMarks
  **/
  @ApiModelProperty(value = "Gets or sets specifies whether to add bi-directional marks before each BiDi run when exporting in plain text format. The default value is true.")
  public Boolean isAddBidiMarks() {
    return addBidiMarks;
  }

  public void setAddBidiMarks(Boolean addBidiMarks) {
    this.addBidiMarks = addBidiMarks;
  }

  public TextSaveOptionsData encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Gets or sets specifies the encoding to use when exporting in plain text format.
   * @return encoding
  **/
  @ApiModelProperty(value = "Gets or sets specifies the encoding to use when exporting in plain text format.")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public TextSaveOptionsData exportHeadersFootersMode(ExportHeadersFootersModeEnum exportHeadersFootersMode) {
    this.exportHeadersFootersMode = exportHeadersFootersMode;
    return this;
  }

   /**
   * Gets or sets specifies whether to output headers and footers when exporting in plain text format. default value is TxtExportHeadersFootersMode.PrimaryOnly.
   * @return exportHeadersFootersMode
  **/
  @ApiModelProperty(value = "Gets or sets specifies whether to output headers and footers when exporting in plain text format. default value is TxtExportHeadersFootersMode.PrimaryOnly.")
  public ExportHeadersFootersModeEnum getExportHeadersFootersMode() {
    return exportHeadersFootersMode;
  }

  public void setExportHeadersFootersMode(ExportHeadersFootersModeEnum exportHeadersFootersMode) {
    this.exportHeadersFootersMode = exportHeadersFootersMode;
  }

  public TextSaveOptionsData forcePageBreaks(Boolean forcePageBreaks) {
    this.forcePageBreaks = forcePageBreaks;
    return this;
  }

   /**
   * Gets or sets allows to specify whether the page breaks should be preserved during export. The default value is false.
   * @return forcePageBreaks
  **/
  @ApiModelProperty(value = "Gets or sets allows to specify whether the page breaks should be preserved during export. The default value is false.")
  public Boolean isForcePageBreaks() {
    return forcePageBreaks;
  }

  public void setForcePageBreaks(Boolean forcePageBreaks) {
    this.forcePageBreaks = forcePageBreaks;
  }

  public TextSaveOptionsData paragraphBreak(String paragraphBreak) {
    this.paragraphBreak = paragraphBreak;
    return this;
  }

   /**
   * Gets or sets specifies the string to use as a paragraph break when exporting in plain text format.
   * @return paragraphBreak
  **/
  @ApiModelProperty(value = "Gets or sets specifies the string to use as a paragraph break when exporting in plain text format.")
  public String getParagraphBreak() {
    return paragraphBreak;
  }

  public void setParagraphBreak(String paragraphBreak) {
    this.paragraphBreak = paragraphBreak;
  }

  public TextSaveOptionsData preserveTableLayout(Boolean preserveTableLayout) {
    this.preserveTableLayout = preserveTableLayout;
    return this;
  }

   /**
   * Gets or sets specifies whether the program should attempt to preserve layout of tables when saving in the plain text format.
   * @return preserveTableLayout
  **/
  @ApiModelProperty(value = "Gets or sets specifies whether the program should attempt to preserve layout of tables when saving in the plain text format.")
  public Boolean isPreserveTableLayout() {
    return preserveTableLayout;
  }

  public void setPreserveTableLayout(Boolean preserveTableLayout) {
    this.preserveTableLayout = preserveTableLayout;
  }

  public TextSaveOptionsData simplifyListLabels(Boolean simplifyListLabels) {
    this.simplifyListLabels = simplifyListLabels;
    return this;
  }

   /**
   * Gets or sets specifies whether the program should simplify list labels in case of complex label formatting not being adequately represented by plain text.
   * @return simplifyListLabels
  **/
  @ApiModelProperty(value = "Gets or sets specifies whether the program should simplify list labels in case of complex label formatting not being adequately represented by plain text.")
  public Boolean isSimplifyListLabels() {
    return simplifyListLabels;
  }

  public void setSimplifyListLabels(Boolean simplifyListLabels) {
    this.simplifyListLabels = simplifyListLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextSaveOptionsData textSaveOptionsData = (TextSaveOptionsData) o;
    return Objects.equals(this.addBidiMarks, textSaveOptionsData.addBidiMarks) &&
        Objects.equals(this.encoding, textSaveOptionsData.encoding) &&
        Objects.equals(this.exportHeadersFootersMode, textSaveOptionsData.exportHeadersFootersMode) &&
        Objects.equals(this.forcePageBreaks, textSaveOptionsData.forcePageBreaks) &&
        Objects.equals(this.paragraphBreak, textSaveOptionsData.paragraphBreak) &&
        Objects.equals(this.preserveTableLayout, textSaveOptionsData.preserveTableLayout) &&
        Objects.equals(this.simplifyListLabels, textSaveOptionsData.simplifyListLabels) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addBidiMarks, encoding, exportHeadersFootersMode, forcePageBreaks, paragraphBreak, preserveTableLayout, simplifyListLabels, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    addBidiMarks: ").append(toIndentedString(addBidiMarks)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    exportHeadersFootersMode: ").append(toIndentedString(exportHeadersFootersMode)).append("\n");
    sb.append("    forcePageBreaks: ").append(toIndentedString(forcePageBreaks)).append("\n");
    sb.append("    paragraphBreak: ").append(toIndentedString(paragraphBreak)).append("\n");
    sb.append("    preserveTableLayout: ").append(toIndentedString(preserveTableLayout)).append("\n");
    sb.append("    simplifyListLabels: ").append(toIndentedString(simplifyListLabels)).append("\n");
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

