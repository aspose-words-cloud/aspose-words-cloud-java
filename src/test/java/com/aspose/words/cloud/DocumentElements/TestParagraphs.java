/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Words for Cloud
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
package com.aspose.words.cloud.DocumentElements;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestParagraphs extends TestCase {
    private String testFolder = "DocumentElements/Paragraphs";
    private String testListFolder = "DocumentElements/ParagraphListFormat";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for removing paragraph
     */
    @Test
    public void testDeleteParagraph() throws ApiException, IOException {
        String fileName = "test_doc.docx";
        String remoteName = "TestDeleteParagraph.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        DeleteParagraphRequest request = new DeleteParagraphRequest(remoteName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteParagraph(request);
    }

        /*
     * Test for removing paragraph without node path
     */
    @Test
    public void testDeleteParagraphWithoutNodePath() throws ApiException, IOException {
        String fileName = "test_doc.docx";
        String remoteName = "TestDeleteParagraphWithoutNodePath.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        DeleteParagraphWithoutNodePathRequest request = new DeleteParagraphWithoutNodePathRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteParagraphWithoutNodePath(request);
    }

    /*
     * Test for getting paragraph
     */
    @Test
    public void testGetParagraph() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetParagraph.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetParagraphRequest request = new GetParagraphRequest(remoteName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        ParagraphResponse result = TestInitializer.wordsApi.getParagraph(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph without node path
     */
    @Test
    public void testGetParagraphWithoutNodePath() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetParagraphWithoutNodePath.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetParagraphWithoutNodePathRequest request = new GetParagraphWithoutNodePathRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        ParagraphResponse result = TestInitializer.wordsApi.getParagraphWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph run
     */
    @Test
    public void testGetRun() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetRun.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetRunRequest request = new GetRunRequest(remoteName, paragraphPath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        RunResponse result = TestInitializer.wordsApi.getRun(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph run
     */
    @Test
    public void testGetRunFont() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetRunFont.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetRunFontRequest request = new GetRunFontRequest(remoteName, paragraphPath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        FontResponse result = TestInitializer.wordsApi.getRunFont(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph runs
     */
    @Test
    public void testGetRuns() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphRuns.doc";
        String paragraphPath = "sections/0/paragraphs/0";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetRunsRequest request = new GetRunsRequest(remoteName, paragraphPath,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        RunsResponse result = TestInitializer.wordsApi.getRuns(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraphs
     */
    @Test
    public void testGetParagraphs() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetParagraphs.doc";
        String paragraphPath = "sections/0";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetParagraphsRequest request = new GetParagraphsRequest(remoteName, paragraphPath,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        ParagraphLinkCollectionResponse result = TestInitializer.wordsApi.getParagraphs(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraphs without node path
     */
    @Test
    public void testGetParagraphsWithoutNodePath() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetParagraphsWithoutNodePath.doc";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetParagraphsWithoutNodePathRequest request = new GetParagraphsWithoutNodePathRequest(remoteName,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        ParagraphLinkCollectionResponse result = TestInitializer.wordsApi.getParagraphsWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for updating paragraph font
     */
    @Test
    public void testUpdateRunFont() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestUpdateRunFont.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName);
        Font body = new Font().bold(true);
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        UpdateRunFontRequest request = new UpdateRunFontRequest(remoteName, body, paragraphPath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, destName, null, null);

        FontResponse result = TestInitializer.wordsApi.updateRunFont(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting paragraph
     */
    @Test
    public void testInsertParagraph() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestInsertParagraph.doc";
        String paragraphPath = "sections/0";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName);
        ParagraphInsert body = new ParagraphInsert().text("This is a new paragraph for your document");
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        InsertParagraphRequest request = new InsertParagraphRequest(remoteName, body, paragraphPath,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, destName, null, null, null);

        ParagraphResponse result = TestInitializer.wordsApi.insertParagraph(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting paragraph
     */
    @Test
    public void testInsertParagraphWithoutNodePath() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestInsertParagraph.doc";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName);
        ParagraphInsert body = new ParagraphInsert().text("This is a new paragraph for your document");
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        InsertParagraphWithoutNodePathRequest request = new InsertParagraphWithoutNodePathRequest(remoteName, body,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, destName, null, null, null);

        ParagraphResponse result = TestInitializer.wordsApi.insertParagraphWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for rendering paragraph
     */
    @Test
    public void testRenderParagraph() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestRenderParagraph.doc";
        Integer index = 0;
        String format = "png";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        RenderParagraphRequest request = new RenderParagraphRequest(remoteName, format, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null,null);

        File result = TestInitializer.wordsApi.renderParagraph(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for rendering paragraph without node path
     */
    @Test
    public void testRenderParagraphWithoutNodePath() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestRenderParagraphWithoutNodePath.doc";
        Integer index = 0;
        String format = "png";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        RenderParagraphWithoutNodePathRequest request = new RenderParagraphWithoutNodePathRequest(remoteName, format, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null,null);

        File result = TestInitializer.wordsApi.renderParagraphWithoutNodePath(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for updating paragraph format
     */
    @Test
    public void testUpdateParagraphFormat() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "UpdateParagraphFormat.doc";
        ParagraphFormatUpdate body = (ParagraphFormatUpdate)(new ParagraphFormatUpdate().alignment(ParagraphFormatBase.AlignmentEnum.RIGHT));
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        UpdateParagraphFormatRequest request = new UpdateParagraphFormatRequest(remoteName, body, "", 0,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null);

        ParagraphFormatResponse result = TestInitializer.wordsApi.updateParagraphFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for updating paragraph format
     */
    @Test
    public void testUpdateParagraphFormatWithoutNodePath() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "UpdateParagraphFormat.doc";
        ParagraphFormat body = new ParagraphFormat().alignment(ParagraphFormat.AlignmentEnum.RIGHT);
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        UpdateParagraphFormatWithoutNodePathRequest request = new UpdateParagraphFormatWithoutNodePathRequest(remoteName, body, 0,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null);

        ParagraphFormatResponse result = TestInitializer.wordsApi.updateParagraphFormatWithoutNodePath(request);
        assertNotNull(result);
    }

    @Test
    public void testGetParagraphFormat() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "GetParagraphFormat.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetParagraphFormatRequest request = new GetParagraphFormatRequest(remoteName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        ParagraphFormatResponse result = TestInitializer.wordsApi.getParagraphFormat(request);
        assertNotNull(result);
    }

    @Test
    public void testGetParagraphFormatWithoutNodePath() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "GetParagraphFormatWithoutNodePath.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetParagraphFormatWithoutNodePathRequest request = new GetParagraphFormatWithoutNodePathRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        ParagraphFormatResponse result = TestInitializer.wordsApi.getParagraphFormatWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph list format
     */
    @Test
    public void testGetParagraphListFormat() throws ApiException, IOException {
        String fileName = "ParagraphGetListFormat.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testListFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder, fileName).replace("\\", "/"));

        GetParagraphListFormatRequest request = new GetParagraphListFormatRequest(fileName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder).replace("\\", "/"), null, null,
                null);

        ParagraphListFormatResponse result = TestInitializer.wordsApi.getParagraphListFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph list format
     */
    @Test
    public void testGetParagraphListFormatWithoutNodePath() throws ApiException, IOException {
        String fileName = "ParagraphGetListFormat.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testListFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder, fileName).replace("\\", "/"));

        GetParagraphListFormatWithoutNodePathRequest request = new GetParagraphListFormatWithoutNodePathRequest(fileName,  index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder).replace("\\", "/"), null, null,
                null);

        ParagraphListFormatResponse result = TestInitializer.wordsApi.getParagraphListFormatWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for updating paragraph list format
     */
    @Test
    public void testUpdateParagraphListFormat() throws ApiException, IOException {
        String fileName = "ParagraphUpdateListFormat.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testListFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder, fileName).replace("\\", "/"));

        ListFormatUpdate dto = new ListFormatUpdate();
        dto.setListId(2);

        UpdateParagraphListFormatRequest request = new UpdateParagraphListFormatRequest(fileName, dto,"", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder).replace("\\", "/"), null, null,
                null, null, null, null);

        ParagraphListFormatResponse result = TestInitializer.wordsApi.updateParagraphListFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for updating paragraph list format
     */
    @Test
    public void testUpdateParagraphListFormatWithoutNodePath() throws ApiException, IOException {
        String fileName = "ParagraphUpdateListFormat.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testListFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder, fileName).replace("\\", "/"));

        ListFormatUpdate dto = new ListFormatUpdate();
        dto.setListId(2);

        UpdateParagraphListFormatWithoutNodePathRequest request = new UpdateParagraphListFormatWithoutNodePathRequest(fileName, dto, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder).replace("\\", "/"), null, null,
                null, null, null, null);

        ParagraphListFormatResponse result = TestInitializer.wordsApi.updateParagraphListFormatWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting paragraph list format
     */
    @Test
    public void testDeleteParagraphListFormat() throws ApiException, IOException {
        String fileName = "ParagraphDeleteListFormat.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testListFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder, fileName).replace("\\", "/"));

        DeleteParagraphListFormatRequest request = new DeleteParagraphListFormatRequest(fileName,"", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder).replace("\\", "/"), null, null,
                null, null, null, null);

        ParagraphListFormatResponse result = TestInitializer.wordsApi.deleteParagraphListFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting paragraph list format
     */
    @Test
    public void testDeleteParagraphListFormatWithoutNodePath() throws ApiException, IOException {
        String fileName = "ParagraphDeleteListFormat.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testListFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder, fileName).replace("\\", "/"));

        DeleteParagraphListFormatWithoutNodePathRequest request = new DeleteParagraphListFormatWithoutNodePathRequest(fileName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder).replace("\\", "/"), null, null,
                null, null, null, null);

        ParagraphListFormatResponse result = TestInitializer.wordsApi.deleteParagraphListFormatWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting tab stop
     */
    @Test
    public void testDeleteParagraphTabStop() throws ApiException, IOException {
        String fileName = "ParagraphTabStops.docx";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testListFolder, fileName).replace("\\", "/"));

        DeleteParagraphTabStopRequest request = new DeleteParagraphTabStopRequest(fileName,72.0, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null,
                null, null);

        TabStopsResponse result = TestInitializer.wordsApi.deleteParagraphTabStop(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting tab stop
     */
    @Test
    public void testDeleteParagraphTabStopWithoutNodePath() throws ApiException, IOException {
        String fileName = "ParagraphTabStops.docx";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, fileName).replace("\\", "/"));

        DeleteParagraphTabStopWithoutNodePathRequest request = new DeleteParagraphTabStopWithoutNodePathRequest(fileName,72.0, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null,
                null, null);

        TabStopsResponse result = TestInitializer.wordsApi.deleteParagraphTabStopWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for get paragraph tab stop
     */
    @Test
    public void testGetParagraphTabStops() throws ApiException, IOException {
        String fileName = "ParagraphTabStops.docx";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, fileName).replace("\\", "/"));

        GetParagraphTabStopsRequest request = new GetParagraphTabStopsRequest(fileName,"", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null,
                null);

        TabStopsResponse result = TestInitializer.wordsApi.getParagraphTabStops(request);
        assertNotNull(result);
    }

    /*
     * Test for get paragraph tab stop
     */
    @Test
    public void testGetParagraphTabStopsWithoutNodePath() throws ApiException, IOException {
        String fileName = "ParagraphTabStops.docx";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, fileName).replace("\\", "/"));

        GetParagraphTabStopsWithoutNodePathRequest request = new GetParagraphTabStopsWithoutNodePathRequest(fileName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null,
                null);

        TabStopsResponse result = TestInitializer.wordsApi.getParagraphTabStopsWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting tab stop
     */
    @Test
    public void testDeleteAllParagraphTabStops() throws ApiException, IOException {
        String fileName = "ParagraphTabStops.docx";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, fileName).replace("\\", "/"));

        DeleteAllParagraphTabStopsRequest request = new DeleteAllParagraphTabStopsRequest(fileName,"", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null,
                null, null);

        TabStopsResponse result = TestInitializer.wordsApi.deleteAllParagraphTabStops(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting tab stop
     */
    @Test
    public void testDeleteAllParagraphTabStopsWithoutNodePath() throws ApiException, IOException {
        String fileName = "ParagraphTabStops.docx";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, fileName).replace("\\", "/"));

        DeleteAllParagraphTabStopsWithoutNodePathRequest request = new DeleteAllParagraphTabStopsWithoutNodePathRequest(fileName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null,
                null, null);

        TabStopsResponse result = TestInitializer.wordsApi.deleteAllParagraphTabStopsWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting or updating tab stop
     */
    @Test
    public void testInsertOrUpdateParagraphTabStop() throws ApiException, IOException {
        String fileName = "ParagraphTabStops.docx";
        Integer index = 0;
        TabStopInsert dto = (TabStopInsert)new TabStopInsert().alignment(TabStopBase.AlignmentEnum.LEFT).leader(TabStopBase.LeaderEnum.NONE).position(72.0);
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, fileName).replace("\\", "/"));

        InsertOrUpdateParagraphTabStopRequest request = new InsertOrUpdateParagraphTabStopRequest(fileName, dto, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null,
                null, null);

        TabStopsResponse result = TestInitializer.wordsApi.insertOrUpdateParagraphTabStop(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting or updating tab stop
     */
    @Test
    public void testInsertOrUpdateParagraphTabStopWithoutNodePath() throws ApiException, IOException {
        String fileName = "ParagraphTabStops.docx";
        Integer index = 0;
        TabStopInsert dto = (TabStopInsert)new TabStopInsert().alignment(TabStopBase.AlignmentEnum.LEFT).leader(TabStopBase.LeaderEnum.NONE).position(72.0);
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, fileName).replace("\\", "/"));

        InsertOrUpdateParagraphTabStopWithoutNodePathRequest request = new InsertOrUpdateParagraphTabStopWithoutNodePathRequest(fileName, dto, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null,
                null, null);

        TabStopsResponse result = TestInitializer.wordsApi.insertOrUpdateParagraphTabStopWithoutNodePath(request);
        assertNotNull(result);
    }
}
