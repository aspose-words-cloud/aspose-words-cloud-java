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
package com.aspose.words.Document;

import com.aspose.words.ApiException;
import com.aspose.words.StringUtil;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.DocumentResponse;
import com.aspose.words.model.requests.GetDocumentRequest;
import com.aspose.words.model.requests.PutCreateDocumentRequest;
import junit.framework.TestCase;

public class TestDocument extends TestCase {
    private String testFolder = "document";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting document
     */
    public void testGetDocument() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocument.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentRequest request = new GetDocumentRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null);

        DocumentResponse result = TestInitializer.wordsApi.getDocument(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
    * Test for creating document
    */
    public void testPutCreateDocument() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutCreateDocument.docx";

        TestInitializer.uploadFile(StringUtil.join("/",TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        PutCreateDocumentRequest request = new PutCreateDocumentRequest(null, remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder));
        DocumentResponse result = TestInitializer.wordsApi.putCreateDocument(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}
