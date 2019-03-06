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

package com.aspose.words.cloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.aspose.words.cloud.model.StringFormatData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Allows to specify additional System.Drawing.Graphics quality options.
 */
@ApiModel(description = "Allows to specify additional System.Drawing.Graphics quality options.")

public class GraphicsQualityOptionsData {
  /**
   * Gets or sets a value that specifies how composited images are drawn to this Graphics.
   */
  @JsonAdapter(CompositingModeEnum.Adapter.class)
  public enum CompositingModeEnum {
    SOURCEOVER("SourceOver"),
    
    SOURCECOPY("SourceCopy");

    private String value;

    CompositingModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompositingModeEnum fromValue(String text) {
      for (CompositingModeEnum b : CompositingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CompositingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompositingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompositingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CompositingModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("CompositingMode")
  private CompositingModeEnum compositingMode = null;

  /**
   * Gets or sets the rendering quality of composited images drawn to this Graphics.
   */
  @JsonAdapter(CompositingQualityEnum.Adapter.class)
  public enum CompositingQualityEnum {
    DEFAULT("Default"),
    
    HIGHSPEED("HighSpeed"),
    
    HIGHQUALITY("HighQuality"),
    
    GAMMACORRECTED("GammaCorrected"),
    
    ASSUMELINEAR("AssumeLinear"),
    
    INVALID("Invalid");

    private String value;

    CompositingQualityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompositingQualityEnum fromValue(String text) {
      for (CompositingQualityEnum b : CompositingQualityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CompositingQualityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompositingQualityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompositingQualityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CompositingQualityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("CompositingQuality")
  private CompositingQualityEnum compositingQuality = null;

  /**
   * Gets or sets the interpolation mode associated with this Graphics.
   */
  @JsonAdapter(InterpolationModeEnum.Adapter.class)
  public enum InterpolationModeEnum {
    DEFAULT("Default"),
    
    LOW("Low"),
    
    HIGH("High"),
    
    BILINEAR("Bilinear"),
    
    BICUBIC("Bicubic"),
    
    NEARESTNEIGHBOR("NearestNeighbor"),
    
    HIGHQUALITYBILINEAR("HighQualityBilinear"),
    
    HIGHQUALITYBICUBIC("HighQualityBicubic"),
    
    INVALID("Invalid");

    private String value;

    InterpolationModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InterpolationModeEnum fromValue(String text) {
      for (InterpolationModeEnum b : InterpolationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InterpolationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InterpolationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InterpolationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InterpolationModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("InterpolationMode")
  private InterpolationModeEnum interpolationMode = null;

  /**
   * Gets or sets the rendering quality for this Graphics.
   */
  @JsonAdapter(SmoothingModeEnum.Adapter.class)
  public enum SmoothingModeEnum {
    DEFAULT("Default"),
    
    HIGHSPEED("HighSpeed"),
    
    HIGHQUALITY("HighQuality"),
    
    NONE("None"),
    
    ANTIALIAS("AntiAlias"),
    
    INVALID("Invalid");

    private String value;

    SmoothingModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SmoothingModeEnum fromValue(String text) {
      for (SmoothingModeEnum b : SmoothingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SmoothingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SmoothingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SmoothingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SmoothingModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SmoothingMode")
  private SmoothingModeEnum smoothingMode = null;

  @SerializedName("StringFormat")
  private StringFormatData stringFormat = null;

  /**
   * Gets or sets the rendering mode for text associated with this Graphics.
   */
  @JsonAdapter(TextRenderingHintEnum.Adapter.class)
  public enum TextRenderingHintEnum {
    SYSTEMDEFAULT("SystemDefault"),
    
    SINGLEBITPERPIXELGRIDFIT("SingleBitPerPixelGridFit"),
    
    SINGLEBITPERPIXEL("SingleBitPerPixel"),
    
    ANTIALIASGRIDFIT("AntiAliasGridFit"),
    
    ANTIALIAS("AntiAlias"),
    
    CLEARTYPEGRIDFIT("ClearTypeGridFit");

    private String value;

    TextRenderingHintEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextRenderingHintEnum fromValue(String text) {
      for (TextRenderingHintEnum b : TextRenderingHintEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextRenderingHintEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextRenderingHintEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextRenderingHintEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextRenderingHintEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("TextRenderingHint")
  private TextRenderingHintEnum textRenderingHint = null;

  public GraphicsQualityOptionsData compositingMode(CompositingModeEnum compositingMode) {
    this.compositingMode = compositingMode;
    return this;
  }

   /**
   * Gets or sets a value that specifies how composited images are drawn to this Graphics.
   * @return compositingMode
  **/
  @ApiModelProperty(value = "Gets or sets a value that specifies how composited images are drawn to this Graphics.")
  public CompositingModeEnum getCompositingMode() {
    return compositingMode;
  }

  public void setCompositingMode(CompositingModeEnum compositingMode) {
    this.compositingMode = compositingMode;
  }

  public GraphicsQualityOptionsData compositingQuality(CompositingQualityEnum compositingQuality) {
    this.compositingQuality = compositingQuality;
    return this;
  }

   /**
   * Gets or sets the rendering quality of composited images drawn to this Graphics.
   * @return compositingQuality
  **/
  @ApiModelProperty(value = "Gets or sets the rendering quality of composited images drawn to this Graphics.")
  public CompositingQualityEnum getCompositingQuality() {
    return compositingQuality;
  }

  public void setCompositingQuality(CompositingQualityEnum compositingQuality) {
    this.compositingQuality = compositingQuality;
  }

  public GraphicsQualityOptionsData interpolationMode(InterpolationModeEnum interpolationMode) {
    this.interpolationMode = interpolationMode;
    return this;
  }

   /**
   * Gets or sets the interpolation mode associated with this Graphics.
   * @return interpolationMode
  **/
  @ApiModelProperty(value = "Gets or sets the interpolation mode associated with this Graphics.")
  public InterpolationModeEnum getInterpolationMode() {
    return interpolationMode;
  }

  public void setInterpolationMode(InterpolationModeEnum interpolationMode) {
    this.interpolationMode = interpolationMode;
  }

  public GraphicsQualityOptionsData smoothingMode(SmoothingModeEnum smoothingMode) {
    this.smoothingMode = smoothingMode;
    return this;
  }

   /**
   * Gets or sets the rendering quality for this Graphics.
   * @return smoothingMode
  **/
  @ApiModelProperty(value = "Gets or sets the rendering quality for this Graphics.")
  public SmoothingModeEnum getSmoothingMode() {
    return smoothingMode;
  }

  public void setSmoothingMode(SmoothingModeEnum smoothingMode) {
    this.smoothingMode = smoothingMode;
  }

  public GraphicsQualityOptionsData stringFormat(StringFormatData stringFormat) {
    this.stringFormat = stringFormat;
    return this;
  }

   /**
   * Gets or sets text layout information (such as alignment, orientation and tab stops) display manipulations (such as ellipsis insertion and national digit substitution) and OpenType features.
   * @return stringFormat
  **/
  @ApiModelProperty(value = "Gets or sets text layout information (such as alignment, orientation and tab stops) display manipulations (such as ellipsis insertion and national digit substitution) and OpenType features.")
  public StringFormatData getStringFormat() {
    return stringFormat;
  }

  public void setStringFormat(StringFormatData stringFormat) {
    this.stringFormat = stringFormat;
  }

  public GraphicsQualityOptionsData textRenderingHint(TextRenderingHintEnum textRenderingHint) {
    this.textRenderingHint = textRenderingHint;
    return this;
  }

   /**
   * Gets or sets the rendering mode for text associated with this Graphics.
   * @return textRenderingHint
  **/
  @ApiModelProperty(value = "Gets or sets the rendering mode for text associated with this Graphics.")
  public TextRenderingHintEnum getTextRenderingHint() {
    return textRenderingHint;
  }

  public void setTextRenderingHint(TextRenderingHintEnum textRenderingHint) {
    this.textRenderingHint = textRenderingHint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphicsQualityOptionsData graphicsQualityOptionsData = (GraphicsQualityOptionsData) o;
    return Objects.equals(this.compositingMode, graphicsQualityOptionsData.compositingMode) &&
        Objects.equals(this.compositingQuality, graphicsQualityOptionsData.compositingQuality) &&
        Objects.equals(this.interpolationMode, graphicsQualityOptionsData.interpolationMode) &&
        Objects.equals(this.smoothingMode, graphicsQualityOptionsData.smoothingMode) &&
        Objects.equals(this.stringFormat, graphicsQualityOptionsData.stringFormat) &&
        Objects.equals(this.textRenderingHint, graphicsQualityOptionsData.textRenderingHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositingMode, compositingQuality, interpolationMode, smoothingMode, stringFormat, textRenderingHint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphicsQualityOptionsData {\n");
    
    sb.append("    compositingMode: ").append(toIndentedString(compositingMode)).append("\n");
    sb.append("    compositingQuality: ").append(toIndentedString(compositingQuality)).append("\n");
    sb.append("    interpolationMode: ").append(toIndentedString(interpolationMode)).append("\n");
    sb.append("    smoothingMode: ").append(toIndentedString(smoothingMode)).append("\n");
    sb.append("    stringFormat: ").append(toIndentedString(stringFormat)).append("\n");
    sb.append("    textRenderingHint: ").append(toIndentedString(textRenderingHint)).append("\n");
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

