/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FixedPageSaveOptionsData.java">
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
 * Contains common options that can be specified when saving a document into fixed page formats (PDF, XPS, images etc).
 */
@ApiModel(description = "Contains common options that can be specified when saving a document into fixed page formats (PDF, XPS, images etc).")
public class FixedPageSaveOptionsData extends SaveOptionsData {
    @SerializedName("ColorMode")
    private String colorMode = null;

    @SerializedName("JpegQuality")
    private Integer jpegQuality = null;

    @SerializedName("MetafileRenderingOptions")
    private MetafileRenderingOptionsData metafileRenderingOptions = null;

    @SerializedName("NumeralFormat")
    private String numeralFormat = null;

    @SerializedName("OptimizeOutput")
    private Boolean optimizeOutput = null;

    @SerializedName("PageCount")
    private Integer pageCount = null;

    @SerializedName("PageIndex")
    private Integer pageIndex = null;
    public FixedPageSaveOptionsData colorMode(String colorMode) {
        this.colorMode = colorMode;
        return this;
    }

    /**
     * Gets or sets the value determining how colors are rendered.
     * { Normal | Grayscale}.
    * @return colorMode
    **/
    @ApiModelProperty(value = "Gets or sets the value determining how colors are rendered. { Normal | Grayscale}.")
    public String getColorMode() {
        return colorMode;
    }

    public void setColorMode(String colorMode) {
        this.colorMode = colorMode;
    }

    public FixedPageSaveOptionsData jpegQuality(Integer jpegQuality) {
        this.jpegQuality = jpegQuality;
        return this;
    }

    /**
     * Gets or sets the quality of the JPEG images inside PDF document.
    * @return jpegQuality
    **/
    @ApiModelProperty(value = "Gets or sets the quality of the JPEG images inside PDF document.")
    public Integer getJpegQuality() {
        return jpegQuality;
    }

    public void setJpegQuality(Integer jpegQuality) {
        this.jpegQuality = jpegQuality;
    }

    public FixedPageSaveOptionsData metafileRenderingOptions(MetafileRenderingOptionsData metafileRenderingOptions) {
        this.metafileRenderingOptions = metafileRenderingOptions;
        return this;
    }

    /**
     * Gets or sets the metafile rendering options.
    * @return metafileRenderingOptions
    **/
    @ApiModelProperty(value = "Gets or sets the metafile rendering options.")
    public MetafileRenderingOptionsData getMetafileRenderingOptions() {
        return metafileRenderingOptions;
    }

    public void setMetafileRenderingOptions(MetafileRenderingOptionsData metafileRenderingOptions) {
        this.metafileRenderingOptions = metafileRenderingOptions;
    }

    public FixedPageSaveOptionsData numeralFormat(String numeralFormat) {
        this.numeralFormat = numeralFormat;
        return this;
    }

    /**
     * Gets or sets the symbol set, that is used to represent numbers while rendering to fixed page formats.
    * @return numeralFormat
    **/
    @ApiModelProperty(value = "Gets or sets the symbol set, that is used to represent numbers while rendering to fixed page formats.")
    public String getNumeralFormat() {
        return numeralFormat;
    }

    public void setNumeralFormat(String numeralFormat) {
        this.numeralFormat = numeralFormat;
    }

    public FixedPageSaveOptionsData optimizeOutput(Boolean optimizeOutput) {
        this.optimizeOutput = optimizeOutput;
        return this;
    }

    /**
     * Gets or sets a value indicating whether it is required to optimize output of XPS.
     * If this flag is set redundant nested canvases and empty canvases are removed, also neighbor glyphs with the same formatting are concatenated.
     * Note: The accuracy of the content display may be affected if this property is set to true.. The default value is false.
    * @return optimizeOutput
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether it is required to optimize output of XPS. If this flag is set redundant nested canvases and empty canvases are removed, also neighbor glyphs with the same formatting are concatenated. Note: The accuracy of the content display may be affected if this property is set to true.. The default value is false.")
    public Boolean getOptimizeOutput() {
        return optimizeOutput;
    }

    public void setOptimizeOutput(Boolean optimizeOutput) {
        this.optimizeOutput = optimizeOutput;
    }

    public FixedPageSaveOptionsData pageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    /**
     * Gets or sets the number of pages to render.
    * @return pageCount
    **/
    @ApiModelProperty(value = "Gets or sets the number of pages to render.")
    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public FixedPageSaveOptionsData pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * Gets or sets the 0-based index of the first page to render.
    * @return pageIndex
    **/
    @ApiModelProperty(value = "Gets or sets the 0-based index of the first page to render.")
    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FixedPageSaveOptionsData fixedPageSaveOptionsData = (FixedPageSaveOptionsData) o;
        return
            Objects.equals(this.colorMode, fixedPageSaveOptionsData.colorMode) &&
            Objects.equals(this.jpegQuality, fixedPageSaveOptionsData.jpegQuality) &&
            Objects.equals(this.metafileRenderingOptions, fixedPageSaveOptionsData.metafileRenderingOptions) &&
            Objects.equals(this.numeralFormat, fixedPageSaveOptionsData.numeralFormat) &&
            Objects.equals(this.optimizeOutput, fixedPageSaveOptionsData.optimizeOutput) &&
            Objects.equals(this.pageCount, fixedPageSaveOptionsData.pageCount) &&
            Objects.equals(this.pageIndex, fixedPageSaveOptionsData.pageIndex) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorMode, jpegQuality, metafileRenderingOptions, numeralFormat, optimizeOutput, pageCount, pageIndex, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedPageSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    colorMode: ").append(toIndentedString(colorMode)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    metafileRenderingOptions: ").append(toIndentedString(metafileRenderingOptions)).append("\n");
    sb.append("    numeralFormat: ").append(toIndentedString(numeralFormat)).append("\n");
    sb.append("    optimizeOutput: ").append(toIndentedString(optimizeOutput)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
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
