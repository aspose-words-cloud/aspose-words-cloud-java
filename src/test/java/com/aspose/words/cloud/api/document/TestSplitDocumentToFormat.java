/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestSplitDocumentToFormat.java">
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
 * Example of how to split document and return result with specified format and page range.
 */
public class TestSplitDocumentToFormat  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentActions/SplitDocument";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for document splitting.
     */
    @Test
    public void testSplitDocument() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestSplitDocument.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        SplitDocumentRequest request = new SplitDocumentRequest(
            remoteFileName,
            "text",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/TestSplitDocument.text",
            1,
            2,
            null,
            null
        );

        SplitDocumentResponse result = TestInitializer.wordsApi.splitDocument(request);
        assertNotNull(result);
        assertNotNull(result.getSplitResult());
        assertNotNull(result.getSplitResult().getPages());
        assertEquals(2, result.getSplitResult().getPages().size());
    }

    /*
     * Test for document splitting online.
     */
    @Test
    public void testSplitDocumentOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        SplitDocumentOnlineRequest request = new SplitDocumentOnlineRequest(
            requestDocument,
            "text",
            null,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/TestSplitDocument.text",
            1,
            2,
            null,
            null
        );

        SplitDocumentOnlineResponse result = TestInitializer.wordsApi.splitDocumentOnline(request);
        assertNotNull(result);
    }
}
