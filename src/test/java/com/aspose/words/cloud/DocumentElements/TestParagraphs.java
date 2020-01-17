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

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.Font;
import com.aspose.words.cloud.model.FontResponse;
import com.aspose.words.cloud.model.ParagraphFormat;
import com.aspose.words.cloud.model.ParagraphFormatResponse;
import com.aspose.words.cloud.model.ParagraphInsert;
import com.aspose.words.cloud.model.ParagraphLinkCollectionResponse;
import com.aspose.words.cloud.model.ParagraphResponse;
import com.aspose.words.cloud.model.RunResponse;
import com.aspose.words.cloud.model.RunsResponse;
import com.aspose.words.cloud.model.requests.*;

import org.junit.Test;

import junit.framework.TestCase;

public class TestParagraphs extends TestCase {
    private String testFolder = "DocumentElements/Paragraphs";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for removing paragraph
     */
    @Test
public void testDeleteParagraph() throws ApiException, FileNotFoundException {
        String fileName = "test_doc.docx";
        String remoteName = "TestDeleteParagraph.doc";
        Integer index = 0;
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteParagraphRequest request = new DeleteParagraphRequest(remoteName, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteParagraph(request);
    }

        /*
     * Test for removing paragraph without node path
     */
    @Test
public void testDeleteParagraphWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_doc.docx";
        String remoteName = "TestDeleteParagraphWithoutNodePath.doc";
        Integer index = 0;
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteParagraphWithoutNodePathRequest request = new DeleteParagraphWithoutNodePathRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteParagraphWithoutNodePath(request);
    }

    /*
     * Test for getting paragraph
     */
    @Test
public void testGetParagraph() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetParagraph.doc";
        Integer index = 0;
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetParagraphRequest request = new GetParagraphRequest(remoteName, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        ParagraphResponse result = TestInitializer.wordsApi.getParagraph(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph without node path
     */
    @Test
public void testGetParagraphWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetParagraphWithoutNodePath.doc";
        Integer index = 0;
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetParagraphWithoutNodePathRequest request = new GetParagraphWithoutNodePathRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        ParagraphResponse result = TestInitializer.wordsApi.getParagraphWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph run
     */
    @Test
public void testGetRun() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetRun.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetRunRequest request = new GetRunRequest(remoteName, paragraphPath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        RunResponse result = TestInitializer.wordsApi.getRun(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph run
     */
    @Test
public void testGetRunFont() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetRunFont.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetRunFontRequest request = new GetRunFontRequest(remoteName, paragraphPath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        FontResponse result = TestInitializer.wordsApi.getRunFont(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph runs
     */
    @Test
public void testGetRuns() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphRuns.doc";
        String paragraphPath = "sections/0/paragraphs/0";
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetRunsRequest request = new GetRunsRequest(remoteName, paragraphPath,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        RunsResponse result = TestInitializer.wordsApi.getRuns(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraphs
     */
    @Test
public void testGetParagraphs() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetParagraphs.doc";
        String paragraphPath = "sections/0";
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetParagraphsRequest request = new GetParagraphsRequest(remoteName, paragraphPath,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        ParagraphLinkCollectionResponse result = TestInitializer.wordsApi.getParagraphs(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraphs without node path
     */
    @Test
public void testGetParagraphsWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetParagraphsWithoutNodePath.doc";
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetParagraphsWithoutNodePathRequest request = new GetParagraphsWithoutNodePathRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        ParagraphLinkCollectionResponse result = TestInitializer.wordsApi.getParagraphsWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for updating paragraph font
     */
    @Test
public void testUpdateRunFont() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestUpdateRunFont.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        Font body = new Font().bold(true);
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateRunFontRequest request = new UpdateRunFontRequest(remoteName, body, paragraphPath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null);

        FontResponse result = TestInitializer.wordsApi.updateRunFont(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting paragraph
     */
    @Test
public void testInsertParagraph() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestInsertParagraph.doc";
        String paragraphPath = "sections/0";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        ParagraphInsert body = new ParagraphInsert().text("This is a new paragraph for your document");
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertParagraphRequest request = new InsertParagraphRequest(remoteName, body, paragraphPath,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null, null);

        ParagraphResponse result = TestInitializer.wordsApi.insertParagraph(request);
        assertNotNull(result);
    }

    /*
     * Test for rendering paragraph
     */
    @Test
public void testRenderParagraph() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestRenderParagraph.doc";
        Integer index = 0;
        String format = "png";
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        RenderParagraphRequest request = new RenderParagraphRequest(remoteName, format, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null,null);

        File result = TestInitializer.wordsApi.renderParagraph(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for rendering paragraph without node path
     */
    @Test
public void testRenderParagraphWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestRenderParagraphWithoutNodePath.doc";
        Integer index = 0;
        String format = "png";
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        RenderParagraphWithoutNodePathRequest request = new RenderParagraphWithoutNodePathRequest(remoteName, format, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null,null);

        File result = TestInitializer.wordsApi.renderParagraphWithoutNodePath(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for updating paragraph format
     */
    @Test
public void testUpdateParagraphFormat() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "UpdateParagraphFormat.doc";
        ParagraphFormat body = new ParagraphFormat().alignment(ParagraphFormat.AlignmentEnum.RIGHT);
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateParagraphFormatRequest request = new UpdateParagraphFormatRequest(remoteName, body, "", 0,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        ParagraphFormatResponse result = TestInitializer.wordsApi.updateParagraphFormat(request);
        assertNotNull(result);
    }

    @Test
public void testGetParagraphFormat() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "GetParagraphFormat.doc";
        Integer index = 0;
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetParagraphFormatRequest request = new GetParagraphFormatRequest(remoteName, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        ParagraphFormatResponse result = TestInitializer.wordsApi.getParagraphFormat(request);
        assertNotNull(result);
    }

    @Test
public void testGetParagraphFormatWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "GetParagraphFormatWithoutNodePath.doc";
        Integer index = 0;
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetParagraphFormatWithoutNodePathRequest request = new GetParagraphFormatWithoutNodePathRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        ParagraphFormatResponse result = TestInitializer.wordsApi.getParagraphFormatWithoutNodePath(request);
        assertNotNull(result);
    }
}
