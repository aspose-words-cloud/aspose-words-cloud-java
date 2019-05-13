
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CreateDocumentRequest.java">
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
 * Request model for createDocument operation.
 */
public class CreateDocumentRequest {
    /*
     * Original document storage.
     */
    private String Storage;

    /*
     * The document name.
     */
    private String FileName;

    /*
     * The document folder.
     */
    private String Folder;
    
    /*
     * Initializes a new instance of the createDocumentRequest class.
     *  
     * @param String storage Original document storage.
     * @param String fileName The document name.
     * @param String folder The document folder.
     */
    public CreateDocumentRequest(String storage,  String fileName,  String folder) {
        Storage = storage;
        FileName = fileName;
        Folder = folder;
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
     *  Gets The document name.
     */
    public String getFileName() {
        return FileName;
    }

    /*
     * Sets The document name.
     */
    public void setFileName(String value) {
        FileName = value;
    }

    /*
     *  Gets The document folder.
     */
    public String getFolder() {
        return Folder;
    }

    /*
     * Sets The document folder.
     */
    public void setFolder(String value) {
        Folder = value;
    }
}
/*