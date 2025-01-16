/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WatermarkDataImage.java">
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
 * Class for insert watermark image request building.
 */
@ApiModel(description = "Class for insert watermark image request building.")
public class WatermarkDataImage extends WatermarkDataBase {
    @SerializedName("Image")
    protected FileReference image;

    @SerializedName("IsWashout")
    protected Boolean isWashout;

    @SerializedName("Scale")
    protected Double scale;
    /**
     * Gets or sets the watermark image.
    * @return image
    **/
    @ApiModelProperty(value = "Gets or sets the watermark image.")
    public FileReference getImage() {
        return image;
    }

    public WatermarkDataImage image(FileReference image) {
        this.image = image;
        return this;
    }

    public void setImage(FileReference image) {
        this.image = image;
    }


    /**
     * Gets or sets a boolean value which is responsible for washout effect of the watermark. The default value is true.
    * @return isWashout
    **/
    @ApiModelProperty(value = "Gets or sets a boolean value which is responsible for washout effect of the watermark. The default value is true.")
    public Boolean getIsWashout() {
        return isWashout;
    }

    public WatermarkDataImage isWashout(Boolean isWashout) {
        this.isWashout = isWashout;
        return this;
    }

    public void setIsWashout(Boolean isWashout) {
        this.isWashout = isWashout;
    }


    /**
     * Gets or sets the scale factor expressed as a fraction of the image. The default value is 0 - auto.
     * Valid values range from 0 to 65.5 inclusive. Auto scale means that the watermark will be scaled to its max width and max height relative to the page margins.
    * @return scale
    **/
    @ApiModelProperty(value = "Gets or sets the scale factor expressed as a fraction of the image. The default value is 0 - auto. Valid values range from 0 to 65.5 inclusive. Auto scale means that the watermark will be scaled to its max width and max height relative to the page margins.")
    public Double getScale() {
        return scale;
    }

    public WatermarkDataImage scale(Double scale) {
        this.scale = scale;
        return this;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }


    public WatermarkDataImage() {
        super();
        this.image = null;
        this.isWashout = null;
        this.scale = null;
    }

    /*
     * Gets files content.
     *
     * @param resultFilesContent List<FileReference> instance.
     */
    @Override
    public void getFilesContent(List<FileReference> resultFilesContent) {
        super.getFilesContent(resultFilesContent);
        if (this.image != null) {
            this.image.getFilesContent(resultFilesContent);
        }



    }

    /*
     * Validate required properties.
     *
     * @throws ApiException If fails to validate required properties.
     */
    @Override
    public void validate() throws ApiException {
        super.validate();
        if (this.image == null) {
            throw new ApiException(400, "Property Image in WatermarkDataImage is required.");
        }

        if (this.image != null) {
            this.image.validate();
        }



    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        WatermarkDataImage watermarkDataImage = (WatermarkDataImage) o;
        return
            Objects.equals(this.image, watermarkDataImage.image) &&
            Objects.equals(this.isWashout, watermarkDataImage.isWashout) &&
            Objects.equals(this.scale, watermarkDataImage.scale) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, isWashout, scale, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatermarkDataImage {\n");
    sb.append("    image: ").append(toIndentedString(getImage())).append("\n");
    sb.append("    isWashout: ").append(toIndentedString(getIsWashout())).append("\n");
    sb.append("    scale: ").append(toIndentedString(getScale())).append("\n");
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
