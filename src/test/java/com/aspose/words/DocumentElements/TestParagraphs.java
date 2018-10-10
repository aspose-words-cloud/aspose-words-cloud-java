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
import com.aspose.words.StringUtil;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.*;
import com.aspose.words.model.requests.*;
import junit.framework.TestCase;

import java.io.File;

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

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        DeleteParagraphRequest request = new DeleteParagraphRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
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

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentParagraphRequest request = new GetDocumentParagraphRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
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

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentParagraphRunRequest request = new GetDocumentParagraphRunRequest(remoteName, paragraphPath, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
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

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentParagraphRunFontRequest request = new GetDocumentParagraphRunFontRequest(remoteName, paragraphPath, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
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

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentParagraphRunsRequest request = new GetDocumentParagraphRunsRequest(remoteName, paragraphPath,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
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

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentParagraphsRequest request = new GetDocumentParagraphsRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
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
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);
        Font body = new Font().bold(true);

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        PostDocumentParagraphRunFontRequest request = new PostDocumentParagraphRunFontRequest(remoteName, body, paragraphPath, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
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
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);
        ParagraphInsert body = new ParagraphInsert().text("This is a new paragraph for your document");

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        PutParagraphRequest request = new PutParagraphRequest(remoteName, body,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
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

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        RenderParagraphRequest request = new RenderParagraphRequest(remoteName, format, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null,null, null);

        File result = TestInitializer.wordsApi.renderParagraph(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for updating paragraph format
     */
    public void testPostDocumentParagraphFormat() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "PostDocumentParagraphFormat.doc";
        ParagraphFormat body = new ParagraphFormat().alignment(ParagraphFormat.AlignmentEnum.RIGHT);
        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        PostDocumentParagraphFormatRequest request = new PostDocumentParagraphFormatRequest(remoteName, body, "", 0,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null);

        ParagraphFormatResponse result = TestInitializer.wordsApi.postDocumentParagraphFormat(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    public void testGetDocumentParagraphFormat() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "GetDocumentParagraphFormat.doc";
        Integer index = 0;
        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentParagraphFormatRequest request = new GetDocumentParagraphFormatRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null);

        ParagraphFormatResponse result = TestInitializer.wordsApi.getDocumentParagraphFormat(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}
