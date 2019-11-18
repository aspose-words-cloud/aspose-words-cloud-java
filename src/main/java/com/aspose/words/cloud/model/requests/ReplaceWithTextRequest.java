
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReplaceWithTextRequest.java">
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
 * Request model for replaceWithText operation.
 */
public class ReplaceWithTextRequest {
    /*
     * The document.
     */
    private String Name;

    /*
     * The range start identifier. Identifier is the value of the \"nodeId\" field, which every document node has, extended with the prefix \"id\". It looks like \"id0.0.7\". Also values like \"image5\" and \"table3\" can be used as an identifier for images and tables, where the number is an index of the image/table.
     */
    private String RangeStartIdentifier;

    /*
     * Model with text for replacement.
     */
    private ReplaceRange RangeText;

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
     * Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    private String DestFileName;
    
    /*
     * Initializes a new instance of the replaceWithTextRequest class.
     *  
     * @param String name The document.
     * @param String rangeStartIdentifier The range start identifier. Identifier is the value of the \"nodeId\" field, which every document node has, extended with the prefix \"id\". It looks like \"id0.0.7\". Also values like \"image5\" and \"table3\" can be used as an identifier for images and tables, where the number is an index of the image/table.
     * @param ReplaceRange rangeText Model with text for replacement.
     * @param String rangeEndIdentifier The range end identifier.
     * @param String folder Original document folder.
     * @param String storage Original document storage.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param String destFileName Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public ReplaceWithTextRequest(String name,  String rangeStartIdentifier,  ReplaceRange rangeText,  String rangeEndIdentifier,  String folder,  String storage,  String loadEncoding,  String password,  String destFileName) {
        Name = name;
        RangeStartIdentifier = rangeStartIdentifier;
        RangeText = rangeText;
        RangeEndIdentifier = rangeEndIdentifier;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        DestFileName = destFileName;
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
     *  Gets Model with text for replacement.
     */
    public ReplaceRange getRangeText() {
        return RangeText;
    }

    /*
     * Sets Model with text for replacement.
     */
    public void setRangeText(ReplaceRange value) {
        RangeText = value;
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

    /*
     *  Gets Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public String getDestFileName() {
        return DestFileName;
    }

    /*
     * Sets Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public void setDestFileName(String value) {
        DestFileName = value;
    }
}
/*