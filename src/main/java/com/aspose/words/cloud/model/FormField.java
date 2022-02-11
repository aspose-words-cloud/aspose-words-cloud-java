/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FormField.java">
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
 * FromField.
 */
@ApiModel(description = "FromField.")
public class FormField extends NodeLink {
    @SerializedName("CalculateOnExit")
    protected Boolean calculateOnExit;

    @SerializedName("Enabled")
    protected Boolean enabled;

    @SerializedName("EntryMacro")
    protected String entryMacro;

    @SerializedName("ExitMacro")
    protected String exitMacro;

    @SerializedName("HelpText")
    protected String helpText;

    @SerializedName("Name")
    protected String name;

    @SerializedName("OwnHelp")
    protected Boolean ownHelp;

    @SerializedName("OwnStatus")
    protected Boolean ownStatus;

    @SerializedName("StatusText")
    protected String statusText;
    /**
     * Gets or sets a value indicating whether references to the specified form field are automatically updated whenever the field is exited.
    * @return calculateOnExit
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether references to the specified form field are automatically updated whenever the field is exited.")
    public Boolean getCalculateOnExit() {
        return calculateOnExit;
    }

    public FormField calculateOnExit(Boolean calculateOnExit) {
        this.calculateOnExit = calculateOnExit;
        return this;
    }

    public void setCalculateOnExit(Boolean calculateOnExit) {
        this.calculateOnExit = calculateOnExit;
    }


    /**
     * Gets or sets a value indicating whether a form field is enabled.
    * @return enabled
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether a form field is enabled.")
    public Boolean getEnabled() {
        return enabled;
    }

    public FormField enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets or sets the entry macro name for the form field.
    * @return entryMacro
    **/
    @ApiModelProperty(value = "Gets or sets the entry macro name for the form field.")
    public String getEntryMacro() {
        return entryMacro;
    }

    public FormField entryMacro(String entryMacro) {
        this.entryMacro = entryMacro;
        return this;
    }

    public void setEntryMacro(String entryMacro) {
        this.entryMacro = entryMacro;
    }


    /**
     * Gets or sets the exit macro name for the form field.
    * @return exitMacro
    **/
    @ApiModelProperty(value = "Gets or sets the exit macro name for the form field.")
    public String getExitMacro() {
        return exitMacro;
    }

    public FormField exitMacro(String exitMacro) {
        this.exitMacro = exitMacro;
        return this;
    }

    public void setExitMacro(String exitMacro) {
        this.exitMacro = exitMacro;
    }


    /**
     * Gets or sets text, displayed in a message box when the form field has the focus and the user presses F1.
    * @return helpText
    **/
    @ApiModelProperty(value = "Gets or sets text, displayed in a message box when the form field has the focus and the user presses F1.")
    public String getHelpText() {
        return helpText;
    }

    public FormField helpText(String helpText) {
        this.helpText = helpText;
        return this;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }


    /**
     * Gets or sets the form field name.
    * @return name
    **/
    @ApiModelProperty(value = "Gets or sets the form field name.")
    public String getName() {
        return name;
    }

    public FormField name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets or sets a value indicating whether the source of the text that's displayed in a message box when a form field has the focus and the user presses F1.
    * @return ownHelp
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the source of the text that's displayed in a message box when a form field has the focus and the user presses F1.")
    public Boolean getOwnHelp() {
        return ownHelp;
    }

    public FormField ownHelp(Boolean ownHelp) {
        this.ownHelp = ownHelp;
        return this;
    }

    public void setOwnHelp(Boolean ownHelp) {
        this.ownHelp = ownHelp;
    }


    /**
     * Gets or sets a value indicating whether the source of the text that's displayed in the status bar when a form field has the focus.
    * @return ownStatus
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the source of the text that's displayed in the status bar when a form field has the focus.")
    public Boolean getOwnStatus() {
        return ownStatus;
    }

    public FormField ownStatus(Boolean ownStatus) {
        this.ownStatus = ownStatus;
        return this;
    }

    public void setOwnStatus(Boolean ownStatus) {
        this.ownStatus = ownStatus;
    }


    /**
     * Gets or sets text, displayed in the status bar when a form field has the focus.
    * @return statusText
    **/
    @ApiModelProperty(value = "Gets or sets text, displayed in the status bar when a form field has the focus.")
    public String getStatusText() {
        return statusText;
    }

    public FormField statusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }


    public FormField() {
        super();
        this.calculateOnExit = null;
        this.enabled = null;
        this.entryMacro = null;
        this.exitMacro = null;
        this.helpText = null;
        this.name = null;
        this.ownHelp = null;
        this.ownStatus = null;
        this.statusText = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FormField formField = (FormField) o;
        return
            Objects.equals(this.calculateOnExit, formField.calculateOnExit) &&
            Objects.equals(this.enabled, formField.enabled) &&
            Objects.equals(this.entryMacro, formField.entryMacro) &&
            Objects.equals(this.exitMacro, formField.exitMacro) &&
            Objects.equals(this.helpText, formField.helpText) &&
            Objects.equals(this.name, formField.name) &&
            Objects.equals(this.ownHelp, formField.ownHelp) &&
            Objects.equals(this.ownStatus, formField.ownStatus) &&
            Objects.equals(this.statusText, formField.statusText) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculateOnExit, enabled, entryMacro, exitMacro, helpText, name, ownHelp, ownStatus, statusText, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormField {\n");
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
