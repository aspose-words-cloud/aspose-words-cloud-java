/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDocumentFieldNamesRequest.java">
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
 * Request model for getDocumentFieldNames operation.
 */
public class GetDocumentFieldNamesRequest {
    /*
     * The template name.
     */
    private String name;

    /*
     * Original document folder.
     */
    private String folder;

    /*
     * Original document storage.
     */
    private String storage;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private String loadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private String password;

    /*
     * If true, result includes "mustache" field names.
     */
    private Boolean useNonMergeFields;

    /*
     * Initializes a new instance of the GetDocumentFieldNamesRequest class.
     *
     * @param String name The template name.
     * @param String folder Original document folder.
     * @param String storage Original document storage.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param Boolean useNonMergeFields If true, result includes "mustache" field names.
     */
    public GetDocumentFieldNamesRequest(String name, String folder, String storage, String loadEncoding, String password, Boolean useNonMergeFields) {
        this.name = name;
        this.folder = folder;
        this.storage = storage;
        this.loadEncoding = loadEncoding;
        this.password = password;
        this.useNonMergeFields = useNonMergeFields;
    }

    /*
     * Gets The template name.
     */
    public String getName() {
        return this.name;
    }

    /*
     * Sets The template name.
     */
    public void setName(String value) {
        this.name = value;
    }

    /*
     * Gets Original document folder.
     */
    public String getFolder() {
        return this.folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder(String value) {
        this.folder = value;
    }

    /*
     * Gets Original document storage.
     */
    public String getStorage() {
        return this.storage;
    }

    /*
     * Sets Original document storage.
     */
    public void setStorage(String value) {
        this.storage = value;
    }

    /*
     * Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public String getLoadEncoding() {
        return this.loadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding(String value) {
        this.loadEncoding = value;
    }

    /*
     * Gets Password for opening an encrypted document.
     */
    public String getPassword() {
        return this.password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword(String value) {
        this.password = value;
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
