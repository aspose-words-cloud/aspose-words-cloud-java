/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestBuildReport.java">
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

package com.aspose.words.cloud.api.report;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.File;
import java.io.IOException;
import javax.mail.MessagingException;
import java.nio.file.*;
import java.util.ArrayList;

/*
 * Example of how to perform mail merge.
 */
public class TestBuildReport  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentActions/Reporting";
    private String reportingFolder = "DocumentActions/Reporting";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for build report online.
     */
    @Test
    public void testBuildReportOnline() throws ApiException, MessagingException, IOException
    {
        String localDocumentFile = "ReportTemplate.docx";
        String localDataFile = new String(Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, reportingFolder + "/ReportData.json")), "utf8");

        byte[] requestTemplate = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, reportingFolder + "/" + localDocumentFile).toAbsolutePath());
        ReportEngineSettings requestReportEngineSettings = new ReportEngineSettings();
        requestReportEngineSettings.setDataSourceType(ReportEngineSettings.DataSourceTypeEnum.JSON);
        requestReportEngineSettings.setDataSourceName("persons");

        BuildReportOnlineRequest request = new BuildReportOnlineRequest(
            requestTemplate,
            localDataFile,
            requestReportEngineSettings,
            null
        );

        File result = TestInitializer.wordsApi.buildReportOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for build report.
     */
    @Test
    public void testBuildReport() throws ApiException, MessagingException, IOException
    {
        String localDocumentFile = "ReportTemplate.docx";
        String remoteFileName = "TestBuildReport.docx";
        String localDataFile = new String(Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, reportingFolder + "/ReportData.json")), "utf8");

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, reportingFolder + "/" + localDocumentFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ArrayList<ReportBuildOptions> requestReportEngineSettingsReportBuildOptions = new ArrayList<ReportBuildOptions>();
        requestReportEngineSettingsReportBuildOptions.add(ReportBuildOptions.ALLOWMISSINGMEMBERS);
        requestReportEngineSettingsReportBuildOptions.add(ReportBuildOptions.REMOVEEMPTYPARAGRAPHS);

        ReportEngineSettings requestReportEngineSettings = new ReportEngineSettings();
        requestReportEngineSettings.setDataSourceType(ReportEngineSettings.DataSourceTypeEnum.JSON);
        requestReportEngineSettings.setReportBuildOptions(requestReportEngineSettingsReportBuildOptions);

        BuildReportRequest request = new BuildReportRequest(
            remoteFileName,
            localDataFile,
            requestReportEngineSettings,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.buildReport(request);
        assertNotNull(result);
        assertNotNull(result.getDocument());
        assertEquals("TestBuildReport.docx", result.getDocument().getFileName());
    }
}
