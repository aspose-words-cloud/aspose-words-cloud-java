/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReplaceTextParameters.java">
 *   Copyright (c) 2025 Aspose.Words for Cloud
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
import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.model.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Class for document replace text request building.
 */
@ApiModel(description = "Class for document replace text request building.")
public class ReplaceTextParameters implements ModelIfc {
    @SerializedName("ApplySuperscript")
    protected Boolean applySuperscript;

    @SerializedName("IsMatchCase")
    protected Boolean isMatchCase;

    @SerializedName("IsMatchWholeWord")
    protected Boolean isMatchWholeWord;

    @SerializedName("IsOldValueRegex")
    protected Boolean isOldValueRegex;

    @SerializedName("NewValue")
    protected String newValue;

    @SerializedName("OldValue")
    protected String oldValue;
    /**
     * Gets or sets a value indicating whether apply superscript to font or not.
    * @return applySuperscript
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether apply superscript to font or not.")
    public Boolean getApplySuperscript() {
        return applySuperscript;
    }

    public ReplaceTextParameters applySuperscript(Boolean applySuperscript) {
        this.applySuperscript = applySuperscript;
        return this;
    }

    public void setApplySuperscript(Boolean applySuperscript) {
        this.applySuperscript = applySuperscript;
    }


    /**
     * Gets or sets a value indicating whether flag, true means the search is case-sensitive; false means the search is not case-sensitive.
    * @return isMatchCase
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether flag, true means the search is case-sensitive; false means the search is not case-sensitive.")
    public Boolean getIsMatchCase() {
        return isMatchCase;
    }

    public ReplaceTextParameters isMatchCase(Boolean isMatchCase) {
        this.isMatchCase = isMatchCase;
        return this;
    }

    public void setIsMatchCase(Boolean isMatchCase) {
        this.isMatchCase = isMatchCase;
    }


    /**
     * Gets or sets a value indicating whether flag, means that only whole word matched are replaced.
    * @return isMatchWholeWord
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether flag, means that only whole word matched are replaced.")
    public Boolean getIsMatchWholeWord() {
        return isMatchWholeWord;
    }

    public ReplaceTextParameters isMatchWholeWord(Boolean isMatchWholeWord) {
        this.isMatchWholeWord = isMatchWholeWord;
        return this;
    }

    public void setIsMatchWholeWord(Boolean isMatchWholeWord) {
        this.isMatchWholeWord = isMatchWholeWord;
    }


    /**
     * Gets or sets a value indicating whether flag, means that OldValue contains regex expression.
    * @return isOldValueRegex
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether flag, means that OldValue contains regex expression.")
    public Boolean getIsOldValueRegex() {
        return isOldValueRegex;
    }

    public ReplaceTextParameters isOldValueRegex(Boolean isOldValueRegex) {
        this.isOldValueRegex = isOldValueRegex;
        return this;
    }

    public void setIsOldValueRegex(Boolean isOldValueRegex) {
        this.isOldValueRegex = isOldValueRegex;
    }


    /**
     * Gets or sets the new text value to replace by.
    * @return newValue
    **/
    @ApiModelProperty(value = "Gets or sets the new text value to replace by.")
    public String getNewValue() {
        return newValue;
    }

    public ReplaceTextParameters newValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }


    /**
     * Gets or sets the old text value (or regex pattern IsOldValueRegex) to replace.
    * @return oldValue
    **/
    @ApiModelProperty(value = "Gets or sets the old text value (or regex pattern IsOldValueRegex) to replace.")
    public String getOldValue() {
        return oldValue;
    }

    public ReplaceTextParameters oldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }


    public ReplaceTextParameters() {
        this.applySuperscript = null;
        this.isMatchCase = null;
        this.isMatchWholeWord = null;
        this.isOldValueRegex = null;
        this.newValue = null;
        this.oldValue = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
    }

    /*
     * Validate required properties.
     *
     * @throws ApiException If fails to validate required properties.
     */
    @Override
    public void validate() throws ApiException {
        if (this.isMatchCase == null) {
            throw new ApiException(400, "Property IsMatchCase in ReplaceTextParameters is required.");
        }
        if (this.isMatchWholeWord == null) {
            throw new ApiException(400, "Property IsMatchWholeWord in ReplaceTextParameters is required.");
        }
        if (this.isOldValueRegex == null) {
            throw new ApiException(400, "Property IsOldValueRegex in ReplaceTextParameters is required.");
        }
        if (this.newValue == null) {
            throw new ApiException(400, "Property NewValue in ReplaceTextParameters is required.");
        }
        if (this.oldValue == null) {
            throw new ApiException(400, "Property OldValue in ReplaceTextParameters is required.");
        }
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
        return
            Objects.equals(this.applySuperscript, replaceTextParameters.applySuperscript) &&
            Objects.equals(this.isMatchCase, replaceTextParameters.isMatchCase) &&
            Objects.equals(this.isMatchWholeWord, replaceTextParameters.isMatchWholeWord) &&
            Objects.equals(this.isOldValueRegex, replaceTextParameters.isOldValueRegex) &&
            Objects.equals(this.newValue, replaceTextParameters.newValue) &&
            Objects.equals(this.oldValue, replaceTextParameters.oldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applySuperscript, isMatchCase, isMatchWholeWord, isOldValueRegex, newValue, oldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceTextParameters {\n");
    sb.append("    applySuperscript: ").append(toIndentedString(getApplySuperscript())).append("\n");
    sb.append("    isMatchCase: ").append(toIndentedString(getIsMatchCase())).append("\n");
    sb.append("    isMatchWholeWord: ").append(toIndentedString(getIsMatchWholeWord())).append("\n");
    sb.append("    isOldValueRegex: ").append(toIndentedString(getIsOldValueRegex())).append("\n");
    sb.append("    newValue: ").append(toIndentedString(getNewValue())).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(getOldValue())).append("\n");
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
