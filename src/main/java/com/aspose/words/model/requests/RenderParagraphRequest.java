/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RenderParagraphRequest.java">
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
 * Request model for renderParagraph operation.
 */
public class RenderParagraphRequest {
    /*
     * The file name.
     */
    private String Name;

    /*
     * The destination format.
     */
    private String Format;

    /*
     * Object's index
     */
    private Integer Index;

    /*
     * Original document folder.
     */
    private String Folder;

    /*
     * File storage, which have to be used.
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
     * Path to node, which contains paragraphs.
     */
    private String NodePath;

    /*
     * Folder in filestorage with custom fonts.
     */
    private String FontsLocation;
    
    /*
     * Initializes a new instance of the renderParagraphRequest class.
     *  
     * @param String name The file name.
     * @param String format The destination format.
     * @param Integer index Object's index
     * @param String folder Original document folder.
     * @param String storage File storage, which have to be used.
     * @param String loadEncoding Encoding that will be used to load an HTML (or TXT) document if the encoding is not specified in HTML.
     * @param String password Password for opening an encrypted document.
     * @param String nodePath Path to node, which contains paragraphs.
     * @param String fontsLocation Folder in filestorage with custom fonts.
     */
    public RenderParagraphRequest(String name,  String format,  Integer index,  String folder,  String storage,  String loadEncoding,  String password,  String nodePath,  String fontsLocation) {
        Name = name;
        Format = format;
        Index = index;
        Folder = folder;
        Storage = storage;
        LoadEncoding = loadEncoding;
        Password = password;
        NodePath = nodePath;
        FontsLocation = fontsLocation;
    }

    /*
     *  Gets The file name.
     */
    public String getName() {
        return Name;
    }

    /*
     * Sets The file name.
     */
    public void setName(String value) {
        Name = value;
    }

    /*
     *  Gets The destination format.
     */
    public String getFormat() {
        return Format;
    }

    /*
     * Sets The destination format.
     */
    public void setFormat(String value) {
        Format = value;
    }

    /*
     *  Gets Object's index
     */
    public Integer getIndex() {
        return Index;
    }

    /*
     * Sets Object's index
     */
    public void setIndex(Integer value) {
        Index = value;
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
     *  Gets File storage, which have to be used.
     */
    public String getStorage() {
        return Storage;
    }

    /*
     * Sets File storage, which have to be used.
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
     *  Gets Path to node, which contains paragraphs.
     */
    public String getNodePath() {
        return NodePath;
    }

    /*
     * Sets Path to node, which contains paragraphs.
     */
    public void setNodePath(String value) {
        NodePath = value;
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
