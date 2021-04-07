/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CompareOptions.java">
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

    @SerializedName("IgnoreCaseChanges")
    private Boolean ignoreCaseChanges = null;

    @SerializedName("IgnoreComments")
    private Boolean ignoreComments = null;

    @SerializedName("IgnoreFields")
    private Boolean ignoreFields = null;

    @SerializedName("IgnoreFootnotes")
    private Boolean ignoreFootnotes = null;

    @SerializedName("IgnoreFormatting")
    private Boolean ignoreFormatting = null;

    @SerializedName("IgnoreHeadersAndFooters")
    private Boolean ignoreHeadersAndFooters = null;

    @SerializedName("IgnoreTables")
    private Boolean ignoreTables = null;

    @SerializedName("IgnoreTextboxes")
    private Boolean ignoreTextboxes = null;

    @SerializedName("Target")
    private TargetEnum target = null;
    public CompareOptions ignoreCaseChanges(Boolean ignoreCaseChanges) {
        this.ignoreCaseChanges = ignoreCaseChanges;
        return this;
    }

    /**
     * Gets or sets a value indicating whether documents comparison is case insensitive. By default comparison is case sensitive.
    * @return ignoreCaseChanges
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether documents comparison is case insensitive. By default comparison is case sensitive.")
    public Boolean getIgnoreCaseChanges() {
        return ignoreCaseChanges;
    }

    public void setIgnoreCaseChanges(Boolean ignoreCaseChanges) {
        this.ignoreCaseChanges = ignoreCaseChanges;
    }

    public CompareOptions ignoreComments(Boolean ignoreComments) {
        this.ignoreComments = ignoreComments;
        return this;
    }

    /**
     * Gets or sets a value indicating whether comments content is ignored. By default comments are not ignored.
    * @return ignoreComments
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether comments content is ignored. By default comments are not ignored.")
    public Boolean getIgnoreComments() {
        return ignoreComments;
    }

    public void setIgnoreComments(Boolean ignoreComments) {
        this.ignoreComments = ignoreComments;
    }

    public CompareOptions ignoreFields(Boolean ignoreFields) {
        this.ignoreFields = ignoreFields;
        return this;
    }

    /**
     * Gets or sets a value indicating whether fields content is ignored. By default fields are not ignored.
    * @return ignoreFields
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether fields content is ignored. By default fields are not ignored.")
    public Boolean getIgnoreFields() {
        return ignoreFields;
    }

    public void setIgnoreFields(Boolean ignoreFields) {
        this.ignoreFields = ignoreFields;
    }

    public CompareOptions ignoreFootnotes(Boolean ignoreFootnotes) {
        this.ignoreFootnotes = ignoreFootnotes;
        return this;
    }

    /**
     * Gets or sets a value indicating whether footnotes/endnotes content is ignored. By default footnotes/endnotes are not ignored.
    * @return ignoreFootnotes
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether footnotes/endnotes content is ignored. By default footnotes/endnotes are not ignored.")
    public Boolean getIgnoreFootnotes() {
        return ignoreFootnotes;
    }

    public void setIgnoreFootnotes(Boolean ignoreFootnotes) {
        this.ignoreFootnotes = ignoreFootnotes;
    }

    public CompareOptions ignoreFormatting(Boolean ignoreFormatting) {
        this.ignoreFormatting = ignoreFormatting;
        return this;
    }

    /**
     * Gets or sets a value indicating whether formatting is ignored. By default document formatting is not ignored.
    * @return ignoreFormatting
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether formatting is ignored. By default document formatting is not ignored.")
    public Boolean getIgnoreFormatting() {
        return ignoreFormatting;
    }

    public void setIgnoreFormatting(Boolean ignoreFormatting) {
        this.ignoreFormatting = ignoreFormatting;
    }

    public CompareOptions ignoreHeadersAndFooters(Boolean ignoreHeadersAndFooters) {
        this.ignoreHeadersAndFooters = ignoreHeadersAndFooters;
        return this;
    }

    /**
     * Gets or sets a value indicating whether headers and footers content is ignored. By default headers and footers are not ignored.
    * @return ignoreHeadersAndFooters
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether headers and footers content is ignored. By default headers and footers are not ignored.")
    public Boolean getIgnoreHeadersAndFooters() {
        return ignoreHeadersAndFooters;
    }

    public void setIgnoreHeadersAndFooters(Boolean ignoreHeadersAndFooters) {
        this.ignoreHeadersAndFooters = ignoreHeadersAndFooters;
    }

    public CompareOptions ignoreTables(Boolean ignoreTables) {
        this.ignoreTables = ignoreTables;
        return this;
    }

    /**
     * Gets or sets a value indicating whether tables content is ignored. By default tables are not ignored.
    * @return ignoreTables
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether tables content is ignored. By default tables are not ignored.")
    public Boolean getIgnoreTables() {
        return ignoreTables;
    }

    public void setIgnoreTables(Boolean ignoreTables) {
        this.ignoreTables = ignoreTables;
    }

    public CompareOptions ignoreTextboxes(Boolean ignoreTextboxes) {
        this.ignoreTextboxes = ignoreTextboxes;
        return this;
    }

    /**
     * Gets or sets a value indicating whether textboxes content is ignored. By default textboxes are not ignored.
    * @return ignoreTextboxes
    **/
    @ApiModelProperty(value = "Gets or sets a value indicating whether textboxes content is ignored. By default textboxes are not ignored.")
    public Boolean getIgnoreTextboxes() {
        return ignoreTextboxes;
    }

    public void setIgnoreTextboxes(Boolean ignoreTextboxes) {
        this.ignoreTextboxes = ignoreTextboxes;
    }

    public CompareOptions target(TargetEnum target) {
        this.target = target;
        return this;
    }

    /**
     * Gets or sets the option that controls which document shall be used as a target during comparison.
    * @return target
    **/
    @ApiModelProperty(value = "Gets or sets the option that controls which document shall be used as a target during comparison.")
    public TargetEnum getTarget() {
        return target;
    }

    public void setTarget(TargetEnum target) {
        this.target = target;
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
    return Objects.hash(ignoreCaseChanges, ignoreComments, ignoreFields, ignoreFootnotes, ignoreFormatting, ignoreHeadersAndFooters, ignoreTables, ignoreTextboxes, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompareOptions {\n");
    sb.append("    ignoreCaseChanges: ").append(toIndentedString(ignoreCaseChanges)).append("\n");
    sb.append("    ignoreComments: ").append(toIndentedString(ignoreComments)).append("\n");
    sb.append("    ignoreFields: ").append(toIndentedString(ignoreFields)).append("\n");
    sb.append("    ignoreFootnotes: ").append(toIndentedString(ignoreFootnotes)).append("\n");
    sb.append("    ignoreFormatting: ").append(toIndentedString(ignoreFormatting)).append("\n");
    sb.append("    ignoreHeadersAndFooters: ").append(toIndentedString(ignoreHeadersAndFooters)).append("\n");
    sb.append("    ignoreTables: ").append(toIndentedString(ignoreTables)).append("\n");
    sb.append("    ignoreTextboxes: ").append(toIndentedString(ignoreTextboxes)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
