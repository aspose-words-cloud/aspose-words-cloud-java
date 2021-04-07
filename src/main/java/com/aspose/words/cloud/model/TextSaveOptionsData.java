/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TextSaveOptionsData.java">
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
 * Container class for text save options.
 */
@ApiModel(description = "Container class for text save options.")
public class TextSaveOptionsData extends TxtSaveOptionsBaseData {
    @SerializedName("AddBidiMarks")
    private Boolean addBidiMarks = null;

    @SerializedName("PreserveTableLayout")
    private Boolean preserveTableLayout = null;

    @SerializedName("SimplifyListLabels")
    private Boolean simplifyListLabels = null;
    public TextSaveOptionsData addBidiMarks(Boolean addBidiMarks) {
        this.addBidiMarks = addBidiMarks;
        return this;
    }

    /**
     * Gets or sets a value indicating whether to add bi-directional marks before each BiDi run when exporting in plain text format.
     * The default value is true.
    * @return addBidiMarks
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to add bi-directional marks before each BiDi run when exporting in plain text format. The default value is true.")
    public Boolean getAddBidiMarks() {
        return addBidiMarks;
    }

    public void setAddBidiMarks(Boolean addBidiMarks) {
        this.addBidiMarks = addBidiMarks;
    }

    public TextSaveOptionsData preserveTableLayout(Boolean preserveTableLayout) {
        this.preserveTableLayout = preserveTableLayout;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the program should attempt to preserve layout of tables when saving in the plain text format.
    * @return preserveTableLayout
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the program should attempt to preserve layout of tables when saving in the plain text format.")
    public Boolean getPreserveTableLayout() {
        return preserveTableLayout;
    }

    public void setPreserveTableLayout(Boolean preserveTableLayout) {
        this.preserveTableLayout = preserveTableLayout;
    }

    public TextSaveOptionsData simplifyListLabels(Boolean simplifyListLabels) {
        this.simplifyListLabels = simplifyListLabels;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the program should simplify list labels in case of complex label formatting not being adequately represented by plain text.
    * @return simplifyListLabels
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the program should simplify list labels in case of complex label formatting not being adequately represented by plain text.")
    public Boolean getSimplifyListLabels() {
        return simplifyListLabels;
    }

    public void setSimplifyListLabels(Boolean simplifyListLabels) {
        this.simplifyListLabels = simplifyListLabels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TextSaveOptionsData textSaveOptionsData = (TextSaveOptionsData) o;
        return
            Objects.equals(this.addBidiMarks, textSaveOptionsData.addBidiMarks) &&
            Objects.equals(this.preserveTableLayout, textSaveOptionsData.preserveTableLayout) &&
            Objects.equals(this.simplifyListLabels, textSaveOptionsData.simplifyListLabels) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addBidiMarks, preserveTableLayout, simplifyListLabels, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    addBidiMarks: ").append(toIndentedString(addBidiMarks)).append("\n");
    sb.append("    preserveTableLayout: ").append(toIndentedString(preserveTableLayout)).append("\n");
    sb.append("    simplifyListLabels: ").append(toIndentedString(simplifyListLabels)).append("\n");
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
