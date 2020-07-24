/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestMathObject.java">
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

package com.aspose.words.cloud.api.mathObject;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

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
    public void testGetOfficeMathObjects() throws ApiException, IOException
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
            null
        );

        OfficeMathObjectsResponse result = TestInitializer.wordsApi.getOfficeMathObjects(request);
        assertNotNull(result);
    }

    /*
     * Test for getting mathObjects without node path.
     */
    @Test
    public void testGetOfficeMathObjectsWithoutNodePath() throws ApiException, IOException
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
            null
        );

        OfficeMathObjectsResponse result = TestInitializer.wordsApi.getOfficeMathObjects(request);
        assertNotNull(result);
    }

    /*
     * Test for getting mathObject.
     */
    @Test
    public void testGetOfficeMathObject() throws ApiException, IOException
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
            null
        );

        OfficeMathObjectResponse result = TestInitializer.wordsApi.getOfficeMathObject(request);
        assertNotNull(result);
    }

    /*
     * Test for getting mathObject without node path.
     */
    @Test
    public void testGetOfficeMathObjectWithoutNodePath() throws ApiException, IOException
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
            null
        );

        OfficeMathObjectResponse result = TestInitializer.wordsApi.getOfficeMathObject(request);
        assertNotNull(result);
    }

    /*
     * Test for rendering mathObject.
     */
    @Test
    public void testRenderMathObject() throws ApiException, IOException
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
            null
        );

        File result = TestInitializer.wordsApi.renderMathObject(request);
        assertNotNull(result);
    }

    /*
     * Test for rendering mathObject without node path.
     */
    @Test
    public void testRenderMathObjectWithoutNodePath() throws ApiException, IOException
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
            null
        );

        File result = TestInitializer.wordsApi.renderMathObject(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting mathObject.
     */
    @Test
    public void testDeleteOfficeMathObject() throws ApiException, IOException
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
            null
        );

        TestInitializer.wordsApi.deleteOfficeMathObject(request);
    }

    /*
     * Test for deleting mathObject without node path.
     */
    @Test
    public void testDeleteOfficeMathObjectWithoutNodePath() throws ApiException, IOException
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
            null
        );

        TestInitializer.wordsApi.deleteOfficeMathObject(request);
    }
}
