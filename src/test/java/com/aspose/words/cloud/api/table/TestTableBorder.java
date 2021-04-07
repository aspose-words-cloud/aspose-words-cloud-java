/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestTableBorder.java">
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

package com.aspose.words.cloud.api.table;

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
 * Example of how to work with table borders.
 */
public class TestTableBorder  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Tables";
    private String localFile = "DocumentElements/Tables/TablesGet.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting borders.
     */
    @Test
    public void testGetBorders() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetBorders.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetBordersRequest request = new GetBordersRequest(
            remoteFileName,
            "tables/1/rows/0/cells/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        BordersResponse result = TestInitializer.wordsApi.getBorders(request);
        assertNotNull(result);
        assertNotNull(result.getBorders());
        assertNotNull(result.getBorders().getList());
        assertEquals(6, result.getBorders().getList().size());
        assertNotNull(result.getBorders().getList().get(0).getColor());
        assertEquals("#000000", result.getBorders().getList().get(0).getColor().getWeb());
    }

    /*
     * Test for getting borders online.
     */
    @Test
    public void testGetBordersOnline() throws ApiException, MessagingException, IOException
    {
        GetBordersOnlineRequest request = new GetBordersOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "tables/1/rows/0/cells/0",
            null,
            null
        );

        BordersResponse result = TestInitializer.wordsApi.getBordersOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting border.
     */
    @Test
    public void testGetBorder() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetBorder.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetBorderRequest request = new GetBorderRequest(
            remoteFileName,
            "left",
            "tables/1/rows/0/cells/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        BorderResponse result = TestInitializer.wordsApi.getBorder(request);
        assertNotNull(result);
        assertNotNull(result.getBorder());
        assertNotNull(result.getBorder().getColor());
        assertEquals("#000000", result.getBorder().getColor().getWeb());
    }

    /*
     * Test for getting border online.
     */
    @Test
    public void testGetBorderOnline() throws ApiException, MessagingException, IOException
    {
        GetBorderOnlineRequest request = new GetBorderOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "left",
            "tables/1/rows/0/cells/0",
            null,
            null
        );

        BorderResponse result = TestInitializer.wordsApi.getBorderOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting borders.
     */
    @Test
    public void testDeleteBorders() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteBorders.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteBordersRequest request = new DeleteBordersRequest(
            remoteFileName,
            "tables/1/rows/0/cells/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        BordersResponse result = TestInitializer.wordsApi.deleteBorders(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting borders online.
     */
    @Test
    public void testDeleteBordersOnline() throws ApiException, MessagingException, IOException
    {
        DeleteBordersOnlineRequest request = new DeleteBordersOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "tables/1/rows/0/cells/0",
            null,
            null,
            null,
            null,
            null
        );

        DeleteBordersOnlineResponse result = TestInitializer.wordsApi.deleteBordersOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting border.
     */
    @Test
    public void testDeleteBorder() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteBorder.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteBorderRequest request = new DeleteBorderRequest(
            remoteFileName,
            "left",
            "tables/1/rows/0/cells/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        BorderResponse result = TestInitializer.wordsApi.deleteBorder(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting border online.
     */
    @Test
    public void testDeleteBorderOnline() throws ApiException, MessagingException, IOException
    {
        DeleteBorderOnlineRequest request = new DeleteBorderOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "left",
            "tables/1/rows/0/cells/0",
            null,
            null,
            null,
            null,
            null
        );

        DeleteBorderOnlineResponse result = TestInitializer.wordsApi.deleteBorderOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating border.
     */
    @Test
    public void testUpdateBorder() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateBorder.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        XmlColor requestBorderPropertiesColor = new XmlColor();
        requestBorderPropertiesColor.setWeb("#AABBCC");

        Border requestBorderProperties = new Border();
        requestBorderProperties.setBorderType(Border.BorderTypeEnum.LEFT);
        requestBorderProperties.setColor(requestBorderPropertiesColor);
        requestBorderProperties.setDistanceFromText((double)6.0);
        requestBorderProperties.setLineStyle(Border.LineStyleEnum.DASHDOTSTROKER);
        requestBorderProperties.setLineWidth((double)2.0);
        requestBorderProperties.setShadow(true);

        UpdateBorderRequest request = new UpdateBorderRequest(
            remoteFileName,
            "left",
            requestBorderProperties,
            "tables/1/rows/0/cells/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        BorderResponse result = TestInitializer.wordsApi.updateBorder(request);
        assertNotNull(result);
        assertNotNull(result.getBorder());
        assertNotNull(result.getBorder().getColor());
        assertEquals("#AABBCC", result.getBorder().getColor().getWeb());
        assertEquals(6.0, result.getBorder().getDistanceFromText());
        assertEquals(2.0, result.getBorder().getLineWidth());
        assertEquals(Boolean.valueOf(true), result.getBorder().getShadow());
    }

    /*
     * Test for updating border online.
     */
    @Test
    public void testUpdateBorderOnline() throws ApiException, MessagingException, IOException
    {
        XmlColor requestBorderPropertiesColor = new XmlColor();
        requestBorderPropertiesColor.setWeb("#AABBCC");

        Border requestBorderProperties = new Border();
        requestBorderProperties.setBorderType(Border.BorderTypeEnum.LEFT);
        requestBorderProperties.setColor(requestBorderPropertiesColor);
        requestBorderProperties.setDistanceFromText((double)6);
        requestBorderProperties.setLineStyle(Border.LineStyleEnum.DASHDOTSTROKER);
        requestBorderProperties.setLineWidth((double)2);
        requestBorderProperties.setShadow(true);

        UpdateBorderOnlineRequest request = new UpdateBorderOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            requestBorderProperties,
            "left",
            "tables/1/rows/0/cells/0",
            null,
            null,
            null,
            null,
            null
        );

        UpdateBorderOnlineResponse result = TestInitializer.wordsApi.updateBorderOnline(request);
        assertNotNull(result);
    }
}
