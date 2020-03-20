/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="UpdateRunRequest.java">
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
 * Request model for updateRun operation.
 */
public class UpdateRunRequest {
    /*
     * The document name.
     */
    private  Name;

    /*
     * Run data.
     */
    private  Run;

    /*
     * Path to parent paragraph.
     */
    private  ParagraphPath;

    /*
     * Object index.
     */
    private  Index;

    /*
     * Original document folder.
     */
    private  Folder;

    /*
     * Original document storage.
     */
    private  Storage;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private  LoadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private  Password;

    /*
     * Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    private  DestFileName;

    /*
     * Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     */
    private  RevisionAuthor;

    /*
     * The date and time to use for revisions.
     */
    private  RevisionDateTime;
    
    /*
     * Initializes a new instance of the updateRunRequest class.
     *  
     * @param  name The document name.
     * @param  run Run data.
     * @param  paragraphPath Path to parent paragraph.
     * @param  index Object index.
     * @param  folder Original document folder.
     * @param  storage Original document storage.
     * @param  loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param  password Password for opening an encrypted document.
     * @param  destFileName Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     * @param  revisionAuthor Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     * @param  revisionDateTime The date and time to use for revisions.
     */
    public UpdateRunRequest( name,   run,   paragraphPath,   index,   folder,   storage,   loadEncoding,   password,   destFileName,   revisionAuthor,   revisionDateTime) {
        Name = name;
        Run = run;
        ParagraphPath = paragraphPath;
        Index = index;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        DestFileName = destFileName;
        RevisionAuthor = revisionAuthor;
        RevisionDateTime = revisionDateTime;
    }

    /*
     *  Gets The document name.
     */
    public  getName() {
        return Name;
    }

    /*
     * Sets The document name.
     */
    public void setName( value) {
        Name = value;
    }

    /*
     *  Gets Run data.
     */
    public  getRun() {
        return Run;
    }

    /*
     * Sets Run data.
     */
    public void setRun( value) {
        Run = value;
    }

    /*
     *  Gets Path to parent paragraph.
     */
    public  getParagraphPath() {
        return ParagraphPath;
    }

    /*
     * Sets Path to parent paragraph.
     */
    public void setParagraphPath( value) {
        ParagraphPath = value;
    }

    /*
     *  Gets Object index.
     */
    public  getIndex() {
        return Index;
    }

    /*
     * Sets Object index.
     */
    public void setIndex( value) {
        Index = value;
    }

    /*
     *  Gets Original document folder.
     */
    public  getFolder() {
        return Folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder( value) {
        Folder = value;
    }

    /*
     *  Gets Original document storage.
     */
    public  getStorage() {
        return Storage;
    }

    /*
     * Sets Original document storage.
     */
    public void setStorage( value) {
        Storage = value;
    }

    /*
     *  Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public  getLoadEncoding() {
        return LoadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding( value) {
        LoadEncoding = value;
    }

    /*
     *  Gets Password for opening an encrypted document.
     */
    public  getPassword() {
        return Password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword( value) {
        Password = value;
    }

    /*
     *  Gets Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public  getDestFileName() {
        return DestFileName;
    }

    /*
     * Sets Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public void setDestFileName( value) {
        DestFileName = value;
    }

    /*
     *  Gets Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     */
    public  getRevisionAuthor() {
        return RevisionAuthor;
    }

    /*
     * Sets Initials of the author to use for revisions.If you set this parameter and then make some changes to the document programmatically, save the document and later open the document in MS Word you will see these changes as revisions.
     */
    public void setRevisionAuthor( value) {
        RevisionAuthor = value;
    }

    /*
     *  Gets The date and time to use for revisions.
     */
    public  getRevisionDateTime() {
        return RevisionDateTime;
    }

    /*
     * Sets The date and time to use for revisions.
     */
    public void setRevisionDateTime( value) {
        RevisionDateTime = value;
    }
}
