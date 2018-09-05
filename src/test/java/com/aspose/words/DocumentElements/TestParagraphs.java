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

import com.aspose.words.ApiException;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.*;
import com.aspose.words.model.requests.*;
import junit.framework.TestCase;

import java.io.File;
import java.nio.file.Paths;

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
    public void testDeleteParagraph() throws ApiException {
        String fileName = "test_doc.docx";
        String remoteName = "TestDeleteParagraph.doc";
        Integer index = 0;
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        DeleteParagraphRequest request = new DeleteParagraphRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, null);

        AsposeResponse result = TestInitializer.wordsApi.deleteParagraph(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting paragraph
     */
    public void testGetDocumentParagraph() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraph.doc";
        Integer index = 0;
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        GetDocumentParagraphRequest request = new GetDocumentParagraphRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null);

        ParagraphResponse result = TestInitializer.wordsApi.getDocumentParagraph(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting paragraph run
     */
    public void testGetDocumentParagraphRun() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphRun.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        GetDocumentParagraphRunRequest request = new GetDocumentParagraphRunRequest(remoteName, paragraphPath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        RunResponse result = TestInitializer.wordsApi.getDocumentParagraphRun(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting paragraph run
     */
    public void testGetDocumentParagraphRunFont() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphRunFont.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        GetDocumentParagraphRunFontRequest request = new GetDocumentParagraphRunFontRequest(remoteName, paragraphPath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        FontResponse result = TestInitializer.wordsApi.getDocumentParagraphRunFont(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting paragraph runs
     */
    public void testGetDocumentParagraphRuns() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphRuns.doc";
        String paragraphPath = "sections/0/paragraphs/0";
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        GetDocumentParagraphRunsRequest request = new GetDocumentParagraphRunsRequest(remoteName, paragraphPath,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        RunsResponse result = TestInitializer.wordsApi.getDocumentParagraphRuns(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting paragraphs
     */
    public void testGetDocumentParagraphs() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphRuns.doc";
        String paragraphPath = "sections/0";
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        GetDocumentParagraphsRequest request = new GetDocumentParagraphsRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, paragraphPath);

        ParagraphLinkCollectionResponse result = TestInitializer.wordsApi.getDocumentParagraphs(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for updating paragraph font
     */
    public void testPostDocumentParagraphRunFont() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostDocumentParagraphRunFont.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/0";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        Font body = new Font().bold(true);
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        PostDocumentParagraphRunFontRequest request = new PostDocumentParagraphRunFontRequest(remoteName, body, paragraphPath, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null);

        FontResponse result = TestInitializer.wordsApi.postDocumentParagraphRunFont(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for inserting paragraph
     */
    public void testPutParagraph() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutParagraph.doc";
        String paragraphPath = "sections/0";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        ParagraphInsert body = new ParagraphInsert().text("This is a new paragraph for your document");
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        PutParagraphRequest request = new PutParagraphRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null, paragraphPath, null);

        ParagraphResponse result = TestInitializer.wordsApi.putParagraph(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for inserting paragraph
     */
    public void testRenderParagraph() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestRenderParagraph.doc";
        Integer index = 0;
        String format = "png";
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        RenderParagraphRequest request = new RenderParagraphRequest(remoteName, format, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null,null, null);

        File result = TestInitializer.wordsApi.renderParagraph(request);
        assertTrue(result.length() > 0);
    }
}
