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
import com.aspose.words.cloud.model.FormField;
import com.aspose.words.cloud.model.FormFieldResponse;
import com.aspose.words.cloud.model.FormFieldTextInput;
import com.aspose.words.cloud.model.FormFieldsResponse;
import com.aspose.words.cloud.model.requests.DeleteFormFieldRequest;
import com.aspose.words.cloud.model.requests.GetFormFieldRequest;
import com.aspose.words.cloud.model.requests.GetFormFieldsRequest;
import com.aspose.words.cloud.model.requests.InsertFormFieldRequest;
import com.aspose.words.cloud.model.requests.UpdateFormFieldRequest;

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
    public void testPostFormField() throws ApiException, FileNotFoundException {
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
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateFormFieldRequest request = new UpdateFormFieldRequest(remoteName, body, "", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null);

        FormFieldResponse result = TestInitializer.wordsApi.updateFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for updating footnote from document
     */
    public void testPutFormField() throws ApiException, FileNotFoundException {
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
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertFormFieldRequest request = new InsertFormFieldRequest(remoteName, body, "sections/0",
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null, null);

        FormFieldResponse result = TestInitializer.wordsApi.insertFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for removing form field
     */
    public void testDeleteFormField() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestDeleteFormField.docx";
        Integer index = 0;
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteFormFieldRequest request = new DeleteFormFieldRequest(remoteName, "sections/0", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteFormField(request);
    }

    /*
     * Test for getting form field
     */
    public void testGetFormField() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestGetFormField.docx";
        Integer index = 0;
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFormFieldRequest request = new GetFormFieldRequest(remoteName, "sections/0", index,
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        FormFieldResponse result = TestInitializer.wordsApi.getFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for getting form field
     */
    public void testGetFormFields() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestGetFormFields.docx";
        TestInitializer.UploadFile(Paths.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), Paths.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFormFieldsRequest request = new GetFormFieldsRequest(remoteName, "sections/0",
                Paths.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        FormFieldsResponse result = TestInitializer.wordsApi.getFormFields(request);
        assertNotNull(result);
    }
}
