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

import java.io.FileNotFoundException;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.CompareData;
import com.aspose.words.cloud.model.DocumentResponse;
import com.aspose.words.cloud.model.requests.CompareDocumentRequest;

import org.junit.Test;
import org.threeten.bp.OffsetDateTime;

import junit.framework.TestCase;

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
        @Test
public void testPostCompareDocument() throws ApiException, FileNotFoundException {
                String fileName1 = "compareTestDoc1.doc";
                String fileName2 = "compareTestDoc2.doc";
                String remoteName1 = "TestPostCompareDocument1.doc";
                String remoteName2 = "TestPostCompareDocument2.doc";
                String dest_name = PathUtil.get(TestInitializer.RemoteTestOut, "TestCompareOut.doc").toString();
                CompareData compareData = new CompareData().author("author").comparingWithDocument(
                                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName2).toString())
                                .dateTime(OffsetDateTime.now());
                TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName1).toString(),
                                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName1).toString()
                                                .replace("\\", "/"));
                TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName2).toString(),
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName2).toString()
                .replace("\\", "/"));

                CompareDocumentRequest request = new CompareDocumentRequest(remoteName1, compareData,
                                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null,
                                dest_name);
                DocumentResponse result = TestInitializer.wordsApi.compareDocument(request);
                assertNotNull(result);
        }
}
