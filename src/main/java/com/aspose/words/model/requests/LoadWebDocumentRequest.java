
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="LoadWebDocumentRequest.java">
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
 * Request model for loadWebDocument operation.
 */
public class LoadWebDocumentRequest {
    /*
     * Parameters of loading.
     */
    private LoadWebDocumentData Data;

    /*
     * Original document storage.
     */
    private String Storage;
    
    /*
     * Initializes a new instance of the loadWebDocumentRequest class.
     *  
     * @param LoadWebDocumentData data Parameters of loading.
     * @param String storage Original document storage.
     */
    public LoadWebDocumentRequest(LoadWebDocumentData data,  String storage) {
        Data = data;
        Storage = storage;
    }

    /*
     *  Gets Parameters of loading.
     */
    public LoadWebDocumentData getData() {
        return Data;
    }

    /*
     * Sets Parameters of loading.
     */
    public void setData(LoadWebDocumentData value) {
        Data = value;
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
}
/*