/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BuildReportOnlineRequest.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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

package com.aspose.words.cloud.model.requests;

import com.aspose.words.cloud.model.*;
import java.io.File;

/*
 * Request model for buildReportOnline operation.
 */
public class BuildReportOnlineRequest {
    /*
     * File with template.
     */
    private byte[] template;

    /*
     * A string providing a data to populate the specified template. The string must be of one of the following types: xml, json, csv.
     */
    private String data;

    /*
     * An object providing a settings of report engine.
     */
    private ReportEngineSettings reportEngineSettings;

    /*
     * This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "template" will be used instead.
     */
    private String documentFileName;

    /*
     * Initializes a new instance of the BuildReportOnlineRequest class.
     *
     * @param byte[] template File with template.
     * @param String data A string providing a data to populate the specified template. The string must be of one of the following types: xml, json, csv.
     * @param ReportEngineSettings reportEngineSettings An object providing a settings of report engine.
     * @param String documentFileName This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "template" will be used instead.
     */
    public BuildReportOnlineRequest(byte[] template, String data, ReportEngineSettings reportEngineSettings, String documentFileName) {
        this.template = template;
        this.data = data;
        this.reportEngineSettings = reportEngineSettings;
        this.documentFileName = documentFileName;
    }

    /*
     * Gets File with template.
     */
    public byte[] getTemplate() {
        return this.template;
    }

    /*
     * Sets File with template.
     */
    public void setTemplate(byte[] value) {
        this.template = value;
    }

    /*
     * Gets A string providing a data to populate the specified template. The string must be of one of the following types: xml, json, csv.
     */
    public String getData() {
        return this.data;
    }

    /*
     * Sets A string providing a data to populate the specified template. The string must be of one of the following types: xml, json, csv.
     */
    public void setData(String value) {
        this.data = value;
    }

    /*
     * Gets An object providing a settings of report engine.
     */
    public ReportEngineSettings getReportEngineSettings() {
        return this.reportEngineSettings;
    }

    /*
     * Sets An object providing a settings of report engine.
     */
    public void setReportEngineSettings(ReportEngineSettings value) {
        this.reportEngineSettings = value;
    }

    /*
     * Gets This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "template" will be used instead.
     */
    public String getDocumentFileName() {
        return this.documentFileName;
    }

    /*
     * Sets This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "template" will be used instead.
     */
    public void setDocumentFileName(String value) {
        this.documentFileName = value;
    }
}
