/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestCustomXmlParts.java">
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
import javax.mail.MessagingException;
import java.nio.file.*;
import java.util.ArrayList;

/*
 * Example of how to use custom xml parts in documents.
 */
public class TestCustomXmlParts  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/CustomXmlParts";
    private String localFile = "DocumentElements/CustomXmlParts/MultipleCustomXmlParts.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting custom xml part by specified index.
     */
    @Test
    public void testGetCustomXmlPart() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetCustomXmlPart.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetCustomXmlPartRequest request = new GetCustomXmlPartRequest(
            remoteFileName,
            0,
            remoteDataFolder,
            null,
            null,
            null
        );

        CustomXmlPartResponse result = TestInitializer.wordsApi.getCustomXmlPart(request);
        assertNotNull(result);
        assertNotNull(result.getCustomXmlPart());
        assertEquals("aspose", result.getCustomXmlPart().getId());
        assertEquals("<Metadata><Author>author1</Author><Initial>initial</Initial><DateTime>2015-01-22T00:00:00</DateTime><Text>text</Text></Metadata>", result.getCustomXmlPart().getData());
    }

    /*
     * Test for getting custom xml part by specified index online.
     */
    @Test
    public void testGetCustomXmlPartOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetCustomXmlPartOnlineRequest request = new GetCustomXmlPartOnlineRequest(
            requestDocument,
            0,
            null,
            null
        );

        CustomXmlPartResponse result = TestInitializer.wordsApi.getCustomXmlPartOnline(request);
        assertNotNull(result);
        assertNotNull(result.getCustomXmlPart());
        assertEquals("aspose", result.getCustomXmlPart().getId());
        assertEquals("<Metadata><Author>author1</Author><Initial>initial</Initial><DateTime>2015-01-22T00:00:00</DateTime><Text>text</Text></Metadata>", result.getCustomXmlPart().getData());
    }

    /*
     * Test for getting all custom xml parts from document.
     */
    @Test
    public void testGetCustomXmlParts() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetCustomXmlParts.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetCustomXmlPartsRequest request = new GetCustomXmlPartsRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null
        );

        CustomXmlPartsResponse result = TestInitializer.wordsApi.getCustomXmlParts(request);
        assertNotNull(result);
        assertNotNull(result.getCustomXmlParts());
        assertNotNull(result.getCustomXmlParts().getCustomXmlPartsList());
        assertEquals(2, result.getCustomXmlParts().getCustomXmlPartsList().size());
        assertEquals("aspose", result.getCustomXmlParts().getCustomXmlPartsList().get(0).getId());
        assertEquals("<Metadata><Author>author1</Author><Initial>initial</Initial><DateTime>2015-01-22T00:00:00</DateTime><Text>text</Text></Metadata>", result.getCustomXmlParts().getCustomXmlPartsList().get(0).getData());
    }

    /*
     * Test for getting all custom xml parts from document online.
     */
    @Test
    public void testGetCustomXmlPartsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetCustomXmlPartsOnlineRequest request = new GetCustomXmlPartsOnlineRequest(
            requestDocument,
            null,
            null
        );

        CustomXmlPartsResponse result = TestInitializer.wordsApi.getCustomXmlPartsOnline(request);
        assertNotNull(result);
        assertNotNull(result.getCustomXmlParts());
        assertNotNull(result.getCustomXmlParts().getCustomXmlPartsList());
        assertEquals(2, result.getCustomXmlParts().getCustomXmlPartsList().size());
        assertEquals("aspose", result.getCustomXmlParts().getCustomXmlPartsList().get(0).getId());
        assertEquals("<Metadata><Author>author1</Author><Initial>initial</Initial><DateTime>2015-01-22T00:00:00</DateTime><Text>text</Text></Metadata>", result.getCustomXmlParts().getCustomXmlPartsList().get(0).getData());
    }

    /*
     * Test for adding custom xml part.
     */
    @Test
    public void testInsertCustomXmlPart() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertCustomXmlPart.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        InsertCustomXmlPartRequest request = new InsertCustomXmlPartRequest(
            remoteFileName,
            requestCustomXmlPart,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        CustomXmlPartResponse result = TestInitializer.wordsApi.insertCustomXmlPart(request);
        assertNotNull(result);
        assertNotNull(result.getCustomXmlPart());
        assertEquals("hello", result.getCustomXmlPart().getId());
        assertEquals("<data>Hello world</data>", result.getCustomXmlPart().getData());
    }

    /*
     * Test for adding custom xml part online.
     */
    @Test
    public void testInsertCustomXmlPartOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());

        InsertCustomXmlPartOnlineRequest request = new InsertCustomXmlPartOnlineRequest(
            requestDocument,
            requestCustomXmlPart,
            null,
            null,
            null,
            null,
            null
        );

        InsertCustomXmlPartOnlineResponse result = TestInitializer.wordsApi.insertCustomXmlPartOnline(request);
        assertNotNull(result);
        assertNotNull(result.getModel().getCustomXmlPart());
        assertEquals("hello", result.getModel().getCustomXmlPart().getId());
        assertEquals("<data>Hello world</data>", result.getModel().getCustomXmlPart().getData());
    }

    /*
     * Test for updating custom xml part.
     */
    @Test
    public void testUpdateCustomXmlPart() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateCustomXmlPart.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        UpdateCustomXmlPartRequest request = new UpdateCustomXmlPartRequest(
            remoteFileName,
            0,
            requestCustomXmlPart,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        CustomXmlPartResponse result = TestInitializer.wordsApi.updateCustomXmlPart(request);
        assertNotNull(result);
        assertNotNull(result.getCustomXmlPart());
        assertEquals("aspose", result.getCustomXmlPart().getId());
        assertEquals("<data>Hello world</data>", result.getCustomXmlPart().getData());
    }

    /*
     * Test for updating custom xml part online.
     */
    @Test
    public void testUpdateCustomXmlPartOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());

        UpdateCustomXmlPartOnlineRequest request = new UpdateCustomXmlPartOnlineRequest(
            requestDocument,
            0,
            requestCustomXmlPart,
            null,
            null,
            null,
            null,
            null
        );

        UpdateCustomXmlPartOnlineResponse result = TestInitializer.wordsApi.updateCustomXmlPartOnline(request);
        assertNotNull(result);
        assertNotNull(result.getModel().getCustomXmlPart());
        assertEquals("aspose", result.getModel().getCustomXmlPart().getId());
        assertEquals("<data>Hello world</data>", result.getModel().getCustomXmlPart().getData());
    }

    /*
     * A test for DeleteCustomXmlPart.
     */
    @Test
    public void testDeleteCustomXmlPart() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteCustomXmlPart.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteCustomXmlPartRequest request = new DeleteCustomXmlPartRequest(
            remoteFileName,
            0,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        TestInitializer.wordsApi.deleteCustomXmlPart(request);
    }

    /*
     * A test for DeleteCustomXmlPart online.
     */
    @Test
    public void testDeleteCustomXmlPartOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteCustomXmlPartOnlineRequest request = new DeleteCustomXmlPartOnlineRequest(
            requestDocument,
            0,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.deleteCustomXmlPartOnline(request);
        assertNotNull(result);
    }

    /*
     * A test for DeleteCustomXmlParts.
     */
    @Test
    public void testDeleteCustomXmlParts() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteCustomXmlPart.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteCustomXmlPartsRequest request = new DeleteCustomXmlPartsRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        TestInitializer.wordsApi.deleteCustomXmlParts(request);
    }

    /*
     * A test for DeleteCustomXmlParts online.
     */
    @Test
    public void testDeleteCustomXmlPartsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteCustomXmlPartsOnlineRequest request = new DeleteCustomXmlPartsOnlineRequest(
            requestDocument,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.deleteCustomXmlPartsOnline(request);
        assertNotNull(result);
    }
}
