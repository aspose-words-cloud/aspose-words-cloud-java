/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AvailableFontsResponse.java">
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
 * The list of fonts, available for document processing.
 */
@ApiModel(description = "The list of fonts, available for document processing.")
public class AvailableFontsResponse extends WordsResponse {
    @SerializedName("AdditionalFonts")
    private List<FontInfo> additionalFonts = null;

    @SerializedName("CustomFonts")
    private List<FontInfo> customFonts = null;

    @SerializedName("SystemFonts")
    private List<FontInfo> systemFonts = null;
    public AvailableFontsResponse additionalFonts(List<FontInfo> additionalFonts) {
        this.additionalFonts = additionalFonts;
        return this;
    }

    public AvailableFontsResponse addAdditionalFontsItem(FontInfo additionalFontsItem) {
        if (this.additionalFonts == null) {
            this.additionalFonts = new ArrayList<FontInfo>();
        }
        this.additionalFonts.add(additionalFontsItem);
        return this;
    }

    /**
     * Gets or sets the list of addititional fonts, provided by aspose team.
    * @return additionalFonts
    **/
    @ApiModelProperty(value = "Gets or sets the list of addititional fonts, provided by aspose team.")
    public List<FontInfo> getAdditionalFonts() {
        return additionalFonts;
    }

    public void setAdditionalFonts(List<FontInfo> additionalFonts) {
        this.additionalFonts = additionalFonts;
    }

    public AvailableFontsResponse customFonts(List<FontInfo> customFonts) {
        this.customFonts = customFonts;
        return this;
    }

    public AvailableFontsResponse addCustomFontsItem(FontInfo customFontsItem) {
        if (this.customFonts == null) {
            this.customFonts = new ArrayList<FontInfo>();
        }
        this.customFonts.add(customFontsItem);
        return this;
    }

    /**
     * Gets or sets custom user fonts (from user file storage). To use them, you should specify "fontsLocation" parameter in any request.
    * @return customFonts
    **/
    @ApiModelProperty(value = "Gets or sets custom user fonts (from user file storage). To use them, you should specify \"fontsLocation\" parameter in any request.")
    public List<FontInfo> getCustomFonts() {
        return customFonts;
    }

    public void setCustomFonts(List<FontInfo> customFonts) {
        this.customFonts = customFonts;
    }

    public AvailableFontsResponse systemFonts(List<FontInfo> systemFonts) {
        this.systemFonts = systemFonts;
        return this;
    }

    public AvailableFontsResponse addSystemFontsItem(FontInfo systemFontsItem) {
        if (this.systemFonts == null) {
            this.systemFonts = new ArrayList<FontInfo>();
        }
        this.systemFonts.add(systemFontsItem);
        return this;
    }

    /**
     * Gets or sets the list of system fonts, availiable on the server.
    * @return systemFonts
    **/
    @ApiModelProperty(value = "Gets or sets the list of system fonts, availiable on the server.")
    public List<FontInfo> getSystemFonts() {
        return systemFonts;
    }

    public void setSystemFonts(List<FontInfo> systemFonts) {
        this.systemFonts = systemFonts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    AvailableFontsResponse availableFontsResponse = (AvailableFontsResponse)o;
    return
        Objects.equals(this.additionalFonts, availableFontsResponse.additionalFonts) &&
        Objects.equals(this.customFonts, availableFontsResponse.customFonts) &&
        Objects.equals(this.systemFonts, availableFontsResponse.systemFonts) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalFonts, customFonts, systemFonts, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableFontsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    additionalFonts: ").append(toIndentedString(additionalFonts)).append("\n");
    sb.append("    customFonts: ").append(toIndentedString(customFonts)).append("\n");
    sb.append("    systemFonts: ").append(toIndentedString(systemFonts)).append("\n");
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
