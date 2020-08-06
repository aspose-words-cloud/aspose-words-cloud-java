/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestField.java">
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
 * Example of how to work with field.
 */
public class TestField  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Fields";
    private String textFolder = "DocumentElements/Text";
    private String fieldFolder = "DocumentElements/Fields";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting fields.
     */
    @Test
    public void testGetFields() throws ApiException, IOException
    {
        String localFileName = "GetField.docx";
        String remoteFileName = "TestGetFields.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFieldsRequest request = new GetFieldsRequest(
            remoteFileName,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        FieldsResponse result = TestInitializer.wordsApi.getFields(request);
        assertNotNull(result);
    }

    /*
     * Test for getting fields without node path.
     */
    @Test
    public void testGetFieldsWithoutNodePath() throws ApiException, IOException
    {
        String localFileName = "GetField.docx";
        String remoteFileName = "TestGetFieldsWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFieldsRequest request = new GetFieldsRequest(
            remoteFileName,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        FieldsResponse result = TestInitializer.wordsApi.getFields(request);
        assertNotNull(result);
    }

    /*
     * Test for getting field by index.
     */
    @Test
    public void testGetField() throws ApiException, IOException
    {
        String localFileName = "GetField.docx";
        String remoteFileName = "TestGetField.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFieldRequest request = new GetFieldRequest(
            remoteFileName,
            0,
            "sections/0/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null
        );

        FieldResponse result = TestInitializer.wordsApi.getField(request);
        assertNotNull(result);
    }

    /*
     * Test for getting field by index without node path.
     */
    @Test
    public void testGetFieldWithoutNodePath() throws ApiException, IOException
    {
        String localFileName = "GetField.docx";
        String remoteFileName = "TestGetFieldWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        GetFieldRequest request = new GetFieldRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        FieldResponse result = TestInitializer.wordsApi.getField(request);
        assertNotNull(result);
    }

    /*
     * Test for putting field.
     */
    @Test
    public void testInsertField() throws ApiException, IOException
    {
        String localFileName = "SampleWordDocument.docx";
        String remoteFileName = "TestInsertField.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, textFolder + "/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        FieldInsert requestField = new FieldInsert();
        requestField.setFieldCode("{ NUMPAGES }");

        InsertFieldRequest request = new InsertFieldRequest(
            remoteFileName,
            requestField,
            "sections/0/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        FieldResponse result = TestInitializer.wordsApi.insertField(request);
        assertNotNull(result);
    }

    /*
     * Test for putting field without node path.
     */
    @Test
    public void testInsertFieldWithoutNodePath() throws ApiException, IOException
    {
        String localFileName = "SampleWordDocument.docx";
        String remoteFileName = "TestInsertFieldWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, textFolder + "/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        FieldInsert requestField = new FieldInsert();
        requestField.setFieldCode("{ NUMPAGES }");

        InsertFieldRequest request = new InsertFieldRequest(
            remoteFileName,
            requestField,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        );

        FieldResponse result = TestInitializer.wordsApi.insertField(request);
        assertNotNull(result);
    }

    /*
     * Test for posting field.
     */
    @Test
    public void testUpdateField() throws ApiException, IOException
    {
        String localFileName = "GetField.docx";
        String remoteFileName = "TestUpdateField.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        FieldUpdate requestField = new FieldUpdate();
        requestField.setFieldCode("{ NUMPAGES }");

        UpdateFieldRequest request = new UpdateFieldRequest(
            remoteFileName,
            requestField,
            0,
            "sections/0/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        FieldResponse result = TestInitializer.wordsApi.updateField(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting page numbers field.
     */
    @Test
    public void testInsertPageNumbers() throws ApiException, IOException
    {
        String localFileName = "test_multi_pages.docx";
        String remoteFileName = "TestInsertPageNumbers.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        PageNumber requestPageNumber = new PageNumber();
        requestPageNumber.setAlignment("center");
        requestPageNumber.setFormat("{PAGE} of {NUMPAGES}");

        InsertPageNumbersRequest request = new InsertPageNumbersRequest(
            remoteFileName,
            requestPageNumber,
            remoteDataFolder,
            null,
            null,
            null,
            TestInitializer.RemoteTestOut + "/" + remoteFileName,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.insertPageNumbers(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting field.
     */
    @Test
    public void testDeleteField() throws ApiException, IOException
    {
        String localFileName = "GetField.docx";
        String remoteFileName = "TestDeleteField.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFieldRequest request = new DeleteFieldRequest(
            remoteFileName,
            0,
            "sections/0/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteField(request);
    }

    /*
     * Test for deleting field without node path.
     */
    @Test
    public void testDeleteFieldWithoutNodePath() throws ApiException, IOException
    {
        String localFileName = "GetField.docx";
        String remoteFileName = "TestDeleteFieldWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, fieldFolder + "/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFieldRequest request = new DeleteFieldRequest(
            remoteFileName,
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteField(request);
    }

    /*
     * Test for deleting paragraph fields.
     */
    @Test
    public void testDeleteParagraphFields() throws ApiException, IOException
    {
        String localFileName = "test_multi_pages.docx";
        String remoteFileName = "TestDeleteParagraphFields.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFieldsRequest request = new DeleteFieldsRequest(
            remoteFileName,
            "paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFields(request);
    }

    /*
     * Test for deleting paragraph fields without node path.
     */
    @Test
    public void testDeleteParagraphFieldsWithoutNodePath() throws ApiException, IOException
    {
        String localFileName = "test_multi_pages.docx";
        String remoteFileName = "TestDeleteParagraphFieldsWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFieldsRequest request = new DeleteFieldsRequest(
            remoteFileName,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFields(request);
    }

    /*
     * Test for deleting section fields.
     */
    @Test
    public void testDeleteSectionFields() throws ApiException, IOException
    {
        String localFileName = "test_multi_pages.docx";
        String remoteFileName = "TestDeleteSectionFields.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFieldsRequest request = new DeleteFieldsRequest(
            remoteFileName,
            "sections/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFields(request);
    }

    /*
     * Test for deleting section fields without node path.
     */
    @Test
    public void testDeleteSectionFieldsWithoutNodePath() throws ApiException, IOException
    {
        String localFileName = "test_multi_pages.docx";
        String remoteFileName = "TestDeleteSectionFieldsWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFieldsRequest request = new DeleteFieldsRequest(
            remoteFileName,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFields(request);
    }

    /*
     * Test for deleting paragraph fields in section.
     */
    @Test
    public void testDeleteSectionParagraphFields() throws ApiException, IOException
    {
        String localFileName = "test_multi_pages.docx";
        String remoteFileName = "TestDeleteSectionParagraphFields.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFieldsRequest request = new DeleteFieldsRequest(
            remoteFileName,
            "sections/0/paragraphs/0",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFields(request);
    }

    /*
     * Test for deleting fields.
     */
    @Test
    public void testDeleteDocumentFields() throws ApiException, IOException
    {
        String localFileName = "test_multi_pages.docx";
        String remoteFileName = "TestDeleteSectionParagraphFields.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteFieldsRequest request = new DeleteFieldsRequest(
            remoteFileName,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteFields(request);
    }

    /*
     * Test for posting updated fields.
     */
    @Test
    public void testUpdateDocumentFields() throws ApiException, IOException
    {
        String localFileName = "test_multi_pages.docx";
        String remoteFileName = "TestUpdateDocumentFields.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, "Common/" + localFileName),
            remoteDataFolder + "/" + remoteFileName
        );

        UpdateFieldsRequest request = new UpdateFieldsRequest(
            remoteFileName,
            remoteDataFolder,
            null,
            null,
            null,
            null
        );

        DocumentResponse result = TestInitializer.wordsApi.updateFields(request);
        assertNotNull(result);
    }
}
