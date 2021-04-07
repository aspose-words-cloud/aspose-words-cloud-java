/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DocSaveOptionsData.java">
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
 * Container class for doc/dot save options.
 */
@ApiModel(description = "Container class for doc/dot save options.")
public class DocSaveOptionsData extends SaveOptionsData {
    @SerializedName("AlwaysCompressMetafiles")
    private Boolean alwaysCompressMetafiles = null;

    @SerializedName("Password")
    private String password = null;

    @SerializedName("SavePictureBullet")
    private Boolean savePictureBullet = null;

    @SerializedName("SaveRoutingSlip")
    private Boolean saveRoutingSlip = null;
    public DocSaveOptionsData alwaysCompressMetafiles(Boolean alwaysCompressMetafiles) {
        this.alwaysCompressMetafiles = alwaysCompressMetafiles;
        return this;
    }

    /**
     * Gets or sets a value indicating when False, that small metafiles are not compressed for performance reason.
     * The default value is true, all metafiles are compressed regardless of its size.
    * @return alwaysCompressMetafiles
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating when False, that small metafiles are not compressed for performance reason. The default value is true, all metafiles are compressed regardless of its size.")
    public Boolean getAlwaysCompressMetafiles() {
        return alwaysCompressMetafiles;
    }

    public void setAlwaysCompressMetafiles(Boolean alwaysCompressMetafiles) {
        this.alwaysCompressMetafiles = alwaysCompressMetafiles;
    }

    public DocSaveOptionsData password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Gets or sets the password.
    * @return password
    **/
    @ApiModelProperty(value = "Gets or sets the password.")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DocSaveOptionsData savePictureBullet(Boolean savePictureBullet) {
        this.savePictureBullet = savePictureBullet;
        return this;
    }

    /**
     * Gets or sets a value indicating when False, that PictureBullet data is not saved to the output document.
     * The default value is true.
    * @return savePictureBullet
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating when False, that PictureBullet data is not saved to the output document. The default value is true.")
    public Boolean getSavePictureBullet() {
        return savePictureBullet;
    }

    public void setSavePictureBullet(Boolean savePictureBullet) {
        this.savePictureBullet = savePictureBullet;
    }

    public DocSaveOptionsData saveRoutingSlip(Boolean saveRoutingSlip) {
        this.saveRoutingSlip = saveRoutingSlip;
        return this;
    }

    /**
     * Gets or sets a value indicating whether to save RoutingSlip data to output document.
    * @return saveRoutingSlip
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether to save RoutingSlip data to output document.")
    public Boolean getSaveRoutingSlip() {
        return saveRoutingSlip;
    }

    public void setSaveRoutingSlip(Boolean saveRoutingSlip) {
        this.saveRoutingSlip = saveRoutingSlip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DocSaveOptionsData docSaveOptionsData = (DocSaveOptionsData) o;
        return
            Objects.equals(this.alwaysCompressMetafiles, docSaveOptionsData.alwaysCompressMetafiles) &&
            Objects.equals(this.password, docSaveOptionsData.password) &&
            Objects.equals(this.savePictureBullet, docSaveOptionsData.savePictureBullet) &&
            Objects.equals(this.saveRoutingSlip, docSaveOptionsData.saveRoutingSlip) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alwaysCompressMetafiles, password, savePictureBullet, saveRoutingSlip, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocSaveOptionsData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    alwaysCompressMetafiles: ").append(toIndentedString(alwaysCompressMetafiles)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    savePictureBullet: ").append(toIndentedString(savePictureBullet)).append("\n");
    sb.append("    saveRoutingSlip: ").append(toIndentedString(saveRoutingSlip)).append("\n");
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
