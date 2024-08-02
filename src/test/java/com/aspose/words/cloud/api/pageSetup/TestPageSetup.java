/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestPageSetup.java">
 *   Copyright (c) 2024 Aspose.Words for Cloud
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

package com.aspose.words.cloud.api.pageSetup;

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
 * Example of how to work with macros.
 */
public class TestPageSetup  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/PageSetup";
    private String localFile = "Common/test_multi_pages.docx";
    private String localTextFile = "DocumentElements/Text/SampleWordDocument.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting page settings.
     */
    @Test
    public void testGetSectionPageSetup() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetSectionPageSetup.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetSectionPageSetupRequest request = new GetSectionPageSetupRequest(
            remoteFileName,
            0,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        SectionPageSetupResponse result = TestInitializer.wordsApi.getSectionPageSetup(request);
        assertNotNull(result);
        assertNotNull(result.getPageSetup());
        assertEquals(Integer.valueOf(1), result.getPageSetup().getLineStartingNumber());
    }

    /*
     * Test for getting page settings online.
     */
    @Test
    public void testGetSectionPageSetupOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetSectionPageSetupOnlineRequest request = new GetSectionPageSetupOnlineRequest(
            requestDocument,
            0,
            null,
            null,
            null,
            null
        );

        SectionPageSetupResponse result = TestInitializer.wordsApi.getSectionPageSetupOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating page settings.
     */
    @Test
    public void testUpdateSectionPageSetup() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateSectionPageSetup.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        PageSetup requestPageSetup = new PageSetup();
        requestPageSetup.setRtlGutter(true);
        requestPageSetup.setLeftMargin((double)10.0);
        requestPageSetup.setOrientation(PageSetup.OrientationEnum.LANDSCAPE);
        requestPageSetup.setPaperSize(PageSetup.PaperSizeEnum.A5);

        UpdateSectionPageSetupRequest request = new UpdateSectionPageSetupRequest(
            remoteFileName,
            0,
            requestPageSetup,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        SectionPageSetupResponse result = TestInitializer.wordsApi.updateSectionPageSetup(request);
        assertNotNull(result);
        assertNotNull(result.getPageSetup());
        assertEquals(Boolean.valueOf(true), result.getPageSetup().getRtlGutter());


    }

    /*
     * Test for updating page settings online.
     */
    @Test
    public void testUpdateSectionPageSetupOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        PageSetup requestPageSetup = new PageSetup();
        requestPageSetup.setRtlGutter(true);
        requestPageSetup.setLeftMargin((double)10);
        requestPageSetup.setOrientation(PageSetup.OrientationEnum.LANDSCAPE);
        requestPageSetup.setPaperSize(PageSetup.PaperSizeEnum.A5);

        UpdateSectionPageSetupOnlineRequest request = new UpdateSectionPageSetupOnlineRequest(
            requestDocument,
            0,
            requestPageSetup,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        UpdateSectionPageSetupOnlineResponse result = TestInitializer.wordsApi.updateSectionPageSetupOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for page rendering.
     */
    @Test
    public void testGetRenderPage() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetRenderPage.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localTextFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RenderPageRequest request = new RenderPageRequest(
            remoteFileName,
            1,
            "jpg",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.renderPage(request);
        assertNotNull(result);
    }

    /*
     * Test for page rendering.
     */
    @Test
    public void testGetRenderPageOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localTextFile).toAbsolutePath());
        RenderPageOnlineRequest request = new RenderPageOnlineRequest(
            requestDocument,
            1,
            "jpg",
            null,
            null,
            null,
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.renderPageOnline(request);
        assertNotNull(result);
    }
}
