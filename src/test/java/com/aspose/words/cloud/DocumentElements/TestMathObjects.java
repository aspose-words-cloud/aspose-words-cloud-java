/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Words for Cloud
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
package com.aspose.words.cloud.DocumentElements;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.OfficeMathObjectResponse;
import com.aspose.words.cloud.model.OfficeMathObjectsResponse;
import com.aspose.words.cloud.model.requests.*;
import org.junit.Test;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;

public class TestMathObjects extends TestCase {
    private String testFolder = "DocumentElements/MathObjects";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for removing math object from document
     */
    @Test
public void testDeleteOfficeMathObject() throws ApiException, FileNotFoundException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestDeleteOfficeMathObject.doc";
        Integer index = 0;
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteOfficeMathObjectRequest request = new DeleteOfficeMathObjectRequest(remoteName, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteOfficeMathObject(request);
    }

    /*
     * Test for removing math object from document without node path
     */
    @Test
public void testDeleteOfficeMathObjectWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestDeleteOfficeMathObjectWithoutNodePath.doc";
        Integer index = 0;
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteOfficeMathObjectWithoutNodePathRequest request = new DeleteOfficeMathObjectWithoutNodePathRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteOfficeMathObjectWithoutNodePath(request);
    }

    /*
     * Test for getting math object from document
     */
    @Test
public void testGetOfficeMathObject() throws ApiException, FileNotFoundException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestGetOfficeMathObject.doc";
        Integer index = 0;
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetOfficeMathObjectRequest request = new GetOfficeMathObjectRequest(remoteName, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        OfficeMathObjectResponse result = TestInitializer.wordsApi.getOfficeMathObject(request);
        assertNotNull(result);
    }

    /*
     * Test for getting math object from document without node path
     */
    @Test
public void testGetOfficeMathObjectWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestGetOfficeMathObjectWithoutNodePath.doc";
        Integer index = 0;
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetOfficeMathObjectWithoutNodePathRequest request = new GetOfficeMathObjectWithoutNodePathRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        OfficeMathObjectResponse result = TestInitializer.wordsApi.getOfficeMathObjectWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for getting math objects from document
     */
    @Test
public void testGetOfficeMathObjects() throws ApiException, FileNotFoundException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestGetOfficeMathObjects.doc";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetOfficeMathObjectsRequest request = new GetOfficeMathObjectsRequest(remoteName, "",
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        OfficeMathObjectsResponse result = TestInitializer.wordsApi.getOfficeMathObjects(request);
        assertNotNull(result);
    }

    /*
     * Test for getting math objects from document without node path
     */
    @Test
public void testGetOfficeMathObjectsWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestGetOfficeMathObjectsWithoutNodePath.doc";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetOfficeMathObjectsWithoutNodePathRequest request = new GetOfficeMathObjectsWithoutNodePathRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        OfficeMathObjectsResponse result = TestInitializer.wordsApi.getOfficeMathObjectsWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for getting math objects from document
     */
    @Test
public void testRenderMathObject() throws ApiException, FileNotFoundException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestRenderMathObject.doc";
        Integer index = 0;
        String format = "png";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        RenderMathObjectRequest request = new RenderMathObjectRequest(remoteName, format, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null);

        File result = TestInitializer.wordsApi.renderMathObject(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for getting math objects from document without node path
     */
    @Test
public void testRenderMathObjectWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "MathObjects.docx";
        String remoteName = "TestRenderMathObjectWithoutNodePath.doc";
        Integer index = 0;
        String format = "png";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        RenderMathObjectWithoutNodePathRequest request = new RenderMathObjectWithoutNodePathRequest(remoteName, format, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null);

        File result = TestInitializer.wordsApi.renderMathObjectWithoutNodePath(request);
        assertTrue(result.length() > 0);
    }
}
