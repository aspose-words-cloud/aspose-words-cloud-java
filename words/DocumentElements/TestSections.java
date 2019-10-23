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
package com.aspose.words.DocumentElements;

import com.aspose.words.ApiException;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.SectionLinkCollectionResponse;
import com.aspose.words.model.SectionResponse;
import com.aspose.words.model.requests.GetSectionRequest;
import com.aspose.words.model.requests.GetSectionsRequest;
import junit.framework.TestCase;

import java.io.File;
import java.nio.file.Paths;

public class TestSections extends TestCase {
    private String testFolder = "DocumentElements/Sections";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting section
     */
    public void testGetSection() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetSection.docx";
        Integer index = 0;

        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).ToString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetSectionRequest request = new GetSectionRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        SectionResponse result = TestInitializer.wordsApi.getSection(request);
        assertNotNull(result);
    }

    /*
     * Test for getting sections
     */
    public void testGetSections() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetSections.docx";

        TestInitializer.uploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).ToString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetSectionsRequest request = new GetSectionsRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        SectionLinkCollectionResponse result = TestInitializer.wordsApi.getSections(request);
        assertNotNull(result);
    }
}
