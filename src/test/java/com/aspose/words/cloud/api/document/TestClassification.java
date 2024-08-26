/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestClassification.java">
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

package com.aspose.words.cloud.api.document;

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
 * Example of how to classify text.
 */
public class TestClassification  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/Common";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for raw text classification.
     */
    @Test
    public void testClassify() throws ApiException, MessagingException, IOException
    {
        ClassifyRequest request = new ClassifyRequest(
            "Try text classification",
            "3"
        );

        ClassificationResponse result = TestInitializer.wordsApi.classify(request);
        assertNotNull(result);
        assertEquals("Science", result.getBestClassName());
        assertNotNull(result.getBestResults());
        assertEquals(3, result.getBestResults().size());
    }

    /*
     * Test for document classification.
     */
    @Test
    public void testClassifyDocument() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestClassifyDocument.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ClassifyDocumentRequest request = new ClassifyDocumentRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            "3",
            null
        );

        ClassificationResponse result = TestInitializer.wordsApi.classifyDocument(request);
        assertNotNull(result);
        assertEquals("Hobbies_&_Interests", result.getBestClassName());
        assertNotNull(result.getBestResults());
        assertEquals(3, result.getBestResults().size());
    }

    /*
     * Test for document classification online.
     */
    @Test
    public void testClassifyDocumentOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        ClassifyDocumentOnlineRequest request = new ClassifyDocumentOnlineRequest(
            requestDocument,
            null,
            null,
            null,
            null,
            "3",
            null
        );

        ClassificationResponse result = TestInitializer.wordsApi.classifyDocumentOnline(request);
        assertNotNull(result);
    }
}
