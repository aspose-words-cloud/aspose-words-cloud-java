/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestAppendDocument.java">
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
 * Example of how to append document.
 */
public class TestAppendDocument  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentActions/AppendDocument";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for appending document.
     */
    @Test
    public void testAppendDocument() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestAppendDocument.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        FileReference requestDocumentListDocumentEntries0FileReference = new FileReference(remoteDataFolder + "/" + remoteFileName);
        DocumentEntry requestDocumentListDocumentEntries0 = new DocumentEntry();
        requestDocumentListDocumentEntries0.setFileReference(requestDocumentListDocumentEntries0FileReference);
        requestDocumentListDocumentEntries0.setImportFormatMode(DocumentEntry.ImportFormatModeEnum.KEEPSOURCEFORMATTING);

        ArrayList<DocumentEntry> requestDocumentListDocumentEntries = new ArrayList<DocumentEntry>();
        requestDocumentListDocumentEntries.add(requestDocumentListDocumentEntries0);

        DocumentEntryList requestDocumentList = new DocumentEntryList();
        requestDocumentList.setDocumentEntries(requestDocumentListDocumentEntries);

        AppendDocumentRequest request = new AppendDocumentRequest(
            remoteFileName,
            requestDocumentList,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.appendDocument(request);
        assertNotNull(result);
        assertNotNull(result.getDocument());
        assertEquals("TestAppendDocument.docx", result.getDocument().getFileName());
    }

    /*
     * Test for appending document online.
     */
    @Test
    public void testAppendDocumentOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        byte[] requestDocumentListDocumentEntries0FileReferenceStream = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        FileReference requestDocumentListDocumentEntries0FileReference = new FileReference(requestDocumentListDocumentEntries0FileReferenceStream);
        DocumentEntry requestDocumentListDocumentEntries0 = new DocumentEntry();
        requestDocumentListDocumentEntries0.setFileReference(requestDocumentListDocumentEntries0FileReference);
        requestDocumentListDocumentEntries0.setImportFormatMode(DocumentEntry.ImportFormatModeEnum.KEEPSOURCEFORMATTING);

        ArrayList<DocumentEntry> requestDocumentListDocumentEntries = new ArrayList<DocumentEntry>();
        requestDocumentListDocumentEntries.add(requestDocumentListDocumentEntries0);

        DocumentEntryList requestDocumentList = new DocumentEntryList();
        requestDocumentList.setDocumentEntries(requestDocumentListDocumentEntries);

        AppendDocumentOnlineRequest request = new AppendDocumentOnlineRequest(
            requestDocument,
            requestDocumentList,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        AppendDocumentOnlineResponse result = TestInitializer.wordsApi.appendDocumentOnline(request);
        assertNotNull(result);
    }
}
