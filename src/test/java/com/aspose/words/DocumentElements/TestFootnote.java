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

public class TestFootnote extends TestCase {
    private String testFolder = "DocumentElements/Footnotes";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting footnote from document
     */
    public void testGetFootnote() throws ApiException {
        String fileName = "Footnote.doc";
        String remoteName = "TestGetFootnote.docx";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        GetFootnoteRequest request = new GetFootnoteRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.getFootnote(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting footnotes from document
     */
    public void testGetFootnotes() throws ApiException {
        String fileName = "Footnote.doc";
        String remoteName = "TestGetFootnotes.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        GetFootnotesRequest request = new GetFootnotesRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null);

        FootnotesResponse result = TestInitializer.wordsApi.getFootnotes(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for delete footnote from document
     */
    public void testDeleteFootnote() throws ApiException {
        String fileName = "Footnote.doc";
        String remoteName = "TestDeleteFootnote.docx";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        DeleteFootnoteRequest request = new DeleteFootnoteRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null, null);

        AsposeResponse result = TestInitializer.wordsApi.deleteFootnote(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for update footnote from document
     */
    public void testPostFootnote() throws ApiException {
        String fileName = "Footnote.doc";
        String remoteName = "TestPostFootnote.docx";
        Integer index = 0;
        Footnote body = new Footnote().text("new text is here");

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        PostFootnoteRequest request = new PostFootnoteRequest(remoteName, body, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.postFootnote(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for insert footnote from document
     */
    public void testPutFootnote() throws ApiException {
        String fileName = "Footnote.doc";
        String remoteName = "TestPutFootnote.docx";
        Footnote body = new Footnote().text("new text is here").footnoteType(Footnote.FootnoteTypeEnum.ENDNOTE);

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        PutFootnoteRequest request = new PutFootnoteRequest(remoteName, body,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.putFootnote(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}
