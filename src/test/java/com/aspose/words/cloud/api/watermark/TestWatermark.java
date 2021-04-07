/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestWatermark.java">
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

package com.aspose.words.cloud.api.watermark;

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
 * Example of how to work with watermarks.
 */
public class TestWatermark  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentActions/Watermark";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for adding watermark image.
     */
    @Test
    public void testInsertWatermarkImage() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertWatermarkImage.docx";
        String remoteImagePath = remoteDataFolder + "/TestInsertWatermarkImage.png";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );
        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png"),
            remoteImagePath
        );

        InsertWatermarkImageRequest request = new InsertWatermarkImageRequest(
            remoteFileName,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null,
            null,
            remoteImagePath
        );

        DocumentResponse result = TestInitializer.wordsApi.insertWatermarkImage(request);
        assertNotNull(result);
        assertNotNull(result.getDocument());
        assertEquals("TestInsertWatermarkImage.docx", result.getDocument().getFileName());
    }

    /*
     * Test for adding watermark image online.
     */
    @Test
    public void testInsertWatermarkImageOnline() throws ApiException, MessagingException, IOException
    {
        InsertWatermarkImageOnlineRequest request = new InsertWatermarkImageOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, "Common/aspose-cloud.png").toAbsolutePath()),
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        InsertWatermarkImageOnlineResponse result = TestInitializer.wordsApi.insertWatermarkImageOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for adding watermark text.
     */
    @Test
    public void testInsertWatermarkText() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertWatermarkText.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        WatermarkText requestWatermarkText = new WatermarkText();
        requestWatermarkText.setText("This is the text");
        requestWatermarkText.setRotationAngle((double)90.0);

        InsertWatermarkTextRequest request = new InsertWatermarkTextRequest(
            remoteFileName,
            requestWatermarkText,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.insertWatermarkText(request);
        assertNotNull(result);
        assertNotNull(result.getDocument());
        assertEquals("TestInsertWatermarkText.docx", result.getDocument().getFileName());
    }

    /*
     * Test for adding watermark text online.
     */
    @Test
    public void testInsertWatermarkTextOnline() throws ApiException, MessagingException, IOException
    {
        WatermarkText requestWatermarkText = new WatermarkText();
        requestWatermarkText.setText("This is the text");
        requestWatermarkText.setRotationAngle((double)90);

        InsertWatermarkTextOnlineRequest request = new InsertWatermarkTextOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            requestWatermarkText,
            null,
            null,
            null,
            null,
            null
        );

        InsertWatermarkTextOnlineResponse result = TestInitializer.wordsApi.insertWatermarkTextOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting watermark.
     */
    @Test
    public void testDeleteWatermark() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteWatermark.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteWatermarkRequest request = new DeleteWatermarkRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.deleteWatermark(request);
        assertNotNull(result);
        assertNotNull(result.getDocument());
        assertEquals("TestDeleteWatermark.docx", result.getDocument().getFileName());
    }

    /*
     * Test for deleting watermark online.
     */
    @Test
    public void testDeleteWatermarkOnline() throws ApiException, MessagingException, IOException
    {
        DeleteWatermarkOnlineRequest request = new DeleteWatermarkOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            null,
            null,
            null,
            null,
            null
        );

        DeleteWatermarkOnlineResponse result = TestInitializer.wordsApi.deleteWatermarkOnline(request);
        assertNotNull(result);
    }
}
