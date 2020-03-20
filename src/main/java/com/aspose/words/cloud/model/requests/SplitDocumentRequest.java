/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SplitDocumentRequest.java">
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
 * Request model for splitDocument operation.
 */
public class SplitDocumentRequest {
    /*
     * Original document name.
     */
    private  Name;

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
     * Format to split.
     */
    private  Format;

    /*
     * Start page.
     */
    private  From;

    /*
     * End page.
     */
    private  To;

    /*
     * ZipOutput or not.
     */
    private  ZipOutput;

    /*
     * Folder in filestorage with custom fonts.
     */
    private  FontsLocation;
    
    /*
     * Initializes a new instance of the splitDocumentRequest class.
     *  
     * @param  name Original document name.
     * @param  folder Original document folder.
     * @param  storage Original document storage.
     * @param  loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param  password Password for opening an encrypted document.
     * @param  destFileName Result path of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     * @param  format Format to split.
     * @param  from Start page.
     * @param  to End page.
     * @param  zipOutput ZipOutput or not.
     * @param  fontsLocation Folder in filestorage with custom fonts.
     */
    public SplitDocumentRequest( name,   folder,   storage,   loadEncoding,   password,   destFileName,   format,   from,   to,   zipOutput,   fontsLocation) {
        Name = name;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        DestFileName = destFileName;
        Format = format;
        From = from;
        To = to;
        ZipOutput = zipOutput;
        FontsLocation = fontsLocation;
    }

    /*
     *  Gets Original document name.
     */
    public  getName() {
        return Name;
    }

    /*
     * Sets Original document name.
     */
    public void setName( value) {
        Name = value;
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
     *  Gets Format to split.
     */
    public  getFormat() {
        return Format;
    }

    /*
     * Sets Format to split.
     */
    public void setFormat( value) {
        Format = value;
    }

    /*
     *  Gets Start page.
     */
    public  getFrom() {
        return From;
    }

    /*
     * Sets Start page.
     */
    public void setFrom( value) {
        From = value;
    }

    /*
     *  Gets End page.
     */
    public  getTo() {
        return To;
    }

    /*
     * Sets End page.
     */
    public void setTo( value) {
        To = value;
    }

    /*
     *  Gets ZipOutput or not.
     */
    public  getZipOutput() {
        return ZipOutput;
    }

    /*
     * Sets ZipOutput or not.
     */
    public void setZipOutput( value) {
        ZipOutput = value;
    }

    /*
     *  Gets Folder in filestorage with custom fonts.
     */
    public  getFontsLocation() {
        return FontsLocation;
    }

    /*
     * Sets Folder in filestorage with custom fonts.
     */
    public void setFontsLocation( value) {
        FontsLocation = value;
    }
}
