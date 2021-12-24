/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestExamples.java">
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
package com.aspose.words.cloud;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.api.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import junit.framework.TestCase;
import org.junit.Test;

public class TestExamples extends TestCase
{
    private ApiClient apiClient;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
        apiClient = TestInitializer.apiClient;
        WordsApi api = new WordsApi(apiClient);
        api.uploadFile(new UploadFileRequest(
            Files.readAllBytes(Paths.get("ExamplesData", "test_doc.docx").toAbsolutePath()),
            "test_doc.docx",
            null
        ));
    }

    @Test
    public void testAcceptAllRevisions() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        String fileName = "test_doc.docx";

        // Upload original document to cloud storage.
        byte[] myVar1 = Files.readAllBytes(Paths.get(documentsDir, fileName).toAbsolutePath());
        String myVar2 = fileName;
        UploadFileRequest uploadFileRequest = new UploadFileRequest(myVar1, myVar2, null);
        wordsApi.uploadFile(uploadFileRequest);

        // Calls AcceptAllRevisions method for document in cloud.
        String myVar3 = fileName;
        AcceptAllRevisionsRequest request = new AcceptAllRevisionsRequest(myVar3, null, null, null, null, null, null);
        wordsApi.acceptAllRevisions(request);
    }

    @Test
    public void testAcceptAllRevisionsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        String fileName = "test_doc.docx";

        // Calls AcceptAllRevisionsOnline method for document in cloud.
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, fileName).toAbsolutePath());
        AcceptAllRevisionsOnlineRequest request = new AcceptAllRevisionsOnlineRequest(requestDocument, null, null, null, null);
        AcceptAllRevisionsOnlineResponse acceptAllRevisionsOnlineResult = wordsApi.acceptAllRevisionsOnline(request);
        Files.write(Paths.get("test_result.docx"), acceptAllRevisionsOnlineResult.getDocument());
    }
}