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
import com.aspose.words.cloud.model.HyperlinkResponse;
import com.aspose.words.cloud.model.HyperlinksResponse;
import com.aspose.words.cloud.model.requests.GetDocumentHyperlinkByIndexRequest;
import com.aspose.words.cloud.model.requests.GetDocumentHyperlinksRequest;
import org.junit.Test;

import junit.framework.TestCase;

import java.io.FileNotFoundException;
import java.nio.file.Paths;

public class TestHyperlinks  extends TestCase {
    private String testFolder = "DocumentElements/Hyperlinks";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting document hyperlink by index
     */
    @Test
public void testGetDocumentHyperlinkByIndex() throws ApiException, FileNotFoundException {
        String fileName = "test_doc.docx";
        String remoteName = "TestGetDocumentHyperlinkByIndex.doc";
        Integer index = 0;
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentHyperlinkByIndexRequest request = new GetDocumentHyperlinkByIndexRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        HyperlinkResponse result = TestInitializer.wordsApi.getDocumentHyperlinkByIndex(request);
        assertNotNull(result);
    }

    /*
     * Test for getting document hyperlink by index
     */
    @Test
public void testGetDocumentHyperlinks() throws ApiException, FileNotFoundException {
        String fileName = "test_doc.docx";
        String remoteName = "TestGetDocumentHyperlinks.doc";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentHyperlinksRequest request = new GetDocumentHyperlinksRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null);

        HyperlinksResponse result = TestInitializer.wordsApi.getDocumentHyperlinks(request);
        assertNotNull(result);
    }
}