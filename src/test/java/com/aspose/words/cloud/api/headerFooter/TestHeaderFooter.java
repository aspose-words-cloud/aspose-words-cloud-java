/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestHeaderFooter.java">
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

package com.aspose.words.cloud.api.headerFooter;

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
 * Example of how to work with headers and footers.
 */
public class TestHeaderFooter  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/HeaderFooters";
    private String localFile = "DocumentElements/HeaderFooters/HeadersFooters.doc";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting headers and footers.
     */
    @Test
    public void testGetHeaderFooters() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetHeadersFooters.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetHeaderFootersRequest request = new GetHeaderFootersRequest(
            remoteFileName,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        HeaderFootersResponse result = TestInitializer.wordsApi.getHeaderFooters(request);
        assertNotNull(result);
        assertNotNull(result.getHeaderFooters());
        assertNotNull(result.getHeaderFooters().getList());
        assertEquals(6, result.getHeaderFooters().getList().size());
    }

    /*
     * Test for getting headers and footers online.
     */
    @Test
    public void testGetHeaderFootersOnline() throws ApiException, MessagingException, IOException
    {
        GetHeaderFootersOnlineRequest request = new GetHeaderFootersOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "",
            null,
            null,
            null
        );

        HeaderFootersResponse result = TestInitializer.wordsApi.getHeaderFootersOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting headerfooter.
     */
    @Test
    public void testGetHeaderFooter() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetHeaderFooter.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetHeaderFooterRequest request = new GetHeaderFooterRequest(
            remoteFileName,
            0,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        HeaderFooterResponse result = TestInitializer.wordsApi.getHeaderFooter(request);
        assertNotNull(result);
        assertNotNull(result.getHeaderFooter());
        assertNotNull(result.getHeaderFooter().getChildNodes());
        assertEquals(1, result.getHeaderFooter().getChildNodes().size());
        assertEquals("0.0.0", result.getHeaderFooter().getChildNodes().get(0).getNodeId());
    }

    /*
     * Test for getting headerfooter online.
     */
    @Test
    public void testGetHeaderFooterOnline() throws ApiException, MessagingException, IOException
    {
        GetHeaderFooterOnlineRequest request = new GetHeaderFooterOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            0,
            null,
            null,
            null
        );

        HeaderFooterResponse result = TestInitializer.wordsApi.getHeaderFooterOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting headerfooter of section.
     */
    @Test
    public void testGetHeaderFooterOfSection() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetHeaderFooterOfSection.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetHeaderFooterOfSectionRequest request = new GetHeaderFooterOfSectionRequest(
            remoteFileName,
            0,
            0,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        HeaderFooterResponse result = TestInitializer.wordsApi.getHeaderFooterOfSection(request);
        assertNotNull(result);
        assertNotNull(result.getHeaderFooter());
        assertNotNull(result.getHeaderFooter().getChildNodes());
        assertEquals(1, result.getHeaderFooter().getChildNodes().size());
        assertEquals("0.0.0", result.getHeaderFooter().getChildNodes().get(0).getNodeId());
    }

    /*
     * Test for getting headerfooter of section online.
     */
    @Test
    public void testGetHeaderFooterOfSectionOnline() throws ApiException, MessagingException, IOException
    {
        GetHeaderFooterOfSectionOnlineRequest request = new GetHeaderFooterOfSectionOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            0,
            0,
            null,
            null,
            null
        );

        HeaderFooterResponse result = TestInitializer.wordsApi.getHeaderFooterOfSectionOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting headerfooter.
     */
    @Test
    public void testDeleteHeaderFooter() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteHeaderFooter.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteHeaderFooterRequest request = new DeleteHeaderFooterRequest(
            remoteFileName,
            "",
            0,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteHeaderFooter(request);
    }

    /*
     * Test for deleting headerfooter online.
     */
    @Test
    public void testDeleteHeaderFooterOnline() throws ApiException, MessagingException, IOException
    {
        DeleteHeaderFooterOnlineRequest request = new DeleteHeaderFooterOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "",
            0,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.deleteHeaderFooterOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting headerfooters.
     */
    @Test
    public void testDeleteHeadersFooters() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteHeadersFooters.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteHeadersFootersRequest request = new DeleteHeadersFootersRequest(
            remoteFileName,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteHeadersFooters(request);
    }

    /*
     * Test for deleting headerfooters online.
     */
    @Test
    public void testDeleteHeadersFootersOnline() throws ApiException, MessagingException, IOException
    {
        DeleteHeadersFootersOnlineRequest request = new DeleteHeadersFootersOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "",
            null,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.deleteHeadersFootersOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for adding headerfooters.
     */
    @Test
    public void testInsertHeaderFooter() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertHeaderFooter.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        InsertHeaderFooterRequest request = new InsertHeaderFooterRequest(
            remoteFileName,
            "",
            "FooterEven",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        HeaderFooterResponse result = TestInitializer.wordsApi.insertHeaderFooter(request);
        assertNotNull(result);
    }

    /*
     * Test for adding headerfooters online.
     */
    @Test
    public void testInsertHeaderFooterOnline() throws ApiException, MessagingException, IOException
    {
        InsertHeaderFooterOnlineRequest request = new InsertHeaderFooterOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "",
            "FooterEven",
            null,
            null,
            null,
            null,
            null
        );

        InsertHeaderFooterOnlineResponse result = TestInitializer.wordsApi.insertHeaderFooterOnline(request);
        assertNotNull(result);
        assertNotNull(result.getModel().getHeaderFooter());
        assertNotNull(result.getModel().getHeaderFooter().getChildNodes());
        assertEquals(1, result.getModel().getHeaderFooter().getChildNodes().size());
        assertEquals("0.2.0", result.getModel().getHeaderFooter().getChildNodes().get(0).getNodeId());
    }
}
