/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestHyperlink.java">
 *   Copyright (c) 2023 Aspose.Words for Cloud
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

package com.aspose.words.cloud.api.hyperlink;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.IOException;
import javax.mail.MessagingException;
import java.nio.file.*;
import java.util.*;

/*
 * Example of how to work with hyperlinks.
 */
public class TestHyperlink  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Hyperlink";
    private String localFile = "Common/test_doc.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting hyperlink by specified index.
     */
    @Test
    public void testGetDocumentHyperlinkByIndex() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentHyperlinkByIndex.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentHyperlinkByIndexRequest request = new GetDocumentHyperlinkByIndexRequest(
            remoteFileName,
            0,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        HyperlinkResponse result = TestInitializer.wordsApi.getDocumentHyperlinkByIndex(request);
        assertNotNull(result);
        assertNotNull(result.getHyperlink());
        assertEquals("Aspose", result.getHyperlink().getDisplayText());
    }

    /*
     * Test for getting hyperlink by specified index online.
     */
    @Test
    public void testGetDocumentHyperlinkByIndexOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetDocumentHyperlinkByIndexOnlineRequest request = new GetDocumentHyperlinkByIndexOnlineRequest(
            requestDocument,
            0,
            null,
            null,
            null
        );

        HyperlinkResponse result = TestInitializer.wordsApi.getDocumentHyperlinkByIndexOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting hyperlinks.
     */
    @Test
    public void testGetDocumentHyperlinks() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentHyperlinks.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentHyperlinksRequest request = new GetDocumentHyperlinksRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        HyperlinksResponse result = TestInitializer.wordsApi.getDocumentHyperlinks(request);
        assertNotNull(result);
        assertNotNull(result.getHyperlinks());
        assertNotNull(result.getHyperlinks().getHyperlinkList());
        assertEquals(2, result.getHyperlinks().getHyperlinkList().size());
        assertEquals("Aspose", result.getHyperlinks().getHyperlinkList().get(0).getDisplayText());
    }

    /*
     * Test for getting hyperlinks online.
     */
    @Test
    public void testGetDocumentHyperlinksOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetDocumentHyperlinksOnlineRequest request = new GetDocumentHyperlinksOnlineRequest(
            requestDocument,
            null,
            null,
            null
        );

        HyperlinksResponse result = TestInitializer.wordsApi.getDocumentHyperlinksOnline(request);
        assertNotNull(result);
    }
}
