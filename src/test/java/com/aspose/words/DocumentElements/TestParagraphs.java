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
package com.aspose.words.DocumentElements;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;

import com.aspose.words.ApiException;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.Font;
import com.aspose.words.model.FontResponse;
import com.aspose.words.model.ParagraphFormat;
import com.aspose.words.model.ParagraphFormatResponse;
import com.aspose.words.model.ParagraphInsert;
import com.aspose.words.model.ParagraphLinkCollectionResponse;
import com.aspose.words.model.ParagraphResponse;
import com.aspose.words.model.RunResponse;
import com.aspose.words.model.RunsResponse;
import com.aspose.words.model.requests.DeleteParagraphRequest;
import com.aspose.words.model.requests.GetParagraphFormatRequest;
import com.aspose.words.model.requests.GetParagraphRequest;
import com.aspose.words.model.requests.GetParagraphsRequest;
import com.aspose.words.model.requests.GetRunFontRequest;
import com.aspose.words.model.requests.GetRunRequest;
import com.aspose.words.model.requests.GetRunsRequest;
import com.aspose.words.model.requests.InsertParagraphRequest;
import com.aspose.words.model.requests.RenderParagraphRequest;
import com.aspose.words.model.requests.UpdateParagraphFormatRequest;
import com.aspose.words.model.requests.UpdateRunFontRequest;

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
    public void testDeleteParagraph() throws ApiException, FileNotFoundException {
        String fileName = "test_doc.docx";
        String remoteName = "TestDeleteParagraph.doc";
        Integer index = 0;
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteParagraphRequest request = new DeleteParagraphRequest(remoteName, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteParagraph(request);
    }

    /*
     * Test for getting paragraph
     */
    public void testGetDocumentParagraph() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraph.doc";
        Integer index = 0;
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetParagraphRequest request = new GetParagraphRequest(remoteName, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        ParagraphResponse result = TestInitializer.wordsApi.getParagraph(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph run
     */
    public void testGetDocumentParagraphRun() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphRun.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetRunRequest request = new GetRunRequest(remoteName, paragraphPath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        RunResponse result = TestInitializer.wordsApi.getRun(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph run
     */
    public void testGetDocumentParagraphRunFont() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphRunFont.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetRunFontRequest request = new GetRunFontRequest(remoteName, paragraphPath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        FontResponse result = TestInitializer.wordsApi.getRunFont(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraph runs
     */
    public void testGetDocumentParagraphRuns() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphRuns.doc";
        String paragraphPath = "sections/0/paragraphs/0";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetRunsRequest request = new GetRunsRequest(remoteName, paragraphPath,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        RunsResponse result = TestInitializer.wordsApi.getRuns(request);
        assertNotNull(result);
    }

    /*
     * Test for getting paragraphs
     */
    public void testGetDocumentParagraphs() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphRuns.doc";
        String paragraphPath = "sections/0";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetParagraphsRequest request = new GetParagraphsRequest(remoteName, paragraphPath,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        ParagraphLinkCollectionResponse result = TestInitializer.wordsApi.getParagraphs(request);
        assertNotNull(result);
    }

    /*
     * Test for updating paragraph font
     */
    public void testPostDocumentParagraphRunFont() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostDocumentParagraphRunFont.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        Font body = new Font().bold(true);
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateRunFontRequest request = new UpdateRunFontRequest(remoteName, body, paragraphPath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null);

        FontResponse result = TestInitializer.wordsApi.updateRunFont(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting paragraph
     */
    public void testPutParagraph() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutParagraph.doc";
        String paragraphPath = "sections/0";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        ParagraphInsert body = new ParagraphInsert().text("This is a new paragraph for your document");
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertParagraphRequest request = new InsertParagraphRequest(remoteName, body, paragraphPath,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null, null);

        ParagraphResponse result = TestInitializer.wordsApi.insertParagraph(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting paragraph
     */
    public void testRenderParagraph() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestRenderParagraph.doc";
        Integer index = 0;
        String format = "png";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        RenderParagraphRequest request = new RenderParagraphRequest(remoteName, format, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null,null);

        File result = TestInitializer.wordsApi.renderParagraph(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for updating paragraph format
     */
    public void testPostDocumentParagraphFormat() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "PostDocumentParagraphFormat.doc";
        ParagraphFormat body = new ParagraphFormat().alignment(ParagraphFormat.AlignmentEnum.RIGHT);
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateParagraphFormatRequest request = new UpdateParagraphFormatRequest(remoteName, body, "", 0,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        ParagraphFormatResponse result = TestInitializer.wordsApi.updateParagraphFormat(request);
        assertNotNull(result);
    }

    public void testGetDocumentParagraphFormat() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "GetDocumentParagraphFormat.doc";
        Integer index = 0;
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetParagraphFormatRequest request = new GetParagraphFormatRequest(remoteName, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        ParagraphFormatResponse result = TestInitializer.wordsApi.getParagraphFormat(request);
        assertNotNull(result);
    }
}
