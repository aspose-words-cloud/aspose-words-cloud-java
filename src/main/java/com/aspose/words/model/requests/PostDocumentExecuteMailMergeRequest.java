/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostDocumentExecuteMailMergeRequest.java">
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
package com.aspose.words.model.requests;
import com.aspose.words.model.*;
import java.io.File;

/*
 * Request model for postDocumentExecuteMailMerge operation.
 */
public class PostDocumentExecuteMailMergeRequest {
    /*
     * 
     */
    private String Name;

    /*
     * Mail merge data
     */
    private String Data;

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
     * 
     */
    private Boolean WithRegions;

    /*
     * 
     */
    private String MailMergeDataFile;

    /*
     * 
     */
    private String Cleanup;

    /*
     * 
     */
    private Boolean UseWholeParagraphAsRegion;

    /*
     * 
     */
    private String DestFileName;
    
    /*
     * Initializes a new instance of the postDocumentExecuteMailMergeRequest class.
     *  
     * @param String name 
     * @param String data Mail merge data
     * @param String folder Original document folder.
     * @param String storage File storage, which have to be used.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param Boolean withRegions 
     * @param String mailMergeDataFile 
     * @param String cleanup 
     * @param Boolean useWholeParagraphAsRegion 
     * @param String destFileName 
     */
    public PostDocumentExecuteMailMergeRequest(String name,  String data,  String folder,  String storage,  String loadEncoding,  String password,  Boolean withRegions,  String mailMergeDataFile,  String cleanup,  Boolean useWholeParagraphAsRegion,  String destFileName) {
        Name = name;
        Data = data;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        WithRegions = withRegions;
        MailMergeDataFile = mailMergeDataFile;
        Cleanup = cleanup;
        UseWholeParagraphAsRegion = useWholeParagraphAsRegion;
        DestFileName = destFileName;
    }

    /*
     * 
     */
    public String getName() {
        return Name;
    }

    /*
     * 
     */
    public void setName(String value) {
        Name = value;
    }

    /*
     *  Gets Mail merge data
     */
    public String getData() {
        return Data;
    }

    /*
     * Sets Mail merge data
     */
    public void setData(String value) {
        Data = value;
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
     * 
     */
    public Boolean getWithRegions() {
        return WithRegions;
    }

    /*
     * 
     */
    public void setWithRegions(Boolean value) {
        WithRegions = value;
    }

    /*
     * 
     */
    public String getMailMergeDataFile() {
        return MailMergeDataFile;
    }

    /*
     * 
     */
    public void setMailMergeDataFile(String value) {
        MailMergeDataFile = value;
    }

    /*
     * 
     */
    public String getCleanup() {
        return Cleanup;
    }

    /*
     * 
     */
    public void setCleanup(String value) {
        Cleanup = value;
    }

    /*
     * 
     */
    public Boolean getUseWholeParagraphAsRegion() {
        return UseWholeParagraphAsRegion;
    }

    /*
     * 
     */
    public void setUseWholeParagraphAsRegion(Boolean value) {
        UseWholeParagraphAsRegion = value;
    }

    /*
     * 
     */
    public String getDestFileName() {
        return DestFileName;
    }

    /*
     * 
     */
    public void setDestFileName(String value) {
        DestFileName = value;
    }
}
