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
import com.aspose.words.cloud.model.BookmarkData;
import com.aspose.words.cloud.model.BookmarkResponse;
import com.aspose.words.cloud.model.BookmarksResponse;
import com.aspose.words.cloud.model.requests.GetBookmarkByNameRequest;
import com.aspose.words.cloud.model.requests.GetBookmarksRequest;
import com.aspose.words.cloud.model.requests.UpdateBookmarkRequest;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.nio.file.Paths;

public class TestBookmarks  extends TestCase {
    private String testFolder = "DocumentElements/Bookmarks";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting document bookmark by name
     */
    @Test
public void testGetDocumentBookmarkByName() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentBookmarkByName.docx";
        String bookmarkName = "aspose";

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetBookmarkByNameRequest request = new GetBookmarkByNameRequest(remoteName, bookmarkName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        BookmarkResponse result = TestInitializer.wordsApi.getBookmarkByName(request);
        assertNotNull(result);
    }

    /*
     * Test for getting document bookmarks
     */
    @Test
public void testGetDocumentBookmarks() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentBookmarks.docx";

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetBookmarksRequest request = new GetBookmarksRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        BookmarksResponse result = TestInitializer.wordsApi.getBookmarks(request);
        assertNotNull(result);
    }

    /*
     * Test for updating document bookmark
     */
    @Test
public void testPostUpdateDocumentBookmark() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostUpdateDocumentBookmark.docx";
        String bookmarkName = "aspose";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        BookmarkData body = new BookmarkData().name(bookmarkName).text("This will be the text for Aspose");

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateBookmarkRequest request = new UpdateBookmarkRequest(remoteName, body, bookmarkName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, destName, null, null);

        BookmarkResponse result = TestInitializer.wordsApi.updateBookmark(request);
        assertNotNull(result);
    }
}
