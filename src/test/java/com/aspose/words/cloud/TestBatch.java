/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestBatch.java">
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

import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBatch  extends TestCase {
    private String testFolder = "DocumentElements/Paragraphs";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for URL encoding of document name
     */
    @Test
public void testBatch() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphByIndex.docx";
        String remoteFolder = PathUtil.get(TestInitializer.RemoteTestFolder, testFolder);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(remoteFolder, remoteName).replace("\\", "/"));

        GetParagraphsRequest request1 = new GetParagraphsRequest(remoteName,"sections/0", remoteFolder, null, null, null);

        GetParagraphRequest request2 = new GetParagraphRequest(remoteName, 0, "sections/0", remoteFolder, null, null, null);

        ParagraphInsert request3body = new ParagraphInsert();
        request3body.setText("This is a new paragraph for your document");
        InsertParagraphRequest request3 = new InsertParagraphRequest(remoteName, request3body, "sections/0", remoteFolder, null, null, null, null, null, null, null);

        DeleteParagraphRequest request4 = new DeleteParagraphRequest(remoteName, 0, "", remoteFolder, null, null, null, null, null, null);

        Object[] result = TestInitializer.wordsApi.batch(request1, request2, request3, request4);
        assertEquals(4, result.length);
        assertTrue(result[0] instanceof ParagraphLinkCollectionResponse); // GetParagraphs
        assertTrue(result[1] instanceof ParagraphResponse); // GetParagraph
        assertTrue(result[2] instanceof ParagraphResponse); // InsertParagraph
        assertNull(result[3]); // DeleteParagraph
    }
}