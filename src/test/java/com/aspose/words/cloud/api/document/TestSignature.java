/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestSignature.java">
 *   Copyright (c) 2026 Aspose.Words for Cloud
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

package com.aspose.words.cloud.api.document;

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
 * Example of how to work with signatures.
 */
public class TestSignature  extends TestCase
{
    private String remoteFolder = TestInitializer.RemoteTestFolder + "/DocumentActions/Signature";
    private String localFolder = "DocumentActions/Signature";
    private String signedDocument = "signedDocument.docx";
    private String unsignedDocument = "unsignedDocument.docx";
    private String certificateName = "morzal.pfx";
    private String certificatePassword = "aw";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting all document signatures.
     */
    @Test
    public void testGetSignatures() throws ApiException, MessagingException, IOException
    {
        String remoteName = "TestGetSignatures.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFolder + "/" + signedDocument),
            remoteFolder + "/" + remoteName
        );

        GetSignaturesRequest request = new GetSignaturesRequest(
            remoteName,
            remoteFolder,
            null,
            null,
            null,
            null,
            null
        );

        SignatureCollectionResponse result = TestInitializer.wordsApi.getSignatures(request);
        assertNotNull(result);
        assertNotNull(result.getSignatures());
        assertEquals(1, result.getSignatures().size());
    }

    /*
     * Test for getting all document signatures online.
     */
    @Test
    public void testGetSignaturesOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFolder + "/" + signedDocument).toAbsolutePath());
        GetSignaturesOnlineRequest request = new GetSignaturesOnlineRequest(
            requestDocument,
            null,
            null,
            null,
            null
        );

        SignatureCollectionResponse result = TestInitializer.wordsApi.getSignaturesOnline(request);
        assertNotNull(result);
        assertNotNull(result.getSignatures());
        assertEquals(1, result.getSignatures().size());
    }

    /*
     * Test for removing all document signatures.
     */
    @Test
    public void testRemoveAllSignatures() throws ApiException, MessagingException, IOException
    {
        String remoteName = "TestRemoveAllSignatures.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFolder + "/" + signedDocument),
            remoteFolder + "/" + remoteName
        );

        RemoveAllSignaturesRequest request = new RemoveAllSignaturesRequest(
            remoteName,
            remoteFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        SignatureCollectionResponse result = TestInitializer.wordsApi.removeAllSignatures(request);
        assertNotNull(result);
        assertNotNull(result.getSignatures());
        assertEquals(0, result.getSignatures().size());
    }

    /*
     * Test for removing all document signatures online.
     */
    @Test
    public void testRemoveAllSignaturesOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFolder + "/" + signedDocument).toAbsolutePath());
        RemoveAllSignaturesOnlineRequest request = new RemoveAllSignaturesOnlineRequest(
            requestDocument,
            null,
            null,
            null,
            null,
            null
        );

        RemoveAllSignaturesOnlineResponse result = TestInitializer.wordsApi.removeAllSignaturesOnline(request);
        assertNotNull(result);
        assertNotNull(result.getModel().getSignatures());
        assertEquals(0, result.getModel().getSignatures().size());
    }

    /*
     * Test for signing document.
     */
    @Test
    public void testSignDocument() throws ApiException, MessagingException, IOException
    {
        String remoteName = "TestSignDocument.docx";
        String remoteCertificateName = "TestCertificate.pfx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFolder + "/" + unsignedDocument),
            remoteFolder + "/" + remoteName
        );
        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFolder + "/" + certificateName),
            remoteFolder + "/" + remoteCertificateName
        );

        SignDocumentRequest request = new SignDocumentRequest(
            remoteName,
            remoteFolder + "/" + remoteCertificateName,
            certificatePassword,
            remoteFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        SignatureCollectionResponse result = TestInitializer.wordsApi.signDocument(request);
        assertNotNull(result);
        assertNotNull(result.getSignatures());
        assertEquals(1, result.getSignatures().size());
    }

    /*
     * Test for signing document online.
     */
    @Test
    public void testSignDocumentOnline() throws ApiException, MessagingException, IOException
    {
        String remoteCertificateName = "TestCertificateOnline.pfx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFolder + "/" + certificateName),
            remoteFolder + "/" + remoteCertificateName
        );

        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFolder + "/" + unsignedDocument).toAbsolutePath());
        SignDocumentOnlineRequest request = new SignDocumentOnlineRequest(
            requestDocument,
            remoteFolder + "/" + remoteCertificateName,
            certificatePassword,
            null,
            null,
            null,
            null,
            null
        );

        SignDocumentOnlineResponse result = TestInitializer.wordsApi.signDocumentOnline(request);
        assertNotNull(result);
        assertNotNull(result.getModel().getSignatures());
        assertEquals(1, result.getModel().getSignatures().size());
    }
}
