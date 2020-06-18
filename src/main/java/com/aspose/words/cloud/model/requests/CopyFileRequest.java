/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CopyFileRequest.java">
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
 * Request model for copyFile operation.
 */
public class CopyFileRequest {
    /*
     * Destination file path.
     */
    private String destPath;

    /*
     * Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'.
     */
    private String srcPath;

    /*
     * Source storage name.
     */
    private String srcStorageName;

    /*
     * Destination storage name.
     */
    private String destStorageName;

    /*
     * File version ID to copy.
     */
    private String versionId;

    /*
     * Initializes a new instance of the CopyFileRequest class.
     *
     * @param String destPath Destination file path.
     * @param String srcPath Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'.
     * @param String srcStorageName Source storage name.
     * @param String destStorageName Destination storage name.
     * @param String versionId File version ID to copy.
     */
    public CopyFileRequest(String destPath, String srcPath, String srcStorageName, String destStorageName, String versionId) {
        this.destPath = destPath;
        this.srcPath = srcPath;
        this.srcStorageName = srcStorageName;
        this.destStorageName = destStorageName;
        this.versionId = versionId;
    }

    /*
     * Gets Destination file path.
     */
    public String getDestPath() {
        return this.destPath;
    }

    /*
     * Sets Destination file path.
     */
    public void setDestPath(String value) {
        this.destPath = value;
    }

    /*
     * Gets Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'.
     */
    public String getSrcPath() {
        return this.srcPath;
    }

    /*
     * Sets Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'.
     */
    public void setSrcPath(String value) {
        this.srcPath = value;
    }

    /*
     * Gets Source storage name.
     */
    public String getSrcStorageName() {
        return this.srcStorageName;
    }

    /*
     * Sets Source storage name.
     */
    public void setSrcStorageName(String value) {
        this.srcStorageName = value;
    }

    /*
     * Gets Destination storage name.
     */
    public String getDestStorageName() {
        return this.destStorageName;
    }

    /*
     * Sets Destination storage name.
     */
    public void setDestStorageName(String value) {
        this.destStorageName = value;
    }

    /*
     * Gets File version ID to copy.
     */
    public String getVersionId() {
        return this.versionId;
    }

    /*
     * Sets File version ID to copy.
     */
    public void setVersionId(String value) {
        this.versionId = value;
    }
}
