/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDocumentStatisticsRequest.java">
 *   Copyright (c) 2018 Aspose.Words for Cloud
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
 * Request model for getDocumentStatistics operation.
 */
public class GetDocumentStatisticsRequest {
    /*
     * The document name.
     */
    private String Name;

    /*
     * Original document folder.
     */
    private String Folder;

    /*
     * File storage, which have to be used.
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
     * Support including/excluding comments from the WordCount. Default value is \"true\".
     */
    private Boolean IncludeComments;

    /*
     * Support including/excluding footnotes from the WordCount. Default value is \"false\".
     */
    private Boolean IncludeFootnotes;

    /*
     * Support including/excluding shape's text from the WordCount. Default value is \"false\"
     */
    private Boolean IncludeTextInShapes;
    
    /*
     * Initializes a new instance of the getDocumentStatisticsRequest class.
     *  
     * @param String name The document name.
     * @param String folder Original document folder.
     * @param String storage File storage, which have to be used.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param Boolean includeComments Support including/excluding comments from the WordCount. Default value is \"true\".
     * @param Boolean includeFootnotes Support including/excluding footnotes from the WordCount. Default value is \"false\".
     * @param Boolean includeTextInShapes Support including/excluding shape's text from the WordCount. Default value is \"false\"
     */
    public GetDocumentStatisticsRequest(String name,  String folder,  String storage,  String loadEncoding,  String password,  Boolean includeComments,  Boolean includeFootnotes,  Boolean includeTextInShapes) {
        Name = name;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        IncludeComments = includeComments;
        IncludeFootnotes = includeFootnotes;
        IncludeTextInShapes = includeTextInShapes;
    }

    /*
     *  Gets The document name.
     */
    public String getName() {
        return Name;
    }

    /*
     * Sets The document name.
     */
    public void setName(String value) {
        Name = value;
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
     *  Gets File storage, which have to be used.
     */
    public String getStorage() {
        return Storage;
    }

    /*
     * Sets File storage, which have to be used.
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
     *  Gets Support including/excluding comments from the WordCount. Default value is \"true\".
     */
    public Boolean getIncludeComments() {
        return IncludeComments;
    }

    /*
     * Sets Support including/excluding comments from the WordCount. Default value is \"true\".
     */
    public void setIncludeComments(Boolean value) {
        IncludeComments = value;
    }

    /*
     *  Gets Support including/excluding footnotes from the WordCount. Default value is \"false\".
     */
    public Boolean getIncludeFootnotes() {
        return IncludeFootnotes;
    }

    /*
     * Sets Support including/excluding footnotes from the WordCount. Default value is \"false\".
     */
    public void setIncludeFootnotes(Boolean value) {
        IncludeFootnotes = value;
    }

    /*
     *  Gets Support including/excluding shape's text from the WordCount. Default value is \"false\"
     */
    public Boolean getIncludeTextInShapes() {
        return IncludeTextInShapes;
    }

    /*
     * Sets Support including/excluding shape's text from the WordCount. Default value is \"false\"
     */
    public void setIncludeTextInShapes(Boolean value) {
        IncludeTextInShapes = value;
    }
}
