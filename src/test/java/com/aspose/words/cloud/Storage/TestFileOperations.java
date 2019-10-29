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
import com.aspose.words.cloud.model.FilesUploadResult;
import com.aspose.words.cloud.model.requests.CopyFileRequest;
import com.aspose.words.cloud.model.requests.DeleteFileRequest;
import com.aspose.words.cloud.model.requests.DownloadFileRequest;
import com.aspose.words.cloud.model.requests.MoveFileRequest;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.UUID;

public class TestFileOperations extends TestCase {
    private String testFolder = "file";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for uploading document
     */
    public void testUploadFile() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestUploadFile.docx";

        FilesUploadResult result = TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        
        assertNotNull(result);
        assertTrue("File is not uploaded", result.getUploaded().size() == 1);
    }

    /*
    * Test for file deletion
    */
    public void testDeleteFile() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestDeleteFile.docx";

        String remotePath = Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/");

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), remotePath);

        DeleteFileRequest request = new DeleteFileRequest(remotePath,null, null);
        TestInitializer.wordsApi.deleteFile(request);
    }

    /*
    * Test for file copy
    */
    public void testCopyFile() throws ApiException, FileNotFoundException {
        String guid = UUID.randomUUID().toString();
        String fileName = "test_multi_pages.docx";
        String remoteNameSrc = String.format("TestDeleteFileSrc%s.docx", guid);
        String remoteNameDst = String.format("TestDeleteFileDst%s.docx", guid);

        String remotePathSrc = Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteNameSrc).toString().replace("\\", "/");
        String remotePathDst = Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteNameDst).toString().replace("\\", "/");

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), remotePathSrc);
        
        CopyFileRequest request = new CopyFileRequest(remotePathDst, remotePathSrc, null, null, null);
        TestInitializer.wordsApi.copyFile(request);
    }

    /*
    *
    */
    public void testMoveFile() throws ApiException, FileNotFoundException {
        String guid = UUID.randomUUID().toString();
        String fileName = "test_multi_pages.docx";
        String remoteNameSrc = String.format("TestDeleteFileSrc%s.docx", guid);
        String remoteNameDst = String.format("TestDeleteFileDst%s.docx", guid);

        String remotePathSrc = Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteNameSrc).toString().replace("\\", "/");
        String remotePathDst = Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteNameDst).toString().replace("\\", "/");

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), remotePathSrc);
        
        MoveFileRequest request = new MoveFileRequest(remotePathDst, remotePathSrc, null, null, null);
        TestInitializer.wordsApi.moveFile(request);
    }

    /*
    * Test for download file
    */
    public void testDownloadFile() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestDeleteFileSrc%s.docx";

        String remotePath = Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/");

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), remotePath);
        
        DownloadFileRequest request = new DownloadFileRequest(remotePath, null, null);
        File response = TestInitializer.wordsApi.downloadFile(request);
        assertTrue("File should not be empty", response.length() > 0);
    }
    
}
