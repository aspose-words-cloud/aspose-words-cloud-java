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
package com.aspose.words.DocumentActions;

import com.aspose.words.ApiException;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.ProtectionDataResponse;
import com.aspose.words.model.ProtectionRequest;
import com.aspose.words.model.requests.GetDocumentProtectionRequest;
import com.aspose.words.model.requests.ProtectDocumentRequest;
import com.aspose.words.model.requests.UnprotectDocumentRequest;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
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
    public void testGetDocumentProtection() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentProtection.docx";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentProtectionRequest request = new GetDocumentProtectionRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        ProtectionDataResponse result = TestInitializer.wordsApi.getDocumentProtection(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting document protection
     */
    public void testPutProtectDocument() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutProtectDocument.docx";
        ProtectionRequest body = new ProtectionRequest().newPassword("123");
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        ProtectDocumentRequest request = new ProtectDocumentRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null);
        ProtectionDataResponse result = TestInitializer.wordsApi.protectDocument(request);
        assertNotNull(result);
    }

    /*
     * Test for updating document protection
     */
    public void testPostChangeDocumentProtection() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostChangeDocumentProtection.docx";
        ProtectionRequest body = new ProtectionRequest().newPassword("");
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        ProtectDocumentRequest request = new ProtectDocumentRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null);

        ProtectionDataResponse result = TestInitializer.wordsApi.protectDocument(request);
        assertNotNull(result);
    }

    /*
     * Test for updating document protection
     */
    public void testDeleteUnprotectDocument() throws ApiException, FileNotFoundException {
        String fileName = "SampleProtectedBlankWordDocument.docx";
        String remoteName = "TestDeleteUnprotectDocument.docx";
        ProtectionRequest body = new ProtectionRequest().password("aspose");
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, "DocumentActions", "DocumentProtection", fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));
        UnprotectDocumentRequest request = new UnprotectDocumentRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null);
        ProtectionDataResponse result = TestInitializer.wordsApi.unprotectDocument(request);
        assertNotNull(result);

    }
}
