/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestDocumentProtection.java">
 *   Copyright (c) 2025 Aspose.Words for Cloud
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

package com.aspose.words.cloud.api.documentProtection;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.IOException;
import jakarta.mail.MessagingException;
import java.nio.file.*;
import java.util.*;

/*
 * Example of how to set document protection.
 */
public class TestDocumentProtection  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/DocumentProtection";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for setting document protection.
     */
    @Test
    public void testProtectDocument() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestProtectDocument.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ProtectionRequestV2 requestProtectionRequest = new ProtectionRequestV2();
        requestProtectionRequest.setProtectionPassword("123");
        requestProtectionRequest.setProtectionType(ProtectionRequestV2.ProtectionTypeEnum.READONLY);

        ProtectDocumentRequest request = new ProtectDocumentRequest(
            remoteFileName,
            requestProtectionRequest,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName
        );

        ProtectionDataResponse result = TestInitializer.wordsApi.protectDocument(request);
        assertNotNull(result);
        assertNotNull(result.getProtectionData());

    }

    /*
     * Test for setting document protection.
     */
    @Test
    public void testProtectDocumentOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        ProtectionRequestV2 requestProtectionRequest = new ProtectionRequestV2();
        requestProtectionRequest.setProtectionPassword("123");
        requestProtectionRequest.setProtectionType(ProtectionRequestV2.ProtectionTypeEnum.READONLY);

        ProtectDocumentOnlineRequest request = new ProtectDocumentOnlineRequest(
            requestDocument,
            requestProtectionRequest,
            null,
            null,
            null,
            null,
            null
        );

        ProtectDocumentOnlineResponse result = TestInitializer.wordsApi.protectDocumentOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting document protection.
     */
    @Test
    public void testGetDocumentProtection() throws ApiException, MessagingException, IOException
    {
        String localFilePath = "DocumentActions/DocumentProtection/SampleProtectedBlankWordDocument.docx";
        String remoteFileName = "TestGetDocumentProtection.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFilePath),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentProtectionRequest request = new GetDocumentProtectionRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        ProtectionDataResponse result = TestInitializer.wordsApi.getDocumentProtection(request);
        assertNotNull(result);
    }

    /*
     * Test for getting document protection.
     */
    @Test
    public void testGetDocumentProtectionOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetDocumentProtectionOnlineRequest request = new GetDocumentProtectionOnlineRequest(
            requestDocument,
            null,
            null,
            null,
            null
        );

        ProtectionDataResponse result = TestInitializer.wordsApi.getDocumentProtectionOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting unprotect document.
     */
    @Test
    public void testDeleteUnprotectDocument() throws ApiException, MessagingException, IOException
    {
        String localFilePath = "DocumentActions/DocumentProtection/SampleProtectedBlankWordDocument.docx";
        String remoteFileName = "TestDeleteUnprotectDocument.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFilePath),
            remoteDataFolder + "/" + remoteFileName
        );

        UnprotectDocumentRequest request = new UnprotectDocumentRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        ProtectionDataResponse result = TestInitializer.wordsApi.unprotectDocument(request);
        assertNotNull(result);
        assertNotNull(result.getProtectionData());

    }

    /*
     * Test for deleting unprotect document.
     */
    @Test
    public void testDeleteUnprotectDocumentOnline() throws ApiException, MessagingException, IOException
    {
        String localFilePath = "DocumentActions/DocumentProtection/SampleProtectedBlankWordDocument.docx";

        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFilePath).toAbsolutePath());
        UnprotectDocumentOnlineRequest request = new UnprotectDocumentOnlineRequest(
            requestDocument,
            null,
            null,
            null,
            null,
            null
        );

        UnprotectDocumentOnlineResponse result = TestInitializer.wordsApi.unprotectDocumentOnline(request);
        assertNotNull(result);
    }
}
