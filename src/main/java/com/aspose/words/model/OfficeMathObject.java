/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Words for Cloud
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

package com.aspose.words.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.words.model.OfficeMathLink;
import com.aspose.words.model.StoryChildNodes;
import com.aspose.words.model.WordsApiLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OfficeMath object.
 */
@ApiModel(description = "OfficeMath object.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T13:43:27.551Z")
public class OfficeMathObject {
  @JsonProperty("link")
  private WordsApiLink link = null;

  @JsonProperty("NodeId")
  private String nodeId = null;

  @JsonProperty("Content")
  private StoryChildNodes content = null;

  /**
   * Gets/sets Office Math display format type which represents whether an equation is displayed inline with the text or displayed on its own line.
   */
  public enum DisplayTypeEnum {
    DISPLAY("Display"),
    
    INLINE("Inline");

    private String value;

    DisplayTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DisplayTypeEnum fromValue(String text) {
      for (DisplayTypeEnum b : DisplayTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("DisplayType")
  private DisplayTypeEnum displayType = null;

  /**
   * Gets/sets Office Math justification.
   */
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static JustificationEnum fromValue(String text) {
      for (JustificationEnum b : JustificationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Justification")
  private JustificationEnum justification = null;

  /**
   * Gets type Aspose.Words.Math.OfficeMath.MathObjectType of this Office Math object.
   */
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MathObjectTypeEnum fromValue(String text) {
      for (MathObjectTypeEnum b : MathObjectTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("MathObjectType")
  private MathObjectTypeEnum mathObjectType = null;

  public OfficeMathObject link(WordsApiLink link) {
    this.link = link;
    return this;
  }

   /**
   * Link to the document.
   * @return link
  **/
  @ApiModelProperty(value = "Link to the document.")
  public WordsApiLink getLink() {
    return link;
  }

  public void setLink(WordsApiLink link) {
    this.link = link;
  }

  public OfficeMathObject nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Node id
   * @return nodeId
  **/
  @ApiModelProperty(value = "Node id")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public OfficeMathObject content(StoryChildNodes content) {
    this.content = content;
    return this;
  }

   /**
   * Content of footnote.
   * @return content
  **/
  @ApiModelProperty(value = "Content of footnote.")
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
   * Gets/sets Office Math display format type which represents whether an equation is displayed inline with the text or displayed on its own line.
   * @return displayType
  **/
  @ApiModelProperty(value = "Gets/sets Office Math display format type which represents whether an equation is displayed inline with the text or displayed on its own line.")
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
   * Gets/sets Office Math justification.
   * @return justification
  **/
  @ApiModelProperty(value = "Gets/sets Office Math justification.")
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
   * Gets type Aspose.Words.Math.OfficeMath.MathObjectType of this Office Math object.
   * @return mathObjectType
  **/
  @ApiModelProperty(value = "Gets type Aspose.Words.Math.OfficeMath.MathObjectType of this Office Math object.")
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
    return Objects.equals(this.link, officeMathObject.link) &&
        Objects.equals(this.nodeId, officeMathObject.nodeId) &&
        Objects.equals(this.content, officeMathObject.content) &&
        Objects.equals(this.displayType, officeMathObject.displayType) &&
        Objects.equals(this.justification, officeMathObject.justification) &&
        Objects.equals(this.mathObjectType, officeMathObject.mathObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, nodeId, content, displayType, justification, mathObjectType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfficeMathObject {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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

