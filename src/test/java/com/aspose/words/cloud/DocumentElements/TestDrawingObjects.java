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

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.DrawingObjectResponse;
import com.aspose.words.cloud.model.DrawingObjectsResponse;
import com.aspose.words.cloud.model.requests.DeleteDrawingObjectRequest;
import com.aspose.words.cloud.model.requests.DeleteDrawingObjectWithoutNodePathRequest;
import com.aspose.words.cloud.model.requests.GetDocumentDrawingObjectByIndexRequest;
import com.aspose.words.cloud.model.requests.GetDocumentDrawingObjectByIndexWithoutNodePathRequest;
import com.aspose.words.cloud.model.requests.GetDocumentDrawingObjectImageDataRequest;
import com.aspose.words.cloud.model.requests.GetDocumentDrawingObjectImageDataWithoutNodePathRequest;
import com.aspose.words.cloud.model.requests.GetDocumentDrawingObjectOleDataRequest;
import com.aspose.words.cloud.model.requests.GetDocumentDrawingObjectOleDataWithoutNodePathRequest;
import com.aspose.words.cloud.model.requests.GetDocumentDrawingObjectsRequest;
import com.aspose.words.cloud.model.requests.GetDocumentDrawingObjectsWithoutNodePathRequest;
import com.aspose.words.cloud.model.requests.InsertDrawingObjectRequest;
import com.aspose.words.cloud.model.requests.InsertDrawingObjectWithoutNodePathRequest;
import com.aspose.words.cloud.model.requests.RenderDrawingObjectRequest;
import com.aspose.words.cloud.model.requests.RenderDrawingObjectWithoutNodePathRequest;
import com.aspose.words.cloud.model.requests.UpdateDrawingObjectRequest;
import com.aspose.words.cloud.model.requests.UpdateDrawingObjectWithoutNodePathRequest;

import junit.framework.TestCase;

public class TestDrawingObjects extends TestCase {
    private String testFolder = "DocumentElements/DrawingObjects";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting drawing object
     */
    public void testGetDocumentDrawingObjectByIndex() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentDrawingObjectByIndex.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentDrawingObjectByIndexRequest request = new GetDocumentDrawingObjectByIndexRequest(remoteName,
                "sections/0", index, Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        DrawingObjectResponse result = TestInitializer.wordsApi.getDocumentDrawingObjectByIndex(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object without node path
     */
    public void testGetDocumentDrawingObjectByIndexWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentDrawingObjectByIndex.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentDrawingObjectByIndexWithoutNodePathRequest request = new GetDocumentDrawingObjectByIndexWithoutNodePathRequest(remoteName,
                index, Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        DrawingObjectResponse result = TestInitializer.wordsApi.getDocumentDrawingObjectByIndexWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object
     */
    public void testGetDocumentDrawingObjectImageData() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentDrawingObjectImageDataWithoutNodePath.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentDrawingObjectImageDataRequest request = new GetDocumentDrawingObjectImageDataRequest(remoteName,
                "sections/0", index, Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        File result = TestInitializer.wordsApi.getDocumentDrawingObjectImageData(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for getting drawing object without node path
     */
    public void testGetDocumentDrawingObjectImageDataWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentDrawingObjectImageDataWithoutNodePath.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentDrawingObjectImageDataWithoutNodePathRequest request = new GetDocumentDrawingObjectImageDataWithoutNodePathRequest(remoteName,
                index, Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        File result = TestInitializer.wordsApi.getDocumentDrawingObjectImageDataWithoutNodePath(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for getting drawing object
     */
    public void testGetDocumentDrawingObjectOleData() throws ApiException, FileNotFoundException {
        String fileName = "sample_EmbeddedOLE.docx";
        String remoteName = "TestGetDocumentDrawingObjectOleData.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentDrawingObjectOleDataRequest request = new GetDocumentDrawingObjectOleDataRequest(remoteName,
                "sections/0", index, Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        File result = TestInitializer.wordsApi.getDocumentDrawingObjectOleData(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for getting drawing object without node path
     */
    public void testGetDocumentDrawingObjectOleDataWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "sample_EmbeddedOLE.docx";
        String remoteName = "TestGetDocumentDrawingObjectOleDataWithoutNodePath.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentDrawingObjectOleDataWithoutNodePathRequest request = new GetDocumentDrawingObjectOleDataWithoutNodePathRequest(remoteName,
                index, Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        File result = TestInitializer.wordsApi.getDocumentDrawingObjectOleDataWithoutNodePath(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for getting drawing objects
     */
    public void testGetDocumentDrawingObjects() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentDrawingObjects.docx";

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentDrawingObjectsRequest request = new GetDocumentDrawingObjectsRequest(remoteName, "sections/0",
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null);

        DrawingObjectsResponse result = TestInitializer.wordsApi.getDocumentDrawingObjects(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing objects without node path
     */
    public void testGetDocumentDrawingObjectsWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentDrawingObjectsWithoutNodePath.docx";

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetDocumentDrawingObjectsWithoutNodePathRequest request = new GetDocumentDrawingObjectsWithoutNodePathRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null);

        DrawingObjectsResponse result = TestInitializer.wordsApi.getDocumentDrawingObjectsWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for updating drawing object
     */
    public void testUpdateDrawingObject() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostDrawingObject.docx";
        File data = Paths.get(TestInitializer.LocalCommonFolder, "aspose-cloud.png").toFile();
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateDrawingObjectRequest request = new UpdateDrawingObjectRequest(remoteName, "{\"Left\": 0}", data, "",
                index, Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null, null, null,
                null);

        DrawingObjectResponse result = TestInitializer.wordsApi.updateDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for updating drawing object without node path
     */
    public void testUpdateDrawingObjectWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostUpdateObjectWithoutNodePath.docx";
        File data = Paths.get(TestInitializer.LocalCommonFolder, "aspose-cloud.png").toFile();
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateDrawingObjectWithoutNodePathRequest request = new UpdateDrawingObjectWithoutNodePathRequest(remoteName, "{\"Left\": 0}", data,
                index, Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null, null, null,
                null);

        DrawingObjectResponse result = TestInitializer.wordsApi.updateDrawingObjectWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for adding drawing object
     */
    public void testInsertDrawingObject() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutDrawingObject.docx";
        File data = Paths.get(TestInitializer.LocalCommonFolder, "aspose-cloud.png").toFile();

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertDrawingObjectRequest request = new InsertDrawingObjectRequest(remoteName, "{\"Left\": 0}", data, "",
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null, null, null, null);

        DrawingObjectResponse result = TestInitializer.wordsApi.insertDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for adding drawing object without node path
     */
    public void testInsertDrawingObjectWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutDrawingObjectWithoutNodePath.docx";
        File data = Paths.get(TestInitializer.LocalCommonFolder, "aspose-cloud.png").toFile();

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertDrawingObjectWithoutNodePathRequest request = new InsertDrawingObjectWithoutNodePathRequest(remoteName, "{\"Left\": 0}", data,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null, null, null, null);

        DrawingObjectResponse result = TestInitializer.wordsApi.insertDrawingObjectWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for rendering drawing object
     */
    public void testRenderDrawingObject() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestRenderDrawingObject.docx";
        String format = "png";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        RenderDrawingObjectRequest request = new RenderDrawingObjectRequest(remoteName, format, "sections/0", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null, null);

        File result = TestInitializer.wordsApi.renderDrawingObject(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for rendering drawing object without node path
     */
    public void testRenderDrawingObjectWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestRenderDrawingObjectWithoutNodePath.docx";
        String format = "png";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        RenderDrawingObjectWithoutNodePathRequest request = new RenderDrawingObjectWithoutNodePathRequest(remoteName, format, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null, null);

        File result = TestInitializer.wordsApi.renderDrawingObjectWithoutNodePath(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for removing drawing object from document
     */
    public void testDeleteDrawingObject() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestDeleteDrawingObject.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteDrawingObjectRequest request = new DeleteDrawingObjectRequest(remoteName, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null, null, null, null);

        TestInitializer.wordsApi.deleteDrawingObject(request);
    }
    
    /*
     * Test for removing drawing object from document without node path
     */
    public void testDeleteDrawingObjectWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestDeleteDrawingObjectWithoutNodePath.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(),
                Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteDrawingObjectWithoutNodePathRequest request = new DeleteDrawingObjectWithoutNodePathRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null, null, null, null, null);

        TestInitializer.wordsApi.deleteDrawingObjectWithoutNodePath(request);
    }
}
