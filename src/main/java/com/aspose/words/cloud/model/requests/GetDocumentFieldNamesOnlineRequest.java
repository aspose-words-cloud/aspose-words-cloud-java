/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDocumentFieldNamesOnlineRequest.java">
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
 * Request model for getDocumentFieldNamesOnline operation.
 */
public class GetDocumentFieldNamesOnlineRequest {
    /*
     * The document.
     */
    private byte[] document;

    /*
     * If true, result includes "mustache" field names.
     */
    private Boolean useNonMergeFields;

    /*
     * Initializes a new instance of the GetDocumentFieldNamesOnlineRequest class.
     *
     * @param byte[] document The document.
     * @param Boolean useNonMergeFields If true, result includes "mustache" field names.
     */
    public GetDocumentFieldNamesOnlineRequest(byte[] document, Boolean useNonMergeFields) {
        this.document = document;
        this.useNonMergeFields = useNonMergeFields;
    }

    /*
     * Gets The document.
     */
    public byte[] getDocument() {
        return this.document;
    }

    /*
     * Sets The document.
     */
    public void setDocument(byte[] value) {
        this.document = value;
    }

    /*
     * Gets If true, result includes "mustache" field names.
     */
    public Boolean getUseNonMergeFields() {
        return this.useNonMergeFields;
    }

    /*
     * Sets If true, result includes "mustache" field names.
     */
    public void setUseNonMergeFields(Boolean value) {
        this.useNonMergeFields = value;
    }
}
