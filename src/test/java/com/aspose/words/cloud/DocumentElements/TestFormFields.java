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

import com.aspose.words.cloud.ApiException;
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.FormField;
import com.aspose.words.cloud.model.FormFieldResponse;
import com.aspose.words.cloud.model.FormFieldTextInput;
import com.aspose.words.cloud.model.FormFieldsResponse;
import com.aspose.words.cloud.model.requests.*;

import org.junit.Test;

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
    @Test
public void testUpdateFormField() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestUpdateFormField.docx";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName).toString();
        Integer index = 0;
        FormField body = new FormFieldTextInput()
                .textInputFormat("")
                .textInputDefault("123")
                .name("FullName")
                .enabled(true)
                .calculateOnExit(true)
                .statusText("");
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateFormFieldRequest request = new UpdateFormFieldRequest(remoteName, body, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null);

        FormFieldResponse result = TestInitializer.wordsApi.updateFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for updating footnote from document without node path
     */
    @Test
public void testUpdateFormFieldWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestUpdateFormFieldWithoutNodePath.docx";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName).toString();
        Integer index = 0;
        FormField body = new FormFieldTextInput()
                .textInputFormat("")
                .textInputDefault("123")
                .name("FullName")
                .enabled(true)
                .calculateOnExit(true)
                .statusText("");
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateFormFieldWithoutNodePathRequest request = new UpdateFormFieldWithoutNodePathRequest(remoteName, body, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null);

        FormFieldResponse result = TestInitializer.wordsApi.updateFormFieldWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting footnote from document
     */
    @Test
public void testInsertFormField() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestInsertFormField.docx";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName).toString();
        FormField body = new FormFieldTextInput()
                .textInputFormat("UPPERCASE")
                .textInputDefault("123")
                .name("FullName")
                .enabled(true)
                .calculateOnExit(true)
                .statusText("");
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertFormFieldRequest request = new InsertFormFieldRequest(remoteName, body, "sections/0",
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null, null);

        FormFieldResponse result = TestInitializer.wordsApi.insertFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting footnote from document withput node path
     */
    @Test
public void testInsertFormFieldWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestInsertFormFieldWithoutNodePath.docx";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName).toString();
        FormField body = new FormFieldTextInput()
                .textInputFormat("UPPERCASE")
                .textInputDefault("123")
                .name("FullName")
                .enabled(true)
                .calculateOnExit(true)
                .statusText("");
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertFormFieldWithoutNodePathRequest request = new InsertFormFieldWithoutNodePathRequest(remoteName, body,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null, null);

        FormFieldResponse result = TestInitializer.wordsApi.insertFormFieldWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for removing form field
     */
    @Test
public void testDeleteFormField() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestDeleteFormField.docx";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteFormFieldRequest request = new DeleteFormFieldRequest(remoteName, "sections/0", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteFormField(request);
    }

    /*
     * Test for removing form field without node path
     */
    @Test
public void testDeleteFormFieldWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestDeleteFormFieldWithoutNodePath.docx";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteFormFieldWithoutNodePathRequest request = new DeleteFormFieldWithoutNodePathRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteFormFieldWithoutNodePath(request);
    }

    /*
     * Test for getting form field
     */
    @Test
public void testGetFormField() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestGetFormField.docx";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFormFieldRequest request = new GetFormFieldRequest(remoteName, "sections/0", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        FormFieldResponse result = TestInitializer.wordsApi.getFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for getting form field without node path
     */
    @Test
public void testGetFormFieldWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestGetFormFieldWithoutNodePath.docx";
        Integer index = 0;
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFormFieldWithoutNodePathRequest request = new GetFormFieldWithoutNodePathRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        FormFieldResponse result = TestInitializer.wordsApi.getFormFieldWithoutNodePath(request);
        assertNotNull(result);
    }


    /*
     * Test for getting form field
     */
    @Test
public void testGetFormFields() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestGetFormFields.docx";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFormFieldsRequest request = new GetFormFieldsRequest(remoteName, "sections/0",
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        FormFieldsResponse result = TestInitializer.wordsApi.getFormFields(request);
        assertNotNull(result);
    }

    /*
     * Test for getting form field without node path
     */
    @Test
public void testGetFormFieldsWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "FormFilled.docx";
        String remoteName = "TestGetFormFieldsWithoutNodePath.docx";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetFormFieldsWithoutNodePathRequest request = new GetFormFieldsWithoutNodePathRequest(remoteName,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        FormFieldsResponse result = TestInitializer.wordsApi.getFormFieldsWithoutNodePath(request);
        assertNotNull(result);
    }
}
