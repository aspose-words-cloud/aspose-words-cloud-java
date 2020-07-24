/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestFootnote.java">
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

package com.aspose.words.cloud.api.footnote;

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
 * Example of how to work with footnotes.
 */
public class TestFootnote  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Footnotes";
    private String footnoteFolder = "DocumentElements/Footnotes";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for adding footnote.
     */
    @Test
    public void testInsertFootnote() throws ApiException, IOException
    {
        String remoteFileName = "TestInsertFootnote.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, footnoteFolder + "/Footnote.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        FootnoteInsert requestFootnoteDto = new FootnoteInsert();
        requestFootnoteDto.setFootnoteType(FootnoteInsert.FootnoteTypeEnum.ENDNOTE);
        requestFootnoteDto.setText("test endnote");

        InsertFootnoteRequest request = new InsertFootnoteRequest(
            remoteFileName,
            requestFootnoteDto,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        FootnoteResponse result = TestInitializer.wordsApi.insertFootnote(request);
        assertNotNull(result);
    }

    /*
     * Test for adding footnote without node path.
     */
    @Test
    public void testInsertFootnoteWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestInsertFootnoteWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, footnoteFolder + "/Footnote.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        FootnoteInsert requestFootnoteDto = new FootnoteInsert();
        requestFootnoteDto.setFootnoteType(FootnoteInsert.FootnoteTypeEnum.ENDNOTE);
        requestFootnoteDto.setText("test endnote");

        InsertFootnoteRequest request = new InsertFootnoteRequest(
            remoteFileName,
            requestFootnoteDto,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        FootnoteResponse result = TestInitializer.wordsApi.insertFootnote(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting footnote.
     */
    @Test
    public void testDeleteFootnote() throws ApiException, IOException
    {
        String remoteFileName = "TestDeleteFootnote.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, footnoteFolder + "/Footnote.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFootnoteRequest request = new DeleteFootnoteRequest(
            remoteFileName,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFootnote(request);
    }

    /*
     * Test for deleting footnote without node path.
     */
    @Test
    public void testDeleteFootnoteWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestDeleteFootnoteWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, footnoteFolder + "/Footnote.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFootnoteRequest request = new DeleteFootnoteRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFootnote(request);
    }

    /*
     * Test for getting footnotes.
     */
    @Test
    public void testGetFootnotes() throws ApiException, IOException
    {
        String remoteFileName = "TestGetFootnotes.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, footnoteFolder + "/Footnote.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFootnotesRequest request = new GetFootnotesRequest(
            remoteFileName,
            "",
            remoteDataFolder,
            null,
            null,
            null
        );

        FootnotesResponse result = TestInitializer.wordsApi.getFootnotes(request);
        assertNotNull(result);
    }

    /*
     * Test for getting footnotes without node path.
     */
    @Test
    public void testGetFootnotesWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestGetFootnotesWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, footnoteFolder + "/Footnote.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFootnotesRequest request = new GetFootnotesRequest(
            remoteFileName,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        FootnotesResponse result = TestInitializer.wordsApi.getFootnotes(request);
        assertNotNull(result);
    }

    /*
     * Test for getting footnote.
     */
    @Test
    public void testGetFootnote() throws ApiException, IOException
    {
        String remoteFileName = "TestGetFootnote.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, footnoteFolder + "/Footnote.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFootnoteRequest request = new GetFootnoteRequest(
            remoteFileName,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null
        );

        FootnoteResponse result = TestInitializer.wordsApi.getFootnote(request);
        assertNotNull(result);
    }

    /*
     * Test for getting footnote without node path.
     */
    @Test
    public void testGetFootnoteWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestGetFootnoteWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, footnoteFolder + "/Footnote.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFootnoteRequest request = new GetFootnoteRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        FootnoteResponse result = TestInitializer.wordsApi.getFootnote(request);
        assertNotNull(result);
    }

    /*
     * Test for updating footnote.
     */
    @Test
    public void testUpdateFootnote() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateFootnote.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, footnoteFolder + "/Footnote.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        FootnoteUpdate requestFootnoteDto = new FootnoteUpdate();
        requestFootnoteDto.setText("new text is here");

        UpdateFootnoteRequest request = new UpdateFootnoteRequest(
            remoteFileName,
            requestFootnoteDto,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        FootnoteResponse result = TestInitializer.wordsApi.updateFootnote(request);
        assertNotNull(result);
    }

    /*
     * Test for updating footnote without node path.
     */
    @Test
    public void testUpdateFootnoteWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateFootnoteWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, footnoteFolder + "/Footnote.doc"),
            remoteDataFolder + "/" + remoteFileName
        );

        FootnoteUpdate requestFootnoteDto = new FootnoteUpdate();
        requestFootnoteDto.setText("new text is here");

        UpdateFootnoteRequest request = new UpdateFootnoteRequest(
            remoteFileName,
            requestFootnoteDto,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        FootnoteResponse result = TestInitializer.wordsApi.updateFootnote(request);
        assertNotNull(result);
    }
}
