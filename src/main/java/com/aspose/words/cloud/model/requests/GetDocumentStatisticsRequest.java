/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDocumentStatisticsRequest.java">
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
 * Request model for getDocumentStatistics operation.
 */
public class GetDocumentStatisticsRequest {
    /*
     * The document name.
     */
    private  Name;

    /*
     * Original document folder.
     */
    private  Folder;

    /*
     * Original document storage.
     */
    private  Storage;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private  LoadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private  Password;

    /*
     * Support including/excluding comments from the WordCount. Default value is "false".
     */
    private  IncludeComments;

    /*
     * Support including/excluding footnotes from the WordCount. Default value is "false".
     */
    private  IncludeFootnotes;

    /*
     * Support including/excluding shape's text from the WordCount. Default value is "false".
     */
    private  IncludeTextInShapes;
    
    /*
     * Initializes a new instance of the getDocumentStatisticsRequest class.
     *  
     * @param  name The document name.
     * @param  folder Original document folder.
     * @param  storage Original document storage.
     * @param  loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param  password Password for opening an encrypted document.
     * @param  includeComments Support including/excluding comments from the WordCount. Default value is "false".
     * @param  includeFootnotes Support including/excluding footnotes from the WordCount. Default value is "false".
     * @param  includeTextInShapes Support including/excluding shape's text from the WordCount. Default value is "false".
     */
    public GetDocumentStatisticsRequest( name,   folder,   storage,   loadEncoding,   password,   includeComments,   includeFootnotes,   includeTextInShapes) {
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
    public  getName() {
        return Name;
    }

    /*
     * Sets The document name.
     */
    public void setName( value) {
        Name = value;
    }

    /*
     *  Gets Original document folder.
     */
    public  getFolder() {
        return Folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder( value) {
        Folder = value;
    }

    /*
     *  Gets Original document storage.
     */
    public  getStorage() {
        return Storage;
    }

    /*
     * Sets Original document storage.
     */
    public void setStorage( value) {
        Storage = value;
    }

    /*
     *  Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public  getLoadEncoding() {
        return LoadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding( value) {
        LoadEncoding = value;
    }

    /*
     *  Gets Password for opening an encrypted document.
     */
    public  getPassword() {
        return Password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword( value) {
        Password = value;
    }

    /*
     *  Gets Support including/excluding comments from the WordCount. Default value is "false".
     */
    public  getIncludeComments() {
        return IncludeComments;
    }

    /*
     * Sets Support including/excluding comments from the WordCount. Default value is "false".
     */
    public void setIncludeComments( value) {
        IncludeComments = value;
    }

    /*
     *  Gets Support including/excluding footnotes from the WordCount. Default value is "false".
     */
    public  getIncludeFootnotes() {
        return IncludeFootnotes;
    }

    /*
     * Sets Support including/excluding footnotes from the WordCount. Default value is "false".
     */
    public void setIncludeFootnotes( value) {
        IncludeFootnotes = value;
    }

    /*
     *  Gets Support including/excluding shape's text from the WordCount. Default value is "false".
     */
    public  getIncludeTextInShapes() {
        return IncludeTextInShapes;
    }

    /*
     * Sets Support including/excluding shape's text from the WordCount. Default value is "false".
     */
    public void setIncludeTextInShapes( value) {
        IncludeTextInShapes = value;
    }
}
