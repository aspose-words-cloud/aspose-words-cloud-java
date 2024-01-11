/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WatermarkDataText.java">
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
 * Class for insert watermark text request building.
 */
@ApiModel(description = "Class for insert watermark text request building.")
public class WatermarkDataText extends WatermarkDataBase {
    /**
     * Gets or sets layout of the watermark. The default value is Aspose.Words.WatermarkLayout.Diagonal.
     */
    @JsonAdapter(LayoutEnum.Adapter.class)
    public enum LayoutEnum {
        HORIZONTAL("Horizontal"),
        DIAGONAL("Diagonal");

        private String value;

        LayoutEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LayoutEnum fromValue(String text) {
            for (LayoutEnum b : LayoutEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< LayoutEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final LayoutEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LayoutEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LayoutEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Color")
    protected XmlColor color;

    @SerializedName("FontFamily")
    protected String fontFamily;

    @SerializedName("FontSize")
    protected Double fontSize;

    @SerializedName("IsSemitrasparent")
    protected Boolean isSemitrasparent;

    @SerializedName("Layout")
    protected LayoutEnum layout;

    @SerializedName("Text")
    protected String text;
    /**
     * Gets or sets font color. The default value is System.Drawing.Color.Silver.
    * @return color
    **/
    @ApiModelProperty(value = "Gets or sets font color. The default value is System.Drawing.Color.Silver.")
    public XmlColor getColor() {
        return color;
    }

    public WatermarkDataText color(XmlColor color) {
        this.color = color;
        return this;
    }

    public void setColor(XmlColor color) {
        this.color = color;
    }


    /**
     * Gets or sets font family name. The default value is "Calibri".
    * @return fontFamily
    **/
    @ApiModelProperty(value = "Gets or sets font family name. The default value is \"Calibri\".")
    public String getFontFamily() {
        return fontFamily;
    }

    public WatermarkDataText fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }


    /**
     * Gets or sets a font size. The default value is 0 - auto.
     * Valid values range from 0 to 65.5 inclusive. Auto font size means that the watermark will be scaled to its max width and max height relative to the page margins.
    * @return fontSize
    **/
    @ApiModelProperty(value = "Gets or sets a font size. The default value is 0 - auto. Valid values range from 0 to 65.5 inclusive. Auto font size means that the watermark will be scaled to its max width and max height relative to the page margins.")
    public Double getFontSize() {
        return fontSize;
    }

    public WatermarkDataText fontSize(Double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public void setFontSize(Double fontSize) {
        this.fontSize = fontSize;
    }


    /**
     * Gets or sets a boolean value which is responsible for opacity of the watermark. The default value is true.
    * @return isSemitrasparent
    **/
    @ApiModelProperty(value = "Gets or sets a boolean value which is responsible for opacity of the watermark. The default value is true.")
    public Boolean getIsSemitrasparent() {
        return isSemitrasparent;
    }

    public WatermarkDataText isSemitrasparent(Boolean isSemitrasparent) {
        this.isSemitrasparent = isSemitrasparent;
        return this;
    }

    public void setIsSemitrasparent(Boolean isSemitrasparent) {
        this.isSemitrasparent = isSemitrasparent;
    }


    /**
     * Gets or sets layout of the watermark. The default value is Aspose.Words.WatermarkLayout.Diagonal.
    * @return layout
    **/
    @ApiModelProperty(value = "Gets or sets layout of the watermark. The default value is Aspose.Words.WatermarkLayout.Diagonal.")
    public LayoutEnum getLayout() {
        return layout;
    }

    public WatermarkDataText layout(LayoutEnum layout) {
        this.layout = layout;
        return this;
    }

    public void setLayout(LayoutEnum layout) {
        this.layout = layout;
    }


    /**
     * Gets or sets the watermark text.
    * @return text
    **/
    @ApiModelProperty(value = "Gets or sets the watermark text.")
    public String getText() {
        return text;
    }

    public WatermarkDataText text(String text) {
        this.text = text;
        return this;
    }

    public void setText(String text) {
        this.text = text;
    }


    public WatermarkDataText() {
        super();
        this.color = null;
        this.fontFamily = null;
        this.fontSize = null;
        this.isSemitrasparent = null;
        this.layout = null;
        this.text = null;
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
        if (this.text == null) {
            throw new ApiException(400, "Property Text in WatermarkDataText is required.");
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

        WatermarkDataText watermarkDataText = (WatermarkDataText) o;
        return
            Objects.equals(this.color, watermarkDataText.color) &&
            Objects.equals(this.fontFamily, watermarkDataText.fontFamily) &&
            Objects.equals(this.fontSize, watermarkDataText.fontSize) &&
            Objects.equals(this.isSemitrasparent, watermarkDataText.isSemitrasparent) &&
            Objects.equals(this.layout, watermarkDataText.layout) &&
            Objects.equals(this.text, watermarkDataText.text) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, fontFamily, fontSize, isSemitrasparent, layout, text, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatermarkDataText {\n");
    sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(getFontFamily())).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(getFontSize())).append("\n");
    sb.append("    isSemitrasparent: ").append(toIndentedString(getIsSemitrasparent())).append("\n");
    sb.append("    layout: ").append(toIndentedString(getLayout())).append("\n");
    sb.append("    text: ").append(toIndentedString(getText())).append("\n");
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
