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
package com.aspose.words.cloud.Common;

import java.io.File;
import java.io.FileNotFoundException;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.ClassificationResponse;
import com.aspose.words.cloud.model.requests.ClassifyRequest;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCommon extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testMissingCredentials() throws ApiException {
        File credsFile = new File("Settings/servercreds.json"),
            fakeCredsFile = new File("Settings/servercreds1.json");

        boolean realExists = credsFile.exists();

        if (realExists){
            credsFile.renameTo(fakeCredsFile);
        }

        try {
            TestInitializer.Initialize();
            fail("Exception must be thrown");
        } catch (FileNotFoundException e) {
            
        } finally {
            fakeCredsFile.renameTo(credsFile);
        }
    }

    @Test
    public void testTokenExpires() throws FileNotFoundException, ApiException {
        TestInitializer.Initialize();
        TestInitializer.wordsApi.getApiClient().setAccessToken("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYmYiOjE1Njc1ODg2OTksImV4cCI6MTU2NzY3NTA5OSwiaXNzIjoiaHR0cHM6Ly9hcGktcWEuYXNwb3NlLmNsb3VkIiwiYXVkIjpbImh0dHBzOi8vYXBpLXFhLmFzcG9zZS5jbG91ZC9yZXNvdXJjZXMiLCJhcGkucGxhdGZvcm0iLCJhcGkucHJvZHVjdHMiXSwiY2xpZW50X2lkIjoiNzhCNjM3RjYtQjRDQy00MURFLUE2MTktRDhCRDlGQzJCNkI2IiwiY2xpZW50X2lkU3J2SWQiOiIiLCJzY29wZSI6WyJhcGkucGxhdGZvcm0iLCJhcGkucHJvZHVjdHMiXX0.NcsvIWr8zpHIGKTtVQIevRUJchTc2NqwgjNIVg3J9uXowr6lbsLgV6v4KsVlR6yssjkfjZEsRNOExaxdga7Mrv6RvXhgZDs5-_6HrtMdIHUe_1F5kbS5Cz1evyOeQhfdeRnZWHR-BZOAzyB__1gXBo2MObPF3NIt6j6vPWbHU9DSLrjEWPCULVdmLtl6-NDYHvNR4AbiaH-qfU8j1bMLdBfyzK2uX376EpbinSZHeNeFp4dOOhAOpDR-p_kCt4O4z5Tjrcuyw9PrCBmyHWwMSa-8g95Jy-_d89VAZvS1xEFHNX_hZilEPseGPUzDMwg_oOIBfIVcRS3NxqWvEWof7A");
        ClassifyRequest request = new ClassifyRequest("Try text classification", "3");
        ClassificationResponse result = TestInitializer.wordsApi.classify(request);
        assertNotNull(result);
    }
}
