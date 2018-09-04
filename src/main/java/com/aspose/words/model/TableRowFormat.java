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
 * Represents all formatting for a table row.
 */
@ApiModel(description = "Represents all formatting for a table row.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T12:17:13.230Z")
public class TableRowFormat {
  @JsonProperty("link")
  private WordsApiLink link = null;

  @JsonProperty("AllowBreakAcrossPages")
  private Boolean allowBreakAcrossPages = null;

  @JsonProperty("HeadingFormat")
  private Boolean headingFormat = null;

  @JsonProperty("Height")
  private Double height = null;

  /**
   * Gets or sets the rule for determining the height of the table row.
   */
  public enum HeightRuleEnum {
    ATLEAST("AtLeast"),
    
    EXACTLY("Exactly"),
    
    AUTO("Auto");

    private String value;

    HeightRuleEnum(String value) {
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
    public static HeightRuleEnum fromValue(String text) {
      for (HeightRuleEnum b : HeightRuleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("HeightRule")
  private HeightRuleEnum heightRule = null;

  public TableRowFormat link(WordsApiLink link) {
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

  public TableRowFormat allowBreakAcrossPages(Boolean allowBreakAcrossPages) {
    this.allowBreakAcrossPages = allowBreakAcrossPages;
    return this;
  }

   /**
   * True if the text in a table row is allowed to split across a page break.
   * @return allowBreakAcrossPages
  **/
  @ApiModelProperty(value = "True if the text in a table row is allowed to split across a page break.")
  public Boolean isAllowBreakAcrossPages() {
    return allowBreakAcrossPages;
  }

  public void setAllowBreakAcrossPages(Boolean allowBreakAcrossPages) {
    this.allowBreakAcrossPages = allowBreakAcrossPages;
  }

  public TableRowFormat headingFormat(Boolean headingFormat) {
    this.headingFormat = headingFormat;
    return this;
  }

   /**
   * True if the row is repeated as a table heading on every page when the table spans more than one page.
   * @return headingFormat
  **/
  @ApiModelProperty(value = "True if the row is repeated as a table heading on every page when the table spans more than one page.")
  public Boolean isHeadingFormat() {
    return headingFormat;
  }

  public void setHeadingFormat(Boolean headingFormat) {
    this.headingFormat = headingFormat;
  }

  public TableRowFormat height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets the height of the table row in points.
   * @return height
  **/
  @ApiModelProperty(value = "Gets or sets the height of the table row in points.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public TableRowFormat heightRule(HeightRuleEnum heightRule) {
    this.heightRule = heightRule;
    return this;
  }

   /**
   * Gets or sets the rule for determining the height of the table row.
   * @return heightRule
  **/
  @ApiModelProperty(value = "Gets or sets the rule for determining the height of the table row.")
  public HeightRuleEnum getHeightRule() {
    return heightRule;
  }

  public void setHeightRule(HeightRuleEnum heightRule) {
    this.heightRule = heightRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRowFormat tableRowFormat = (TableRowFormat) o;
    return Objects.equals(this.link, tableRowFormat.link) &&
        Objects.equals(this.allowBreakAcrossPages, tableRowFormat.allowBreakAcrossPages) &&
        Objects.equals(this.headingFormat, tableRowFormat.headingFormat) &&
        Objects.equals(this.height, tableRowFormat.height) &&
        Objects.equals(this.heightRule, tableRowFormat.heightRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, allowBreakAcrossPages, headingFormat, height, heightRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRowFormat {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    allowBreakAcrossPages: ").append(toIndentedString(allowBreakAcrossPages)).append("\n");
    sb.append("    headingFormat: ").append(toIndentedString(headingFormat)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    heightRule: ").append(toIndentedString(heightRule)).append("\n");
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

