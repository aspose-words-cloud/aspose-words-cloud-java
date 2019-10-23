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
import com.aspose.words.TestInitializer;
import com.aspose.words.model.DocumentEntry;
import com.aspose.words.model.DocumentEntryList;
import com.aspose.words.model.DocumentResponse;
import com.aspose.words.model.requests.PostAppendDocumentRequest;
import junit.framework.TestCase;

import java.io.File;
import java.nio.file.Paths;

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
    public void testPostAppendDocument() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostAppendDocument.docx";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        DocumentEntry docEntry = new DocumentEntry()
                .href(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString())
                .importFormatMode("KeepSourceFormatting");
        DocumentEntryList body = new DocumentEntryList().addDocumentEntriesItem(docEntry);
        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).ToString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));
        PostAppendDocumentRequest request = new PostAppendDocumentRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null, destName, null, null);
        DocumentResponse result = TestInitializer.wordsApi.postAppendDocument(request);
        assertNotNull(result);
    }
}
