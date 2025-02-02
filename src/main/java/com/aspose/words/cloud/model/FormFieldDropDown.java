/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FormFieldDropDown.java">
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
 * FormField dropdownlist element.
 */
@ApiModel(description = "FormField dropdownlist element.")
public class FormFieldDropDown extends FormField {
    @SerializedName("DropDownItems")
    protected List<String> dropDownItems;

    @SerializedName("DropDownSelectedIndex")
    protected Integer dropDownSelectedIndex;
    /**
     * Gets or sets the items array of a dropdown form field.
     * Microsoft Word allows maximum 25 items in a dropdown form field.
    * @return dropDownItems
    **/
    @ApiModelProperty(value = "Gets or sets the items array of a dropdown form field. Microsoft Word allows maximum 25 items in a dropdown form field.")
    public List<String> getDropDownItems() {
        return dropDownItems;
    }

    public FormFieldDropDown dropDownItems(List<String> dropDownItems) {
        this.dropDownItems = dropDownItems;
        return this;
    }

    public FormFieldDropDown addDropDownItemsItem(String dropDownItemsItem) {
        if (this.dropDownItems == null) {
            this.dropDownItems = new ArrayList<String>();
        }
        this.dropDownItems.add(dropDownItemsItem);
        return this;
    }


    public void setDropDownItems(List<String> dropDownItems) {
        this.dropDownItems = dropDownItems;
    }


    /**
     * Gets or sets the index specifying the currently selected item in a dropdown form field.
    * @return dropDownSelectedIndex
    **/
    @ApiModelProperty(value = "Gets or sets the index specifying the currently selected item in a dropdown form field.")
    public Integer getDropDownSelectedIndex() {
        return dropDownSelectedIndex;
    }

    public FormFieldDropDown dropDownSelectedIndex(Integer dropDownSelectedIndex) {
        this.dropDownSelectedIndex = dropDownSelectedIndex;
        return this;
    }

    public void setDropDownSelectedIndex(Integer dropDownSelectedIndex) {
        this.dropDownSelectedIndex = dropDownSelectedIndex;
    }


    public FormFieldDropDown() {
        super();
        this.dropDownItems = null;
        this.dropDownSelectedIndex = null;
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
        super.validate();
        if (this.dropDownItems == null) {
            throw new ApiException(400, "Property DropDownItems in FormFieldDropDown is required.");
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

        FormFieldDropDown formFieldDropDown = (FormFieldDropDown) o;
        return
            Objects.equals(this.dropDownItems, formFieldDropDown.dropDownItems) &&
            Objects.equals(this.dropDownSelectedIndex, formFieldDropDown.dropDownSelectedIndex) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dropDownItems, dropDownSelectedIndex, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldDropDown {\n");
    sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(getNodeId())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    enabled: ").append(toIndentedString(getEnabled())).append("\n");
    sb.append("    statusText: ").append(toIndentedString(getStatusText())).append("\n");
    sb.append("    ownStatus: ").append(toIndentedString(getOwnStatus())).append("\n");
    sb.append("    helpText: ").append(toIndentedString(getHelpText())).append("\n");
    sb.append("    ownHelp: ").append(toIndentedString(getOwnHelp())).append("\n");
    sb.append("    calculateOnExit: ").append(toIndentedString(getCalculateOnExit())).append("\n");
    sb.append("    entryMacro: ").append(toIndentedString(getEntryMacro())).append("\n");
    sb.append("    exitMacro: ").append(toIndentedString(getExitMacro())).append("\n");
    sb.append("    dropDownItems: ").append(toIndentedString(getDropDownItems())).append("\n");
    sb.append("    dropDownSelectedIndex: ").append(toIndentedString(getDropDownSelectedIndex())).append("\n");
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
