/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestMathObject.java">
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

package com.aspose.words.cloud.api.mathObject;

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
 * Example of how to work with MathObjects.
 */
public class TestMathObject  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/MathObjects";
    private String localFile = "DocumentElements/MathObjects/MathObjects.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting mathObjects.
     */
    @Test
    public void testGetOfficeMathObjects() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetOfficeMathObjects.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetOfficeMathObjectsRequest request = new GetOfficeMathObjectsRequest(
            remoteFileName,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        OfficeMathObjectsResponse result = TestInitializer.wordsApi.getOfficeMathObjects(request);
        assertNotNull(result);
        assertNotNull(result.getOfficeMathObjects());
        assertNotNull(result.getOfficeMathObjects().getList());
        assertEquals(16, result.getOfficeMathObjects().getList().size());
        assertEquals("0.0.0.0", result.getOfficeMathObjects().getList().get(0).getNodeId());
    }

    /*
     * Test for getting mathObjects online.
     */
    @Test
    public void testGetOfficeMathObjectsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetOfficeMathObjectsOnlineRequest request = new GetOfficeMathObjectsOnlineRequest(
            requestDocument,
            "",
            null,
            null,
            null,
            null
        );

        OfficeMathObjectsResponse result = TestInitializer.wordsApi.getOfficeMathObjectsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting mathObjects without node path.
     */
    @Test
    public void testGetOfficeMathObjectsWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetOfficeMathObjectsWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetOfficeMathObjectsRequest request = new GetOfficeMathObjectsRequest(
            remoteFileName,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        OfficeMathObjectsResponse result = TestInitializer.wordsApi.getOfficeMathObjects(request);
        assertNotNull(result);
        assertNotNull(result.getOfficeMathObjects());
        assertNotNull(result.getOfficeMathObjects().getList());
        assertEquals(16, result.getOfficeMathObjects().getList().size());
        assertEquals("0.0.0.0", result.getOfficeMathObjects().getList().get(0).getNodeId());
    }

    /*
     * Test for getting mathObject.
     */
    @Test
    public void testGetOfficeMathObject() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetOfficeMathObject.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetOfficeMathObjectRequest request = new GetOfficeMathObjectRequest(
            remoteFileName,
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        OfficeMathObjectResponse result = TestInitializer.wordsApi.getOfficeMathObject(request);
        assertNotNull(result);
        assertNotNull(result.getOfficeMathObject());
        assertEquals("0.0.0.0", result.getOfficeMathObject().getNodeId());
    }

    /*
     * Test for getting mathObject online.
     */
    @Test
    public void testGetOfficeMathObjectOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetOfficeMathObjectOnlineRequest request = new GetOfficeMathObjectOnlineRequest(
            requestDocument,
            0,
            "",
            null,
            null,
            null,
            null
        );

        OfficeMathObjectResponse result = TestInitializer.wordsApi.getOfficeMathObjectOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting mathObject without node path.
     */
    @Test
    public void testGetOfficeMathObjectWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetOfficeMathObjectWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetOfficeMathObjectRequest request = new GetOfficeMathObjectRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        OfficeMathObjectResponse result = TestInitializer.wordsApi.getOfficeMathObject(request);
        assertNotNull(result);
        assertNotNull(result.getOfficeMathObject());
        assertEquals("0.0.0.0", result.getOfficeMathObject().getNodeId());
    }

    /*
     * Test for rendering mathObject.
     */
    @Test
    public void testRenderMathObject() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestRenderMathObject.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RenderMathObjectRequest request = new RenderMathObjectRequest(
            remoteFileName,
            "png",
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.renderMathObject(request);
        assertNotNull(result);
    }

    /*
     * Test for rendering mathObject.
     */
    @Test
    public void testRenderMathObjectOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        RenderMathObjectOnlineRequest request = new RenderMathObjectOnlineRequest(
            requestDocument,
            "png",
            0,
            "",
            null,
            null,
            null,
            null,
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.renderMathObjectOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for rendering mathObject without node path.
     */
    @Test
    public void testRenderMathObjectWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestRenderMathObjectWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RenderMathObjectRequest request = new RenderMathObjectRequest(
            remoteFileName,
            "png",
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.renderMathObject(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting mathObject.
     */
    @Test
    public void testDeleteOfficeMathObject() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteOfficeMathObject.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteOfficeMathObjectRequest request = new DeleteOfficeMathObjectRequest(
            remoteFileName,
            0,
            "",
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

        TestInitializer.wordsApi.deleteOfficeMathObject(request);
    }

    /*
     * Test for deleting mathObject online.
     */
    @Test
    public void testDeleteOfficeMathObjectOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteOfficeMathObjectOnlineRequest request = new DeleteOfficeMathObjectOnlineRequest(
            requestDocument,
            0,
            "",
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        Map<String, byte[]> result = TestInitializer.wordsApi.deleteOfficeMathObjectOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting mathObject without node path.
     */
    @Test
    public void testDeleteOfficeMathObjectWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteOfficeMathObjectWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteOfficeMathObjectRequest request = new DeleteOfficeMathObjectRequest(
            remoteFileName,
            0,
            null,
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

        TestInitializer.wordsApi.deleteOfficeMathObject(request);
    }

    /*
     * Test for deleting math objects.
     */
    @Test
    public void testDeleteOfficeMathObjects() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteOfficeMathObject.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteOfficeMathObjectsRequest request = new DeleteOfficeMathObjectsRequest(
            remoteFileName,
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

        TestInitializer.wordsApi.deleteOfficeMathObjects(request);
    }

    /*
     * Test for deleting math objects online.
     */
    @Test
    public void testDeleteOfficeMathObjectsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteOfficeMathObjectsOnlineRequest request = new DeleteOfficeMathObjectsOnlineRequest(
            requestDocument,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        Map<String, byte[]> result = TestInitializer.wordsApi.deleteOfficeMathObjectsOnline(request);
        assertNotNull(result);
    }
}
