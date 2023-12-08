/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Border.java">
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
 * Represents a border of an object.
 * Borders can be applied to various document elements including paragraph, run of text inside a paragraph or a table cell.
 */
@ApiModel(description = "Represents a border of an object. Borders can be applied to various document elements including paragraph, run of text inside a paragraph or a table cell.")
public class Border extends LinkElement {
    /**
     * Gets or sets the border type.
     */
    @JsonAdapter(BorderTypeEnum.Adapter.class)
    public enum BorderTypeEnum {
        BOTTOM("Bottom"),
        LEFT("Left"),
        RIGHT("Right"),
        TOP("Top"),
        HORIZONTAL("Horizontal"),
        VERTICAL("Vertical"),
        DIAGONALDOWN("DiagonalDown"),
        DIAGONALUP("DiagonalUp"),
        NONE("None");

        private String value;

        BorderTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static BorderTypeEnum fromValue(String text) {
            for (BorderTypeEnum b : BorderTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< BorderTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final BorderTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public BorderTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return BorderTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the border style.
     * If you set line style to none, then line width is automatically changed to zero.
     */
    @JsonAdapter(LineStyleEnum.Adapter.class)
    public enum LineStyleEnum {
        NONE("None"),
        SINGLE("Single"),
        THICK("Thick"),
        DOUBLE("Double"),
        HAIRLINE("Hairline"),
        DOT("Dot"),
        DASHLARGEGAP("DashLargeGap"),
        DOTDASH("DotDash"),
        DOTDOTDASH("DotDotDash"),
        TRIPLE("Triple"),
        THINTHICKSMALLGAP("ThinThickSmallGap"),
        THICKTHINSMALLGAP("ThickThinSmallGap"),
        THINTHICKTHINSMALLGAP("ThinThickThinSmallGap"),
        THINTHICKMEDIUMGAP("ThinThickMediumGap"),
        THICKTHINMEDIUMGAP("ThickThinMediumGap"),
        THINTHICKTHINMEDIUMGAP("ThinThickThinMediumGap"),
        THINTHICKLARGEGAP("ThinThickLargeGap"),
        THICKTHINLARGEGAP("ThickThinLargeGap"),
        THINTHICKTHINLARGEGAP("ThinThickThinLargeGap"),
        WAVE("Wave"),
        DOUBLEWAVE("DoubleWave"),
        DASHSMALLGAP("DashSmallGap"),
        DASHDOTSTROKER("DashDotStroker"),
        EMBOSS3D("Emboss3D"),
        ENGRAVE3D("Engrave3D"),
        OUTSET("Outset"),
        INSET("Inset");

        private String value;

        LineStyleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LineStyleEnum fromValue(String text) {
            for (LineStyleEnum b : LineStyleEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< LineStyleEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final LineStyleEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LineStyleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LineStyleEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("BorderType")
    protected BorderTypeEnum borderType;

    @SerializedName("Color")
    protected XmlColor color;

    @SerializedName("DistanceFromText")
    protected Double distanceFromText;

    @SerializedName("LineStyle")
    protected LineStyleEnum lineStyle;

    @SerializedName("LineWidth")
    protected Double lineWidth;

    @SerializedName("Shadow")
    protected Boolean shadow;
    /**
     * Gets or sets the border type.
    * @return borderType
    **/
    @ApiModelProperty(value = "Gets or sets the border type.")
    public BorderTypeEnum getBorderType() {
        return borderType;
    }

    public Border borderType(BorderTypeEnum borderType) {
        this.borderType = borderType;
        return this;
    }

    public void setBorderType(BorderTypeEnum borderType) {
        this.borderType = borderType;
    }


    /**
     * Gets or sets the border color.
    * @return color
    **/
    @ApiModelProperty(value = "Gets or sets the border color.")
    public XmlColor getColor() {
        return color;
    }

    public Border color(XmlColor color) {
        this.color = color;
        return this;
    }

    public void setColor(XmlColor color) {
        this.color = color;
    }


    /**
     * Gets or sets the distance of the border from text or from the page edge in points.
     * Has no effect and will be automatically reset to zero for borders of table cells.
    * @return distanceFromText
    **/
    @ApiModelProperty(value = "Gets or sets the distance of the border from text or from the page edge in points. Has no effect and will be automatically reset to zero for borders of table cells.")
    public Double getDistanceFromText() {
        return distanceFromText;
    }

    public Border distanceFromText(Double distanceFromText) {
        this.distanceFromText = distanceFromText;
        return this;
    }

    public void setDistanceFromText(Double distanceFromText) {
        this.distanceFromText = distanceFromText;
    }


    /**
     * Gets or sets the border style.
     * If you set line style to none, then line width is automatically changed to zero.
    * @return lineStyle
    **/
    @ApiModelProperty(value = "Gets or sets the border style. If you set line style to none, then line width is automatically changed to zero.")
    public LineStyleEnum getLineStyle() {
        return lineStyle;
    }

    public Border lineStyle(LineStyleEnum lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public void setLineStyle(LineStyleEnum lineStyle) {
        this.lineStyle = lineStyle;
    }


    /**
     * Gets or sets the border width in points.
     * If you set line width greater than zero when line style is none, the line style is automatically changed to single line.
    * @return lineWidth
    **/
    @ApiModelProperty(value = "Gets or sets the border width in points. If you set line width greater than zero when line style is none, the line style is automatically changed to single line.")
    public Double getLineWidth() {
        return lineWidth;
    }

    public Border lineWidth(Double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public void setLineWidth(Double lineWidth) {
        this.lineWidth = lineWidth;
    }


    /**
     * Gets or sets a value indicating whether the border has a shadow.
     * In Microsoft Word, for a border to have a shadow, the borders on all four sides (left, top, right and bottom) should be of the same type, width, color and all should have the Shadow property set to true.
    * @return shadow
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the border has a shadow. In Microsoft Word, for a border to have a shadow, the borders on all four sides (left, top, right and bottom) should be of the same type, width, color and all should have the Shadow property set to true.")
    public Boolean getShadow() {
        return shadow;
    }

    public Border shadow(Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }


    public Border() {
        super();
        this.borderType = null;
        this.color = null;
        this.distanceFromText = null;
        this.lineStyle = null;
        this.lineWidth = null;
        this.shadow = null;
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

        Border border = (Border) o;
        return
            Objects.equals(this.borderType, border.borderType) &&
            Objects.equals(this.color, border.color) &&
            Objects.equals(this.distanceFromText, border.distanceFromText) &&
            Objects.equals(this.lineStyle, border.lineStyle) &&
            Objects.equals(this.lineWidth, border.lineWidth) &&
            Objects.equals(this.shadow, border.shadow) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderType, color, distanceFromText, lineStyle, lineWidth, shadow, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Border {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    borderType: ").append(toIndentedString(getBorderType())).append("\n");
    sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
    sb.append("    distanceFromText: ").append(toIndentedString(getDistanceFromText())).append("\n");
    sb.append("    lineStyle: ").append(toIndentedString(getLineStyle())).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(getLineWidth())).append("\n");
    sb.append("    shadow: ").append(toIndentedString(getShadow())).append("\n");
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
