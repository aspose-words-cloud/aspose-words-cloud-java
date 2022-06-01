/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestBookmark.java">
 *   Copyright (c) 2022 Aspose.Words for Cloud
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

package com.aspose.words.cloud.api.bookmark;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.IOException;
import javax.mail.MessagingException;
import java.nio.file.*;
import java.util.*;

/*
 * Example of how to get all bookmarks from document.
 */
public class TestBookmark  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Bookmarks";
    private String localFile = "Common/test_multi_pages.docx";
    private String bookmarkName = "aspose";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting bookmarks from document.
     */
    @Test
    public void testGetBookmarks() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentBookmarks.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetBookmarksRequest request = new GetBookmarksRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        BookmarksResponse result = TestInitializer.wordsApi.getBookmarks(request);
        assertNotNull(result);
    }

    /*
     * Test for getting bookmarks from document online.
     */
    @Test
    public void testGetBookmarksOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetBookmarksOnlineRequest request = new GetBookmarksOnlineRequest(
            requestDocument,
            null,
            null,
            null
        );

        BookmarksResponse result = TestInitializer.wordsApi.getBookmarksOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting bookmark by specified name.
     */
    @Test
    public void testGetBookmarkByName() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentBookmarkByName.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetBookmarkByNameRequest request = new GetBookmarkByNameRequest(
            remoteFileName,
            bookmarkName,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        BookmarkResponse result = TestInitializer.wordsApi.getBookmarkByName(request);
        assertNotNull(result);
    }

    /*
     * Test for getting bookmark by specified name online.
     */
    @Test
    public void testGetBookmarkByNameOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetBookmarkByNameOnlineRequest request = new GetBookmarkByNameOnlineRequest(
            requestDocument,
            bookmarkName,
            null,
            null,
            null
        );

        BookmarkResponse result = TestInitializer.wordsApi.getBookmarkByNameOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating existed bookmark.
     */
    @Test
    public void testUpdateBookmark() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateDocumentBookmark.docx";
        String bookmarkText = "This will be the text for Aspose";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        BookmarkData requestBookmarkData = new BookmarkData();
        requestBookmarkData.setName(bookmarkName);
        requestBookmarkData.setText(bookmarkText);

        UpdateBookmarkRequest request = new UpdateBookmarkRequest(
            remoteFileName,
            bookmarkName,
            requestBookmarkData,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        BookmarkResponse result = TestInitializer.wordsApi.updateBookmark(request);
        assertNotNull(result);
    }

    /*
     * Test for updating existed bookmark online.
     */
    @Test
    public void testUpdateBookmarkOnline() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateDocumentBookmark.docx";

        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        BookmarkData requestBookmarkData = new BookmarkData();
        requestBookmarkData.setName(bookmarkName);
        requestBookmarkData.setText("This will be the text for Aspose");

        UpdateBookmarkOnlineRequest request = new UpdateBookmarkOnlineRequest(
            requestDocument,
            bookmarkName,
            requestBookmarkData,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        UpdateBookmarkOnlineResponse result = TestInitializer.wordsApi.updateBookmarkOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting bookmark by specified name.
     */
    @Test
    public void testDeleteBookmark() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteBookmark.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteBookmarkRequest request = new DeleteBookmarkRequest(
            remoteFileName,
            bookmarkName,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteBookmark(request);
    }

    /*
     * Test for deleting bookmark by specified name online.
     */
    @Test
    public void testDeleteBookmarkOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteBookmarkOnlineRequest request = new DeleteBookmarkOnlineRequest(
            requestDocument,
            bookmarkName,
            null,
            null,
            null,
            null,
            null,
            null
        );

        Map<String, byte[]> result = TestInitializer.wordsApi.deleteBookmarkOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting all bookmarks from document.
     */
    @Test
    public void testDeleteBookmarks() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteBookmarks.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteBookmarksRequest request = new DeleteBookmarksRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteBookmarks(request);
    }

    /*
     * Test for deleting all bookmarks from document online.
     */
    @Test
    public void testDeleteBookmarksOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteBookmarksOnlineRequest request = new DeleteBookmarksOnlineRequest(
            requestDocument,
            null,
            null,
            null,
            null,
            null,
            null
        );

        Map<String, byte[]> result = TestInitializer.wordsApi.deleteBookmarksOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting new bookmark.
     */
    @Test
    public void testInsertBookmark() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertBookmark.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        NodeLink requestBookmarkStartRangeNode = new NodeLink();
        requestBookmarkStartRangeNode.setNodeId("0.0.0.0");

        DocumentPosition requestBookmarkStartRange = new DocumentPosition();
        requestBookmarkStartRange.setNode(requestBookmarkStartRangeNode);

        NodeLink requestBookmarkEndRangeNode = new NodeLink();
        requestBookmarkEndRangeNode.setNodeId("0.0.0.0");

        DocumentPosition requestBookmarkEndRange = new DocumentPosition();
        requestBookmarkEndRange.setNode(requestBookmarkEndRangeNode);

        BookmarkInsert requestBookmark = new BookmarkInsert();
        requestBookmark.setStartRange(requestBookmarkStartRange);
        requestBookmark.setEndRange(requestBookmarkEndRange);
        requestBookmark.setName("new_bookmark");
        requestBookmark.setText("Some text");

        InsertBookmarkRequest request = new InsertBookmarkRequest(
            remoteFileName,
            requestBookmark,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        BookmarkResponse result = TestInitializer.wordsApi.insertBookmark(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting new bookmark online.
     */
    @Test
    public void testInsertBookmarkOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        NodeLink requestBookmarkStartRangeNode = new NodeLink();
        requestBookmarkStartRangeNode.setNodeId("0.0.0.0");

        DocumentPosition requestBookmarkStartRange = new DocumentPosition();
        requestBookmarkStartRange.setNode(requestBookmarkStartRangeNode);

        NodeLink requestBookmarkEndRangeNode = new NodeLink();
        requestBookmarkEndRangeNode.setNodeId("0.0.0.0");

        DocumentPosition requestBookmarkEndRange = new DocumentPosition();
        requestBookmarkEndRange.setNode(requestBookmarkEndRangeNode);

        BookmarkInsert requestBookmark = new BookmarkInsert();
        requestBookmark.setStartRange(requestBookmarkStartRange);
        requestBookmark.setEndRange(requestBookmarkEndRange);
        requestBookmark.setName("new_bookmark");
        requestBookmark.setText("Some text");

        InsertBookmarkOnlineRequest request = new InsertBookmarkOnlineRequest(
            requestDocument,
            requestBookmark,
            null,
            null,
            null,
            null,
            null,
            null
        );

        InsertBookmarkOnlineResponse result = TestInitializer.wordsApi.insertBookmarkOnline(request);
        assertNotNull(result);
    }
}
