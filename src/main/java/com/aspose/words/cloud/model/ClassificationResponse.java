/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ClassificationResponse.java">
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
 * The REST response with data on multi-class text classification.
 * This response is returned by the Service when handling "PUT https://api.aspose.cloud/v4.0/words/classify" REST API requests.
 */
@ApiModel(description = "The REST response with data on multi-class text classification. This response is returned by the Service when handling \"PUT https://api.aspose.cloud/v4.0/words/classify\" REST API requests.")
public class ClassificationResponse extends WordsResponse {
    @SerializedName("BestClassName")
    protected String bestClassName;

    @SerializedName("BestClassProbability")
    protected Double bestClassProbability;

    @SerializedName("BestResults")
    protected List<ClassificationResult> bestResults;
    /**
     * Gets or sets the best class name.
    * @return bestClassName
    **/
    @ApiModelProperty(value = "Gets or sets the best class name.")
    public String getBestClassName() {
        return bestClassName;
    }

    public ClassificationResponse bestClassName(String bestClassName) {
        this.bestClassName = bestClassName;
        return this;
    }

    public void setBestClassName(String bestClassName) {
        this.bestClassName = bestClassName;
    }


    /**
     * Gets or sets the best class probability.
    * @return bestClassProbability
    **/
    @ApiModelProperty(value = "Gets or sets the best class probability.")
    public Double getBestClassProbability() {
        return bestClassProbability;
    }

    public ClassificationResponse bestClassProbability(Double bestClassProbability) {
        this.bestClassProbability = bestClassProbability;
        return this;
    }

    public void setBestClassProbability(Double bestClassProbability) {
        this.bestClassProbability = bestClassProbability;
    }


    /**
     * Gets or sets the array of best classes results.
    * @return bestResults
    **/
    @ApiModelProperty(value = "Gets or sets the array of best classes results.")
    public List<ClassificationResult> getBestResults() {
        return bestResults;
    }

    public ClassificationResponse bestResults(List<ClassificationResult> bestResults) {
        this.bestResults = bestResults;
        return this;
    }

    public ClassificationResponse addBestResultsItem(ClassificationResult bestResultsItem) {
        if (this.bestResults == null) {
            this.bestResults = new ArrayList<ClassificationResult>();
        }
        this.bestResults.add(bestResultsItem);
        return this;
    }


    public void setBestResults(List<ClassificationResult> bestResults) {
        this.bestResults = bestResults;
    }


    public ClassificationResponse() {
        super();
        this.bestClassName = null;
        this.bestClassProbability = null;
        this.bestResults = null;
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
        super.validate();
        if (this.bestClassProbability == null) {
            throw new ApiException(400, "Property BestClassProbability in ClassificationResponse is required.");
        }

        if (this.bestResults != null) {
            for (ModelIfc elementBestResults : this.bestResults) {
                if (elementBestResults != null) {
                    elementBestResults.validate();
                }
            }
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

        ClassificationResponse classificationResponse = (ClassificationResponse) o;
        return
            Objects.equals(this.bestClassName, classificationResponse.bestClassName) &&
            Objects.equals(this.bestClassProbability, classificationResponse.bestClassProbability) &&
            Objects.equals(this.bestResults, classificationResponse.bestResults) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bestClassName, bestClassProbability, bestResults, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(getRequestId())).append("\n");
    sb.append("    bestClassName: ").append(toIndentedString(getBestClassName())).append("\n");
    sb.append("    bestClassProbability: ").append(toIndentedString(getBestClassProbability())).append("\n");
    sb.append("    bestResults: ").append(toIndentedString(getBestResults())).append("\n");
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
