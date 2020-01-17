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
import com.aspose.words.cloud.StringUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.SaveOptionsData;
import com.aspose.words.cloud.model.SaveResponse;
import com.aspose.words.cloud.model.TiffSaveOptionsData;
import com.aspose.words.cloud.model.requests.GetDocumentWithFormatRequest;
import com.aspose.words.cloud.model.requests.SaveAsRequest;
import com.aspose.words.cloud.model.requests.ConvertDocumentRequest;
import com.aspose.words.cloud.model.requests.SaveAsTiffRequest;
import junit.framework.TestCase;
import org.junit.Ignore;

import java.io.File;

public class TestConvertDocument extends TestCase {
    private String testFolder = "DocumentActions/ConvertDocument";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for saving document with specified format
     */
    public void testPostDocumentSaveAs() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostDocumentSaveAs.docx";
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);
        SaveOptionsData saveOptionsData = new SaveOptionsData().saveFormat("pdf").fileName(destName);

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName), StringUtil.join("/",TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        SaveAsRequest request = new SaveAsRequest(remoteName, saveOptionsData,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null);

        SaveResponse result = TestInitializer.wordsApi.saveAs(request);
        assertNotNull(result.getSaveResult());
    }

    /*
     * Test for document conversion without storage
     */
    public void testPutConvertDocument() throws ApiException {
        String format = "pdf";
        String fileName = "test_multi_pages.docx";
        ConvertDocumentRequest request = new ConvertDocumentRequest(new File(StringUtil.join("/",TestInitializer.LocalCommonFolder, fileName)), format,
                null, null, null, null);
        File result = TestInitializer.wordsApi.convertDocument(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for saving document with specified format
     */
    public void testPutDocumentSaveAsTiff() throws ApiException {
        String fileName = "45.pdf";
        String remoteName = "TestPutDocumentSaveAsTiff.docx";
        TiffSaveOptionsData saveOptionsData = new TiffSaveOptionsData();
        saveOptionsData.setSaveFormat("tiff");
        saveOptionsData.setFileName(fileName);
        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName), StringUtil.join("/",TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));
        SaveAsTiffRequest request = new SaveAsTiffRequest(remoteName, saveOptionsData,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, false, null);
        SaveResponse result = TestInitializer.wordsApi.saveAsTiff(request);
        assertNotNull(result.getSaveResult());
    }

    /*
     * Test for saving document with specified format
     */
    public void testGetDocumentWithFormat() throws ApiException {
        String format = "text";
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentWithFormat.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName), StringUtil.join("/",TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetDocumentWithFormatRequest request = new GetDocumentWithFormatRequest(remoteName, format, StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null);
        File result = TestInitializer.wordsApi.getDocumentWithFormat(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for saving document with specified format
     */
    @Ignore
    public void GetDocumentWithFormatAndOutPath() throws ApiException {
        String format = "text";
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentWithFormat.docx";
        String outPath = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName), StringUtil.join("/",TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetDocumentWithFormatRequest request = new GetDocumentWithFormatRequest(remoteName, format, StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, outPath, null);
        File result = TestInitializer.wordsApi.getDocumentWithFormat(request);
        assertTrue(result.length() > 0);
    }
}
