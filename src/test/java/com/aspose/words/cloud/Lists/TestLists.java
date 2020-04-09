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
package com.aspose.words.cloud.Lists;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class TestLists extends TestCase {
    private String testFolder = "Lists";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting lists from document
     */
    @Test
    public void testGetLists() throws ApiException, IOException {
        String fileName = "ListsGet.doc";
        String remoteName = "TestGetLists.doc";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetListsRequest request = new GetListsRequest(remoteName, null, null, null, null);

        ListsResponse result = TestInitializer.wordsApi.getLists(request);
        assertNotNull(result);
    }

    /*
     * Test for getting list from document lists
     */
    @Test
    public void testGetList() throws ApiException, IOException {
        String fileName = "ListsGet.doc";
        String remoteName = "TestGetList.doc";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetListRequest request = new GetListRequest(remoteName, 1, null, null, null, null);

        ListResponse result = TestInitializer.wordsApi.getList(request);
        assertNotNull(result);
    }

    /*
     * Test for updating list from document lists
     */
    @Test
    public void testUpdateList() throws ApiException, IOException {
        String fileName = "ListsGet.doc";
        String remoteName = "TestUpdateList.doc";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        ListUpdate data = new ListUpdate();
        data.setIsRestartAtEachSection(true);

        UpdateListRequest request = new UpdateListRequest(remoteName, data,1, null, null, null, null, null, null, null);

        ListResponse result = TestInitializer.wordsApi.updateList(request);
        assertNotNull(result);
    }

    /*
     * Test for updating list level from document lists
     */
    @Test
    public void testUpdateListLevel() throws ApiException, IOException {
        String fileName = "ListsGet.doc";
        String remoteName = "TestUpdateListLevel.doc";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        ListLevelUpdate data = new ListLevelUpdate();
        data.setAlignment(ListLevelUpdate.AlignmentEnum.RIGHT);

        UpdateListLevelRequest request = new UpdateListLevelRequest(remoteName, data,1, 1,null, null, null, null, null, null, null);

        ListResponse result = TestInitializer.wordsApi.updateListLevel(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting list from document lists
     */
    @Test
    public void testInsertList() throws ApiException, IOException {
        String fileName = "ListsGet.doc";
        String remoteName = "TestInsertList.doc";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        ListInsert data = new ListInsert();
        data.setTemplate(ListInsert.TemplateEnum.OUTLINELEGAL);

        InsertListRequest request = new InsertListRequest(remoteName, data, null, null, null, null, null, null, null);

        ListResponse result = TestInitializer.wordsApi.insertList(request);
        assertNotNull(result);
    }
}
