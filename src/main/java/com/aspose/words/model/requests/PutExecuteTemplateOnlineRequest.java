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
package com.aspose.words.model.requests;
import com.aspose.words.model.*;
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
     * 
     */
    private String Cleanup;

    /*
     * 
     */
    private Boolean UseWholeParagraphAsRegion;

    /*
     * 
     */
    private Boolean WithRegions;

    /*
     * 
     */
    private String DocumentFileName;
    
    /*
     * Initializes a new instance of the putExecuteTemplateOnlineRequest class.
     *  
     * @param File template File with template
     * @param File data File with mailmerge data
     * @param String cleanup 
     * @param Boolean useWholeParagraphAsRegion 
     * @param Boolean withRegions 
     * @param String documentFileName 
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
     * 
     */
    public String getCleanup() {
        return Cleanup;
    }

    /*
     * 
     */
    public void setCleanup(String value) {
        Cleanup = value;
    }

    /*
     * 
     */
    public Boolean getUseWholeParagraphAsRegion() {
        return UseWholeParagraphAsRegion;
    }

    /*
     * 
     */
    public void setUseWholeParagraphAsRegion(Boolean value) {
        UseWholeParagraphAsRegion = value;
    }

    /*
     * 
     */
    public Boolean getWithRegions() {
        return WithRegions;
    }

    /*
     * 
     */
    public void setWithRegions(Boolean value) {
        WithRegions = value;
    }

    /*
     * 
     */
    public String getDocumentFileName() {
        return DocumentFileName;
    }

    /*
     * 
     */
    public void setDocumentFileName(String value) {
        DocumentFileName = value;
    }
}
