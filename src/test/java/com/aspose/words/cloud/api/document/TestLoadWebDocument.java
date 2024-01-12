/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestLoadWebDocument.java">
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

package com.aspose.words.cloud.api.document;

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
 * Example of how to load web document.
 */
public class TestLoadWebDocument  extends TestCase
{

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for loading web document.
     */
    @Test
    public void testLoadWebDocument() throws ApiException, MessagingException, IOException
    {
        DocSaveOptionsData requestDataSaveOptions = new DocSaveOptionsData();
        requestDataSaveOptions.setFileName("google.doc");
        requestDataSaveOptions.setDmlEffectsRenderingMode(DocSaveOptionsData.DmlEffectsRenderingModeEnum.NONE);
        requestDataSaveOptions.setDmlRenderingMode(DocSaveOptionsData.DmlRenderingModeEnum.DRAWINGML);
        requestDataSaveOptions.setZipOutput(false);

        LoadWebDocumentData requestData = new LoadWebDocumentData();
        requestData.setLoadingDocumentUrl("http://google.com");
        requestData.setSaveOptions(requestDataSaveOptions);

        LoadWebDocumentRequest request = new LoadWebDocumentRequest(
            requestData,
            null
        );

        SaveResponse result = TestInitializer.wordsApi.loadWebDocument(request);
        assertNotNull(result);
        assertNotNull(result.getSaveResult());
        assertNotNull(result.getSaveResult().getDestDocument());
        assertEquals("google.doc", result.getSaveResult().getDestDocument().getHref());
    }
}
