/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DownloadFileRequest.java">
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
 * Request model for downloadFile operation.
 */
public class DownloadFileRequest {
    /*
     * Path of the file including the file name and extension e.g. /folder1/file.ext
     */
    private  Path;

    /*
     * Storage name
     */
    private  StorageName;

    /*
     * File version ID to download
     */
    private  VersionId;
    
    /*
     * Initializes a new instance of the downloadFileRequest class.
     *  
     * @param  path Path of the file including the file name and extension e.g. /folder1/file.ext
     * @param  storageName Storage name
     * @param  versionId File version ID to download
     */
    public DownloadFileRequest( path,   storageName,   versionId) {
        Path = path;
        StorageName = storageName;
        VersionId = versionId;
    }

    /*
     *  Gets Path of the file including the file name and extension e.g. /folder1/file.ext
     */
    public  getPath() {
        return Path;
    }

    /*
     * Sets Path of the file including the file name and extension e.g. /folder1/file.ext
     */
    public void setPath( value) {
        Path = value;
    }

    /*
     *  Gets Storage name
     */
    public  getStorageName() {
        return StorageName;
    }

    /*
     * Sets Storage name
     */
    public void setStorageName( value) {
        StorageName = value;
    }

    /*
     *  Gets File version ID to download
     */
    public  getVersionId() {
        return VersionId;
    }

    /*
     * Sets File version ID to download
     */
    public void setVersionId( value) {
        VersionId = value;
    }
}
