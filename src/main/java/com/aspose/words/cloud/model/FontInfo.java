/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FontInfo.java">
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
 * DTO container with font info.
 */
@ApiModel(description = "DTO container with font info.")
public class FontInfo {
    @SerializedName("FilePath")
    protected String filePath;

    @SerializedName("FontFamilyName")
    protected String fontFamilyName;

    @SerializedName("FullFontName")
    protected String fullFontName;

    @SerializedName("Version")
    protected String version;
    /**
     * Gets or sets the path to the font file if any.
    * @return filePath
    **/
    @ApiModelProperty(value = "Gets or sets the path to the font file if any.")
    public String getFilePath() {
        return filePath;
    }

    public FontInfo filePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


    /**
     * Gets or sets the family name of the font.
    * @return fontFamilyName
    **/
    @ApiModelProperty(value = "Gets or sets the family name of the font.")
    public String getFontFamilyName() {
        return fontFamilyName;
    }

    public FontInfo fontFamilyName(String fontFamilyName) {
        this.fontFamilyName = fontFamilyName;
        return this;
    }

    public void setFontFamilyName(String fontFamilyName) {
        this.fontFamilyName = fontFamilyName;
    }


    /**
     * Gets or sets the full name of the font.
    * @return fullFontName
    **/
    @ApiModelProperty(value = "Gets or sets the full name of the font.")
    public String getFullFontName() {
        return fullFontName;
    }

    public FontInfo fullFontName(String fullFontName) {
        this.fullFontName = fullFontName;
        return this;
    }

    public void setFullFontName(String fullFontName) {
        this.fullFontName = fullFontName;
    }


    /**
     * Gets or sets the version string of the font.
    * @return version
    **/
    @ApiModelProperty(value = "Gets or sets the version string of the font.")
    public String getVersion() {
        return version;
    }

    public FontInfo version(String version) {
        this.version = version;
        return this;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public FontInfo() {
        this.filePath = null;
        this.fontFamilyName = null;
        this.fullFontName = null;
        this.version = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FontInfo fontInfo = (FontInfo) o;
        return
            Objects.equals(this.filePath, fontInfo.filePath) &&
            Objects.equals(this.fontFamilyName, fontInfo.fontFamilyName) &&
            Objects.equals(this.fullFontName, fontInfo.fullFontName) &&
            Objects.equals(this.version, fontInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, fontFamilyName, fullFontName, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FontInfo {\n");
    sb.append("    filePath: ").append(toIndentedString(getFilePath())).append("\n");
    sb.append("    fontFamilyName: ").append(toIndentedString(getFontFamilyName())).append("\n");
    sb.append("    fullFontName: ").append(toIndentedString(getFullFontName())).append("\n");
    sb.append("    version: ").append(toIndentedString(getVersion())).append("\n");
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
