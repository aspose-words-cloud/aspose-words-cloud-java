/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestHeaderFooter.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.File;
import java.io.IOException;
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
    public void testGetHeaderFooters() throws ApiException, IOException
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
    }

    /*
     * Test for getting headerfooter.
     */
    @Test
    public void testGetHeaderFooter() throws ApiException, IOException
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
    }

    /*
     * Test for getting headerfooter of section.
     */
    @Test
    public void testGetHeaderFooterOfSection() throws ApiException, IOException
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
    }

    /*
     * Test for deleting headerfooter.
     */
    @Test
    public void testDeleteHeaderFooter() throws ApiException, IOException
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
     * Test for deleting headerfooters.
     */
    @Test
    public void testDeleteHeadersFooters() throws ApiException, IOException
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
     * Test for adding headerfooters.
     */
    @Test
    public void testInsertHeaderFooter() throws ApiException, IOException
    {
        String remoteFileName = "TestInsertHeaderFooter.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        InsertHeaderFooterRequest request = new InsertHeaderFooterRequest(
            remoteFileName,
            "FooterEven",
            "",
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
}
