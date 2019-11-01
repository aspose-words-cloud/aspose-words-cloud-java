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
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.PageSetup;
import com.aspose.words.cloud.model.SectionPageSetupResponse;
import com.aspose.words.cloud.model.requests.GetSectionPageSetupRequest;
import com.aspose.words.cloud.model.requests.RenderPageRequest;
import com.aspose.words.cloud.model.requests.UpdateSectionPageSetupRequest;

import org.junit.Test;

import junit.framework.TestCase;

public class TestPages extends TestCase {
    private String testFolder = "DocumentElements/Pages";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for page rendering
     */
    @Test
public void testRenderPage() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestRenderPage.doc";
        Integer pageNumber = 1;
        String format = "png";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        RenderPageRequest request = new RenderPageRequest(remoteName, pageNumber, format,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null);

        File result = TestInitializer.wordsApi.renderPage(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for getting page setup
     */
    @Test
public void testGetSectionPageSetup() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetSectionPageSetup.doc";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetSectionPageSetupRequest request = new GetSectionPageSetupRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        SectionPageSetupResponse result = TestInitializer.wordsApi.getSectionPageSetup(request);
        assertNotNull(result);
    }

    /*
     * Test for updating page setup
     */
    @Test
public void testUpdateSectionPageSetup() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestUpdateSectionPageSetup.doc";
        Integer index = 0;
        PageSetup body = new PageSetup().rtlGutter(true).leftMargin(10.0)
                .orientation(PageSetup.OrientationEnum.LANDSCAPE).paperSize(PageSetup.PaperSizeEnum.A5);

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateSectionPageSetupRequest request = new UpdateSectionPageSetupRequest(remoteName, index, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        SectionPageSetupResponse result = TestInitializer.wordsApi.updateSectionPageSetup(request);
        assertNotNull(result);
    }
}
