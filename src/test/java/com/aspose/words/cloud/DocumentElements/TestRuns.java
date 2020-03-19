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
import com.aspose.words.cloud.model.Run;
import com.aspose.words.cloud.model.RunResponse;
import com.aspose.words.cloud.model.requests.DeleteRunRequest;
import com.aspose.words.cloud.model.requests.UpdateRunRequest;
import com.aspose.words.cloud.model.requests.InsertRunRequest;
import org.junit.Test;

import junit.framework.TestCase;

import java.io.IOException;

public class TestRuns extends TestCase {
    private String testFolder = "DocumentElements/Runs";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for removing run
     */
    @Test
public void testDeleteRun() throws ApiException, IOException {
        String fileName = "Run.doc";
        String remoteName = "TestDeleteRun.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/1";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        DeleteRunRequest request = new DeleteRunRequest(remoteName, paragraphPath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteRun(request);
    }

    /*
     * Test for updating run
     */
    @Test
public void testUpdateRun() throws ApiException, IOException {
        String fileName = "Run.doc";
        String remoteName = "TestUpdateRun.doc";
        Integer index = 0;
        String paragraphPath = "paragraphs/1";
        Run body = (Run) new Run().text("Run with text");
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        UpdateRunRequest request = new UpdateRunRequest(remoteName, body, paragraphPath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null);

        RunResponse result = TestInitializer.wordsApi.updateRun(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting run
     */
    @Test
public void testInsertRun() throws ApiException, IOException {
        String fileName = "Run.doc";
        String remoteName = "TestInsertRun.doc";
        String paragraphPath = "paragraphs/1";
        Run body = (Run) new Run().text("Run with text");
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        InsertRunRequest request = new InsertRunRequest(remoteName, paragraphPath, body,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null, null);

        RunResponse result = TestInitializer.wordsApi.insertRun(request);
        assertNotNull(result);
    }
}
