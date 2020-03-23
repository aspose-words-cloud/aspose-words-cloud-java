/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
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
 * --------------------------------------------------------------------------------
 */
package com.aspose.words.cloud.DocumentActions;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.LoadWebDocumentData;
import com.aspose.words.cloud.model.SaveOptionsData;
import com.aspose.words.cloud.model.SaveResponse;
import com.aspose.words.cloud.model.requests.LoadWebDocumentRequest;

import org.junit.Test;

import junit.framework.TestCase;

import java.io.IOException;

public class TestLoadWebDocument extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for loading web document
     */
    @Test
public void testPostLoadWebDocument() throws ApiException, IOException {
        SaveOptionsData saveOptionsData = new SaveOptionsData()
                .saveFormat("doc")
                .fileName("google.doc")
                .dmlRenderingMode("1")
                .dmlEffectsRenderingMode("1")
                .zipOutput(false)
                .updateLastSavedTimeProperty(false);
        LoadWebDocumentData body = new LoadWebDocumentData().loadingDocumentUrl("http://google.com").saveOptions(saveOptionsData);
        LoadWebDocumentRequest request = new LoadWebDocumentRequest(body,null);

        SaveResponse result = TestInitializer.wordsApi.loadWebDocument(request);
        assertNotNull(result);
    }
}
