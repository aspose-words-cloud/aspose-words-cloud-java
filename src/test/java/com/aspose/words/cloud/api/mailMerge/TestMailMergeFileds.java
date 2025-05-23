/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestMailMergeFileds.java">
 *   Copyright (c) 2025 Aspose.Words for Cloud
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
import java.io.IOException;
import jakarta.mail.MessagingException;
import java.nio.file.*;
import java.util.*;

/*
 * Example of how to work with merge fields.
 */
public class TestMailMergeFileds  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentActions/MailMerge";
    private String mailMergeFolder = "DocumentActions/MailMerge";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for putting new fields.
     */
    @Test
    public void testGetDocumentFieldNamesOnline() throws ApiException, MessagingException, IOException
    {
        String localDocumentFile = "SampleExecuteTemplate.docx";

        byte[] requestTemplate = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, mailMergeFolder + "/" + localDocumentFile).toAbsolutePath());
        GetDocumentFieldNamesOnlineRequest request = new GetDocumentFieldNamesOnlineRequest(
            requestTemplate,
            null,
            null,
            null,
            null,
            true
        );

        FieldNamesResponse result = TestInitializer.wordsApi.getDocumentFieldNamesOnline(request);
        assertNotNull(result);
        assertNotNull(result.getFieldNames());
        assertNotNull(result.getFieldNames().getNames());
        assertEquals(15, result.getFieldNames().getNames().size());
        assertEquals("TableStart:Order", result.getFieldNames().getNames().get(0));
    }

    /*
     * Test for getting mailmerge fields.
     */
    @Test
    public void testGetDocumentFieldNames() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentFieldNames.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/test_multi_pages.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentFieldNamesRequest request = new GetDocumentFieldNamesRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        FieldNamesResponse result = TestInitializer.wordsApi.getDocumentFieldNames(request);
        assertNotNull(result);
        assertNotNull(result.getFieldNames());
        assertNotNull(result.getFieldNames().getNames());
        assertEquals(0, result.getFieldNames().getNames().size());
    }
}
