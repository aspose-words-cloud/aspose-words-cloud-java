/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestLists.java">
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

package com.aspose.words.cloud.api.lists;

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
    public void testGetLists() throws ApiException, IOException
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
            null
        );

        ListsResponse result = TestInitializer.wordsApi.getLists(request);
        assertNotNull(result);
    }

    /*
     * Test for getting list from document.
     */
    @Test
    public void testGetList() throws ApiException, IOException
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
            null
        );

        ListResponse result = TestInitializer.wordsApi.getList(request);
        assertNotNull(result);
    }

    /*
     * Test for updating list from document.
     */
    @Test
    public void testUpdateList() throws ApiException, IOException
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
            requestListUpdate,
            1,
            remoteDataFolder,
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
     * Test for updating list level from document.
     */
    @Test
    public void testUpdateListLevel() throws ApiException, IOException
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
            requestListUpdate,
            1,
            1,
            remoteDataFolder,
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
     * Test for inserting list from document.
     */
    @Test
    public void testInsertList() throws ApiException, IOException
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
            null
        );

        ListResponse result = TestInitializer.wordsApi.insertList(request);
        assertNotNull(result);
    }
}
