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
import com.aspose.words.model.BookmarkData;
import com.aspose.words.model.BookmarkResponse;
import com.aspose.words.model.BookmarksResponse;
import com.aspose.words.model.requests.GetDocumentBookmarkByNameRequest;
import com.aspose.words.model.requests.GetDocumentBookmarksRequest;
import com.aspose.words.model.requests.PostUpdateDocumentBookmarkRequest;
import junit.framework.TestCase;


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
    public void testGetDocumentBookmarkByName() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentBookmarkByName.docx";
        String bookmarkName = "aspose";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentBookmarkByNameRequest request = new GetDocumentBookmarkByNameRequest(remoteName, bookmarkName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null);

        BookmarkResponse result = TestInitializer.wordsApi.getDocumentBookmarkByName(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting document bookmarks
     */
    public void testGetDocumentBookmarks() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentBookmarks.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentBookmarksRequest request = new GetDocumentBookmarksRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null);

        BookmarksResponse result = TestInitializer.wordsApi.getDocumentBookmarks(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for updating document bookmark
     */
    public void testPostUpdateDocumentBookmark() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostUpdateDocumentBookmark.docx";
        String bookmarkName = "aspose";
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);
        BookmarkData body = new BookmarkData().name(bookmarkName).text("This will be the text for Aspose");

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        PostUpdateDocumentBookmarkRequest request = new PostUpdateDocumentBookmarkRequest(remoteName, body, bookmarkName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, destName, null, null);

        BookmarkResponse result = TestInitializer.wordsApi.postUpdateDocumentBookmark(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}
