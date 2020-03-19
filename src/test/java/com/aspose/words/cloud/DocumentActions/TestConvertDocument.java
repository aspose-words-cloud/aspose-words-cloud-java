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
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.SaveOptionsData;
import com.aspose.words.cloud.model.SaveResponse;
import com.aspose.words.cloud.model.TiffSaveOptionsData;
import com.aspose.words.cloud.model.requests.ConvertDocumentRequest;
import com.aspose.words.cloud.model.requests.GetDocumentWithFormatRequest;
import com.aspose.words.cloud.model.requests.SaveAsRequest;
import com.aspose.words.cloud.model.requests.SaveAsTiffRequest;

import org.junit.Test;

import junit.framework.TestCase;

import org.junit.Ignore;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
    @Test
public void testPostDocumentSaveAs() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostDocumentSaveAs.docx";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName);
        SaveOptionsData saveOptionsData = new SaveOptionsData().saveFormat("pdf").fileName(destName);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        SaveAsRequest request = new SaveAsRequest(remoteName, saveOptionsData,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null);

        SaveResponse result = TestInitializer.wordsApi.saveAs(request);
        assertNotNull(result);
    }

    /*
     * Test for document conversion without storage
     */
    @Test
public void testPutConvertDocument() throws ApiException, IOException {
        String format = "pdf";
        String fileName = "test_multi_pages.docx";
        ConvertDocumentRequest request = new ConvertDocumentRequest(Files.readAllBytes(Paths.get(TestInitializer.LocalCommonFolder, fileName).toAbsolutePath()), format,
                null, null, null, null);
        File result = TestInitializer.wordsApi.convertDocument(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for saving document with specified format
     */
    @Test
public void testPostSaveDocumentSaveAsFromPdfToDoc() throws ApiException, IOException {
        String fileName = "45.pdf";
        String remoteName = "TestPostDocumentSaveAsFromPdfToDoc.docx";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, "TestPostDocumentSaveAs.docx");
        SaveOptionsData saveOptionsData = new SaveOptionsData().saveFormat("docx").fileName(destName);
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, "DocumentActions", "ConvertDocument", fileName),
        PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));
        SaveAsRequest request = new SaveAsRequest(remoteName, saveOptionsData,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null);
        SaveResponse result = TestInitializer.wordsApi.saveAs(request);
        assertNotNull(result);
    }

    /*
     * Test for saving document with specified format
     */
    @Test
public void testPutDocumentSaveAsTiff() throws ApiException, IOException {
        String fileName = "45.pdf";
        String remoteName = "TestPutDocumentSaveAsTiff.docx";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, "TestPostDocumentSaveAsTiff.tiff");
        TiffSaveOptionsData saveOptionsData = (TiffSaveOptionsData) new TiffSaveOptionsData().saveFormat("tiff").fileName(destName);
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, "DocumentActions", "ConvertDocument", fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));
        SaveAsTiffRequest request = new SaveAsTiffRequest(remoteName, saveOptionsData,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null);
        SaveResponse result = TestInitializer.wordsApi.saveAsTiff(request);
        assertNotNull(result);
    }

    /*
     * Test for saving document with specified format
     */
    @Test
public void testGetDocumentWithFormat() throws ApiException, IOException {
        String format = "text";
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentWithFormat.docx";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));
        GetDocumentWithFormatRequest request = new GetDocumentWithFormatRequest(remoteName, format, PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null);
        File result = TestInitializer.wordsApi.getDocumentWithFormat(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for saving document with specified format
     */
    @Ignore
    public void GetDocumentWithFormatAndOutPath() throws ApiException, IOException {
        String format = "text";
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentWithFormat.docx";
        String outPath = PathUtil.get(TestInitializer.RemoteTestOut, remoteName);
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));
        GetDocumentWithFormatRequest request = new GetDocumentWithFormatRequest(remoteName, format, PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, outPath, null);
        File result = TestInitializer.wordsApi.getDocumentWithFormat(request);
        assertTrue(result.length() > 0);
    }
}
