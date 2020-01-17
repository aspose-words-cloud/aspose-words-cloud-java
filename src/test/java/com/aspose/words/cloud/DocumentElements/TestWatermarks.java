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
import com.aspose.words.cloud.model.DocumentResponse;
import com.aspose.words.cloud.model.WatermarkText;
import com.aspose.words.cloud.model.requests.DeleteWatermarkRequest;
import com.aspose.words.cloud.model.requests.InsertWatermarkImageRequest;
import com.aspose.words.cloud.model.requests.InsertWatermarkTextRequest;
import junit.framework.TestCase;

import java.io.File;

public class TestWatermarks extends TestCase {
    private String testFolder = "DocumentElements/Watermarks";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for removing watermark
     */
    public void testDeleteWatermark() throws ApiException {
        String fileName = "test_doc.docx";
        String remoteName = "TestDeleteDocumentWatermark.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName),
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        DeleteWatermarkRequest request = new DeleteWatermarkRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null);

        DocumentResponse result = TestInitializer.wordsApi.deleteWatermark(request);
        assertNotNull(result.getDocument());
    }

    /*
     * Test for inserting watermark image
     */
    public void testInsertWatermarkImage() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostInsertDocumentWatermarkImage.docx";
        Double rotationAngle = 0.0;
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);
        File image = new File(StringUtil.join("/",TestInitializer.LocalCommonFolder, "aspose-cloud.png"));

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName),
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        InsertWatermarkImageRequest request = new InsertWatermarkImageRequest(remoteName, image,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, destName, null, null, rotationAngle, null);

        DocumentResponse result = TestInitializer.wordsApi.insertWatermarkImage(request);
        assertNotNull(result.getDocument());
    }

    /*
     * Test for inserting watermark text
     */
    public void testInsertWatermarkText() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostInsertDocumentWatermarkText.docx";
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);
        WatermarkText body = new WatermarkText().rotationAngle(90.0).text("This is the text");

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName),
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        InsertWatermarkTextRequest request = new InsertWatermarkTextRequest(remoteName, body,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, destName, null, null);

        DocumentResponse result = TestInitializer.wordsApi.insertWatermarkText(request);
        assertNotNull(result.getDocument());
    }
}
