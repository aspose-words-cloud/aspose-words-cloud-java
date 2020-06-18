/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SplitDocumentRequest.java">
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
 * Request model for splitDocument operation.
 */
public class SplitDocumentRequest {
    /*
     * Original document name.
     */
    private String name;

    /*
     * Format to split.
     */
    private String format;

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
     * Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    private String destFileName;

    /*
     * Start page.
     */
    private Integer from;

    /*
     * End page.
     */
    private Integer to;

    /*
     * ZipOutput or not.
     */
    private Boolean zipOutput;

    /*
     * Folder in filestorage with custom fonts.
     */
    private String fontsLocation;

    /*
     * Initializes a new instance of the SplitDocumentRequest class.
     *
     * @param String name Original document name.
     * @param String format Format to split.
     * @param String folder Original document folder.
     * @param String storage Original document storage.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param String destFileName Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     * @param Integer from Start page.
     * @param Integer to End page.
     * @param Boolean zipOutput ZipOutput or not.
     * @param String fontsLocation Folder in filestorage with custom fonts.
     */
    public SplitDocumentRequest(String name, String format, String folder, String storage, String loadEncoding, String password, String destFileName, Integer from, Integer to, Boolean zipOutput, String fontsLocation) {
        this.name = name;
        this.format = format;
        this.folder = folder;
        this.storage = storage;
        this.loadEncoding = loadEncoding;
        this.password = password;
        this.destFileName = destFileName;
        this.from = from;
        this.to = to;
        this.zipOutput = zipOutput;
        this.fontsLocation = fontsLocation;
    }

    /*
     * Gets Original document name.
     */
    public String getName() {
        return this.name;
    }

    /*
     * Sets Original document name.
     */
    public void setName(String value) {
        this.name = value;
    }

    /*
     * Gets Format to split.
     */
    public String getFormat() {
        return this.format;
    }

    /*
     * Sets Format to split.
     */
    public void setFormat(String value) {
        this.format = value;
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
     * Gets Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public String getDestFileName() {
        return this.destFileName;
    }

    /*
     * Sets Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public void setDestFileName(String value) {
        this.destFileName = value;
    }

    /*
     * Gets Start page.
     */
    public Integer getFrom() {
        return this.from;
    }

    /*
     * Sets Start page.
     */
    public void setFrom(Integer value) {
        this.from = value;
    }

    /*
     * Gets End page.
     */
    public Integer getTo() {
        return this.to;
    }

    /*
     * Sets End page.
     */
    public void setTo(Integer value) {
        this.to = value;
    }

    /*
     * Gets ZipOutput or not.
     */
    public Boolean getZipOutput() {
        return this.zipOutput;
    }

    /*
     * Sets ZipOutput or not.
     */
    public void setZipOutput(Boolean value) {
        this.zipOutput = value;
    }

    /*
     * Gets Folder in filestorage with custom fonts.
     */
    public String getFontsLocation() {
        return this.fontsLocation;
    }

    /*
     * Sets Folder in filestorage with custom fonts.
     */
    public void setFontsLocation(String value) {
        this.fontsLocation = value;
    }
}
