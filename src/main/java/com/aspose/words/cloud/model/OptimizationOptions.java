/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OptimizationOptions.java">
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
 * Container class for the document optimization options.
 */
@ApiModel(description = "Container class for the document optimization options.")
public class OptimizationOptions {
    /**
     * Gets or sets the specific MSWord version.
     */
    @JsonAdapter(MsWordVersionEnum.Adapter.class)
    public enum MsWordVersionEnum {
        WORD2000("Word2000"),
        WORD2002("Word2002"),
        WORD2003("Word2003"),
        WORD2007("Word2007"),
        WORD2010("Word2010"),
        WORD2013("Word2013"),
        WORD2016("Word2016"),
        WORD2019("Word2019");

        private String value;

        MsWordVersionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MsWordVersionEnum fromValue(String text) {
            for (MsWordVersionEnum b : MsWordVersionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< MsWordVersionEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final MsWordVersionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MsWordVersionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MsWordVersionEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("MsWordVersion")
    private MsWordVersionEnum msWordVersion = null;
    public OptimizationOptions msWordVersion(MsWordVersionEnum msWordVersion) {
        this.msWordVersion = msWordVersion;
        return this;
    }

    /**
     * Gets or sets the specific MSWord version.
    * @return msWordVersion
    **/
    @ApiModelProperty(value = "Gets or sets the specific MSWord version.")
    public MsWordVersionEnum getMsWordVersion() {
        return msWordVersion;
    }

    public void setMsWordVersion(MsWordVersionEnum msWordVersion) {
        this.msWordVersion = msWordVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OptimizationOptions optimizationOptions = (OptimizationOptions) o;
        return
            Objects.equals(this.msWordVersion, optimizationOptions.msWordVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msWordVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationOptions {\n");
    sb.append("    msWordVersion: ").append(toIndentedString(msWordVersion)).append("\n");
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
