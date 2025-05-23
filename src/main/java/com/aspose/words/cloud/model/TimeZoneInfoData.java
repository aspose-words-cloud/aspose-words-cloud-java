/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TimeZoneInfoData.java">
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
 * Class to specify TimeZoneInfo parameters.
 */
@ApiModel(description = "Class to specify TimeZoneInfo parameters.")
public class TimeZoneInfoData implements ModelIfc {
    @SerializedName("BaseUtcOffset")
    protected String baseUtcOffset;

    @SerializedName("DisplayName")
    protected String displayName;

    @SerializedName("Id")
    protected String id;

    @SerializedName("StandardDisplayName")
    protected String standardDisplayName;
    /**
     * Gets or sets base utc offset in hh:mm:ss format.
    * @return baseUtcOffset
    **/
    @ApiModelProperty(value = "Gets or sets base utc offset in hh:mm:ss format.")
    public String getBaseUtcOffset() {
        return baseUtcOffset;
    }

    public TimeZoneInfoData baseUtcOffset(String baseUtcOffset) {
        this.baseUtcOffset = baseUtcOffset;
        return this;
    }

    public void setBaseUtcOffset(String baseUtcOffset) {
        this.baseUtcOffset = baseUtcOffset;
    }


    /**
     * Gets or sets display name.
    * @return displayName
    **/
    @ApiModelProperty(value = "Gets or sets display name.")
    public String getDisplayName() {
        return displayName;
    }

    public TimeZoneInfoData displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets or sets an Id string for CustomTimeZoneInfo.
    * @return id
    **/
    @ApiModelProperty(value = "Gets or sets an Id string for CustomTimeZoneInfo.")
    public String getId() {
        return id;
    }

    public TimeZoneInfoData id(String id) {
        this.id = id;
        return this;
    }

    public void setId(String id) {
        this.id = id;
    }


    /**
     * Gets or sets standard display name.
    * @return standardDisplayName
    **/
    @ApiModelProperty(value = "Gets or sets standard display name.")
    public String getStandardDisplayName() {
        return standardDisplayName;
    }

    public TimeZoneInfoData standardDisplayName(String standardDisplayName) {
        this.standardDisplayName = standardDisplayName;
        return this;
    }

    public void setStandardDisplayName(String standardDisplayName) {
        this.standardDisplayName = standardDisplayName;
    }


    public TimeZoneInfoData() {
        this.baseUtcOffset = null;
        this.displayName = null;
        this.id = null;
        this.standardDisplayName = null;
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
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TimeZoneInfoData timeZoneInfoData = (TimeZoneInfoData) o;
        return
            Objects.equals(this.baseUtcOffset, timeZoneInfoData.baseUtcOffset) &&
            Objects.equals(this.displayName, timeZoneInfoData.displayName) &&
            Objects.equals(this.id, timeZoneInfoData.id) &&
            Objects.equals(this.standardDisplayName, timeZoneInfoData.standardDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUtcOffset, displayName, id, standardDisplayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeZoneInfoData {\n");
    sb.append("    baseUtcOffset: ").append(toIndentedString(getBaseUtcOffset())).append("\n");
    sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    standardDisplayName: ").append(toIndentedString(getStandardDisplayName())).append("\n");
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
