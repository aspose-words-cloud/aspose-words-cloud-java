/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DrawingObjectInsert.java">
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
 * Drawing object element for insert.
 */
@ApiModel(description = "Drawing object element for insert.")
public class DrawingObjectInsert {
    /**
     * Gets or sets the relative horizontal position, from which the distance to the image is measured.
     */
    @JsonAdapter(RelativeHorizontalPositionEnum.Adapter.class)
    public enum RelativeHorizontalPositionEnum {
        MARGIN("Margin"),
        PAGE("Page"),
        COLUMN("Column"),
        DEFAULT("Default"),
        CHARACTER("Character"),
        LEFTMARGIN("LeftMargin"),
        RIGHTMARGIN("RightMargin"),
        INSIDEMARGIN("InsideMargin"),
        OUTSIDEMARGIN("OutsideMargin");

        private String value;

        RelativeHorizontalPositionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RelativeHorizontalPositionEnum fromValue(String text) {
            for (RelativeHorizontalPositionEnum b : RelativeHorizontalPositionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< RelativeHorizontalPositionEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final RelativeHorizontalPositionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RelativeHorizontalPositionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RelativeHorizontalPositionEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the relative vertical position, from which the distance to the image is measured.
     */
    @JsonAdapter(RelativeVerticalPositionEnum.Adapter.class)
    public enum RelativeVerticalPositionEnum {
        MARGIN("Margin"),
        TABLEDEFAULT("TableDefault"),
        PAGE("Page"),
        PARAGRAPH("Paragraph"),
        TEXTFRAMEDEFAULT("TextFrameDefault"),
        LINE("Line"),
        TOPMARGIN("TopMargin"),
        BOTTOMMARGIN("BottomMargin"),
        INSIDEMARGIN("InsideMargin"),
        OUTSIDEMARGIN("OutsideMargin");

        private String value;

        RelativeVerticalPositionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RelativeVerticalPositionEnum fromValue(String text) {
            for (RelativeVerticalPositionEnum b : RelativeVerticalPositionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< RelativeVerticalPositionEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final RelativeVerticalPositionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RelativeVerticalPositionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RelativeVerticalPositionEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option indicating how to wrap text around the image.
     */
    @JsonAdapter(WrapTypeEnum.Adapter.class)
    public enum WrapTypeEnum {
        INLINE("Inline"),
        TOPBOTTOM("TopBottom"),
        SQUARE("Square"),
        NONE("None"),
        TIGHT("Tight"),
        THROUGH("Through");

        private String value;

        WrapTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static WrapTypeEnum fromValue(String text) {
            for (WrapTypeEnum b : WrapTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< WrapTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final WrapTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public WrapTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return WrapTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Height")
    private Double height = null;

    @SerializedName("Left")
    private Double left = null;

    @SerializedName("Position")
    private DocumentPosition position = null;

    @SerializedName("RelativeHorizontalPosition")
    private RelativeHorizontalPositionEnum relativeHorizontalPosition = null;

    @SerializedName("RelativeVerticalPosition")
    private RelativeVerticalPositionEnum relativeVerticalPosition = null;

    @SerializedName("Top")
    private Double top = null;

    @SerializedName("Width")
    private Double width = null;

    @SerializedName("WrapType")
    private WrapTypeEnum wrapType = null;
    public DrawingObjectInsert height(Double height) {
        this.height = height;
        return this;
    }

    /**
     * Gets or sets the height of the DrawingObject in points.
    * @return height
    **/
    @ApiModelProperty(value = "Gets or sets the height of the DrawingObject in points.")
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public DrawingObjectInsert left(Double left) {
        this.left = left;
        return this;
    }

    /**
     * Gets or sets the distance in points from the origin to the left side of the image.
    * @return left
    **/
    @ApiModelProperty(value = "Gets or sets the distance in points from the origin to the left side of the image.")
    public Double getLeft() {
        return left;
    }

    public void setLeft(Double left) {
        this.left = left;
    }

    public DrawingObjectInsert position(DocumentPosition position) {
        this.position = position;
        return this;
    }

    /**
     * Gets or sets the position, before which the DrawingObject will be inserted.
    * @return position
    **/
    @ApiModelProperty(value = "Gets or sets the position, before which the DrawingObject will be inserted.")
    public DocumentPosition getPosition() {
        return position;
    }

    public void setPosition(DocumentPosition position) {
        this.position = position;
    }

    public DrawingObjectInsert relativeHorizontalPosition(RelativeHorizontalPositionEnum relativeHorizontalPosition) {
        this.relativeHorizontalPosition = relativeHorizontalPosition;
        return this;
    }

    /**
     * Gets or sets the relative horizontal position, from which the distance to the image is measured.
    * @return relativeHorizontalPosition
    **/
    @ApiModelProperty(value = "Gets or sets the relative horizontal position, from which the distance to the image is measured.")
    public RelativeHorizontalPositionEnum getRelativeHorizontalPosition() {
        return relativeHorizontalPosition;
    }

    public void setRelativeHorizontalPosition(RelativeHorizontalPositionEnum relativeHorizontalPosition) {
        this.relativeHorizontalPosition = relativeHorizontalPosition;
    }

    public DrawingObjectInsert relativeVerticalPosition(RelativeVerticalPositionEnum relativeVerticalPosition) {
        this.relativeVerticalPosition = relativeVerticalPosition;
        return this;
    }

    /**
     * Gets or sets the relative vertical position, from which the distance to the image is measured.
    * @return relativeVerticalPosition
    **/
    @ApiModelProperty(value = "Gets or sets the relative vertical position, from which the distance to the image is measured.")
    public RelativeVerticalPositionEnum getRelativeVerticalPosition() {
        return relativeVerticalPosition;
    }

    public void setRelativeVerticalPosition(RelativeVerticalPositionEnum relativeVerticalPosition) {
        this.relativeVerticalPosition = relativeVerticalPosition;
    }

    public DrawingObjectInsert top(Double top) {
        this.top = top;
        return this;
    }

    /**
     * Gets or sets the distance in points from the origin to the top side of the image.
    * @return top
    **/
    @ApiModelProperty(value = "Gets or sets the distance in points from the origin to the top side of the image.")
    public Double getTop() {
        return top;
    }

    public void setTop(Double top) {
        this.top = top;
    }

    public DrawingObjectInsert width(Double width) {
        this.width = width;
        return this;
    }

    /**
     * Gets or sets the width of the DrawingObjects in points.
    * @return width
    **/
    @ApiModelProperty(value = "Gets or sets the width of the DrawingObjects in points.")
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public DrawingObjectInsert wrapType(WrapTypeEnum wrapType) {
        this.wrapType = wrapType;
        return this;
    }

    /**
     * Gets or sets the option indicating how to wrap text around the image.
    * @return wrapType
    **/
    @ApiModelProperty(value = "Gets or sets the option indicating how to wrap text around the image.")
    public WrapTypeEnum getWrapType() {
        return wrapType;
    }

    public void setWrapType(WrapTypeEnum wrapType) {
        this.wrapType = wrapType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DrawingObjectInsert drawingObjectInsert = (DrawingObjectInsert) o;
        return
            Objects.equals(this.height, drawingObjectInsert.height) &&
            Objects.equals(this.left, drawingObjectInsert.left) &&
            Objects.equals(this.position, drawingObjectInsert.position) &&
            Objects.equals(this.relativeHorizontalPosition, drawingObjectInsert.relativeHorizontalPosition) &&
            Objects.equals(this.relativeVerticalPosition, drawingObjectInsert.relativeVerticalPosition) &&
            Objects.equals(this.top, drawingObjectInsert.top) &&
            Objects.equals(this.width, drawingObjectInsert.width) &&
            Objects.equals(this.wrapType, drawingObjectInsert.wrapType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, left, position, relativeHorizontalPosition, relativeVerticalPosition, top, width, wrapType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawingObjectInsert {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    relativeHorizontalPosition: ").append(toIndentedString(relativeHorizontalPosition)).append("\n");
    sb.append("    relativeVerticalPosition: ").append(toIndentedString(relativeVerticalPosition)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    wrapType: ").append(toIndentedString(wrapType)).append("\n");
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
