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
import com.aspose.words.model.DocumentPosition;
import com.aspose.words.model.FootnoteLink;
import com.aspose.words.model.StoryChildNodes;
import com.aspose.words.model.WordsApiLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Footnote.
 */
@ApiModel(description = "Footnote.")

public class Footnote {
  @JsonProperty("link")
  private WordsApiLink link = null;

  @JsonProperty("NodeId")
  private String nodeId = null;

  @JsonProperty("Content")
  private StoryChildNodes content = null;

  /**
   * Returns a value that specifies whether this is a footnote or endnote.
   */
  public enum FootnoteTypeEnum {
    FOOTNOTE("Footnote"),
    
    ENDNOTE("Endnote");

    private String value;

    FootnoteTypeEnum(String value) {
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
    public static FootnoteTypeEnum fromValue(String text) {
      for (FootnoteTypeEnum b : FootnoteTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("FootnoteType")
  private FootnoteTypeEnum footnoteType = null;

  @JsonProperty("Position")
  private DocumentPosition position = null;

  @JsonProperty("ReferenceMark")
  private String referenceMark = null;

  @JsonProperty("Text")
  private String text = null;

  public Footnote link(WordsApiLink link) {
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

  public Footnote nodeId(String nodeId) {
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

  public Footnote content(StoryChildNodes content) {
    this.content = content;
    return this;
  }

   /**
   * Content of footnote.
   * @return content
  **/
  @ApiModelProperty(value = "Content of footnote.")
  public StoryChildNodes getContent() {
    return content;
  }

  public void setContent(StoryChildNodes content) {
    this.content = content;
  }

  public Footnote footnoteType(FootnoteTypeEnum footnoteType) {
    this.footnoteType = footnoteType;
    return this;
  }

   /**
   * Returns a value that specifies whether this is a footnote or endnote.
   * @return footnoteType
  **/
  @ApiModelProperty(value = "Returns a value that specifies whether this is a footnote or endnote.")
  public FootnoteTypeEnum getFootnoteType() {
    return footnoteType;
  }

  public void setFootnoteType(FootnoteTypeEnum footnoteType) {
    this.footnoteType = footnoteType;
  }

  public Footnote position(DocumentPosition position) {
    this.position = position;
    return this;
  }

   /**
   * Link to comment range start node.
   * @return position
  **/
  @ApiModelProperty(value = "Link to comment range start node.")
  public DocumentPosition getPosition() {
    return position;
  }

  public void setPosition(DocumentPosition position) {
    this.position = position;
  }

  public Footnote referenceMark(String referenceMark) {
    this.referenceMark = referenceMark;
    return this;
  }

   /**
   * Gets/sets custom reference mark to be used for this footnote. Default value is , meaning auto-numbered footnotes are used.
   * @return referenceMark
  **/
  @ApiModelProperty(value = "Gets/sets custom reference mark to be used for this footnote. Default value is , meaning auto-numbered footnotes are used.")
  public String getReferenceMark() {
    return referenceMark;
  }

  public void setReferenceMark(String referenceMark) {
    this.referenceMark = referenceMark;
  }

  public Footnote text(String text) {
    this.text = text;
    return this;
  }

   /**
   * This is a convenience property that allows to easily get or set text of the footnote.
   * @return text
  **/
  @ApiModelProperty(value = "This is a convenience property that allows to easily get or set text of the footnote.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Footnote footnote = (Footnote) o;
    return Objects.equals(this.link, footnote.link) &&
        Objects.equals(this.nodeId, footnote.nodeId) &&
        Objects.equals(this.content, footnote.content) &&
        Objects.equals(this.footnoteType, footnote.footnoteType) &&
        Objects.equals(this.position, footnote.position) &&
        Objects.equals(this.referenceMark, footnote.referenceMark) &&
        Objects.equals(this.text, footnote.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, nodeId, content, footnoteType, position, referenceMark, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Footnote {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    footnoteType: ").append(toIndentedString(footnoteType)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    referenceMark: ").append(toIndentedString(referenceMark)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

