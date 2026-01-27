/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestCompressDocument.java">
 *   Copyright (c) 2026 Aspose.Words for Cloud
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
 * Example of how to compress document for reduce document size.
 */
public class TestCompressDocument  extends TestCase
{
    private String remoteFolder = TestInitializer.RemoteTestFolder + "/DocumentActions/CompressDocument";
    private String localFolder = "DocumentActions/CompressDocument";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for compression document.
     */
    @Test
    public void testCompressDocument() throws ApiException, MessagingException, IOException
    {
        String localName = "TestCompress.docx";
        String remoteName = "TestCompress.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName),
            remoteFolder + "/" + remoteName
        );

        CompressOptions requestCompressOptions = new CompressOptions();

        CompressDocumentRequest request = new CompressDocumentRequest(
            remoteName,
            requestCompressOptions,
            remoteFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        CompressResponse result = TestInitializer.wordsApi.compressDocument(request);
        assertNotNull(result);
        assertNotNull(result.getDocument());
    }

    /*
     * Test for compression document online.
     */
    @Test
    public void testCompressDocumentOnline() throws ApiException, MessagingException, IOException
    {
        String localName = "TestCompress.docx";

        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFolder + "/" + localName).toAbsolutePath());
        CompressOptions requestCompressOptions = new CompressOptions();

        CompressDocumentOnlineRequest request = new CompressDocumentOnlineRequest(
            requestDocument,
            requestCompressOptions,
            null,
            null,
            null,
            null,
            null
        );

        CompressDocumentOnlineResponse result = TestInitializer.wordsApi.compressDocumentOnline(request);
        assertNotNull(result);
    }
}
