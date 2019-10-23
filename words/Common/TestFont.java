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
package com.aspose.words.Common;

import com.aspose.words.ApiException;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.WordsResponse;
import com.aspose.words.model.AvailableFontsResponse;
import com.aspose.words.model.requests.GetAvailableFontsRequest;
import com.aspose.words.model.requests.ResetCacheRequest;
import junit.framework.TestCase;

public class TestFont extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for resetting font cache
     */
    public void testResetCache() throws ApiException {
        ResetCacheRequest request = new ResetCacheRequest();

        WordsResponse result = TestInitializer.wordsApi.resetCache(request);
        assertNotNull(result);
    }

    /*
     * Test for resetting font cache
     */
    public void testGetAvailableFonts() throws ApiException {
        GetAvailableFontsRequest request = new GetAvailableFontsRequest(null);

        AvailableFontsResponse result = TestInitializer.wordsApi.getAvailableFonts(request);
        assertNotNull(result);
    }
}
