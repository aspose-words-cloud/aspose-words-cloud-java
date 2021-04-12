/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestReadme.java">
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

package com.aspose.words.cloud;

import org.junit.Test;
import junit.framework.TestCase;
import java.io.IOException;
import javax.mail.MessagingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.File;

import com.aspose.words.cloud.api.WordsApi;
import com.aspose.words.cloud.model.requests.DeleteWatermarkRequest;
import com.aspose.words.cloud.model.DocumentResponse;
import com.aspose.words.cloud.model.requests.UploadFileRequest;

public class TestReadme extends TestCase {

/*
* Test for readme code
*/
@Test
public void testReadmeCode() throws ApiException, MessagingException, IOException 
{
        Map<String, String> creds = TestInitializer.GetConfig(TestInitializer.CONFIG_PATH);
        String clientId = creds.get("ClientId");
        String clientSecret = creds.get("ClientSecret");
        String baseUrl = creds.get("BaseUrl");

        String localFolder = TestInitializer.LocalCommonFolder;
        String fileName = "test_multi_pages.docx";

        String remoteFolder = "TestFolder";
        String remoteName = "TestDeleteDocumentWatermark.docx";

        // Start README example

        // if baseUrl is null, WordsApi uses default https://api.aspose.cloud 
        WordsApi wordsApi = new WordsApi(clientId, clientSecret, baseUrl);

        String localPath = PathUtil.get(localFolder, fileName);
        String remotePath = PathUtil.get(remoteFolder, remoteName);

        UploadFileRequest uploadRequest = new UploadFileRequest(Files.readAllBytes(Paths.get(localPath)), remotePath, null);
        wordsApi.uploadFile(uploadRequest);

        DeleteWatermarkRequest request = new DeleteWatermarkRequest(remoteName, remoteFolder, null, null, null, null, null, null);
        DocumentResponse result = wordsApi.deleteWatermark(request);

        // End README example

        writeToReadme();
    }

    private void writeToReadme() throws IOException 
    {
        // set regexes
        String startPattern = "^\\s*// Start README example\\s*$";
        String endPattern = "^\\s*// End README example\\s*$";

        // set paths
        String sourcePath = "src/test/java/com/aspose/words/cloud/TestReadme.java";
        String readmePath = "README.md";

        // read the file
        List<String> codeLines = Files.readAllLines(Paths.get(sourcePath));

        // etract README code
        List<String> readmeCode = new ArrayList<>();
        boolean skipMode = true;

        for (String line : codeLines) {
            if (skipMode)
            {
                skipMode = !line.matches(startPattern);
            }

            if (!skipMode)
            {
                readmeCode.add(line);
                skipMode = line.matches(endPattern);
            }
        }

        // read README.md
        List<String> readmeLines = Files.readAllLines(Paths.get(readmePath));

        // replace README code
        List<String> newReadmeLines = new ArrayList<>();
        boolean codeMode = false;

        for (String line : readmeLines)
        {
            if (!codeMode)
            {
                codeMode = line.matches(startPattern);

                if (codeMode)
                {
                    newReadmeLines.addAll(readmeCode);
                }
            }

            if (codeMode)
            {
                codeMode = ! line.matches(endPattern);
                continue;
            }

            if(!codeMode)
            {
                newReadmeLines.add(line);
            }
        }

        // write to README
        Files.write(Paths.get(readmePath), newReadmeLines, StandardCharsets.UTF_8);
    }
}
