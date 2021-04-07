/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestFile.java">
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
import javax.mail.MessagingException;
import java.nio.file.*;
import java.util.ArrayList;

/*
 * Example of how to work with files.
 */
public class TestFile  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/Storage";
    private String localFile = "Common/test_multi_pages.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for uploading file.
     */
    @Test
    public void testUploadFile() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUploadFile.docx";

        UploadFileRequest request = new UploadFileRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            remoteDataFolder + "/" + remoteFileName,
            null
        );

        FilesUploadResult result = TestInitializer.wordsApi.uploadFile(request);
        assertNotNull(result);
        assertNotNull(result.getUploaded());
        assertEquals(1, result.getUploaded().size());
        assertEquals("TestUploadFile.docx", result.getUploaded().get(0));
    }

    /*
     * Test for copy file.
     */
    @Test
    public void testCopyFile() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestCopyFileSrc.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        CopyFileRequest request = new CopyFileRequest(
            remoteDataFolder + "/TestCopyFileDest.docx",
            remoteDataFolder + "/" + remoteFileName,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.copyFile(request);
    }

    /*
     * Test for move file.
     */
    @Test
    public void testMoveFile() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestMoveFileSrc.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        MoveFileRequest request = new MoveFileRequest(
            TestInitializer.RemoteTestOut + "/TestMoveFileDest_" + java.util.UUID.randomUUID().toString() + ".docx",
            remoteDataFolder + "/" + remoteFileName,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.moveFile(request);
    }

    /*
     * Test for delete file.
     */
    @Test
    public void testDeleteFile() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteFile.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFileRequest request = new DeleteFileRequest(
            remoteDataFolder + "/" + remoteFileName,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFile(request);
    }

    /*
     * Test for download file.
     */
    @Test
    public void testDownloadFile() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDownloadFile.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DownloadFileRequest request = new DownloadFileRequest(
            remoteDataFolder + "/" + remoteFileName,
            null,
            null
        );

        File result = TestInitializer.wordsApi.downloadFile(request);
        assertNotNull(result);
    }
}
