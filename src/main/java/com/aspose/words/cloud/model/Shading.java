/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Shading.java">
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
 * DTO container with a paragraph format shading element.
 */
@ApiModel(description = "DTO container with a paragraph format shading element.")
public class Shading {
    /**
     * Gets or sets the shading texture.
     */
    @JsonAdapter(TextureEnum.Adapter.class)
    public enum TextureEnum {
        TEXTURENONE("TextureNone"),
        TEXTURESOLID("TextureSolid"),
        TEXTURE5PERCENT("Texture5Percent"),
        TEXTURE10PERCENT("Texture10Percent"),
        TEXTURE20PERCENT("Texture20Percent"),
        TEXTURE25PERCENT("Texture25Percent"),
        TEXTURE30PERCENT("Texture30Percent"),
        TEXTURE40PERCENT("Texture40Percent"),
        TEXTURE50PERCENT("Texture50Percent"),
        TEXTURE60PERCENT("Texture60Percent"),
        TEXTURE70PERCENT("Texture70Percent"),
        TEXTURE75PERCENT("Texture75Percent"),
        TEXTURE80PERCENT("Texture80Percent"),
        TEXTURE90PERCENT("Texture90Percent"),
        TEXTUREDARKHORIZONTAL("TextureDarkHorizontal"),
        TEXTUREDARKVERTICAL("TextureDarkVertical"),
        TEXTUREDARKDIAGONALDOWN("TextureDarkDiagonalDown"),
        TEXTUREDARKDIAGONALUP("TextureDarkDiagonalUp"),
        TEXTUREDARKCROSS("TextureDarkCross"),
        TEXTUREDARKDIAGONALCROSS("TextureDarkDiagonalCross"),
        TEXTUREHORIZONTAL("TextureHorizontal"),
        TEXTUREVERTICAL("TextureVertical"),
        TEXTUREDIAGONALDOWN("TextureDiagonalDown"),
        TEXTUREDIAGONALUP("TextureDiagonalUp"),
        TEXTURECROSS("TextureCross"),
        TEXTUREDIAGONALCROSS("TextureDiagonalCross"),
        TEXTURE2PT5PERCENT("Texture2Pt5Percent"),
        TEXTURE7PT5PERCENT("Texture7Pt5Percent"),
        TEXTURE12PT5PERCENT("Texture12Pt5Percent"),
        TEXTURE15PERCENT("Texture15Percent"),
        TEXTURE17PT5PERCENT("Texture17Pt5Percent"),
        TEXTURE22PT5PERCENT("Texture22Pt5Percent"),
        TEXTURE27PT5PERCENT("Texture27Pt5Percent"),
        TEXTURE32PT5PERCENT("Texture32Pt5Percent"),
        TEXTURE35PERCENT("Texture35Percent"),
        TEXTURE37PT5PERCENT("Texture37Pt5Percent"),
        TEXTURE42PT5PERCENT("Texture42Pt5Percent"),
        TEXTURE45PERCENT("Texture45Percent"),
        TEXTURE47PT5PERCENT("Texture47Pt5Percent"),
        TEXTURE52PT5PERCENT("Texture52Pt5Percent"),
        TEXTURE55PERCENT("Texture55Percent"),
        TEXTURE57PT5PERCENT("Texture57Pt5Percent"),
        TEXTURE62PT5PERCENT("Texture62Pt5Percent"),
        TEXTURE65PERCENT("Texture65Percent"),
        TEXTURE67PT5PERCENT("Texture67Pt5Percent"),
        TEXTURE72PT5PERCENT("Texture72Pt5Percent"),
        TEXTURE77PT5PERCENT("Texture77Pt5Percent"),
        TEXTURE82PT5PERCENT("Texture82Pt5Percent"),
        TEXTURE85PERCENT("Texture85Percent"),
        TEXTURE87PT5PERCENT("Texture87Pt5Percent"),
        TEXTURE92PT5PERCENT("Texture92Pt5Percent"),
        TEXTURE95PERCENT("Texture95Percent"),
        TEXTURE97PT5PERCENT("Texture97Pt5Percent"),
        TEXTURENIL("TextureNil");

        private String value;

        TextureEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TextureEnum fromValue(String text) {
            for (TextureEnum b : TextureEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< TextureEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final TextureEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TextureEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TextureEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("BackgroundPatternColor")
    private XmlColor backgroundPatternColor = null;

    @SerializedName("ForegroundPatternColor")
    private XmlColor foregroundPatternColor = null;

    @SerializedName("Texture")
    private TextureEnum texture = null;
    public Shading backgroundPatternColor(XmlColor backgroundPatternColor) {
        this.backgroundPatternColor = backgroundPatternColor;
        return this;
    }

    /**
     * Gets or sets the color that's applied to the background of the Shading object.
    * @return backgroundPatternColor
    **/
    @ApiModelProperty(value = "Gets or sets the color that's applied to the background of the Shading object.")
    public XmlColor getBackgroundPatternColor() {
        return backgroundPatternColor;
    }

    public void setBackgroundPatternColor(XmlColor backgroundPatternColor) {
        this.backgroundPatternColor = backgroundPatternColor;
    }

    public Shading foregroundPatternColor(XmlColor foregroundPatternColor) {
        this.foregroundPatternColor = foregroundPatternColor;
        return this;
    }

    /**
     * Gets or sets the color that's applied to the foreground of the Shading object.
    * @return foregroundPatternColor
    **/
    @ApiModelProperty(value = "Gets or sets the color that's applied to the foreground of the Shading object.")
    public XmlColor getForegroundPatternColor() {
        return foregroundPatternColor;
    }

    public void setForegroundPatternColor(XmlColor foregroundPatternColor) {
        this.foregroundPatternColor = foregroundPatternColor;
    }

    public Shading texture(TextureEnum texture) {
        this.texture = texture;
        return this;
    }

    /**
     * Gets or sets the shading texture.
    * @return texture
    **/
    @ApiModelProperty(value = "Gets or sets the shading texture.")
    public TextureEnum getTexture() {
        return texture;
    }

    public void setTexture(TextureEnum texture) {
        this.texture = texture;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Shading shading = (Shading) o;
        return
            Objects.equals(this.backgroundPatternColor, shading.backgroundPatternColor) &&
            Objects.equals(this.foregroundPatternColor, shading.foregroundPatternColor) &&
            Objects.equals(this.texture, shading.texture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundPatternColor, foregroundPatternColor, texture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shading {\n");
    sb.append("    backgroundPatternColor: ").append(toIndentedString(backgroundPatternColor)).append("\n");
    sb.append("    foregroundPatternColor: ").append(toIndentedString(foregroundPatternColor)).append("\n");
    sb.append("    texture: ").append(toIndentedString(texture)).append("\n");
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
