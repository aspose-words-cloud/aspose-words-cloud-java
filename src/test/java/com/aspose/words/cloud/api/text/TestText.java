/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestText.java">
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

package com.aspose.words.cloud.api.text;

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
 * Example of how to work with macros.
 */
public class TestText  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Text";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for replacing text.
     */
    @Test
    public void testReplaceText() throws ApiException, IOException
    {
        String remoteFileName = "TestReplaceText.docx";
        String localFile = "Common/test_multi_pages.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        ReplaceTextParameters requestReplaceText = new ReplaceTextParameters();
        requestReplaceText.setOldValue("Testing");
        requestReplaceText.setNewValue("Aspose testing");

        ReplaceTextRequest request = new ReplaceTextRequest(
            remoteFileName,
            requestReplaceText,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        ReplaceTextResponse result = TestInitializer.wordsApi.replaceText(request);
        assertNotNull(result);
        assertEquals(Integer.valueOf(3), result.getMatches());
    }

    /*
     * Test for replacing text online.
     */
    @Test
    public void testReplaceTextOnline() throws ApiException, IOException
    {
        String localFile = "Common/test_multi_pages.docx";

        ReplaceTextParameters requestReplaceText = new ReplaceTextParameters();
        requestReplaceText.setOldValue("aspose");
        requestReplaceText.setNewValue("aspose new");

        ReplaceTextOnlineRequest request = new ReplaceTextOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            requestReplaceText,
            null,
            null,
            null,
            null,
            null
        );

        ReplaceTextOnlineResponse result = TestInitializer.wordsApi.replaceTextOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for searching.
     */
    @Test
    public void testSearch() throws ApiException, IOException
    {
        String remoteFileName = "TestSearch.docx";
        String localFile = "DocumentElements/Text/SampleWordDocument.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        SearchRequest request = new SearchRequest(
            remoteFileName,
            "aspose",
            remoteDataFolder,
            null,
            null,
            null
        );

        SearchResponse result = TestInitializer.wordsApi.search(request);
        assertNotNull(result);
        assertNotNull(result.getSearchResults());
        assertNotNull(result.getSearchResults().getResultsList());
        assertEquals(23, result.getSearchResults().getResultsList().size());
        assertNotNull(result.getSearchResults().getResultsList().get(0).getRangeStart());
        assertEquals(Integer.valueOf(65), result.getSearchResults().getResultsList().get(0).getRangeStart().getOffset());
    }

    /*
     * Test for searching online.
     */
    @Test
    public void testSearchOnline() throws ApiException, IOException
    {
        String localFile = "DocumentElements/Text/SampleWordDocument.docx";

        SearchOnlineRequest request = new SearchOnlineRequest(
            Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath()),
            "aspose",
            null,
            null
        );

        SearchResponse result = TestInitializer.wordsApi.searchOnline(request);
        assertNotNull(result);
    }
}
