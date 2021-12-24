/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestBookmark.java">
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

package com.aspose.words.cloud.api.bookmark;

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
}
