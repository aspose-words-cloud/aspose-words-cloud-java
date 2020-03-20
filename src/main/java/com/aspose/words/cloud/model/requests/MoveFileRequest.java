/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MoveFileRequest.java">
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
 * Request model for moveFile operation.
 */
public class MoveFileRequest {
    /*
     * Destination file path e.g. '/dest.ext'
     */
    private  DestPath;

    /*
     * Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'
     */
    private  SrcPath;

    /*
     * Source storage name
     */
    private  SrcStorageName;

    /*
     * Destination storage name
     */
    private  DestStorageName;

    /*
     * File version ID to move
     */
    private  VersionId;
    
    /*
     * Initializes a new instance of the moveFileRequest class.
     *  
     * @param  destPath Destination file path e.g. '/dest.ext'
     * @param  srcPath Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'
     * @param  srcStorageName Source storage name
     * @param  destStorageName Destination storage name
     * @param  versionId File version ID to move
     */
    public MoveFileRequest( destPath,   srcPath,   srcStorageName,   destStorageName,   versionId) {
        DestPath = destPath;
        SrcPath = srcPath;
        SrcStorageName = srcStorageName;
        DestStorageName = destStorageName;
        VersionId = versionId;
    }

    /*
     *  Gets Destination file path e.g. '/dest.ext'
     */
    public  getDestPath() {
        return DestPath;
    }

    /*
     * Sets Destination file path e.g. '/dest.ext'
     */
    public void setDestPath( value) {
        DestPath = value;
    }

    /*
     *  Gets Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'
     */
    public  getSrcPath() {
        return SrcPath;
    }

    /*
     * Sets Source file's path e.g. '/Folder 1/file.ext' or '/Bucket/Folder 1/file.ext'
     */
    public void setSrcPath( value) {
        SrcPath = value;
    }

    /*
     *  Gets Source storage name
     */
    public  getSrcStorageName() {
        return SrcStorageName;
    }

    /*
     * Sets Source storage name
     */
    public void setSrcStorageName( value) {
        SrcStorageName = value;
    }

    /*
     *  Gets Destination storage name
     */
    public  getDestStorageName() {
        return DestStorageName;
    }

    /*
     * Sets Destination storage name
     */
    public void setDestStorageName( value) {
        DestStorageName = value;
    }

    /*
     *  Gets File version ID to move
     */
    public  getVersionId() {
        return VersionId;
    }

    /*
     * Sets File version ID to move
     */
    public void setVersionId( value) {
        VersionId = value;
    }
}
