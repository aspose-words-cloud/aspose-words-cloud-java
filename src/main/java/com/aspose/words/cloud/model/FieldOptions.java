/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FieldOptions.java">
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
 * DTO for field options.
 */
@ApiModel(description = "DTO for field options.")
public class FieldOptions {
    /**
     * Gets or sets Field Index Format.
     */
    @JsonAdapter(FieldIndexFormatEnum.Adapter.class)
    public enum FieldIndexFormatEnum {
        TEMPLATE("Template"),
        CLASSIC("Classic"),
        FANCY("Fancy"),
        MODERN("Modern"),
        BULLETED("Bulleted"),
        FORMAL("Formal"),
        SIMPLE("Simple");

        private String value;

        FieldIndexFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FieldIndexFormatEnum fromValue(String text) {
            for (FieldIndexFormatEnum b : FieldIndexFormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< FieldIndexFormatEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final FieldIndexFormatEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FieldIndexFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FieldIndexFormatEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets Field Update Culture Source.
     */
    @JsonAdapter(FieldUpdateCultureSourceEnum.Adapter.class)
    public enum FieldUpdateCultureSourceEnum {
        CURRENTTHREAD("CurrentThread"),
        FIELDCODE("FieldCode");

        private String value;

        FieldUpdateCultureSourceEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FieldUpdateCultureSourceEnum fromValue(String text) {
            for (FieldUpdateCultureSourceEnum b : FieldUpdateCultureSourceEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< FieldUpdateCultureSourceEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final FieldUpdateCultureSourceEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FieldUpdateCultureSourceEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FieldUpdateCultureSourceEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("BuiltInTemplatesPaths")
    protected List<String> builtInTemplatesPaths;

    @SerializedName("CurrentUser")
    protected UserInformation currentUser;

    @SerializedName("CustomTocStyleSeparator")
    protected String customTocStyleSeparator;

    @SerializedName("DefaultDocumentAuthor")
    protected String defaultDocumentAuthor;

    @SerializedName("FieldIndexFormat")
    protected FieldIndexFormatEnum fieldIndexFormat;

    @SerializedName("FieldUpdateCultureName")
    protected String fieldUpdateCultureName;

    @SerializedName("FieldUpdateCultureSource")
    protected FieldUpdateCultureSourceEnum fieldUpdateCultureSource;

    @SerializedName("FileName")
    protected String fileName;

    @SerializedName("IsBidiTextSupportedOnUpdate")
    protected Boolean isBidiTextSupportedOnUpdate;

    @SerializedName("LegacyNumberFormat")
    protected Boolean legacyNumberFormat;

    @SerializedName("PreProcessCultureName")
    protected String preProcessCultureName;

    @SerializedName("TemplateName")
    protected String templateName;

    @SerializedName("UseInvariantCultureNumberFormat")
    protected Boolean useInvariantCultureNumberFormat;
    /**
     * Gets or sets BuiltIn Templates Paths.
    * @return builtInTemplatesPaths
    **/
    @ApiModelProperty(value = "Gets or sets BuiltIn Templates Paths.")
    public List<String> getBuiltInTemplatesPaths() {
        return builtInTemplatesPaths;
    }

    public FieldOptions builtInTemplatesPaths(List<String> builtInTemplatesPaths) {
        this.builtInTemplatesPaths = builtInTemplatesPaths;
        return this;
    }

    public FieldOptions addBuiltInTemplatesPathsItem(String builtInTemplatesPathsItem) {
        if (this.builtInTemplatesPaths == null) {
            this.builtInTemplatesPaths = new ArrayList<String>();
        }
        this.builtInTemplatesPaths.add(builtInTemplatesPathsItem);
        return this;
    }


    public void setBuiltInTemplatesPaths(List<String> builtInTemplatesPaths) {
        this.builtInTemplatesPaths = builtInTemplatesPaths;
    }


    /**
     * Gets or sets Curren tUser.
    * @return currentUser
    **/
    @ApiModelProperty(value = "Gets or sets Curren tUser.")
    public UserInformation getCurrentUser() {
        return currentUser;
    }

    public FieldOptions currentUser(UserInformation currentUser) {
        this.currentUser = currentUser;
        return this;
    }

    public void setCurrentUser(UserInformation currentUser) {
        this.currentUser = currentUser;
    }


    /**
     * Gets or sets Custom Toc Style Separator.
    * @return customTocStyleSeparator
    **/
    @ApiModelProperty(value = "Gets or sets Custom Toc Style Separator.")
    public String getCustomTocStyleSeparator() {
        return customTocStyleSeparator;
    }

    public FieldOptions customTocStyleSeparator(String customTocStyleSeparator) {
        this.customTocStyleSeparator = customTocStyleSeparator;
        return this;
    }

    public void setCustomTocStyleSeparator(String customTocStyleSeparator) {
        this.customTocStyleSeparator = customTocStyleSeparator;
    }


    /**
     * Gets or sets Default Document Author.
    * @return defaultDocumentAuthor
    **/
    @ApiModelProperty(value = "Gets or sets Default Document Author.")
    public String getDefaultDocumentAuthor() {
        return defaultDocumentAuthor;
    }

    public FieldOptions defaultDocumentAuthor(String defaultDocumentAuthor) {
        this.defaultDocumentAuthor = defaultDocumentAuthor;
        return this;
    }

    public void setDefaultDocumentAuthor(String defaultDocumentAuthor) {
        this.defaultDocumentAuthor = defaultDocumentAuthor;
    }


    /**
     * Gets or sets Field Index Format.
    * @return fieldIndexFormat
    **/
    @ApiModelProperty(value = "Gets or sets Field Index Format.")
    public FieldIndexFormatEnum getFieldIndexFormat() {
        return fieldIndexFormat;
    }

    public FieldOptions fieldIndexFormat(FieldIndexFormatEnum fieldIndexFormat) {
        this.fieldIndexFormat = fieldIndexFormat;
        return this;
    }

    public void setFieldIndexFormat(FieldIndexFormatEnum fieldIndexFormat) {
        this.fieldIndexFormat = fieldIndexFormat;
    }


    /**
     * Gets or sets Field Update Culture Name.
     * It is used for all fields if FieldUpdateCultureSource is FieldCode.
    * @return fieldUpdateCultureName
    **/
    @ApiModelProperty(value = "Gets or sets Field Update Culture Name. It is used for all fields if FieldUpdateCultureSource is FieldCode.")
    public String getFieldUpdateCultureName() {
        return fieldUpdateCultureName;
    }

    public FieldOptions fieldUpdateCultureName(String fieldUpdateCultureName) {
        this.fieldUpdateCultureName = fieldUpdateCultureName;
        return this;
    }

    public void setFieldUpdateCultureName(String fieldUpdateCultureName) {
        this.fieldUpdateCultureName = fieldUpdateCultureName;
    }


    /**
     * Gets or sets Field Update Culture Source.
    * @return fieldUpdateCultureSource
    **/
    @ApiModelProperty(value = "Gets or sets Field Update Culture Source.")
    public FieldUpdateCultureSourceEnum getFieldUpdateCultureSource() {
        return fieldUpdateCultureSource;
    }

    public FieldOptions fieldUpdateCultureSource(FieldUpdateCultureSourceEnum fieldUpdateCultureSource) {
        this.fieldUpdateCultureSource = fieldUpdateCultureSource;
        return this;
    }

    public void setFieldUpdateCultureSource(FieldUpdateCultureSourceEnum fieldUpdateCultureSource) {
        this.fieldUpdateCultureSource = fieldUpdateCultureSource;
    }


    /**
     * Gets or sets File Name.
    * @return fileName
    **/
    @ApiModelProperty(value = "Gets or sets File Name.")
    public String getFileName() {
        return fileName;
    }

    public FieldOptions fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets or sets if Bidi Text Supported OnUpdate.
    * @return isBidiTextSupportedOnUpdate
    **/
    @ApiModelProperty(value = "Gets or sets if Bidi Text Supported OnUpdate.")
    public Boolean getIsBidiTextSupportedOnUpdate() {
        return isBidiTextSupportedOnUpdate;
    }

    public FieldOptions isBidiTextSupportedOnUpdate(Boolean isBidiTextSupportedOnUpdate) {
        this.isBidiTextSupportedOnUpdate = isBidiTextSupportedOnUpdate;
        return this;
    }

    public void setIsBidiTextSupportedOnUpdate(Boolean isBidiTextSupportedOnUpdate) {
        this.isBidiTextSupportedOnUpdate = isBidiTextSupportedOnUpdate;
    }


    /**
     * Gets or sets if Legacy Number Format.
    * @return legacyNumberFormat
    **/
    @ApiModelProperty(value = "Gets or sets if Legacy Number Format.")
    public Boolean getLegacyNumberFormat() {
        return legacyNumberFormat;
    }

    public FieldOptions legacyNumberFormat(Boolean legacyNumberFormat) {
        this.legacyNumberFormat = legacyNumberFormat;
        return this;
    }

    public void setLegacyNumberFormat(Boolean legacyNumberFormat) {
        this.legacyNumberFormat = legacyNumberFormat;
    }


    /**
     * Gets or sets PreProcess Culture Name.
     * It is a culture code for DOC fields.
    * @return preProcessCultureName
    **/
    @ApiModelProperty(value = "Gets or sets PreProcess Culture Name. It is a culture code for DOC fields.")
    public String getPreProcessCultureName() {
        return preProcessCultureName;
    }

    public FieldOptions preProcessCultureName(String preProcessCultureName) {
        this.preProcessCultureName = preProcessCultureName;
        return this;
    }

    public void setPreProcessCultureName(String preProcessCultureName) {
        this.preProcessCultureName = preProcessCultureName;
    }


    /**
     * Gets or sets Template Name.
    * @return templateName
    **/
    @ApiModelProperty(value = "Gets or sets Template Name.")
    public String getTemplateName() {
        return templateName;
    }

    public FieldOptions templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }


    /**
     * Gets or sets if Use Invariant Culture Number Format.
    * @return useInvariantCultureNumberFormat
    **/
    @ApiModelProperty(value = "Gets or sets if Use Invariant Culture Number Format.")
    public Boolean getUseInvariantCultureNumberFormat() {
        return useInvariantCultureNumberFormat;
    }

    public FieldOptions useInvariantCultureNumberFormat(Boolean useInvariantCultureNumberFormat) {
        this.useInvariantCultureNumberFormat = useInvariantCultureNumberFormat;
        return this;
    }

    public void setUseInvariantCultureNumberFormat(Boolean useInvariantCultureNumberFormat) {
        this.useInvariantCultureNumberFormat = useInvariantCultureNumberFormat;
    }


    public FieldOptions() {
        this.builtInTemplatesPaths = null;
        this.currentUser = null;
        this.customTocStyleSeparator = null;
        this.defaultDocumentAuthor = null;
        this.fieldIndexFormat = null;
        this.fieldUpdateCultureName = null;
        this.fieldUpdateCultureSource = null;
        this.fileName = null;
        this.isBidiTextSupportedOnUpdate = null;
        this.legacyNumberFormat = null;
        this.preProcessCultureName = null;
        this.templateName = null;
        this.useInvariantCultureNumberFormat = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FieldOptions fieldOptions = (FieldOptions) o;
        return
            Objects.equals(this.builtInTemplatesPaths, fieldOptions.builtInTemplatesPaths) &&
            Objects.equals(this.currentUser, fieldOptions.currentUser) &&
            Objects.equals(this.customTocStyleSeparator, fieldOptions.customTocStyleSeparator) &&
            Objects.equals(this.defaultDocumentAuthor, fieldOptions.defaultDocumentAuthor) &&
            Objects.equals(this.fieldIndexFormat, fieldOptions.fieldIndexFormat) &&
            Objects.equals(this.fieldUpdateCultureName, fieldOptions.fieldUpdateCultureName) &&
            Objects.equals(this.fieldUpdateCultureSource, fieldOptions.fieldUpdateCultureSource) &&
            Objects.equals(this.fileName, fieldOptions.fileName) &&
            Objects.equals(this.isBidiTextSupportedOnUpdate, fieldOptions.isBidiTextSupportedOnUpdate) &&
            Objects.equals(this.legacyNumberFormat, fieldOptions.legacyNumberFormat) &&
            Objects.equals(this.preProcessCultureName, fieldOptions.preProcessCultureName) &&
            Objects.equals(this.templateName, fieldOptions.templateName) &&
            Objects.equals(this.useInvariantCultureNumberFormat, fieldOptions.useInvariantCultureNumberFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(builtInTemplatesPaths, currentUser, customTocStyleSeparator, defaultDocumentAuthor, fieldIndexFormat, fieldUpdateCultureName, fieldUpdateCultureSource, fileName, isBidiTextSupportedOnUpdate, legacyNumberFormat, preProcessCultureName, templateName, useInvariantCultureNumberFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldOptions {\n");
    sb.append("    builtInTemplatesPaths: ").append(toIndentedString(getBuiltInTemplatesPaths())).append("\n");
    sb.append("    currentUser: ").append(toIndentedString(getCurrentUser())).append("\n");
    sb.append("    customTocStyleSeparator: ").append(toIndentedString(getCustomTocStyleSeparator())).append("\n");
    sb.append("    defaultDocumentAuthor: ").append(toIndentedString(getDefaultDocumentAuthor())).append("\n");
    sb.append("    fieldIndexFormat: ").append(toIndentedString(getFieldIndexFormat())).append("\n");
    sb.append("    fieldUpdateCultureName: ").append(toIndentedString(getFieldUpdateCultureName())).append("\n");
    sb.append("    fieldUpdateCultureSource: ").append(toIndentedString(getFieldUpdateCultureSource())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(getFileName())).append("\n");
    sb.append("    isBidiTextSupportedOnUpdate: ").append(toIndentedString(getIsBidiTextSupportedOnUpdate())).append("\n");
    sb.append("    legacyNumberFormat: ").append(toIndentedString(getLegacyNumberFormat())).append("\n");
    sb.append("    preProcessCultureName: ").append(toIndentedString(getPreProcessCultureName())).append("\n");
    sb.append("    templateName: ").append(toIndentedString(getTemplateName())).append("\n");
    sb.append("    useInvariantCultureNumberFormat: ").append(toIndentedString(getUseInvariantCultureNumberFormat())).append("\n");
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
