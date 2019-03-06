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
 * Container class for compare documents
 */
@ApiModel(description = "Container class for compare documents")

public class CompareData {
  @SerializedName("ComparingWithDocument")
  private String comparingWithDocument = null;

  @SerializedName("Author")
  private String author = null;

  @SerializedName("DateTime")
  private OffsetDateTime dateTime = null;

  public CompareData comparingWithDocument(String comparingWithDocument) {
    this.comparingWithDocument = comparingWithDocument;
    return this;
  }

   /**
   * Path to document to compare at the server.
   * @return comparingWithDocument
  **/
  @ApiModelProperty(value = "Path to document to compare at the server.")
  public String getComparingWithDocument() {
    return comparingWithDocument;
  }

  public void setComparingWithDocument(String comparingWithDocument) {
    this.comparingWithDocument = comparingWithDocument;
  }

  public CompareData author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Initials of the author to use for revisions.
   * @return author
  **/
  @ApiModelProperty(value = "Initials of the author to use for revisions.")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public CompareData dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * The date and time to use for revisions.             
   * @return dateTime
  **/
  @ApiModelProperty(value = "The date and time to use for revisions.             ")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompareData compareData = (CompareData) o;
    return Objects.equals(this.comparingWithDocument, compareData.comparingWithDocument) &&
        Objects.equals(this.author, compareData.author) &&
        Objects.equals(this.dateTime, compareData.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparingWithDocument, author, dateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompareData {\n");
    
    sb.append("    comparingWithDocument: ").append(toIndentedString(comparingWithDocument)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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

