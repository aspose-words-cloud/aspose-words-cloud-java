
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveAsRangeRequest.java">
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
 * Request model for saveAsRange operation.
 */
public class SaveAsRangeRequest {
    /*
     * The document.
     */
    private String Name;

    /*
     * The range start identifier. Identifier is the value of the \"nodeId\" field, which every document node has, extended with the prefix \"id\". It looks like \"id0.0.7\". Also values like \"image5\" and \"table3\" can be used as an identifier for images and tables, where the number is an index of the image/table.
     */
    private String RangeStartIdentifier;

    /*
     * Parameters of a new document.
     */
    private RangeDocument DocumentParameters;

    /*
     * The range end identifier.
     */
    private String RangeEndIdentifier;

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
     * Initializes a new instance of the saveAsRangeRequest class.
     *  
     * @param String name The document.
     * @param String rangeStartIdentifier The range start identifier. Identifier is the value of the \"nodeId\" field, which every document node has, extended with the prefix \"id\". It looks like \"id0.0.7\". Also values like \"image5\" and \"table3\" can be used as an identifier for images and tables, where the number is an index of the image/table.
     * @param RangeDocument documentParameters Parameters of a new document.
     * @param String rangeEndIdentifier The range end identifier.
     * @param String folder Original document folder.
     * @param String storage Original document storage.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     */
    public SaveAsRangeRequest(String name,  String rangeStartIdentifier,  RangeDocument documentParameters,  String rangeEndIdentifier,  String folder,  String storage,  String loadEncoding,  String password) {
        Name = name;
        RangeStartIdentifier = rangeStartIdentifier;
        DocumentParameters = documentParameters;
        RangeEndIdentifier = rangeEndIdentifier;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
    }

    /*
     *  Gets The document.
     */
    public String getName() {
        return Name;
    }

    /*
     * Sets The document.
     */
    public void setName(String value) {
        Name = value;
    }

    /*
     *  Gets The range start identifier. Identifier is the value of the \"nodeId\" field, which every document node has, extended with the prefix \"id\". It looks like \"id0.0.7\". Also values like \"image5\" and \"table3\" can be used as an identifier for images and tables, where the number is an index of the image/table.
     */
    public String getRangeStartIdentifier() {
        return RangeStartIdentifier;
    }

    /*
     * Sets The range start identifier. Identifier is the value of the \"nodeId\" field, which every document node has, extended with the prefix \"id\". It looks like \"id0.0.7\". Also values like \"image5\" and \"table3\" can be used as an identifier for images and tables, where the number is an index of the image/table.
     */
    public void setRangeStartIdentifier(String value) {
        RangeStartIdentifier = value;
    }

    /*
     *  Gets Parameters of a new document.
     */
    public RangeDocument getDocumentParameters() {
        return DocumentParameters;
    }

    /*
     * Sets Parameters of a new document.
     */
    public void setDocumentParameters(RangeDocument value) {
        DocumentParameters = value;
    }

    /*
     *  Gets The range end identifier.
     */
    public String getRangeEndIdentifier() {
        return RangeEndIdentifier;
    }

    /*
     * Sets The range end identifier.
     */
    public void setRangeEndIdentifier(String value) {
        RangeEndIdentifier = value;
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
}
/*