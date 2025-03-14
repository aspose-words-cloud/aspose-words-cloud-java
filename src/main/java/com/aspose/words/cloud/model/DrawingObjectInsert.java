/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DrawingObjectInsert.java">
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
 * Drawing object element for insert.
 */
@ApiModel(description = "Drawing object element for insert.")
public class DrawingObjectInsert implements ModelIfc {
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

    @SerializedName("Position")
    protected Position position;

    @SerializedName("RelativeHorizontalPosition")
    protected RelativeHorizontalPositionEnum relativeHorizontalPosition;

    @SerializedName("Left")
    protected Double left;

    @SerializedName("RelativeVerticalPosition")
    protected RelativeVerticalPositionEnum relativeVerticalPosition;

    @SerializedName("Top")
    protected Double top;

    @SerializedName("Width")
    protected Double width;

    @SerializedName("Height")
    protected Double height;

    @SerializedName("WrapType")
    protected WrapTypeEnum wrapType;

    @SerializedName("AspectRatioLocked")
    protected Boolean aspectRatioLocked;
    /**
     * Gets or sets the position, where the DrawingObject will be inserted.
    * @return position
    **/
    @ApiModelProperty(value = "Gets or sets the position, where the DrawingObject will be inserted.")
    public Position getPosition() {
        return position;
    }

    public DrawingObjectInsert position(Position position) {
        this.position = position;
        return this;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    /**
     * Gets or sets the relative horizontal position, from which the distance to the image is measured.
    * @return relativeHorizontalPosition
    **/
    @ApiModelProperty(value = "Gets or sets the relative horizontal position, from which the distance to the image is measured.")
    public RelativeHorizontalPositionEnum getRelativeHorizontalPosition() {
        return relativeHorizontalPosition;
    }

    public DrawingObjectInsert relativeHorizontalPosition(RelativeHorizontalPositionEnum relativeHorizontalPosition) {
        this.relativeHorizontalPosition = relativeHorizontalPosition;
        return this;
    }

    public void setRelativeHorizontalPosition(RelativeHorizontalPositionEnum relativeHorizontalPosition) {
        this.relativeHorizontalPosition = relativeHorizontalPosition;
    }


    /**
     * Gets or sets the distance in points from the origin to the left side of the image.
    * @return left
    **/
    @ApiModelProperty(value = "Gets or sets the distance in points from the origin to the left side of the image.")
    public Double getLeft() {
        return left;
    }

    public DrawingObjectInsert left(Double left) {
        this.left = left;
        return this;
    }

    public void setLeft(Double left) {
        this.left = left;
    }


    /**
     * Gets or sets the relative vertical position, from which the distance to the image is measured.
    * @return relativeVerticalPosition
    **/
    @ApiModelProperty(value = "Gets or sets the relative vertical position, from which the distance to the image is measured.")
    public RelativeVerticalPositionEnum getRelativeVerticalPosition() {
        return relativeVerticalPosition;
    }

    public DrawingObjectInsert relativeVerticalPosition(RelativeVerticalPositionEnum relativeVerticalPosition) {
        this.relativeVerticalPosition = relativeVerticalPosition;
        return this;
    }

    public void setRelativeVerticalPosition(RelativeVerticalPositionEnum relativeVerticalPosition) {
        this.relativeVerticalPosition = relativeVerticalPosition;
    }


    /**
     * Gets or sets the distance in points from the origin to the top side of the image.
    * @return top
    **/
    @ApiModelProperty(value = "Gets or sets the distance in points from the origin to the top side of the image.")
    public Double getTop() {
        return top;
    }

    public DrawingObjectInsert top(Double top) {
        this.top = top;
        return this;
    }

    public void setTop(Double top) {
        this.top = top;
    }


    /**
     * Gets or sets the width of the DrawingObjects in points.
    * @return width
    **/
    @ApiModelProperty(value = "Gets or sets the width of the DrawingObjects in points.")
    public Double getWidth() {
        return width;
    }

    public DrawingObjectInsert width(Double width) {
        this.width = width;
        return this;
    }

    public void setWidth(Double width) {
        this.width = width;
    }


    /**
     * Gets or sets the height of the DrawingObject in points.
    * @return height
    **/
    @ApiModelProperty(value = "Gets or sets the height of the DrawingObject in points.")
    public Double getHeight() {
        return height;
    }

    public DrawingObjectInsert height(Double height) {
        this.height = height;
        return this;
    }

    public void setHeight(Double height) {
        this.height = height;
    }


    /**
     * Gets or sets the option indicating how to wrap text around the image.
    * @return wrapType
    **/
    @ApiModelProperty(value = "Gets or sets the option indicating how to wrap text around the image.")
    public WrapTypeEnum getWrapType() {
        return wrapType;
    }

    public DrawingObjectInsert wrapType(WrapTypeEnum wrapType) {
        this.wrapType = wrapType;
        return this;
    }

    public void setWrapType(WrapTypeEnum wrapType) {
        this.wrapType = wrapType;
    }


    /**
     * Gets or sets a value indicating whether AspectRatioLocked option on or off.
    * @return aspectRatioLocked
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether AspectRatioLocked option on or off.")
    public Boolean getAspectRatioLocked() {
        return aspectRatioLocked;
    }

    public DrawingObjectInsert aspectRatioLocked(Boolean aspectRatioLocked) {
        this.aspectRatioLocked = aspectRatioLocked;
        return this;
    }

    public void setAspectRatioLocked(Boolean aspectRatioLocked) {
        this.aspectRatioLocked = aspectRatioLocked;
    }


    public DrawingObjectInsert() {
        this.position = null;
        this.relativeHorizontalPosition = null;
        this.left = null;
        this.relativeVerticalPosition = null;
        this.top = null;
        this.width = null;
        this.height = null;
        this.wrapType = null;
        this.aspectRatioLocked = null;
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
        if (this.relativeHorizontalPosition == null) {
            throw new ApiException(400, "Property RelativeHorizontalPosition in DrawingObjectInsert is required.");
        }
        if (this.left == null) {
            throw new ApiException(400, "Property Left in DrawingObjectInsert is required.");
        }
        if (this.relativeVerticalPosition == null) {
            throw new ApiException(400, "Property RelativeVerticalPosition in DrawingObjectInsert is required.");
        }
        if (this.top == null) {
            throw new ApiException(400, "Property Top in DrawingObjectInsert is required.");
        }
        if (this.width == null) {
            throw new ApiException(400, "Property Width in DrawingObjectInsert is required.");
        }
        if (this.height == null) {
            throw new ApiException(400, "Property Height in DrawingObjectInsert is required.");
        }
        if (this.wrapType == null) {
            throw new ApiException(400, "Property WrapType in DrawingObjectInsert is required.");
        }

        if (this.position != null) {
            this.position.validate();
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

        DrawingObjectInsert drawingObjectInsert = (DrawingObjectInsert) o;
        return
            Objects.equals(this.position, drawingObjectInsert.position) &&
            Objects.equals(this.relativeHorizontalPosition, drawingObjectInsert.relativeHorizontalPosition) &&
            Objects.equals(this.left, drawingObjectInsert.left) &&
            Objects.equals(this.relativeVerticalPosition, drawingObjectInsert.relativeVerticalPosition) &&
            Objects.equals(this.top, drawingObjectInsert.top) &&
            Objects.equals(this.width, drawingObjectInsert.width) &&
            Objects.equals(this.height, drawingObjectInsert.height) &&
            Objects.equals(this.wrapType, drawingObjectInsert.wrapType) &&
            Objects.equals(this.aspectRatioLocked, drawingObjectInsert.aspectRatioLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, relativeHorizontalPosition, left, relativeVerticalPosition, top, width, height, wrapType, aspectRatioLocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawingObjectInsert {\n");
    sb.append("    position: ").append(toIndentedString(getPosition())).append("\n");
    sb.append("    relativeHorizontalPosition: ").append(toIndentedString(getRelativeHorizontalPosition())).append("\n");
    sb.append("    left: ").append(toIndentedString(getLeft())).append("\n");
    sb.append("    relativeVerticalPosition: ").append(toIndentedString(getRelativeVerticalPosition())).append("\n");
    sb.append("    top: ").append(toIndentedString(getTop())).append("\n");
    sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
    sb.append("    height: ").append(toIndentedString(getHeight())).append("\n");
    sb.append("    wrapType: ").append(toIndentedString(getWrapType())).append("\n");
    sb.append("    aspectRatioLocked: ").append(toIndentedString(getAspectRatioLocked())).append("\n");
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
