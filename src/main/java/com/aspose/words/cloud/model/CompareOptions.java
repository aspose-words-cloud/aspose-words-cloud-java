/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CompareOptions.java">
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
 * DTO container with compare documents options.
 */
@ApiModel(description = "DTO container with compare documents options.")
public class CompareOptions {
    /**
     * Gets or sets the option that controls which document shall be used as a target during comparison.
     */
    @JsonAdapter(TargetEnum.Adapter.class)
    public enum TargetEnum {
        CURRENT("Current"),
        NEW("New");

        private String value;

        TargetEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TargetEnum fromValue(String text) {
            for (TargetEnum b : TargetEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TargetEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TargetEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TargetEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TargetEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("AcceptAllRevisionsBeforeComparison")
    protected Boolean acceptAllRevisionsBeforeComparison;

    @SerializedName("IgnoreCaseChanges")
    protected Boolean ignoreCaseChanges;

    @SerializedName("IgnoreComments")
    protected Boolean ignoreComments;

    @SerializedName("IgnoreFields")
    protected Boolean ignoreFields;

    @SerializedName("IgnoreFootnotes")
    protected Boolean ignoreFootnotes;

    @SerializedName("IgnoreFormatting")
    protected Boolean ignoreFormatting;

    @SerializedName("IgnoreHeadersAndFooters")
    protected Boolean ignoreHeadersAndFooters;

    @SerializedName("IgnoreTables")
    protected Boolean ignoreTables;

    @SerializedName("IgnoreTextboxes")
    protected Boolean ignoreTextboxes;

    @SerializedName("Target")
    protected TargetEnum target;
    /**
     * Gets or sets whether accept revisions before comparison or not.
    * @return acceptAllRevisionsBeforeComparison
    **/
    @ApiModelProperty(value = "Gets or sets whether accept revisions before comparison or not.")
    public Boolean getAcceptAllRevisionsBeforeComparison() {
        return acceptAllRevisionsBeforeComparison;
    }

    public CompareOptions acceptAllRevisionsBeforeComparison(Boolean acceptAllRevisionsBeforeComparison) {
        this.acceptAllRevisionsBeforeComparison = acceptAllRevisionsBeforeComparison;
        return this;
    }

    public void setAcceptAllRevisionsBeforeComparison(Boolean acceptAllRevisionsBeforeComparison) {
        this.acceptAllRevisionsBeforeComparison = acceptAllRevisionsBeforeComparison;
    }


    /**
     * Gets or sets a value indicating whether documents comparison is case insensitive. By default comparison is case sensitive.
    * @return ignoreCaseChanges
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether documents comparison is case insensitive. By default comparison is case sensitive.")
    public Boolean getIgnoreCaseChanges() {
        return ignoreCaseChanges;
    }

    public CompareOptions ignoreCaseChanges(Boolean ignoreCaseChanges) {
        this.ignoreCaseChanges = ignoreCaseChanges;
        return this;
    }

    public void setIgnoreCaseChanges(Boolean ignoreCaseChanges) {
        this.ignoreCaseChanges = ignoreCaseChanges;
    }


    /**
     * Gets or sets a value indicating whether comments content is ignored. By default comments are not ignored.
    * @return ignoreComments
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether comments content is ignored. By default comments are not ignored.")
    public Boolean getIgnoreComments() {
        return ignoreComments;
    }

    public CompareOptions ignoreComments(Boolean ignoreComments) {
        this.ignoreComments = ignoreComments;
        return this;
    }

    public void setIgnoreComments(Boolean ignoreComments) {
        this.ignoreComments = ignoreComments;
    }


    /**
     * Gets or sets a value indicating whether fields content is ignored. By default fields are not ignored.
    * @return ignoreFields
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether fields content is ignored. By default fields are not ignored.")
    public Boolean getIgnoreFields() {
        return ignoreFields;
    }

    public CompareOptions ignoreFields(Boolean ignoreFields) {
        this.ignoreFields = ignoreFields;
        return this;
    }

    public void setIgnoreFields(Boolean ignoreFields) {
        this.ignoreFields = ignoreFields;
    }


    /**
     * Gets or sets a value indicating whether footnotes/endnotes content is ignored. By default footnotes/endnotes are not ignored.
    * @return ignoreFootnotes
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether footnotes/endnotes content is ignored. By default footnotes/endnotes are not ignored.")
    public Boolean getIgnoreFootnotes() {
        return ignoreFootnotes;
    }

    public CompareOptions ignoreFootnotes(Boolean ignoreFootnotes) {
        this.ignoreFootnotes = ignoreFootnotes;
        return this;
    }

    public void setIgnoreFootnotes(Boolean ignoreFootnotes) {
        this.ignoreFootnotes = ignoreFootnotes;
    }


    /**
     * Gets or sets a value indicating whether formatting is ignored. By default document formatting is not ignored.
    * @return ignoreFormatting
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether formatting is ignored. By default document formatting is not ignored.")
    public Boolean getIgnoreFormatting() {
        return ignoreFormatting;
    }

    public CompareOptions ignoreFormatting(Boolean ignoreFormatting) {
        this.ignoreFormatting = ignoreFormatting;
        return this;
    }

    public void setIgnoreFormatting(Boolean ignoreFormatting) {
        this.ignoreFormatting = ignoreFormatting;
    }


    /**
     * Gets or sets a value indicating whether headers and footers content is ignored. By default headers and footers are not ignored.
    * @return ignoreHeadersAndFooters
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether headers and footers content is ignored. By default headers and footers are not ignored.")
    public Boolean getIgnoreHeadersAndFooters() {
        return ignoreHeadersAndFooters;
    }

    public CompareOptions ignoreHeadersAndFooters(Boolean ignoreHeadersAndFooters) {
        this.ignoreHeadersAndFooters = ignoreHeadersAndFooters;
        return this;
    }

    public void setIgnoreHeadersAndFooters(Boolean ignoreHeadersAndFooters) {
        this.ignoreHeadersAndFooters = ignoreHeadersAndFooters;
    }


    /**
     * Gets or sets a value indicating whether tables content is ignored. By default tables are not ignored.
    * @return ignoreTables
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether tables content is ignored. By default tables are not ignored.")
    public Boolean getIgnoreTables() {
        return ignoreTables;
    }

    public CompareOptions ignoreTables(Boolean ignoreTables) {
        this.ignoreTables = ignoreTables;
        return this;
    }

    public void setIgnoreTables(Boolean ignoreTables) {
        this.ignoreTables = ignoreTables;
    }


    /**
     * Gets or sets a value indicating whether textboxes content is ignored. By default textboxes are not ignored.
    * @return ignoreTextboxes
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether textboxes content is ignored. By default textboxes are not ignored.")
    public Boolean getIgnoreTextboxes() {
        return ignoreTextboxes;
    }

    public CompareOptions ignoreTextboxes(Boolean ignoreTextboxes) {
        this.ignoreTextboxes = ignoreTextboxes;
        return this;
    }

    public void setIgnoreTextboxes(Boolean ignoreTextboxes) {
        this.ignoreTextboxes = ignoreTextboxes;
    }


    /**
     * Gets or sets the option that controls which document shall be used as a target during comparison.
    * @return target
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls which document shall be used as a target during comparison.")
    public TargetEnum getTarget() {
        return target;
    }

    public CompareOptions target(TargetEnum target) {
        this.target = target;
        return this;
    }

    public void setTarget(TargetEnum target) {
        this.target = target;
    }


    public CompareOptions() {
        this.acceptAllRevisionsBeforeComparison = null;
        this.ignoreCaseChanges = null;
        this.ignoreComments = null;
        this.ignoreFields = null;
        this.ignoreFootnotes = null;
        this.ignoreFormatting = null;
        this.ignoreHeadersAndFooters = null;
        this.ignoreTables = null;
        this.ignoreTextboxes = null;
        this.target = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CompareOptions compareOptions = (CompareOptions) o;
        return
            Objects.equals(this.acceptAllRevisionsBeforeComparison, compareOptions.acceptAllRevisionsBeforeComparison) &&
            Objects.equals(this.ignoreCaseChanges, compareOptions.ignoreCaseChanges) &&
            Objects.equals(this.ignoreComments, compareOptions.ignoreComments) &&
            Objects.equals(this.ignoreFields, compareOptions.ignoreFields) &&
            Objects.equals(this.ignoreFootnotes, compareOptions.ignoreFootnotes) &&
            Objects.equals(this.ignoreFormatting, compareOptions.ignoreFormatting) &&
            Objects.equals(this.ignoreHeadersAndFooters, compareOptions.ignoreHeadersAndFooters) &&
            Objects.equals(this.ignoreTables, compareOptions.ignoreTables) &&
            Objects.equals(this.ignoreTextboxes, compareOptions.ignoreTextboxes) &&
            Objects.equals(this.target, compareOptions.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptAllRevisionsBeforeComparison, ignoreCaseChanges, ignoreComments, ignoreFields, ignoreFootnotes, ignoreFormatting, ignoreHeadersAndFooters, ignoreTables, ignoreTextboxes, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompareOptions {\n");
    sb.append("    acceptAllRevisionsBeforeComparison: ").append(toIndentedString(getAcceptAllRevisionsBeforeComparison())).append("\n");
    sb.append("    ignoreCaseChanges: ").append(toIndentedString(getIgnoreCaseChanges())).append("\n");
    sb.append("    ignoreComments: ").append(toIndentedString(getIgnoreComments())).append("\n");
    sb.append("    ignoreFields: ").append(toIndentedString(getIgnoreFields())).append("\n");
    sb.append("    ignoreFootnotes: ").append(toIndentedString(getIgnoreFootnotes())).append("\n");
    sb.append("    ignoreFormatting: ").append(toIndentedString(getIgnoreFormatting())).append("\n");
    sb.append("    ignoreHeadersAndFooters: ").append(toIndentedString(getIgnoreHeadersAndFooters())).append("\n");
    sb.append("    ignoreTables: ").append(toIndentedString(getIgnoreTables())).append("\n");
    sb.append("    ignoreTextboxes: ").append(toIndentedString(getIgnoreTextboxes())).append("\n");
    sb.append("    target: ").append(toIndentedString(getTarget())).append("\n");
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
