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
package com.aspose.words.cloud.DocumentElements;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.DocumentPropertiesResponse;
import com.aspose.words.cloud.model.DocumentProperty;
import com.aspose.words.cloud.model.DocumentPropertyResponse;
import com.aspose.words.cloud.model.requests.CreateOrUpdateDocumentPropertyRequest;
import com.aspose.words.cloud.model.requests.DeleteDocumentPropertyRequest;
import com.aspose.words.cloud.model.requests.GetDocumentPropertiesRequest;
import com.aspose.words.cloud.model.requests.GetDocumentPropertyRequest;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class TestDocumentProperties extends TestCase {
    private String testFolder = "DocumentElements/DocumentProperties";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for adding/updating document property
     */
    @Test
public void testCreateOrUpdateDocumentProperty() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutUpdateDocumentProperty.docx";
        String propertyName = "AsposeAuthor";
        DocumentProperty prop = new DocumentProperty().builtIn(false).name(propertyName).value("Yaroslaw Ekimov");

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        CreateOrUpdateDocumentPropertyRequest request = new CreateOrUpdateDocumentPropertyRequest(remoteName, propertyName,
                prop, PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null, null);

        DocumentPropertyResponse result = TestInitializer.wordsApi.createOrUpdateDocumentProperty(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting document property
     */
    @Test
public void testDeleteDocumentProperty() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestDeleteDocumentProperty.docx";
        String propertyName = "testProp";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        DeleteDocumentPropertyRequest request = new DeleteDocumentPropertyRequest(remoteName, propertyName,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, destName, null, null);

        TestInitializer.wordsApi.deleteDocumentProperty(request);
    }

    /*
     * Test for getting document properties
     */
    @Test
public void testGetDocumentProperties() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentProperties.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetDocumentPropertiesRequest request = new GetDocumentPropertiesRequest(remoteName,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null);

        DocumentPropertiesResponse result = TestInitializer.wordsApi.getDocumentProperties(request);
        assertNotNull(result);
    }

    /*
     * Test for getting document property
     */
    @Test
public void testGetDocumentProperty() throws ApiException, IOException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentProperty.docx";
        String propName = "Author";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalCommonFolder, fileName), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"));

        GetDocumentPropertyRequest request = new GetDocumentPropertyRequest(remoteName, propName,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder),
                null, null, null);

        DocumentPropertyResponse result = TestInitializer.wordsApi.getDocumentProperty(request);
        assertNotNull(result);
    }
}
