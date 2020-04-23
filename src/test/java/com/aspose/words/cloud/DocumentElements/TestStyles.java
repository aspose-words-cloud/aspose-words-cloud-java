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
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class TestStyles extends TestCase {
    private String testFolder = "DocumentElements/Styles";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting styles from document
     */
    @Test
    public void testGetStyles() throws ApiException, IOException {
        String fileName = "GetStyles.docx";
        String remoteName = "TestGetStyles.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetStylesRequest request = new GetStylesRequest(remoteName, PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null, null);

        StylesResponse result = TestInitializer.wordsApi.getStyles(request);
        assertNotNull(result);
    }

    /*
     * Test for getting style from document styles
     */
    @Test
    public void testGetStyle() throws ApiException, IOException {
        String fileName = "GetStyles.docx";
        String remoteName = "TestGetStyle.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetStyleRequest request = new GetStyleRequest(remoteName, "Heading 1", PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null, null);

        StyleResponse result = TestInitializer.wordsApi.getStyle(request);
        assertNotNull(result);
    }

    /*
     * Test for updating style from document styles
     */
    @Test
    public void testUpdateStyle() throws ApiException, IOException {
        String fileName = "GetStyles.docx";
        String remoteName = "TestUpdateStyle.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        StyleUpdate data = new StyleUpdate();
        data.setName("My Style");

        UpdateStyleRequest request = new UpdateStyleRequest(remoteName, data,"Heading 1", PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null, null, null, null, null);

        StyleResponse result = TestInitializer.wordsApi.updateStyle(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting style from document styles
     */
    @Test
    public void testInsertStyle() throws ApiException, IOException {
        String fileName = "GetStyles.docx";
        String remoteName = "TestInsertStyle.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        StyleInsert data = new StyleInsert();
        data.setStyleName("My Style");
        data.setStyleType(StyleInsert.StyleTypeEnum.PARAGRAPH);

        InsertStyleRequest request = new InsertStyleRequest(remoteName, data, PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null, null, null, null, null);

        StyleResponse result = TestInitializer.wordsApi.insertStyle(request);
        assertNotNull(result);
    }

    /*
     * Test for coping style from document styles
     */
    @Test
    public void testCopyStyle() throws ApiException, IOException {
        String fileName = "GetStyles.docx";
        String remoteName = "TestCopyStyle.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        StyleCopy data = new StyleCopy();
        data.setStyleName("Heading 1");

        CopyStyleRequest request = new CopyStyleRequest(remoteName, data, PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null, null, null, null, null);

        StyleResponse result = TestInitializer.wordsApi.copyStyle(request);
        assertNotNull(result);
    }

    /*
     * Test for getting style from document element
     */
    @Test
    public void testGetStyleFromDocumentElement() throws ApiException, IOException {
        String fileName = "GetStyles.docx";
        String remoteName = "TestGetStyleFromDocumentElement.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetStyleFromDocumentElementRequest request =
                new GetStyleFromDocumentElementRequest(remoteName, "paragraphs/1/paragraphFormat", PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null, null);

        StyleResponse result = TestInitializer.wordsApi.getStyleFromDocumentElement(request);
        assertNotNull(result);
    }

    /*
     * Test for applying style to document element
     */
    @Test
    public void testApplyStyleToDocumentElement() throws ApiException, IOException {
        String fileName = "GetStyles.docx";
        String remoteName = "TestApplyStyleToDocumentElement.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        StyleApply data = new StyleApply();
        data.setStyleName("Heading 1");

        ApplyStyleToDocumentElementRequest request =
                new ApplyStyleToDocumentElementRequest(remoteName, data, "paragraphs/1/paragraphFormat", PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).replace("\\", "/"), null, null, null, null, null, null);

        WordsResponse result = TestInitializer.wordsApi.applyStyleToDocumentElement(request);
        assertNotNull(result);
    }
}
