/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestFormField.java">
 *   Copyright (c) 2023 Aspose.Words for Cloud
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
import com.aspose.words.cloud.model.responses.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.IOException;
import javax.mail.MessagingException;
import java.nio.file.*;
import java.util.*;

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
    public void testUpdateFormField() throws ApiException, MessagingException, IOException
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
            0,
            requestFormField,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.updateFormField(request);
        assertNotNull(result);
        assertNotNull(result.getFormField());
        assertEquals("FullName", result.getFormField().getName());
        assertEquals("", result.getFormField().getStatusText());
    }

    /*
     * Test for posting form field online.
     */
    @Test
    public void testUpdateFormFieldOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx").toAbsolutePath());
        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("No name");

        UpdateFormFieldOnlineRequest request = new UpdateFormFieldOnlineRequest(
            requestDocument,
            requestFormField,
            0,
            "sections/0",
            null,
            null,
            null,
            null,
            null,
            null
        );

        UpdateFormFieldOnlineResponse result = TestInitializer.wordsApi.updateFormFieldOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for posting form field without node path.
     */
    @Test
    public void testUpdateFormFieldWithoutNodePath() throws ApiException, MessagingException, IOException
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
            0,
            requestFormField,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.updateFormField(request);
        assertNotNull(result);
        assertNotNull(result.getFormField());
        assertEquals("FullName", result.getFormField().getName());
        assertEquals("", result.getFormField().getStatusText());
    }

    /*
     * Test for getting form field.
     */
    @Test
    public void testGetFormField() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.getFormField(request);
        assertNotNull(result);
        assertNotNull(result.getFormField());
        assertEquals("FullName", result.getFormField().getName());
    }

    /*
     * Test for getting form field online.
     */
    @Test
    public void testGetFormFieldOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx").toAbsolutePath());
        GetFormFieldOnlineRequest request = new GetFormFieldOnlineRequest(
            requestDocument,
            0,
            "sections/0",
            null,
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.getFormFieldOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting form field without node path.
     */
    @Test
    public void testGetFormFieldWithoutNodePath() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.getFormField(request);
        assertNotNull(result);
        assertNotNull(result.getFormField());
        assertEquals("FullName", result.getFormField().getName());
    }

    /*
     * Test for getting form fields.
     */
    @Test
    public void testGetFormFields() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        FormFieldsResponse result = TestInitializer.wordsApi.getFormFields(request);
        assertNotNull(result);
        assertNotNull(result.getFormFields());
        assertNotNull(result.getFormFields().getList());
        assertEquals(5, result.getFormFields().getList().size());
        assertEquals("FullName", result.getFormFields().getList().get(0).getName());
    }

    /*
     * Test for getting form fields online.
     */
    @Test
    public void testGetFormFieldsOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx").toAbsolutePath());
        GetFormFieldsOnlineRequest request = new GetFormFieldsOnlineRequest(
            requestDocument,
            "sections/0",
            null,
            null,
            null
        );

        FormFieldsResponse result = TestInitializer.wordsApi.getFormFieldsOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting form fields without node path.
     */
    @Test
    public void testGetFormFieldsWithoutNodePath() throws ApiException, MessagingException, IOException
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
            null,
            null
        );

        FormFieldsResponse result = TestInitializer.wordsApi.getFormFields(request);
        assertNotNull(result);
        assertNotNull(result.getFormFields());
        assertNotNull(result.getFormFields().getList());
        assertEquals(5, result.getFormFields().getList().size());
        assertEquals("FullName", result.getFormFields().getList().get(0).getName());
    }

    /*
     * Test for insert form field without node path.
     */
    @Test
    public void testInsertFormField() throws ApiException, MessagingException, IOException
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
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.insertFormField(request);
        assertNotNull(result);
        assertNotNull(result.getFormField());
        assertEquals("FullName", result.getFormField().getName());
        assertEquals("", result.getFormField().getStatusText());
    }

    /*
     * Test for insert form field without node path online.
     */
    @Test
    public void testInsertFormFieldOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx").toAbsolutePath());
        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("123");
        requestFormField.setTextInputFormat("UPPERCASE");

        InsertFormFieldOnlineRequest request = new InsertFormFieldOnlineRequest(
            requestDocument,
            requestFormField,
            "sections/0/paragraphs/0",
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        InsertFormFieldOnlineResponse result = TestInitializer.wordsApi.insertFormFieldOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for insert form field without node path.
     */
    @Test
    public void testInsertFormFieldWithoutNodePath() throws ApiException, MessagingException, IOException
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
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null,
            null
        );

        FormFieldResponse result = TestInitializer.wordsApi.insertFormField(request);
        assertNotNull(result);
        assertNotNull(result.getFormField());
        assertEquals("FullName", result.getFormField().getName());
        assertEquals("", result.getFormField().getStatusText());
    }

    /*
     * Test for deleting form field.
     */
    @Test
    public void testDeleteFormField() throws ApiException, MessagingException, IOException
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
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFormField(request);
    }

    /*
     * Test for deleting form field online.
     */
    @Test
    public void testDeleteFormFieldOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, fieldFolder + "/FormFilled.docx").toAbsolutePath());
        DeleteFormFieldOnlineRequest request = new DeleteFormFieldOnlineRequest(
            requestDocument,
            0,
            "sections/0",
            null,
            null,
            null,
            null,
            null,
            null
        );

        Map<String, byte[]> result = TestInitializer.wordsApi.deleteFormFieldOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting form field without node path.
     */
    @Test
    public void testDeleteFormFieldWithoutNodePath() throws ApiException, MessagingException, IOException
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
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFormField(request);
    }
}
