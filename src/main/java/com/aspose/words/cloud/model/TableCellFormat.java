/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TableCellFormat.java">
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
 * DTO container with all formatting for a table row.
 */
@ApiModel(description = "DTO container with all formatting for a table row.")
public class TableCellFormat extends LinkElement {
    /**
     * Gets or sets the option that controls how the cell is merged horizontally with other cells in the row.
     */
    @JsonAdapter(HorizontalMergeEnum.Adapter.class)
    public enum HorizontalMergeEnum {
        NONE("None"),
        FIRST("First"),
        PREVIOUS("Previous");

        private String value;

        HorizontalMergeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static HorizontalMergeEnum fromValue(String text) {
            for (HorizontalMergeEnum b : HorizontalMergeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< HorizontalMergeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final HorizontalMergeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public HorizontalMergeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return HorizontalMergeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the orientation of text in a table cell.
     */
    @JsonAdapter(OrientationEnum.Adapter.class)
    public enum OrientationEnum {
        HORIZONTAL("Horizontal"),
        DOWNWARD("Downward"),
        UPWARD("Upward"),
        HORIZONTALROTATEDFAREAST("HorizontalRotatedFarEast"),
        VERTICALFAREAST("VerticalFarEast"),
        VERTICALROTATEDFAREAST("VerticalRotatedFarEast");

        private String value;

        OrientationEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrientationEnum fromValue(String text) {
            for (OrientationEnum b : OrientationEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< OrientationEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final OrientationEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OrientationEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OrientationEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the vertical alignment of text in the cell.
     */
    @JsonAdapter(VerticalAlignmentEnum.Adapter.class)
    public enum VerticalAlignmentEnum {
        TOP("Top"),
        CENTER("Center"),
        BOTTOM("Bottom");

        private String value;

        VerticalAlignmentEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static VerticalAlignmentEnum fromValue(String text) {
            for (VerticalAlignmentEnum b : VerticalAlignmentEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< VerticalAlignmentEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final VerticalAlignmentEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VerticalAlignmentEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return VerticalAlignmentEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the option that controls how the cell is merged with other cells vertically.
     */
    @JsonAdapter(VerticalMergeEnum.Adapter.class)
    public enum VerticalMergeEnum {
        NONE("None"),
        FIRST("First"),
        PREVIOUS("Previous");

        private String value;

        VerticalMergeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static VerticalMergeEnum fromValue(String text) {
            for (VerticalMergeEnum b : VerticalMergeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< VerticalMergeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final VerticalMergeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VerticalMergeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return VerticalMergeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("BottomPadding")
    private Double bottomPadding = null;

    @SerializedName("FitText")
    private Boolean fitText = null;

    @SerializedName("HorizontalMerge")
    private HorizontalMergeEnum horizontalMerge = null;

    @SerializedName("LeftPadding")
    private Double leftPadding = null;

    @SerializedName("Orientation")
    private OrientationEnum orientation = null;

    @SerializedName("PreferredWidth")
    private PreferredWidth preferredWidth = null;

    @SerializedName("RightPadding")
    private Double rightPadding = null;

    @SerializedName("TopPadding")
    private Double topPadding = null;

    @SerializedName("VerticalAlignment")
    private VerticalAlignmentEnum verticalAlignment = null;

    @SerializedName("VerticalMerge")
    private VerticalMergeEnum verticalMerge = null;

    @SerializedName("Width")
    private Double width = null;

    @SerializedName("WrapText")
    private Boolean wrapText = null;
    public TableCellFormat bottomPadding(Double bottomPadding) {
        this.bottomPadding = bottomPadding;
        return this;
    }

    /**
     * Gets or sets the amount of space (in points) to add below the contents of the cell.
    * @return bottomPadding
    **/
    @ApiModelProperty(value = "Gets or sets the amount of space (in points) to add below the contents of the cell.")
    public Double getBottomPadding() {
        return bottomPadding;
    }

    public void setBottomPadding(Double bottomPadding) {
        this.bottomPadding = bottomPadding;
    }

    public TableCellFormat fitText(Boolean fitText) {
        this.fitText = fitText;
        return this;
    }

    /**
     * Gets or sets a value indicating whether to fit text in the cell, compress each paragraph to the width of the cell.
    * @return fitText
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to fit text in the cell, compress each paragraph to the width of the cell.")
    public Boolean getFitText() {
        return fitText;
    }

    public void setFitText(Boolean fitText) {
        this.fitText = fitText;
    }

    public TableCellFormat horizontalMerge(HorizontalMergeEnum horizontalMerge) {
        this.horizontalMerge = horizontalMerge;
        return this;
    }

    /**
     * Gets or sets the option that controls how the cell is merged horizontally with other cells in the row.
    * @return horizontalMerge
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how the cell is merged horizontally with other cells in the row.")
    public HorizontalMergeEnum getHorizontalMerge() {
        return horizontalMerge;
    }

    public void setHorizontalMerge(HorizontalMergeEnum horizontalMerge) {
        this.horizontalMerge = horizontalMerge;
    }

    public TableCellFormat leftPadding(Double leftPadding) {
        this.leftPadding = leftPadding;
        return this;
    }

    /**
     * Gets or sets the amount of space (in points) to add to the left of the contents of the cell.
    * @return leftPadding
    **/
    @ApiModelProperty(value = "Gets or sets the amount of space (in points) to add to the left of the contents of the cell.")
    public Double getLeftPadding() {
        return leftPadding;
    }

    public void setLeftPadding(Double leftPadding) {
        this.leftPadding = leftPadding;
    }

    public TableCellFormat orientation(OrientationEnum orientation) {
        this.orientation = orientation;
        return this;
    }

    /**
     * Gets or sets the orientation of text in a table cell.
    * @return orientation
    **/
    @ApiModelProperty(value = "Gets or sets the orientation of text in a table cell.")
    public OrientationEnum getOrientation() {
        return orientation;
    }

    public void setOrientation(OrientationEnum orientation) {
        this.orientation = orientation;
    }

    public TableCellFormat preferredWidth(PreferredWidth preferredWidth) {
        this.preferredWidth = preferredWidth;
        return this;
    }

    /**
     * Gets or sets the preferred width of the cell.
    * @return preferredWidth
    **/
    @ApiModelProperty(value = "Gets or sets the preferred width of the cell.")
    public PreferredWidth getPreferredWidth() {
        return preferredWidth;
    }

    public void setPreferredWidth(PreferredWidth preferredWidth) {
        this.preferredWidth = preferredWidth;
    }

    public TableCellFormat rightPadding(Double rightPadding) {
        this.rightPadding = rightPadding;
        return this;
    }

    /**
     * Gets or sets the amount of space (in points) to add to the right of the contents of the cell.
    * @return rightPadding
    **/
    @ApiModelProperty(value = "Gets or sets the amount of space (in points) to add to the right of the contents of the cell.")
    public Double getRightPadding() {
        return rightPadding;
    }

    public void setRightPadding(Double rightPadding) {
        this.rightPadding = rightPadding;
    }

    public TableCellFormat topPadding(Double topPadding) {
        this.topPadding = topPadding;
        return this;
    }

    /**
     * Gets or sets the amount of space (in points) to add above the contents of the cell.
    * @return topPadding
    **/
    @ApiModelProperty(value = "Gets or sets the amount of space (in points) to add above the contents of the cell.")
    public Double getTopPadding() {
        return topPadding;
    }

    public void setTopPadding(Double topPadding) {
        this.topPadding = topPadding;
    }

    public TableCellFormat verticalAlignment(VerticalAlignmentEnum verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
        return this;
    }

    /**
     * Gets or sets the vertical alignment of text in the cell.
    * @return verticalAlignment
    **/
    @ApiModelProperty(value = "Gets or sets the vertical alignment of text in the cell.")
    public VerticalAlignmentEnum getVerticalAlignment() {
        return verticalAlignment;
    }

    public void setVerticalAlignment(VerticalAlignmentEnum verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
    }

    public TableCellFormat verticalMerge(VerticalMergeEnum verticalMerge) {
        this.verticalMerge = verticalMerge;
        return this;
    }

    /**
     * Gets or sets the option that controls how the cell is merged with other cells vertically.
    * @return verticalMerge
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how the cell is merged with other cells vertically.")
    public VerticalMergeEnum getVerticalMerge() {
        return verticalMerge;
    }

    public void setVerticalMerge(VerticalMergeEnum verticalMerge) {
        this.verticalMerge = verticalMerge;
    }

    public TableCellFormat width(Double width) {
        this.width = width;
        return this;
    }

    /**
     * Gets or sets the width of the cell in points.
    * @return width
    **/
    @ApiModelProperty(value = "Gets or sets the width of the cell in points.")
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public TableCellFormat wrapText(Boolean wrapText) {
        this.wrapText = wrapText;
        return this;
    }

    /**
     * Gets or sets a value indicating whether to wrap text in the cell.
    * @return wrapText
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to wrap text in the cell.")
    public Boolean getWrapText() {
        return wrapText;
    }

    public void setWrapText(Boolean wrapText) {
        this.wrapText = wrapText;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TableCellFormat tableCellFormat = (TableCellFormat) o;
        return
            Objects.equals(this.bottomPadding, tableCellFormat.bottomPadding) &&
            Objects.equals(this.fitText, tableCellFormat.fitText) &&
            Objects.equals(this.horizontalMerge, tableCellFormat.horizontalMerge) &&
            Objects.equals(this.leftPadding, tableCellFormat.leftPadding) &&
            Objects.equals(this.orientation, tableCellFormat.orientation) &&
            Objects.equals(this.preferredWidth, tableCellFormat.preferredWidth) &&
            Objects.equals(this.rightPadding, tableCellFormat.rightPadding) &&
            Objects.equals(this.topPadding, tableCellFormat.topPadding) &&
            Objects.equals(this.verticalAlignment, tableCellFormat.verticalAlignment) &&
            Objects.equals(this.verticalMerge, tableCellFormat.verticalMerge) &&
            Objects.equals(this.width, tableCellFormat.width) &&
            Objects.equals(this.wrapText, tableCellFormat.wrapText) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bottomPadding, fitText, horizontalMerge, leftPadding, orientation, preferredWidth, rightPadding, topPadding, verticalAlignment, verticalMerge, width, wrapText, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableCellFormat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bottomPadding: ").append(toIndentedString(bottomPadding)).append("\n");
    sb.append("    fitText: ").append(toIndentedString(fitText)).append("\n");
    sb.append("    horizontalMerge: ").append(toIndentedString(horizontalMerge)).append("\n");
    sb.append("    leftPadding: ").append(toIndentedString(leftPadding)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    preferredWidth: ").append(toIndentedString(preferredWidth)).append("\n");
    sb.append("    rightPadding: ").append(toIndentedString(rightPadding)).append("\n");
    sb.append("    topPadding: ").append(toIndentedString(topPadding)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    verticalMerge: ").append(toIndentedString(verticalMerge)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    wrapText: ").append(toIndentedString(wrapText)).append("\n");
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
