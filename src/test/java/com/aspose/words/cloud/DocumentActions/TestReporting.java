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
package com.aspose.words.cloud.DocumentActions;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;

import org.junit.Test;

import junit.framework.TestCase;

import org.junit.Ignore;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestReporting extends TestCase {
    private String testFolder = "DocumentActions/Reporting";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    @Test
    public void testBuildReportOnline() throws ApiException, IOException {
        java.nio.file.Path filePath = Paths.get(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, "ReportTemplate.docx"));
        java.nio.file.Path dataPath = Paths.get(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, "ReportData.json"));
    
        ReportEngineSettings settings = new ReportEngineSettings().dataSourceType(ReportEngineSettings.DataSourceTypeEnum.JSON);        
        BuildReportOnlineRequest request = new BuildReportOnlineRequest(Files.readAllBytes(filePath), Files.readString(dataPath), settings, null);
        TestInitializer.wordsApi.buildReportOnline(request);
    }

    @Test
    public void testBuildReport() throws ApiException, IOException {
        String localName = "ReportTemplate.docx";
        String remoteName = "TestBuildReport.docx";
        java.nio.file.Path dataPath = Paths.get(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, "ReportData.json"));
        String localPath = PathUtil.get(TestInitializer.LocalTestFolder, testFolder, localName);            
        String fullName = PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName);
        
        TestInitializer.UploadFile(localPath, fullName);

        java.util.List<ReportBuildOptions> options = new java.util.ArrayList<ReportBuildOptions>();
        options.add(ReportBuildOptions.ALLOWMISSINGMEMBERS);
        options.add(ReportBuildOptions.REMOVEEMPTYPARAGRAPHS);
        
        ReportEngineSettings settings = new ReportEngineSettings()
            .dataSourceType(ReportEngineSettings.DataSourceTypeEnum.JSON)
            .reportBuildOptions(options);

        BuildReportRequest request = new BuildReportRequest(remoteName, Files.readString(dataPath), settings, null, null, null, null, null);
        TestInitializer.wordsApi.buildReport(request);
    }
}
