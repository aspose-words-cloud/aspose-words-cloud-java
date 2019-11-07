
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ClassifyDocumentRequest.java">
 *   Copyright (c) 2019 Aspose.Words for Cloud
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
 * --------------------------------------------------------------------------------------
 */
package com.aspose.words.cloud.model.requests;
import com.aspose.words.cloud.model.*;
import java.io.File;

/*
 * Request model for classifyDocument operation.
 */
public class ClassifyDocumentRequest {
    /*
     * The document name.
     */
    private String DocumentName;

    /*
     * Original document folder.
     */
    private String Folder;

    /*
     * Original document storage.
     */
    private String Storage;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private String LoadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private String Password;

    /*
     * Count of the best classes to return.
     */
    private String BestClassesCount;

    /*
     * Taxonomy to use for classification return.
     */
    private String Taxonomy;
    
    /*
     * Initializes a new instance of the classifyDocumentRequest class.
     *  
     * @param String documentName The document name.
     * @param String folder Original document folder.
     * @param String storage Original document storage.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param String bestClassesCount Count of the best classes to return.
     * @param String taxonomy Taxonomy to use for classification return.
     */
    public ClassifyDocumentRequest(String documentName,  String folder,  String storage,  String loadEncoding,  String password,  String bestClassesCount,  String taxonomy) {
        DocumentName = documentName;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        BestClassesCount = bestClassesCount;
        Taxonomy = taxonomy;
    }

    /*
     *  Gets The document name.
     */
    public String getDocumentName() {
        return DocumentName;
    }

    /*
     * Sets The document name.
     */
    public void setDocumentName(String value) {
        DocumentName = value;
    }

    /*
     *  Gets Original document folder.
     */
    public String getFolder() {
        return Folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder(String value) {
        Folder = value;
    }

    /*
     *  Gets Original document storage.
     */
    public String getStorage() {
        return Storage;
    }

    /*
     * Sets Original document storage.
     */
    public void setStorage(String value) {
        Storage = value;
    }

    /*
     *  Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public String getLoadEncoding() {
        return LoadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding(String value) {
        LoadEncoding = value;
    }

    /*
     *  Gets Password for opening an encrypted document.
     */
    public String getPassword() {
        return Password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword(String value) {
        Password = value;
    }

    /*
     *  Gets Count of the best classes to return.
     */
    public String getBestClassesCount() {
        return BestClassesCount;
    }

    /*
     * Sets Count of the best classes to return.
     */
    public void setBestClassesCount(String value) {
        BestClassesCount = value;
    }

    /*
     *  Gets Taxonomy to use for classification return.
     */
    public String getTaxonomy() {
        return Taxonomy;
    }

    /*
     * Sets Taxonomy to use for classification return.
     */
    public void setTaxonomy(String value) {
        Taxonomy = value;
    }
}
/*