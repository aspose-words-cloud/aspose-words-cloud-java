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
package com.aspose.words.DocumentElements;

import com.aspose.words.ApiException;
import com.aspose.words.StringUtil;
import com.aspose.words.TestInitializer;
import com.aspose.words.model.*;
import com.aspose.words.model.requests.*;
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
    public void testGetFields() throws ApiException {
        String fileName = "GetField.docx";
        String remoteName = "TestGetFields.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        GetFieldsRequest request = new GetFieldsRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, "sections/0");

        FieldsResponse result = TestInitializer.wordsApi.getFields(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting field from document
     */
    public void testGetField() throws ApiException {
        String fileName = "GetField.docx";
        String remoteName = "TestGetField.docx";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        GetFieldRequest request = new GetFieldRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, "sections/0");

        FieldResponse result = TestInitializer.wordsApi.getField(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for updating document field
     */
    public void testPostField() throws ApiException {
        String fileName = "GetField.docx";
        String remoteName = "TestPostField.docx";
        Integer index = 0;
        Field body = new Field().fieldCode("{ NUMPAGES }").nodeId("0.0.3");

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        PostFieldRequest request = new PostFieldRequest(remoteName, body, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null,
                null, "sections/0/paragraphs/0");

        FieldResponse result = TestInitializer.wordsApi.postField(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for inserting document field
     */
    public void testPutField() throws ApiException {
        String fileName = "GetField.docx";
        String remoteName = "TestPutField.docx";
        Field body = new Field().fieldCode("{ NUMPAGES }").nodeId("0.0.3");

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        PutFieldRequest request = new PutFieldRequest(remoteName, body,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null,
                null, "sections/0/paragraphs/0", null);

        FieldResponse result = TestInitializer.wordsApi.putField(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for reevaluating fields in document
     */
    public void testPostUpdateDocumentFields() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostUpdateDocumentFields.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        PostUpdateDocumentFieldsRequest request = new PostUpdateDocumentFieldsRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null);

        DocumentResponse result = TestInitializer.wordsApi.postUpdateDocumentFields(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for reevaluating fields in document
     */
    public void testPostInsertPageNumbers() throws ApiException {
        String fileName = "test_multi_pages.docx";
        String remoteName = "TestPostInsertPageNumbers.docx";
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);
        PageNumber body = new PageNumber().format("{PAGE} of { NUMPAGES }").alignment("center").isTop(false);

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalCommonFolder, fileName));

        PostInsertPageNumbersRequest request = new PostInsertPageNumbersRequest(remoteName, body,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, destName, null, null);

        DocumentResponse result = TestInitializer.wordsApi.postInsertPageNumbers(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for removing field
     */
    public void testDeleteField() throws ApiException {
        String fileName = "GetField.docx";
        String remoteName = "TestDeleteField.docx";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        DeleteFieldRequest request = new DeleteFieldRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null,
                null, "sections/0/paragraphs/0");

        AsposeResponse result = TestInitializer.wordsApi.deleteField(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for removing fields
     */
    public void testDeleteFields() throws ApiException {
        String fileName = "GetField.docx";
        String remoteName = "TestDeleteFields.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        DeleteFieldsRequest request = new DeleteFieldsRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder),
                null, null, null, null, null,
                null, "sections/0");

        AsposeResponse result = TestInitializer.wordsApi.deleteFields(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}
