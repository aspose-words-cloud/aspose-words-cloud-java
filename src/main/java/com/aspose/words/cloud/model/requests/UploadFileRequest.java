/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UploadFileRequest.java">
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
 * Request model for uploadFile operation.
 */
public class UploadFileRequest {
    /*
     * File to upload.
     */
    private byte[] fileContent;

    /*
     * Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext
     * If the content is multipart and path does not contains the file name it tries to get them from filename parameter
     * from Content-Disposition header.
     */
    private String path;

    /*
     * Storage name.
     */
    private String storageName;

    /*
     * Initializes a new instance of the UploadFileRequest class.
     *
     * @param byte[] fileContent File to upload.
     * @param String path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext If the content is multipart and path does not contains the file name it tries to get them from filename parameter from Content-Disposition header.
     * @param String storageName Storage name.
     */
    public UploadFileRequest(byte[] fileContent, String path, String storageName) {
        this.fileContent = fileContent;
        this.path = path;
        this.storageName = storageName;
    }

    /*
     * Gets File to upload.
     */
    public byte[] getFileContent() {
        return this.fileContent;
    }

    /*
     * Sets File to upload.
     */
    public void setFileContent(byte[] value) {
        this.fileContent = value;
    }

    /*
     * Gets Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext If the content is multipart and path does not contains the file name it tries to get them from filename parameter from Content-Disposition header.
     */
    public String getPath() {
        return this.path;
    }

    /*
     * Sets Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext If the content is multipart and path does not contains the file name it tries to get them from filename parameter from Content-Disposition header.
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
}
