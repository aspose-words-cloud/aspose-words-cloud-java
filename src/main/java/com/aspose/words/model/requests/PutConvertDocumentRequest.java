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
package com.aspose.words.model.requests;
import com.aspose.words.model.*;
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
     * 
     */
    private String Format;

    /*
     * File storage, which have to be used.
     */
    private String Storage;

    /*
     * 
     */
    private String OutPath;

    /*
     * 
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
     * @param String format 
     * @param String storage File storage, which have to be used.
     * @param String outPath 
     * @param String documentFileName 
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
     * 
     */
    public String getFormat() {
        return Format;
    }

    /*
     * 
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
     * 
     */
    public String getOutPath() {
        return OutPath;
    }

    /*
     * 
     */
    public void setOutPath(String value) {
        OutPath = value;
    }

    /*
     * 
     */
    public String getDocumentFileName() {
        return DocumentFileName;
    }

    /*
     * 
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
