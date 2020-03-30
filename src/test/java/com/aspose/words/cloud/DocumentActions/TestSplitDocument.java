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
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.SplitDocumentResponse;
import com.aspose.words.cloud.model.requests.SplitDocumentRequest;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class TestSplitDocument extends TestCase {
    private String testFolder = "DocumentActions/SplitDocument";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for splitting document
     */
    @Test
public void testSplitDocument() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestSplitDocument.docx";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName);
        String format = "text";
        Integer from = 1;
        Integer to = 2;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        SplitDocumentRequest request = new SplitDocumentRequest(remoteName, format,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, destName, from, to, null, null);

        SplitDocumentResponse result = TestInitializer.wordsApi.splitDocument(request);
        assertNotNull(result);
    }
}
