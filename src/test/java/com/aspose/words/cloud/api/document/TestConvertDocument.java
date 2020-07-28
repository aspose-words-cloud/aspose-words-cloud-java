/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestConvertDocument.java">
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

package com.aspose.words.cloud.api.document;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

/*
 * Example of how to convert document to one of the available formats.
 */
public class TestConvertDocument  extends TestCase
{
    private String remoteFolder = TestInitializer.RemoteTestFolder + "/DocumentActions/ConvertDocument";
    private String localFolder = "DocumentActions/ConvertDocument";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for converting document to one of the available formats.
     */
    @Test
    public void testSaveAs() throws ApiException, IOException
    {
        String localName = "test_multi_pages.docx";
        String remoteName = "TestSaveAs.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localName),
            remoteFolder + "/" + remoteName
        );

        SaveOptionsData requestSaveOptionsData = new SaveOptionsData();
        requestSaveOptionsData.setSaveFormat("pdf");
        requestSaveOptionsData.setFileName(TestInitializer.RemoteTestOut + "/TestSaveAs.pdf");

        SaveAsRequest request = new SaveAsRequest(
            remoteName,
            requestSaveOptionsData,
            remoteFolder,
            null,
            null,
            null,
            null
        );

        SaveResponse result = TestInitializer.wordsApi.saveAs(request);
        assertNotNull(result);
    }

    /*
     * Test for converting document online to one of the available formats.
     */
    @Test
    public void testSaveAsOnline() throws ApiException, IOException
    {
        String localName = "test_multi_pages.docx";

        SaveOptionsData requestSaveOptionsData = new SaveOptionsData();
        requestSaveOptionsData.setSaveFormat("pdf");
        requestSaveOptionsData.setFileName(TestInitializer.RemoteTestOut + "/TestSaveAs.pdf");

        SaveAsOnlineRequest request = new SaveAsOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/" + localName).toAbsolutePath()),
            requestSaveOptionsData,
            null
        );

        File result = TestInitializer.wordsApi.saveAsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for converting document to one of the available formats.
     */
    @Test
    public void testSaveAsDocx() throws ApiException, IOException
    {
        String localName = "45.pdf";
        String remoteName = "TestSaveAsFromPdfToDoc.pdf";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName),
            remoteFolder + "/" + remoteName
        );

        SaveOptionsData requestSaveOptionsData = new SaveOptionsData();
        requestSaveOptionsData.setSaveFormat("docx");
        requestSaveOptionsData.setFileName(TestInitializer.RemoteTestOut + "/TestSaveAsFromPdfToDoc.docx");

        SaveAsRequest request = new SaveAsRequest(
            remoteName,
            requestSaveOptionsData,
            remoteFolder,
            null,
            null,
            null,
            null
        );

        SaveResponse result = TestInitializer.wordsApi.saveAs(request);
        assertNotNull(result);
    }

    /*
     * Test for converting document to one of the available formats.
     */
    @Test
    public void testSaveAsTiff() throws ApiException, IOException
    {
        String localName = "test_multi_pages.docx";
        String remoteName = "TestSaveAsTiff.pdf";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localName),
            remoteFolder + "/" + remoteName
        );

        TiffSaveOptionsData requestSaveOptions = new TiffSaveOptionsData();
        requestSaveOptions.setSaveFormat("tiff");
        requestSaveOptions.setFileName(TestInitializer.RemoteTestOut + "/abc.tiff");

        SaveAsTiffRequest request = new SaveAsTiffRequest(
            remoteName,
            requestSaveOptions,
            remoteFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        SaveResponse result = TestInitializer.wordsApi.saveAsTiff(request);
        assertNotNull(result);
    }

    /*
     * A test for ConvertDocument.
     */
    @Test
    public void testConvertDocument() throws ApiException, IOException
    {
        ConvertDocumentRequest request = new ConvertDocumentRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFolder + "/test_uploadfile.docx").toAbsolutePath()),
            "pdf",
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.convertDocument(request);
        assertNotNull(result);
    }
}
