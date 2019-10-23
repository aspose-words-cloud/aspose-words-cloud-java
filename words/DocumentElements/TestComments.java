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
    public void testDeleteComment() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestDeleteComment.docx";
        Integer index = 0;

        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).ToString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteCommentRequest request = new DeleteCommentRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        WordsResponse result = TestInitializer.wordsApi.deleteComment(request);
        assertNotNull(result);
    }

    /*
     * Test for getting comment
     */
    public void testGetComment() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetComment.docx";
        Integer index = 0;

        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).ToString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetCommentRequest request = new GetCommentRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        CommentResponse result = TestInitializer.wordsApi.getComment(request);
        assertNotNull(result);
    }

    /*
     * Test for getting comments
     */
    public void testGetComments() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetComments.docx";

        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).ToString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetCommentsRequest request = new GetCommentsRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        CommentsResponse result = TestInitializer.wordsApi.getComments(request);
        assertNotNull(result);
    }

    /*
     * Test for updating comment
     */
    public void testPostComment() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostComment.docx";
        Integer index = 0;
        NodeLink link = new NodeLink().nodeId("0.0.3");
        DocumentPosition documentPosition = new DocumentPosition().node(link).offset(0);
        Comment body = new Comment().initial("YE").rangeStart(documentPosition).rangeEnd(documentPosition)
                .author("Yaroslaw Ekimov").text("A new comment");

        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).ToString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        PostCommentRequest request = new PostCommentRequest(remoteName, index, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        CommentResponse result = TestInitializer.wordsApi.postComment(request);
        assertNotNull(result);
    }

    /*
     * Test for adding comment
     */
    public void testPutComment() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutComment.docx";
        NodeLink link = new NodeLink().nodeId("0.0.3");
        DocumentPosition documentPosition = new DocumentPosition().node(link).offset(0);
        Comment body = new Comment().initial("YE").rangeStart(documentPosition).rangeEnd(documentPosition)
                .author("Yaroslaw Ekimov").text("A new comment");

        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).ToString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        PutCommentRequest request = new PutCommentRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        CommentResponse result = TestInitializer.wordsApi.putComment(request);
        assertNotNull(result);
    }
}
