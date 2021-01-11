/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestFolder.java">
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

package com.aspose.words.cloud.api.storage;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

/*
 * Example of how to work with folders.
 */
public class TestFolder  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/Storage";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for create folder.
     */
    @Test
    public void testCreateFolder() throws ApiException, IOException
    {
        CreateFolderRequest request = new CreateFolderRequest(
            remoteDataFolder + "/TestCreateFolder",
            null
        );

        TestInitializer.wordsApi.createFolder(request);
    }

    /*
     * Test for delete folder.
     */
    @Test
    public void testDeleteFolder() throws ApiException, IOException
    {
        String testDeleteFolder = remoteDataFolder + "/TestDeleteFolder";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            testDeleteFolder + "/TestDeleteFolder.docx"
        );

        DeleteFolderRequest request = new DeleteFolderRequest(
            testDeleteFolder,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFolder(request);
    }

    /*
     * Test for get file list of folder.
     */
    @Test
    public void testGetFilesList() throws ApiException, IOException
    {
        GetFilesListRequest request = new GetFilesListRequest(
            remoteDataFolder,
            null
        );

        FilesList result = TestInitializer.wordsApi.getFilesList(request);
        assertNotNull(result);
        assertNotNull(result.getValue());
    }

    /*
     * Test for copy folder.
     */
    @Test
    public void testCopyFolder() throws ApiException, IOException
    {
        String folderToCopy = remoteDataFolder + "/TestCopyFolder";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            folderToCopy + "Src/TestCopyFolderSrc.docx"
        );

        CopyFolderRequest request = new CopyFolderRequest(
            folderToCopy + "Dest",
            folderToCopy + "Src",
            null,
            null
        );

        TestInitializer.wordsApi.copyFolder(request);
    }

    /*
     * Test for move folder.
     */
    @Test
    public void testMoveFolder() throws ApiException, IOException
    {
        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/TestMoveFolderSrc/TestMoveFolderSrc.docx"
        );

        MoveFolderRequest request = new MoveFolderRequest(
            TestInitializer.RemoteTestOut + "/TestMoveFolderDest_" + java.util.UUID.randomUUID().toString(),
            remoteDataFolder + "/TestMoveFolderSrc",
            null,
            null
        );

        TestInitializer.wordsApi.moveFolder(request);
    }
}
