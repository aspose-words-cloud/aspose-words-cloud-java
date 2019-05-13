
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SplitDocumentRequest.java">
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
 * Request model for splitDocument operation.
 */
public class SplitDocumentRequest {
    /*
     * Original document name.
     */
    private String Name;

    /*
     * Original document folder.
     */
    private String Folder;

    /*
     * Original document storage.
     */
    private String Storage;

    /*
     * Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    private String LoadEncoding;

    /*
     * Password for opening an encrypted document.
     */
    private String Password;

    /*
     * Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    private String DestFileName;

    /*
     * Format to split.
     */
    private String Format;

    /*
     * Start page.
     */
    private Integer From;

    /*
     * End page.
     */
    private Integer To;

    /*
     * ZipOutput or not.
     */
    private Boolean ZipOutput;

    /*
     * Folder in filestorage with custom fonts.
     */
    private String FontsLocation;
    
    /*
     * Initializes a new instance of the splitDocumentRequest class.
     *  
     * @param String name Original document name.
     * @param String folder Original document folder.
     * @param String storage Original document storage.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param String destFileName Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     * @param String format Format to split.
     * @param Integer from Start page.
     * @param Integer to End page.
     * @param Boolean zipOutput ZipOutput or not.
     * @param String fontsLocation Folder in filestorage with custom fonts.
     */
    public SplitDocumentRequest(String name,  String folder,  String storage,  String loadEncoding,  String password,  String destFileName,  String format,  Integer from,  Integer to,  Boolean zipOutput,  String fontsLocation) {
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
    public String getName() {
        return Name;
    }

    /*
     * Sets Original document name.
     */
    public void setName(String value) {
        Name = value;
    }

    /*
     *  Gets Original document folder.
     */
    public String getFolder() {
        return Folder;
    }

    /*
     * Sets Original document folder.
     */
    public void setFolder(String value) {
        Folder = value;
    }

    /*
     *  Gets Original document storage.
     */
    public String getStorage() {
        return Storage;
    }

    /*
     * Sets Original document storage.
     */
    public void setStorage(String value) {
        Storage = value;
    }

    /*
     *  Gets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public String getLoadEncoding() {
        return LoadEncoding;
    }

    /*
     * Sets Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     */
    public void setLoadEncoding(String value) {
        LoadEncoding = value;
    }

    /*
     *  Gets Password for opening an encrypted document.
     */
    public String getPassword() {
        return Password;
    }

    /*
     * Sets Password for opening an encrypted document.
     */
    public void setPassword(String value) {
        Password = value;
    }

    /*
     *  Gets Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public String getDestFileName() {
        return DestFileName;
    }

    /*
     * Sets Result name of the document after the operation. If this parameter is omitted then result of the operation will be saved as the source document.
     */
    public void setDestFileName(String value) {
        DestFileName = value;
    }

    /*
     *  Gets Format to split.
     */
    public String getFormat() {
        return Format;
    }

    /*
     * Sets Format to split.
     */
    public void setFormat(String value) {
        Format = value;
    }

    /*
     *  Gets Start page.
     */
    public Integer getFrom() {
        return From;
    }

    /*
     * Sets Start page.
     */
    public void setFrom(Integer value) {
        From = value;
    }

    /*
     *  Gets End page.
     */
    public Integer getTo() {
        return To;
    }

    /*
     * Sets End page.
     */
    public void setTo(Integer value) {
        To = value;
    }

    /*
     *  Gets ZipOutput or not.
     */
    public Boolean getZipOutput() {
        return ZipOutput;
    }

    /*
     * Sets ZipOutput or not.
     */
    public void setZipOutput(Boolean value) {
        ZipOutput = value;
    }

    /*
     *  Gets Folder in filestorage with custom fonts.
     */
    public String getFontsLocation() {
        return FontsLocation;
    }

    /*
     * Sets Folder in filestorage with custom fonts.
     */
    public void setFontsLocation(String value) {
        FontsLocation = value;
    }
}
/*