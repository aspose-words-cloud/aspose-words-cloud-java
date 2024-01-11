/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestBatch.java">
 *   Copyright (c) 2024 Aspose.Words for Cloud
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

package com.aspose.words.cloud;

import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import javax.mail.MessagingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class TestBatch  extends TestCase {
    private String testFolder = "DocumentElements/Paragraphs";
    private String reportingFolder = "DocumentActions/Reporting";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for URL encoding of document name
     */
    @Test
public void testBatch() throws ApiException, MessagingException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentParagraphByIndex.docx";
        String remoteFolder = PathUtil.get(TestInitializer.RemoteTestFolder, testFolder);

        String file = PathUtil.get(TestInitializer.LocalCommonFolder, fileName);
        String remote_path = PathUtil.get(remoteFolder, remoteName).replace("\\", "/");
        UploadFileRequest request0 = new UploadFileRequest(Files.readAllBytes(new File(file).toPath()), remote_path, null);

        BatchPartRequest request1 = new BatchPartRequest(
                new GetParagraphsRequest(remoteName,"sections/0", remoteFolder, null, null, null, null)
        );

        BatchPartRequest request2 = new BatchPartRequest(
                new GetParagraphRequest(remoteName, 0, "sections/0", remoteFolder, null, null, null, null)
        );

        ParagraphInsert request3body = new ParagraphInsert();
        request3body.setText("This is a new paragraph for your document");
        BatchPartRequest request3 = new BatchPartRequest(
                new InsertParagraphRequest(remoteName, request3body, "sections/0", remoteFolder, null, null, null, null, null, null, null, null)
        );

        BatchPartRequest request4 = new BatchPartRequest(
                new DeleteParagraphRequest(remoteName, 0, "", remoteFolder, null, null, null, null, null, null, null)
        );

        String localDocumentFile = "ReportTemplate.docx";
        String localDataFile = new String(Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, reportingFolder + "/ReportData.json")), "utf8");

        ReportEngineSettings requestReportEngineSettings = new ReportEngineSettings();
        requestReportEngineSettings.setDataSourceType(ReportEngineSettings.DataSourceTypeEnum.JSON);
        requestReportEngineSettings.setDataSourceName("persons");

        BatchPartRequest request5 = new BatchPartRequest(
                new BuildReportOnlineRequest(
                        Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, reportingFolder + "/" + localDocumentFile).toAbsolutePath()),
                        localDataFile,
                        requestReportEngineSettings,
                        null
                )
        );

        TestInitializer.wordsApi.uploadFile(request0);

        Object[] result = TestInitializer.wordsApi.batch(request1, request2, request3, request4, request5);
        assertEquals(5, result.length);
        assertTrue(result[0] instanceof ParagraphLinkCollectionResponse); // GetParagraphs
        assertTrue(result[1] instanceof ParagraphResponse); // GetParagraph
        assertTrue(result[2] instanceof ParagraphResponse); // InsertParagraph
        assertNull(result[3]); // DeleteParagraph
        assertTrue(result[4] instanceof byte[]); // BuildReportOnline
    }
}