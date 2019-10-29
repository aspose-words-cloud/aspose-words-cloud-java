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

import java.io.FileNotFoundException;
import java.nio.file.Paths;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.Footnote;
import com.aspose.words.cloud.model.FootnoteResponse;
import com.aspose.words.cloud.model.FootnotesResponse;
import com.aspose.words.cloud.model.requests.DeleteFootnoteRequest;
import com.aspose.words.cloud.model.requests.DeleteFootnoteWithoutNodePathRequest;
import com.aspose.words.cloud.model.requests.GetFootnoteRequest;
import com.aspose.words.cloud.model.requests.GetFootnoteWithoutNodePathRequest;
import com.aspose.words.cloud.model.requests.GetFootnotesRequest;
import com.aspose.words.cloud.model.requests.GetFootnotesWithoutNodePathRequest;
import com.aspose.words.cloud.model.requests.InsertFootnoteRequest;
import com.aspose.words.cloud.model.requests.InsertFootnoteWithoutNodePathRequest;
import com.aspose.words.cloud.model.requests.UpdateFootnoteRequest;
import com.aspose.words.cloud.model.requests.UpdateFootnoteWithoutNodePathRequest;

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
    public void testGetFootnote() throws ApiException, FileNotFoundException {
        String fileName = "Footnote.doc";
        String remoteName = "TestGetFootnote.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFootnoteRequest request = new GetFootnoteRequest(remoteName, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.getFootnote(request);
        assertNotNull(result);
    }

    /*
     * Test for getting footnote from document without node path
     */
    public void testGetFootnoteWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "Footnote.doc";
        String remoteName = "TestGetFootnoteWithoutNodePath.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFootnoteWithoutNodePathRequest request = new GetFootnoteWithoutNodePathRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.getFootnoteWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for getting footnotes from document
     */
    public void testGetFootnotes() throws ApiException, FileNotFoundException {
        String fileName = "Footnote.doc";
        String remoteName = "TestGetFootnotes.docx";

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFootnotesRequest request = new GetFootnotesRequest(remoteName, "",
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        FootnotesResponse result = TestInitializer.wordsApi.getFootnotes(request);
        assertNotNull(result);
    }

    /*
     * Test for getting footnotes from document without node path
     */
    public void testGetFootnotesWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "Footnote.doc";
        String remoteName = "TestGetFootnotesWithoutNodePath.docx";

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFootnotesWithoutNodePathRequest request = new GetFootnotesWithoutNodePathRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        FootnotesResponse result = TestInitializer.wordsApi.getFootnotesWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for delete footnote from document
     */
    public void testDeleteFootnote() throws ApiException, FileNotFoundException {
        String fileName = "Footnote.doc";
        String remoteName = "TestDeleteFootnote.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteFootnoteRequest request = new DeleteFootnoteRequest(remoteName, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        TestInitializer.wordsApi.deleteFootnote(request);
    }

    /*
     * Test for delete footnote from document without node path
     */
    public void testDeleteFootnoteWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "Footnote.doc";
        String remoteName = "TestDeleteFootnoteWithoutNodePath.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteFootnoteWithoutNodePathRequest request = new DeleteFootnoteWithoutNodePathRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        TestInitializer.wordsApi.deleteFootnoteWithoutNodePath(request);
    }

    /*
     * Test for update footnote from document
     */
    public void testUpdateFootnote() throws ApiException, FileNotFoundException {
        String fileName = "Footnote.doc";
        String remoteName = "TestUpdateFootnote.docx";
        Integer index = 0;
        Footnote body = new Footnote().text("new text is here");

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateFootnoteRequest request = new UpdateFootnoteRequest(remoteName, body, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.updateFootnote(request);
        assertNotNull(result);
    }

    /*
     * Test for update footnote from document without node path
     */
    public void testUpdateFootnoteWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "Footnote.doc";
        String remoteName = "TestUpdateFootnoteWithoutNodePath.docx";
        Integer index = 0;
        Footnote body = new Footnote().text("new text is here");

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateFootnoteWithoutNodePathRequest request = new UpdateFootnoteWithoutNodePathRequest(remoteName, body, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.updateFootnoteWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for insert footnote from document
     */
    public void testInsertFootnote() throws ApiException, FileNotFoundException {
        String fileName = "Footnote.doc";
        String remoteName = "TestInsertFootnote.docx";
        Footnote body = new Footnote().text("new text is here").footnoteType(Footnote.FootnoteTypeEnum.ENDNOTE);

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertFootnoteRequest request = new InsertFootnoteRequest(remoteName, body, "",
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.insertFootnote(request);
        assertNotNull(result);
    }

   /*
     * Test for insert footnote into document without node path
     */
    public void testInsertFootnoteWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "Footnote.doc";
        String remoteName = "TestInsertFootnoteWithoutNodePath.docx";
        Footnote body = new Footnote().text("new text is here").footnoteType(Footnote.FootnoteTypeEnum.ENDNOTE);

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertFootnoteWithoutNodePathRequest request = new InsertFootnoteWithoutNodePathRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        FootnoteResponse result = TestInitializer.wordsApi.insertFootnoteWithoutNodePath(request);
        assertNotNull(result);
    }
}
