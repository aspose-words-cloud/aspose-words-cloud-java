/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestParagraph.java">
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

package com.aspose.words.cloud.api.paragraph;

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
 * Example of how to work with paragraph.
 */
public class TestParagraph  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Paragraphs";
    private String localFile = "Common/test_multi_pages.docx";
    private String listFolder = "DocumentElements/ParagraphListFormat";
    private String tabStopFolder = "DocumentElements/Paragraphs";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting paragraph.
     */
    @Test
    public void testGetDocumentParagraphByIndex() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentParagraphByIndex.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetParagraphRequest request = new GetParagraphRequest(
            remoteFileName,
            0,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        ParagraphResponse result = TestInitializer.wordsApi.getParagraph(request);
        assertNotNull(result);
        assertNotNull(result.getParagraph());
        assertEquals("0.0.0", result.getParagraph().getNodeId());
    }

    /*
     * Test for getting paragraph online.
     */
    @Test
    public void testGetDocumentParagraphOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetParagraphOnlineRequest request = new GetParagraphOnlineRequest(
            requestDocument,
            0,
            "sections/0",
            null,
            null
        );

        ParagraphResponse result = TestInitializer.wordsApi.getParagraphOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph without node path.
     */
    @Test
    public void testGetDocumentParagraphByIndexWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentParagraphByIndexWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetParagraphRequest request = new GetParagraphRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        ParagraphResponse result = TestInitializer.wordsApi.getParagraph(request);
        assertNotNull(result);
        assertNotNull(result.getParagraph());
        assertEquals("0.0.0", result.getParagraph().getNodeId());
    }

    /*
     * Test for getting all paragraphs.
     */
    @Test
    public void testGetDocumentParagraphs() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentParagraphs.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetParagraphsRequest request = new GetParagraphsRequest(
            remoteFileName,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        ParagraphLinkCollectionResponse result = TestInitializer.wordsApi.getParagraphs(request);
        assertNotNull(result);
        assertNotNull(result.getParagraphs());
        assertNotNull(result.getParagraphs().getParagraphLinkList());
        assertEquals(15, result.getParagraphs().getParagraphLinkList().size());
        assertEquals("Page 1 of 3", result.getParagraphs().getParagraphLinkList().get(0).getText());
    }

    /*
     * Test for getting all paragraphs online.
     */
    @Test
    public void testGetDocumentParagraphsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetParagraphsOnlineRequest request = new GetParagraphsOnlineRequest(
            requestDocument,
            "sections/0",
            null,
            null
        );

        ParagraphLinkCollectionResponse result = TestInitializer.wordsApi.getParagraphsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting all paragraphs without node path.
     */
    @Test
    public void testGetDocumentParagraphsWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentParagraphsWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetParagraphsRequest request = new GetParagraphsRequest(
            remoteFileName,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        ParagraphLinkCollectionResponse result = TestInitializer.wordsApi.getParagraphs(request);
        assertNotNull(result);
        assertNotNull(result.getParagraphs());
        assertNotNull(result.getParagraphs().getParagraphLinkList());
        assertEquals(15, result.getParagraphs().getParagraphLinkList().size());
        assertEquals("Page 1 of 3", result.getParagraphs().getParagraphLinkList().get(0).getText());
    }

    /*
     * Test for getting paragraph run.
     */
    @Test
    public void testGetDocumentParagraphRun() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentParagraphRun.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetRunRequest request = new GetRunRequest(
            remoteFileName,
            "paragraphs/0",
            0,
            remoteDataFolder,
            null,
            null,
            null
        );

        RunResponse result = TestInitializer.wordsApi.getRun(request);
        assertNotNull(result);
        assertNotNull(result.getRun());
        assertEquals("Page ", result.getRun().getText());
    }

    /*
     * Test for getting paragraph run online.
     */
    @Test
    public void testGetDocumentParagraphRunOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetRunOnlineRequest request = new GetRunOnlineRequest(
            requestDocument,
            "paragraphs/0",
            0,
            null,
            null
        );

        RunResponse result = TestInitializer.wordsApi.getRunOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph run font.
     */
    @Test
    public void testGetDocumentParagraphRunFont() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentParagraphRunFont.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetRunFontRequest request = new GetRunFontRequest(
            remoteFileName,
            "paragraphs/0",
            0,
            remoteDataFolder,
            null,
            null,
            null
        );

        FontResponse result = TestInitializer.wordsApi.getRunFont(request);
        assertNotNull(result);
        assertNotNull(result.getFont());
        assertEquals("Times New Roman", result.getFont().getName());
    }

    /*
     * Test for getting paragraph run font online.
     */
    @Test
    public void testGetDocumentParagraphRunFontOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetRunFontOnlineRequest request = new GetRunFontOnlineRequest(
            requestDocument,
            "paragraphs/0",
            0,
            null,
            null
        );

        FontResponse result = TestInitializer.wordsApi.getRunFontOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph runs.
     */
    @Test
    public void testGetParagraphRuns() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetParagraphRuns.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetRunsRequest request = new GetRunsRequest(
            remoteFileName,
            "sections/0/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        RunsResponse result = TestInitializer.wordsApi.getRuns(request);
        assertNotNull(result);
        assertNotNull(result.getRuns());
        assertNotNull(result.getRuns().getList());
        assertEquals(6, result.getRuns().getList().size());
        assertEquals("Page ", result.getRuns().getList().get(0).getText());
    }

    /*
     * Test for getting paragraph runs online.
     */
    @Test
    public void testGetParagraphRunsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetRunsOnlineRequest request = new GetRunsOnlineRequest(
            requestDocument,
            "sections/0/paragraphs/0",
            null,
            null
        );

        RunsResponse result = TestInitializer.wordsApi.getRunsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating paragraph run font.
     */
    @Test
    public void testUpdateRunFont() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateRunFont.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        Font requestFontDto = new Font();
        requestFontDto.setBold(true);

        UpdateRunFontRequest request = new UpdateRunFontRequest(
            remoteFileName,
            "paragraphs/0",
            0,
            requestFontDto,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        FontResponse result = TestInitializer.wordsApi.updateRunFont(request);
        assertNotNull(result);
        assertNotNull(result.getFont());
        assertEquals(Boolean.valueOf(true), result.getFont().getBold());
    }

    /*
     * Test for updating paragraph run font online.
     */
    @Test
    public void testUpdateRunFontOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        Font requestFontDto = new Font();
        requestFontDto.setBold(true);

        UpdateRunFontOnlineRequest request = new UpdateRunFontOnlineRequest(
            requestDocument,
            "paragraphs/0",
            requestFontDto,
            0,
            null,
            null,
            null,
            null,
            null
        );

        UpdateRunFontOnlineResponse result = TestInitializer.wordsApi.updateRunFontOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for adding paragraph.
     */
    @Test
    public void testInsertParagraph() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertParagraph.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ParagraphInsert requestParagraph = new ParagraphInsert();
        requestParagraph.setText("This is a new paragraph for your document");

        InsertParagraphRequest request = new InsertParagraphRequest(
            remoteFileName,
            requestParagraph,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        ParagraphResponse result = TestInitializer.wordsApi.insertParagraph(request);
        assertNotNull(result);
        assertNotNull(result.getParagraph());
        assertEquals("0.3.8", result.getParagraph().getNodeId());
    }

    /*
     * Test for adding paragraph online.
     */
    @Test
    public void testInsertParagraphOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        ParagraphInsert requestParagraph = new ParagraphInsert();
        requestParagraph.setText("This is a new paragraph for your document");

        InsertParagraphOnlineRequest request = new InsertParagraphOnlineRequest(
            requestDocument,
            requestParagraph,
            "sections/0",
            null,
            null,
            null,
            null,
            null,
            null
        );

        InsertParagraphOnlineResponse result = TestInitializer.wordsApi.insertParagraphOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for adding paragraph without node path.
     */
    @Test
    public void testInsertParagraphWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertParagraphWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ParagraphInsert requestParagraph = new ParagraphInsert();
        requestParagraph.setText("This is a new paragraph for your document");

        InsertParagraphRequest request = new InsertParagraphRequest(
            remoteFileName,
            requestParagraph,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        ParagraphResponse result = TestInitializer.wordsApi.insertParagraph(request);
        assertNotNull(result);
        assertNotNull(result.getParagraph());
        assertEquals("0.3.8", result.getParagraph().getNodeId());
    }

    /*
     * Test for paragraph rendering.
     */
    @Test
    public void testRenderParagraph() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestRenderParagraph.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RenderParagraphRequest request = new RenderParagraphRequest(
            remoteFileName,
            "png",
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.renderParagraph(request);
        assertNotNull(result);
    }

    /*
     * Test for paragraph rendering.
     */
    @Test
    public void testRenderParagraphOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        RenderParagraphOnlineRequest request = new RenderParagraphOnlineRequest(
            requestDocument,
            "png",
            0,
            "",
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.renderParagraphOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for paragraph rendering without node path.
     */
    @Test
    public void testRenderParagraphWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestRenderParagraphWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RenderParagraphRequest request = new RenderParagraphRequest(
            remoteFileName,
            "png",
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.renderParagraph(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph format settings.
     */
    @Test
    public void testGetParagraphFormat() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentParagraphs.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetParagraphFormatRequest request = new GetParagraphFormatRequest(
            remoteFileName,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null
        );

        ParagraphFormatResponse result = TestInitializer.wordsApi.getParagraphFormat(request);
        assertNotNull(result);
        assertNotNull(result.getParagraphFormat());
        assertEquals("Normal", result.getParagraphFormat().getStyleName());
    }

    /*
     * Test for getting paragraph format settings online.
     */
    @Test
    public void testGetParagraphFormatOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetParagraphFormatOnlineRequest request = new GetParagraphFormatOnlineRequest(
            requestDocument,
            0,
            "",
            null,
            null
        );

        ParagraphFormatResponse result = TestInitializer.wordsApi.getParagraphFormatOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph format settings without node path.
     */
    @Test
    public void testGetParagraphFormatWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentParagraphsWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetParagraphFormatRequest request = new GetParagraphFormatRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        ParagraphFormatResponse result = TestInitializer.wordsApi.getParagraphFormat(request);
        assertNotNull(result);
        assertNotNull(result.getParagraphFormat());
        assertEquals("Normal", result.getParagraphFormat().getStyleName());
    }

    /*
     * Test for updating  paragraph format settings.
     */
    @Test
    public void testUpdateParagraphFormat() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentParagraphs.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ParagraphFormatUpdate requestParagraphFormatDto = new ParagraphFormatUpdate();
        requestParagraphFormatDto.setAlignment(ParagraphFormatUpdate.AlignmentEnum.RIGHT);

        UpdateParagraphFormatRequest request = new UpdateParagraphFormatRequest(
            remoteFileName,
            0,
            requestParagraphFormatDto,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        ParagraphFormatResponse result = TestInitializer.wordsApi.updateParagraphFormat(request);
        assertNotNull(result);
        assertNotNull(result.getParagraphFormat());

    }

    /*
     * Test for updating  paragraph format settings online.
     */
    @Test
    public void testUpdateParagraphFormatOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        ParagraphFormatUpdate requestParagraphFormatDto = new ParagraphFormatUpdate();
        requestParagraphFormatDto.setAlignment(ParagraphFormatUpdate.AlignmentEnum.RIGHT);

        UpdateParagraphFormatOnlineRequest request = new UpdateParagraphFormatOnlineRequest(
            requestDocument,
            requestParagraphFormatDto,
            0,
            "",
            null,
            null,
            null,
            null,
            null
        );

        UpdateParagraphFormatOnlineResponse result = TestInitializer.wordsApi.updateParagraphFormatOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting  a paragraph.
     */
    @Test
    public void testDeleteParagraph() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteParagraph.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteParagraphRequest request = new DeleteParagraphRequest(
            remoteFileName,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteParagraph(request);
    }

    /*
     * Test for deleting  a paragraph online.
     */
    @Test
    public void testDeleteParagraphOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteParagraphOnlineRequest request = new DeleteParagraphOnlineRequest(
            requestDocument,
            0,
            "",
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.deleteParagraphOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting  a paragraph without node path.
     */
    @Test
    public void testDeleteParagraphWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteParagraphWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteParagraphRequest request = new DeleteParagraphRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteParagraph(request);
    }

    /*
     * Test for getting paragraph list format.
     */
    @Test
    public void testGetParagraphListFormat() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestParagraphGetListFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, listFolder + "/ParagraphGetListFormat.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetParagraphListFormatRequest request = new GetParagraphListFormatRequest(
            remoteFileName,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null
        );

        ParagraphListFormatResponse result = TestInitializer.wordsApi.getParagraphListFormat(request);
        assertNotNull(result);
        assertNotNull(result.getListFormat());
        assertEquals(Integer.valueOf(1), result.getListFormat().getListId());
    }

    /*
     * Test for getting paragraph list format online.
     */
    @Test
    public void testGetParagraphListFormatOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, listFolder + "/ParagraphGetListFormat.doc").toAbsolutePath());
        GetParagraphListFormatOnlineRequest request = new GetParagraphListFormatOnlineRequest(
            requestDocument,
            0,
            "",
            null,
            null
        );

        ParagraphListFormatResponse result = TestInitializer.wordsApi.getParagraphListFormatOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph list format without node path.
     */
    @Test
    public void testGetParagraphListFormatWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestParagraphGetListFormatWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, listFolder + "/ParagraphGetListFormat.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetParagraphListFormatRequest request = new GetParagraphListFormatRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        ParagraphListFormatResponse result = TestInitializer.wordsApi.getParagraphListFormat(request);
        assertNotNull(result);
        assertNotNull(result.getListFormat());
        assertEquals(Integer.valueOf(1), result.getListFormat().getListId());
    }

    /*
     * Test for updating paragraph list format.
     */
    @Test
    public void testUpdateParagraphListFormat() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateParagraphListFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, listFolder + "/ParagraphUpdateListFormat.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        ListFormatUpdate requestListFormatDto = new ListFormatUpdate();
        requestListFormatDto.setListId(2);

        UpdateParagraphListFormatRequest request = new UpdateParagraphListFormatRequest(
            remoteFileName,
            0,
            requestListFormatDto,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        ParagraphListFormatResponse result = TestInitializer.wordsApi.updateParagraphListFormat(request);
        assertNotNull(result);
        assertNotNull(result.getListFormat());
        assertEquals(Integer.valueOf(2), result.getListFormat().getListId());
    }

    /*
     * Test for updating paragraph list format online.
     */
    @Test
    public void testUpdateParagraphListFormatOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, listFolder + "/ParagraphUpdateListFormat.doc").toAbsolutePath());
        ListFormatUpdate requestListFormatDto = new ListFormatUpdate();
        requestListFormatDto.setListId(2);

        UpdateParagraphListFormatOnlineRequest request = new UpdateParagraphListFormatOnlineRequest(
            requestDocument,
            requestListFormatDto,
            0,
            "",
            null,
            null,
            null,
            null,
            null
        );

        UpdateParagraphListFormatOnlineResponse result = TestInitializer.wordsApi.updateParagraphListFormatOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating paragraph list format without node path.
     */
    @Test
    public void testUpdateParagraphListFormatWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateParagraphListFormatWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, listFolder + "/ParagraphUpdateListFormat.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        ListFormatUpdate requestListFormatDto = new ListFormatUpdate();
        requestListFormatDto.setListId(2);

        UpdateParagraphListFormatRequest request = new UpdateParagraphListFormatRequest(
            remoteFileName,
            0,
            requestListFormatDto,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        ParagraphListFormatResponse result = TestInitializer.wordsApi.updateParagraphListFormat(request);
        assertNotNull(result);
        assertNotNull(result.getListFormat());
        assertEquals(Integer.valueOf(2), result.getListFormat().getListId());
    }

    /*
     * Test for deleting paragraph list format.
     */
    @Test
    public void testDeleteParagraphListFormat() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteParagraphListFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, listFolder + "/ParagraphDeleteListFormat.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteParagraphListFormatRequest request = new DeleteParagraphListFormatRequest(
            remoteFileName,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        ParagraphListFormatResponse result = TestInitializer.wordsApi.deleteParagraphListFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting paragraph list format online.
     */
    @Test
    public void testDeleteParagraphListFormatOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, listFolder + "/ParagraphDeleteListFormat.doc").toAbsolutePath());
        DeleteParagraphListFormatOnlineRequest request = new DeleteParagraphListFormatOnlineRequest(
            requestDocument,
            0,
            "",
            null,
            null,
            null,
            null,
            null
        );

        DeleteParagraphListFormatOnlineResponse result = TestInitializer.wordsApi.deleteParagraphListFormatOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting paragraph list format without node path.
     */
    @Test
    public void testDeleteParagraphListFormatWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteParagraphListFormatWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, listFolder + "/ParagraphDeleteListFormat.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteParagraphListFormatRequest request = new DeleteParagraphListFormatRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        ParagraphListFormatResponse result = TestInitializer.wordsApi.deleteParagraphListFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph tab stops.
     */
    @Test
    public void testGetParagraphTabStops() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetParagraphTabStops.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetParagraphTabStopsRequest request = new GetParagraphTabStopsRequest(
            remoteFileName,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null
        );

        TabStopsResponse result = TestInitializer.wordsApi.getParagraphTabStops(request);
        assertNotNull(result);
        assertNotNull(result.getTabStops());
        assertEquals(2, result.getTabStops().size());
        assertEquals(72.0, result.getTabStops().get(0).getPosition());
    }

    /*
     * Test for getting paragraph tab stops online.
     */
    @Test
    public void testGetParagraphTabStopsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx").toAbsolutePath());
        GetParagraphTabStopsOnlineRequest request = new GetParagraphTabStopsOnlineRequest(
            requestDocument,
            0,
            "",
            null,
            null
        );

        TabStopsResponse result = TestInitializer.wordsApi.getParagraphTabStopsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph tab stops without node path.
     */
    @Test
    public void testGetParagraphTabStopsWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetParagraphTabStopsWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetParagraphTabStopsRequest request = new GetParagraphTabStopsRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        TabStopsResponse result = TestInitializer.wordsApi.getParagraphTabStops(request);
        assertNotNull(result);
        assertNotNull(result.getTabStops());
        assertEquals(2, result.getTabStops().size());
        assertEquals(72.0, result.getTabStops().get(0).getPosition());
    }

    /*
     * Test for inserting paragraph tab stop.
     */
    @Test
    public void testInsertParagraphTabStops() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertOrUpdateParagraphTabStop.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        TabStopInsert requestTabStopInsertDto = new TabStopInsert();
        requestTabStopInsertDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
        requestTabStopInsertDto.setLeader(TabStopInsert.LeaderEnum.NONE);
        requestTabStopInsertDto.setPosition((double)100.0);

        InsertOrUpdateParagraphTabStopRequest request = new InsertOrUpdateParagraphTabStopRequest(
            remoteFileName,
            0,
            requestTabStopInsertDto,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        TabStopsResponse result = TestInitializer.wordsApi.insertOrUpdateParagraphTabStop(request);
        assertNotNull(result);
        assertNotNull(result.getTabStops());
        assertEquals(3, result.getTabStops().size());
        assertEquals(100.0, result.getTabStops().get(1).getPosition());


    }

    /*
     * Test for inserting paragraph tab stop online.
     */
    @Test
    public void testInsertParagraphTabStopsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx").toAbsolutePath());
        TabStopInsert requestTabStopInsertDto = new TabStopInsert();
        requestTabStopInsertDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
        requestTabStopInsertDto.setLeader(TabStopInsert.LeaderEnum.NONE);
        requestTabStopInsertDto.setPosition((double)72);

        InsertOrUpdateParagraphTabStopOnlineRequest request = new InsertOrUpdateParagraphTabStopOnlineRequest(
            requestDocument,
            requestTabStopInsertDto,
            0,
            "",
            null,
            null,
            null
        );

        InsertOrUpdateParagraphTabStopOnlineResponse result = TestInitializer.wordsApi.insertOrUpdateParagraphTabStopOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting paragraph tab stop without node path.
     */
    @Test
    public void testInsertParagraphTabStopsWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertOrUpdateParagraphTabStopWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        TabStopInsert requestTabStopInsertDto = new TabStopInsert();
        requestTabStopInsertDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
        requestTabStopInsertDto.setLeader(TabStopInsert.LeaderEnum.NONE);
        requestTabStopInsertDto.setPosition((double)100.0);

        InsertOrUpdateParagraphTabStopRequest request = new InsertOrUpdateParagraphTabStopRequest(
            remoteFileName,
            0,
            requestTabStopInsertDto,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        TabStopsResponse result = TestInitializer.wordsApi.insertOrUpdateParagraphTabStop(request);
        assertNotNull(result);
        assertNotNull(result.getTabStops());
        assertEquals(3, result.getTabStops().size());
        assertEquals(100.0, result.getTabStops().get(1).getPosition());


    }

    /*
     * Test for deleting all paragraph tab stops.
     */
    @Test
    public void testDeleteAllParagraphTabStops() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteAllParagraphTabStops.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteAllParagraphTabStopsRequest request = new DeleteAllParagraphTabStopsRequest(
            remoteFileName,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        TabStopsResponse result = TestInitializer.wordsApi.deleteAllParagraphTabStops(request);
        assertNotNull(result);
        assertNotNull(result.getTabStops());
        assertEquals(0, result.getTabStops().size());
    }

    /*
     * Test for deleting all paragraph tab stops online.
     */
    @Test
    public void testDeleteAllParagraphTabStopsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx").toAbsolutePath());
        DeleteAllParagraphTabStopsOnlineRequest request = new DeleteAllParagraphTabStopsOnlineRequest(
            requestDocument,
            0,
            "",
            null,
            null,
            null
        );

        DeleteAllParagraphTabStopsOnlineResponse result = TestInitializer.wordsApi.deleteAllParagraphTabStopsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting all paragraph tab stops without node path.
     */
    @Test
    public void testDeleteAllParagraphTabStopsWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteAllParagraphTabStopsWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteAllParagraphTabStopsRequest request = new DeleteAllParagraphTabStopsRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        TabStopsResponse result = TestInitializer.wordsApi.deleteAllParagraphTabStops(request);
        assertNotNull(result);
        assertNotNull(result.getTabStops());
        assertEquals(0, result.getTabStops().size());
    }

    /*
     * Test for deleting a tab stops.
     */
    @Test
    public void testDeleteParagraphTabStop() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteParagraphTabStop.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteParagraphTabStopRequest request = new DeleteParagraphTabStopRequest(
            remoteFileName,
            (double)72.0,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        TabStopsResponse result = TestInitializer.wordsApi.deleteParagraphTabStop(request);
        assertNotNull(result);
        assertNotNull(result.getTabStops());
        assertEquals(1, result.getTabStops().size());
    }

    /*
     * Test for deleting a tab stops online.
     */
    @Test
    public void testDeleteParagraphTabStopOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx").toAbsolutePath());
        DeleteParagraphTabStopOnlineRequest request = new DeleteParagraphTabStopOnlineRequest(
            requestDocument,
            (double)72.0,
            0,
            "",
            null,
            null,
            null
        );

        DeleteParagraphTabStopOnlineResponse result = TestInitializer.wordsApi.deleteParagraphTabStopOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting a tab stops without node path.
     */
    @Test
    public void testDeleteParagraphTabStopWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteParagraphTabStopWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteParagraphTabStopRequest request = new DeleteParagraphTabStopRequest(
            remoteFileName,
            (double)72.0,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        TabStopsResponse result = TestInitializer.wordsApi.deleteParagraphTabStop(request);
        assertNotNull(result);
        assertNotNull(result.getTabStops());
        assertEquals(1, result.getTabStops().size());
    }
}
