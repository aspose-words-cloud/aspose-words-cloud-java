/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestSection.java">
 *   Copyright (c) 2022 Aspose.Words for Cloud
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

package com.aspose.words.cloud.api.sections;

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
 * Example of how to work with sections.
 */
public class TestSection  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Section";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting section by index.
     */
    @Test
    public void testGetSection() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetSection.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetSectionRequest request = new GetSectionRequest(
            remoteFileName,
            0,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        SectionResponse result = TestInitializer.wordsApi.getSection(request);
        assertNotNull(result);
        assertNotNull(result.getSection());
        assertNotNull(result.getSection().getChildNodes());
        assertEquals(13, result.getSection().getChildNodes().size());
        assertEquals("0.3.0", result.getSection().getChildNodes().get(0).getNodeId());
    }

    /*
     * Test for getting section by index online.
     */
    @Test
    public void testGetSectionOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetSectionOnlineRequest request = new GetSectionOnlineRequest(
            requestDocument,
            0,
            null,
            null,
            null
        );

        SectionResponse result = TestInitializer.wordsApi.getSectionOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting sections.
     */
    @Test
    public void testGetSections() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetSections.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetSectionsRequest request = new GetSectionsRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        SectionLinkCollectionResponse result = TestInitializer.wordsApi.getSections(request);
        assertNotNull(result);
        assertNotNull(result.getSections());
        assertNotNull(result.getSections().getSectionLinkList());
        assertEquals(1, result.getSections().getSectionLinkList().size());
        assertEquals("0", result.getSections().getSectionLinkList().get(0).getNodeId());
    }

    /*
     * Test for getting sections online.
     */
    @Test
    public void testGetSectionsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetSectionsOnlineRequest request = new GetSectionsOnlineRequest(
            requestDocument,
            null,
            null,
            null
        );

        SectionLinkCollectionResponse result = TestInitializer.wordsApi.getSectionsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for delete a section.
     */
    @Test
    public void testDeleteSection() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteSection.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteSectionRequest request = new DeleteSectionRequest(
            remoteFileName,
            0,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteSection(request);
    }

    /*
     * Test for delete a section online.
     */
    @Test
    public void testDeleteSectionOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteSectionOnlineRequest request = new DeleteSectionOnlineRequest(
            requestDocument,
            0,
            null,
            null,
            null,
            null,
            null,
            null
        );

        Map<String, byte[]> result = TestInitializer.wordsApi.deleteSectionOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for linking headers and footers to previous section.
     */
    @Test
    public void testLinkHeaderFootersToPrevious() throws ApiException, MessagingException, IOException
    {
        LinkHeaderFootersToPreviousRequest request = new LinkHeaderFootersToPreviousRequest(
            "DocumentElements/Sections/Source.docx",
            1,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.linkHeaderFootersToPrevious(request);
    }
}
