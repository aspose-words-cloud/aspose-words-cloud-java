/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RtfSaveOptionsData.java">
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
 * Container class for rtf save options.
 */
@ApiModel(description = "Container class for rtf save options.")
public class RtfSaveOptionsData extends SaveOptionsData {
    @SerializedName("ExportCompactSize")
    protected Boolean exportCompactSize;

    @SerializedName("ExportImagesForOldReaders")
    protected Boolean exportImagesForOldReaders;

    @SerializedName("PrettyFormat")
    protected Boolean prettyFormat;

    @SerializedName("SaveImagesAsWmf")
    protected Boolean saveImagesAsWmf;
    /**
     * Gets or sets a value indicating whether to make output RTF documents smaller in size, but if they contain RTL (right-to-left) text, it will not be displayed correctly.
    * @return exportCompactSize
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to make output RTF documents smaller in size, but if they contain RTL (right-to-left) text, it will not be displayed correctly.")
    public Boolean getExportCompactSize() {
        return exportCompactSize;
    }

    public RtfSaveOptionsData exportCompactSize(Boolean exportCompactSize) {
        this.exportCompactSize = exportCompactSize;
        return this;
    }

    public void setExportCompactSize(Boolean exportCompactSize) {
        this.exportCompactSize = exportCompactSize;
    }


    /**
     * Gets or sets a value indicating whether the keywords for "old readers" are written to RTF or not.
    * @return exportImagesForOldReaders
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether the keywords for \"old readers\" are written to RTF or not.")
    public Boolean getExportImagesForOldReaders() {
        return exportImagesForOldReaders;
    }

    public RtfSaveOptionsData exportImagesForOldReaders(Boolean exportImagesForOldReaders) {
        this.exportImagesForOldReaders = exportImagesForOldReaders;
        return this;
    }

    public void setExportImagesForOldReaders(Boolean exportImagesForOldReaders) {
        this.exportImagesForOldReaders = exportImagesForOldReaders;
    }


    /**
     * Gets or sets a value indicating whether to use pretty formats output.
    * @return prettyFormat
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to use pretty formats output.")
    public Boolean getPrettyFormat() {
        return prettyFormat;
    }

    public RtfSaveOptionsData prettyFormat(Boolean prettyFormat) {
        this.prettyFormat = prettyFormat;
        return this;
    }

    public void setPrettyFormat(Boolean prettyFormat) {
        this.prettyFormat = prettyFormat;
    }


    /**
     * Gets or sets a value indicating whether when true all images will be saved as WMF. This option might help to avoid WordPad warning messages.
    * @return saveImagesAsWmf
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether when true all images will be saved as WMF. This option might help to avoid WordPad warning messages.")
    public Boolean getSaveImagesAsWmf() {
        return saveImagesAsWmf;
    }

    public RtfSaveOptionsData saveImagesAsWmf(Boolean saveImagesAsWmf) {
        this.saveImagesAsWmf = saveImagesAsWmf;
        return this;
    }

    public void setSaveImagesAsWmf(Boolean saveImagesAsWmf) {
        this.saveImagesAsWmf = saveImagesAsWmf;
    }


    public RtfSaveOptionsData() {
        super();
        this.exportCompactSize = null;
        this.exportImagesForOldReaders = null;
        this.prettyFormat = null;
        this.saveFormat = "rtf";
        this.saveImagesAsWmf = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RtfSaveOptionsData rtfSaveOptionsData = (RtfSaveOptionsData) o;
        return
            Objects.equals(this.exportCompactSize, rtfSaveOptionsData.exportCompactSize) &&
            Objects.equals(this.exportImagesForOldReaders, rtfSaveOptionsData.exportImagesForOldReaders) &&
            Objects.equals(this.prettyFormat, rtfSaveOptionsData.prettyFormat) &&
            Objects.equals(this.saveImagesAsWmf, rtfSaveOptionsData.saveImagesAsWmf) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportCompactSize, exportImagesForOldReaders, prettyFormat, saveImagesAsWmf, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RtfSaveOptionsData {\n");
    sb.append("    allowEmbeddingPostScriptFonts: ").append(toIndentedString(getAllowEmbeddingPostScriptFonts())).append("\n");
    sb.append("    customTimeZoneInfoData: ").append(toIndentedString(getCustomTimeZoneInfoData())).append("\n");
    sb.append("    dml3DEffectsRenderingMode: ").append(toIndentedString(getDml3DEffectsRenderingMode())).append("\n");
    sb.append("    dmlEffectsRenderingMode: ").append(toIndentedString(getDmlEffectsRenderingMode())).append("\n");
    sb.append("    dmlRenderingMode: ").append(toIndentedString(getDmlRenderingMode())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(getFileName())).append("\n");
    sb.append("    flatOpcXmlMappingOnly: ").append(toIndentedString(getFlatOpcXmlMappingOnly())).append("\n");
    sb.append("    imlRenderingMode: ").append(toIndentedString(getImlRenderingMode())).append("\n");
    sb.append("    updateCreatedTimeProperty: ").append(toIndentedString(getUpdateCreatedTimeProperty())).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(getUpdateFields())).append("\n");
    sb.append("    updateLastPrintedProperty: ").append(toIndentedString(getUpdateLastPrintedProperty())).append("\n");
    sb.append("    updateLastSavedTimeProperty: ").append(toIndentedString(getUpdateLastSavedTimeProperty())).append("\n");
    sb.append("    updateSdtContent: ").append(toIndentedString(getUpdateSdtContent())).append("\n");
    sb.append("    zipOutput: ").append(toIndentedString(getZipOutput())).append("\n");
    sb.append("    exportCompactSize: ").append(toIndentedString(getExportCompactSize())).append("\n");
    sb.append("    exportImagesForOldReaders: ").append(toIndentedString(getExportImagesForOldReaders())).append("\n");
    sb.append("    prettyFormat: ").append(toIndentedString(getPrettyFormat())).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
    sb.append("    saveImagesAsWmf: ").append(toIndentedString(getSaveImagesAsWmf())).append("\n");
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
