/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestUrlEncode.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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

package com.aspose.words.cloud;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.PathUtil;
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
import java.io.IOException;

public class TestUrlEncode  extends TestCase {
    private String testFolder = "DocumentElements/Bookmarks";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for URL encoding of document name
     */
    @Test
public void testUrlEncode() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "[“Test_Two,_Inc.”]-_83(b)Election([“Bill_Gates”]).docx";
        String bookmarkName = "aspose";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetBookmarkByNameRequest request = new GetBookmarkByNameRequest(remoteName, bookmarkName,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null);

        BookmarkResponse result = TestInitializer.wordsApi.getBookmarkByName(request);
        assertNotNull(result);
    }
}