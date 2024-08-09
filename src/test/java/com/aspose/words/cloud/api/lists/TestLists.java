/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestLists.java">
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

package com.aspose.words.cloud.api.lists;

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
 * Example of how to work with lists.
 */
public class TestLists  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Lists";
    private String localFile = "DocumentElements/Lists/ListsGet.doc";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting lists from document.
     */
    @Test
    public void testGetLists() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetLists.doc";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetListsRequest request = new GetListsRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        ListsResponse result = TestInitializer.wordsApi.getLists(request);
        assertNotNull(result);
        assertNotNull(result.getLists());
        assertNotNull(result.getLists().getListInfo());
        assertEquals(2, result.getLists().getListInfo().size());
        assertEquals(Integer.valueOf(1), result.getLists().getListInfo().get(0).getListId());
    }

    /*
     * Test for getting lists from document online.
     */
    @Test
    public void testGetListsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetListsOnlineRequest request = new GetListsOnlineRequest(
            requestDocument,
            null,
            null,
            null,
            null
        );

        ListsResponse result = TestInitializer.wordsApi.getListsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting list from document.
     */
    @Test
    public void testGetList() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetList.doc";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetListRequest request = new GetListRequest(
            remoteFileName,
            1,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        ListResponse result = TestInitializer.wordsApi.getList(request);
        assertNotNull(result);
        assertNotNull(result.getList());
        assertEquals(Integer.valueOf(1), result.getList().getListId());
    }

    /*
     * Test for getting list from document online.
     */
    @Test
    public void testGetListOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetListOnlineRequest request = new GetListOnlineRequest(
            requestDocument,
            1,
            null,
            null,
            null,
            null
        );

        ListResponse result = TestInitializer.wordsApi.getListOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating list from document.
     */
    @Test
    public void testUpdateList() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateList.doc";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ListUpdate requestListUpdate = new ListUpdate();
        requestListUpdate.setIsRestartAtEachSection(true);

        UpdateListRequest request = new UpdateListRequest(
            remoteFileName,
            1,
            requestListUpdate,
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

        ListResponse result = TestInitializer.wordsApi.updateList(request);
        assertNotNull(result);
    }

    /*
     * Test for updating list from document online.
     */
    @Test
    public void testUpdateListOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        ListUpdate requestListUpdate = new ListUpdate();
        requestListUpdate.setIsRestartAtEachSection(true);

        UpdateListOnlineRequest request = new UpdateListOnlineRequest(
            requestDocument,
            1,
            requestListUpdate,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        UpdateListOnlineResponse result = TestInitializer.wordsApi.updateListOnline(request);
        assertNotNull(result);
        assertNotNull(result.getModel().getList());
        assertEquals(Integer.valueOf(1), result.getModel().getList().getListId());
        assertEquals(Boolean.valueOf(true), result.getModel().getList().getIsRestartAtEachSection());
    }

    /*
     * Test for updating list level from document.
     */
    @Test
    public void testUpdateListLevel() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateListLevel.doc";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ListLevelUpdate requestListUpdate = new ListLevelUpdate();
        requestListUpdate.setAlignment(ListLevelUpdate.AlignmentEnum.RIGHT);

        UpdateListLevelRequest request = new UpdateListLevelRequest(
            remoteFileName,
            1,
            1,
            requestListUpdate,
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

        ListResponse result = TestInitializer.wordsApi.updateListLevel(request);
        assertNotNull(result);
    }

    /*
     * Test for updating list level from document online.
     */
    @Test
    public void testUpdateListLevelOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        ListLevelUpdate requestListUpdate = new ListLevelUpdate();
        requestListUpdate.setAlignment(ListLevelUpdate.AlignmentEnum.RIGHT);

        UpdateListLevelOnlineRequest request = new UpdateListLevelOnlineRequest(
            requestDocument,
            1,
            requestListUpdate,
            1,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        UpdateListLevelOnlineResponse result = TestInitializer.wordsApi.updateListLevelOnline(request);
        assertNotNull(result);
        assertNotNull(result.getModel().getList());
        assertNotNull(result.getModel().getList().getListLevels());
        assertNotNull(result.getModel().getList().getListLevels().getListLevel());
        assertEquals(9, result.getModel().getList().getListLevels().getListLevel().size());

    }

    /*
     * Test for inserting list from document.
     */
    @Test
    public void testInsertList() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertList.doc";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ListInsert requestListInsert = new ListInsert();
        requestListInsert.setTemplate(ListInsert.TemplateEnum.OUTLINELEGAL);

        InsertListRequest request = new InsertListRequest(
            remoteFileName,
            requestListInsert,
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

        ListResponse result = TestInitializer.wordsApi.insertList(request);
        assertNotNull(result);
        assertNotNull(result.getList());
        assertEquals(Integer.valueOf(3), result.getList().getListId());
    }

    /*
     * Test for inserting list from document online.
     */
    @Test
    public void testInsertListOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        ListInsert requestListInsert = new ListInsert();
        requestListInsert.setTemplate(ListInsert.TemplateEnum.OUTLINELEGAL);

        InsertListOnlineRequest request = new InsertListOnlineRequest(
            requestDocument,
            requestListInsert,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        InsertListOnlineResponse result = TestInitializer.wordsApi.insertListOnline(request);
        assertNotNull(result);
    }
}
