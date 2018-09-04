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
import com.aspose.words.model.CommentLink;
import com.aspose.words.model.DocumentPosition;
import com.aspose.words.model.StoryChildNodes;
import com.aspose.words.model.WordsApiLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * Comment.
 */
@ApiModel(description = "Comment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:21:14.416Z")
public class Comment {
  @JsonProperty("link")
  private WordsApiLink link = null;

  @JsonProperty("Author")
  private String author = null;

  @JsonProperty("Content")
  private StoryChildNodes content = null;

  @JsonProperty("DateTime")
  private OffsetDateTime dateTime = null;

  @JsonProperty("Initial")
  private String initial = null;

  @JsonProperty("RangeEnd")
  private DocumentPosition rangeEnd = null;

  @JsonProperty("RangeStart")
  private DocumentPosition rangeStart = null;

  @JsonProperty("Text")
  private String text = null;

  public Comment link(WordsApiLink link) {
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

  public Comment author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Returns or sets the author name for a comment.
   * @return author
  **/
  @ApiModelProperty(value = "Returns or sets the author name for a comment.")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Comment content(StoryChildNodes content) {
    this.content = content;
    return this;
  }

   /**
   * Content of comment
   * @return content
  **/
  @ApiModelProperty(value = "Content of comment")
  public StoryChildNodes getContent() {
    return content;
  }

  public void setContent(StoryChildNodes content) {
    this.content = content;
  }

  public Comment dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Gets the date and time that the comment was made.
   * @return dateTime
  **/
  @ApiModelProperty(value = "Gets the date and time that the comment was made.")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public Comment initial(String initial) {
    this.initial = initial;
    return this;
  }

   /**
   * Returns or sets the initials of the user associated with a specific comment.
   * @return initial
  **/
  @ApiModelProperty(value = "Returns or sets the initials of the user associated with a specific comment.")
  public String getInitial() {
    return initial;
  }

  public void setInitial(String initial) {
    this.initial = initial;
  }

  public Comment rangeEnd(DocumentPosition rangeEnd) {
    this.rangeEnd = rangeEnd;
    return this;
  }

   /**
   * Link to comment range end node.
   * @return rangeEnd
  **/
  @ApiModelProperty(value = "Link to comment range end node.")
  public DocumentPosition getRangeEnd() {
    return rangeEnd;
  }

  public void setRangeEnd(DocumentPosition rangeEnd) {
    this.rangeEnd = rangeEnd;
  }

  public Comment rangeStart(DocumentPosition rangeStart) {
    this.rangeStart = rangeStart;
    return this;
  }

   /**
   * Link to comment range start node.
   * @return rangeStart
  **/
  @ApiModelProperty(value = "Link to comment range start node.")
  public DocumentPosition getRangeStart() {
    return rangeStart;
  }

  public void setRangeStart(DocumentPosition rangeStart) {
    this.rangeStart = rangeStart;
  }

  public Comment text(String text) {
    this.text = text;
    return this;
  }

   /**
   * This is a convenience property that allows to easily get or set text of the comment.
   * @return text
  **/
  @ApiModelProperty(value = "This is a convenience property that allows to easily get or set text of the comment.")
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
    Comment comment = (Comment) o;
    return Objects.equals(this.link, comment.link) &&
        Objects.equals(this.author, comment.author) &&
        Objects.equals(this.content, comment.content) &&
        Objects.equals(this.dateTime, comment.dateTime) &&
        Objects.equals(this.initial, comment.initial) &&
        Objects.equals(this.rangeEnd, comment.rangeEnd) &&
        Objects.equals(this.rangeStart, comment.rangeStart) &&
        Objects.equals(this.text, comment.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, author, content, dateTime, initial, rangeEnd, rangeStart, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    rangeEnd: ").append(toIndentedString(rangeEnd)).append("\n");
    sb.append("    rangeStart: ").append(toIndentedString(rangeStart)).append("\n");
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

