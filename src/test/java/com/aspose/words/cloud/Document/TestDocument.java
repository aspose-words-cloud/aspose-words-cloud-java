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
package com.aspose.words.cloud.Document;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.DocumentResponse;
import com.aspose.words.cloud.model.requests.CreateDocumentRequest;
import com.aspose.words.cloud.model.requests.GetDocumentRequest;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.nio.file.Paths;

public class TestDocument extends TestCase {
    private String testFolder = "document";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting document
     */
    @Test
public void testGetDocument() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocument.docx";

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentRequest request = new GetDocumentRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        DocumentResponse result = TestInitializer.wordsApi.getDocument(request);
        assertNotNull(result);
    }

    @Test
public void testCreateDocument() throws ApiException {
        String remoteName = "TestCreateDocument.docx",
            subfolder = "DocumentActions/Document";
        
        CreateDocumentRequest request = new CreateDocumentRequest(null, remoteName, 
            Paths.get(TestInitializer.RemoteTestFolder, subfolder).toString());
        DocumentResponse response = TestInitializer.wordsApi.createDocument(request);
        assertNotNull(response);
    }
}