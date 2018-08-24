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

package com.aspose.words.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.words.model.DrawingObjectLink;
import com.aspose.words.model.WordsApiLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents Drawing Object DTO.
 */
@ApiModel(description = "Represents Drawing Object DTO.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-24T08:31:47.592+07:00")
public class DrawingObject {
  @JsonProperty("link")
  private WordsApiLink link = null;

  @JsonProperty("NodeId")
  private String nodeId = null;

  @JsonProperty("Height")
  private Double height = null;

  @JsonProperty("ImageDataLink")
  private WordsApiLink imageDataLink = null;

  @JsonProperty("Left")
  private Double left = null;

  @JsonProperty("OleDataLink")
  private WordsApiLink oleDataLink = null;

  /**
   * Specifies where the distance to the image is measured from.             
   */
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RelativeHorizontalPositionEnum fromValue(String text) {
      for (RelativeHorizontalPositionEnum b : RelativeHorizontalPositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("RelativeHorizontalPosition")
  private RelativeHorizontalPositionEnum relativeHorizontalPosition = null;

  /**
   * Specifies where the distance to the image measured from.
   */
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RelativeVerticalPositionEnum fromValue(String text) {
      for (RelativeVerticalPositionEnum b : RelativeVerticalPositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("RelativeVerticalPosition")
  private RelativeVerticalPositionEnum relativeVerticalPosition = null;

  @JsonProperty("RenderLinks")
  private List<WordsApiLink> renderLinks = null;

  @JsonProperty("Top")
  private Double top = null;

  @JsonProperty("Width")
  private Double width = null;

  /**
   * Specifies how to wrap text around the image.
   */
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WrapTypeEnum fromValue(String text) {
      for (WrapTypeEnum b : WrapTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("WrapType")
  private WrapTypeEnum wrapType = null;

  public DrawingObject link(WordsApiLink link) {
    this.link = link;
    return this;
  }

   /**
   * Link to the document.
   * @return link
  **/
  @ApiModelProperty(value = "Link to the document.")
  public WordsApiLink getLink() {
    return link;
  }

  public void setLink(WordsApiLink link) {
    this.link = link;
  }

  public DrawingObject nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Node id
   * @return nodeId
  **/
  @ApiModelProperty(value = "Node id")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

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
    return Objects.equals(this.link, drawingObject.link) &&
        Objects.equals(this.nodeId, drawingObject.nodeId) &&
        Objects.equals(this.height, drawingObject.height) &&
        Objects.equals(this.imageDataLink, drawingObject.imageDataLink) &&
        Objects.equals(this.left, drawingObject.left) &&
        Objects.equals(this.oleDataLink, drawingObject.oleDataLink) &&
        Objects.equals(this.relativeHorizontalPosition, drawingObject.relativeHorizontalPosition) &&
        Objects.equals(this.relativeVerticalPosition, drawingObject.relativeVerticalPosition) &&
        Objects.equals(this.renderLinks, drawingObject.renderLinks) &&
        Objects.equals(this.top, drawingObject.top) &&
        Objects.equals(this.width, drawingObject.width) &&
        Objects.equals(this.wrapType, drawingObject.wrapType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, nodeId, height, imageDataLink, left, oleDataLink, relativeHorizontalPosition, relativeVerticalPosition, renderLinks, top, width, wrapType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawingObject {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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

