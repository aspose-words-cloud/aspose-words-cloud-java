/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestDrawingObjects.java">
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

package com.aspose.words.cloud.api.drawing;

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
    public void testGetDocumentDrawingObjects() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        DrawingObjectsResponse result = TestInitializer.wordsApi.getDocumentDrawingObjects(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing objects from document online.
     */
    @Test
    public void testGetDocumentDrawingObjectsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetDocumentDrawingObjectsOnlineRequest request = new GetDocumentDrawingObjectsOnlineRequest(
            requestDocument,
            "sections/0",
            null,
            null,
            null
        );

        DrawingObjectsResponse result = TestInitializer.wordsApi.getDocumentDrawingObjectsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing objects from document without node path.
     */
    @Test
    public void testGetDocumentDrawingObjectsWithoutNodePath() throws ApiException, MessagingException, IOException
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
    public void testGetDocumentDrawingObjectByIndex() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        DrawingObjectResponse result = TestInitializer.wordsApi.getDocumentDrawingObjectByIndex(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object by specified index online.
     */
    @Test
    public void testGetDocumentDrawingObjectByIndexOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetDocumentDrawingObjectByIndexOnlineRequest request = new GetDocumentDrawingObjectByIndexOnlineRequest(
            requestDocument,
            0,
            "sections/0",
            null,
            null,
            null
        );

        DrawingObjectResponse result = TestInitializer.wordsApi.getDocumentDrawingObjectByIndexOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object by specified index without node path.
     */
    @Test
    public void testGetDocumentDrawingObjectByIndexWithoutNodePath() throws ApiException, MessagingException, IOException
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
    public void testRenderDrawingObject() throws ApiException, MessagingException, IOException
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
            null,
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.renderDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object by specified index and format online.
     */
    @Test
    public void testRenderDrawingObjectOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        RenderDrawingObjectOnlineRequest request = new RenderDrawingObjectOnlineRequest(
            requestDocument,
            "png",
            0,
            "sections/0",
            null,
            null,
            null,
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.renderDrawingObjectOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object by specified index and format without node path.
     */
    @Test
    public void testRenderDrawingObjectWithoutNodePath() throws ApiException, MessagingException, IOException
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
            null,
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.renderDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for reading drawing object's image data.
     */
    @Test
    public void testGetDocumentDrawingObjectImageData() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.getDocumentDrawingObjectImageData(request);
        assertNotNull(result);
    }

    /*
     * Test for reading drawing object's image data online.
     */
    @Test
    public void testGetDocumentDrawingObjectImageDataOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetDocumentDrawingObjectImageDataOnlineRequest request = new GetDocumentDrawingObjectImageDataOnlineRequest(
            requestDocument,
            0,
            "sections/0",
            null,
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.getDocumentDrawingObjectImageDataOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for reading drawing object's image data without node path.
     */
    @Test
    public void testGetDocumentDrawingObjectImageDataWithoutNodePath() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.getDocumentDrawingObjectImageData(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object OLE data.
     */
    @Test
    public void testGetDocumentDrawingObjectOleData() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.getDocumentDrawingObjectOleData(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object OLE data online.
     */
    @Test
    public void testGetDocumentDrawingObjectOleDataOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localDrawingFile).toAbsolutePath());
        GetDocumentDrawingObjectOleDataOnlineRequest request = new GetDocumentDrawingObjectOleDataOnlineRequest(
            requestDocument,
            0,
            "sections/0",
            null,
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.getDocumentDrawingObjectOleDataOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting drawing object OLE data without node path.
     */
    @Test
    public void testGetDocumentDrawingObjectOleDataWithoutNodePath() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        byte[] result = TestInitializer.wordsApi.getDocumentDrawingObjectOleData(request);
        assertNotNull(result);
    }

    /*
     * Test for adding drawing object.
     */
    @Test
    public void testInsertDrawingObject() throws ApiException, MessagingException, IOException
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

        byte[] requestImageFile = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png").toAbsolutePath());
        InsertDrawingObjectRequest request = new InsertDrawingObjectRequest(
            remoteFileName,
            requestDrawingObject,
            requestImageFile,
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

        DrawingObjectResponse result = TestInitializer.wordsApi.insertDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for adding drawing object online.
     */
    @Test
    public void testInsertDrawingObjectOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DrawingObjectInsert requestDrawingObject = new DrawingObjectInsert();
        requestDrawingObject.setHeight((double)0);
        requestDrawingObject.setLeft((double)0);
        requestDrawingObject.setTop((double)0);
        requestDrawingObject.setWidth((double)0);
        requestDrawingObject.setRelativeHorizontalPosition(DrawingObjectInsert.RelativeHorizontalPositionEnum.MARGIN);
        requestDrawingObject.setRelativeVerticalPosition(DrawingObjectInsert.RelativeVerticalPositionEnum.MARGIN);
        requestDrawingObject.setWrapType(DrawingObjectInsert.WrapTypeEnum.INLINE);

        byte[] requestImageFile = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png").toAbsolutePath());
        InsertDrawingObjectOnlineRequest request = new InsertDrawingObjectOnlineRequest(
            requestDocument,
            requestDrawingObject,
            requestImageFile,
            "",
            null,
            null,
            null,
            null,
            null,
            null
        );

        InsertDrawingObjectOnlineResponse result = TestInitializer.wordsApi.insertDrawingObjectOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for adding drawing object without node path.
     */
    @Test
    public void testInsertDrawingObjectWithoutNodePath() throws ApiException, MessagingException, IOException
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

        byte[] requestImageFile = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png").toAbsolutePath());
        InsertDrawingObjectRequest request = new InsertDrawingObjectRequest(
            remoteFileName,
            requestDrawingObject,
            requestImageFile,
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

        DrawingObjectResponse result = TestInitializer.wordsApi.insertDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting drawing object.
     */
    @Test
    public void testDeleteDrawingObject() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        TestInitializer.wordsApi.deleteDrawingObject(request);
    }

    /*
     * Test for deleting drawing object online.
     */
    @Test
    public void testDeleteDrawingObjectOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteDrawingObjectOnlineRequest request = new DeleteDrawingObjectOnlineRequest(
            requestDocument,
            0,
            "",
            null,
            null,
            null,
            null,
            null,
            null
        );

        Map<String, byte[]> result = TestInitializer.wordsApi.deleteDrawingObjectOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting drawing object without node path.
     */
    @Test
    public void testDeleteDrawingObjectWithoutNodePath() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        TestInitializer.wordsApi.deleteDrawingObject(request);
    }

    /*
     * Test for updating drawing object.
     */
    @Test
    public void testUpdateDrawingObject() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateDrawingObject.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
        requestDrawingObject.setLeft((double)0);

        byte[] requestImageFile = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png").toAbsolutePath());
        UpdateDrawingObjectRequest request = new UpdateDrawingObjectRequest(
            remoteFileName,
            requestDrawingObject,
            requestImageFile,
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

        DrawingObjectResponse result = TestInitializer.wordsApi.updateDrawingObject(request);
        assertNotNull(result);
    }

    /*
     * Test for updating drawing object online.
     */
    @Test
    public void testUpdateDrawingObjectOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
        requestDrawingObject.setLeft((double)0);

        byte[] requestImageFile = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png").toAbsolutePath());
        UpdateDrawingObjectOnlineRequest request = new UpdateDrawingObjectOnlineRequest(
            requestDocument,
            requestDrawingObject,
            requestImageFile,
            0,
            "",
            null,
            null,
            null,
            null,
            null,
            null
        );

        UpdateDrawingObjectOnlineResponse result = TestInitializer.wordsApi.updateDrawingObjectOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating drawing object without node path.
     */
    @Test
    public void testUpdateDrawingObjectWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateDrawingObjectWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
        requestDrawingObject.setLeft((double)0);

        byte[] requestImageFile = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png").toAbsolutePath());
        UpdateDrawingObjectRequest request = new UpdateDrawingObjectRequest(
            remoteFileName,
            requestDrawingObject,
            requestImageFile,
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

        DrawingObjectResponse result = TestInitializer.wordsApi.updateDrawingObject(request);
        assertNotNull(result);
    }
}
