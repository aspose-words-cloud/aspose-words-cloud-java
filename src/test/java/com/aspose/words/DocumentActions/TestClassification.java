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
import com.aspose.words.model.ClassificationResponse;
import com.aspose.words.model.requests.ClassifyDocumentRequest;
import com.aspose.words.model.requests.ClassifyRequest;
import junit.framework.TestCase;

import java.io.File;
import java.nio.file.Paths;

public class TestClassification extends TestCase {
    private String testFolder = "Common";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
        Test for raw text classification
     */
    public void testClassify(){
        ClassifyRequest request = new ClassifyRequest("Try text classification", "3");
        try {
            ClassificationResponse result = TestInitializer.wordApi.classify(request);
            assertEquals(result.getCode(), new Integer(200));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    /*
        Test for document classification
     */
    public void testClassifyDocument(){
        String fileName = "test_multi_pages.docx";
        String remoteName = "Source.docx";
        TestInitializer.storageApi.PutCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                null, null, new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()));
        ClassifyDocumentRequest request = new ClassifyDocumentRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null);
        try {
            ClassificationResponse result = TestInitializer.wordApi.classifyDocument(request);
            assertEquals(result.getCode(), Integer.valueOf(200));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    /*
        Test for document classification with taxonomy "documents"
     */
    public void testClassifyTaxonomyDocument(){
        String fileName = "test_multi_pages.docx";
        String remoteName = "Source.docx";
        TestInitializer.storageApi.PutCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                null, null, new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()));
        ClassifyDocumentRequest request = new ClassifyDocumentRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, "documents");
        try {
            ClassificationResponse result = TestInitializer.wordApi.classifyDocument(request);
            assertEquals(result.getCode(), Integer.valueOf(200));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
