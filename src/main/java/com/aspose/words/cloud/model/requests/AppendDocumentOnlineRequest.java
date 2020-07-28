/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AppendDocumentOnlineRequest.java">
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
 * Request model for appendDocumentOnline operation.
 */
public class AppendDocumentOnlineRequest {
    /*
     * The document.
     */
    private byte[] document;

    /*
     * <see cref="DocumentEntryList"/> with a list of documents to append.
     */
    private DocumentEntryList documentList;

    /*
     * Initializes a new instance of the AppendDocumentOnlineRequest class.
     *
     * @param byte[] document The document.
     * @param DocumentEntryList documentList <see cref="DocumentEntryList"/> with a list of documents to append.
     */
    public AppendDocumentOnlineRequest(byte[] document, DocumentEntryList documentList) {
        this.document = document;
        this.documentList = documentList;
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
     * Gets <see cref="DocumentEntryList"/> with a list of documents to append.
     */
    public DocumentEntryList getDocumentList() {
        return this.documentList;
    }

    /*
     * Sets <see cref="DocumentEntryList"/> with a list of documents to append.
     */
    public void setDocumentList(DocumentEntryList value) {
        this.documentList = value;
    }
}
