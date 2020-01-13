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
import com.aspose.words.model.ReplaceTextRequest;
import com.aspose.words.model.ReplaceTextResponse;
import com.aspose.words.model.SearchResponse;
import com.aspose.words.model.TextItemsResponse;
import com.aspose.words.model.requests.GetDocumentTextItemsRequest;
import com.aspose.words.model.requests.PostReplaceTextRequest;
import com.aspose.words.model.requests.SearchRequest;
import junit.framework.TestCase;


public class TestText extends TestCase {
    private String testFolder = "DocumentElements/Text";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting text
     */
    public void testGetDocumentTextItems() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentTextItems.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        GetDocumentTextItemsRequest request = new GetDocumentTextItemsRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        TextItemsResponse result = TestInitializer.wordsApi.getDocumentTextItems(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for replacing text
     */
    public void testPostReplaceText() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostReplaceText.docx";
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);
        ReplaceTextRequest body = new ReplaceTextRequest().oldValue("aspose").newValue("aspose new");

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        PostReplaceTextRequest request = new PostReplaceTextRequest(remoteName, body,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, destName, null, null);

        ReplaceTextResponse result = TestInitializer.wordsApi.postReplaceText(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for searching text
     */
    public void testSearch() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestSearch.docx";
        String pattern = "aspose";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        SearchRequest request = new SearchRequest(remoteName, pattern,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        SearchResponse result = TestInitializer.wordsApi.search(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}
