/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReportBuildOptions.java">
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
 * Specifies options controlling behavior of ReportingEngine while building a report.
 */
@JsonAdapter(ReportBuildOptions.Adapter.class)
public enum ReportBuildOptions {
    NONE("None"),
    ALLOWMISSINGMEMBERS("AllowMissingMembers"),
    REMOVEEMPTYPARAGRAPHS("RemoveEmptyParagraphs"),
    INLINEERRORMESSAGES("InlineErrorMessages"),
    USELEGACYHEADERFOOTERVISITING("UseLegacyHeaderFooterVisiting"),
    RESPECTJPEGEXIFORIENTATION("RespectJpegExifOrientation"),
    UPDATEFIELDSSYNTAXAWARE("UpdateFieldsSyntaxAware");

    private String value;

    ReportBuildOptions(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportBuildOptions fromValue(String text) {
        for (ReportBuildOptions b : ReportBuildOptions.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter< ReportBuildOptions > {
        @Override
        public void write(final JsonWriter jsonWriter, final ReportBuildOptions enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReportBuildOptions read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ReportBuildOptions.fromValue(String.valueOf(value));
        }
    }
}

