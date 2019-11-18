
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetHeaderFooterOfSectionRequest.java">
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
 * Request model for getHeaderFooterOfSection operation.
 */
public class GetHeaderFooterOfSectionRequest {
    /*
     * The document name.
     */
    private String Name;

    /*
     * Header/footer index.
     */
    private Integer HeaderFooterIndex;

    /*
     * Section index.
     */
    private Integer SectionIndex;

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
     * List of types of headers and footers.
     */
    private String FilterByType;
    
    /*
     * Initializes a new instance of the getHeaderFooterOfSectionRequest class.
     *  
     * @param String name The document name.
     * @param Integer headerFooterIndex Header/footer index.
     * @param Integer sectionIndex Section index.
     * @param String folder Original document folder.
     * @param String storage Original document storage.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param String filterByType List of types of headers and footers.
     */
    public GetHeaderFooterOfSectionRequest(String name,  Integer headerFooterIndex,  Integer sectionIndex,  String folder,  String storage,  String loadEncoding,  String password,  String filterByType) {
        Name = name;
        HeaderFooterIndex = headerFooterIndex;
        SectionIndex = sectionIndex;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        FilterByType = filterByType;
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
     *  Gets Header/footer index.
     */
    public Integer getHeaderFooterIndex() {
        return HeaderFooterIndex;
    }

    /*
     * Sets Header/footer index.
     */
    public void setHeaderFooterIndex(Integer value) {
        HeaderFooterIndex = value;
    }

    /*
     *  Gets Section index.
     */
    public Integer getSectionIndex() {
        return SectionIndex;
    }

    /*
     * Sets Section index.
     */
    public void setSectionIndex(Integer value) {
        SectionIndex = value;
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
     *  Gets List of types of headers and footers.
     */
    public String getFilterByType() {
        return FilterByType;
    }

    /*
     * Sets List of types of headers and footers.
     */
    public void setFilterByType(String value) {
        FilterByType = value;
    }
}
/*