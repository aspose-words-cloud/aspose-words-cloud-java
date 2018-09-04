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
import com.aspose.words.model.LinkElement;
import com.aspose.words.model.WordsApiLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Words document property DTO.
 */
@ApiModel(description = "Words document property DTO.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:24:51.214Z")
public class DocumentProperty {
  @JsonProperty("link")
  private WordsApiLink link = null;

  @JsonProperty("BuiltIn")
  private Boolean builtIn = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Value")
  private String value = null;

  public DocumentProperty link(WordsApiLink link) {
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

  public DocumentProperty builtIn(Boolean builtIn) {
    this.builtIn = builtIn;
    return this;
  }

   /**
   * Flag indicates whether the property is built-in or not. If true the property is built-in, if false the property is custom.
   * @return builtIn
  **/
  @ApiModelProperty(value = "Flag indicates whether the property is built-in or not. If true the property is built-in, if false the property is custom.")
  public Boolean isBuiltIn() {
    return builtIn;
  }

  public void setBuiltIn(Boolean builtIn) {
    this.builtIn = builtIn;
  }

  public DocumentProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the document property.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the document property.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * string value of the document property. 
   * @return value
  **/
  @ApiModelProperty(value = "string value of the document property. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentProperty documentProperty = (DocumentProperty) o;
    return Objects.equals(this.link, documentProperty.link) &&
        Objects.equals(this.builtIn, documentProperty.builtIn) &&
        Objects.equals(this.name, documentProperty.name) &&
        Objects.equals(this.value, documentProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, builtIn, name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentProperty {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    builtIn: ").append(toIndentedString(builtIn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

