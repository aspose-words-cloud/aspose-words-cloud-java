/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="InfoResponse.java">
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
 * Response with API info.
 */
@ApiModel(description = "Response with API info.")
public class InfoResponse extends WordsResponse {
    @SerializedName("AdditionalInfo")
    protected List<InfoAdditionalItem> additionalInfo;

    @SerializedName("Name")
    protected String name;

    @SerializedName("Version")
    protected String version;
    /**
     * Gets or sets additional info.
    * @return additionalInfo
    **/
    @ApiModelProperty(value = "Gets or sets additional info.")
    public List<InfoAdditionalItem> getAdditionalInfo() {
        return additionalInfo;
    }

    public InfoResponse additionalInfo(List<InfoAdditionalItem> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public InfoResponse addAdditionalInfoItem(InfoAdditionalItem additionalInfoItem) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new ArrayList<InfoAdditionalItem>();
        }
        this.additionalInfo.add(additionalInfoItem);
        return this;
    }


    public void setAdditionalInfo(List<InfoAdditionalItem> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    /**
     * Gets or sets application name.
    * @return name
    **/
    @ApiModelProperty(value = "Gets or sets application name.")
    public String getName() {
        return name;
    }

    public InfoResponse name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets or sets version.
    * @return version
    **/
    @ApiModelProperty(value = "Gets or sets version.")
    public String getVersion() {
        return version;
    }

    public InfoResponse version(String version) {
        this.version = version;
        return this;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public InfoResponse() {
        super();
        this.additionalInfo = null;
        this.name = null;
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

        InfoResponse infoResponse = (InfoResponse) o;
        return
            Objects.equals(this.additionalInfo, infoResponse.additionalInfo) &&
            Objects.equals(this.name, infoResponse.name) &&
            Objects.equals(this.version, infoResponse.version) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, name, version, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(getRequestId())).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(getAdditionalInfo())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
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
