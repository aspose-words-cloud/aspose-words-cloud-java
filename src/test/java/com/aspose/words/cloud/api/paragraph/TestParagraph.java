/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestParagraph.java">
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

package com.aspose.words.cloud.api.paragraph;

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
    public void testGetDocumentParagraphByIndex() throws ApiException, IOException
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
    }

    /*
     * Test for getting paragraph without node path.
     */
    @Test
    public void testGetDocumentParagraphByIndexWithoutNodePath() throws ApiException, IOException
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
    }

    /*
     * Test for getting all paragraphs.
     */
    @Test
    public void testGetDocumentParagraphs() throws ApiException, IOException
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
    }

    /*
     * Test for getting all paragraphs without node path.
     */
    @Test
    public void testGetDocumentParagraphsWithoutNodePath() throws ApiException, IOException
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
    }

    /*
     * Test for getting paragraph run.
     */
    @Test
    public void testGetDocumentParagraphRun() throws ApiException, IOException
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
    }

    /*
     * Test for getting paragraph run font.
     */
    @Test
    public void testGetDocumentParagraphRunFont() throws ApiException, IOException
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
    }

    /*
     * Test for getting paragraph runs.
     */
    @Test
    public void testGetParagraphRuns() throws ApiException, IOException
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
    }

    /*
     * Test for updating paragraph run font.
     */
    @Test
    public void testUpdateRunFont() throws ApiException, IOException
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
            requestFontDto,
            "paragraphs/0",
            0,
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
    }

    /*
     * Test for adding paragraph.
     */
    @Test
    public void testInsertParagraph() throws ApiException, IOException
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
    }

    /*
     * Test for adding paragraph without node path.
     */
    @Test
    public void testInsertParagraphWithoutNodePath() throws ApiException, IOException
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
    }

    /*
     * Test for paragraph rendering.
     */
    @Test
    public void testRenderParagraph() throws ApiException, IOException
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
            null
        );

        File result = TestInitializer.wordsApi.renderParagraph(request);
        assertNotNull(result);
    }

    /*
     * Test for paragraph rendering without node path.
     */
    @Test
    public void testRenderParagraphWithoutNodePath() throws ApiException, IOException
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
            null
        );

        File result = TestInitializer.wordsApi.renderParagraph(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph format settings.
     */
    @Test
    public void testGetParagraphFormat() throws ApiException, IOException
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
    }

    /*
     * Test for getting paragraph format settings without node path.
     */
    @Test
    public void testGetParagraphFormatWithoutNodePath() throws ApiException, IOException
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
    }

    /*
     * Test for updating  paragraph format settings.
     */
    @Test
    public void testUpdateParagraphFormat() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentParagraphs.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ParagraphFormatUpdate requestDto = new ParagraphFormatUpdate();
        requestDto.setAlignment(ParagraphFormatUpdate.AlignmentEnum.RIGHT);

        UpdateParagraphFormatRequest request = new UpdateParagraphFormatRequest(
            remoteFileName,
            requestDto,
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

        ParagraphFormatResponse result = TestInitializer.wordsApi.updateParagraphFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting  a paragraph.
     */
    @Test
    public void testDeleteParagraph() throws ApiException, IOException
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
     * Test for deleting  a paragraph without node path.
     */
    @Test
    public void testDeleteParagraphWithoutNodePath() throws ApiException, IOException
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
    public void testGetParagraphListFormat() throws ApiException, IOException
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
    }

    /*
     * Test for getting paragraph list format without node path.
     */
    @Test
    public void testGetParagraphListFormatWithoutNodePath() throws ApiException, IOException
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
    }

    /*
     * Test for updating paragraph list format.
     */
    @Test
    public void testUpdateParagraphListFormat() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateParagraphListFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, listFolder + "/ParagraphUpdateListFormat.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        ListFormatUpdate requestDto = new ListFormatUpdate();
        requestDto.setListId(2);

        UpdateParagraphListFormatRequest request = new UpdateParagraphListFormatRequest(
            remoteFileName,
            requestDto,
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

        ParagraphListFormatResponse result = TestInitializer.wordsApi.updateParagraphListFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for updating paragraph list format without node path.
     */
    @Test
    public void testUpdateParagraphListFormatWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateParagraphListFormatWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, listFolder + "/ParagraphUpdateListFormat.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        ListFormatUpdate requestDto = new ListFormatUpdate();
        requestDto.setListId(2);

        UpdateParagraphListFormatRequest request = new UpdateParagraphListFormatRequest(
            remoteFileName,
            requestDto,
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

        ParagraphListFormatResponse result = TestInitializer.wordsApi.updateParagraphListFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting paragraph list format.
     */
    @Test
    public void testDeleteParagraphListFormat() throws ApiException, IOException
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
     * Test for deleting paragraph list format without node path.
     */
    @Test
    public void testDeleteParagraphListFormatWithoutNodePath() throws ApiException, IOException
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
    public void testGetParagraphTabStops() throws ApiException, IOException
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
    }

    /*
     * Test for getting paragraph tab stops without node path.
     */
    @Test
    public void testGetParagraphTabStopsWithoutNodePath() throws ApiException, IOException
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
    }

    /*
     * Test for inserting paragraph tab stop.
     */
    @Test
    public void testInsertParagraphTabStops() throws ApiException, IOException
    {
        String remoteFileName = "TestInsertOrUpdateParagraphTabStop.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        TabStopInsert requestDto = new TabStopInsert();
        requestDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
        requestDto.setLeader(TabStopInsert.LeaderEnum.NONE);
        requestDto.setPosition((double)72);

        InsertOrUpdateParagraphTabStopRequest request = new InsertOrUpdateParagraphTabStopRequest(
            remoteFileName,
            requestDto,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        TabStopsResponse result = TestInitializer.wordsApi.insertOrUpdateParagraphTabStop(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting paragraph tab stop without node path.
     */
    @Test
    public void testInsertParagraphTabStopsWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestInsertOrUpdateParagraphTabStopWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        TabStopInsert requestDto = new TabStopInsert();
        requestDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
        requestDto.setLeader(TabStopInsert.LeaderEnum.NONE);
        requestDto.setPosition((double)72);

        InsertOrUpdateParagraphTabStopRequest request = new InsertOrUpdateParagraphTabStopRequest(
            remoteFileName,
            requestDto,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        TabStopsResponse result = TestInitializer.wordsApi.insertOrUpdateParagraphTabStop(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting all paragraph tab stops.
     */
    @Test
    public void testDeleteAllParagraphTabStops() throws ApiException, IOException
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
    }

    /*
     * Test for deleting all paragraph tab stops without node path.
     */
    @Test
    public void testDeleteAllParagraphTabStopsWithoutNodePath() throws ApiException, IOException
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
    }

    /*
     * Test for deleting a tab stops.
     */
    @Test
    public void testDeleteParagraphTabStop() throws ApiException, IOException
    {
        String remoteFileName = "TestDeleteParagraphTabStop.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteParagraphTabStopRequest request = new DeleteParagraphTabStopRequest(
            remoteFileName,
            (double)72,
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
    }

    /*
     * Test for deleting a tab stops without node path.
     */
    @Test
    public void testDeleteParagraphTabStopWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestDeleteParagraphTabStopWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, tabStopFolder + "/ParagraphTabStops.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteParagraphTabStopRequest request = new DeleteParagraphTabStopRequest(
            remoteFileName,
            (double)72,
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
    }
}
