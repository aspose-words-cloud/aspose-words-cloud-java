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

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.DocumentResponse;
import com.aspose.words.cloud.model.WatermarkText;
import com.aspose.words.cloud.model.requests.DeleteWatermarkRequest;
import com.aspose.words.cloud.model.requests.InsertWatermarkImageRequest;
import com.aspose.words.cloud.model.requests.InsertWatermarkTextRequest;

import org.junit.Test;

import junit.framework.TestCase;

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
    @Test
public void testDeleteWatermark() throws ApiException, FileNotFoundException {
        String fileName = "test_doc.docx";
        String remoteName = "TestDeleteWatermark.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteWatermarkRequest request = new DeleteWatermarkRequest(remoteName,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        DocumentResponse result = TestInitializer.wordsApi.deleteWatermark(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting watermark image
     */
    @Test
public void testInsertWatermarkImage() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestInsertDocumentWatermarkImage.docx";
        Double rotationAngle = 0.0;
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName).toString();
        File image = Paths.get(TestInitializer.LocalCommonFolder, "aspose-cloud.png").toFile();

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertWatermarkImageRequest request = new InsertWatermarkImageRequest(remoteName, image,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null, rotationAngle, null);

        DocumentResponse result = TestInitializer.wordsApi.insertWatermarkImage(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting watermark text
     */
    @Test
public void testInsertWatermarkText() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestInsertDocumentWatermarkText.docx";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName).toString();
        WatermarkText body = new WatermarkText().rotationAngle(90.0).text("This is the text");

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertWatermarkTextRequest request = new InsertWatermarkTextRequest(remoteName, body,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null);

        DocumentResponse result = TestInitializer.wordsApi.insertWatermarkText(request);
        assertNotNull(result);
    }
}
