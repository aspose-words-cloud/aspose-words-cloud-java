/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestRange.java">
 *   Copyright (c) 2023 Aspose.Words for Cloud
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

package com.aspose.words.cloud.api.range;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.IOException;
import javax.mail.MessagingException;
import java.nio.file.*;
import java.util.*;

/*
 * Example of how to work with ranges.
 */
public class TestRange  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Range";
    private String localFile = "DocumentElements/Range/RangeGet.doc";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting the text from range.
     */
    @Test
    public void testGetRangeText() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetRangeText.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetRangeTextRequest request = new GetRangeTextRequest(
            remoteFileName,
            "id0.0.0",
            "id0.0.1",
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        RangeTextResponse result = TestInitializer.wordsApi.getRangeText(request);
        assertNotNull(result);
        assertEquals("This is HEADER ", result.getText());
    }

    /*
     * Test for getting the text from range online.
     */
    @Test
    public void testGetRangeTextOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetRangeTextOnlineRequest request = new GetRangeTextOnlineRequest(
            requestDocument,
            "id0.0.0",
            "id0.0.1",
            null,
            null,
            null
        );

        RangeTextResponse result = TestInitializer.wordsApi.getRangeTextOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for removing the text for range.
     */
    @Test
    public void testRemoveRange() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestRemoveRange.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RemoveRangeRequest request = new RemoveRangeRequest(
            remoteFileName,
            "id0.0.0",
            "id0.0.1",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.removeRange(request);
        assertNotNull(result);
    }

    /*
     * Test for removing the text for range online.
     */
    @Test
    public void testRemoveRangeOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        RemoveRangeOnlineRequest request = new RemoveRangeOnlineRequest(
            requestDocument,
            "id0.0.0",
            "id0.0.1",
            null,
            null,
            null,
            null
        );

        RemoveRangeOnlineResponse result = TestInitializer.wordsApi.removeRangeOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for saving a range as a new document.
     */
    @Test
    public void testSaveAsRange() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestSaveAsRange.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RangeDocument requestDocumentParameters = new RangeDocument();
        requestDocumentParameters.setDocumentName(remoteDataFolder + "/NewDoc.docx");

        SaveAsRangeRequest request = new SaveAsRangeRequest(
            remoteFileName,
            "id0.0.0",
            requestDocumentParameters,
            "id0.0.1",
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.saveAsRange(request);
        assertNotNull(result);
        assertNotNull(result.getDocument());
        assertEquals("NewDoc.docx", result.getDocument().getFileName());
    }

    /*
     * Test for saving a range as a new document online.
     */
    @Test
    public void testSaveAsRangeOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        RangeDocument requestDocumentParameters = new RangeDocument();
        requestDocumentParameters.setDocumentName(remoteDataFolder + "/NewDoc.docx");

        SaveAsRangeOnlineRequest request = new SaveAsRangeOnlineRequest(
            requestDocument,
            "id0.0.0",
            requestDocumentParameters,
            "id0.0.1",
            null,
            null,
            null
        );

        SaveAsRangeOnlineResponse result = TestInitializer.wordsApi.saveAsRangeOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for replacing text in range.
     */
    @Test
    public void testReplaceWithText() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestReplaceWithText.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ReplaceRange requestRangeText = new ReplaceRange();
        requestRangeText.setText("Replaced header");

        ReplaceWithTextRequest request = new ReplaceWithTextRequest(
            remoteFileName,
            "id0.0.0",
            requestRangeText,
            "id0.0.1",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.replaceWithText(request);
        assertNotNull(result);
        assertNotNull(result.getDocument());
        assertEquals("TestReplaceWithText.docx", result.getDocument().getFileName());
    }

    /*
     * Test for replacing text in range online.
     */
    @Test
    public void testReplaceWithTextOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        ReplaceRange requestRangeText = new ReplaceRange();
        requestRangeText.setText("Replaced header");

        ReplaceWithTextOnlineRequest request = new ReplaceWithTextOnlineRequest(
            requestDocument,
            "id0.0.0",
            requestRangeText,
            "id0.0.1",
            null,
            null,
            null,
            null
        );

        ReplaceWithTextOnlineResponse result = TestInitializer.wordsApi.replaceWithTextOnline(request);
        assertNotNull(result);
    }
}
