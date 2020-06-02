/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PclSaveOptionsData.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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
 * Container class for pcl save options.
 */
@ApiModel(description = "Container class for pcl save options.")
public class PclSaveOptionsData extends FixedPageSaveOptionsData {
    @SerializedName("FalllbackFontName")
    private String falllbackFontName = null;

    @SerializedName("RasterizeTransformedElements")
    private Boolean rasterizeTransformedElements = null;
    public PclSaveOptionsData falllbackFontName(String falllbackFontName) {
        this.falllbackFontName = falllbackFontName;
        return this;
    }

    /**
     * Gets or sets name of the font that will be used if no expected font is found in printer and built-in fonts collections.
    * @return falllbackFontName
    **/
    @ApiModelProperty(value = "Gets or sets name of the font that will be used if no expected font is found in printer and built-in fonts collections.")
    public String getFalllbackFontName() {
        return falllbackFontName;
    }

    public void setFalllbackFontName(String falllbackFontName) {
        this.falllbackFontName = falllbackFontName;
    }

    public PclSaveOptionsData rasterizeTransformedElements(Boolean rasterizeTransformedElements) {
        this.rasterizeTransformedElements = rasterizeTransformedElements;
        return this;
    }

    /**
     * Gets or sets a value determining whether or not complex transformed elements should be rasterized before saving to PCL document.  Default is true.
    * @return rasterizeTransformedElements
    **/
    @ApiModelProperty(value = "Gets or sets a value determining whether or not complex transformed elements should be rasterized before saving to PCL document.  Default is true.")
    public Boolean getRasterizeTransformedElements() {
        return rasterizeTransformedElements;
    }

    public void setRasterizeTransformedElements(Boolean rasterizeTransformedElements) {
        this.rasterizeTransformedElements = rasterizeTransformedElements;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    PclSaveOptionsData pclSaveOptionsData = (PclSaveOptionsData)o;
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
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    falllbackFontName: ").append(toIndentedString(falllbackFontName)).append("\n");
    sb.append("    rasterizeTransformedElements: ").append(toIndentedString(rasterizeTransformedElements)).append("\n");
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
