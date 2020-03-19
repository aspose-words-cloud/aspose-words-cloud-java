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
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.HeaderFooterResponse;
import com.aspose.words.cloud.model.HeaderFootersResponse;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class TestHeaderFooter extends TestCase {
    private String testFolder = "DocumentElements/HeaderFooters";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for updating footnote from document
     */
    @Test
public void testInsertHeaderFooter() throws ApiException, IOException {
        String fileName = "HeadersFooters.doc";
        String remoteName = "TestInsertHeaderFooter.doc";
        String footerType = "FooterEven";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        InsertHeaderFooterRequest request = new InsertHeaderFooterRequest(remoteName, footerType, "",
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null);

        HeaderFooterResponse result = TestInitializer.wordsApi.insertHeaderFooter(request);
        assertNotNull(result);
    }

    /*
     * Test for getting header or footer
     */
    @Test
public void testGetHeaderFooter() throws ApiException, IOException {
        String fileName = "HeadersFooters.doc";
        String remoteName = "TestGetHeaderFooter.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetHeaderFooterRequest request = new GetHeaderFooterRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null);

        HeaderFooterResponse result = TestInitializer.wordsApi.getHeaderFooter(request);
        assertNotNull(result);
    }

    /*
     * Test for getting headers or footers
     */
    @Test
public void testGetHeaderFooters() throws ApiException, IOException {
        String fileName = "HeadersFooters.doc";
        String remoteName = "TestGetHeaderFooters.doc";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetHeaderFootersRequest request = new GetHeaderFootersRequest(remoteName, "",
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null);

        HeaderFootersResponse result = TestInitializer.wordsApi.getHeaderFooters(request);
        assertNotNull(result);
    }

    /*
     * Test for getting section headers/footers
     */
    @Test
public void testGetHeaderFooterOfSection() throws ApiException, IOException {
        String fileName = "HeadersFooters.doc";
        String remoteName = "TestGetHeaderFooterOfSection.doc";
        Integer index = 0;
        Integer sectionIndex = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetHeaderFooterOfSectionRequest request = new GetHeaderFooterOfSectionRequest(remoteName, index, sectionIndex,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null);

        HeaderFooterResponse result = TestInitializer.wordsApi.getHeaderFooterOfSection(request);
        assertNotNull(result);
    }

    /*
     * Test for removing header/footer
     */
    @Test
public void testDeleteHeaderFooter() throws ApiException, IOException {
        String fileName = "HeadersFooters.doc";
        String remoteName = "TestDeleteHeaderFooter.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        DeleteHeaderFooterRequest request = new DeleteHeaderFooterRequest(remoteName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteHeaderFooter(request);
    }

    /*
     * Test for removing headers/footers
     */
    @Test
public void testDeleteHeadersFooters() throws ApiException, IOException {
        String fileName = "HeadersFooters.doc";
        String remoteName = "TestDeleteHeadersFooters.doc";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        DeleteHeaderFooterRequest request = new DeleteHeaderFooterRequest(remoteName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteHeaderFooter(request);
    }
}
