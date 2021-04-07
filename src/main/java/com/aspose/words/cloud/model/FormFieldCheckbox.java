/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FormFieldCheckbox.java">
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
 * FormField checkbox element.
 */
@ApiModel(description = "FormField checkbox element.")
public class FormFieldCheckbox extends FormField {
    @SerializedName("CheckBoxSize")
    private Double checkBoxSize = null;

    @SerializedName("Checked")
    private Boolean checked = null;

    @SerializedName("IsCheckBoxExactSize")
    private Boolean isCheckBoxExactSize = null;
    public FormFieldCheckbox checkBoxSize(Double checkBoxSize) {
        this.checkBoxSize = checkBoxSize;
        return this;
    }

    /**
     * Gets or sets the size of the checkbox in points. Has effect only when IsCheckBoxExactSize is true.
    * @return checkBoxSize
    **/
    @ApiModelProperty(value = "Gets or sets the size of the checkbox in points. Has effect only when IsCheckBoxExactSize is true.")
    public Double getCheckBoxSize() {
        return checkBoxSize;
    }

    public void setCheckBoxSize(Double checkBoxSize) {
        this.checkBoxSize = checkBoxSize;
    }

    public FormFieldCheckbox checked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    /**
     * Gets or sets the checked status of the check box form field.
    * @return checked
    **/
    @ApiModelProperty(value = "Gets or sets the checked status of the check box form field.")
    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public FormFieldCheckbox isCheckBoxExactSize(Boolean isCheckBoxExactSize) {
        this.isCheckBoxExactSize = isCheckBoxExactSize;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the size of the textbox is automatic or specified explicitly.
    * @return isCheckBoxExactSize
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the size of the textbox is automatic or specified explicitly.")
    public Boolean getIsCheckBoxExactSize() {
        return isCheckBoxExactSize;
    }

    public void setIsCheckBoxExactSize(Boolean isCheckBoxExactSize) {
        this.isCheckBoxExactSize = isCheckBoxExactSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FormFieldCheckbox formFieldCheckbox = (FormFieldCheckbox) o;
        return
            Objects.equals(this.checkBoxSize, formFieldCheckbox.checkBoxSize) &&
            Objects.equals(this.checked, formFieldCheckbox.checked) &&
            Objects.equals(this.isCheckBoxExactSize, formFieldCheckbox.isCheckBoxExactSize) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkBoxSize, checked, isCheckBoxExactSize, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldCheckbox {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    checkBoxSize: ").append(toIndentedString(checkBoxSize)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
    sb.append("    isCheckBoxExactSize: ").append(toIndentedString(isCheckBoxExactSize)).append("\n");
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
