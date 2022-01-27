/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ParagraphFormat.java">
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
 * Paragraph format element.
 */
@ApiModel(description = "Paragraph format element.")
public class ParagraphFormat extends ParagraphFormatBase {
    @SerializedName("IsHeading")
    protected Boolean isHeading;

    @SerializedName("IsListItem")
    protected Boolean isListItem;
    /**
     * Gets or sets a value indicating whether the paragraph style is one of the built-in Heading styles.
    * @return isHeading
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the paragraph style is one of the built-in Heading styles.")
    public Boolean getIsHeading() {
        return isHeading;
    }

    public ParagraphFormat isHeading(Boolean isHeading) {
        this.isHeading = isHeading;
        return this;
    }

    public void setIsHeading(Boolean isHeading) {
        this.isHeading = isHeading;
    }


    /**
     * Gets or sets a value indicating whether the paragraph is an item in a bulleted or numbered list.
    * @return isListItem
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the paragraph is an item in a bulleted or numbered list.")
    public Boolean getIsListItem() {
        return isListItem;
    }

    public ParagraphFormat isListItem(Boolean isListItem) {
        this.isListItem = isListItem;
        return this;
    }

    public void setIsListItem(Boolean isListItem) {
        this.isListItem = isListItem;
    }


    public ParagraphFormat() {
        super();
        this.isHeading = null;
        this.isListItem = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ParagraphFormat paragraphFormat = (ParagraphFormat) o;
        return
            Objects.equals(this.isHeading, paragraphFormat.isHeading) &&
            Objects.equals(this.isListItem, paragraphFormat.isListItem) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHeading, isListItem, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParagraphFormat {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    addSpaceBetweenFarEastAndAlpha: ").append(toIndentedString(getAddSpaceBetweenFarEastAndAlpha())).append("\n");
    sb.append("    addSpaceBetweenFarEastAndDigit: ").append(toIndentedString(getAddSpaceBetweenFarEastAndDigit())).append("\n");
    sb.append("    alignment: ").append(toIndentedString(getAlignment())).append("\n");
    sb.append("    bidi: ").append(toIndentedString(getBidi())).append("\n");
    sb.append("    dropCapPosition: ").append(toIndentedString(getDropCapPosition())).append("\n");
    sb.append("    firstLineIndent: ").append(toIndentedString(getFirstLineIndent())).append("\n");
    sb.append("    keepTogether: ").append(toIndentedString(getKeepTogether())).append("\n");
    sb.append("    keepWithNext: ").append(toIndentedString(getKeepWithNext())).append("\n");
    sb.append("    leftIndent: ").append(toIndentedString(getLeftIndent())).append("\n");
    sb.append("    lineSpacing: ").append(toIndentedString(getLineSpacing())).append("\n");
    sb.append("    lineSpacingRule: ").append(toIndentedString(getLineSpacingRule())).append("\n");
    sb.append("    linesToDrop: ").append(toIndentedString(getLinesToDrop())).append("\n");
    sb.append("    noSpaceBetweenParagraphsOfSameStyle: ").append(toIndentedString(getNoSpaceBetweenParagraphsOfSameStyle())).append("\n");
    sb.append("    outlineLevel: ").append(toIndentedString(getOutlineLevel())).append("\n");
    sb.append("    pageBreakBefore: ").append(toIndentedString(getPageBreakBefore())).append("\n");
    sb.append("    rightIndent: ").append(toIndentedString(getRightIndent())).append("\n");
    sb.append("    shading: ").append(toIndentedString(getShading())).append("\n");
    sb.append("    spaceAfter: ").append(toIndentedString(getSpaceAfter())).append("\n");
    sb.append("    spaceAfterAuto: ").append(toIndentedString(getSpaceAfterAuto())).append("\n");
    sb.append("    spaceBefore: ").append(toIndentedString(getSpaceBefore())).append("\n");
    sb.append("    spaceBeforeAuto: ").append(toIndentedString(getSpaceBeforeAuto())).append("\n");
    sb.append("    styleIdentifier: ").append(toIndentedString(getStyleIdentifier())).append("\n");
    sb.append("    styleName: ").append(toIndentedString(getStyleName())).append("\n");
    sb.append("    suppressAutoHyphens: ").append(toIndentedString(getSuppressAutoHyphens())).append("\n");
    sb.append("    suppressLineNumbers: ").append(toIndentedString(getSuppressLineNumbers())).append("\n");
    sb.append("    widowControl: ").append(toIndentedString(getWidowControl())).append("\n");
    sb.append("    isHeading: ").append(toIndentedString(getIsHeading())).append("\n");
    sb.append("    isListItem: ").append(toIndentedString(getIsListItem())).append("\n");
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
