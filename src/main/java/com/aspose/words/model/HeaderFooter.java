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
import com.aspose.words.model.HeaderFooterLink;
import com.aspose.words.model.LinkElement;
import com.aspose.words.model.WordsApiLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Section element
 */
@ApiModel(description = "Section element")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:39:50.697Z")
public class HeaderFooter {
  @JsonProperty("link")
  private WordsApiLink link = null;

  /**
   * Paragraph&#39;s text
   */
  public enum TypeEnum {
    HEADEREVEN("HeaderEven"),
    
    HEADERPRIMARY("HeaderPrimary"),
    
    FOOTEREVEN("FooterEven"),
    
    FOOTERPRIMARY("FooterPrimary"),
    
    HEADERFIRST("HeaderFirst"),
    
    FOOTERFIRST("FooterFirst");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

  @JsonProperty("DrawingObjects")
  private LinkElement drawingObjects = null;

  @JsonProperty("Paragraphs")
  private LinkElement paragraphs = null;

  public HeaderFooter link(WordsApiLink link) {
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

  public HeaderFooter type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Paragraph&#39;s text
   * @return type
  **/
  @ApiModelProperty(value = "Paragraph's text")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public HeaderFooter drawingObjects(LinkElement drawingObjects) {
    this.drawingObjects = drawingObjects;
    return this;
  }

   /**
   * Link to DrawingObjects resource
   * @return drawingObjects
  **/
  @ApiModelProperty(value = "Link to DrawingObjects resource")
  public LinkElement getDrawingObjects() {
    return drawingObjects;
  }

  public void setDrawingObjects(LinkElement drawingObjects) {
    this.drawingObjects = drawingObjects;
  }

  public HeaderFooter paragraphs(LinkElement paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

   /**
   * Link to Paragraphs resource
   * @return paragraphs
  **/
  @ApiModelProperty(value = "Link to Paragraphs resource")
  public LinkElement getParagraphs() {
    return paragraphs;
  }

  public void setParagraphs(LinkElement paragraphs) {
    this.paragraphs = paragraphs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderFooter headerFooter = (HeaderFooter) o;
    return Objects.equals(this.link, headerFooter.link) &&
        Objects.equals(this.type, headerFooter.type) &&
        Objects.equals(this.drawingObjects, headerFooter.drawingObjects) &&
        Objects.equals(this.paragraphs, headerFooter.paragraphs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, type, drawingObjects, paragraphs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderFooter {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    drawingObjects: ").append(toIndentedString(drawingObjects)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
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

