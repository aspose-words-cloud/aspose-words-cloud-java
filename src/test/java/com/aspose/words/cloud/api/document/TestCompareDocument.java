/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestCompareDocument.java">
 *   Copyright (c) 2021 Aspose.Words for Cloud
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
import java.io.File;
import java.io.IOException;
import javax.mail.MessagingException;
import java.nio.file.*;
import java.util.ArrayList;

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

        CompareData requestCompareData = new CompareData();
        requestCompareData.setAuthor("author");
        requestCompareData.setComparingWithDocument(remoteFolder + "/" + remoteName2);
        requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));

        CompareDocumentRequest request = new CompareDocumentRequest(
            remoteName1,
            requestCompareData,
            remoteFolder,
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

        CompareData requestCompareData = new CompareData();
        requestCompareData.setAuthor("author");
        requestCompareData.setComparingWithDocument(remoteFolder + "/" + remoteName2);
        requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));

        CompareDocumentOnlineRequest request = new CompareDocumentOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName1).toAbsolutePath()),
            requestCompareData,
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

        CompareData requestCompareData = new CompareData();
        requestCompareData.setAuthor("author");
        requestCompareData.setComparingWithDocument(remoteFolder + "/" + remoteName2);
        requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));

        CompareDocumentOnlineRequest request = new CompareDocumentOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName1).toAbsolutePath()),
            requestCompareData,
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName2).toAbsolutePath()),
            null,
            null,
            TestInitializer.RemoteTestOut + "/TestCompareDocumentOut.doc"
        );

        CompareDocumentOnlineResponse result = TestInitializer.wordsApi.compareDocumentOnline(request);
        assertNotNull(result);
    }
}
