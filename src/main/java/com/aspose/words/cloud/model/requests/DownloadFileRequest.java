/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DownloadFileRequest.java">
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
 * Request model for downloadFile operation.
 */
public class DownloadFileRequest {
    /*
     * Path of the file including the file name and extension e.g. /folder1/file.ext.
     */
    private String path;

    /*
     * Storage name.
     */
    private String storageName;

    /*
     * File version ID to download.
     */
    private String versionId;

    /*
     * Initializes a new instance of the DownloadFileRequest class.
     *
     * @param String path Path of the file including the file name and extension e.g. /folder1/file.ext.
     * @param String storageName Storage name.
     * @param String versionId File version ID to download.
     */
    public DownloadFileRequest(String path, String storageName, String versionId) {
        this.path = path;
        this.storageName = storageName;
        this.versionId = versionId;
    }

    /*
     * Gets Path of the file including the file name and extension e.g. /folder1/file.ext.
     */
    public String getPath() {
        return this.path;
    }

    /*
     * Sets Path of the file including the file name and extension e.g. /folder1/file.ext.
     */
    public void setPath(String value) {
        this.path = value;
    }

    /*
     * Gets Storage name.
     */
    public String getStorageName() {
        return this.storageName;
    }

    /*
     * Sets Storage name.
     */
    public void setStorageName(String value) {
        this.storageName = value;
    }

    /*
     * Gets File version ID to download.
     */
    public String getVersionId() {
        return this.versionId;
    }

    /*
     * Sets File version ID to download.
     */
    public void setVersionId(String value) {
        this.versionId = value;
    }
}
