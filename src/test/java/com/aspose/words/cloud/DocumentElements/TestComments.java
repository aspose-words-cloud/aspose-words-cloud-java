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
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.nio.file.Paths;

public class TestComments extends TestCase {
    private String testFolder = "DocumentElements/Comments";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for deleting comment
     */
    @Test
public void testDeleteComment() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestDeleteComment.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteCommentRequest request = new DeleteCommentRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        TestInitializer.wordsApi.deleteComment(request);
    }

    /*
     * Test for getting comment
     */
    @Test
public void testGetComment() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetComment.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetCommentRequest request = new GetCommentRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        CommentResponse result = TestInitializer.wordsApi.getComment(request);
        assertNotNull(result);
    }

    /*
     * Test for getting comments
     */
    @Test
public void testGetComments() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetComments.docx";

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetCommentsRequest request = new GetCommentsRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        CommentsResponse result = TestInitializer.wordsApi.getComments(request);
        assertNotNull(result);
    }

    /*
     * Test for updating comment
     */
    @Test
public void testUpdateComment() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostComment.docx";
        Integer index = 0;
        NodeLink link = new NodeLink().nodeId("0.3.0.3");
        DocumentPosition documentPosition = new DocumentPosition().node(link).offset(0);
        Comment body = new Comment().initial("YE").rangeStart(documentPosition).rangeEnd(documentPosition)
                .author("Yaroslaw Ekimov").text("A new comment");

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateCommentRequest request = new UpdateCommentRequest(remoteName, index, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        CommentResponse result = TestInitializer.wordsApi.updateComment(request);
        assertNotNull(result);
    }

    /*
     * Test for adding comment
     */
    @Test
public void testInsertComment() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestInsertComment.docx";
        NodeLink link = new NodeLink().nodeId("0.3.0.3");
        DocumentPosition documentPosition = new DocumentPosition().node(link).offset(0);
        Comment body = new Comment().initial("YE").rangeStart(documentPosition).rangeEnd(documentPosition)
                .author("Yaroslaw Ekimov").text("A new comment");

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertCommentRequest request = new InsertCommentRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        CommentResponse result = TestInitializer.wordsApi.insertComment(request);
        System.out.println(result.getComment());
        assertNotNull(result);
    }
}
