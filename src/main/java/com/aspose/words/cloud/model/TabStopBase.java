/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TabStopBase.java">
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
 * Base class for paragraph format tab stop DTO.
 */
@ApiModel(description = "Base class for paragraph format tab stop DTO.")
public class TabStopBase {
    /**
     * Gets or sets the alignment of text at this tab stop.
     */
    @JsonAdapter(AlignmentEnum.Adapter.class)
    public enum AlignmentEnum {
        LEFT("Left"),
        CENTER("Center"),
        RIGHT("Right"),
        DECIMAL("Decimal"),
        BAR("Bar"),
        LIST("List"),
        CLEAR("Clear");

        private String value;

        AlignmentEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AlignmentEnum fromValue(String text) {
            for (AlignmentEnum b : AlignmentEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< AlignmentEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final AlignmentEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AlignmentEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AlignmentEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or sets the type of the leader line displayed under the tab character.
     */
    @JsonAdapter(LeaderEnum.Adapter.class)
    public enum LeaderEnum {
        NONE("None"),
        DOTS("Dots"),
        DASHES("Dashes"),
        LINE("Line"),
        HEAVY("Heavy"),
        MIDDLEDOT("MiddleDot");

        private String value;

        LeaderEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LeaderEnum fromValue(String text) {
            for (LeaderEnum b : LeaderEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< LeaderEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final LeaderEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LeaderEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LeaderEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("Alignment")
    private AlignmentEnum alignment = null;

    @SerializedName("Leader")
    private LeaderEnum leader = null;

    @SerializedName("Position")
    private Double position = null;
    public TabStopBase alignment(AlignmentEnum alignment) {
        this.alignment = alignment;
        return this;
    }

    /**
     * Gets or sets the alignment of text at this tab stop.
    * @return alignment
    **/
    @ApiModelProperty(value = "Gets or sets the alignment of text at this tab stop.")
    public AlignmentEnum getAlignment() {
        return alignment;
    }

    public void setAlignment(AlignmentEnum alignment) {
        this.alignment = alignment;
    }

    public TabStopBase leader(LeaderEnum leader) {
        this.leader = leader;
        return this;
    }

    /**
     * Gets or sets the type of the leader line displayed under the tab character.
    * @return leader
    **/
    @ApiModelProperty(value = "Gets or sets the type of the leader line displayed under the tab character.")
    public LeaderEnum getLeader() {
        return leader;
    }

    public void setLeader(LeaderEnum leader) {
        this.leader = leader;
    }

    public TabStopBase position(Double position) {
        this.position = position;
        return this;
    }

    /**
     * Gets or sets the position of the tab stop in points.
    * @return position
    **/
    @ApiModelProperty(value = "Gets or sets the position of the tab stop in points.")
    public Double getPosition() {
        return position;
    }

    public void setPosition(Double position) {
        this.position = position;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TabStopBase tabStopBase = (TabStopBase) o;
        return
            Objects.equals(this.alignment, tabStopBase.alignment) &&
            Objects.equals(this.leader, tabStopBase.leader) &&
            Objects.equals(this.position, tabStopBase.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, leader, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabStopBase {\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
