
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetFilesListRequest.java">
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
 * Request model for getFilesList operation.
 */
public class GetFilesListRequest {
    /*
     * Folder path e.g. /Folder1
     */
    private String Path;

    /*
     * Storage name
     */
    private String StorageName;
    
    /*
     * Initializes a new instance of the getFilesListRequest class.
     *  
     * @param String path Folder path e.g. /Folder1
     * @param String storageName Storage name
     */
    public GetFilesListRequest(String path,  String storageName) {
        Path = path;
        StorageName = storageName;
    }

    /*
     *  Gets Folder path e.g. /Folder1
     */
    public String getPath() {
        return Path;
    }

    /*
     * Sets Folder path e.g. /Folder1
     */
    public void setPath(String value) {
        Path = value;
    }

    /*
     *  Gets Storage name
     */
    public String getStorageName() {
        return StorageName;
    }

    /*
     * Sets Storage name
     */
    public void setStorageName(String value) {
        StorageName = value;
    }
}
/*