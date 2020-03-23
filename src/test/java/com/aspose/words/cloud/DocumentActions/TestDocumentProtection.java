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
import com.aspose.words.cloud.model.ProtectionDataResponse;
import com.aspose.words.cloud.model.ProtectionRequest;
import com.aspose.words.cloud.model.requests.GetDocumentProtectionRequest;
import com.aspose.words.cloud.model.requests.ProtectDocumentRequest;
import com.aspose.words.cloud.model.requests.UnprotectDocumentRequest;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

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
    @Test
public void testGetDocumentProtection() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentProtection.docx";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetDocumentProtectionRequest request = new GetDocumentProtectionRequest(remoteName,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null);

        ProtectionDataResponse result = TestInitializer.wordsApi.getDocumentProtection(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting document protection
     */
    @Test
public void testPutProtectDocument() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutProtectDocument.docx";
        ProtectionRequest body = new ProtectionRequest().newPassword("123");
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        ProtectDocumentRequest request = new ProtectDocumentRequest(remoteName, body,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null);
        ProtectionDataResponse result = TestInitializer.wordsApi.protectDocument(request);
        assertNotNull(result);
    }

    /*
     * Test for updating document protection
     */
    @Test
public void testPostChangeDocumentProtection() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostChangeDocumentProtection.docx";
        ProtectionRequest body = new ProtectionRequest().newPassword("");
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        ProtectDocumentRequest request = new ProtectDocumentRequest(remoteName, body,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null);

        ProtectionDataResponse result = TestInitializer.wordsApi.protectDocument(request);
        assertNotNull(result);
    }

    /*
     * Test for updating document protection
     */
    @Test
public void testDeleteUnprotectDocument() throws ApiException, IOException {
        String fileName = "SampleProtectedBlankWordDocument.docx";
        String remoteName = "TestDeleteUnprotectDocument.docx";
        ProtectionRequest body = new ProtectionRequest().password("aspose");
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, "DocumentActions", "DocumentProtection", fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));
        UnprotectDocumentRequest request = new UnprotectDocumentRequest(remoteName, body,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null);
        ProtectionDataResponse result = TestInitializer.wordsApi.unprotectDocument(request);
        assertNotNull(result);

    }
}
