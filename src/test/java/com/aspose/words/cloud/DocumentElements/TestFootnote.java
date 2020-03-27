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

import java.io.IOException;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.Footnote;
import com.aspose.words.cloud.model.FootnoteResponse;
import com.aspose.words.cloud.model.FootnotesResponse;
import com.aspose.words.cloud.model.requests.*;

import org.junit.Test;

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
    @Test
public void testGetFootnote() throws ApiException, IOException {
        String fileName = "Footnote.doc";
        String remoteName = "TestGetFootnote.docx";
        Integer index = 0;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetFootnoteRequest request = new GetFootnoteRequest(remoteName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.getFootnote(request);
        assertNotNull(result);
    }

    /*
     * Test for getting footnote from document without node path
     */
    @Test
public void testGetFootnoteWithoutNodePath() throws ApiException, IOException {
        String fileName = "Footnote.doc";
        String remoteName = "TestGetFootnoteWithoutNodePath.docx";
        Integer index = 0;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetFootnoteWithoutNodePathRequest request = new GetFootnoteWithoutNodePathRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.getFootnoteWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for getting footnotes from document
     */
    @Test
public void testGetFootnotes() throws ApiException, IOException {
        String fileName = "Footnote.doc";
        String remoteName = "TestGetFootnotes.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetFootnotesRequest request = new GetFootnotesRequest(remoteName, "",
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null);

        FootnotesResponse result = TestInitializer.wordsApi.getFootnotes(request);
        assertNotNull(result);
    }

    /*
     * Test for getting footnotes from document without node path
     */
    @Test
public void testGetFootnotesWithoutNodePath() throws ApiException, IOException {
        String fileName = "Footnote.doc";
        String remoteName = "TestGetFootnotesWithoutNodePath.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetFootnotesWithoutNodePathRequest request = new GetFootnotesWithoutNodePathRequest(remoteName,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null);

        FootnotesResponse result = TestInitializer.wordsApi.getFootnotesWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for delete footnote from document
     */
    @Test
public void testDeleteFootnote() throws ApiException, IOException {
        String fileName = "Footnote.doc";
        String remoteName = "TestDeleteFootnote.docx";
        Integer index = 0;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        DeleteFootnoteRequest request = new DeleteFootnoteRequest(remoteName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null);

        TestInitializer.wordsApi.deleteFootnote(request);
    }

    /*
     * Test for delete footnote from document without node path
     */
    @Test
public void testDeleteFootnoteWithoutNodePath() throws ApiException, IOException {
        String fileName = "Footnote.doc";
        String remoteName = "TestDeleteFootnoteWithoutNodePath.docx";
        Integer index = 0;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        DeleteFootnoteWithoutNodePathRequest request = new DeleteFootnoteWithoutNodePathRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null);

        TestInitializer.wordsApi.deleteFootnoteWithoutNodePath(request);
    }

    /*
     * Test for update footnote from document
     */
    @Test
public void testUpdateFootnote() throws ApiException, IOException {
        String fileName = "Footnote.doc";
        String remoteName = "TestUpdateFootnote.docx";
        Integer index = 0;
        FootnoteUpdate body = new FootnoteUpdate().text("new text is here");

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        UpdateFootnoteRequest request = new UpdateFootnoteRequest(remoteName, body, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.updateFootnote(request);
        assertNotNull(result);
    }

    /*
     * Test for update footnote from document without node path
     */
    @Test
public void testUpdateFootnoteWithoutNodePath() throws ApiException, IOException {
        String fileName = "Footnote.doc";
        String remoteName = "TestUpdateFootnoteWithoutNodePath.docx";
        Integer index = 0;
        FootnoteUpdate body = new FootnoteUpdate().text("new text is here");

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        UpdateFootnoteWithoutNodePathRequest request = new UpdateFootnoteWithoutNodePathRequest(remoteName, body, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.updateFootnoteWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for insert footnote from document
     */
    @Test
public void testInsertFootnote() throws ApiException, IOException {
        String fileName = "Footnote.doc";
        String remoteName = "TestInsertFootnote.docx";
        FootnoteInsert body = new FootnoteInsert().text("new text is here").footnoteType(FootnoteInsert.FootnoteTypeEnum.ENDNOTE);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        InsertFootnoteRequest request = new InsertFootnoteRequest(remoteName, body, "",
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.insertFootnote(request);
        assertNotNull(result);
    }

   /*
     * Test for insert footnote into document without node path
     */
    @Test
public void testInsertFootnoteWithoutNodePath() throws ApiException, IOException {
        String fileName = "Footnote.doc";
        String remoteName = "TestInsertFootnoteWithoutNodePath.docx";
        FootnoteInsert body = new FootnoteInsert().text("new text is here").footnoteType(FootnoteInsert.FootnoteTypeEnum.ENDNOTE);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        InsertFootnoteWithoutNodePathRequest request = new InsertFootnoteWithoutNodePathRequest(remoteName, body,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.insertFootnoteWithoutNodePath(request);
        assertNotNull(result);
    }
}
