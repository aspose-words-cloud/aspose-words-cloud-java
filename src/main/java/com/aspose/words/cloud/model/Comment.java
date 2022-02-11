/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Comment.java">
 *   Copyright (c) 2022 Aspose.Words for Cloud
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
 * DTO container with a comment.
 */
@ApiModel(description = "DTO container with a comment.")
public class Comment extends CommentLink {
    @SerializedName("Author")
    protected String author;

    @SerializedName("Content")
    protected StoryChildNodes content;

    @SerializedName("DateTime")
    protected OffsetDateTime dateTime;

    @SerializedName("Initial")
    protected String initial;

    @SerializedName("RangeEnd")
    protected DocumentPosition rangeEnd;

    @SerializedName("RangeStart")
    protected DocumentPosition rangeStart;

    @SerializedName("Text")
    protected String text;
    /**
     * Gets or sets the author name for a comment.
    * @return author
    **/
    @ApiModelProperty(value = "Gets or sets the author name for a comment.")
    public String getAuthor() {
        return author;
    }

    public Comment author(String author) {
        this.author = author;
        return this;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    /**
     * Gets or sets the content of the comment.
    * @return content
    **/
    @ApiModelProperty(value = "Gets or sets the content of the comment.")
    public StoryChildNodes getContent() {
        return content;
    }

    public Comment content(StoryChildNodes content) {
        this.content = content;
        return this;
    }

    public void setContent(StoryChildNodes content) {
        this.content = content;
    }


    /**
     * Gets or sets the date and time that the comment was made.
    * @return dateTime
    **/
    @ApiModelProperty(value = "Gets or sets the date and time that the comment was made.")
    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public Comment dateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets or sets the initials of the user associated with a specific comment.
    * @return initial
    **/
    @ApiModelProperty(value = "Gets or sets the initials of the user associated with a specific comment.")
    public String getInitial() {
        return initial;
    }

    public Comment initial(String initial) {
        this.initial = initial;
        return this;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }


    /**
     * Gets or sets the link to comment range end node.
    * @return rangeEnd
    **/
    @ApiModelProperty(value = "Gets or sets the link to comment range end node.")
    public DocumentPosition getRangeEnd() {
        return rangeEnd;
    }

    public Comment rangeEnd(DocumentPosition rangeEnd) {
        this.rangeEnd = rangeEnd;
        return this;
    }

    public void setRangeEnd(DocumentPosition rangeEnd) {
        this.rangeEnd = rangeEnd;
    }


    /**
     * Gets or sets the link to comment range start node.
    * @return rangeStart
    **/
    @ApiModelProperty(value = "Gets or sets the link to comment range start node.")
    public DocumentPosition getRangeStart() {
        return rangeStart;
    }

    public Comment rangeStart(DocumentPosition rangeStart) {
        this.rangeStart = rangeStart;
        return this;
    }

    public void setRangeStart(DocumentPosition rangeStart) {
        this.rangeStart = rangeStart;
    }


    /**
     * Gets or sets text of the comment.
    * @return text
    **/
    @ApiModelProperty(value = "Gets or sets text of the comment.")
    public String getText() {
        return text;
    }

    public Comment text(String text) {
        this.text = text;
        return this;
    }

    public void setText(String text) {
        this.text = text;
    }


    public Comment() {
        super();
        this.author = null;
        this.content = null;
        this.dateTime = null;
        this.initial = null;
        this.rangeEnd = null;
        this.rangeStart = null;
        this.text = null;
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
        return
            Objects.equals(this.author, comment.author) &&
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
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    author: ").append(toIndentedString(getAuthor())).append("\n");
    sb.append("    content: ").append(toIndentedString(getContent())).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(getDateTime())).append("\n");
    sb.append("    initial: ").append(toIndentedString(getInitial())).append("\n");
    sb.append("    rangeEnd: ").append(toIndentedString(getRangeEnd())).append("\n");
    sb.append("    rangeStart: ").append(toIndentedString(getRangeStart())).append("\n");
    sb.append("    text: ").append(toIndentedString(getText())).append("\n");
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
