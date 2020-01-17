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
import com.aspose.words.cloud.StringUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.ReplaceTextParameters;
import com.aspose.words.cloud.model.ReplaceTextResponse;
import com.aspose.words.cloud.model.SearchResponse;
import com.aspose.words.cloud.model.requests.ReplaceTextRequest;
import com.aspose.words.cloud.model.requests.SearchRequest;
import junit.framework.TestCase;


public class TestText extends TestCase {
    private String testFolder = "DocumentElements/Text";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for replacing text
     */
    public void testPostReplaceText() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostReplaceText.docx";
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);
        ReplaceTextParameters body = new ReplaceTextParameters().oldValue("aspose").newValue("aspose new");

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName),
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        ReplaceTextRequest request = new ReplaceTextRequest(remoteName, body,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, destName, null, null);

        ReplaceTextResponse result = TestInitializer.wordsApi.replaceText(request);
        assertNotNull(result.getMatches());
    }

    /*
     * Test for searching text
     */
    public void testSearch() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestSearch.docx";
        String pattern = "aspose";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName),
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        SearchRequest request = new SearchRequest(remoteName, pattern,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null);

        SearchResponse result = TestInitializer.wordsApi.search(request);
        assertNotNull(result.getSearchResults());
    }
}
