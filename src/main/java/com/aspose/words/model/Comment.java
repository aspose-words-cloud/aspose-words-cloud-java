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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Comment
 */

public class Comment extends CommentLink {
  @SerializedName("Author")
  private String author = null;

  @SerializedName("Content")
  private StoryChildNodes content = null;

  @SerializedName("DateTime")
  private OffsetDateTime dateTime = null;

  @SerializedName("Initial")
  private String initial = null;

  @SerializedName("RangeEnd")
  private DocumentPosition rangeEnd = null;

  @SerializedName("RangeStart")
  private DocumentPosition rangeStart = null;

  @SerializedName("Text")
  private String text = null;

  public Comment author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
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
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
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
   * Get dateTime
   * @return dateTime
  **/
  @ApiModelProperty(value = "")
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
   * Get initial
   * @return initial
  **/
  @ApiModelProperty(value = "")
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
   * Get rangeEnd
   * @return rangeEnd
  **/
  @ApiModelProperty(value = "")
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
   * Get rangeStart
   * @return rangeStart
  **/
  @ApiModelProperty(value = "")
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
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.author, comment.author) &&
        Objects.equals(this.content, comment.content) &&
        Objects.equals(this.dateTime, comment.dateTime) &&
        Objects.equals(this.initial, comment.initial) &&
        Objects.equals(this.rangeEnd, comment.rangeEnd) &&
        Objects.equals(this.rangeStart, comment.rangeStart) &&
        Objects.equals(this.text, comment.text) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, content, dateTime, initial, rangeEnd, rangeStart, text, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

