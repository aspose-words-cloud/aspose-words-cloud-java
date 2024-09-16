/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestStructuredDocumentTag.java">
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

package com.aspose.words.cloud.api.structuredDocumentTag;

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
 * Example of how to use structured document tags.
 */
public class TestStructuredDocumentTag  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/StructuredDocumentTag";
    private String localFile = "DocumentElements/StructuredDocumentTag/StructuredDocumentTag.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting SDT objects from document.
     */
    @Test
    public void testGetStructuredDocumentTags() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetStructuredDocumentTags.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetStructuredDocumentTagsRequest request = new GetStructuredDocumentTagsRequest(
            remoteFileName,
            "sections/0/body/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        StructuredDocumentTagsResponse result = TestInitializer.wordsApi.getStructuredDocumentTags(request);
        assertNotNull(result);
    }

    /*
     * Test for getting SDT objects from document online.
     */
    @Test
    public void testGetStructuredDocumentTagsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetStructuredDocumentTagsOnlineRequest request = new GetStructuredDocumentTagsOnlineRequest(
            requestDocument,
            "sections/0/body/paragraphs/0",
            null,
            null,
            null,
            null
        );

        StructuredDocumentTagsResponse result = TestInitializer.wordsApi.getStructuredDocumentTagsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting SDT object from document.
     */
    @Test
    public void testGetStructuredDocumentTag() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetStructuredDocumentTag.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetStructuredDocumentTagRequest request = new GetStructuredDocumentTagRequest(
            remoteFileName,
            0,
            "sections/0/body/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        StructuredDocumentTagResponse result = TestInitializer.wordsApi.getStructuredDocumentTag(request);
        assertNotNull(result);
    }

    /*
     * Test for getting SDT object from document online.
     */
    @Test
    public void testGetStructuredDocumentTagOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetStructuredDocumentTagOnlineRequest request = new GetStructuredDocumentTagOnlineRequest(
            requestDocument,
            0,
            "sections/0/body/paragraphs/0",
            null,
            null,
            null,
            null
        );

        StructuredDocumentTagResponse result = TestInitializer.wordsApi.getStructuredDocumentTagOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for adding SDT object.
     */
    @Test
    public void testInsertStructuredDocumentTag() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsetStructuredDocumentTag.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        StructuredDocumentTagInsert requestStructuredDocumentTag = new StructuredDocumentTagInsert();
        requestStructuredDocumentTag.setSdtType(StructuredDocumentTagInsert.SdtTypeEnum.COMBOBOX);
        requestStructuredDocumentTag.setLevel(StructuredDocumentTagInsert.LevelEnum.INLINE);

        InsertStructuredDocumentTagRequest request = new InsertStructuredDocumentTagRequest(
            remoteFileName,
            requestStructuredDocumentTag,
            "sections/0/body/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        StructuredDocumentTagResponse result = TestInitializer.wordsApi.insertStructuredDocumentTag(request);
        assertNotNull(result);
    }

    /*
     * Test for adding SDT object online.
     */
    @Test
    public void testInsertStructuredDocumentTagOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        StructuredDocumentTagInsert requestStructuredDocumentTag = new StructuredDocumentTagInsert();
        requestStructuredDocumentTag.setSdtType(StructuredDocumentTagInsert.SdtTypeEnum.COMBOBOX);
        requestStructuredDocumentTag.setLevel(StructuredDocumentTagInsert.LevelEnum.INLINE);

        InsertStructuredDocumentTagOnlineRequest request = new InsertStructuredDocumentTagOnlineRequest(
            requestDocument,
            requestStructuredDocumentTag,
            "sections/0/body/paragraphs/0",
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        InsertStructuredDocumentTagOnlineResponse result = TestInitializer.wordsApi.insertStructuredDocumentTagOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting SDT object.
     */
    @Test
    public void testDeleteStructuredDocumentTag() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteStructuredDocumentTag.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteStructuredDocumentTagRequest request = new DeleteStructuredDocumentTagRequest(
            remoteFileName,
            0,
            "sections/0/body/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteStructuredDocumentTag(request);
    }

    /*
     * Test for deleting SDT object online.
     */
    @Test
    public void testDeleteStructuredDocumentTagOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteStructuredDocumentTagOnlineRequest request = new DeleteStructuredDocumentTagOnlineRequest(
            requestDocument,
            0,
            "sections/0/body/paragraphs/0",
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        Map<String, byte[]> result = TestInitializer.wordsApi.deleteStructuredDocumentTagOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating SDT object.
     */
    @Test
    public void testUpdateStructuredDocumentTag() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateStructuredDocumentTag.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        StructuredDocumentTagListItem requestStructuredDocumentTagListItems0 = new StructuredDocumentTagListItem();
        requestStructuredDocumentTagListItems0.setDisplayText("Aspose Words");
        requestStructuredDocumentTagListItems0.setValue("1");

        StructuredDocumentTagListItem requestStructuredDocumentTagListItems1 = new StructuredDocumentTagListItem();
        requestStructuredDocumentTagListItems1.setDisplayText("Hello world");
        requestStructuredDocumentTagListItems1.setValue("2");

        ArrayList<StructuredDocumentTagListItem> requestStructuredDocumentTagListItems = new ArrayList<StructuredDocumentTagListItem>();
        requestStructuredDocumentTagListItems.add(requestStructuredDocumentTagListItems0);
        requestStructuredDocumentTagListItems.add(requestStructuredDocumentTagListItems1);

        StructuredDocumentTagUpdate requestStructuredDocumentTag = new StructuredDocumentTagUpdate();
        requestStructuredDocumentTag.setListItems(requestStructuredDocumentTagListItems);

        UpdateStructuredDocumentTagRequest request = new UpdateStructuredDocumentTagRequest(
            remoteFileName,
            0,
            requestStructuredDocumentTag,
            "sections/0/body/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        StructuredDocumentTagResponse result = TestInitializer.wordsApi.updateStructuredDocumentTag(request);
        assertNotNull(result);
    }

    /*
     * Test for updating SDT object online.
     */
    @Test
    public void testUpdateStructuredDocumentTagOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        StructuredDocumentTagListItem requestStructuredDocumentTagListItems0 = new StructuredDocumentTagListItem();
        requestStructuredDocumentTagListItems0.setDisplayText("Aspose Words");
        requestStructuredDocumentTagListItems0.setValue("1");

        StructuredDocumentTagListItem requestStructuredDocumentTagListItems1 = new StructuredDocumentTagListItem();
        requestStructuredDocumentTagListItems1.setDisplayText("Hello world");
        requestStructuredDocumentTagListItems1.setValue("2");

        ArrayList<StructuredDocumentTagListItem> requestStructuredDocumentTagListItems = new ArrayList<StructuredDocumentTagListItem>();
        requestStructuredDocumentTagListItems.add(requestStructuredDocumentTagListItems0);
        requestStructuredDocumentTagListItems.add(requestStructuredDocumentTagListItems1);

        StructuredDocumentTagUpdate requestStructuredDocumentTag = new StructuredDocumentTagUpdate();
        requestStructuredDocumentTag.setListItems(requestStructuredDocumentTagListItems);

        UpdateStructuredDocumentTagOnlineRequest request = new UpdateStructuredDocumentTagOnlineRequest(
            requestDocument,
            requestStructuredDocumentTag,
            0,
            "sections/0/body/paragraphs/0",
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        UpdateStructuredDocumentTagOnlineResponse result = TestInitializer.wordsApi.updateStructuredDocumentTagOnline(request);
        assertNotNull(result);
    }
}
