/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PclSaveOptionsData.java">
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
 * Container class for pcl save options.
 */
@ApiModel(description = "Container class for pcl save options.")
public class PclSaveOptionsData extends FixedPageSaveOptionsData {
    @SerializedName("FalllbackFontName")
    protected String falllbackFontName;

    @SerializedName("RasterizeTransformedElements")
    protected Boolean rasterizeTransformedElements;
    /**
     * Gets or sets the font name, that will be used if no expected font is found in printer and built-in fonts collections.
     * If no fallback is found, "Arial" font is used.
    * @return falllbackFontName
    **/
    @ApiModelProperty(value = "Gets or sets the font name, that will be used if no expected font is found in printer and built-in fonts collections. If no fallback is found, \"Arial\" font is used.")
    public String getFalllbackFontName() {
        return falllbackFontName;
    }

    public PclSaveOptionsData falllbackFontName(String falllbackFontName) {
        this.falllbackFontName = falllbackFontName;
        return this;
    }

    public void setFalllbackFontName(String falllbackFontName) {
        this.falllbackFontName = falllbackFontName;
    }


    /**
     * Gets or sets a value indicating whether complex transformed elements should be rasterized before saving to PCL document.. The default value is true.
     * PCL doesn't support some kind of transformations that are used by Aspose Words.  E.g. rotated, skewed images and texture brushes. To properly render such elements rasterization process is used, i.e. saving to image and clipping.  This process can take additional time and memory.  If flag is set to false, some content in output may be different as compared with the source document.
    * @return rasterizeTransformedElements
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether complex transformed elements should be rasterized before saving to PCL document.. The default value is true. PCL doesn't support some kind of transformations that are used by Aspose Words.  E.g. rotated, skewed images and texture brushes. To properly render such elements rasterization process is used, i.e. saving to image and clipping.  This process can take additional time and memory.  If flag is set to false, some content in output may be different as compared with the source document.")
    public Boolean getRasterizeTransformedElements() {
        return rasterizeTransformedElements;
    }

    public PclSaveOptionsData rasterizeTransformedElements(Boolean rasterizeTransformedElements) {
        this.rasterizeTransformedElements = rasterizeTransformedElements;
        return this;
    }

    public void setRasterizeTransformedElements(Boolean rasterizeTransformedElements) {
        this.rasterizeTransformedElements = rasterizeTransformedElements;
    }


    public PclSaveOptionsData() {
        super();
        this.falllbackFontName = null;
        this.rasterizeTransformedElements = null;
        this.saveFormat = "pcl";
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
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PclSaveOptionsData pclSaveOptionsData = (PclSaveOptionsData) o;
        return
            Objects.equals(this.falllbackFontName, pclSaveOptionsData.falllbackFontName) &&
            Objects.equals(this.rasterizeTransformedElements, pclSaveOptionsData.rasterizeTransformedElements) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(falllbackFontName, rasterizeTransformedElements, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PclSaveOptionsData {\n");
    sb.append("    allowEmbeddingPostScriptFonts: ").append(toIndentedString(getAllowEmbeddingPostScriptFonts())).append("\n");
    sb.append("    customTimeZoneInfoData: ").append(toIndentedString(getCustomTimeZoneInfoData())).append("\n");
    sb.append("    dml3DEffectsRenderingMode: ").append(toIndentedString(getDml3DEffectsRenderingMode())).append("\n");
    sb.append("    dmlEffectsRenderingMode: ").append(toIndentedString(getDmlEffectsRenderingMode())).append("\n");
    sb.append("    dmlRenderingMode: ").append(toIndentedString(getDmlRenderingMode())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(getFileName())).append("\n");
    sb.append("    imlRenderingMode: ").append(toIndentedString(getImlRenderingMode())).append("\n");
    sb.append("    updateAmbiguousTextFont: ").append(toIndentedString(getUpdateAmbiguousTextFont())).append("\n");
    sb.append("    updateCreatedTimeProperty: ").append(toIndentedString(getUpdateCreatedTimeProperty())).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(getUpdateFields())).append("\n");
    sb.append("    updateLastPrintedProperty: ").append(toIndentedString(getUpdateLastPrintedProperty())).append("\n");
    sb.append("    updateLastSavedTimeProperty: ").append(toIndentedString(getUpdateLastSavedTimeProperty())).append("\n");
    sb.append("    zipOutput: ").append(toIndentedString(getZipOutput())).append("\n");
    sb.append("    colorMode: ").append(toIndentedString(getColorMode())).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(getJpegQuality())).append("\n");
    sb.append("    metafileRenderingOptions: ").append(toIndentedString(getMetafileRenderingOptions())).append("\n");
    sb.append("    numeralFormat: ").append(toIndentedString(getNumeralFormat())).append("\n");
    sb.append("    optimizeOutput: ").append(toIndentedString(getOptimizeOutput())).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(getPageCount())).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(getPageIndex())).append("\n");
    sb.append("    falllbackFontName: ").append(toIndentedString(getFalllbackFontName())).append("\n");
    sb.append("    rasterizeTransformedElements: ").append(toIndentedString(getRasterizeTransformedElements())).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
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
