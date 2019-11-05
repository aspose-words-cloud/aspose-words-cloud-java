/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2019 Aspose.Words for Cloud
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
import com.aspose.words.cloud.model.ParagraphLinkCollection;
import com.aspose.words.cloud.model.WordsResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This response should be returned by the service when handling: GET http://api.aspose.com/v4.0/words/Test.doc/paragraphs.
 */
@ApiModel(description = "This response should be returned by the service when handling: GET http://api.aspose.com/v4.0/words/Test.doc/paragraphs.")

public class ParagraphLinkCollectionResponse extends WordsResponse {
  @SerializedName("Paragraphs")
  private ParagraphLinkCollection paragraphs = null;

  public ParagraphLinkCollectionResponse paragraphs(ParagraphLinkCollection paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

   /**
   * Gets or sets collection of paragraphs.
   * @return paragraphs
  **/
  @ApiModelProperty(value = "Gets or sets collection of paragraphs.")
  public ParagraphLinkCollection getParagraphs() {
    return paragraphs;
  }

  public void setParagraphs(ParagraphLinkCollection paragraphs) {
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
    ParagraphLinkCollectionResponse paragraphLinkCollectionResponse = (ParagraphLinkCollectionResponse) o;
    return Objects.equals(this.paragraphs, paragraphLinkCollectionResponse.paragraphs) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paragraphs, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParagraphLinkCollectionResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
