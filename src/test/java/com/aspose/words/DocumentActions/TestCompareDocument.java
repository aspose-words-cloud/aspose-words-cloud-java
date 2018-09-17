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
package com.aspose.words.DocumentActions;

import com.aspose.words.ApiException;
import com.aspose.words.StringUtil;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.CompareData;
import com.aspose.words.model.DocumentResponse;
import com.aspose.words.model.requests.PostCompareDocumentRequest;
import junit.framework.TestCase;
import org.threeten.bp.OffsetDateTime;

public class TestCompareDocument extends TestCase {
    private String testFolder = "DocumentActions/CompareDocument";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for document comparison
     */
    public void testPostCompareDocument() throws ApiException {
        String fileName1 = "compareTestDoc1.doc";
        String fileName2 = "compareTestDoc2.doc";
        String remoteName1 = "TestPostCompareDocument1.doc";
        String remoteName2 = "TestPostCompareDocument2.doc";
        String dest_name = StringUtil.join("/",TestInitializer.RemoteTestOut, "TestCompareOut.doc");
        CompareData compareData = new CompareData()
                .author("author")
                .comparingWithDocument(StringUtil.join("/",TestInitializer.RemoteTestFolder, testFolder, remoteName2))
                .dateTime(OffsetDateTime.now());

        TestInitializer.uploadFile(StringUtil.join("/",TestInitializer.RemoteTestFolder, testFolder, remoteName1).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName1));

        TestInitializer.uploadFile(StringUtil.join("/",TestInitializer.RemoteTestFolder, testFolder, remoteName2).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName2));

        PostCompareDocumentRequest request = new PostCompareDocumentRequest(remoteName1, compareData,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, dest_name);
        DocumentResponse result = TestInitializer.wordsApi.postCompareDocument(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}
