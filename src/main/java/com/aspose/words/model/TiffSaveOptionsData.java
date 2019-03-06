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
import com.aspose.words.cloud.model.GraphicsQualityOptionsData;
import com.aspose.words.cloud.model.ImageSaveOptionsData;
import com.aspose.words.cloud.model.MetafileRenderingOptionsData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Container class for tiff save options.
 */
@ApiModel(description = "Container class for tiff save options.")

public class TiffSaveOptionsData extends ImageSaveOptionsData {
  @SerializedName("TiffBinarizationMethod")
  private String tiffBinarizationMethod = null;

  @SerializedName("TiffCompression")
  private String tiffCompression = null;

  public TiffSaveOptionsData tiffBinarizationMethod(String tiffBinarizationMethod) {
    this.tiffBinarizationMethod = tiffBinarizationMethod;
    return this;
  }

   /**
   * Specifies method used while converting images to 1 bpp format.
   * @return tiffBinarizationMethod
  **/
  @ApiModelProperty(value = "Specifies method used while converting images to 1 bpp format.")
  public String getTiffBinarizationMethod() {
    return tiffBinarizationMethod;
  }

  public void setTiffBinarizationMethod(String tiffBinarizationMethod) {
    this.tiffBinarizationMethod = tiffBinarizationMethod;
  }

  public TiffSaveOptionsData tiffCompression(String tiffCompression) {
    this.tiffCompression = tiffCompression;
    return this;
  }

   /**
   * Type of compression.
   * @return tiffCompression
  **/
  @ApiModelProperty(value = "Type of compression.")
  public String getTiffCompression() {
    return tiffCompression;
  }

  public void setTiffCompression(String tiffCompression) {
    this.tiffCompression = tiffCompression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TiffSaveOptionsData tiffSaveOptionsData = (TiffSaveOptionsData) o;
    return Objects.equals(this.tiffBinarizationMethod, tiffSaveOptionsData.tiffBinarizationMethod) &&
        Objects.equals(this.tiffCompression, tiffSaveOptionsData.tiffCompression) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tiffBinarizationMethod, tiffCompression, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tiffBinarizationMethod: ").append(toIndentedString(tiffBinarizationMethod)).append("\n");
    sb.append("    tiffCompression: ").append(toIndentedString(tiffCompression)).append("\n");
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

