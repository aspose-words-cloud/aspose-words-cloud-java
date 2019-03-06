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
import com.aspose.words.cloud.model.NodeLink;
import com.aspose.words.cloud.model.WordsApiLink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FromField
 */
@ApiModel(description = "FromField")

public class FormField extends NodeLink {
  @SerializedName("CalculateOnExit")
  private Boolean calculateOnExit = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("EntryMacro")
  private String entryMacro = null;

  @SerializedName("ExitMacro")
  private String exitMacro = null;

  @SerializedName("HelpText")
  private String helpText = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("OwnHelp")
  private Boolean ownHelp = null;

  @SerializedName("OwnStatus")
  private Boolean ownStatus = null;

  @SerializedName("StatusText")
  private String statusText = null;

  public FormField calculateOnExit(Boolean calculateOnExit) {
    this.calculateOnExit = calculateOnExit;
    return this;
  }

   /**
   * True if references to the specified form field are automatically updated whenever the field is exited.
   * @return calculateOnExit
  **/
  @ApiModelProperty(value = "True if references to the specified form field are automatically updated whenever the field is exited.")
  public Boolean isisCalculateOnExit() {
    return calculateOnExit;
  }

  public void setCalculateOnExit(Boolean calculateOnExit) {
    this.calculateOnExit = calculateOnExit;
  }

  public FormField enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * True if a form field is enabled.
   * @return enabled
  **/
  @ApiModelProperty(value = "True if a form field is enabled.")
  public Boolean isisEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public FormField entryMacro(String entryMacro) {
    this.entryMacro = entryMacro;
    return this;
  }

   /**
   * Returns or sets an entry macro name for the form field.
   * @return entryMacro
  **/
  @ApiModelProperty(value = "Returns or sets an entry macro name for the form field.")
  public String getEntryMacro() {
    return entryMacro;
  }

  public void setEntryMacro(String entryMacro) {
    this.entryMacro = entryMacro;
  }

  public FormField exitMacro(String exitMacro) {
    this.exitMacro = exitMacro;
    return this;
  }

   /**
   * Returns or sets an exit macro name for the form field.
   * @return exitMacro
  **/
  @ApiModelProperty(value = "Returns or sets an exit macro name for the form field.")
  public String getExitMacro() {
    return exitMacro;
  }

  public void setExitMacro(String exitMacro) {
    this.exitMacro = exitMacro;
  }

  public FormField helpText(String helpText) {
    this.helpText = helpText;
    return this;
  }

   /**
   * Returns or sets the text that&#39;s displayed in a message box when the form field has the focus and the user presses F1.
   * @return helpText
  **/
  @ApiModelProperty(value = "Returns or sets the text that's displayed in a message box when the form field has the focus and the user presses F1.")
  public String getHelpText() {
    return helpText;
  }

  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  public FormField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the form field name.
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the form field name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormField ownHelp(Boolean ownHelp) {
    this.ownHelp = ownHelp;
    return this;
  }

   /**
   * Specifies the source of the text that&#39;s displayed in a message box when a form field has the focus and the user presses F1.
   * @return ownHelp
  **/
  @ApiModelProperty(value = "Specifies the source of the text that's displayed in a message box when a form field has the focus and the user presses F1.")
  public Boolean isisOwnHelp() {
    return ownHelp;
  }

  public void setOwnHelp(Boolean ownHelp) {
    this.ownHelp = ownHelp;
  }

  public FormField ownStatus(Boolean ownStatus) {
    this.ownStatus = ownStatus;
    return this;
  }

   /**
   * Specifies the source of the text that&#39;s displayed in the status bar when a form field has the focus.
   * @return ownStatus
  **/
  @ApiModelProperty(value = "Specifies the source of the text that's displayed in the status bar when a form field has the focus.")
  public Boolean isisOwnStatus() {
    return ownStatus;
  }

  public void setOwnStatus(Boolean ownStatus) {
    this.ownStatus = ownStatus;
  }

  public FormField statusText(String statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * Returns or sets the text that&#39;s displayed in the status bar when a form field has the focus.
   * @return statusText
  **/
  @ApiModelProperty(value = "Returns or sets the text that's displayed in the status bar when a form field has the focus.")
  public String getStatusText() {
    return statusText;
  }

  public void setStatusText(String statusText) {
    this.statusText = statusText;
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
    return Objects.equals(this.calculateOnExit, formField.calculateOnExit) &&
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
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    calculateOnExit: ").append(toIndentedString(calculateOnExit)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    entryMacro: ").append(toIndentedString(entryMacro)).append("\n");
    sb.append("    exitMacro: ").append(toIndentedString(exitMacro)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownHelp: ").append(toIndentedString(ownHelp)).append("\n");
    sb.append("    ownStatus: ").append(toIndentedString(ownStatus)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
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

