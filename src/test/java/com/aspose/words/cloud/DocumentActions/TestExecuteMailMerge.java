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
import com.aspose.words.cloud.StringUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.DocumentResponse;
import com.aspose.words.cloud.model.requests.ExecuteMailMergeRequest;
import com.aspose.words.cloud.model.requests.ExecuteMailMergeOnlineRequest;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;

public class TestExecuteMailMerge extends TestCase {
    private String testFolder = "DocumentActions/MailMerge";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for mail merge execution
     */
    public void testPostDocumentExecuteMailMerge() throws ApiException, IOException {
        String fileName = "SampleMailMergeTemplate.docx";
        String remoteName = "TestPostDocumentExecuteMailMerge.docx";
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName),
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        String data = StringUtil.readFileToString(StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, "SampleMailMergeTemplateData.txt"));

        ExecuteMailMergeRequest request = new ExecuteMailMergeRequest(remoteName, data,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null,
                null, destName);

        DocumentResponse result = TestInitializer.wordsApi.executeMailMerge(request);
        assertNotNull(result.getDocument());
    }

    /*
     * Test for executing mail merge online
     */
    public void testPutExecuteMailMergeOnline() throws ApiException {
        String fileName = "SampleMailMergeTemplate.docx";
        File file = new File(StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));
        File data = new File(StringUtil.join("/",TestInitializer.LocalTestFolder, testFolder, "SampleMailMergeTemplateData.txt"));

        ExecuteMailMergeOnlineRequest request = new ExecuteMailMergeOnlineRequest(file, data,
                null, null, null);

        File result = TestInitializer.wordsApi.executeMailMergeOnline(request);
        assertTrue(result.length() > 0);
    }
}
