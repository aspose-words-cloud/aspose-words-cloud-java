/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertDocumentRequest.java">
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
 * Request model for convertDocument operation.
 */
public class ConvertDocumentRequest {
    /*
     * Converting document
     */
    private  Document;

    /*
     * Format to convert.
     */
    private  Format;

    /*
     * Original document storage.
     */
    private  Storage;

    /*
     * Path for saving operation result to the local storage.
     */
    private  OutPath;

    /*
     * This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "sourceFilename" will be used instead. 
     */
    private  FileNameFieldValue;

    /*
     * Folder in filestorage with custom fonts.
     */
    private  FontsLocation;
    
    /*
     * Initializes a new instance of the convertDocumentRequest class.
     *  
     * @param  document Converting document
     * @param  format Format to convert.
     * @param  storage Original document storage.
     * @param  outPath Path for saving operation result to the local storage.
     * @param  fileNameFieldValue This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "sourceFilename" will be used instead. 
     * @param  fontsLocation Folder in filestorage with custom fonts.
     */
    public ConvertDocumentRequest( document,   format,   storage,   outPath,   fileNameFieldValue,   fontsLocation) {
        Document = document;
        Format = format;
        Storage = storage;
        OutPath = outPath;
        FileNameFieldValue = fileNameFieldValue;
        FontsLocation = fontsLocation;
    }

    /*
     *  Gets Converting document
     */
    public  getDocument() {
        return Document;
    }

    /*
     * Sets Converting document
     */
    public void setDocument( value) {
        Document = value;
    }

    /*
     *  Gets Format to convert.
     */
    public  getFormat() {
        return Format;
    }

    /*
     * Sets Format to convert.
     */
    public void setFormat( value) {
        Format = value;
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
     *  Gets Path for saving operation result to the local storage.
     */
    public  getOutPath() {
        return OutPath;
    }

    /*
     * Sets Path for saving operation result to the local storage.
     */
    public void setOutPath( value) {
        OutPath = value;
    }

    /*
     *  Gets This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "sourceFilename" will be used instead. 
     */
    public  getFileNameFieldValue() {
        return FileNameFieldValue;
    }

    /*
     * Sets This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not set, "sourceFilename" will be used instead. 
     */
    public void setFileNameFieldValue( value) {
        FileNameFieldValue = value;
    }

    /*
     *  Gets Folder in filestorage with custom fonts.
     */
    public  getFontsLocation() {
        return FontsLocation;
    }

    /*
     * Sets Folder in filestorage with custom fonts.
     */
    public void setFontsLocation( value) {
        FontsLocation = value;
    }
}
