/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ApplyStyleToDocumentElementOnlineResponse.java">
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

package com.aspose.words.cloud.model.responses;

import com.aspose.words.cloud.model.*;
import java.util.Map;

/*
 * Response model for applyStyleToDocumentElementOnline operation.
 */
public class ApplyStyleToDocumentElementOnlineResponse implements IMultipartResponse {
    /*
     * The base class for all responses.
     */
    private WordsResponse model;

    /*
     * The document after modification.
     */
    private Map<String, byte[]> document;

    /*
     * Initializes a new instance of the ApplyStyleToDocumentElementOnlineResponse class.
     */
    public ApplyStyleToDocumentElementOnlineResponse() {
        this.model = null;
        this.document = null;
    }

     /*
     * Initializes a new instance of the ApplyStyleToDocumentElementOnlineResponse class.
     */
    public ApplyStyleToDocumentElementOnlineResponse(WordsResponse model, Map<String, byte[]> document) {
        this.model = model;
        this.document = document;
    }

    /*
     * Gets The base class for all responses.
     */
    public WordsResponse getModel() {
        return this.model;
    }

    /*
     * Sets The base class for all responses.
     */
    public void setModel(WordsResponse value) {
        this.model = value;
    }

    /*
     * Gets The document after modification.
     */
    public Map<String, byte[]> getDocument() {
        return this.document;
    }

    /*
     * Sets The document after modification.
     */
    public void setDocument(Map<String, byte[]> value) {
        this.document = value;
    }
}
