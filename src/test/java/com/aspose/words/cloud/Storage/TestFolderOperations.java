/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2019 Aspose.Words for Cloud
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
package com.aspose.words.cloud.Storage;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.FilesList;
import com.aspose.words.cloud.model.requests.CopyFolderRequest;
import com.aspose.words.cloud.model.requests.CreateFolderRequest;
import com.aspose.words.cloud.model.requests.DeleteFolderRequest;
import com.aspose.words.cloud.model.requests.GetFilesListRequest;
import com.aspose.words.cloud.model.requests.MoveFolderRequest;

import org.junit.Test;

import junit.framework.TestCase;

import java.io.IOException;
import java.util.UUID;

public class TestFolderOperations extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for createFolder
     */
    @Test
public void testCreateFolder() throws ApiException, IOException {
        String subFolder = "Temp/SdkTests/TestData/Storage";
        String guid = UUID.randomUUID().toString();
        String folderPath = subFolder + "/TestCreateFolder" + guid;

        CreateFolderRequest request = new CreateFolderRequest(folderPath, null);
        TestInitializer.wordsApi.createFolder(request);
    }

    /*
    * Test for deleteFolder
    */
    @Test
public void testDeleteFolder() throws ApiException, IOException {
        String subFolder = "Temp/SdkTests/TestData/Storage";
        String guid = UUID.randomUUID().toString();
        String folderPath = subFolder + "/TestDeleteFolder" + guid;

        CreateFolderRequest request = new CreateFolderRequest(folderPath, null);
        TestInitializer.wordsApi.createFolder(request);

        DeleteFolderRequest deleteRequest = new DeleteFolderRequest(folderPath, null, false);
        TestInitializer.wordsApi.deleteFolder(deleteRequest);
    }

    /*
    * Test for copyFolder
    */
    @Test
public void testCopyFolder() throws ApiException, IOException{
        String subFolder = "Temp/SdkTests/TestData/Storage";
        String guid = UUID.randomUUID().toString();
        String folderPathSrc = subFolder + "/TestCopyFolderSrc" + guid;
        String folderPathDst = subFolder + "/TestCopyFolderDst" + guid;

        CreateFolderRequest request = new CreateFolderRequest(folderPathSrc, null);
        TestInitializer.wordsApi.createFolder(request);

        CopyFolderRequest copyRequest = new CopyFolderRequest(folderPathDst, folderPathSrc, null, null);
        TestInitializer.wordsApi.copyFolder(copyRequest);
    }

    /*
    * Test for moveFolder
    */
    @Test
public void testMovefolder() throws ApiException, IOException{
        String subFolder = "Temp/SdkTests/TestData/Storage";
        String guid = UUID.randomUUID().toString();
        String folderPathSrc = subFolder + "/TestMoveFolderSrc" + guid;
        String folderPathDst = subFolder + "/TestMoveFolderDst" + guid;

        CreateFolderRequest request = new CreateFolderRequest(folderPathSrc, null);
        TestInitializer.wordsApi.createFolder(request);

        MoveFolderRequest moveRequest = new MoveFolderRequest(folderPathDst, folderPathSrc, null, null);
        TestInitializer.wordsApi.moveFolder(moveRequest);
    }

    /*
    * Test for getFilesList
    */
    @Test
public void testGetFilesList() throws ApiException, IOException {
        String subFolder = "Temp/SdkTests/TestData/Storage";
        GetFilesListRequest request = new GetFilesListRequest(subFolder, null);
        FilesList result = TestInitializer.wordsApi.getFilesList(request);
        assertTrue("Folder could not be empty", result.getValue().size() > 0);
    }
    
}
