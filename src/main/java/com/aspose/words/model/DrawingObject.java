/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Words for Cloud
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
import com.aspose.words.cloud.model.DrawingObjectLink;
import com.aspose.words.cloud.model.WordsApiLink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents Drawing Object DTO.
 */
@ApiModel(description = "Represents Drawing Object DTO.")

public class DrawingObject extends DrawingObjectLink {
  @SerializedName("Height")
  private Double height = null;

  @SerializedName("ImageDataLink")
  private WordsApiLink imageDataLink = null;

  @SerializedName("Left")
  private Double left = null;

  @SerializedName("OleDataLink")
  private WordsApiLink oleDataLink = null;

  /**
   * Specifies where the distance to the image is measured from.             
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

    public static class Adapter extends TypeAdapter<RelativeHorizontalPositionEnum> {
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

  @SerializedName("RelativeHorizontalPosition")
  private RelativeHorizontalPositionEnum relativeHorizontalPosition = null;

  /**
   * Specifies where the distance to the image measured from.
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

    public static class Adapter extends TypeAdapter<RelativeVerticalPositionEnum> {
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

  @SerializedName("RelativeVerticalPosition")
  private RelativeVerticalPositionEnum relativeVerticalPosition = null;

  @SerializedName("RenderLinks")
  private List<WordsApiLink> renderLinks = null;

  @SerializedName("Top")
  private Double top = null;

  @SerializedName("Width")
  private Double width = null;

  /**
   * Specifies how to wrap text around the image.
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

    public static class Adapter extends TypeAdapter<WrapTypeEnum> {
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

  @SerializedName("WrapType")
  private WrapTypeEnum wrapType = null;

  public DrawingObject height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the drawing object in points.
   * @return height
  **/
  @ApiModelProperty(value = "Height of the drawing object in points.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public DrawingObject imageDataLink(WordsApiLink imageDataLink) {
    this.imageDataLink = imageDataLink;
    return this;
  }

   /**
   * Link to image data. Can be null if shape does not have an image.
   * @return imageDataLink
  **/
  @ApiModelProperty(value = "Link to image data. Can be null if shape does not have an image.")
  public WordsApiLink getImageDataLink() {
    return imageDataLink;
  }

  public void setImageDataLink(WordsApiLink imageDataLink) {
    this.imageDataLink = imageDataLink;
  }

  public DrawingObject left(Double left) {
    this.left = left;
    return this;
  }

   /**
   * Distance in points from the origin to the left side of the image.             
   * @return left
  **/
  @ApiModelProperty(value = "Distance in points from the origin to the left side of the image.             ")
  public Double getLeft() {
    return left;
  }

  public void setLeft(Double left) {
    this.left = left;
  }

  public DrawingObject oleDataLink(WordsApiLink oleDataLink) {
    this.oleDataLink = oleDataLink;
    return this;
  }

   /**
   * Link to ole object. Can be null if shape does not have ole data.
   * @return oleDataLink
  **/
  @ApiModelProperty(value = "Link to ole object. Can be null if shape does not have ole data.")
  public WordsApiLink getOleDataLink() {
    return oleDataLink;
  }

  public void setOleDataLink(WordsApiLink oleDataLink) {
    this.oleDataLink = oleDataLink;
  }

  public DrawingObject relativeHorizontalPosition(RelativeHorizontalPositionEnum relativeHorizontalPosition) {
    this.relativeHorizontalPosition = relativeHorizontalPosition;
    return this;
  }

   /**
   * Specifies where the distance to the image is measured from.             
   * @return relativeHorizontalPosition
  **/
  @ApiModelProperty(value = "Specifies where the distance to the image is measured from.             ")
  public RelativeHorizontalPositionEnum getRelativeHorizontalPosition() {
    return relativeHorizontalPosition;
  }

  public void setRelativeHorizontalPosition(RelativeHorizontalPositionEnum relativeHorizontalPosition) {
    this.relativeHorizontalPosition = relativeHorizontalPosition;
  }

  public DrawingObject relativeVerticalPosition(RelativeVerticalPositionEnum relativeVerticalPosition) {
    this.relativeVerticalPosition = relativeVerticalPosition;
    return this;
  }

   /**
   * Specifies where the distance to the image measured from.
   * @return relativeVerticalPosition
  **/
  @ApiModelProperty(value = "Specifies where the distance to the image measured from.")
  public RelativeVerticalPositionEnum getRelativeVerticalPosition() {
    return relativeVerticalPosition;
  }

  public void setRelativeVerticalPosition(RelativeVerticalPositionEnum relativeVerticalPosition) {
    this.relativeVerticalPosition = relativeVerticalPosition;
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

   /**
   * A list of links that originate from this .
   * @return renderLinks
  **/
  @ApiModelProperty(value = "A list of links that originate from this .")
  public List<WordsApiLink> getRenderLinks() {
    return renderLinks;
  }

  public void setRenderLinks(List<WordsApiLink> renderLinks) {
    this.renderLinks = renderLinks;
  }

  public DrawingObject top(Double top) {
    this.top = top;
    return this;
  }

   /**
   * Distance in points from the origin to the top side of the image.
   * @return top
  **/
  @ApiModelProperty(value = "Distance in points from the origin to the top side of the image.")
  public Double getTop() {
    return top;
  }

  public void setTop(Double top) {
    this.top = top;
  }

  public DrawingObject width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the drawing objects in points.
   * @return width
  **/
  @ApiModelProperty(value = "Width of the drawing objects in points.")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public DrawingObject wrapType(WrapTypeEnum wrapType) {
    this.wrapType = wrapType;
    return this;
  }

   /**
   * Specifies how to wrap text around the image.
   * @return wrapType
  **/
  @ApiModelProperty(value = "Specifies how to wrap text around the image.")
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
    DrawingObject drawingObject = (DrawingObject) o;
    return Objects.equals(this.height, drawingObject.height) &&
        Objects.equals(this.imageDataLink, drawingObject.imageDataLink) &&
        Objects.equals(this.left, drawingObject.left) &&
        Objects.equals(this.oleDataLink, drawingObject.oleDataLink) &&
        Objects.equals(this.relativeHorizontalPosition, drawingObject.relativeHorizontalPosition) &&
        Objects.equals(this.relativeVerticalPosition, drawingObject.relativeVerticalPosition) &&
        Objects.equals(this.renderLinks, drawingObject.renderLinks) &&
        Objects.equals(this.top, drawingObject.top) &&
        Objects.equals(this.width, drawingObject.width) &&
        Objects.equals(this.wrapType, drawingObject.wrapType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, imageDataLink, left, oleDataLink, relativeHorizontalPosition, relativeVerticalPosition, renderLinks, top, width, wrapType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawingObject {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageDataLink: ").append(toIndentedString(imageDataLink)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    oleDataLink: ").append(toIndentedString(oleDataLink)).append("\n");
    sb.append("    relativeHorizontalPosition: ").append(toIndentedString(relativeHorizontalPosition)).append("\n");
    sb.append("    relativeVerticalPosition: ").append(toIndentedString(relativeVerticalPosition)).append("\n");
    sb.append("    renderLinks: ").append(toIndentedString(renderLinks)).append("\n");
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

