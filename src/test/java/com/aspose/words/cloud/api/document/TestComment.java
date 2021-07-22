/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestComment.java">
 *   Copyright (c) 2021 Aspose.Words for Cloud
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

package com.aspose.words.cloud.api.document;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.File;
import java.io.IOException;
import javax.mail.MessagingException;
import java.nio.file.*;
import java.util.ArrayList;

/*
 * Example of how to get comments from document.
 */
public class TestComment  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/Comments";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting comment by specified comment's index.
     */
    @Test
    public void testGetComment() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetComment.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetCommentRequest request = new GetCommentRequest(
            remoteFileName,
            0,
            remoteDataFolder,
            null,
            null,
            null
        );

        CommentResponse result = TestInitializer.wordsApi.getComment(request);
        assertNotNull(result);
        assertNotNull(result.getComment());
        assertEquals("Comment 1" + "\r\n\r\n", result.getComment().getText());
    }

    /*
     * Test for getting comment by specified comment's index online.
     */
    @Test
    public void testGetCommentOnline() throws ApiException, MessagingException, IOException
    {
        GetCommentOnlineRequest request = new GetCommentOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            0,
            null,
            null
        );

        CommentResponse result = TestInitializer.wordsApi.getCommentOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting all comments from document.
     */
    @Test
    public void testGetComments() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetComments.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetCommentsRequest request = new GetCommentsRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null
        );

        CommentsResponse result = TestInitializer.wordsApi.getComments(request);
        assertNotNull(result);
        assertNotNull(result.getComments());
        assertNotNull(result.getComments().getCommentList());
        assertEquals(1, result.getComments().getCommentList().size());
        assertEquals("Comment 1" + "\r\n\r\n", result.getComments().getCommentList().get(0).getText());
    }

    /*
     * Test for getting all comments from document online.
     */
    @Test
    public void testGetCommentsOnline() throws ApiException, MessagingException, IOException
    {
        GetCommentsOnlineRequest request = new GetCommentsOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            null,
            null
        );

        CommentsResponse result = TestInitializer.wordsApi.getCommentsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for adding comment.
     */
    @Test
    public void testInsertComment() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertComment.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        NodeLink commentRangeStartNode = new NodeLink();
        commentRangeStartNode.setNodeId("0.3.0.3");

        DocumentPosition commentRangeStart = new DocumentPosition();
        commentRangeStart.setNode(commentRangeStartNode);
        commentRangeStart.setOffset(0);

        NodeLink commentRangeEndNode = new NodeLink();
        commentRangeEndNode.setNodeId("0.3.0.3");

        DocumentPosition commentRangeEnd = new DocumentPosition();
        commentRangeEnd.setNode(commentRangeEndNode);
        commentRangeEnd.setOffset(0);

        CommentInsert comment = new CommentInsert();
        comment.setRangeStart(commentRangeStart);
        comment.setRangeEnd(commentRangeEnd);
        comment.setInitial("IA");
        comment.setAuthor("Imran Anwar");
        comment.setText("A new Comment");

        InsertCommentRequest request = new InsertCommentRequest(
            remoteFileName,
            comment,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        CommentResponse result = TestInitializer.wordsApi.insertComment(request);
        assertNotNull(result);
        assertNotNull(result.getComment());
        assertEquals("A new Comment" + "\r\n", result.getComment().getText());
        assertNotNull(result.getComment().getRangeStart());
        assertNotNull(result.getComment().getRangeStart().getNode());
        assertEquals("0.3.0.4", result.getComment().getRangeStart().getNode().getNodeId());
    }

    /*
     * Test for adding comment online.
     */
    @Test
    public void testInsertCommentOnline() throws ApiException, MessagingException, IOException
    {
        NodeLink commentRangeStartNode = new NodeLink();
        commentRangeStartNode.setNodeId("0.3.0.3");

        DocumentPosition commentRangeStart = new DocumentPosition();
        commentRangeStart.setNode(commentRangeStartNode);
        commentRangeStart.setOffset(0);

        NodeLink commentRangeEndNode = new NodeLink();
        commentRangeEndNode.setNodeId("0.3.0.3");

        DocumentPosition commentRangeEnd = new DocumentPosition();
        commentRangeEnd.setNode(commentRangeEndNode);
        commentRangeEnd.setOffset(0);

        CommentInsert comment = new CommentInsert();
        comment.setRangeStart(commentRangeStart);
        comment.setRangeEnd(commentRangeEnd);
        comment.setInitial("IA");
        comment.setAuthor("Imran Anwar");
        comment.setText("A new Comment");

        InsertCommentOnlineRequest request = new InsertCommentOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            comment,
            null,
            null,
            null,
            null,
            null
        );

        InsertCommentOnlineResponse result = TestInitializer.wordsApi.insertCommentOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating comment.
     */
    @Test
    public void testUpdateComment() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateComment.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        NodeLink commentRangeStartNode = new NodeLink();
        commentRangeStartNode.setNodeId("0.3.0");

        DocumentPosition commentRangeStart = new DocumentPosition();
        commentRangeStart.setNode(commentRangeStartNode);
        commentRangeStart.setOffset(0);

        NodeLink commentRangeEndNode = new NodeLink();
        commentRangeEndNode.setNodeId("0.3.0");

        DocumentPosition commentRangeEnd = new DocumentPosition();
        commentRangeEnd.setNode(commentRangeEndNode);
        commentRangeEnd.setOffset(0);

        CommentUpdate comment = new CommentUpdate();
        comment.setRangeStart(commentRangeStart);
        comment.setRangeEnd(commentRangeEnd);
        comment.setInitial("IA");
        comment.setAuthor("Imran Anwar");
        comment.setText("A new Comment");

        UpdateCommentRequest request = new UpdateCommentRequest(
            remoteFileName,
            0,
            comment,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        CommentResponse result = TestInitializer.wordsApi.updateComment(request);
        assertNotNull(result);
        assertNotNull(result.getComment());
        assertEquals("A new Comment" + "\r\n", result.getComment().getText());
        assertNotNull(result.getComment().getRangeStart());
        assertNotNull(result.getComment().getRangeStart().getNode());
        assertEquals("0.3.0.1", result.getComment().getRangeStart().getNode().getNodeId());
    }

    /*
     * Test for updating comment online.
     */
    @Test
    public void testUpdateCommentOnline() throws ApiException, MessagingException, IOException
    {
        NodeLink commentRangeStartNode = new NodeLink();
        commentRangeStartNode.setNodeId("0.3.0");

        DocumentPosition commentRangeStart = new DocumentPosition();
        commentRangeStart.setNode(commentRangeStartNode);
        commentRangeStart.setOffset(0);

        NodeLink commentRangeEndNode = new NodeLink();
        commentRangeEndNode.setNodeId("0.3.0");

        DocumentPosition commentRangeEnd = new DocumentPosition();
        commentRangeEnd.setNode(commentRangeEndNode);
        commentRangeEnd.setOffset(0);

        CommentUpdate comment = new CommentUpdate();
        comment.setRangeStart(commentRangeStart);
        comment.setRangeEnd(commentRangeEnd);
        comment.setInitial("IA");
        comment.setAuthor("Imran Anwar");
        comment.setText("A new Comment");

        UpdateCommentOnlineRequest request = new UpdateCommentOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            0,
            comment,
            null,
            null,
            null,
            null,
            null
        );

        UpdateCommentOnlineResponse result = TestInitializer.wordsApi.updateCommentOnline(request);
        assertNotNull(result);
    }

    /*
     * A test for DeleteComment.
     */
    @Test
    public void testDeleteComment() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteComment.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteCommentRequest request = new DeleteCommentRequest(
            remoteFileName,
            0,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        TestInitializer.wordsApi.deleteComment(request);
    }

    /*
     * A test for DeleteComment online.
     */
    @Test
    public void testDeleteCommentOnline() throws ApiException, MessagingException, IOException
    {
        DeleteCommentOnlineRequest request = new DeleteCommentOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            0,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.deleteCommentOnline(request);
        assertNotNull(result);
    }

    /*
     * A test for DeleteComments.
     */
    @Test
    public void testDeleteComments() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteComment.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteCommentsRequest request = new DeleteCommentsRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        TestInitializer.wordsApi.deleteComments(request);
    }

    /*
     * A test for DeleteComments online.
     */
    @Test
    public void testDeleteCommentsOnline() throws ApiException, MessagingException, IOException
    {
        DeleteCommentsOnlineRequest request = new DeleteCommentsOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.deleteCommentsOnline(request);
        assertNotNull(result);
    }
}
