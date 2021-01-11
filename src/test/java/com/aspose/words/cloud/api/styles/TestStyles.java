/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestStyles.java">
 *   Copyright (c) 2021 Aspose.Words for Cloud
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
import com.aspose.words.cloud.model.responses.*;
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
        assertNotNull(result.getStyles());
        assertEquals(22, result.getStyles().size());
        assertEquals("Default Paragraph Font", result.getStyles().get(0).getName());
    }

    /*
     * Test for getting styles from document online.
     */
    @Test
    public void testGetStylesOnline() throws ApiException, IOException
    {
        GetStylesOnlineRequest request = new GetStylesOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            null,
            null
        );

        StylesResponse result = TestInitializer.wordsApi.getStylesOnline(request);
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
        assertNotNull(result.getStyle());
        assertEquals("Heading 1", result.getStyle().getName());
    }

    /*
     * Test for getting style from document online.
     */
    @Test
    public void testGetStyleOnline() throws ApiException, IOException
    {
        GetStyleOnlineRequest request = new GetStyleOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "Heading 1",
            null,
            null
        );

        StyleResponse result = TestInitializer.wordsApi.getStyleOnline(request);
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
            "Heading 1",
            requestStyleUpdate,
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
        assertNotNull(result.getStyle());
        assertEquals("My Style", result.getStyle().getName());
    }

    /*
     * Test for updating style from document online.
     */
    @Test
    public void testUpdateStyleOnline() throws ApiException, IOException
    {
        StyleUpdate requestStyleUpdate = new StyleUpdate();
        requestStyleUpdate.setName("My Style");

        UpdateStyleOnlineRequest request = new UpdateStyleOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "Heading 1",
            requestStyleUpdate,
            null,
            null,
            null,
            null,
            null
        );

        UpdateStyleOnlineResponse result = TestInitializer.wordsApi.updateStyleOnline(request);
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
        assertNotNull(result.getStyle());
        assertEquals("My Style", result.getStyle().getName());
    }

    /*
     * Test for inserting style from document online.
     */
    @Test
    public void testInsertStyleOnline() throws ApiException, IOException
    {
        StyleInsert requestStyleInsert = new StyleInsert();
        requestStyleInsert.setStyleName("My Style");
        requestStyleInsert.setStyleType(StyleInsert.StyleTypeEnum.PARAGRAPH);

        InsertStyleOnlineRequest request = new InsertStyleOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            requestStyleInsert,
            null,
            null,
            null,
            null,
            null
        );

        InsertStyleOnlineResponse result = TestInitializer.wordsApi.insertStyleOnline(request);
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
        assertNotNull(result.getStyle());
        assertEquals("Heading 1_0", result.getStyle().getName());
    }

    /*
     * Test for coping style from document online.
     */
    @Test
    public void testCopyStyleOnline() throws ApiException, IOException
    {
        StyleCopy requestStyleCopy = new StyleCopy();
        requestStyleCopy.setStyleName("Heading 1");

        CopyStyleOnlineRequest request = new CopyStyleOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            requestStyleCopy,
            null,
            null,
            null,
            null,
            null
        );

        CopyStyleOnlineResponse result = TestInitializer.wordsApi.copyStyleOnline(request);
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
        assertNotNull(result.getStyle());
        assertEquals("TOC 1", result.getStyle().getName());
    }

    /*
     * Test for getting style from document element online.
     */
    @Test
    public void testGetStyleFromDocumentElementOnline() throws ApiException, IOException
    {
        GetStyleFromDocumentElementOnlineRequest request = new GetStyleFromDocumentElementOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "paragraphs/1/paragraphFormat",
            null,
            null
        );

        StyleResponse result = TestInitializer.wordsApi.getStyleFromDocumentElementOnline(request);
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
            "paragraphs/1/paragraphFormat",
            requestStyleApply,
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

    /*
     * Test for applying style to document element online.
     */
    @Test
    public void testApplyStyleToDocumentElementOnline() throws ApiException, IOException
    {
        StyleApply requestStyleApply = new StyleApply();
        requestStyleApply.setStyleName("Heading 1");

        ApplyStyleToDocumentElementOnlineRequest request = new ApplyStyleToDocumentElementOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "paragraphs/1/paragraphFormat",
            requestStyleApply,
            null,
            null,
            null,
            null,
            null
        );

        ApplyStyleToDocumentElementOnlineResponse result = TestInitializer.wordsApi.applyStyleToDocumentElementOnline(request);
        assertNotNull(result);
    }
}
