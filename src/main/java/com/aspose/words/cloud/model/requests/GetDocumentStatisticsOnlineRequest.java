/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDocumentStatisticsOnlineRequest.java">
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
 * Request model for getDocumentStatisticsOnline operation.
 */
public class GetDocumentStatisticsOnlineRequest {
    /*
     * The document.
     */
    private byte[] document;

    /*
     * Support including/excluding comments from the WordCount. Default value is "false".
     */
    private Boolean includeComments;

    /*
     * Support including/excluding footnotes from the WordCount. Default value is "false".
     */
    private Boolean includeFootnotes;

    /*
     * Support including/excluding shape's text from the WordCount. Default value is "false".
     */
    private Boolean includeTextInShapes;

    /*
     * Initializes a new instance of the GetDocumentStatisticsOnlineRequest class.
     *
     * @param byte[] document The document.
     * @param Boolean includeComments Support including/excluding comments from the WordCount. Default value is "false".
     * @param Boolean includeFootnotes Support including/excluding footnotes from the WordCount. Default value is "false".
     * @param Boolean includeTextInShapes Support including/excluding shape's text from the WordCount. Default value is "false".
     */
    public GetDocumentStatisticsOnlineRequest(byte[] document, Boolean includeComments, Boolean includeFootnotes, Boolean includeTextInShapes) {
        this.document = document;
        this.includeComments = includeComments;
        this.includeFootnotes = includeFootnotes;
        this.includeTextInShapes = includeTextInShapes;
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
     * Gets Support including/excluding comments from the WordCount. Default value is "false".
     */
    public Boolean getIncludeComments() {
        return this.includeComments;
    }

    /*
     * Sets Support including/excluding comments from the WordCount. Default value is "false".
     */
    public void setIncludeComments(Boolean value) {
        this.includeComments = value;
    }

    /*
     * Gets Support including/excluding footnotes from the WordCount. Default value is "false".
     */
    public Boolean getIncludeFootnotes() {
        return this.includeFootnotes;
    }

    /*
     * Sets Support including/excluding footnotes from the WordCount. Default value is "false".
     */
    public void setIncludeFootnotes(Boolean value) {
        this.includeFootnotes = value;
    }

    /*
     * Gets Support including/excluding shape's text from the WordCount. Default value is "false".
     */
    public Boolean getIncludeTextInShapes() {
        return this.includeTextInShapes;
    }

    /*
     * Sets Support including/excluding shape's text from the WordCount. Default value is "false".
     */
    public void setIncludeTextInShapes(Boolean value) {
        this.includeTextInShapes = value;
    }
}
