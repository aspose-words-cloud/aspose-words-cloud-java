/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestCompareDocument.java">
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
 * Example of document comparison.
 */
public class TestCompareDocument  extends TestCase
{
    private String remoteFolder = TestInitializer.RemoteTestFolder + "/DocumentActions/CompareDocument";
    private String localFolder = "DocumentActions/CompareDocument";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for document comparison.
     */
    @Test
    public void testCompareDocument() throws ApiException, MessagingException, IOException
    {
        String localName1 = "compareTestDoc1.doc";
        String localName2 = "compareTestDoc2.doc";
        String remoteName1 = "TestCompareDocument1.doc";
        String remoteName2 = "TestCompareDocument2.doc";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName1),
            remoteFolder + "/" + remoteName1
        );
        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName2),
            remoteFolder + "/" + remoteName2
        );

        FileReference requestCompareDataFileReference = new FileReference(remoteFolder + "/" + remoteName2);
        CompareData requestCompareData = new CompareData();
        requestCompareData.setAuthor("author");
        requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));
        requestCompareData.setFileReference(requestCompareDataFileReference);

        CompareDocumentRequest request = new CompareDocumentRequest(
            remoteName1,
            requestCompareData,
            remoteFolder,
            null,
            null,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/TestCompareDocumentOut.doc"
        );

        DocumentResponse result = TestInitializer.wordsApi.compareDocument(request);
        assertNotNull(result);
        assertNotNull(result.getDocument());
        assertEquals("TestCompareDocumentOut.doc", result.getDocument().getFileName());
    }

    /*
     * Test for document comparison online.
     */
    @Test
    public void testCompareDocumentOnline() throws ApiException, MessagingException, IOException
    {
        String localName1 = "compareTestDoc1.doc";
        String localName2 = "compareTestDoc2.doc";
        String remoteName2 = "TestCompareDocument2.doc";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName2),
            remoteFolder + "/" + remoteName2
        );

        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName1).toAbsolutePath());
        FileReference requestCompareDataFileReference = new FileReference(remoteFolder + "/" + remoteName2);
        CompareData requestCompareData = new CompareData();
        requestCompareData.setAuthor("author");
        requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));
        requestCompareData.setFileReference(requestCompareDataFileReference);

        CompareDocumentOnlineRequest request = new CompareDocumentOnlineRequest(
            requestDocument,
            requestCompareData,
            null,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/TestCompareDocumentOut.doc"
        );

        CompareDocumentOnlineResponse result = TestInitializer.wordsApi.compareDocumentOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for document comparison online.
     */
    @Test
    public void testCompareTwoDocumentOnline() throws ApiException, MessagingException, IOException
    {
        String localName1 = "compareTestDoc1.doc";
        String localName2 = "compareTestDoc2.doc";
        String remoteName2 = "TestCompareDocument2.doc";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName2),
            remoteFolder + "/" + remoteName2
        );

        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName1).toAbsolutePath());
        byte[] requestCompareDataFileReferenceStream = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName2).toAbsolutePath());
        FileReference requestCompareDataFileReference = new FileReference(requestCompareDataFileReferenceStream);
        CompareData requestCompareData = new CompareData();
        requestCompareData.setAuthor("author");
        requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));
        requestCompareData.setFileReference(requestCompareDataFileReference);

        CompareDocumentOnlineRequest request = new CompareDocumentOnlineRequest(
            requestDocument,
            requestCompareData,
            null,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/TestCompareDocumentOut.doc"
        );

        CompareDocumentOnlineResponse result = TestInitializer.wordsApi.compareDocumentOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for document comparison with password protection.
     */
    @Test
    public void testCompareDocumentWithPassword() throws ApiException, MessagingException, IOException
    {
        String localName = "DocWithPassword.docx";
        String remoteName1 = "TestCompareDocument1.docx";
        String remoteName2 = "TestCompareDocument2.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localName),
            remoteFolder + "/" + remoteName1
        );
        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localName),
            remoteFolder + "/" + remoteName2
        );

        FileReference requestCompareDataFileReference = new FileReference(remoteFolder + "/" + remoteName2, "12345");
        CompareData requestCompareData = new CompareData();
        requestCompareData.setAuthor("author");
        requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));
        requestCompareData.setFileReference(requestCompareDataFileReference);

        CompareDocumentRequest request = new CompareDocumentRequest(
            remoteName1,
            requestCompareData,
            remoteFolder,
            null,
            null,
            "12345",
            null,
            null,
            TestInitializer.RemoteTestOut + "/TestCompareDocumentOut.docx"
        );

        DocumentResponse result = TestInitializer.wordsApi.compareDocument(request);
        assertNotNull(result);
        assertNotNull(result.getDocument());
        assertEquals("TestCompareDocumentOut.docx", result.getDocument().getFileName());
    }
}
