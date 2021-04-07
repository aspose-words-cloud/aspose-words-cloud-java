/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CommentBase.java">
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
 * Comment.
 */
@ApiModel(description = "Comment.")
public class CommentBase {
    @SerializedName("Author")
    private String author = null;

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
    public CommentBase author(String author) {
        this.author = author;
        return this;
    }

    /**
     * Gets or sets the author name for a comment.
    * @return author
    **/
    @ApiModelProperty(value = "Gets or sets the author name for a comment.")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public CommentBase dateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Gets or sets the date and time that the comment was made.
    * @return dateTime
    **/
    @ApiModelProperty(value = "Gets or sets the date and time that the comment was made.")
    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public CommentBase initial(String initial) {
        this.initial = initial;
        return this;
    }

    /**
     * Gets or sets the initials of the user associated with a specific comment.
    * @return initial
    **/
    @ApiModelProperty(value = "Gets or sets the initials of the user associated with a specific comment.")
    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public CommentBase rangeEnd(DocumentPosition rangeEnd) {
        this.rangeEnd = rangeEnd;
        return this;
    }

    /**
     * Gets or sets the link to comment range end node.
    * @return rangeEnd
    **/
    @ApiModelProperty(value = "Gets or sets the link to comment range end node.")
    public DocumentPosition getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(DocumentPosition rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    public CommentBase rangeStart(DocumentPosition rangeStart) {
        this.rangeStart = rangeStart;
        return this;
    }

    /**
     * Gets or sets the link to comment range start node.
    * @return rangeStart
    **/
    @ApiModelProperty(value = "Gets or sets the link to comment range start node.")
    public DocumentPosition getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(DocumentPosition rangeStart) {
        this.rangeStart = rangeStart;
    }

    public CommentBase text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Gets or sets text of the comment.
    * @return text
    **/
    @ApiModelProperty(value = "Gets or sets text of the comment.")
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

        CommentBase commentBase = (CommentBase) o;
        return
            Objects.equals(this.author, commentBase.author) &&
            Objects.equals(this.dateTime, commentBase.dateTime) &&
            Objects.equals(this.initial, commentBase.initial) &&
            Objects.equals(this.rangeEnd, commentBase.rangeEnd) &&
            Objects.equals(this.rangeStart, commentBase.rangeStart) &&
            Objects.equals(this.text, commentBase.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, dateTime, initial, rangeEnd, rangeStart, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentBase {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
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
