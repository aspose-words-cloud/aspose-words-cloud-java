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

public class TestFormFields extends TestCase {
    private String testFolder = "DocumentElements/FormFields";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for updating footnote from document
     */
    public void testPostFormField() throws ApiException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestPostFormField.docx";
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);
        Integer index = 0;
        FormField body = new FormFieldTextInput()
                .textInputFormat("UPPERCASE")
                .textInputDefault("123")
                .name("FullName")
                .enabled(true)
                .calculateOnExit(true)
                .statusText("");

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        PostFormFieldRequest request = new PostFormFieldRequest(remoteName, body, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, destName, null, null, null);

        FormFieldResponse result = TestInitializer.wordsApi.postFormField(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for updating footnote from document
     */
    public void testPutFormField() throws ApiException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestPutFormField.docx";
        String destName = StringUtil.join("/", TestInitializer.RemoteTestOut, remoteName);
        FormField body = new FormFieldTextInput()
                .textInputFormat("UPPERCASE")
                .textInputDefault("123")
                .name("FullName")
                .enabled(true)
                .calculateOnExit(true)
                .statusText("");

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        PutFormFieldRequest request = new PutFormFieldRequest(remoteName, body,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, destName, null, null, "sections/0", null);

        FormFieldResponse result = TestInitializer.wordsApi.putFormField(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for removing form field
     */
    public void testDeleteFormField() throws ApiException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestDeleteFormField.docx";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        DeleteFormFieldRequest request = new DeleteFormFieldRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, null, null, null, "sections/0");

        AsposeResponse result = TestInitializer.wordsApi.deleteFormField(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting form field
     */
    public void testGetFormField() throws ApiException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestGetFormField.docx";
        Integer index = 0;

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        GetFormFieldRequest request = new GetFormFieldRequest(remoteName, index,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, "sections/0");

        FormFieldResponse result = TestInitializer.wordsApi.getFormField(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }

    /*
     * Test for getting form field
     */
    public void testGetFormFields() throws ApiException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestGetFormFields.docx";

        TestInitializer.uploadFile(StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder, remoteName).replace("\\", "/"),
                StringUtil.join("/", TestInitializer.LocalTestFolder, testFolder, fileName));

        GetFormFieldsRequest request = new GetFormFieldsRequest(remoteName,
                StringUtil.join("/", TestInitializer.RemoteTestFolder, testFolder), null, null,
                null, "sections/0");

        FormFieldsResponse result = TestInitializer.wordsApi.getFormFields(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}
