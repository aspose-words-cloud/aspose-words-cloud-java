/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestDrawingObjects.java">
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

package com.aspose.words.cloud.api.drawing;

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
 * Example of how to get drawing objects.
 */
public class TestDrawingObjects  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/DrawingObjectss";
    private String localFile = "Common/test_multi_pages.docx";
    private String localDrawingFile = "DocumentElements/DrawingObjects/sample_EmbeddedOLE.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting drawing objects from document.
     */
    @Test
    public void testGetDocumentDrawingObjects() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentDrawingObjects.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentDrawingObjectsRequest request = new GetDocumentDrawingObjectsRequest(
            remoteFileName,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        DrawingObjectsResponse result = TestInitializer.wordsApi.getDocumentDrawingObjects(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing objects from document without node path.
     */
    @Test
    public void testGetDocumentDrawingObjectsWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentDrawingObjectsWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentDrawingObjectsRequest request = new GetDocumentDrawingObjectsRequest(
            remoteFileName,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        DrawingObjectsResponse result = TestInitializer.wordsApi.getDocumentDrawingObjects(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object by specified index.
     */
    @Test
    public void testGetDocumentDrawingObjectByIndex() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentDrawingObjectByIndex.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentDrawingObjectByIndexRequest request = new GetDocumentDrawingObjectByIndexRequest(
            remoteFileName,
            0,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        DrawingObjectResponse result = TestInitializer.wordsApi.getDocumentDrawingObjectByIndex(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object by specified index without node path.
     */
    @Test
    public void testGetDocumentDrawingObjectByIndexWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentDrawingObjectByIndexWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentDrawingObjectByIndexRequest request = new GetDocumentDrawingObjectByIndexRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        DrawingObjectResponse result = TestInitializer.wordsApi.getDocumentDrawingObjectByIndex(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object by specified index and format.
     */
    @Test
    public void testRenderDrawingObject() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentDrawingObjectByIndexWithFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RenderDrawingObjectRequest request = new RenderDrawingObjectRequest(
            remoteFileName,
            "png",
            0,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.renderDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object by specified index and format without node path.
     */
    @Test
    public void testRenderDrawingObjectWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentDrawingObjectByIndexWithFormatWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RenderDrawingObjectRequest request = new RenderDrawingObjectRequest(
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

        File result = TestInitializer.wordsApi.renderDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for reading drawing object's image data.
     */
    @Test
    public void testGetDocumentDrawingObjectImageData() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentDrawingObjectImageData.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentDrawingObjectImageDataRequest request = new GetDocumentDrawingObjectImageDataRequest(
            remoteFileName,
            0,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.getDocumentDrawingObjectImageData(request);
        assertNotNull(result);
    }

    /*
     * Test for reading drawing object's image data without node path.
     */
    @Test
    public void testGetDocumentDrawingObjectImageDataWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentDrawingObjectImageDataWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentDrawingObjectImageDataRequest request = new GetDocumentDrawingObjectImageDataRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.getDocumentDrawingObjectImageData(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object OLE data.
     */
    @Test
    public void testGetDocumentDrawingObjectOleData() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentDrawingObjectOleData.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localDrawingFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentDrawingObjectOleDataRequest request = new GetDocumentDrawingObjectOleDataRequest(
            remoteFileName,
            0,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.getDocumentDrawingObjectOleData(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object OLE data without node path.
     */
    @Test
    public void testGetDocumentDrawingObjectOleDataWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestGetDocumentDrawingObjectOleDataWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localDrawingFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetDocumentDrawingObjectOleDataRequest request = new GetDocumentDrawingObjectOleDataRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.getDocumentDrawingObjectOleData(request);
        assertNotNull(result);
    }

    /*
     * Test for adding drawing object.
     */
    @Test
    public void testInsertDrawingObject() throws ApiException, IOException
    {
        String remoteFileName = "TestInsetDrawingObject.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DrawingObjectInsert requestDrawingObject = new DrawingObjectInsert();
        requestDrawingObject.setHeight((double)0);
        requestDrawingObject.setLeft((double)0);
        requestDrawingObject.setTop((double)0);
        requestDrawingObject.setWidth((double)0);
        requestDrawingObject.setRelativeHorizontalPosition(DrawingObjectInsert.RelativeHorizontalPositionEnum.MARGIN);
        requestDrawingObject.setRelativeVerticalPosition(DrawingObjectInsert.RelativeVerticalPositionEnum.MARGIN);
        requestDrawingObject.setWrapType(DrawingObjectInsert.WrapTypeEnum.INLINE);

        InsertDrawingObjectRequest request = new InsertDrawingObjectRequest(
            remoteFileName,
            requestDrawingObject,
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png").toAbsolutePath()),
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        DrawingObjectResponse result = TestInitializer.wordsApi.insertDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for adding drawing object without node path.
     */
    @Test
    public void testInsertDrawingObjectWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestInsetDrawingObjectWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DrawingObjectInsert requestDrawingObject = new DrawingObjectInsert();
        requestDrawingObject.setHeight((double)0);
        requestDrawingObject.setLeft((double)0);
        requestDrawingObject.setTop((double)0);
        requestDrawingObject.setWidth((double)0);
        requestDrawingObject.setRelativeHorizontalPosition(DrawingObjectInsert.RelativeHorizontalPositionEnum.MARGIN);
        requestDrawingObject.setRelativeVerticalPosition(DrawingObjectInsert.RelativeVerticalPositionEnum.MARGIN);
        requestDrawingObject.setWrapType(DrawingObjectInsert.WrapTypeEnum.INLINE);

        InsertDrawingObjectRequest request = new InsertDrawingObjectRequest(
            remoteFileName,
            requestDrawingObject,
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png").toAbsolutePath()),
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        DrawingObjectResponse result = TestInitializer.wordsApi.insertDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting drawing object.
     */
    @Test
    public void testDeleteDrawingObject() throws ApiException, IOException
    {
        String remoteFileName = "TestDeleteDrawingObject.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteDrawingObjectRequest request = new DeleteDrawingObjectRequest(
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

        TestInitializer.wordsApi.deleteDrawingObject(request);
    }

    /*
     * Test for deleting drawing object without node path.
     */
    @Test
    public void testDeleteDrawingObjectWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestDeleteDrawingObjectWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteDrawingObjectRequest request = new DeleteDrawingObjectRequest(
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

        TestInitializer.wordsApi.deleteDrawingObject(request);
    }

    /*
     * Test for updating drawing object.
     */
    @Test
    public void testUpdateDrawingObject() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateDrawingObject.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
        requestDrawingObject.setLeft((double)0);

        UpdateDrawingObjectRequest request = new UpdateDrawingObjectRequest(
            remoteFileName,
            requestDrawingObject,
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png").toAbsolutePath()),
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

        DrawingObjectResponse result = TestInitializer.wordsApi.updateDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for updating drawing object without node path.
     */
    @Test
    public void testUpdateDrawingObjectWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateDrawingObjectWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
        requestDrawingObject.setLeft((double)0);

        UpdateDrawingObjectRequest request = new UpdateDrawingObjectRequest(
            remoteFileName,
            requestDrawingObject,
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png").toAbsolutePath()),
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

        DrawingObjectResponse result = TestInitializer.wordsApi.updateDrawingObject(request);
        assertNotNull(result);
    }
}
