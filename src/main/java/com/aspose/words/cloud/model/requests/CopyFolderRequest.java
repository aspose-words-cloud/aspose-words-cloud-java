/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CopyFolderRequest.java">
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
 * Request model for copyFolder operation.
 */
public class CopyFolderRequest {
    /*
     * Destination folder path e.g. '/dst'
     */
    private  DestPath;

    /*
     * Source folder path e.g. /Folder1
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
     * Initializes a new instance of the copyFolderRequest class.
     *  
     * @param  destPath Destination folder path e.g. '/dst'
     * @param  srcPath Source folder path e.g. /Folder1
     * @param  srcStorageName Source storage name
     * @param  destStorageName Destination storage name
     */
    public CopyFolderRequest( destPath,   srcPath,   srcStorageName,   destStorageName) {
        DestPath = destPath;
        SrcPath = srcPath;
        SrcStorageName = srcStorageName;
        DestStorageName = destStorageName;
    }

    /*
     *  Gets Destination folder path e.g. '/dst'
     */
    public  getDestPath() {
        return DestPath;
    }

    /*
     * Sets Destination folder path e.g. '/dst'
     */
    public void setDestPath( value) {
        DestPath = value;
    }

    /*
     *  Gets Source folder path e.g. /Folder1
     */
    public  getSrcPath() {
        return SrcPath;
    }

    /*
     * Sets Source folder path e.g. /Folder1
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
}
