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
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;

import java.io.File;
import java.nio.file.Paths;

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
    public void testCreateOrUpdateDocumentProperty() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPutUpdateDocumentProperty.docx";
        String propertyName = "AsposeAuthor";
        DocumentProperty prop = new DocumentProperty().builtIn(false).name(propertyName).value("Yaroslaw Ekimov");

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        CreateOrUpdateDocumentPropertyRequest request = new CreateOrUpdateDocumentPropertyRequest(remoteName, propertyName,
                prop, Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null, null);

        DocumentPropertyResponse result = TestInitializer.wordsApi.createOrUpdateDocumentProperty(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for deleting document property
     */
    public void testDeleteDocumentProperty() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestDeleteDocumentProperty.docx";
        String propertyName = "testProp";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        DeleteDocumentPropertyRequest request = new DeleteDocumentPropertyRequest(remoteName, propertyName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, destName, null, null);

        AsposeResponse result = TestInitializer.wordsApi.deleteDocumentProperty(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting document properties
     */
    public void testGetDocumentProperties() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentProperties.docx";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        GetDocumentPropertiesRequest request = new GetDocumentPropertiesRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        DocumentPropertiesResponse result = TestInitializer.wordsApi.getDocumentProperties(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting document property
     */
    public void testGetDocumentProperty() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestGetDocumentProperty.docx";
        String propName = "Author";

        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString()),
                null, null);

        GetDocumentPropertyRequest request = new GetDocumentPropertyRequest(remoteName, propName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        DocumentPropertyResponse result = TestInitializer.wordsApi.getDocumentProperty(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}
