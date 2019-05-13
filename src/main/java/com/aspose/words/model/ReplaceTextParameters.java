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

/**
 * Class for document replace text request building.
 */
@ApiModel(description = "Class for document replace text request building.")

public class ReplaceTextParameters {
  @SerializedName("OldValue")
  private String oldValue = null;

  @SerializedName("NewValue")
  private String newValue = null;

  @SerializedName("IsMatchCase")
  private Boolean isMatchCase = null;

  @SerializedName("IsMatchWholeWord")
  private Boolean isMatchWholeWord = null;

  @SerializedName("IsOldValueRegex")
  private Boolean isOldValueRegex = null;

  public ReplaceTextParameters oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Old text value (or regex pattern ) to replace.
   * @return oldValue
  **/
  @ApiModelProperty(value = "Old text value (or regex pattern ) to replace.")
  public String getOldValue() {
    return oldValue;
  }

  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }

  public ReplaceTextParameters newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

   /**
   * New text value to replace by.
   * @return newValue
  **/
  @ApiModelProperty(value = "New text value to replace by.")
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  public ReplaceTextParameters isMatchCase(Boolean isMatchCase) {
    this.isMatchCase = isMatchCase;
    return this;
  }

   /**
   * Flag, true means the search is case-sensitive; false means the search is not case-sensitive.
   * @return isMatchCase
  **/
  @ApiModelProperty(required = true, value = "Flag, true means the search is case-sensitive; false means the search is not case-sensitive.")
  public Boolean isisIsMatchCase() {
    return isMatchCase;
  }

  public void setIsMatchCase(Boolean isMatchCase) {
    this.isMatchCase = isMatchCase;
  }

  public ReplaceTextParameters isMatchWholeWord(Boolean isMatchWholeWord) {
    this.isMatchWholeWord = isMatchWholeWord;
    return this;
  }

   /**
   * Flag, means that only whole word matched are replaced.
   * @return isMatchWholeWord
  **/
  @ApiModelProperty(required = true, value = "Flag, means that only whole word matched are replaced.")
  public Boolean isisIsMatchWholeWord() {
    return isMatchWholeWord;
  }

  public void setIsMatchWholeWord(Boolean isMatchWholeWord) {
    this.isMatchWholeWord = isMatchWholeWord;
  }

  public ReplaceTextParameters isOldValueRegex(Boolean isOldValueRegex) {
    this.isOldValueRegex = isOldValueRegex;
    return this;
  }

   /**
   * Flag, means that  contains regex expression.
   * @return isOldValueRegex
  **/
  @ApiModelProperty(required = true, value = "Flag, means that  contains regex expression.")
  public Boolean isisIsOldValueRegex() {
    return isOldValueRegex;
  }

  public void setIsOldValueRegex(Boolean isOldValueRegex) {
    this.isOldValueRegex = isOldValueRegex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceTextParameters replaceTextParameters = (ReplaceTextParameters) o;
    return Objects.equals(this.oldValue, replaceTextParameters.oldValue) &&
        Objects.equals(this.newValue, replaceTextParameters.newValue) &&
        Objects.equals(this.isMatchCase, replaceTextParameters.isMatchCase) &&
        Objects.equals(this.isMatchWholeWord, replaceTextParameters.isMatchWholeWord) &&
        Objects.equals(this.isOldValueRegex, replaceTextParameters.isOldValueRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldValue, newValue, isMatchCase, isMatchWholeWord, isOldValueRegex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceTextParameters {\n");
    
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    isMatchCase: ").append(toIndentedString(isMatchCase)).append("\n");
    sb.append("    isMatchWholeWord: ").append(toIndentedString(isMatchWholeWord)).append("\n");
    sb.append("    isOldValueRegex: ").append(toIndentedString(isOldValueRegex)).append("\n");
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

