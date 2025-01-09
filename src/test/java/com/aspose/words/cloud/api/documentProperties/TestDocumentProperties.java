/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestDocumentProperties.java">
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

package com.aspose.words.cloud.api.documentProperties;

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
 * Example of how to get document properties.
 */
public class TestDocumentProperties  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/DocumentProperties";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting document properties.
     */
    @Test
    public void testGetDocumentProperties() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentProperties.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentPropertiesRequest request = new GetDocumentPropertiesRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        DocumentPropertiesResponse result = TestInitializer.wordsApi.getDocumentProperties(request);
        assertNotNull(result);
        assertNotNull(result.getDocumentProperties());
        assertNotNull(result.getDocumentProperties().getList());
        assertEquals(27, result.getDocumentProperties().getList().size());
        assertNotNull(result.getDocumentProperties().getList().get(0));
        assertEquals("Author", result.getDocumentProperties().getList().get(0).getName());
        assertEquals("", result.getDocumentProperties().getList().get(0).getValue());
    }

    /*
     * Test for getting document properties online.
     */
    @Test
    public void testGetDocumentPropertiesOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetDocumentPropertiesOnlineRequest request = new GetDocumentPropertiesOnlineRequest(
            requestDocument,
            null,
            null,
            null,
            null
        );

        DocumentPropertiesResponse result = TestInitializer.wordsApi.getDocumentPropertiesOnline(request);
        assertNotNull(result);
    }

    /*
     * A test for GetDocumentProperty.
     */
    @Test
    public void testGetDocumentProperty() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetDocumentProperty.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentPropertyRequest request = new GetDocumentPropertyRequest(
            remoteFileName,
            "Author",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        DocumentPropertyResponse result = TestInitializer.wordsApi.getDocumentProperty(request);
        assertNotNull(result);
        assertNotNull(result.getDocumentProperty());
        assertEquals("Author", result.getDocumentProperty().getName());
        assertEquals("", result.getDocumentProperty().getValue());
    }

    /*
     * A test for GetDocumentProperty online.
     */
    @Test
    public void testGetDocumentPropertyOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetDocumentPropertyOnlineRequest request = new GetDocumentPropertyOnlineRequest(
            requestDocument,
            "Author",
            null,
            null,
            null,
            null
        );

        DocumentPropertyResponse result = TestInitializer.wordsApi.getDocumentPropertyOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting document property.
     */
    @Test
    public void testDeleteDocumentProperty() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteDocumentProperty.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteDocumentPropertyRequest request = new DeleteDocumentPropertyRequest(
            remoteFileName,
            "testProp",
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

        TestInitializer.wordsApi.deleteDocumentProperty(request);
    }

    /*
     * Test for deleting document property online.
     */
    @Test
    public void testDeleteDocumentPropertyOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteDocumentPropertyOnlineRequest request = new DeleteDocumentPropertyOnlineRequest(
            requestDocument,
            "testProp",
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        Map<String, byte[]> result = TestInitializer.wordsApi.deleteDocumentPropertyOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating document property.
     */
    @Test
    public void testUpdateDocumentProperty() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateDocumentProperty.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DocumentPropertyCreateOrUpdate requestProperty = new DocumentPropertyCreateOrUpdate();
        requestProperty.setValue("Imran Anwar");

        CreateOrUpdateDocumentPropertyRequest request = new CreateOrUpdateDocumentPropertyRequest(
            remoteFileName,
            "AsposeAuthor",
            requestProperty,
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

        DocumentPropertyResponse result = TestInitializer.wordsApi.createOrUpdateDocumentProperty(request);
        assertNotNull(result);
        assertNotNull(result.getDocumentProperty());
        assertEquals("AsposeAuthor", result.getDocumentProperty().getName());
        assertEquals("Imran Anwar", result.getDocumentProperty().getValue());
    }

    /*
     * Test for updating document property online.
     */
    @Test
    public void testUpdateDocumentPropertyOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DocumentPropertyCreateOrUpdate requestProperty = new DocumentPropertyCreateOrUpdate();
        requestProperty.setValue("Imran Anwar");

        CreateOrUpdateDocumentPropertyOnlineRequest request = new CreateOrUpdateDocumentPropertyOnlineRequest(
            requestDocument,
            "AsposeAuthor",
            requestProperty,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        CreateOrUpdateDocumentPropertyOnlineResponse result = TestInitializer.wordsApi.createOrUpdateDocumentPropertyOnline(request);
        assertNotNull(result);
    }
}
