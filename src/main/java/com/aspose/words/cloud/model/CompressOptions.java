/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CompressOptions.java">
 *   Copyright (c) 2023 Aspose.Words for Cloud
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
 * Options of document compress.
 */
@ApiModel(description = "Options of document compress.")
public class CompressOptions implements ModelIfc {
    @SerializedName("ImagesQuality")
    protected Integer imagesQuality;

    @SerializedName("ImagesReduceSizeFactor")
    protected Integer imagesReduceSizeFactor;
    /**
     * Gets or sets the quality level of images from 0 to 100. Default value is 75.
    * @return imagesQuality
    **/
    @ApiModelProperty(value = "Gets or sets the quality level of images from 0 to 100. Default value is 75.")
    public Integer getImagesQuality() {
        return imagesQuality;
    }

    public CompressOptions imagesQuality(Integer imagesQuality) {
        this.imagesQuality = imagesQuality;
        return this;
    }

    public void setImagesQuality(Integer imagesQuality) {
        this.imagesQuality = imagesQuality;
    }


    /**
     * Gets or sets the resize factor of images.
     * This value determines how many times the size of the images in the document will be reduced.
     * The parameter value must be greater than 1 for resizing. Default value is 1 and has no effect on images size.
    * @return imagesReduceSizeFactor
    **/
    @ApiModelProperty(value = "Gets or sets the resize factor of images. This value determines how many times the size of the images in the document will be reduced. The parameter value must be greater than 1 for resizing. Default value is 1 and has no effect on images size.")
    public Integer getImagesReduceSizeFactor() {
        return imagesReduceSizeFactor;
    }

    public CompressOptions imagesReduceSizeFactor(Integer imagesReduceSizeFactor) {
        this.imagesReduceSizeFactor = imagesReduceSizeFactor;
        return this;
    }

    public void setImagesReduceSizeFactor(Integer imagesReduceSizeFactor) {
        this.imagesReduceSizeFactor = imagesReduceSizeFactor;
    }


    public CompressOptions() {
        this.imagesQuality = null;
        this.imagesReduceSizeFactor = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CompressOptions compressOptions = (CompressOptions) o;
        return
            Objects.equals(this.imagesQuality, compressOptions.imagesQuality) &&
            Objects.equals(this.imagesReduceSizeFactor, compressOptions.imagesReduceSizeFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imagesQuality, imagesReduceSizeFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompressOptions {\n");
    sb.append("    imagesQuality: ").append(toIndentedString(getImagesQuality())).append("\n");
    sb.append("    imagesReduceSizeFactor: ").append(toIndentedString(getImagesReduceSizeFactor())).append("\n");
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
