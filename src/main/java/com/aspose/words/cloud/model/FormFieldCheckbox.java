/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FormFieldCheckbox.java">
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
 * FormField checkbox element.
 */
@ApiModel(description = "FormField checkbox element.")
public class FormFieldCheckbox extends FormField {
    @SerializedName("CheckBoxSize")
    protected Double checkBoxSize;

    @SerializedName("Checked")
    protected Boolean checked;

    @SerializedName("IsCheckBoxExactSize")
    protected Boolean isCheckBoxExactSize;
    /**
     * Gets or sets the size of the checkbox in points. Has effect only when IsCheckBoxExactSize is true.
    * @return checkBoxSize
    **/
    @ApiModelProperty(value = "Gets or sets the size of the checkbox in points. Has effect only when IsCheckBoxExactSize is true.")
    public Double getCheckBoxSize() {
        return checkBoxSize;
    }

    public FormFieldCheckbox checkBoxSize(Double checkBoxSize) {
        this.checkBoxSize = checkBoxSize;
        return this;
    }

    public void setCheckBoxSize(Double checkBoxSize) {
        this.checkBoxSize = checkBoxSize;
    }


    /**
     * Gets or sets the checked status of the check box form field.
    * @return checked
    **/
    @ApiModelProperty(value = "Gets or sets the checked status of the check box form field.")
    public Boolean getChecked() {
        return checked;
    }

    public FormFieldCheckbox checked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }


    /**
     * Gets or sets a value indicating whether the size of the textbox is automatic or specified explicitly.
    * @return isCheckBoxExactSize
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the size of the textbox is automatic or specified explicitly.")
    public Boolean getIsCheckBoxExactSize() {
        return isCheckBoxExactSize;
    }

    public FormFieldCheckbox isCheckBoxExactSize(Boolean isCheckBoxExactSize) {
        this.isCheckBoxExactSize = isCheckBoxExactSize;
        return this;
    }

    public void setIsCheckBoxExactSize(Boolean isCheckBoxExactSize) {
        this.isCheckBoxExactSize = isCheckBoxExactSize;
    }


    public FormFieldCheckbox() {
        super();
        this.checkBoxSize = null;
        this.checked = null;
        this.isCheckBoxExactSize = null;
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
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(getNodeId())).append("\n");
    sb.append("    calculateOnExit: ").append(toIndentedString(getCalculateOnExit())).append("\n");
    sb.append("    enabled: ").append(toIndentedString(getEnabled())).append("\n");
    sb.append("    entryMacro: ").append(toIndentedString(getEntryMacro())).append("\n");
    sb.append("    exitMacro: ").append(toIndentedString(getExitMacro())).append("\n");
    sb.append("    helpText: ").append(toIndentedString(getHelpText())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    ownHelp: ").append(toIndentedString(getOwnHelp())).append("\n");
    sb.append("    ownStatus: ").append(toIndentedString(getOwnStatus())).append("\n");
    sb.append("    statusText: ").append(toIndentedString(getStatusText())).append("\n");
    sb.append("    checkBoxSize: ").append(toIndentedString(getCheckBoxSize())).append("\n");
    sb.append("    checked: ").append(toIndentedString(getChecked())).append("\n");
    sb.append("    isCheckBoxExactSize: ").append(toIndentedString(getIsCheckBoxExactSize())).append("\n");
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
