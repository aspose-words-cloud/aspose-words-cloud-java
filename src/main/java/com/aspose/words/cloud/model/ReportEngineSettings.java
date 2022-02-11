/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReportEngineSettings.java">
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
 * Report engine settings.
 */
@ApiModel(description = "Report engine settings.")
public class ReportEngineSettings {
    /**
     * Gets or sets type of datasource.
     */
    @JsonAdapter(DataSourceTypeEnum.Adapter.class)
    public enum DataSourceTypeEnum {
        XML("Xml"),
        JSON("Json"),
        CSV("Csv");

        private String value;

        DataSourceTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static DataSourceTypeEnum fromValue(String text) {
            for (DataSourceTypeEnum b : DataSourceTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter< DataSourceTypeEnum > {
            @Override
            public void write(final JsonWriter jsonWriter, final DataSourceTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DataSourceTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DataSourceTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("CsvDataLoadOptions")
    protected CsvDataLoadOptions csvDataLoadOptions;

    @SerializedName("DataSourceName")
    protected String dataSourceName;

    @SerializedName("DataSourceType")
    protected DataSourceTypeEnum dataSourceType;

    @SerializedName("JsonDataLoadOptions")
    protected JsonDataLoadOptions jsonDataLoadOptions;

    @SerializedName("ReportBuildOptions")
    protected List<ReportBuildOptions> reportBuildOptions;

    @SerializedName("XmlDataLoadOptions")
    protected XmlDataLoadOptions xmlDataLoadOptions;
    /**
     * Gets or sets the options for parsing CSV data.
    * @return csvDataLoadOptions
    **/
    @ApiModelProperty(value = "Gets or sets the options for parsing CSV data.")
    public CsvDataLoadOptions getCsvDataLoadOptions() {
        return csvDataLoadOptions;
    }

    public ReportEngineSettings csvDataLoadOptions(CsvDataLoadOptions csvDataLoadOptions) {
        this.csvDataLoadOptions = csvDataLoadOptions;
        return this;
    }

    public void setCsvDataLoadOptions(CsvDataLoadOptions csvDataLoadOptions) {
        this.csvDataLoadOptions = csvDataLoadOptions;
    }


    /**
     * Gets or sets the name to reference the data source object in the template.
    * @return dataSourceName
    **/
    @ApiModelProperty(value = "Gets or sets the name to reference the data source object in the template.")
    public String getDataSourceName() {
        return dataSourceName;
    }

    public ReportEngineSettings dataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }


    /**
     * Gets or sets type of datasource.
    * @return dataSourceType
    **/
    @ApiModelProperty(value = "Gets or sets type of datasource.")
    public DataSourceTypeEnum getDataSourceType() {
        return dataSourceType;
    }

    public ReportEngineSettings dataSourceType(DataSourceTypeEnum dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }

    public void setDataSourceType(DataSourceTypeEnum dataSourceType) {
        this.dataSourceType = dataSourceType;
    }


    /**
     * Gets or sets the options for parsing JSON data.
    * @return jsonDataLoadOptions
    **/
    @ApiModelProperty(value = "Gets or sets the options for parsing JSON data.")
    public JsonDataLoadOptions getJsonDataLoadOptions() {
        return jsonDataLoadOptions;
    }

    public ReportEngineSettings jsonDataLoadOptions(JsonDataLoadOptions jsonDataLoadOptions) {
        this.jsonDataLoadOptions = jsonDataLoadOptions;
        return this;
    }

    public void setJsonDataLoadOptions(JsonDataLoadOptions jsonDataLoadOptions) {
        this.jsonDataLoadOptions = jsonDataLoadOptions;
    }


    /**
     * Gets or sets type of options to build report.
    * @return reportBuildOptions
    **/
    @ApiModelProperty(value = "Gets or sets type of options to build report.")
    public List<ReportBuildOptions> getReportBuildOptions() {
        return reportBuildOptions;
    }

    public ReportEngineSettings reportBuildOptions(List<ReportBuildOptions> reportBuildOptions) {
        this.reportBuildOptions = reportBuildOptions;
        return this;
    }

    public ReportEngineSettings addReportBuildOptionsItem(ReportBuildOptions reportBuildOptionsItem) {
        if (this.reportBuildOptions == null) {
            this.reportBuildOptions = new ArrayList<ReportBuildOptions>();
        }
        this.reportBuildOptions.add(reportBuildOptionsItem);
        return this;
    }


    public void setReportBuildOptions(List<ReportBuildOptions> reportBuildOptions) {
        this.reportBuildOptions = reportBuildOptions;
    }


    /**
     * Gets or sets the options for parsing XML data.
    * @return xmlDataLoadOptions
    **/
    @ApiModelProperty(value = "Gets or sets the options for parsing XML data.")
    public XmlDataLoadOptions getXmlDataLoadOptions() {
        return xmlDataLoadOptions;
    }

    public ReportEngineSettings xmlDataLoadOptions(XmlDataLoadOptions xmlDataLoadOptions) {
        this.xmlDataLoadOptions = xmlDataLoadOptions;
        return this;
    }

    public void setXmlDataLoadOptions(XmlDataLoadOptions xmlDataLoadOptions) {
        this.xmlDataLoadOptions = xmlDataLoadOptions;
    }


    public ReportEngineSettings() {
        this.csvDataLoadOptions = null;
        this.dataSourceName = null;
        this.dataSourceType = null;
        this.jsonDataLoadOptions = null;
        this.reportBuildOptions = null;
        this.xmlDataLoadOptions = null;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReportEngineSettings reportEngineSettings = (ReportEngineSettings) o;
        return
            Objects.equals(this.csvDataLoadOptions, reportEngineSettings.csvDataLoadOptions) &&
            Objects.equals(this.dataSourceName, reportEngineSettings.dataSourceName) &&
            Objects.equals(this.dataSourceType, reportEngineSettings.dataSourceType) &&
            Objects.equals(this.jsonDataLoadOptions, reportEngineSettings.jsonDataLoadOptions) &&
            Objects.equals(this.reportBuildOptions, reportEngineSettings.reportBuildOptions) &&
            Objects.equals(this.xmlDataLoadOptions, reportEngineSettings.xmlDataLoadOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csvDataLoadOptions, dataSourceName, dataSourceType, jsonDataLoadOptions, reportBuildOptions, xmlDataLoadOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportEngineSettings {\n");
    sb.append("    csvDataLoadOptions: ").append(toIndentedString(getCsvDataLoadOptions())).append("\n");
    sb.append("    dataSourceName: ").append(toIndentedString(getDataSourceName())).append("\n");
    sb.append("    dataSourceType: ").append(toIndentedString(getDataSourceType())).append("\n");
    sb.append("    jsonDataLoadOptions: ").append(toIndentedString(getJsonDataLoadOptions())).append("\n");
    sb.append("    reportBuildOptions: ").append(toIndentedString(getReportBuildOptions())).append("\n");
    sb.append("    xmlDataLoadOptions: ").append(toIndentedString(getXmlDataLoadOptions())).append("\n");
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
