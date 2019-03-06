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
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        Integer index = 0;
        FormField body = new FormFieldTextInput()
                .textInputFormat("")
                .textInputDefault("123")
                .name("FullName")
                .enabled(true)
                .calculateOnExit(true)
                .statusText("");
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        PostFormFieldRequest request = new PostFormFieldRequest(remoteName, body, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
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
        String destName = Paths.get(TestInitializer.RemoteTestOut, remoteName).toString();
        FormField body = new FormFieldTextInput()
                .textInputFormat("UPPERCASE")
                .textInputDefault("123")
                .name("FullName")
                .enabled(true)
                .calculateOnExit(true)
                .statusText("");
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        PutFormFieldRequest request = new PutFormFieldRequest(remoteName, body,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
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
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        DeleteFormFieldRequest request = new DeleteFormFieldRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
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
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        GetFormFieldRequest request = new GetFormFieldRequest(remoteName, index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
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
        TestInitializer.wordsApi.putCreate(Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"),
                new File(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString()),
                null, null);

        GetFormFieldsRequest request = new GetFormFieldsRequest(remoteName,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, "sections/0");

        FormFieldsResponse result = TestInitializer.wordsApi.getFormFields(request);
        assertEquals(result.getCode(), Integer.valueOf(200));
    }
}
