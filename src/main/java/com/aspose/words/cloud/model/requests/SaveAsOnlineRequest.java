/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveAsOnlineRequest.java">
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
 * Request model for saveAsOnline operation.
 */
public class SaveAsOnlineRequest {
    /*
     * The document.
     */
    private byte[] document;

    /*
     * Save options.
     */
    private SaveOptionsData saveOptionsData;

    /*
     * Folder in filestorage with custom fonts.
     */
    private String fontsLocation;

    /*
     * Initializes a new instance of the SaveAsOnlineRequest class.
     *
     * @param byte[] document The document.
     * @param SaveOptionsData saveOptionsData Save options.
     * @param String fontsLocation Folder in filestorage with custom fonts.
     */
    public SaveAsOnlineRequest(byte[] document, SaveOptionsData saveOptionsData, String fontsLocation) {
        this.document = document;
        this.saveOptionsData = saveOptionsData;
        this.fontsLocation = fontsLocation;
    }

    /*
     * Gets The document.
     */
    public byte[] getDocument() {
        return this.document;
    }

    /*
     * Sets The document.
     */
    public void setDocument(byte[] value) {
        this.document = value;
    }

    /*
     * Gets Save options.
     */
    public SaveOptionsData getSaveOptionsData() {
        return this.saveOptionsData;
    }

    /*
     * Sets Save options.
     */
    public void setSaveOptionsData(SaveOptionsData value) {
        this.saveOptionsData = value;
    }

    /*
     * Gets Folder in filestorage with custom fonts.
     */
    public String getFontsLocation() {
        return this.fontsLocation;
    }

    /*
     * Sets Folder in filestorage with custom fonts.
     */
    public void setFontsLocation(String value) {
        this.fontsLocation = value;
    }
}
