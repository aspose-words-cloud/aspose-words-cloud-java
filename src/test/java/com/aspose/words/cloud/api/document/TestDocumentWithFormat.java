/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestDocumentWithFormat.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

/*
 * Example of how to get document with different format.
 */
public class TestDocumentWithFormat  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentActions/DocumentWithFormat";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting document with specified format.
     */
    @Test
    public void testGetDocumentWithFormat() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentWithFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentWithFormatRequest request = new GetDocumentWithFormatRequest(
            remoteFileName,
            "text",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.getDocumentWithFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for getting document with specified format.
     */
    @Test
    public void testGetDocumentWithFormatAndOutPath() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentWithFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentWithFormatRequest request = new GetDocumentWithFormatRequest(
            remoteFileName,
            "text",
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/TestGetDocumentWithFormatAndOutPath.text",
            null
        );

        File result = TestInitializer.wordsApi.getDocumentWithFormat(request);
        assertNotNull(result);
    }
}
