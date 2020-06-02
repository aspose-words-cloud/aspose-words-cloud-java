/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CopyFolderRequest.java">
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
 * Request model for copyFolder operation.
 */
public class CopyFolderRequest {
    /*
     * Destination folder path e.g. '/dst'.
     */
    private String destPath;

    /*
     * Source folder path e.g. /Folder1.
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
     * Initializes a new instance of the CopyFolderRequest class.
     *
     * @param String destPath Destination folder path e.g. '/dst'.
     * @param String srcPath Source folder path e.g. /Folder1.
     * @param String srcStorageName Source storage name.
     * @param String destStorageName Destination storage name.
     */
    public CopyFolderRequest(String destPath, String srcPath, String srcStorageName, String destStorageName) {
        this.destPath = destPath;
        this.srcPath = srcPath;
        this.srcStorageName = srcStorageName;
        this.destStorageName = destStorageName;
    }

    /*
     * Gets Destination folder path e.g. '/dst'.
     */
    public String getDestPath() {
        return this.destPath;
    }

    /*
     * Sets Destination folder path e.g. '/dst'.
     */
    public void setDestPath(String value) {
        this.destPath = value;
    }

    /*
     * Gets Source folder path e.g. /Folder1.
     */
    public String getSrcPath() {
        return this.srcPath;
    }

    /*
     * Sets Source folder path e.g. /Folder1.
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
}
