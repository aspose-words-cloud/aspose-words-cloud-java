/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ExecuteMailMergeOnlineRequest.java">
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
 * Request model for executeMailMergeOnline operation.
 */
public class ExecuteMailMergeOnlineRequest {
    /*
     * File with template.
     */
    private byte[] template;

    /*
     * File with mailmerge data.
     */
    private byte[] data;

    /*
     * With regions flag.
     */
    private Boolean withRegions;

    /*
     * Clean up options.
     */
    private String cleanup;

    /*
     * This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "template" will be used instead.
     */
    private String documentFileName;

    /*
     * Initializes a new instance of the ExecuteMailMergeOnlineRequest class.
     *
     * @param byte[] template File with template.
     * @param byte[] data File with mailmerge data.
     * @param Boolean withRegions With regions flag.
     * @param String cleanup Clean up options.
     * @param String documentFileName This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "template" will be used instead.
     */
    public ExecuteMailMergeOnlineRequest(byte[] template, byte[] data, Boolean withRegions, String cleanup, String documentFileName) {
        this.template = template;
        this.data = data;
        this.withRegions = withRegions;
        this.cleanup = cleanup;
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
     * Gets File with mailmerge data.
     */
    public byte[] getData() {
        return this.data;
    }

    /*
     * Sets File with mailmerge data.
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /*
     * Gets With regions flag.
     */
    public Boolean getWithRegions() {
        return this.withRegions;
    }

    /*
     * Sets With regions flag.
     */
    public void setWithRegions(Boolean value) {
        this.withRegions = value;
    }

    /*
     * Gets Clean up options.
     */
    public String getCleanup() {
        return this.cleanup;
    }

    /*
     * Sets Clean up options.
     */
    public void setCleanup(String value) {
        this.cleanup = value;
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
