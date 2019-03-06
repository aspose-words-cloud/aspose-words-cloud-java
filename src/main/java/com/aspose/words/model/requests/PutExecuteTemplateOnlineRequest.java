/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutExecuteTemplateOnlineRequest.java">
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
 * Request model for putExecuteTemplateOnline operation.
 */
public class PutExecuteTemplateOnlineRequest {
    /*
     * File with template
     */
    private File Template;

    /*
     * File with mailmerge data
     */
    private File Data;

    /*
     * Clean up options.
     */
    private String Cleanup;

    /*
     * Gets or sets a value indicating whether paragraph with TableStart or              TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields.              The default value is true.
     */
    private Boolean UseWholeParagraphAsRegion;

    /*
     * Merge with regions or not. True by default
     */
    private Boolean WithRegions;

    /*
     * This file name will be used when resulting document has dynamic field for document file name {filename}.  If it is not setted, \"template\" will be used instead.  Note: if withRegions == true executeTemplate updates fields only inside regions
     */
    private String DocumentFileName;
    
    /*
     * Initializes a new instance of the putExecuteTemplateOnlineRequest class.
     *  
     * @param File template File with template
     * @param File data File with mailmerge data
     * @param String cleanup Clean up options.
     * @param Boolean useWholeParagraphAsRegion Gets or sets a value indicating whether paragraph with TableStart or              TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields.              The default value is true.
     * @param Boolean withRegions Merge with regions or not. True by default
     * @param String documentFileName This file name will be used when resulting document has dynamic field for document file name {filename}.  If it is not setted, \"template\" will be used instead.  Note: if withRegions == true executeTemplate updates fields only inside regions
     */
    public PutExecuteTemplateOnlineRequest(File template,  File data,  String cleanup,  Boolean useWholeParagraphAsRegion,  Boolean withRegions,  String documentFileName) {
        Template = template;
        Data = data;
        Cleanup = cleanup;
        UseWholeParagraphAsRegion = useWholeParagraphAsRegion;
        WithRegions = withRegions;
        DocumentFileName = documentFileName;
    }

    /*
     *  Gets File with template
     */
    public File getTemplate() {
        return Template;
    }

    /*
     * Sets File with template
     */
    public void setTemplate(File value) {
        Template = value;
    }

    /*
     *  Gets File with mailmerge data
     */
    public File getData() {
        return Data;
    }

    /*
     * Sets File with mailmerge data
     */
    public void setData(File value) {
        Data = value;
    }

    /*
     *  Gets Clean up options.
     */
    public String getCleanup() {
        return Cleanup;
    }

    /*
     * Sets Clean up options.
     */
    public void setCleanup(String value) {
        Cleanup = value;
    }

    /*
     *  Gets Gets or sets a value indicating whether paragraph with TableStart or              TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields.              The default value is true.
     */
    public Boolean getUseWholeParagraphAsRegion() {
        return UseWholeParagraphAsRegion;
    }

    /*
     * Sets Gets or sets a value indicating whether paragraph with TableStart or              TableEnd field should be fully included into mail merge region or particular range between TableStart and TableEnd fields.              The default value is true.
     */
    public void setUseWholeParagraphAsRegion(Boolean value) {
        UseWholeParagraphAsRegion = value;
    }

    /*
     *  Gets Merge with regions or not. True by default
     */
    public Boolean getWithRegions() {
        return WithRegions;
    }

    /*
     * Sets Merge with regions or not. True by default
     */
    public void setWithRegions(Boolean value) {
        WithRegions = value;
    }

    /*
     *  Gets This file name will be used when resulting document has dynamic field for document file name {filename}.  If it is not setted, \"template\" will be used instead.  Note: if withRegions == true executeTemplate updates fields only inside regions
     */
    public String getDocumentFileName() {
        return DocumentFileName;
    }

    /*
     * Sets This file name will be used when resulting document has dynamic field for document file name {filename}.  If it is not setted, \"template\" will be used instead.  Note: if withRegions == true executeTemplate updates fields only inside regions
     */
    public void setDocumentFileName(String value) {
        DocumentFileName = value;
    }
}
