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
package com.aspose.words.cloud.DocumentActions;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.DocumentEntry;
import com.aspose.words.cloud.model.DocumentEntryList;
import com.aspose.words.cloud.model.DocumentResponse;
import com.aspose.words.cloud.model.requests.AppendDocumentRequest;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;

public class TestAppendDocument extends TestCase {
    private String testFolder = "DocumentActions/AppendDocument";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for appending document
     */
    @Test
public void testPostAppendDocument() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostAppendDocument.docx";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName).toString();
        DocumentEntry docEntry = new DocumentEntry()
                .href(PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString())
                .importFormatMode("KeepSourceFormatting");
        DocumentEntryList body = new DocumentEntryList().addDocumentEntriesItem(docEntry);
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));
        AppendDocumentRequest request = new AppendDocumentRequest(remoteName, body,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null, destName, null, null);
        DocumentResponse result = TestInitializer.wordsApi.appendDocument(request);
        assertNotNull(result);
    }
}
