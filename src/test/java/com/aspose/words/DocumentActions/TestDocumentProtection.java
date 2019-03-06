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
import com.aspose.words.cloud.model.ProtectionDataResponse;
import com.aspose.words.cloud.model.ProtectionRequest;
import com.aspose.words.cloud.model.requests.DeleteUnprotectDocumentRequest;
import com.aspose.words.cloud.model.requests.GetDocumentProtectionRequest;
import com.aspose.words.cloud.model.requests.PostChangeDocumentProtectionRequest;
import com.aspose.words.cloud.model.requests.PutProtectDocumentRequest;
import junit.framework.TestCase;

import java.io.File;
import java.nio.file.Paths;

public class TestDocumentProtection extends TestCase {
    private String testFolder = "DocumentActions/DocumentProtection";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting document protection
     */
    public void testGetDocumentProtection() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentProtection.docx";
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        GetDocumentProtectionRequest request = new GetDocumentProtectionRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        ProtectionDataResponse result = TestInitializer.wordsApi.getDocumentProtection(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for inserting document protection
     */
    public void testPutProtectDocument() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutProtectDocument.docx";
        ProtectionRequest body = new ProtectionRequest().newPassword("123");
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        PutProtectDocumentRequest request = new PutProtectDocumentRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null);
        ProtectionDataResponse result = TestInitializer.wordsApi.putProtectDocument(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for updating document protection
     */
    public void testPostChangeDocumentProtection() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostChangeDocumentProtection.docx";
        ProtectionRequest body = new ProtectionRequest().newPassword("");
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        PostChangeDocumentProtectionRequest request = new PostChangeDocumentProtectionRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null);

        ProtectionDataResponse result = TestInitializer.wordsApi.postChangeDocumentProtection(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for updating document protection
     */
    public void testDeleteUnprotectDocument() throws ApiException {
        String fileName = "SampleProtectedBlankWordDocument.docx";
        String remoteName = "TestDeleteUnprotectDocument.docx";
        ProtectionRequest body = new ProtectionRequest().password("aspose");
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);
        DeleteUnprotectDocumentRequest request = new DeleteUnprotectDocumentRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null);
        ProtectionDataResponse result = TestInitializer.wordsApi.deleteUnprotectDocument(request);
        assertEquals(result.getCode(), Integer.valueOf(200));

    }
}
