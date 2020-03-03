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
package com.aspose.words.cloud.Range;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.DocumentResponse;
import com.aspose.words.cloud.model.RangeDocument;
import com.aspose.words.cloud.model.RangeTextResponse;
import com.aspose.words.cloud.model.ReplaceRange;
import com.aspose.words.cloud.model.requests.GetRangeTextRequest;
import com.aspose.words.cloud.model.requests.RemoveRangeRequest;
import com.aspose.words.cloud.model.requests.ReplaceWithTextRequest;
import com.aspose.words.cloud.model.requests.SaveAsRangeRequest;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;

public class TestRange extends TestCase {
    private String testFolder = "DocumentElements/Range";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    @Test
public void testGetRangeText() throws ApiException, FileNotFoundException {
        String rangeStart = "id0.0.0", rangeEnd = "id0.0.1", expectedText = "This is HEADER ",
                folder = PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), localName = "RangeGet.doc",
                remoteName = "TestGetRangeText.doc", fullName = PathUtil.get(folder, remoteName).toString();

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, localName).toString(),
                fullName);

        GetRangeTextRequest request = new GetRangeTextRequest(remoteName, rangeStart, rangeEnd, folder, null, null,
                null);
        RangeTextResponse result = TestInitializer.wordsApi.getRangeText(request);
        assertEquals(expectedText, result.getText());
    }

    @Test
public void testRemoveRange() throws ApiException, FileNotFoundException {
        String rangeStart = "id0.0.0", rangeEnd = "id0.0.1", folder = PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), localName = "RangeGet.doc",
                remoteName = "TestRemoveRange.doc", fullName = PathUtil.get(folder, remoteName).toString();

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, localName).toString(),
                fullName);

        RemoveRangeRequest request = new RemoveRangeRequest(remoteName, rangeStart, rangeEnd, folder, null, null, null, null);
        DocumentResponse result = TestInitializer.wordsApi.removeRange(request);
        assertNotNull("Result cannot be null", result);
    }

    @Test
public void testSaveAsRange() throws ApiException, FileNotFoundException {
        String rangeStart = "id0.0.0", rangeEnd = "id0.0.1", folder = PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), localName = "RangeGet.doc",
                remoteName = "TestSaveAsRange.doc", fullName = PathUtil.get(folder, remoteName).toString(),
                newDocName = TestInitializer.RemoteTestFolder + "/NewDoc.docx";
        RangeDocument rangeDoc = new RangeDocument().documentName(newDocName);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, localName).toString(),
                fullName);

        SaveAsRangeRequest request = new SaveAsRangeRequest(remoteName, rangeStart, rangeDoc, rangeEnd, folder, null, null, null);
        DocumentResponse result = TestInitializer.wordsApi.saveAsRange(request);
        assertNotNull("Rexult cannot be null", result);
    }

    @Test
public void testReplaceWithText() throws ApiException, FileNotFoundException {
        String rangeStart = "id0.0.0", rangeEnd = "id0.0.1", folder = PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), localName = "RangeGet.doc",
                remoteName = "TestReplaceWithText.doc", fullName = PathUtil.get(folder, remoteName).toString(),
                newText = "Replace header";
        ReplaceRange replacement = new ReplaceRange().text(newText);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, localName).toString(),
                fullName);

        ReplaceWithTextRequest request = new ReplaceWithTextRequest(remoteName, rangeStart, replacement, rangeEnd, folder, 
                        null, null, null, null);

        DocumentResponse result = TestInitializer.wordsApi.replaceWithText(request);
        assertNotNull("Rexult cannot be null", result);
    }
}
