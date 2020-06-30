/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestStyles.java">
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

package com.aspose.words.cloud.api.styles;

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
 * Example of how to work with styles.
 */
public class TestStyles  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Styles";
    private String localFile = "DocumentElements/Styles/GetStyles.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting styles from document.
     */
    @Test
    public void testGetStyles() throws ApiException, IOException
    {
        String remoteFileName = "TestGetStyles.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetStylesRequest request = new GetStylesRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null
        );

        StylesResponse result = TestInitializer.wordsApi.getStyles(request);
        assertNotNull(result);
    }

    /*
     * Test for getting style from document.
     */
    @Test
    public void testGetStyle() throws ApiException, IOException
    {
        String remoteFileName = "TestGetStyle.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetStyleRequest request = new GetStyleRequest(
            remoteFileName,
            "Heading 1",
            remoteDataFolder,
            null,
            null,
            null
        );

        StyleResponse result = TestInitializer.wordsApi.getStyle(request);
        assertNotNull(result);
    }

    /*
     * Test for updating style from document.
     */
    @Test
    public void testUpdateStyle() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateStyle.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        StyleUpdate requestStyleUpdate = new StyleUpdate();
        requestStyleUpdate.setName("My Style");

        UpdateStyleRequest request = new UpdateStyleRequest(
            remoteFileName,
            requestStyleUpdate,
            "Heading 1",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        StyleResponse result = TestInitializer.wordsApi.updateStyle(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting style from document.
     */
    @Test
    public void testInsertStyle() throws ApiException, IOException
    {
        String remoteFileName = "TestInsertStyle.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        StyleInsert requestStyleInsert = new StyleInsert();
        requestStyleInsert.setStyleName("My Style");
        requestStyleInsert.setStyleType(StyleInsert.StyleTypeEnum.PARAGRAPH);

        InsertStyleRequest request = new InsertStyleRequest(
            remoteFileName,
            requestStyleInsert,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        StyleResponse result = TestInitializer.wordsApi.insertStyle(request);
        assertNotNull(result);
    }

    /*
     * Test for coping style from document.
     */
    @Test
    public void testCopyStyle() throws ApiException, IOException
    {
        String remoteFileName = "TestCopyStyle.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        StyleCopy requestStyleCopy = new StyleCopy();
        requestStyleCopy.setStyleName("Heading 1");

        CopyStyleRequest request = new CopyStyleRequest(
            remoteFileName,
            requestStyleCopy,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        StyleResponse result = TestInitializer.wordsApi.copyStyle(request);
        assertNotNull(result);
    }

    /*
     * Test for getting style from document element.
     */
    @Test
    public void testGetStyleFromDocumentElement() throws ApiException, IOException
    {
        String remoteFileName = "TestGetStyleFromDocumentElement.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetStyleFromDocumentElementRequest request = new GetStyleFromDocumentElementRequest(
            remoteFileName,
            "paragraphs/1/paragraphFormat",
            remoteDataFolder,
            null,
            null,
            null
        );

        StyleResponse result = TestInitializer.wordsApi.getStyleFromDocumentElement(request);
        assertNotNull(result);
    }

    /*
     * Test for applying style to document element.
     */
    @Test
    public void testApplyStyleToDocumentElement() throws ApiException, IOException
    {
        String remoteFileName = "TestApplyStyleToDocumentElement.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        StyleApply requestStyleApply = new StyleApply();
        requestStyleApply.setStyleName("Heading 1");

        ApplyStyleToDocumentElementRequest request = new ApplyStyleToDocumentElementRequest(
            remoteFileName,
            requestStyleApply,
            "paragraphs/1/paragraphFormat",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        WordsResponse result = TestInitializer.wordsApi.applyStyleToDocumentElement(request);
        assertNotNull(result);
    }
}
