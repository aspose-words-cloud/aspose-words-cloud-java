/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestComment.java">
 *   Copyright (c) 2026 Aspose.Words for Cloud
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
import java.io.IOException;
import jakarta.mail.MessagingException;
import java.nio.file.*;
import java.util.*;

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
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetCommentOnlineRequest request = new GetCommentOnlineRequest(
            requestDocument,
            0,
            null,
            null,
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
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetCommentsOnlineRequest request = new GetCommentsOnlineRequest(
            requestDocument,
            null,
            null,
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

        PositionInsideNode requestCommentRangeStart = new PositionInsideNode();
        requestCommentRangeStart.setNodeId("0.3.0.3");
        requestCommentRangeStart.setOffset(0);

        PositionInsideNode requestCommentRangeEnd = new PositionInsideNode();
        requestCommentRangeEnd.setNodeId("0.3.0.3");
        requestCommentRangeEnd.setOffset(0);

        CommentInsert requestComment = new CommentInsert();
        requestComment.setRangeStart(requestCommentRangeStart);
        requestComment.setRangeEnd(requestCommentRangeEnd);
        requestComment.setInitial("IA");
        requestComment.setAuthor("Imran Anwar");
        requestComment.setText("A new Comment");

        InsertCommentRequest request = new InsertCommentRequest(
            remoteFileName,
            requestComment,
            remoteDataFolder,
            null,
            null,
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
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        PositionInsideNode requestCommentRangeStart = new PositionInsideNode();
        requestCommentRangeStart.setNodeId("0.3.0.3");
        requestCommentRangeStart.setOffset(0);

        PositionInsideNode requestCommentRangeEnd = new PositionInsideNode();
        requestCommentRangeEnd.setNodeId("0.3.0.3");
        requestCommentRangeEnd.setOffset(0);

        CommentInsert requestComment = new CommentInsert();
        requestComment.setRangeStart(requestCommentRangeStart);
        requestComment.setRangeEnd(requestCommentRangeEnd);
        requestComment.setInitial("IA");
        requestComment.setAuthor("Imran Anwar");
        requestComment.setText("A new Comment");

        InsertCommentOnlineRequest request = new InsertCommentOnlineRequest(
            requestDocument,
            requestComment,
            null,
            null,
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

        PositionInsideNode requestCommentRangeStart = new PositionInsideNode();
        requestCommentRangeStart.setNodeId("0.3.0");
        requestCommentRangeStart.setOffset(0);

        PositionInsideNode requestCommentRangeEnd = new PositionInsideNode();
        requestCommentRangeEnd.setNodeId("0.3.0");
        requestCommentRangeEnd.setOffset(0);

        CommentUpdate requestComment = new CommentUpdate();
        requestComment.setRangeStart(requestCommentRangeStart);
        requestComment.setRangeEnd(requestCommentRangeEnd);
        requestComment.setInitial("IA");
        requestComment.setAuthor("Imran Anwar");
        requestComment.setText("A new Comment");

        UpdateCommentRequest request = new UpdateCommentRequest(
            remoteFileName,
            0,
            requestComment,
            remoteDataFolder,
            null,
            null,
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
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        PositionInsideNode requestCommentRangeStart = new PositionInsideNode();
        requestCommentRangeStart.setNodeId("0.3.0");
        requestCommentRangeStart.setOffset(0);

        PositionInsideNode requestCommentRangeEnd = new PositionInsideNode();
        requestCommentRangeEnd.setNodeId("0.3.0");
        requestCommentRangeEnd.setOffset(0);

        CommentUpdate requestComment = new CommentUpdate();
        requestComment.setRangeStart(requestCommentRangeStart);
        requestComment.setRangeEnd(requestCommentRangeEnd);
        requestComment.setInitial("IA");
        requestComment.setAuthor("Imran Anwar");
        requestComment.setText("A new Comment");

        UpdateCommentOnlineRequest request = new UpdateCommentOnlineRequest(
            requestDocument,
            0,
            requestComment,
            null,
            null,
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
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteCommentOnlineRequest request = new DeleteCommentOnlineRequest(
            requestDocument,
            0,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        Map<String, byte[]> result = TestInitializer.wordsApi.deleteCommentOnline(request);
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
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteCommentsOnlineRequest request = new DeleteCommentsOnlineRequest(
            requestDocument,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        Map<String, byte[]> result = TestInitializer.wordsApi.deleteCommentsOnline(request);
        assertNotNull(result);
    }
}
