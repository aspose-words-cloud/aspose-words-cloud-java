/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertDocumentRequest.java">
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
 * Request model for convertDocument operation.
 */
public class ConvertDocumentRequest {
    /*
     * Converting document.
     */
    private byte[] document;

    /*
     * Format to convert.
     */
    private String format;

    /*
     * Path for saving operation result to the local storage.
     */
    private String outPath;

    /*
     * This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "sourceFilename" will be used instead.
     */
    private String fileNameFieldValue;

    /*
     * Original document storage.
     */
    private String storage;

    /*
     * Folder in filestorage with custom fonts.
     */
    private String fontsLocation;

    /*
     * Initializes a new instance of the ConvertDocumentRequest class.
     *
     * @param byte[] document Converting document.
     * @param String format Format to convert.
     * @param String outPath Path for saving operation result to the local storage.
     * @param String fileNameFieldValue This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "sourceFilename" will be used instead.
     * @param String storage Original document storage.
     * @param String fontsLocation Folder in filestorage with custom fonts.
     */
    public ConvertDocumentRequest(byte[] document, String format, String outPath, String fileNameFieldValue, String storage, String fontsLocation) {
        this.document = document;
        this.format = format;
        this.outPath = outPath;
        this.fileNameFieldValue = fileNameFieldValue;
        this.storage = storage;
        this.fontsLocation = fontsLocation;
    }

    /*
     * Gets Converting document.
     */
    public byte[] getDocument() {
        return this.document;
    }

    /*
     * Sets Converting document.
     */
    public void setDocument(byte[] value) {
        this.document = value;
    }

    /*
     * Gets Format to convert.
     */
    public String getFormat() {
        return this.format;
    }

    /*
     * Sets Format to convert.
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /*
     * Gets Path for saving operation result to the local storage.
     */
    public String getOutPath() {
        return this.outPath;
    }

    /*
     * Sets Path for saving operation result to the local storage.
     */
    public void setOutPath(String value) {
        this.outPath = value;
    }

    /*
     * Gets This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "sourceFilename" will be used instead.
     */
    public String getFileNameFieldValue() {
        return this.fileNameFieldValue;
    }

    /*
     * Sets This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "sourceFilename" will be used instead.
     */
    public void setFileNameFieldValue(String value) {
        this.fileNameFieldValue = value;
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
