/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Revision.java">
 *   Copyright (c) 2026 Aspose.Words for Cloud
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
 * Revision Dto.
 */
@ApiModel(description = "Revision Dto.")
public class Revision implements ModelIfc {
    @SerializedName("RevisionAuthor")
    protected String revisionAuthor;

    @SerializedName("RevisionDateTime")
    protected OffsetDateTime revisionDateTime;

    @SerializedName("RevisionText")
    protected String revisionText;

    @SerializedName("RevisionType")
    protected String revisionType;
    /**
     * Gets or sets the revision author.
    * @return revisionAuthor
    **/
    @ApiModelProperty(value = "Gets or sets the revision author.")
    public String getRevisionAuthor() {
        return revisionAuthor;
    }

    public Revision revisionAuthor(String revisionAuthor) {
        this.revisionAuthor = revisionAuthor;
        return this;
    }

    public void setRevisionAuthor(String revisionAuthor) {
        this.revisionAuthor = revisionAuthor;
    }


    /**
     * Gets or sets the revision date time.
    * @return revisionDateTime
    **/
    @ApiModelProperty(value = "Gets or sets the revision date time.")
    public OffsetDateTime getRevisionDateTime() {
        return revisionDateTime;
    }

    public Revision revisionDateTime(OffsetDateTime revisionDateTime) {
        this.revisionDateTime = revisionDateTime;
        return this;
    }

    public void setRevisionDateTime(OffsetDateTime revisionDateTime) {
        this.revisionDateTime = revisionDateTime;
    }


    /**
     * Gets or sets the revision text.
    * @return revisionText
    **/
    @ApiModelProperty(value = "Gets or sets the revision text.")
    public String getRevisionText() {
        return revisionText;
    }

    public Revision revisionText(String revisionText) {
        this.revisionText = revisionText;
        return this;
    }

    public void setRevisionText(String revisionText) {
        this.revisionText = revisionText;
    }


    /**
     * Gets or sets the revision type.
    * @return revisionType
    **/
    @ApiModelProperty(value = "Gets or sets the revision type.")
    public String getRevisionType() {
        return revisionType;
    }

    public Revision revisionType(String revisionType) {
        this.revisionType = revisionType;
        return this;
    }

    public void setRevisionType(String revisionType) {
        this.revisionType = revisionType;
    }


    public Revision() {
        this.revisionAuthor = null;
        this.revisionDateTime = null;
        this.revisionText = null;
        this.revisionType = null;
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
        if (this.revisionDateTime == null) {
            throw new ApiException(400, "Property RevisionDateTime in Revision is required.");
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

        Revision revision = (Revision) o;
        return
            Objects.equals(this.revisionAuthor, revision.revisionAuthor) &&
            Objects.equals(this.revisionDateTime, revision.revisionDateTime) &&
            Objects.equals(this.revisionText, revision.revisionText) &&
            Objects.equals(this.revisionType, revision.revisionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revisionAuthor, revisionDateTime, revisionText, revisionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Revision {\n");
    sb.append("    revisionAuthor: ").append(toIndentedString(getRevisionAuthor())).append("\n");
    sb.append("    revisionDateTime: ").append(toIndentedString(getRevisionDateTime())).append("\n");
    sb.append("    revisionText: ").append(toIndentedString(getRevisionText())).append("\n");
    sb.append("    revisionType: ").append(toIndentedString(getRevisionType())).append("\n");
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
