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

import java.io.FileNotFoundException;
import java.nio.file.Paths;

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.DocumentResponse;
import com.aspose.words.cloud.model.Field;
import com.aspose.words.cloud.model.FieldResponse;
import com.aspose.words.cloud.model.FieldsResponse;
import com.aspose.words.cloud.model.PageNumber;
import com.aspose.words.cloud.model.requests.DeleteFieldRequest;
import com.aspose.words.cloud.model.requests.DeleteFieldsRequest;
import com.aspose.words.cloud.model.requests.GetFieldRequest;
import com.aspose.words.cloud.model.requests.GetFieldsRequest;
import com.aspose.words.cloud.model.requests.InsertFieldRequest;
import com.aspose.words.cloud.model.requests.InsertPageNumbersRequest;
import com.aspose.words.cloud.model.requests.UpdateFieldRequest;
import com.aspose.words.cloud.model.requests.UpdateFieldsRequest;

import junit.framework.TestCase;

public class TestFields extends TestCase {
    private String testFolder = "DocumentElements/Fields";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting fields from document
     */
    public void testGetFields() throws ApiException, FileNotFoundException {
        String fileName = "GetField.docx";
        String remoteName = "TestGetFields.docx";

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFieldsRequest request = new GetFieldsRequest(remoteName, "sections/0",
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        FieldsResponse result = TestInitializer.wordsApi.getFields(request);
        assertNotNull(result);
    }

    /*
     * Test for getting field from document
     */
    public void testGetField() throws ApiException, FileNotFoundException {
        String fileName = "GetField.docx";
        String remoteName = "TestGetField.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFieldRequest request = new GetFieldRequest(remoteName, "sections/0", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null);

        FieldResponse result = TestInitializer.wordsApi.getField(request);
        assertNotNull(result);
    }

    /*
     * Test for updating document field
     */
    public void testPostField() throws ApiException, FileNotFoundException {
        String fileName = "GetField.docx";
        String remoteName = "TestPostField.docx";
        Integer index = 0;
        Field body = (Field) new Field().fieldCode("{ NUMPAGES }").nodeId("0.0.3");
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateFieldRequest request = new UpdateFieldRequest(remoteName, body, "sections/0/paragraphs/0", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null,
                null);

        FieldResponse result = TestInitializer.wordsApi.updateField(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting document field
     */
    public void testPutField() throws ApiException, FileNotFoundException {
        String fileName = "GetField.docx";
        String remoteName = "TestPutField.docx";
        Field body = (Field) new Field().fieldCode("{ NUMPAGES }").nodeId("0.0.3");
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertFieldRequest request = new InsertFieldRequest(remoteName, body, "sections/0/paragraphs/0",
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null,
                null, null);

        FieldResponse result = TestInitializer.wordsApi.insertField(request);
        assertNotNull(result);
    }

    /*
     * Test for reevaluating fields in document
     */
    public void testPostUpdateDocumentFields() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostUpdateDocumentFields.docx";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateFieldsRequest request = new UpdateFieldsRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null);

        DocumentResponse result = TestInitializer.wordsApi.updateFields(request);
        assertNotNull(result);
    }

    /*
     * Test for reevaluating fields in document
     */
    public void testPostInsertPageNumbers() throws ApiException, FileNotFoundException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostInsertPageNumbers.docx";
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        PageNumber body = new PageNumber().format("{PAGE} of { NUMPAGES }").alignment("center").isTop(false);
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalCommonFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertPageNumbersRequest request = new InsertPageNumbersRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, destName, null, null);

        DocumentResponse result = TestInitializer.wordsApi.insertPageNumbers(request);
        assertNotNull(result);
    }

    /*
     * Test for removing field
     */
    public void testDeleteField() throws ApiException, FileNotFoundException {
        String fileName = "GetField.docx";
        String remoteName = "TestDeleteField.docx";
        Integer index = 0;

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteFieldRequest request = new DeleteFieldRequest(remoteName, "sections/0/paragraphs/0", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null,
                null);
        TestInitializer.wordsApi.deleteField(request);
    }

    /*
     * Test for removing fields
     */
    public void testDeleteFields() throws ApiException, FileNotFoundException {
        String fileName = "GetField.docx";
        String remoteName = "TestDeleteFields.docx";

        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteFieldsRequest request = new DeleteFieldsRequest(remoteName, "sections/0",
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(),
                null, null, null, null, null,
                null);

        TestInitializer.wordsApi.deleteFields(request);
    }
}
