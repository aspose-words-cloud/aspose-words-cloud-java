/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestExecuteTemplate.java">
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

package com.aspose.words.cloud.api.mailMerge;

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
 * Example of how to perform template execution.
 */
public class TestExecuteTemplate  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentActions/MailMerge";
    private String mailMergeFolder = "DocumentActions/MailMerge";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for posting execute template.
     */
    @Test
    public void testExecuteTemplate() throws ApiException, MessagingException, IOException
    {
        String localDocumentFile = "TestExecuteTemplate.doc";
        String remoteFileName = "TestExecuteTemplate.docx";
        String localDataFile = new String(Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, mailMergeFolder + "/TestExecuteTemplateData.txt")), "utf8");

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, mailMergeFolder + "/" + localDocumentFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ExecuteMailMergeRequest request = new ExecuteMailMergeRequest(
            remoteFileName,
            localDataFile,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName
        );

        DocumentResponse result = TestInitializer.wordsApi.executeMailMerge(request);
        assertNotNull(result);
        assertNotNull(result.getDocument());
        assertEquals("TestExecuteTemplate.docx", result.getDocument().getFileName());
    }

    /*
     * Test for execute template online.
     */
    @Test
    public void testExecuteTemplateOnline() throws ApiException, MessagingException, IOException
    {
        String localDocumentFile = "SampleMailMergeTemplate.docx";
        String localDataFile = "SampleExecuteTemplateData.txt";

        byte[] requestTemplate = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, mailMergeFolder + "/" + localDocumentFile).toAbsolutePath());
        byte[] requestData = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, mailMergeFolder + "/" + localDataFile).toAbsolutePath());
        ExecuteMailMergeOnlineRequest request = new ExecuteMailMergeOnlineRequest(
            requestTemplate,
            requestData,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.executeMailMergeOnline(request);
        assertNotNull(result);
    }
}
