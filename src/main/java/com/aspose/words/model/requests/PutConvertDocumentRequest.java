/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutConvertDocumentRequest.java">
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
 * Request model for putConvertDocument operation.
 */
public class PutConvertDocumentRequest {
    /*
     * Converting document
     */
    private File Document;

    /*
     * Format to convert.
     */
    private String Format;

    /*
     * File storage, which have to be used.
     */
    private String Storage;

    /*
     * Path for saving operation result to the local storage.
     */
    private String OutPath;

    /*
     * This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not setted, \"sourceFilename\" will be used instead. 
     */
    private String DocumentFileName;

    /*
     * Folder in filestorage with custom fonts.
     */
    private String FontsLocation;
    
    /*
     * Initializes a new instance of the putConvertDocumentRequest class.
     *  
     * @param File document Converting document
     * @param String format Format to convert.
     * @param String storage File storage, which have to be used.
     * @param String outPath Path for saving operation result to the local storage.
     * @param String documentFileName This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not setted, \"sourceFilename\" will be used instead. 
     * @param String fontsLocation Folder in filestorage with custom fonts.
     */
    public PutConvertDocumentRequest(File document,  String format,  String storage,  String outPath,  String documentFileName,  String fontsLocation) {
        Document = document;
        Format = format;
        Storage = storage;
        OutPath = outPath;
        DocumentFileName = documentFileName;
        FontsLocation = fontsLocation;
    }

    /*
     *  Gets Converting document
     */
    public File getDocument() {
        return Document;
    }

    /*
     * Sets Converting document
     */
    public void setDocument(File value) {
        Document = value;
    }

    /*
     *  Gets Format to convert.
     */
    public String getFormat() {
        return Format;
    }

    /*
     * Sets Format to convert.
     */
    public void setFormat(String value) {
        Format = value;
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
     *  Gets Path for saving operation result to the local storage.
     */
    public String getOutPath() {
        return OutPath;
    }

    /*
     * Sets Path for saving operation result to the local storage.
     */
    public void setOutPath(String value) {
        OutPath = value;
    }

    /*
     *  Gets This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not setted, \"sourceFilename\" will be used instead. 
     */
    public String getDocumentFileName() {
        return DocumentFileName;
    }

    /*
     * Sets This file name will be used when resulting document has dynamic field for document file name {filename}. If it is not setted, \"sourceFilename\" will be used instead. 
     */
    public void setDocumentFileName(String value) {
        DocumentFileName = value;
    }

    /*
     *  Gets Folder in filestorage with custom fonts.
     */
    public String getFontsLocation() {
        return FontsLocation;
    }

    /*
     * Sets Folder in filestorage with custom fonts.
     */
    public void setFontsLocation(String value) {
        FontsLocation = value;
    }
}
