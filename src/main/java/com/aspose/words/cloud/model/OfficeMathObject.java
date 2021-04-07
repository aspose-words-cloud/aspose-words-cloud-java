/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OfficeMathObject.java">
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
 * DTO container with an OfficeMath object.
 */
@ApiModel(description = "DTO container with an OfficeMath object.")
public class OfficeMathObject extends OfficeMathLink {
    /**
     * Gets or sets the display format type of the OfficeMath object. This display format defines whether an equation is displayed inline with the text or displayed on its own line.
     */
    @JsonAdapter(DisplayTypeEnum.Adapter.class)
    public enum DisplayTypeEnum {
        DISPLAY("Display"),
        INLINE("Inline");

        private String value;

        DisplayTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DisplayTypeEnum fromValue(String text) {
            for (DisplayTypeEnum b : DisplayTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< DisplayTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final DisplayTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DisplayTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DisplayTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the justification of the OfficeMath object.
     */
    @JsonAdapter(JustificationEnum.Adapter.class)
    public enum JustificationEnum {
        CENTERGROUP("CenterGroup"),
        DEFAULT("Default"),
        CENTER("Center"),
        LEFT("Left"),
        RIGHT("Right"),
        INLINE("Inline");

        private String value;

        JustificationEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static JustificationEnum fromValue(String text) {
            for (JustificationEnum b : JustificationEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< JustificationEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final JustificationEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public JustificationEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return JustificationEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the type of the OfficeMath object.
     */
    @JsonAdapter(MathObjectTypeEnum.Adapter.class)
    public enum MathObjectTypeEnum {
        OMATH("OMath"),
        OMATHPARA("OMathPara"),
        ACCENT("Accent"),
        BAR("Bar"),
        BORDERBOX("BorderBox"),
        BOX("Box"),
        DELIMITER("Delimiter"),
        DEGREE("Degree"),
        ARGUMENT("Argument"),
        ARRAY("Array"),
        FRACTION("Fraction"),
        DENOMINATOR("Denominator"),
        NUMERATOR("Numerator"),
        FUNCTION("Function"),
        FUNCTIONNAME("FunctionName"),
        GROUPCHARACTER("GroupCharacter"),
        LIMIT("Limit"),
        LOWERLIMIT("LowerLimit"),
        UPPERLIMIT("UpperLimit"),
        MATRIX("Matrix"),
        MATRIXROW("MatrixRow"),
        NARY("NAry"),
        PHANTOM("Phantom"),
        RADICAL("Radical"),
        SUBSCRIPTPART("SubscriptPart"),
        SUPERSCRIPTPART("SuperscriptPart"),
        PRESUBSUPERSCRIPT("PreSubSuperscript"),
        SUBSCRIPT("Subscript"),
        SUBSUPERSCRIPT("SubSuperscript"),
        SUPERCRIPT("Supercript");

        private String value;

        MathObjectTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MathObjectTypeEnum fromValue(String text) {
            for (MathObjectTypeEnum b : MathObjectTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< MathObjectTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final MathObjectTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MathObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MathObjectTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Content")
    private StoryChildNodes content = null;

    @SerializedName("DisplayType")
    private DisplayTypeEnum displayType = null;

    @SerializedName("Justification")
    private JustificationEnum justification = null;

    @SerializedName("MathObjectType")
    private MathObjectTypeEnum mathObjectType = null;
    public OfficeMathObject content(StoryChildNodes content) {
        this.content = content;
        return this;
    }

    /**
     * Gets or sets the content of a footnote.
    * @return content
    **/
    @ApiModelProperty(value = "Gets or sets the content of a footnote.")
    public StoryChildNodes getContent() {
        return content;
    }

    public void setContent(StoryChildNodes content) {
        this.content = content;
    }

    public OfficeMathObject displayType(DisplayTypeEnum displayType) {
        this.displayType = displayType;
        return this;
    }

    /**
     * Gets or sets the display format type of the OfficeMath object. This display format defines whether an equation is displayed inline with the text or displayed on its own line.
    * @return displayType
    **/
    @ApiModelProperty(value = "Gets or sets the display format type of the OfficeMath object. This display format defines whether an equation is displayed inline with the text or displayed on its own line.")
    public DisplayTypeEnum getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayTypeEnum displayType) {
        this.displayType = displayType;
    }

    public OfficeMathObject justification(JustificationEnum justification) {
        this.justification = justification;
        return this;
    }

    /**
     * Gets or sets the justification of the OfficeMath object.
    * @return justification
    **/
    @ApiModelProperty(value = "Gets or sets the justification of the OfficeMath object.")
    public JustificationEnum getJustification() {
        return justification;
    }

    public void setJustification(JustificationEnum justification) {
        this.justification = justification;
    }

    public OfficeMathObject mathObjectType(MathObjectTypeEnum mathObjectType) {
        this.mathObjectType = mathObjectType;
        return this;
    }

    /**
     * Gets or sets the type of the OfficeMath object.
    * @return mathObjectType
    **/
    @ApiModelProperty(value = "Gets or sets the type of the OfficeMath object.")
    public MathObjectTypeEnum getMathObjectType() {
        return mathObjectType;
    }

    public void setMathObjectType(MathObjectTypeEnum mathObjectType) {
        this.mathObjectType = mathObjectType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OfficeMathObject officeMathObject = (OfficeMathObject) o;
        return
            Objects.equals(this.content, officeMathObject.content) &&
            Objects.equals(this.displayType, officeMathObject.displayType) &&
            Objects.equals(this.justification, officeMathObject.justification) &&
            Objects.equals(this.mathObjectType, officeMathObject.mathObjectType) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, displayType, justification, mathObjectType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfficeMathObject {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    mathObjectType: ").append(toIndentedString(mathObjectType)).append("\n");
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
