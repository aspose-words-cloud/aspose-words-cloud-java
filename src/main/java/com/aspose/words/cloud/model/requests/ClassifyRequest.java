/*
 * --------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ClassifyRequest.java">
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
 * Request model for classify operation.
 */
public class ClassifyRequest {
    /*
     * Text to classify.
     */
    private  Text;

    /*
     * Number of the best classes to return.
     */
    private  BestClassesCount;
    
    /*
     * Initializes a new instance of the classifyRequest class.
     *  
     * @param  text Text to classify.
     * @param  bestClassesCount Number of the best classes to return.
     */
    public ClassifyRequest( text,   bestClassesCount) {
        Text = text;
        BestClassesCount = bestClassesCount;
    }

    /*
     *  Gets Text to classify.
     */
    public  getText() {
        return Text;
    }

    /*
     * Sets Text to classify.
     */
    public void setText( value) {
        Text = value;
    }

    /*
     *  Gets Number of the best classes to return.
     */
    public  getBestClassesCount() {
        return BestClassesCount;
    }

    /*
     * Sets Number of the best classes to return.
     */
    public void setBestClassesCount( value) {
        BestClassesCount = value;
    }
}
