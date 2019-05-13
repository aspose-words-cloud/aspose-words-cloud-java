
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetDocumentFieldNamesOnlineRequest.java">
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
 * Request model for getDocumentFieldNamesOnline operation.
 */
public class GetDocumentFieldNamesOnlineRequest {
    /*
     * File with template
     */
    private File Template;

    /*
     * Use non merge fields or not.
     */
    private Boolean UseNonMergeFields;
    
    /*
     * Initializes a new instance of the getDocumentFieldNamesOnlineRequest class.
     *  
     * @param File template File with template
     * @param Boolean useNonMergeFields Use non merge fields or not.
     */
    public GetDocumentFieldNamesOnlineRequest(File template,  Boolean useNonMergeFields) {
        Template = template;
        UseNonMergeFields = useNonMergeFields;
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
     *  Gets Use non merge fields or not.
     */
    public Boolean getUseNonMergeFields() {
        return UseNonMergeFields;
    }

    /*
     * Sets Use non merge fields or not.
     */
    public void setUseNonMergeFields(Boolean value) {
        UseNonMergeFields = value;
    }
}
/*