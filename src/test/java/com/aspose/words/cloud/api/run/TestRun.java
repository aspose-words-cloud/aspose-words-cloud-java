/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestRun.java">
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

package com.aspose.words.cloud.api.run;

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
 * Example of how to work with runs.
 */
public class TestRun  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Runs";
    private String localFile = "DocumentElements/Runs/Run.doc";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for updating run.
     */
    @Test
    public void testUpdateRun() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateRun.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RunUpdate requestRun = new RunUpdate();
        requestRun.setText("run with text");

        UpdateRunRequest request = new UpdateRunRequest(
            remoteFileName,
            "paragraphs/1",
            0,
            requestRun,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        RunResponse result = TestInitializer.wordsApi.updateRun(request);
        assertNotNull(result);
        assertNotNull(result.getRun());
        assertEquals("run with text", result.getRun().getText());
    }

    /*
     * Test for updating run online.
     */
    @Test
    public void testUpdateRunOnline() throws ApiException, IOException
    {
        RunUpdate requestRun = new RunUpdate();
        requestRun.setText("run with text");

        UpdateRunOnlineRequest request = new UpdateRunOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "paragraphs/1",
            requestRun,
            0,
            null,
            null,
            null,
            null,
            null
        );

        UpdateRunOnlineResponse result = TestInitializer.wordsApi.updateRunOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for adding run.
     */
    @Test
    public void testInsertRun() throws ApiException, IOException
    {
        String remoteFileName = "TestInsertRun.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RunInsert requestRun = new RunInsert();
        requestRun.setText("run with text");

        InsertRunRequest request = new InsertRunRequest(
            remoteFileName,
            "paragraphs/1",
            requestRun,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        RunResponse result = TestInitializer.wordsApi.insertRun(request);
        assertNotNull(result);
        assertNotNull(result.getRun());
        assertEquals("run with text", result.getRun().getText());
        assertEquals("0.0.1.3", result.getRun().getNodeId());
    }

    /*
     * Test for adding run online.
     */
    @Test
    public void testInsertRunOnline() throws ApiException, IOException
    {
        RunInsert requestRun = new RunInsert();
        requestRun.setText("run with text");

        InsertRunOnlineRequest request = new InsertRunOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "paragraphs/1",
            requestRun,
            null,
            null,
            null,
            null,
            null,
            null
        );

        InsertRunOnlineResponse result = TestInitializer.wordsApi.insertRunOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting run.
     */
    @Test
    public void testDeleteRun() throws ApiException, IOException
    {
        String remoteFileName = "TestDeleteRun.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteRunRequest request = new DeleteRunRequest(
            remoteFileName,
            "paragraphs/1",
            0,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteRun(request);
    }

    /*
     * Test for deleting run online.
     */
    @Test
    public void testDeleteRunOnline() throws ApiException, IOException
    {
        DeleteRunOnlineRequest request = new DeleteRunOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "paragraphs/1",
            0,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.deleteRunOnline(request);
        assertNotNull(result);
    }
}
