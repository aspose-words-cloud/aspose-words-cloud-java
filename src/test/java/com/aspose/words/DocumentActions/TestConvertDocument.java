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
import com.aspose.words.model.SaveOptionsData;
import com.aspose.words.model.SaveResponse;
import com.aspose.words.model.TiffSaveOptionsData;
import com.aspose.words.model.requests.GetDocumentWithFormatRequest;
import com.aspose.words.model.requests.PostDocumentSaveAsRequest;
import com.aspose.words.model.requests.PutConvertDocumentRequest;
import com.aspose.words.model.requests.PutDocumentSaveAsTiffRequest;
import junit.framework.TestCase;
import org.junit.Ignore;

import java.io.File;
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
    public void testPostDocumentSaveAs() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostDocumentSaveAs.docx";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        SaveOptionsData saveOptionsData = new SaveOptionsData().saveFormat("pdf").fileName(destName);

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        PostDocumentSaveAsRequest request = new PostDocumentSaveAsRequest(remoteName, saveOptionsData,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null);

        SaveResponse result = TestInitializer.wordsApi.postDocumentSaveAs(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for document conversion without storage
     */
    public void testPutConvertDocument() throws ApiException {
        String format = "pdf";
        String fileName = "test_multi_pages.docx";
        PutConvertDocumentRequest request = new PutConvertDocumentRequest(new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()), format,
                null, null, null, null);
        File result = TestInitializer.wordsApi.putConvertDocument(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for saving document with specified format
     */
    public void testPostSaveDocumentSaveAsFromPdfToDoc() throws ApiException {
        String fileName = "45.pdf";
        String remoteName = "TestPostDocumentSaveAsFromPdfToDoc.docx";
        String destName = Paths.get(TestInitializer.RemoteTestOut, "TestPostDocumentSaveAs.docx").toString();
        SaveOptionsData saveOptionsData = new SaveOptionsData().saveFormat("docx").fileName(destName);
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);
        PostDocumentSaveAsRequest request = new PostDocumentSaveAsRequest(remoteName, saveOptionsData,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, destName, null);
        SaveResponse result = TestInitializer.wordsApi.postDocumentSaveAs(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for saving document with specified format
     */
    public void testPutDocumentSaveAsTiff() throws ApiException {
        String fileName = "45.pdf";
        String remoteName = "TestPutDocumentSaveAsTiff.docx";
        String destName = Paths.get(TestInitializer.RemoteTestOut, "TestPostDocumentSaveAsTiff.tiff").toString();
        TiffSaveOptionsData saveOptionsData = (TiffSaveOptionsData) new TiffSaveOptionsData().saveFormat("tiff").fileName(destName);
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);
        PutDocumentSaveAsTiffRequest request = new PutDocumentSaveAsTiffRequest(remoteName, saveOptionsData,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, destName, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null);
        SaveResponse result = TestInitializer.wordsApi.putDocumentSaveAsTiff(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for saving document with specified format
     */
    public void testGetDocumentWithFormat() throws ApiException {
        String format = "text";
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentWithFormat.docx";
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);
        GetDocumentWithFormatRequest request = new GetDocumentWithFormatRequest(remoteName, format, Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
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
        String outPath = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);
        GetDocumentWithFormatRequest request = new GetDocumentWithFormatRequest(remoteName, format, Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, outPath, null);
        File result = TestInitializer.wordsApi.getDocumentWithFormat(request);
        assertTrue(result.length() > 0);
    }
}
