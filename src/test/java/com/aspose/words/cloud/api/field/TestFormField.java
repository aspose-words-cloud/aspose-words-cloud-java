/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestFormField.java">
 *   Copyright (c) 2020 Aspose.Words for Cloud
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

package com.aspose.words.cloud.api.field;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

/*
 * Example of how to work with form field.
 */
public class TestFormField  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/FormFields";
    private String fieldFolder = "DocumentElements/FormFields";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for posting form field.
     */
    @Test
    public void testUpdateFormField() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateFormField.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("No name");

        UpdateFormFieldRequest request = new UpdateFormFieldRequest(
            remoteFileName,
            requestFormField,
            0,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.updateFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for posting form field without node path.
     */
    @Test
    public void testUpdateFormFieldWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateFormFieldWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("No name");

        UpdateFormFieldRequest request = new UpdateFormFieldRequest(
            remoteFileName,
            requestFormField,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.updateFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for getting form field.
     */
    @Test
    public void testGetFormField() throws ApiException, IOException
    {
        String remoteFileName = "TestGetFormField.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFormFieldRequest request = new GetFormFieldRequest(
            remoteFileName,
            0,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.getFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for getting form field without node path.
     */
    @Test
    public void testGetFormFieldWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestGetFormFieldWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFormFieldRequest request = new GetFormFieldRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.getFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for getting form fields.
     */
    @Test
    public void testGetFormFields() throws ApiException, IOException
    {
        String remoteFileName = "TestGetFormFields.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFormFieldsRequest request = new GetFormFieldsRequest(
            remoteFileName,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        FormFieldsResponse result = TestInitializer.wordsApi.getFormFields(request);
        assertNotNull(result);
    }

    /*
     * Test for getting form fields without node path.
     */
    @Test
    public void testGetFormFieldsWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestGetFormFieldsWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFormFieldsRequest request = new GetFormFieldsRequest(
            remoteFileName,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        FormFieldsResponse result = TestInitializer.wordsApi.getFormFields(request);
        assertNotNull(result);
    }

    /*
     * Test for insert form field without node path.
     */
    @Test
    public void testInsertFormField() throws ApiException, IOException
    {
        String remoteFileName = "TestInsertFormField.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/test_multi_pages.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("123");
        requestFormField.setTextInputFormat("UPPERCASE");

        InsertFormFieldRequest request = new InsertFormFieldRequest(
            remoteFileName,
            requestFormField,
            "sections/0/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.insertFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for insert form field without node path.
     */
    @Test
    public void testInsertFormFieldWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestInsertFormFieldWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/test_multi_pages.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("123");
        requestFormField.setTextInputFormat("UPPERCASE");

        InsertFormFieldRequest request = new InsertFormFieldRequest(
            remoteFileName,
            requestFormField,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.insertFormField(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting form field.
     */
    @Test
    public void testDeleteFormField() throws ApiException, IOException
    {
        String remoteFileName = "TestDeleteFormField.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFormFieldRequest request = new DeleteFormFieldRequest(
            remoteFileName,
            0,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFormField(request);
    }

    /*
     * Test for deleting form field without node path.
     */
    @Test
    public void testDeleteFormFieldWithoutNodePath() throws ApiException, IOException
    {
        String remoteFileName = "TestDeleteFormFieldWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx"),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFormFieldRequest request = new DeleteFormFieldRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFormField(request);
    }
}
