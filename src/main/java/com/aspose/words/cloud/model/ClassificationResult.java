/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ClassificationResult.java">
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
 * Represents a single classification result.
 */
@ApiModel(description = "Represents a single classification result.")
public class ClassificationResult implements ModelIfc {
    @SerializedName("ClassName")
    protected String className;

    @SerializedName("ClassProbability")
    protected Double classProbability;
    /**
     * Gets or sets the name of the class.
    * @return className
    **/
    @ApiModelProperty(value = "Gets or sets the name of the class.")
    public String getClassName() {
        return className;
    }

    public ClassificationResult className(String className) {
        this.className = className;
        return this;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    /**
     * Gets or sets the probability of class.
    * @return classProbability
    **/
    @ApiModelProperty(value = "Gets or sets the probability of class.")
    public Double getClassProbability() {
        return classProbability;
    }

    public ClassificationResult classProbability(Double classProbability) {
        this.classProbability = classProbability;
        return this;
    }

    public void setClassProbability(Double classProbability) {
        this.classProbability = classProbability;
    }


    public ClassificationResult() {
        this.className = null;
        this.classProbability = null;
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
        if (this.classProbability == null) {
            throw new ApiException(400, "Property ClassProbability in ClassificationResult is required.");
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

        ClassificationResult classificationResult = (ClassificationResult) o;
        return
            Objects.equals(this.className, classificationResult.className) &&
            Objects.equals(this.classProbability, classificationResult.classProbability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, classProbability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationResult {\n");
    sb.append("    className: ").append(toIndentedString(getClassName())).append("\n");
    sb.append("    classProbability: ").append(toIndentedString(getClassProbability())).append("\n");
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
