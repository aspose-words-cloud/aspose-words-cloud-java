/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DrawingObject.java">
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
 * DTO container with a DrawingObject.
 */
@ApiModel(description = "DTO container with a DrawingObject.")
public class DrawingObject extends DrawingObjectLink {
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
     * Gets or sets the option that controls how to wrap text around the image.
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

    @SerializedName("RenderLinks")
    protected List<WordsApiLink> renderLinks;

    @SerializedName("Width")
    protected Double width;

    @SerializedName("Height")
    protected Double height;

    @SerializedName("OleDataLink")
    protected WordsApiLink oleDataLink;

    @SerializedName("ImageDataLink")
    protected WordsApiLink imageDataLink;

    @SerializedName("RelativeHorizontalPosition")
    protected RelativeHorizontalPositionEnum relativeHorizontalPosition;

    @SerializedName("Left")
    protected Double left;

    @SerializedName("RelativeVerticalPosition")
    protected RelativeVerticalPositionEnum relativeVerticalPosition;

    @SerializedName("Top")
    protected Double top;

    @SerializedName("WrapType")
    protected WrapTypeEnum wrapType;
    /**
     * Gets or sets the list of links that originate from this DrawingObjectDto.
    * @return renderLinks
    **/
    @ApiModelProperty(value = "Gets or sets the list of links that originate from this DrawingObjectDto.")
    public List<WordsApiLink> getRenderLinks() {
        return renderLinks;
    }

    public DrawingObject renderLinks(List<WordsApiLink> renderLinks) {
        this.renderLinks = renderLinks;
        return this;
    }

    public DrawingObject addRenderLinksItem(WordsApiLink renderLinksItem) {
        if (this.renderLinks == null) {
            this.renderLinks = new ArrayList<WordsApiLink>();
        }
        this.renderLinks.add(renderLinksItem);
        return this;
    }


    public void setRenderLinks(List<WordsApiLink> renderLinks) {
        this.renderLinks = renderLinks;
    }


    /**
     * Gets or sets the width of the DrawingObjects in points.
    * @return width
    **/
    @ApiModelProperty(value = "Gets or sets the width of the DrawingObjects in points.")
    public Double getWidth() {
        return width;
    }

    public DrawingObject width(Double width) {
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

    public DrawingObject height(Double height) {
        this.height = height;
        return this;
    }

    public void setHeight(Double height) {
        this.height = height;
    }


    /**
     * Gets or sets the link to OLE object. Can be null if shape does not have OLE data.
    * @return oleDataLink
    **/
    @ApiModelProperty(value = "Gets or sets the link to OLE object. Can be null if shape does not have OLE data.")
    public WordsApiLink getOleDataLink() {
        return oleDataLink;
    }

    public DrawingObject oleDataLink(WordsApiLink oleDataLink) {
        this.oleDataLink = oleDataLink;
        return this;
    }

    public void setOleDataLink(WordsApiLink oleDataLink) {
        this.oleDataLink = oleDataLink;
    }


    /**
     * Gets or sets the link to image data. Can be null if shape does not have an image.
    * @return imageDataLink
    **/
    @ApiModelProperty(value = "Gets or sets the link to image data. Can be null if shape does not have an image.")
    public WordsApiLink getImageDataLink() {
        return imageDataLink;
    }

    public DrawingObject imageDataLink(WordsApiLink imageDataLink) {
        this.imageDataLink = imageDataLink;
        return this;
    }

    public void setImageDataLink(WordsApiLink imageDataLink) {
        this.imageDataLink = imageDataLink;
    }


    /**
     * Gets or sets the relative horizontal position, from which the distance to the image is measured.
    * @return relativeHorizontalPosition
    **/
    @ApiModelProperty(value = "Gets or sets the relative horizontal position, from which the distance to the image is measured.")
    public RelativeHorizontalPositionEnum getRelativeHorizontalPosition() {
        return relativeHorizontalPosition;
    }

    public DrawingObject relativeHorizontalPosition(RelativeHorizontalPositionEnum relativeHorizontalPosition) {
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

    public DrawingObject left(Double left) {
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

    public DrawingObject relativeVerticalPosition(RelativeVerticalPositionEnum relativeVerticalPosition) {
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

    public DrawingObject top(Double top) {
        this.top = top;
        return this;
    }

    public void setTop(Double top) {
        this.top = top;
    }


    /**
     * Gets or sets the option that controls how to wrap text around the image.
    * @return wrapType
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls how to wrap text around the image.")
    public WrapTypeEnum getWrapType() {
        return wrapType;
    }

    public DrawingObject wrapType(WrapTypeEnum wrapType) {
        this.wrapType = wrapType;
        return this;
    }

    public void setWrapType(WrapTypeEnum wrapType) {
        this.wrapType = wrapType;
    }


    public DrawingObject() {
        super();
        this.renderLinks = null;
        this.width = null;
        this.height = null;
        this.oleDataLink = null;
        this.imageDataLink = null;
        this.relativeHorizontalPosition = null;
        this.left = null;
        this.relativeVerticalPosition = null;
        this.top = null;
        this.wrapType = null;
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

        if (this.renderLinks != null) {
            for (ModelIfc elementRenderLinks : this.renderLinks) {
                if (elementRenderLinks != null) {
                    elementRenderLinks.validate();
                }
            }
        }





        if (this.oleDataLink != null) {
            this.oleDataLink.validate();
        }



        if (this.imageDataLink != null) {
            this.imageDataLink.validate();
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

        DrawingObject drawingObject = (DrawingObject) o;
        return
            Objects.equals(this.renderLinks, drawingObject.renderLinks) &&
            Objects.equals(this.width, drawingObject.width) &&
            Objects.equals(this.height, drawingObject.height) &&
            Objects.equals(this.oleDataLink, drawingObject.oleDataLink) &&
            Objects.equals(this.imageDataLink, drawingObject.imageDataLink) &&
            Objects.equals(this.relativeHorizontalPosition, drawingObject.relativeHorizontalPosition) &&
            Objects.equals(this.left, drawingObject.left) &&
            Objects.equals(this.relativeVerticalPosition, drawingObject.relativeVerticalPosition) &&
            Objects.equals(this.top, drawingObject.top) &&
            Objects.equals(this.wrapType, drawingObject.wrapType) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renderLinks, width, height, oleDataLink, imageDataLink, relativeHorizontalPosition, left, relativeVerticalPosition, top, wrapType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawingObject {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(getNodeId())).append("\n");
    sb.append("    renderLinks: ").append(toIndentedString(getRenderLinks())).append("\n");
    sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
    sb.append("    height: ").append(toIndentedString(getHeight())).append("\n");
    sb.append("    oleDataLink: ").append(toIndentedString(getOleDataLink())).append("\n");
    sb.append("    imageDataLink: ").append(toIndentedString(getImageDataLink())).append("\n");
    sb.append("    relativeHorizontalPosition: ").append(toIndentedString(getRelativeHorizontalPosition())).append("\n");
    sb.append("    left: ").append(toIndentedString(getLeft())).append("\n");
    sb.append("    relativeVerticalPosition: ").append(toIndentedString(getRelativeVerticalPosition())).append("\n");
    sb.append("    top: ").append(toIndentedString(getTop())).append("\n");
    sb.append("    wrapType: ").append(toIndentedString(getWrapType())).append("\n");
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
