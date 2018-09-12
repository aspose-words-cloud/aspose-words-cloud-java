/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ClassifyRequest.java">
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
 * Request model for classify operation.
 */
public class ClassifyRequest {
    /*
     * 
     */
    private String Text;

    /*
     * 
     */
    private String BestClassesCount;
    
    /*
     * Initializes a new instance of the classifyRequest class.
     *  
     * @param String text 
     * @param String bestClassesCount 
     */
    public ClassifyRequest(String text,  String bestClassesCount) {
        Text = text;
        BestClassesCount = bestClassesCount;
    }

    /*
     * 
     */
    public String getText() {
        return Text;
    }

    /*
     * 
     */
    public void setText(String value) {
        Text = value;
    }

    /*
     * 
     */
    public String getBestClassesCount() {
        return BestClassesCount;
    }

    /*
     * 
     */
    public void setBestClassesCount(String value) {
        BestClassesCount = value;
    }
}
