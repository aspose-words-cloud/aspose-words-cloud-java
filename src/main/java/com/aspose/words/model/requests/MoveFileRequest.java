
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MoveFileRequest.java">
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
 * Request model for moveFile operation.
 */
public class MoveFileRequest {
    /*
     * Destination file path e.g. '/dest.ext'
     */
    private String DestPath;

    /*
     * Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'
     */
    private String SrcPath;

    /*
     * Source storage name
     */
    private String SrcStorageName;

    /*
     * Destination storage name
     */
    private String DestStorageName;

    /*
     * File version ID to move
     */
    private String VersionId;
    
    /*
     * Initializes a new instance of the moveFileRequest class.
     *  
     * @param String destPath Destination file path e.g. '/dest.ext'
     * @param String srcPath Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'
     * @param String srcStorageName Source storage name
     * @param String destStorageName Destination storage name
     * @param String versionId File version ID to move
     */
    public MoveFileRequest(String destPath,  String srcPath,  String srcStorageName,  String destStorageName,  String versionId) {
        DestPath = destPath;
        SrcPath = srcPath;
        SrcStorageName = srcStorageName;
        DestStorageName = destStorageName;
        VersionId = versionId;
    }

    /*
     *  Gets Destination file path e.g. '/dest.ext'
     */
    public String getDestPath() {
        return DestPath;
    }

    /*
     * Sets Destination file path e.g. '/dest.ext'
     */
    public void setDestPath(String value) {
        DestPath = value;
    }

    /*
     *  Gets Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'
     */
    public String getSrcPath() {
        return SrcPath;
    }

    /*
     * Sets Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'
     */
    public void setSrcPath(String value) {
        SrcPath = value;
    }

    /*
     *  Gets Source storage name
     */
    public String getSrcStorageName() {
        return SrcStorageName;
    }

    /*
     * Sets Source storage name
     */
    public void setSrcStorageName(String value) {
        SrcStorageName = value;
    }

    /*
     *  Gets Destination storage name
     */
    public String getDestStorageName() {
        return DestStorageName;
    }

    /*
     * Sets Destination storage name
     */
    public void setDestStorageName(String value) {
        DestStorageName = value;
    }

    /*
     *  Gets File version ID to move
     */
    public String getVersionId() {
        return VersionId;
    }

    /*
     * Sets File version ID to move
     */
    public void setVersionId(String value) {
        VersionId = value;
    }
}
/*