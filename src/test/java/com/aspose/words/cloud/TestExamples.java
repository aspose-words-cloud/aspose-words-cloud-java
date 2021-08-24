/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestExamples.java">
 *   Copyright (c) 2021 Aspose.Words for Cloud
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
package com.aspose.words.cloud;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.api.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import junit.framework.TestCase;
import org.junit.Test;

public class TestExamples extends TestCase
{
    private ApiClient apiClient;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
        apiClient = TestInitializer.apiClient;
    }

    @Test
    public void testAcceptAllRevisions() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        String fileName  = "test_doc.docx";

        // Upload original document to cloud storage.
        byte[] myVar1 = Files.readAllBytes(Paths.get(documentsDir, fileName).toAbsolutePath());
        String myVar2 = fileName;
        UploadFileRequest uploadFileRequest = new UploadFileRequest(myVar1, myVar2, null);
        wordsApi.uploadFile(uploadFileRequest);

        // Calls AcceptAllRevisions method for document in cloud.
        String myVar3 = fileName;
        AcceptAllRevisionsRequest request = new AcceptAllRevisionsRequest(myVar3, null, null, null, null, null);
        wordsApi.acceptAllRevisions(request);
    }

    @Test
    public void testAcceptAllRevisionsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        AcceptAllRevisionsOnlineRequest acceptRequest = new AcceptAllRevisionsOnlineRequest(requestDocument, null, null, null);
        wordsApi.acceptAllRevisionsOnline(acceptRequest);
    }

    @Test
    public void testAppendDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        DocumentEntry requestDocumentListDocumentEntries0 = new DocumentEntry();
        requestDocumentListDocumentEntries0.setHref(remoteFileName);
        requestDocumentListDocumentEntries0.setImportFormatMode("KeepSourceFormatting");

        ArrayList<DocumentEntry> requestDocumentListDocumentEntries = new ArrayList<DocumentEntry>();
        requestDocumentListDocumentEntries.add(requestDocumentListDocumentEntries0);

        DocumentEntryList requestDocumentList = new DocumentEntryList();
        requestDocumentList.setDocumentEntries(requestDocumentListDocumentEntries);

        AppendDocumentRequest appendRequest = new AppendDocumentRequest(remoteFileName, requestDocumentList, null, null, null, null, null, null, null);
        wordsApi.appendDocument(appendRequest);
    }

    @Test
    public void testAppendDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DocumentEntry requestDocumentListDocumentEntries0 = new DocumentEntry();
        requestDocumentListDocumentEntries0.setHref("Sample.docx");
        requestDocumentListDocumentEntries0.setImportFormatMode("KeepSourceFormatting");

        ArrayList<DocumentEntry> requestDocumentListDocumentEntries = new ArrayList<DocumentEntry>();
        requestDocumentListDocumentEntries.add(requestDocumentListDocumentEntries0);

        DocumentEntryList requestDocumentList = new DocumentEntryList();
        requestDocumentList.setDocumentEntries(requestDocumentListDocumentEntries);

        AppendDocumentOnlineRequest appendRequest = new AppendDocumentOnlineRequest(requestDocument, requestDocumentList, null, null, null, null, null);
        wordsApi.appendDocumentOnline(appendRequest);
    }

    @Test
    public void testApplyStyleToDocumentElement() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleApply requestStyleApply = new StyleApply();
        requestStyleApply.setStyleName("Heading 1");

        ApplyStyleToDocumentElementRequest applyStyleRequest = new ApplyStyleToDocumentElementRequest("Sample.docx", "paragraphs/1/paragraphFormat", requestStyleApply, null, null, null, null, null, null, null);
        wordsApi.applyStyleToDocumentElement(applyStyleRequest);
    }

    @Test
    public void testApplyStyleToDocumentElementOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        StyleApply requestStyleApply = new StyleApply();
        requestStyleApply.setStyleName("Heading 1");

        ApplyStyleToDocumentElementOnlineRequest applyStyleRequest = new ApplyStyleToDocumentElementOnlineRequest(requestDocument, "paragraphs/1/paragraphFormat", requestStyleApply, null, null, null, null, null);
        wordsApi.applyStyleToDocumentElementOnline(applyStyleRequest);
    }

    @Test
    public void testBuildReport() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ArrayList<ReportBuildOptions> requestReportEngineSettingsReportBuildOptions = new ArrayList<ReportBuildOptions>();
        requestReportEngineSettingsReportBuildOptions.add(ReportBuildOptions.ALLOWMISSINGMEMBERS);
        requestReportEngineSettingsReportBuildOptions.add(ReportBuildOptions.REMOVEEMPTYPARAGRAPHS);

        ReportEngineSettings requestReportEngineSettings = new ReportEngineSettings();
        requestReportEngineSettings.setDataSourceType(ReportEngineSettings.DataSourceTypeEnum.JSON);
        requestReportEngineSettings.setReportBuildOptions(requestReportEngineSettingsReportBuildOptions);

        BuildReportRequest buildReportRequest = new BuildReportRequest("Sample.docx", "Data.json", requestReportEngineSettings, null, null, null, null, null);
        wordsApi.buildReport(buildReportRequest);
    }

    @Test
    public void testBuildReportOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestTemplate = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        ReportEngineSettings requestReportEngineSettings = new ReportEngineSettings();
        requestReportEngineSettings.setDataSourceType(ReportEngineSettings.DataSourceTypeEnum.JSON);
        requestReportEngineSettings.setDataSourceName("persons");

        BuildReportOnlineRequest buildReportRequest = new BuildReportOnlineRequest(requestTemplate, "Data.json", requestReportEngineSettings, null);
        wordsApi.buildReportOnline(buildReportRequest);
    }

    @Test
    public void testClassify() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ClassifyRequest classifyRequest = new ClassifyRequest("Try text classification", "3");
        wordsApi.classify(classifyRequest);
    }

    @Test
    public void testClassifyDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ClassifyDocumentRequest classifyRequest = new ClassifyDocumentRequest("Sample.docx", null, null, null, null, "3", null);
        wordsApi.classifyDocument(classifyRequest);
    }

    @Test
    public void testClassifyDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        ClassifyDocumentOnlineRequest classifyRequest = new ClassifyDocumentOnlineRequest(requestDocument, null, null, "3", null);
        wordsApi.classifyDocumentOnline(classifyRequest);
    }

    @Test
    public void testCompareDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CompareData requestCompareData = new CompareData();
        requestCompareData.setAuthor("author");
        requestCompareData.setComparingWithDocument("TestCompareDocument2.doc");
        requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));

        CompareDocumentRequest compareRequest = new CompareDocumentRequest("TestCompareDocument1.doc", requestCompareData, null, null, null, null, "/TestCompareDocumentOut.doc");
        wordsApi.compareDocument(compareRequest);
    }

    @Test
    public void testCompareDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "compareTestDoc1.doc").toAbsolutePath());
        CompareData requestCompareData = new CompareData();
        requestCompareData.setAuthor("author");
        requestCompareData.setComparingWithDocument("TestCompareDocument2.doc");
        requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));

        byte[] requestComparingDocument = Files.readAllBytes(Paths.get(documentsDir, "compareTestDoc2.doc").toAbsolutePath());
        CompareDocumentOnlineRequest compareRequest = new CompareDocumentOnlineRequest(requestDocument, requestCompareData, requestComparingDocument, null, null, "/TestCompareDocumentOut.doc");
        wordsApi.compareDocumentOnline(compareRequest);
    }

    @Test
    public void testConvertDocument() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        ConvertDocumentRequest convertRequest = new ConvertDocumentRequest(requestDocument, "pdf", null, null, null, null);
        wordsApi.convertDocument(convertRequest);
    }

    @Test
    public void testCopyFile() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CopyFileRequest copyRequest = new CopyFileRequest("/TestCopyFileDest.docx", "Sample.docx", null, null, null);
        wordsApi.copyFile(copyRequest);
    }

    @Test
    public void testCopyFolder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String folderToCopy = "/TestCopyFolder";

        CopyFolderRequest copyRequest = new CopyFolderRequest(folderToCopy + "Dest", folderToCopy + "Src", null, null);
        wordsApi.copyFolder(copyRequest);
    }

    @Test
    public void testCopyStyle() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleCopy requestStyleCopy = new StyleCopy();
        requestStyleCopy.setStyleName("Heading 1");

        CopyStyleRequest copyRequest = new CopyStyleRequest("Sample.docx", requestStyleCopy, null, null, null, null, null, null, null);
        wordsApi.copyStyle(copyRequest);
    }

    @Test
    public void testCopyStyleOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        StyleCopy requestStyleCopy = new StyleCopy();
        requestStyleCopy.setStyleName("Heading 1");

        CopyStyleOnlineRequest copyRequest = new CopyStyleOnlineRequest(requestDocument, requestStyleCopy, null, null, null, null, null);
        wordsApi.copyStyleOnline(copyRequest);
    }

    @Test
    public void testCreateDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CreateDocumentRequest createRequest = new CreateDocumentRequest("Sample.docx", null, null);
        wordsApi.createDocument(createRequest);
    }

    @Test
    public void testCreateFolder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CreateFolderRequest createRequest = new CreateFolderRequest("/TestCreateFolder", null);
        wordsApi.createFolder(createRequest);
    }

    @Test
    public void testCreateOrUpdateDocumentProperty() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DocumentPropertyCreateOrUpdate requestProperty = new DocumentPropertyCreateOrUpdate();
        requestProperty.setValue("Imran Anwar");

        CreateOrUpdateDocumentPropertyRequest createRequest = new CreateOrUpdateDocumentPropertyRequest("Sample.docx", "AsposeAuthor", requestProperty, null, null, null, null, null, null, null);
        wordsApi.createOrUpdateDocumentProperty(createRequest);
    }

    @Test
    public void testCreateOrUpdateDocumentPropertyOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DocumentPropertyCreateOrUpdate requestProperty = new DocumentPropertyCreateOrUpdate();
        requestProperty.setValue("Imran Anwar");

        CreateOrUpdateDocumentPropertyOnlineRequest createRequest = new CreateOrUpdateDocumentPropertyOnlineRequest(requestDocument, "AsposeAuthor", requestProperty, null, null, null, null, null);
        wordsApi.createOrUpdateDocumentPropertyOnline(createRequest);
    }

    @Test
    public void testDeleteAllParagraphTabStops() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteAllParagraphTabStopsRequest deleteRequest = new DeleteAllParagraphTabStopsRequest("Sample.docx", 0, null, null, null, null, null, null);
        wordsApi.deleteAllParagraphTabStops(deleteRequest);
    }

    @Test
    public void testDeleteAllParagraphTabStopsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteAllParagraphTabStopsOnlineRequest deleteRequest = new DeleteAllParagraphTabStopsOnlineRequest(requestDocument, 0, null, null, null, null);
        wordsApi.deleteAllParagraphTabStopsOnline(deleteRequest);
    }

    @Test
    public void testDeleteBorder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteBorderRequest deleteRequest = new DeleteBorderRequest("Sample.docx", "left", "tables/1/rows/0/cells/0", null, null, null, null, null, null, null);
        wordsApi.deleteBorder(deleteRequest);
    }

    @Test
    public void testDeleteBorderOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteBorderOnlineRequest deleteRequest = new DeleteBorderOnlineRequest(requestDocument, "left", "tables/1/rows/0/cells/0", null, null, null, null, null);
        wordsApi.deleteBorderOnline(deleteRequest);
    }

    @Test
    public void testDeleteBorders() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteBordersRequest deleteRequest = new DeleteBordersRequest("Sample.docx", "tables/1/rows/0/cells/0", null, null, null, null, null, null, null);
        wordsApi.deleteBorders(deleteRequest);
    }

    @Test
    public void testDeleteBordersOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteBordersOnlineRequest deleteRequest = new DeleteBordersOnlineRequest(requestDocument, "tables/1/rows/0/cells/0", null, null, null, null, null);
        wordsApi.deleteBordersOnline(deleteRequest);
    }

    @Test
    public void testDeleteComment() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteCommentRequest deleteRequest = new DeleteCommentRequest("Sample.docx", 0, null, null, null, null, null, null, null);
        wordsApi.deleteComment(deleteRequest);
    }

    @Test
    public void testDeleteCommentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteCommentOnlineRequest deleteRequest = new DeleteCommentOnlineRequest(requestDocument, 0, null, null, null, null, null);
        wordsApi.deleteCommentOnline(deleteRequest);
    }

    @Test
    public void testDeleteComments() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteCommentsRequest deleteRequest = new DeleteCommentsRequest("Sample.docx", null, null, null, null, null, null, null);
        wordsApi.deleteComments(deleteRequest);
    }

    @Test
    public void testDeleteCommentsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteCommentsOnlineRequest deleteRequest = new DeleteCommentsOnlineRequest(requestDocument, null, null, null, null, null);
        wordsApi.deleteCommentsOnline(deleteRequest);
    }

    @Test
    public void testDeleteCustomXmlPart() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteCustomXmlPartRequest deleteRequest = new DeleteCustomXmlPartRequest("Sample.docx", 0, null, null, null, null, null, null, null);
        wordsApi.deleteCustomXmlPart(deleteRequest);
    }

    @Test
    public void testDeleteCustomXmlPartOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteCustomXmlPartOnlineRequest deleteRequest = new DeleteCustomXmlPartOnlineRequest(requestDocument, 0, null, null, null, null, null);
        wordsApi.deleteCustomXmlPartOnline(deleteRequest);
    }

    @Test
    public void testDeleteCustomXmlParts() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteCustomXmlPartsRequest deleteRequest = new DeleteCustomXmlPartsRequest("Sample.docx", null, null, null, null, null, null, null);
        wordsApi.deleteCustomXmlParts(deleteRequest);
    }

    @Test
    public void testDeleteCustomXmlPartsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteCustomXmlPartsOnlineRequest deleteRequest = new DeleteCustomXmlPartsOnlineRequest(requestDocument, null, null, null, null, null);
        wordsApi.deleteCustomXmlPartsOnline(deleteRequest);
    }

    @Test
    public void testDeleteDocumentProperty() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteDocumentPropertyRequest deleteRequest = new DeleteDocumentPropertyRequest("Sample.docx", "testProp", null, null, null, null, null, null, null);
        wordsApi.deleteDocumentProperty(deleteRequest);
    }

    @Test
    public void testDeleteDocumentPropertyOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteDocumentPropertyOnlineRequest deleteRequest = new DeleteDocumentPropertyOnlineRequest(requestDocument, "testProp", null, null, null, null, null);
        wordsApi.deleteDocumentPropertyOnline(deleteRequest);
    }

    @Test
    public void testDeleteDrawingObject() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteDrawingObjectRequest deleteRequest = new DeleteDrawingObjectRequest("Sample.docx", 0, null, null, null, null, null, null, null, null);
        wordsApi.deleteDrawingObject(deleteRequest);
    }

    @Test
    public void testDeleteDrawingObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteDrawingObjectOnlineRequest deleteRequest = new DeleteDrawingObjectOnlineRequest(requestDocument, 0, null, null, null, null, null, null);
        wordsApi.deleteDrawingObjectOnline(deleteRequest);
    }

    @Test
    public void testDeleteField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFieldRequest deleteRequest = new DeleteFieldRequest("Sample.docx", 0, null, null, null, null, null, null, null, null);
        wordsApi.deleteField(deleteRequest);
    }

    @Test
    public void testDeleteFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteFieldOnlineRequest deleteRequest = new DeleteFieldOnlineRequest(requestDocument, 0, "sections/0/paragraphs/0", null, null, null, null, null);
        wordsApi.deleteFieldOnline(deleteRequest);
    }

    @Test
    public void testDeleteFields() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFieldsRequest deleteRequest = new DeleteFieldsRequest("Sample.docx", null, null, null, null, null, null, null, null);
        wordsApi.deleteFields(deleteRequest);
    }

    @Test
    public void testDeleteFieldsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteFieldsOnlineRequest deleteRequest = new DeleteFieldsOnlineRequest(requestDocument, null, null, null, null, null, null);
        wordsApi.deleteFieldsOnline(deleteRequest);
    }

    @Test
    public void testDeleteFile() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFileRequest deleteRequest = new DeleteFileRequest("Sample.docx", null, null);
        wordsApi.deleteFile(deleteRequest);
    }

    @Test
    public void testDeleteFolder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFolderRequest deleteRequest = new DeleteFolderRequest("", null, null);
        wordsApi.deleteFolder(deleteRequest);
    }

    @Test
    public void testDeleteFootnote() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFootnoteRequest deleteRequest = new DeleteFootnoteRequest("Sample.docx", 0, null, null, null, null, null, null, null, null);
        wordsApi.deleteFootnote(deleteRequest);
    }

    @Test
    public void testDeleteFootnoteOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        DeleteFootnoteOnlineRequest deleteRequest = new DeleteFootnoteOnlineRequest(requestDocument, 0, null, null, null, null, null, null);
        wordsApi.deleteFootnoteOnline(deleteRequest);
    }

    @Test
    public void testDeleteFormField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFormFieldRequest deleteRequest = new DeleteFormFieldRequest("Sample.docx", 0, null, null, null, null, null, null, null, null);
        wordsApi.deleteFormField(deleteRequest);
    }

    @Test
    public void testDeleteFormFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteFormFieldOnlineRequest deleteRequest = new DeleteFormFieldOnlineRequest(requestDocument, 0, "sections/0", null, null, null, null, null);
        wordsApi.deleteFormFieldOnline(deleteRequest);
    }

    @Test
    public void testDeleteHeaderFooter() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteHeaderFooterRequest deleteRequest = new DeleteHeaderFooterRequest("Sample.docx", "", 0, null, null, null, null, null, null, null);
        wordsApi.deleteHeaderFooter(deleteRequest);
    }

    @Test
    public void testDeleteHeaderFooterOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        DeleteHeaderFooterOnlineRequest deleteRequest = new DeleteHeaderFooterOnlineRequest(requestDocument, "", 0, null, null, null, null, null);
        wordsApi.deleteHeaderFooterOnline(deleteRequest);
    }

    @Test
    public void testDeleteHeadersFooters() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteHeadersFootersRequest deleteRequest = new DeleteHeadersFootersRequest("Sample.docx", "", null, null, null, null, null, null, null, null);
        wordsApi.deleteHeadersFooters(deleteRequest);
    }

    @Test
    public void testDeleteHeadersFootersOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        DeleteHeadersFootersOnlineRequest deleteRequest = new DeleteHeadersFootersOnlineRequest(requestDocument, "", null, null, null, null, null, null);
        wordsApi.deleteHeadersFootersOnline(deleteRequest);
    }

    @Test
    public void testDeleteMacros() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteMacrosRequest deleteRequest = new DeleteMacrosRequest("Sample.docx", null, null, null, null, null, null, null);
        wordsApi.deleteMacros(deleteRequest);
    }

    @Test
    public void testDeleteMacrosOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteMacrosOnlineRequest deleteRequest = new DeleteMacrosOnlineRequest(requestDocument, null, null, null, null, null);
        wordsApi.deleteMacrosOnline(deleteRequest);
    }

    @Test
    public void testDeleteOfficeMathObject() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteOfficeMathObjectRequest deleteRequest = new DeleteOfficeMathObjectRequest("Sample.docx", 0, null, null, null, null, null, null, null, null);
        wordsApi.deleteOfficeMathObject(deleteRequest);
    }

    @Test
    public void testDeleteOfficeMathObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteOfficeMathObjectOnlineRequest deleteRequest = new DeleteOfficeMathObjectOnlineRequest(requestDocument, 0, null, null, null, null, null, null);
        wordsApi.deleteOfficeMathObjectOnline(deleteRequest);
    }

    @Test
    public void testDeleteParagraph() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteParagraphRequest deleteRequest = new DeleteParagraphRequest("Sample.docx", 0, null, null, null, null, null, null, null, null);
        wordsApi.deleteParagraph(deleteRequest);
    }

    @Test
    public void testDeleteParagraphListFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteParagraphListFormatRequest deleteRequest = new DeleteParagraphListFormatRequest("Sample.docx", 0, null, null, null, null, null, null, null, null);
        wordsApi.deleteParagraphListFormat(deleteRequest);
    }

    @Test
    public void testDeleteParagraphListFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        DeleteParagraphListFormatOnlineRequest deleteRequest = new DeleteParagraphListFormatOnlineRequest(requestDocument, 0, null, null, null, null, null, null);
        wordsApi.deleteParagraphListFormatOnline(deleteRequest);
    }

    @Test
    public void testDeleteParagraphOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteParagraphOnlineRequest deleteRequest = new DeleteParagraphOnlineRequest(requestDocument, 0, null, null, null, null, null, null);
        wordsApi.deleteParagraphOnline(deleteRequest);
    }

    @Test
    public void testDeleteParagraphTabStop() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteParagraphTabStopRequest deleteRequest = new DeleteParagraphTabStopRequest("Sample.docx", (double)72.0, 0, null, null, null, null, null, null);
        wordsApi.deleteParagraphTabStop(deleteRequest);
    }

    @Test
    public void testDeleteParagraphTabStopOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteParagraphTabStopOnlineRequest deleteRequest = new DeleteParagraphTabStopOnlineRequest(requestDocument, (double)72.0, 0, null, null, null, null);
        wordsApi.deleteParagraphTabStopOnline(deleteRequest);
    }

    @Test
    public void testDeleteRun() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteRunRequest deleteRequest = new DeleteRunRequest("Sample.docx", "paragraphs/1", 0, null, null, null, null, null, null, null);
        wordsApi.deleteRun(deleteRequest);
    }

    @Test
    public void testDeleteRunOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        DeleteRunOnlineRequest deleteRequest = new DeleteRunOnlineRequest(requestDocument, "paragraphs/1", 0, null, null, null, null, null);
        wordsApi.deleteRunOnline(deleteRequest);
    }

    @Test
    public void testDeleteSection() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteSectionRequest deleteRequest = new DeleteSectionRequest("Sample.docx", 0, null, null, null, null, null, null, null);
        wordsApi.deleteSection(deleteRequest);
    }

    @Test
    public void testDeleteSectionOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteSectionOnlineRequest deleteRequest = new DeleteSectionOnlineRequest(requestDocument, 0, null, null, null, null, null);
        wordsApi.deleteSectionOnline(deleteRequest);
    }

    @Test
    public void testDeleteTable() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteTableRequest deleteRequest = new DeleteTableRequest("Sample.docx", 1, null, null, null, null, null, null, null, null);
        wordsApi.deleteTable(deleteRequest);
    }

    @Test
    public void testDeleteTableCell() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteTableCellRequest deleteRequest = new DeleteTableCellRequest("Sample.docx", "sections/0/tables/2/rows/0", 0, null, null, null, null, null, null, null);
        wordsApi.deleteTableCell(deleteRequest);
    }

    @Test
    public void testDeleteTableCellOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteTableCellOnlineRequest deleteRequest = new DeleteTableCellOnlineRequest(requestDocument, "sections/0/tables/2/rows/0", 0, null, null, null, null, null);
        wordsApi.deleteTableCellOnline(deleteRequest);
    }

    @Test
    public void testDeleteTableOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteTableOnlineRequest deleteRequest = new DeleteTableOnlineRequest(requestDocument, 1, null, null, null, null, null, null);
        wordsApi.deleteTableOnline(deleteRequest);
    }

    @Test
    public void testDeleteTableRow() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteTableRowRequest deleteRequest = new DeleteTableRowRequest("Sample.docx", "tables/1", 0, null, null, null, null, null, null, null);
        wordsApi.deleteTableRow(deleteRequest);
    }

    @Test
    public void testDeleteTableRowOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteTableRowOnlineRequest deleteRequest = new DeleteTableRowOnlineRequest(requestDocument, "tables/1", 0, null, null, null, null, null);
        wordsApi.deleteTableRowOnline(deleteRequest);
    }

    @Test
    public void testDeleteWatermark() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteWatermarkRequest deleteRequest = new DeleteWatermarkRequest("Sample.docx", null, null, null, null, null, null, null);
        wordsApi.deleteWatermark(deleteRequest);
    }

    @Test
    public void testDeleteWatermarkOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DeleteWatermarkOnlineRequest deleteRequest = new DeleteWatermarkOnlineRequest(requestDocument, null, null, null, null, null);
        wordsApi.deleteWatermarkOnline(deleteRequest);
    }

    @Test
    public void testDownloadFile() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DownloadFileRequest downloadRequest = new DownloadFileRequest("Sample.docx", null, null);
        wordsApi.downloadFile(downloadRequest);
    }

    @Test
    public void testExecuteMailMerge() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ExecuteMailMergeRequest mailMergeRequest = new ExecuteMailMergeRequest("Sample.docx", "TestExecuteTemplateData.txt", null, null, null, null, null, null, null, null, null);
        wordsApi.executeMailMerge(mailMergeRequest);
    }

    @Test
    public void testExecuteMailMergeOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestTemplate = Files.readAllBytes(Paths.get(documentsDir, "TestExecuteTemplate.doc").toAbsolutePath());
        byte[] requestData = Files.readAllBytes(Paths.get(documentsDir, "TestExecuteTemplateData.txt").toAbsolutePath());
        ExecuteMailMergeOnlineRequest mailMergeRequest = new ExecuteMailMergeOnlineRequest(requestTemplate, requestData, null, null, null);
        wordsApi.executeMailMergeOnline(mailMergeRequest);
    }

    @Test
    public void testGetAvailableFonts() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetAvailableFontsRequest request = new GetAvailableFontsRequest(null);
        wordsApi.getAvailableFonts(request);
    }

    @Test
    public void testGetBookmarkByName() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBookmarkByNameRequest request = new GetBookmarkByNameRequest("Sample.docx", "aspose", null, null, null, null);
        wordsApi.getBookmarkByName(request);
    }

    @Test
    public void testGetBookmarkByNameOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetBookmarkByNameOnlineRequest request = new GetBookmarkByNameOnlineRequest(requestDocument, "aspose", null, null);
        wordsApi.getBookmarkByNameOnline(request);
    }

    @Test
    public void testGetBookmarks() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBookmarksRequest request = new GetBookmarksRequest("Sample.docx", null, null, null, null);
        wordsApi.getBookmarks(request);
    }

    @Test
    public void testGetBookmarksOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetBookmarksOnlineRequest request = new GetBookmarksOnlineRequest(requestDocument, null, null);
        wordsApi.getBookmarksOnline(request);
    }

    @Test
    public void testGetBorder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBorderRequest request = new GetBorderRequest("Sample.docx", "left", "tables/1/rows/0/cells/0", null, null, null, null);
        wordsApi.getBorder(request);
    }

    @Test
    public void testGetBorderOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetBorderOnlineRequest request = new GetBorderOnlineRequest(requestDocument, "left", "tables/1/rows/0/cells/0", null, null);
        wordsApi.getBorderOnline(request);
    }

    @Test
    public void testGetBorders() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBordersRequest request = new GetBordersRequest("Sample.docx", "tables/1/rows/0/cells/0", null, null, null, null);
        wordsApi.getBorders(request);
    }

    @Test
    public void testGetBordersOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetBordersOnlineRequest request = new GetBordersOnlineRequest(requestDocument, "tables/1/rows/0/cells/0", null, null);
        wordsApi.getBordersOnline(request);
    }

    @Test
    public void testGetComment() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCommentRequest request = new GetCommentRequest("Sample.docx", 0, null, null, null, null);
        wordsApi.getComment(request);
    }

    @Test
    public void testGetCommentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetCommentOnlineRequest request = new GetCommentOnlineRequest(requestDocument, 0, null, null);
        wordsApi.getCommentOnline(request);
    }

    @Test
    public void testGetComments() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCommentsRequest request = new GetCommentsRequest("Sample.docx", null, null, null, null);
        wordsApi.getComments(request);
    }

    @Test
    public void testGetCommentsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetCommentsOnlineRequest request = new GetCommentsOnlineRequest(requestDocument, null, null);
        wordsApi.getCommentsOnline(request);
    }

    @Test
    public void testGetCustomXmlPart() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCustomXmlPartRequest request = new GetCustomXmlPartRequest("Sample.docx", 0, null, null, null, null);
        wordsApi.getCustomXmlPart(request);
    }

    @Test
    public void testGetCustomXmlPartOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetCustomXmlPartOnlineRequest request = new GetCustomXmlPartOnlineRequest(requestDocument, 0, null, null);
        wordsApi.getCustomXmlPartOnline(request);
    }

    @Test
    public void testGetCustomXmlParts() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCustomXmlPartsRequest request = new GetCustomXmlPartsRequest("Sample.docx", null, null, null, null);
        wordsApi.getCustomXmlParts(request);
    }

    @Test
    public void testGetCustomXmlPartsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetCustomXmlPartsOnlineRequest request = new GetCustomXmlPartsOnlineRequest(requestDocument, null, null);
        wordsApi.getCustomXmlPartsOnline(request);
    }

    @Test
    public void testGetDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentRequest request = new GetDocumentRequest("Sample.docx", null, null, null, null);
        wordsApi.getDocument(request);
    }

    @Test
    public void testGetDocumentDrawingObjectByIndex() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectByIndexRequest request = new GetDocumentDrawingObjectByIndexRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getDocumentDrawingObjectByIndex(request);
    }

    @Test
    public void testGetDocumentDrawingObjectByIndexOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetDocumentDrawingObjectByIndexOnlineRequest request = new GetDocumentDrawingObjectByIndexOnlineRequest(requestDocument, 0, "sections/0", null, null);
        wordsApi.getDocumentDrawingObjectByIndexOnline(request);
    }

    @Test
    public void testGetDocumentDrawingObjectImageData() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectImageDataRequest request = new GetDocumentDrawingObjectImageDataRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getDocumentDrawingObjectImageData(request);
    }

    @Test
    public void testGetDocumentDrawingObjectImageDataOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetDocumentDrawingObjectImageDataOnlineRequest request = new GetDocumentDrawingObjectImageDataOnlineRequest(requestDocument, 0, "sections/0", null, null);
        wordsApi.getDocumentDrawingObjectImageDataOnline(request);
    }

    @Test
    public void testGetDocumentDrawingObjectOleData() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectOleDataRequest request = new GetDocumentDrawingObjectOleDataRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getDocumentDrawingObjectOleData(request);
    }

    @Test
    public void testGetDocumentDrawingObjectOleDataOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetDocumentDrawingObjectOleDataOnlineRequest request = new GetDocumentDrawingObjectOleDataOnlineRequest(requestDocument, 0, "sections/0", null, null);
        wordsApi.getDocumentDrawingObjectOleDataOnline(request);
    }

    @Test
    public void testGetDocumentDrawingObjects() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectsRequest request = new GetDocumentDrawingObjectsRequest("Sample.docx", null, null, null, null, null);
        wordsApi.getDocumentDrawingObjects(request);
    }

    @Test
    public void testGetDocumentDrawingObjectsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetDocumentDrawingObjectsOnlineRequest request = new GetDocumentDrawingObjectsOnlineRequest(requestDocument, "sections/0", null, null);
        wordsApi.getDocumentDrawingObjectsOnline(request);
    }

    @Test
    public void testGetDocumentFieldNames() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentFieldNamesRequest request = new GetDocumentFieldNamesRequest("Sample.docx", null, null, null, null, null);
        wordsApi.getDocumentFieldNames(request);
    }

    @Test
    public void testGetDocumentFieldNamesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestTemplate = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetDocumentFieldNamesOnlineRequest request = new GetDocumentFieldNamesOnlineRequest(requestTemplate, null, null, true);
        wordsApi.getDocumentFieldNamesOnline(request);
    }

    @Test
    public void testGetDocumentHyperlinkByIndex() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentHyperlinkByIndexRequest request = new GetDocumentHyperlinkByIndexRequest("Sample.docx", 0, null, null, null, null);
        wordsApi.getDocumentHyperlinkByIndex(request);
    }

    @Test
    public void testGetDocumentHyperlinkByIndexOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetDocumentHyperlinkByIndexOnlineRequest request = new GetDocumentHyperlinkByIndexOnlineRequest(requestDocument, 0, null, null);
        wordsApi.getDocumentHyperlinkByIndexOnline(request);
    }

    @Test
    public void testGetDocumentHyperlinks() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentHyperlinksRequest request = new GetDocumentHyperlinksRequest("Sample.docx", null, null, null, null);
        wordsApi.getDocumentHyperlinks(request);
    }

    @Test
    public void testGetDocumentHyperlinksOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetDocumentHyperlinksOnlineRequest request = new GetDocumentHyperlinksOnlineRequest(requestDocument, null, null);
        wordsApi.getDocumentHyperlinksOnline(request);
    }

    @Test
    public void testGetDocumentProperties() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentPropertiesRequest request = new GetDocumentPropertiesRequest("Sample.docx", null, null, null, null);
        wordsApi.getDocumentProperties(request);
    }

    @Test
    public void testGetDocumentPropertiesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetDocumentPropertiesOnlineRequest request = new GetDocumentPropertiesOnlineRequest(requestDocument, null, null);
        wordsApi.getDocumentPropertiesOnline(request);
    }

    @Test
    public void testGetDocumentProperty() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentPropertyRequest request = new GetDocumentPropertyRequest("Sample.docx", "Author", null, null, null, null);
        wordsApi.getDocumentProperty(request);
    }

    @Test
    public void testGetDocumentPropertyOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetDocumentPropertyOnlineRequest request = new GetDocumentPropertyOnlineRequest(requestDocument, "Author", null, null);
        wordsApi.getDocumentPropertyOnline(request);
    }

    @Test
    public void testGetDocumentProtection() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentProtectionRequest request = new GetDocumentProtectionRequest("Sample.docx", null, null, null, null);
        wordsApi.getDocumentProtection(request);
    }

    @Test
    public void testGetDocumentProtectionOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetDocumentProtectionOnlineRequest request = new GetDocumentProtectionOnlineRequest(requestDocument, null, null);
        wordsApi.getDocumentProtectionOnline(request);
    }

    @Test
    public void testGetDocumentStatistics() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentStatisticsRequest request = new GetDocumentStatisticsRequest("Sample.docx", null, null, null, null, null, null, null);
        wordsApi.getDocumentStatistics(request);
    }

    @Test
    public void testGetDocumentStatisticsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetDocumentStatisticsOnlineRequest request = new GetDocumentStatisticsOnlineRequest(requestDocument, null, null, null, null, null);
        wordsApi.getDocumentStatisticsOnline(request);
    }

    @Test
    public void testGetDocumentWithFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentWithFormatRequest request = new GetDocumentWithFormatRequest("Sample.docx", "text", null, null, null, null, "/TestGetDocumentWithFormatAndOutPath.text", null);
        wordsApi.getDocumentWithFormat(request);
    }

    @Test
    public void testGetField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFieldRequest request = new GetFieldRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getField(request);
    }

    @Test
    public void testGetFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetFieldOnlineRequest request = new GetFieldOnlineRequest(requestDocument, 0, "sections/0/paragraphs/0", null, null);
        wordsApi.getFieldOnline(request);
    }

    @Test
    public void testGetFields() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFieldsRequest request = new GetFieldsRequest("Sample.docx", null, null, null, null, null);
        wordsApi.getFields(request);
    }

    @Test
    public void testGetFieldsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetFieldsOnlineRequest request = new GetFieldsOnlineRequest(requestDocument, "sections/0", null, null);
        wordsApi.getFieldsOnline(request);
    }

    @Test
    public void testGetFilesList() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFilesListRequest request = new GetFilesListRequest("", null);
        wordsApi.getFilesList(request);
    }

    @Test
    public void testGetFootnote() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFootnoteRequest request = new GetFootnoteRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getFootnote(request);
    }

    @Test
    public void testGetFootnoteOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        GetFootnoteOnlineRequest request = new GetFootnoteOnlineRequest(requestDocument, 0, null, null, null);
        wordsApi.getFootnoteOnline(request);
    }

    @Test
    public void testGetFootnotes() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFootnotesRequest request = new GetFootnotesRequest("Sample.docx", null, null, null, null, null);
        wordsApi.getFootnotes(request);
    }

    @Test
    public void testGetFootnotesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        GetFootnotesOnlineRequest request = new GetFootnotesOnlineRequest(requestDocument, null, null, null);
        wordsApi.getFootnotesOnline(request);
    }

    @Test
    public void testGetFormField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFormFieldRequest request = new GetFormFieldRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getFormField(request);
    }

    @Test
    public void testGetFormFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetFormFieldOnlineRequest request = new GetFormFieldOnlineRequest(requestDocument, 0, "sections/0", null, null);
        wordsApi.getFormFieldOnline(request);
    }

    @Test
    public void testGetFormFields() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFormFieldsRequest request = new GetFormFieldsRequest("Sample.docx", null, null, null, null, null);
        wordsApi.getFormFields(request);
    }

    @Test
    public void testGetFormFieldsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetFormFieldsOnlineRequest request = new GetFormFieldsOnlineRequest(requestDocument, "sections/0", null, null);
        wordsApi.getFormFieldsOnline(request);
    }

    @Test
    public void testGetHeaderFooter() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetHeaderFooterRequest request = new GetHeaderFooterRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getHeaderFooter(request);
    }

    @Test
    public void testGetHeaderFooterOfSection() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetHeaderFooterOfSectionRequest request = new GetHeaderFooterOfSectionRequest("Sample.docx", 0, 0, null, null, null, null, null);
        wordsApi.getHeaderFooterOfSection(request);
    }

    @Test
    public void testGetHeaderFooterOfSectionOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        GetHeaderFooterOfSectionOnlineRequest request = new GetHeaderFooterOfSectionOnlineRequest(requestDocument, 0, 0, null, null, null);
        wordsApi.getHeaderFooterOfSectionOnline(request);
    }

    @Test
    public void testGetHeaderFooterOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        GetHeaderFooterOnlineRequest request = new GetHeaderFooterOnlineRequest(requestDocument, 0, null, null, null);
        wordsApi.getHeaderFooterOnline(request);
    }

    @Test
    public void testGetHeaderFooters() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetHeaderFootersRequest request = new GetHeaderFootersRequest("Sample.docx", "", null, null, null, null, null);
        wordsApi.getHeaderFooters(request);
    }

    @Test
    public void testGetHeaderFootersOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        GetHeaderFootersOnlineRequest request = new GetHeaderFootersOnlineRequest(requestDocument, "", null, null, null);
        wordsApi.getHeaderFootersOnline(request);
    }

    @Test
    public void testGetList() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetListRequest request = new GetListRequest("TestGetLists.doc", 1, null, null, null, null);
        wordsApi.getList(request);
    }

    @Test
    public void testGetListOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        GetListOnlineRequest request = new GetListOnlineRequest(requestDocument, 1, null, null);
        wordsApi.getListOnline(request);
    }

    @Test
    public void testGetLists() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetListsRequest request = new GetListsRequest("TestGetLists.doc", null, null, null, null);
        wordsApi.getLists(request);
    }

    @Test
    public void testGetListsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        GetListsOnlineRequest request = new GetListsOnlineRequest(requestDocument, null, null);
        wordsApi.getListsOnline(request);
    }

    @Test
    public void testGetOfficeMathObject() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetOfficeMathObjectRequest request = new GetOfficeMathObjectRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getOfficeMathObject(request);
    }

    @Test
    public void testGetOfficeMathObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetOfficeMathObjectOnlineRequest request = new GetOfficeMathObjectOnlineRequest(requestDocument, 0, null, null, null);
        wordsApi.getOfficeMathObjectOnline(request);
    }

    @Test
    public void testGetOfficeMathObjects() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetOfficeMathObjectsRequest request = new GetOfficeMathObjectsRequest("Sample.docx", null, null, null, null, null);
        wordsApi.getOfficeMathObjects(request);
    }

    @Test
    public void testGetOfficeMathObjectsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetOfficeMathObjectsOnlineRequest request = new GetOfficeMathObjectsOnlineRequest(requestDocument, null, null, null);
        wordsApi.getOfficeMathObjectsOnline(request);
    }

    @Test
    public void testGetParagraph() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphRequest request = new GetParagraphRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getParagraph(request);
    }

    @Test
    public void testGetParagraphFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphFormatRequest request = new GetParagraphFormatRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getParagraphFormat(request);
    }

    @Test
    public void testGetParagraphFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetParagraphFormatOnlineRequest request = new GetParagraphFormatOnlineRequest(requestDocument, 0, null, null, null);
        wordsApi.getParagraphFormatOnline(request);
    }

    @Test
    public void testGetParagraphListFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphListFormatRequest request = new GetParagraphListFormatRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getParagraphListFormat(request);
    }

    @Test
    public void testGetParagraphListFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        GetParagraphListFormatOnlineRequest request = new GetParagraphListFormatOnlineRequest(requestDocument, 0, null, null, null);
        wordsApi.getParagraphListFormatOnline(request);
    }

    @Test
    public void testGetParagraphOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetParagraphOnlineRequest request = new GetParagraphOnlineRequest(requestDocument, 0, "sections/0", null, null);
        wordsApi.getParagraphOnline(request);
    }

    @Test
    public void testGetParagraphs() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphsRequest request = new GetParagraphsRequest("Sample.docx", null, null, null, null, null);
        wordsApi.getParagraphs(request);
    }

    @Test
    public void testGetParagraphsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetParagraphsOnlineRequest request = new GetParagraphsOnlineRequest(requestDocument, "sections/0", null, null);
        wordsApi.getParagraphsOnline(request);
    }

    @Test
    public void testGetParagraphTabStops() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphTabStopsRequest request = new GetParagraphTabStopsRequest("Sample.docx", 0, null, null, null, null, null);
        wordsApi.getParagraphTabStops(request);
    }

    @Test
    public void testGetParagraphTabStopsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetParagraphTabStopsOnlineRequest request = new GetParagraphTabStopsOnlineRequest(requestDocument, 0, null, null, null);
        wordsApi.getParagraphTabStopsOnline(request);
    }

    @Test
    public void testGetPublicKey() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetPublicKeyRequest request = new GetPublicKeyRequest();
        wordsApi.getPublicKey(request);
    }

    @Test
    public void testGetRangeText() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRangeTextRequest request = new GetRangeTextRequest("Sample.docx", "id0.0.0", "id0.0.1", null, null, null, null);
        wordsApi.getRangeText(request);
    }

    @Test
    public void testGetRangeTextOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        GetRangeTextOnlineRequest request = new GetRangeTextOnlineRequest(requestDocument, "id0.0.0", "id0.0.1", null, null);
        wordsApi.getRangeTextOnline(request);
    }

    @Test
    public void testGetRun() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRunRequest request = new GetRunRequest("Sample.docx", "paragraphs/0", 0, null, null, null, null);
        wordsApi.getRun(request);
    }

    @Test
    public void testGetRunFont() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRunFontRequest request = new GetRunFontRequest("Sample.docx", "paragraphs/0", 0, null, null, null, null);
        wordsApi.getRunFont(request);
    }

    @Test
    public void testGetRunFontOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetRunFontOnlineRequest request = new GetRunFontOnlineRequest(requestDocument, "paragraphs/0", 0, null, null);
        wordsApi.getRunFontOnline(request);
    }

    @Test
    public void testGetRunOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetRunOnlineRequest request = new GetRunOnlineRequest(requestDocument, "paragraphs/0", 0, null, null);
        wordsApi.getRunOnline(request);
    }

    @Test
    public void testGetRuns() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRunsRequest request = new GetRunsRequest("Sample.docx", "sections/0/paragraphs/0", null, null, null, null);
        wordsApi.getRuns(request);
    }

    @Test
    public void testGetRunsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetRunsOnlineRequest request = new GetRunsOnlineRequest(requestDocument, "sections/0/paragraphs/0", null, null);
        wordsApi.getRunsOnline(request);
    }

    @Test
    public void testGetSection() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetSectionRequest request = new GetSectionRequest("Sample.docx", 0, null, null, null, null);
        wordsApi.getSection(request);
    }

    @Test
    public void testGetSectionOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetSectionOnlineRequest request = new GetSectionOnlineRequest(requestDocument, 0, null, null);
        wordsApi.getSectionOnline(request);
    }

    @Test
    public void testGetSectionPageSetup() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetSectionPageSetupRequest request = new GetSectionPageSetupRequest("Sample.docx", 0, null, null, null, null);
        wordsApi.getSectionPageSetup(request);
    }

    @Test
    public void testGetSectionPageSetupOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetSectionPageSetupOnlineRequest request = new GetSectionPageSetupOnlineRequest(requestDocument, 0, null, null);
        wordsApi.getSectionPageSetupOnline(request);
    }

    @Test
    public void testGetSections() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetSectionsRequest request = new GetSectionsRequest("Sample.docx", null, null, null, null);
        wordsApi.getSections(request);
    }

    @Test
    public void testGetSectionsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetSectionsOnlineRequest request = new GetSectionsOnlineRequest(requestDocument, null, null);
        wordsApi.getSectionsOnline(request);
    }

    @Test
    public void testGetStyle() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetStyleRequest request = new GetStyleRequest("Sample.docx", "Heading 1", null, null, null, null);
        wordsApi.getStyle(request);
    }

    @Test
    public void testGetStyleFromDocumentElement() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetStyleFromDocumentElementRequest request = new GetStyleFromDocumentElementRequest("Sample.docx", "paragraphs/1/paragraphFormat", null, null, null, null);
        wordsApi.getStyleFromDocumentElement(request);
    }

    @Test
    public void testGetStyleFromDocumentElementOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetStyleFromDocumentElementOnlineRequest request = new GetStyleFromDocumentElementOnlineRequest(requestDocument, "paragraphs/1/paragraphFormat", null, null);
        wordsApi.getStyleFromDocumentElementOnline(request);
    }

    @Test
    public void testGetStyleOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetStyleOnlineRequest request = new GetStyleOnlineRequest(requestDocument, "Heading 1", null, null);
        wordsApi.getStyleOnline(request);
    }

    @Test
    public void testGetStyles() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetStylesRequest request = new GetStylesRequest("Sample.docx", null, null, null, null);
        wordsApi.getStyles(request);
    }

    @Test
    public void testGetStylesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetStylesOnlineRequest request = new GetStylesOnlineRequest(requestDocument, null, null);
        wordsApi.getStylesOnline(request);
    }

    @Test
    public void testGetTable() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableRequest request = new GetTableRequest("Sample.docx", 1, null, null, null, null, null);
        wordsApi.getTable(request);
    }

    @Test
    public void testGetTableCell() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableCellRequest request = new GetTableCellRequest("Sample.docx", "sections/0/tables/2/rows/0", 0, null, null, null, null);
        wordsApi.getTableCell(request);
    }

    @Test
    public void testGetTableCellFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableCellFormatRequest request = new GetTableCellFormatRequest("Sample.docx", "sections/0/tables/2/rows/0", 0, null, null, null, null);
        wordsApi.getTableCellFormat(request);
    }

    @Test
    public void testGetTableCellFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetTableCellFormatOnlineRequest request = new GetTableCellFormatOnlineRequest(requestDocument, "sections/0/tables/2/rows/0", 0, null, null);
        wordsApi.getTableCellFormatOnline(request);
    }

    @Test
    public void testGetTableCellOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetTableCellOnlineRequest request = new GetTableCellOnlineRequest(requestDocument, "sections/0/tables/2/rows/0", 0, null, null);
        wordsApi.getTableCellOnline(request);
    }

    @Test
    public void testGetTableOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetTableOnlineRequest request = new GetTableOnlineRequest(requestDocument, 1, null, null, null);
        wordsApi.getTableOnline(request);
    }

    @Test
    public void testGetTableProperties() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTablePropertiesRequest request = new GetTablePropertiesRequest("Sample.docx", 1, null, null, null, null, null);
        wordsApi.getTableProperties(request);
    }

    @Test
    public void testGetTablePropertiesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetTablePropertiesOnlineRequest request = new GetTablePropertiesOnlineRequest(requestDocument, 1, null, null, null);
        wordsApi.getTablePropertiesOnline(request);
    }

    @Test
    public void testGetTableRow() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableRowRequest request = new GetTableRowRequest("Sample.docx", "tables/1", 0, null, null, null, null);
        wordsApi.getTableRow(request);
    }

    @Test
    public void testGetTableRowFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableRowFormatRequest request = new GetTableRowFormatRequest("Sample.docx", "sections/0/tables/2", 0, null, null, null, null);
        wordsApi.getTableRowFormat(request);
    }

    @Test
    public void testGetTableRowFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetTableRowFormatOnlineRequest request = new GetTableRowFormatOnlineRequest(requestDocument, "sections/0/tables/2", 0, null, null);
        wordsApi.getTableRowFormatOnline(request);
    }

    @Test
    public void testGetTableRowOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetTableRowOnlineRequest request = new GetTableRowOnlineRequest(requestDocument, "tables/1", 0, null, null);
        wordsApi.getTableRowOnline(request);
    }

    @Test
    public void testGetTables() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTablesRequest request = new GetTablesRequest("Sample.docx", null, null, null, null, null);
        wordsApi.getTables(request);
    }

    @Test
    public void testGetTablesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        GetTablesOnlineRequest request = new GetTablesOnlineRequest(requestDocument, null, null, null);
        wordsApi.getTablesOnline(request);
    }

    @Test
    public void testInsertComment() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        NodeLink requestCommentRangeStartNode = new NodeLink();
        requestCommentRangeStartNode.setNodeId("0.3.0.3");

        DocumentPosition requestCommentRangeStart = new DocumentPosition();
        requestCommentRangeStart.setNode(requestCommentRangeStartNode);
        requestCommentRangeStart.setOffset(0);

        NodeLink requestCommentRangeEndNode = new NodeLink();
        requestCommentRangeEndNode.setNodeId("0.3.0.3");

        DocumentPosition requestCommentRangeEnd = new DocumentPosition();
        requestCommentRangeEnd.setNode(requestCommentRangeEndNode);
        requestCommentRangeEnd.setOffset(0);

        CommentInsert requestComment = new CommentInsert();
        requestComment.setRangeStart(requestCommentRangeStart);
        requestComment.setRangeEnd(requestCommentRangeEnd);
        requestComment.setInitial("IA");
        requestComment.setAuthor("Imran Anwar");
        requestComment.setText("A new Comment");

        InsertCommentRequest insertRequest = new InsertCommentRequest("Sample.docx", requestComment, null, null, null, null, null, null, null);
        wordsApi.insertComment(insertRequest);
    }

    @Test
    public void testInsertCommentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        NodeLink requestCommentRangeStartNode = new NodeLink();
        requestCommentRangeStartNode.setNodeId("0.3.0.3");

        DocumentPosition requestCommentRangeStart = new DocumentPosition();
        requestCommentRangeStart.setNode(requestCommentRangeStartNode);
        requestCommentRangeStart.setOffset(0);

        NodeLink requestCommentRangeEndNode = new NodeLink();
        requestCommentRangeEndNode.setNodeId("0.3.0.3");

        DocumentPosition requestCommentRangeEnd = new DocumentPosition();
        requestCommentRangeEnd.setNode(requestCommentRangeEndNode);
        requestCommentRangeEnd.setOffset(0);

        CommentInsert requestComment = new CommentInsert();
        requestComment.setRangeStart(requestCommentRangeStart);
        requestComment.setRangeEnd(requestCommentRangeEnd);
        requestComment.setInitial("IA");
        requestComment.setAuthor("Imran Anwar");
        requestComment.setText("A new Comment");

        InsertCommentOnlineRequest insertRequest = new InsertCommentOnlineRequest(requestDocument, requestComment, null, null, null, null, null);
        wordsApi.insertCommentOnline(insertRequest);
    }

    @Test
    public void testInsertCustomXmlPart() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CustomXmlPartInsert requestCustomXmlPart = new CustomXmlPartInsert();
        requestCustomXmlPart.setId("hello");
        requestCustomXmlPart.setData("<data>Hello world</data>");

        InsertCustomXmlPartRequest insertRequest = new InsertCustomXmlPartRequest("Sample.docx", requestCustomXmlPart, null, null, null, null, null, null, null);
        wordsApi.insertCustomXmlPart(insertRequest);
    }

    @Test
    public void testInsertCustomXmlPartOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        CustomXmlPartInsert requestCustomXmlPart = new CustomXmlPartInsert();
        requestCustomXmlPart.setId("hello");
        requestCustomXmlPart.setData("<data>Hello world</data>");

        InsertCustomXmlPartOnlineRequest insertRequest = new InsertCustomXmlPartOnlineRequest(requestDocument, requestCustomXmlPart, null, null, null, null, null);
        wordsApi.insertCustomXmlPartOnline(insertRequest);
    }

    @Test
    public void testInsertDrawingObject() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DrawingObjectInsert requestDrawingObject = new DrawingObjectInsert();
        requestDrawingObject.setHeight((double)0);
        requestDrawingObject.setLeft((double)0);
        requestDrawingObject.setTop((double)0);
        requestDrawingObject.setWidth((double)0);
        requestDrawingObject.setRelativeHorizontalPosition(DrawingObjectInsert.RelativeHorizontalPositionEnum.MARGIN);
        requestDrawingObject.setRelativeVerticalPosition(DrawingObjectInsert.RelativeVerticalPositionEnum.MARGIN);
        requestDrawingObject.setWrapType(DrawingObjectInsert.WrapTypeEnum.INLINE);

        byte[] requestImageFile = Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath());
        InsertDrawingObjectRequest insertRequest = new InsertDrawingObjectRequest("Sample.docx", requestDrawingObject, requestImageFile, null, null, null, null, null, null, null, null);
        wordsApi.insertDrawingObject(insertRequest);
    }

    @Test
    public void testInsertDrawingObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DrawingObjectInsert requestDrawingObject = new DrawingObjectInsert();
        requestDrawingObject.setHeight((double)0);
        requestDrawingObject.setLeft((double)0);
        requestDrawingObject.setTop((double)0);
        requestDrawingObject.setWidth((double)0);
        requestDrawingObject.setRelativeHorizontalPosition(DrawingObjectInsert.RelativeHorizontalPositionEnum.MARGIN);
        requestDrawingObject.setRelativeVerticalPosition(DrawingObjectInsert.RelativeVerticalPositionEnum.MARGIN);
        requestDrawingObject.setWrapType(DrawingObjectInsert.WrapTypeEnum.INLINE);

        byte[] requestImageFile = Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath());
        InsertDrawingObjectOnlineRequest insertRequest = new InsertDrawingObjectOnlineRequest(requestDocument, requestDrawingObject, requestImageFile, null, null, null, null, null, null);
        wordsApi.insertDrawingObjectOnline(insertRequest);
    }

    @Test
    public void testInsertField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        FieldInsert requestField = new FieldInsert();
        requestField.setFieldCode("{ NUMPAGES }");

        InsertFieldRequest insertRequest = new InsertFieldRequest("Sample.docx", requestField, null, null, null, null, null, null, null, null, null);
        wordsApi.insertField(insertRequest);
    }

    @Test
    public void testInsertFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        FieldInsert requestField = new FieldInsert();
        requestField.setFieldCode("{ NUMPAGES }");

        InsertFieldOnlineRequest insertRequest = new InsertFieldOnlineRequest(requestDocument, requestField, "sections/0/paragraphs/0", null, null, null, null, null, null);
        wordsApi.insertFieldOnline(insertRequest);
    }

    @Test
    public void testInsertFootnote() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        FootnoteInsert requestFootnoteDto = new FootnoteInsert();
        requestFootnoteDto.setFootnoteType(FootnoteInsert.FootnoteTypeEnum.ENDNOTE);
        requestFootnoteDto.setText("test endnote");

        InsertFootnoteRequest insertRequest = new InsertFootnoteRequest("Sample.docx", requestFootnoteDto, null, null, null, null, null, null, null, null);
        wordsApi.insertFootnote(insertRequest);
    }

    @Test
    public void testInsertFootnoteOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        FootnoteInsert requestFootnoteDto = new FootnoteInsert();
        requestFootnoteDto.setFootnoteType(FootnoteInsert.FootnoteTypeEnum.ENDNOTE);
        requestFootnoteDto.setText("test endnote");

        InsertFootnoteOnlineRequest insertRequest = new InsertFootnoteOnlineRequest(requestDocument, requestFootnoteDto, null, null, null, null, null, null);
        wordsApi.insertFootnoteOnline(insertRequest);
    }

    @Test
    public void testInsertFormField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("123");
        requestFormField.setTextInputFormat("UPPERCASE");

        InsertFormFieldRequest insertRequest = new InsertFormFieldRequest("Sample.docx", requestFormField, null, null, null, null, null, null, null, null, null);
        wordsApi.insertFormField(insertRequest);
    }

    @Test
    public void testInsertFormFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("123");
        requestFormField.setTextInputFormat("UPPERCASE");

        InsertFormFieldOnlineRequest insertRequest = new InsertFormFieldOnlineRequest(requestDocument, requestFormField, "sections/0/paragraphs/0", null, null, null, null, null, null);
        wordsApi.insertFormFieldOnline(insertRequest);
    }

    @Test
    public void testInsertHeaderFooter() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        InsertHeaderFooterRequest insertRequest = new InsertHeaderFooterRequest("Sample.docx", "", "FooterEven", null, null, null, null, null, null, null);
        wordsApi.insertHeaderFooter(insertRequest);
    }

    @Test
    public void testInsertHeaderFooterOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        InsertHeaderFooterOnlineRequest insertRequest = new InsertHeaderFooterOnlineRequest(requestDocument, "", "FooterEven", null, null, null, null, null);
        wordsApi.insertHeaderFooterOnline(insertRequest);
    }

    @Test
    public void testInsertList() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ListInsert requestListInsert = new ListInsert();
        requestListInsert.setTemplate(ListInsert.TemplateEnum.OUTLINELEGAL);

        InsertListRequest insertRequest = new InsertListRequest("TestGetLists.doc", requestListInsert, null, null, null, null, null, null, null);
        wordsApi.insertList(insertRequest);
    }

    @Test
    public void testInsertListOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        ListInsert requestListInsert = new ListInsert();
        requestListInsert.setTemplate(ListInsert.TemplateEnum.OUTLINELEGAL);

        InsertListOnlineRequest insertRequest = new InsertListOnlineRequest(requestDocument, requestListInsert, null, null, null, null, null);
        wordsApi.insertListOnline(insertRequest);
    }

    @Test
    public void testInsertOrUpdateParagraphTabStop() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TabStopInsert requestTabStopInsertDto = new TabStopInsert();
        requestTabStopInsertDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
        requestTabStopInsertDto.setLeader(TabStopInsert.LeaderEnum.NONE);
        requestTabStopInsertDto.setPosition((double)100.0);

        InsertOrUpdateParagraphTabStopRequest insertRequest = new InsertOrUpdateParagraphTabStopRequest("Sample.docx", 0, requestTabStopInsertDto, null, null, null, null, null, null);
        wordsApi.insertOrUpdateParagraphTabStop(insertRequest);
    }

    @Test
    public void testInsertOrUpdateParagraphTabStopOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        TabStopInsert requestTabStopInsertDto = new TabStopInsert();
        requestTabStopInsertDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
        requestTabStopInsertDto.setLeader(TabStopInsert.LeaderEnum.NONE);
        requestTabStopInsertDto.setPosition((double)72);

        InsertOrUpdateParagraphTabStopOnlineRequest insertRequest = new InsertOrUpdateParagraphTabStopOnlineRequest(requestDocument, requestTabStopInsertDto, 0, null, null, null, null);
        wordsApi.insertOrUpdateParagraphTabStopOnline(insertRequest);
    }

    @Test
    public void testInsertPageNumbers() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        PageNumber requestPageNumber = new PageNumber();
        requestPageNumber.setAlignment("center");
        requestPageNumber.setFormat("{PAGE} of {NUMPAGES}");

        InsertPageNumbersRequest insertRequest = new InsertPageNumbersRequest("Sample.docx", requestPageNumber, null, null, null, null, null, null, null);
        wordsApi.insertPageNumbers(insertRequest);
    }

    @Test
    public void testInsertPageNumbersOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Common/Sample.docx").toAbsolutePath());
        PageNumber requestPageNumber = new PageNumber();
        requestPageNumber.setAlignment("center");
        requestPageNumber.setFormat("{PAGE} of {NUMPAGES}");

        InsertPageNumbersOnlineRequest insertRequest = new InsertPageNumbersOnlineRequest(requestDocument, requestPageNumber, null, null, null, null, null);
        wordsApi.insertPageNumbersOnline(insertRequest);
    }

    @Test
    public void testInsertParagraph() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ParagraphInsert requestParagraph = new ParagraphInsert();
        requestParagraph.setText("This is a new paragraph for your document");

        InsertParagraphRequest insertRequest = new InsertParagraphRequest("Sample.docx", requestParagraph, null, null, null, null, null, null, null, null, null);
        wordsApi.insertParagraph(insertRequest);
    }

    @Test
    public void testInsertParagraphOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        ParagraphInsert requestParagraph = new ParagraphInsert();
        requestParagraph.setText("This is a new paragraph for your document");

        InsertParagraphOnlineRequest insertRequest = new InsertParagraphOnlineRequest(requestDocument, requestParagraph, "sections/0", null, null, null, null, null, null);
        wordsApi.insertParagraphOnline(insertRequest);
    }

    @Test
    public void testInsertRun() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RunInsert requestRun = new RunInsert();
        requestRun.setText("run with text");

        InsertRunRequest insertRequest = new InsertRunRequest("Sample.docx", "paragraphs/1", requestRun, null, null, null, null, null, null, null, null);
        wordsApi.insertRun(insertRequest);
    }

    @Test
    public void testInsertRunOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        RunInsert requestRun = new RunInsert();
        requestRun.setText("run with text");

        InsertRunOnlineRequest insertRequest = new InsertRunOnlineRequest(requestDocument, "paragraphs/1", requestRun, null, null, null, null, null, null);
        wordsApi.insertRunOnline(insertRequest);
    }

    @Test
    public void testInsertStyle() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleInsert requestStyleInsert = new StyleInsert();
        requestStyleInsert.setStyleName("My Style");
        requestStyleInsert.setStyleType(StyleInsert.StyleTypeEnum.PARAGRAPH);

        InsertStyleRequest insertRequest = new InsertStyleRequest("Sample.docx", requestStyleInsert, null, null, null, null, null, null, null);
        wordsApi.insertStyle(insertRequest);
    }

    @Test
    public void testInsertStyleOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        StyleInsert requestStyleInsert = new StyleInsert();
        requestStyleInsert.setStyleName("My Style");
        requestStyleInsert.setStyleType(StyleInsert.StyleTypeEnum.PARAGRAPH);

        InsertStyleOnlineRequest insertRequest = new InsertStyleOnlineRequest(requestDocument, requestStyleInsert, null, null, null, null, null);
        wordsApi.insertStyleOnline(insertRequest);
    }

    @Test
    public void testInsertTable() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TableInsert requestTable = new TableInsert();
        requestTable.setColumnsCount(5);
        requestTable.setRowsCount(4);

        InsertTableRequest insertRequest = new InsertTableRequest("Sample.docx", requestTable, null, null, null, null, null, null, null, null);
        wordsApi.insertTable(insertRequest);
    }

    @Test
    public void testInsertTableCell() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TableCellInsert requestCell = new TableCellInsert();

        InsertTableCellRequest insertRequest = new InsertTableCellRequest("Sample.docx", "sections/0/tables/2/rows/0", requestCell, null, null, null, null, null, null, null);
        wordsApi.insertTableCell(insertRequest);
    }

    @Test
    public void testInsertTableCellOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        TableCellInsert requestCell = new TableCellInsert();

        InsertTableCellOnlineRequest insertRequest = new InsertTableCellOnlineRequest(requestDocument, "sections/0/tables/2/rows/0", requestCell, null, null, null, null, null);
        wordsApi.insertTableCellOnline(insertRequest);
    }

    @Test
    public void testInsertTableOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        TableInsert requestTable = new TableInsert();
        requestTable.setColumnsCount(5);
        requestTable.setRowsCount(4);

        InsertTableOnlineRequest insertRequest = new InsertTableOnlineRequest(requestDocument, requestTable, null, null, null, null, null, null);
        wordsApi.insertTableOnline(insertRequest);
    }

    @Test
    public void testInsertTableRow() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TableRowInsert requestRow = new TableRowInsert();
        requestRow.setColumnsCount(5);

        InsertTableRowRequest insertRequest = new InsertTableRowRequest("Sample.docx", "sections/0/tables/2", requestRow, null, null, null, null, null, null, null);
        wordsApi.insertTableRow(insertRequest);
    }

    @Test
    public void testInsertTableRowOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        TableRowInsert requestRow = new TableRowInsert();
        requestRow.setColumnsCount(5);

        InsertTableRowOnlineRequest insertRequest = new InsertTableRowOnlineRequest(requestDocument, "sections/0/tables/2", requestRow, null, null, null, null, null);
        wordsApi.insertTableRowOnline(insertRequest);
    }

    @Test
    public void testInsertWatermarkImage() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        InsertWatermarkImageRequest insertRequest = new InsertWatermarkImageRequest("Sample.docx", null, null, null, null, null, null, null, null, null, "Sample.png");
        wordsApi.insertWatermarkImage(insertRequest);
    }

    @Test
    public void testInsertWatermarkImageOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        byte[] requestImageFile = Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath());
        InsertWatermarkImageOnlineRequest insertRequest = new InsertWatermarkImageOnlineRequest(requestDocument, requestImageFile, null, null, null, null, null, null, null);
        wordsApi.insertWatermarkImageOnline(insertRequest);
    }

    @Test
    public void testInsertWatermarkText() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        WatermarkText requestWatermarkText = new WatermarkText();
        requestWatermarkText.setText("This is the text");
        requestWatermarkText.setRotationAngle((double)90.0);

        InsertWatermarkTextRequest insertRequest = new InsertWatermarkTextRequest("Sample.docx", requestWatermarkText, null, null, null, null, null, null, null);
        wordsApi.insertWatermarkText(insertRequest);
    }

    @Test
    public void testInsertWatermarkTextOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        WatermarkText requestWatermarkText = new WatermarkText();
        requestWatermarkText.setText("This is the text");
        requestWatermarkText.setRotationAngle((double)90);

        InsertWatermarkTextOnlineRequest insertRequest = new InsertWatermarkTextOnlineRequest(requestDocument, requestWatermarkText, null, null, null, null, null);
        wordsApi.insertWatermarkTextOnline(insertRequest);
    }

    @Test
    public void testLoadWebDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        SaveOptionsData requestDataSaveOptions = new SaveOptionsData();
        requestDataSaveOptions.setFileName("google.doc");
        requestDataSaveOptions.setSaveFormat("doc");
        requestDataSaveOptions.setDmlEffectsRenderingMode("1");
        requestDataSaveOptions.setDmlRenderingMode("1");
        requestDataSaveOptions.setUpdateSdtContent(false);
        requestDataSaveOptions.setZipOutput(false);

        LoadWebDocumentData requestData = new LoadWebDocumentData();
        requestData.setLoadingDocumentUrl("http://google.com");
        requestData.setSaveOptions(requestDataSaveOptions);

        LoadWebDocumentRequest loadRequest = new LoadWebDocumentRequest(requestData, null);
        wordsApi.loadWebDocument(loadRequest);
    }

    @Test
    public void testMoveFile() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        MoveFileRequest moveRequest = new MoveFileRequest("/TestMoveFileDest_Sample.docx", "Sample.docx", null, null, null);
        wordsApi.moveFile(moveRequest);
    }

    @Test
    public void testMoveFolder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        MoveFolderRequest moveRequest = new MoveFolderRequest("/TestMoveFolderDest_Sample", "/TestMoveFolderSrc", null, null);
        wordsApi.moveFolder(moveRequest);
    }

    @Test
    public void testOptimizeDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        OptimizationOptions requestOptions = new OptimizationOptions();
        requestOptions.setMsWordVersion(OptimizationOptions.MsWordVersionEnum.WORD2002);

        OptimizeDocumentRequest optimizeRequest = new OptimizeDocumentRequest("Sample.docx", requestOptions, null, null, null, null, null, null, null);
        wordsApi.optimizeDocument(optimizeRequest);
    }

    @Test
    public void testOptimizeDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        OptimizationOptions requestOptions = new OptimizationOptions();
        requestOptions.setMsWordVersion(OptimizationOptions.MsWordVersionEnum.WORD2002);

        OptimizeDocumentOnlineRequest optimizeRequest = new OptimizeDocumentOnlineRequest(requestDocument, requestOptions, null, null, null, null, null);
        wordsApi.optimizeDocumentOnline(optimizeRequest);
    }

    @Test
    public void testProtectDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ProtectionRequest requestProtectionRequest = new ProtectionRequest();
        requestProtectionRequest.setPassword("123");
        requestProtectionRequest.setProtectionType("ReadOnly");

        ProtectDocumentRequest protectRequest = new ProtectDocumentRequest("Sample.docx", requestProtectionRequest, null, null, null, null, null);
        wordsApi.protectDocument(protectRequest);
    }

    @Test
    public void testProtectDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        ProtectionRequest requestProtectionRequest = new ProtectionRequest();
        requestProtectionRequest.setNewPassword("123");

        ProtectDocumentOnlineRequest protectRequest = new ProtectDocumentOnlineRequest(requestDocument, requestProtectionRequest, null, null, null);
        wordsApi.protectDocumentOnline(protectRequest);
    }

    @Test
    public void testRejectAllRevisions() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RejectAllRevisionsRequest rejectRequest = new RejectAllRevisionsRequest("Sample.docx", null, null, null, null, null);
        wordsApi.rejectAllRevisions(rejectRequest);
    }

    @Test
    public void testRejectAllRevisionsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        RejectAllRevisionsOnlineRequest rejectRequest = new RejectAllRevisionsOnlineRequest(requestDocument, null, null, null);
        wordsApi.rejectAllRevisionsOnline(rejectRequest);
    }

    @Test
    public void testRemoveRange() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RemoveRangeRequest removeRequest = new RemoveRangeRequest("Sample.docx", "id0.0.0", "id0.0.1", null, null, null, null, null);
        wordsApi.removeRange(removeRequest);
    }

    @Test
    public void testRemoveRangeOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        RemoveRangeOnlineRequest removeRequest = new RemoveRangeOnlineRequest(requestDocument, "id0.0.0", "id0.0.1", null, null, null);
        wordsApi.removeRangeOnline(removeRequest);
    }

    @Test
    public void testRenderDrawingObject() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderDrawingObjectRequest renderRequest = new RenderDrawingObjectRequest("Sample.docx", "png", 0, null, null, null, null, null, null, null);
        wordsApi.renderDrawingObject(renderRequest);
    }

    @Test
    public void testRenderDrawingObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        RenderDrawingObjectOnlineRequest renderRequest = new RenderDrawingObjectOnlineRequest(requestDocument, "png", 0, "sections/0", null, null, null, null);
        wordsApi.renderDrawingObjectOnline(renderRequest);
    }

    @Test
    public void testRenderMathObject() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderMathObjectRequest renderRequest = new RenderMathObjectRequest("Sample.docx", "png", 0, null, null, null, null, null, null, null);
        wordsApi.renderMathObject(renderRequest);
    }

    @Test
    public void testRenderMathObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        RenderMathObjectOnlineRequest renderRequest = new RenderMathObjectOnlineRequest(requestDocument, "png", 0, null, null, null, null, null);
        wordsApi.renderMathObjectOnline(renderRequest);
    }

    @Test
    public void testRenderPage() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderPageRequest renderRequest = new RenderPageRequest("Sample.docx", 1, "bmp", null, null, null, null, null);
        wordsApi.renderPage(renderRequest);
    }

    @Test
    public void testRenderPageOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        RenderPageOnlineRequest renderRequest = new RenderPageOnlineRequest(requestDocument, 1, "bmp", null, null, null);
        wordsApi.renderPageOnline(renderRequest);
    }

    @Test
    public void testRenderParagraph() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderParagraphRequest renderRequest = new RenderParagraphRequest("Sample.docx", "png", 0, null, null, null, null, null, null, null);
        wordsApi.renderParagraph(renderRequest);
    }

    @Test
    public void testRenderParagraphOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        RenderParagraphOnlineRequest renderRequest = new RenderParagraphOnlineRequest(requestDocument, "png", 0, null, null, null, null, null);
        wordsApi.renderParagraphOnline(renderRequest);
    }

    @Test
    public void testRenderTable() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderTableRequest renderRequest = new RenderTableRequest("Sample.docx", "png", 0, null, null, null, null, null, null, null);
        wordsApi.renderTable(renderRequest);
    }

    @Test
    public void testRenderTableOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        RenderTableOnlineRequest renderRequest = new RenderTableOnlineRequest(requestDocument, "png", 0, null, null, null, null, null);
        wordsApi.renderTableOnline(renderRequest);
    }

    @Test
    public void testReplaceText() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ReplaceTextParameters requestReplaceText = new ReplaceTextParameters();
        requestReplaceText.setOldValue("Testing");
        requestReplaceText.setNewValue("Aspose testing");

        ReplaceTextRequest replaceRequest = new ReplaceTextRequest("Sample.docx", requestReplaceText, null, null, null, null, null, null, null);
        wordsApi.replaceText(replaceRequest);
    }

    @Test
    public void testReplaceTextOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        ReplaceTextParameters requestReplaceText = new ReplaceTextParameters();
        requestReplaceText.setOldValue("aspose");
        requestReplaceText.setNewValue("aspose new");

        ReplaceTextOnlineRequest replaceRequest = new ReplaceTextOnlineRequest(requestDocument, requestReplaceText, null, null, null, null, null);
        wordsApi.replaceTextOnline(replaceRequest);
    }

    @Test
    public void testReplaceWithText() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ReplaceRange requestRangeText = new ReplaceRange();
        requestRangeText.setText("Replaced header");

        ReplaceWithTextRequest replaceRequest = new ReplaceWithTextRequest("Sample.docx", "id0.0.0", requestRangeText, "id0.0.1", null, null, null, null, null);
        wordsApi.replaceWithText(replaceRequest);
    }

    @Test
    public void testReplaceWithTextOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        ReplaceRange requestRangeText = new ReplaceRange();
        requestRangeText.setText("Replaced header");

        ReplaceWithTextOnlineRequest replaceRequest = new ReplaceWithTextOnlineRequest(requestDocument, "id0.0.0", requestRangeText, "id0.0.1", null, null, null);
        wordsApi.replaceWithTextOnline(replaceRequest);
    }

    @Test
    public void testResetCache() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ResetCacheRequest resetRequest = new ResetCacheRequest();
        wordsApi.resetCache(resetRequest);
    }

    @Test
    public void testSaveAs() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        SaveOptionsData requestSaveOptionsData = new SaveOptionsData();
        requestSaveOptionsData.setSaveFormat("docx");
        requestSaveOptionsData.setFileName("/TestSaveAsFromPdfToDoc.docx");

        SaveAsRequest saveRequest = new SaveAsRequest("Sample.docx", requestSaveOptionsData, null, null, null, null, null);
        wordsApi.saveAs(saveRequest);
    }

    @Test
    public void testSaveAsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Common/test_multi_pages.docx").toAbsolutePath());
        SaveOptionsData requestSaveOptionsData = new SaveOptionsData();
        requestSaveOptionsData.setSaveFormat("pdf");
        requestSaveOptionsData.setFileName("/TestSaveAs.pdf");

        SaveAsOnlineRequest saveRequest = new SaveAsOnlineRequest(requestDocument, requestSaveOptionsData, null, null, null);
        wordsApi.saveAsOnline(saveRequest);
    }

    @Test
    public void testSaveAsRange() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RangeDocument requestDocumentParameters = new RangeDocument();
        requestDocumentParameters.setDocumentName("/NewDoc.docx");

        SaveAsRangeRequest saveRequest = new SaveAsRangeRequest("Sample.docx", "id0.0.0", requestDocumentParameters, "id0.0.1", null, null, null, null);
        wordsApi.saveAsRange(saveRequest);
    }

    @Test
    public void testSaveAsRangeOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        RangeDocument requestDocumentParameters = new RangeDocument();
        requestDocumentParameters.setDocumentName("/NewDoc.docx");

        SaveAsRangeOnlineRequest saveRequest = new SaveAsRangeOnlineRequest(requestDocument, "id0.0.0", requestDocumentParameters, "id0.0.1", null, null);
        wordsApi.saveAsRangeOnline(saveRequest);
    }

    @Test
    public void testSaveAsTiff() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TiffSaveOptionsData requestSaveOptions = new TiffSaveOptionsData();
        requestSaveOptions.setSaveFormat("tiff");
        requestSaveOptions.setFileName("/abc.tiff");

        SaveAsTiffRequest saveRequest = new SaveAsTiffRequest("Sample.docx", requestSaveOptions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        wordsApi.saveAsTiff(saveRequest);
    }

    @Test
    public void testSaveAsTiffOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Common/test_multi_pages.docx").toAbsolutePath());
        TiffSaveOptionsData requestSaveOptions = new TiffSaveOptionsData();
        requestSaveOptions.setSaveFormat("tiff");
        requestSaveOptions.setFileName("/abc.tiff");

        SaveAsTiffOnlineRequest saveRequest = new SaveAsTiffOnlineRequest(requestDocument, requestSaveOptions, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        wordsApi.saveAsTiffOnline(saveRequest);
    }

    @Test
    public void testSearch() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        SearchRequest searchRequest = new SearchRequest("Sample.docx", "aspose", null, null, null, null);
        wordsApi.search(searchRequest);
    }

    @Test
    public void testSearchOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        SearchOnlineRequest searchRequest = new SearchOnlineRequest(requestDocument, "aspose", null, null);
        wordsApi.searchOnline(searchRequest);
    }

    @Test
    public void testSplitDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        SplitDocumentRequest splitRequest = new SplitDocumentRequest("Sample.docx", "text", null, null, null, null, "/TestSplitDocument.text", 1, 2, null, null);
        wordsApi.splitDocument(splitRequest);
    }

    @Test
    public void testSplitDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        SplitDocumentOnlineRequest splitRequest = new SplitDocumentOnlineRequest(requestDocument, "text", null, null, "/TestSplitDocument.text", 1, 2, null, null);
        wordsApi.splitDocumentOnline(splitRequest);
    }

    @Test
    public void testUnprotectDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ProtectionRequest requestProtectionRequest = new ProtectionRequest();
        requestProtectionRequest.setPassword("aspose");

        UnprotectDocumentRequest unprotectRequest = new UnprotectDocumentRequest("Sample.docx", requestProtectionRequest, null, null, null, null, null);
        wordsApi.unprotectDocument(unprotectRequest);
    }

    @Test
    public void testUnprotectDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        ProtectionRequest requestProtectionRequest = new ProtectionRequest();
        requestProtectionRequest.setPassword("aspose");

        UnprotectDocumentOnlineRequest unprotectRequest = new UnprotectDocumentOnlineRequest(requestDocument, requestProtectionRequest, null, null, null);
        wordsApi.unprotectDocumentOnline(unprotectRequest);
    }

    @Test
    public void testUpdateBookmark() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String bookmarkName = "aspose";

        BookmarkData requestBookmarkData = new BookmarkData();
        requestBookmarkData.setName(bookmarkName);
        requestBookmarkData.setText("This will be the text for Aspose");

        UpdateBookmarkRequest updateRequest = new UpdateBookmarkRequest("Sample.docx", bookmarkName, requestBookmarkData, null, null, null, null, null, null, null);
        wordsApi.updateBookmark(updateRequest);
    }

    @Test
    public void testUpdateBookmarkOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        String bookmarkName = "aspose";

        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        BookmarkData requestBookmarkData = new BookmarkData();
        requestBookmarkData.setName(bookmarkName);
        requestBookmarkData.setText("This will be the text for Aspose");

        UpdateBookmarkOnlineRequest updateRequest = new UpdateBookmarkOnlineRequest(requestDocument, bookmarkName, requestBookmarkData, null, null, "Sample.docx", null, null);
        wordsApi.updateBookmarkOnline(updateRequest);
    }

    @Test
    public void testUpdateBorder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        XmlColor requestBorderPropertiesColor = new XmlColor();
        requestBorderPropertiesColor.setWeb("#AABBCC");

        Border requestBorderProperties = new Border();
        requestBorderProperties.setBorderType(Border.BorderTypeEnum.LEFT);
        requestBorderProperties.setColor(requestBorderPropertiesColor);
        requestBorderProperties.setDistanceFromText((double)6.0);
        requestBorderProperties.setLineStyle(Border.LineStyleEnum.DASHDOTSTROKER);
        requestBorderProperties.setLineWidth((double)2.0);
        requestBorderProperties.setShadow(true);

        UpdateBorderRequest updateRequest = new UpdateBorderRequest("Sample.docx", "left", requestBorderProperties, "tables/1/rows/0/cells/0", null, null, null, null, null, null, null);
        wordsApi.updateBorder(updateRequest);
    }

    @Test
    public void testUpdateBorderOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        XmlColor requestBorderPropertiesColor = new XmlColor();
        requestBorderPropertiesColor.setWeb("#AABBCC");

        Border requestBorderProperties = new Border();
        requestBorderProperties.setBorderType(Border.BorderTypeEnum.LEFT);
        requestBorderProperties.setColor(requestBorderPropertiesColor);
        requestBorderProperties.setDistanceFromText((double)6);
        requestBorderProperties.setLineStyle(Border.LineStyleEnum.DASHDOTSTROKER);
        requestBorderProperties.setLineWidth((double)2);
        requestBorderProperties.setShadow(true);

        UpdateBorderOnlineRequest updateRequest = new UpdateBorderOnlineRequest(requestDocument, requestBorderProperties, "left", "tables/1/rows/0/cells/0", null, null, null, null, null);
        wordsApi.updateBorderOnline(updateRequest);
    }

    @Test
    public void testUpdateComment() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        NodeLink requestCommentRangeStartNode = new NodeLink();
        requestCommentRangeStartNode.setNodeId("0.3.0");

        DocumentPosition requestCommentRangeStart = new DocumentPosition();
        requestCommentRangeStart.setNode(requestCommentRangeStartNode);
        requestCommentRangeStart.setOffset(0);

        NodeLink requestCommentRangeEndNode = new NodeLink();
        requestCommentRangeEndNode.setNodeId("0.3.0");

        DocumentPosition requestCommentRangeEnd = new DocumentPosition();
        requestCommentRangeEnd.setNode(requestCommentRangeEndNode);
        requestCommentRangeEnd.setOffset(0);

        CommentUpdate requestComment = new CommentUpdate();
        requestComment.setRangeStart(requestCommentRangeStart);
        requestComment.setRangeEnd(requestCommentRangeEnd);
        requestComment.setInitial("IA");
        requestComment.setAuthor("Imran Anwar");
        requestComment.setText("A new Comment");

        UpdateCommentRequest updateRequest = new UpdateCommentRequest("Sample.docx", 0, requestComment, null, null, null, null, null, null, null);
        wordsApi.updateComment(updateRequest);
    }

    @Test
    public void testUpdateCommentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        NodeLink requestCommentRangeStartNode = new NodeLink();
        requestCommentRangeStartNode.setNodeId("0.3.0");

        DocumentPosition requestCommentRangeStart = new DocumentPosition();
        requestCommentRangeStart.setNode(requestCommentRangeStartNode);
        requestCommentRangeStart.setOffset(0);

        NodeLink requestCommentRangeEndNode = new NodeLink();
        requestCommentRangeEndNode.setNodeId("0.3.0");

        DocumentPosition requestCommentRangeEnd = new DocumentPosition();
        requestCommentRangeEnd.setNode(requestCommentRangeEndNode);
        requestCommentRangeEnd.setOffset(0);

        CommentUpdate requestComment = new CommentUpdate();
        requestComment.setRangeStart(requestCommentRangeStart);
        requestComment.setRangeEnd(requestCommentRangeEnd);
        requestComment.setInitial("IA");
        requestComment.setAuthor("Imran Anwar");
        requestComment.setText("A new Comment");

        UpdateCommentOnlineRequest updateRequest = new UpdateCommentOnlineRequest(requestDocument, 0, requestComment, null, null, null, null, null);
        wordsApi.updateCommentOnline(updateRequest);
    }

    @Test
    public void testUpdateCustomXmlPart() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CustomXmlPartUpdate requestCustomXmlPart = new CustomXmlPartUpdate();
        requestCustomXmlPart.setData("<data>Hello world</data>");

        UpdateCustomXmlPartRequest updateRequest = new UpdateCustomXmlPartRequest("Sample.docx", 0, requestCustomXmlPart, null, null, null, null, null, null, null);
        wordsApi.updateCustomXmlPart(updateRequest);
    }

    @Test
    public void testUpdateCustomXmlPartOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        CustomXmlPartUpdate requestCustomXmlPart = new CustomXmlPartUpdate();
        requestCustomXmlPart.setData("<data>Hello world</data>");

        UpdateCustomXmlPartOnlineRequest updateRequest = new UpdateCustomXmlPartOnlineRequest(requestDocument, 0, requestCustomXmlPart, null, null, null, null, null);
        wordsApi.updateCustomXmlPartOnline(updateRequest);
    }

    @Test
    public void testUpdateDrawingObject() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
        requestDrawingObject.setLeft((double)0);

        byte[] requestImageFile = Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath());
        UpdateDrawingObjectRequest updateRequest = new UpdateDrawingObjectRequest("Sample.docx", requestDrawingObject, requestImageFile, 0, null, null, null, null, null, null, null, null);
        wordsApi.updateDrawingObject(updateRequest);
    }

    @Test
    public void testUpdateDrawingObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
        requestDrawingObject.setLeft((double)0);

        byte[] requestImageFile = Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath());
        UpdateDrawingObjectOnlineRequest updateRequest = new UpdateDrawingObjectOnlineRequest(requestDocument, requestDrawingObject, requestImageFile, 0, null, null, null, null, null, null);
        wordsApi.updateDrawingObjectOnline(updateRequest);
    }

    @Test
    public void testUpdateField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        FieldUpdate requestField = new FieldUpdate();
        requestField.setFieldCode("{ NUMPAGES }");

        UpdateFieldRequest updateRequest = new UpdateFieldRequest("Sample.docx", 0, requestField, "sections/0/paragraphs/0", null, null, null, null, null, null, null);
        wordsApi.updateField(updateRequest);
    }

    @Test
    public void testUpdateFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        FieldUpdate requestField = new FieldUpdate();
        requestField.setFieldCode("{ NUMPAGES }");

        UpdateFieldOnlineRequest updateRequest = new UpdateFieldOnlineRequest(requestDocument, requestField, 0, "sections/0/paragraphs/0", null, null, null, null, null);
        wordsApi.updateFieldOnline(updateRequest);
    }

    @Test
    public void testUpdateFields() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        UpdateFieldsRequest updateRequest = new UpdateFieldsRequest("Sample.docx", null, null, null, null, null);
        wordsApi.updateFields(updateRequest);
    }

    @Test
    public void testUpdateFieldsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        UpdateFieldsOnlineRequest updateRequest = new UpdateFieldsOnlineRequest(requestDocument, null, null, null);
        wordsApi.updateFieldsOnline(updateRequest);
    }

    @Test
    public void testUpdateFootnote() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        FootnoteUpdate requestFootnoteDto = new FootnoteUpdate();
        requestFootnoteDto.setText("new text is here");

        UpdateFootnoteRequest updateRequest = new UpdateFootnoteRequest("Sample.docx", 0, requestFootnoteDto, null, null, null, null, null, null, null, null);
        wordsApi.updateFootnote(updateRequest);
    }

    @Test
    public void testUpdateFootnoteOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        FootnoteUpdate requestFootnoteDto = new FootnoteUpdate();
        requestFootnoteDto.setText("new text is here");

        UpdateFootnoteOnlineRequest updateRequest = new UpdateFootnoteOnlineRequest(requestDocument, requestFootnoteDto, 0, null, null, null, null, null, null);
        wordsApi.updateFootnoteOnline(updateRequest);
    }

    @Test
    public void testUpdateFormField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("No name");

        UpdateFormFieldRequest updateRequest = new UpdateFormFieldRequest("Sample.docx", 0, requestFormField, null, null, null, null, null, null, null, null);
        wordsApi.updateFormField(updateRequest);
    }

    @Test
    public void testUpdateFormFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("No name");

        UpdateFormFieldOnlineRequest updateRequest = new UpdateFormFieldOnlineRequest(requestDocument, requestFormField, 0, "sections/0", null, null, null, null, null);
        wordsApi.updateFormFieldOnline(updateRequest);
    }

    @Test
    public void testUpdateList() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ListUpdate requestListUpdate = new ListUpdate();
        requestListUpdate.setIsRestartAtEachSection(true);

        UpdateListRequest updateRequest = new UpdateListRequest("TestGetLists.doc", 1, requestListUpdate, null, null, null, null, null, null, null);
        wordsApi.updateList(updateRequest);
    }

    @Test
    public void testUpdateListLevel() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ListLevelUpdate requestListUpdate = new ListLevelUpdate();
        requestListUpdate.setAlignment(ListLevelUpdate.AlignmentEnum.RIGHT);

        UpdateListLevelRequest updateRequest = new UpdateListLevelRequest("TestGetLists.doc", 1, 1, requestListUpdate, null, null, null, null, null, null, null);
        wordsApi.updateListLevel(updateRequest);
    }

    @Test
    public void testUpdateListLevelOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        ListLevelUpdate requestListUpdate = new ListLevelUpdate();
        requestListUpdate.setAlignment(ListLevelUpdate.AlignmentEnum.RIGHT);

        UpdateListLevelOnlineRequest updateRequest = new UpdateListLevelOnlineRequest(requestDocument, 1, requestListUpdate, 1, null, null, null, null, null);
        wordsApi.updateListLevelOnline(updateRequest);
    }

    @Test
    public void testUpdateListOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        ListUpdate requestListUpdate = new ListUpdate();
        requestListUpdate.setIsRestartAtEachSection(true);

        UpdateListOnlineRequest updateRequest = new UpdateListOnlineRequest(requestDocument, 1, requestListUpdate, null, null, null, null, null);
        wordsApi.updateListOnline(updateRequest);
    }

    @Test
    public void testUpdateParagraphFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ParagraphFormatUpdate requestParagraphFormatDto = new ParagraphFormatUpdate();
        requestParagraphFormatDto.setAlignment(ParagraphFormatUpdate.AlignmentEnum.RIGHT);

        UpdateParagraphFormatRequest updateRequest = new UpdateParagraphFormatRequest("Sample.docx", 0, requestParagraphFormatDto, null, null, null, null, null, null, null, null);
        wordsApi.updateParagraphFormat(updateRequest);
    }

    @Test
    public void testUpdateParagraphFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        ParagraphFormatUpdate requestParagraphFormatDto = new ParagraphFormatUpdate();
        requestParagraphFormatDto.setAlignment(ParagraphFormatUpdate.AlignmentEnum.RIGHT);

        UpdateParagraphFormatOnlineRequest updateRequest = new UpdateParagraphFormatOnlineRequest(requestDocument, requestParagraphFormatDto, 0, null, null, null, null, null, null);
        wordsApi.updateParagraphFormatOnline(updateRequest);
    }

    @Test
    public void testUpdateParagraphListFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ListFormatUpdate requestListFormatDto = new ListFormatUpdate();
        requestListFormatDto.setListId(2);

        UpdateParagraphListFormatRequest updateRequest = new UpdateParagraphListFormatRequest("Sample.docx", 0, requestListFormatDto, null, null, null, null, null, null, null, null);
        wordsApi.updateParagraphListFormat(updateRequest);
    }

    @Test
    public void testUpdateParagraphListFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        ListFormatUpdate requestListFormatDto = new ListFormatUpdate();
        requestListFormatDto.setListId(2);

        UpdateParagraphListFormatOnlineRequest updateRequest = new UpdateParagraphListFormatOnlineRequest(requestDocument, requestListFormatDto, 0, null, null, null, null, null, null);
        wordsApi.updateParagraphListFormatOnline(updateRequest);
    }

    @Test
    public void testUpdateRun() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RunUpdate requestRun = new RunUpdate();
        requestRun.setText("run with text");

        UpdateRunRequest updateRequest = new UpdateRunRequest("Sample.docx", "paragraphs/1", 0, requestRun, null, null, null, null, null, null, null);
        wordsApi.updateRun(updateRequest);
    }

    @Test
    public void testUpdateRunFont() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        Font requestFontDto = new Font();
        requestFontDto.setBold(true);

        UpdateRunFontRequest updateRequest = new UpdateRunFontRequest("Sample.docx", "paragraphs/0", 0, requestFontDto, null, null, null, null, null, null, null);
        wordsApi.updateRunFont(updateRequest);
    }

    @Test
    public void testUpdateRunFontOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        Font requestFontDto = new Font();
        requestFontDto.setBold(true);

        UpdateRunFontOnlineRequest updateRequest = new UpdateRunFontOnlineRequest(requestDocument, "paragraphs/0", requestFontDto, 0, null, null, null, null, null);
        wordsApi.updateRunFontOnline(updateRequest);
    }

    @Test
    public void testUpdateRunOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath());
        RunUpdate requestRun = new RunUpdate();
        requestRun.setText("run with text");

        UpdateRunOnlineRequest updateRequest = new UpdateRunOnlineRequest(requestDocument, "paragraphs/1", requestRun, 0, null, null, null, null, null);
        wordsApi.updateRunOnline(updateRequest);
    }

    @Test
    public void testUpdateSectionPageSetup() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        PageSetup requestPageSetup = new PageSetup();
        requestPageSetup.setRtlGutter(true);
        requestPageSetup.setLeftMargin((double)10.0);
        requestPageSetup.setOrientation(PageSetup.OrientationEnum.LANDSCAPE);
        requestPageSetup.setPaperSize(PageSetup.PaperSizeEnum.A5);

        UpdateSectionPageSetupRequest updateRequest = new UpdateSectionPageSetupRequest("Sample.docx", 0, requestPageSetup, null, null, null, null, null, null, null);
        wordsApi.updateSectionPageSetup(updateRequest);
    }

    @Test
    public void testUpdateSectionPageSetupOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        PageSetup requestPageSetup = new PageSetup();
        requestPageSetup.setRtlGutter(true);
        requestPageSetup.setLeftMargin((double)10);
        requestPageSetup.setOrientation(PageSetup.OrientationEnum.LANDSCAPE);
        requestPageSetup.setPaperSize(PageSetup.PaperSizeEnum.A5);

        UpdateSectionPageSetupOnlineRequest updateRequest = new UpdateSectionPageSetupOnlineRequest(requestDocument, 0, requestPageSetup, null, null, null, null, null);
        wordsApi.updateSectionPageSetupOnline(updateRequest);
    }

    @Test
    public void testUpdateStyle() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleUpdate requestStyleUpdate = new StyleUpdate();
        requestStyleUpdate.setName("My Style");

        UpdateStyleRequest updateRequest = new UpdateStyleRequest("Sample.docx", "Heading 1", requestStyleUpdate, null, null, null, null, null, null, null);
        wordsApi.updateStyle(updateRequest);
    }

    @Test
    public void testUpdateStyleOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        StyleUpdate requestStyleUpdate = new StyleUpdate();
        requestStyleUpdate.setName("My Style");

        UpdateStyleOnlineRequest updateRequest = new UpdateStyleOnlineRequest(requestDocument, "Heading 1", requestStyleUpdate, null, null, null, null, null);
        wordsApi.updateStyleOnline(updateRequest);
    }

    @Test
    public void testUpdateTableCellFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TableCellFormat requestFormat = new TableCellFormat();
        requestFormat.setBottomPadding((double)5.0);
        requestFormat.setFitText(true);
        requestFormat.setHorizontalMerge(TableCellFormat.HorizontalMergeEnum.FIRST);
        requestFormat.setWrapText(true);

        UpdateTableCellFormatRequest updateRequest = new UpdateTableCellFormatRequest("Sample.docx", "sections/0/tables/2/rows/0", 0, requestFormat, null, null, null, null, null, null, null);
        wordsApi.updateTableCellFormat(updateRequest);
    }

    @Test
    public void testUpdateTableCellFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        TableCellFormat requestFormat = new TableCellFormat();
        requestFormat.setBottomPadding((double)5);
        requestFormat.setFitText(true);
        requestFormat.setHorizontalMerge(TableCellFormat.HorizontalMergeEnum.FIRST);
        requestFormat.setWrapText(true);

        UpdateTableCellFormatOnlineRequest updateRequest = new UpdateTableCellFormatOnlineRequest(requestDocument, "sections/0/tables/2/rows/0", requestFormat, 0, null, null, null, null, null);
        wordsApi.updateTableCellFormatOnline(updateRequest);
    }

    @Test
    public void testUpdateTableProperties() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TableProperties requestProperties = new TableProperties();
        requestProperties.setAlignment(TableProperties.AlignmentEnum.RIGHT);
        requestProperties.setAllowAutoFit(false);
        requestProperties.setBidi(true);
        requestProperties.setBottomPadding((double)1.0);
        requestProperties.setCellSpacing((double)2.0);
        requestProperties.setStyleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS);

        UpdateTablePropertiesRequest updateRequest = new UpdateTablePropertiesRequest("Sample.docx", 1, requestProperties, null, null, null, null, null, null, null, null);
        wordsApi.updateTableProperties(updateRequest);
    }

    @Test
    public void testUpdateTablePropertiesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        TableProperties requestProperties = new TableProperties();
        requestProperties.setAlignment(TableProperties.AlignmentEnum.RIGHT);
        requestProperties.setAllowAutoFit(false);
        requestProperties.setBidi(true);
        requestProperties.setBottomPadding((double)1);
        requestProperties.setCellSpacing((double)2);
        requestProperties.setStyleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS);

        UpdateTablePropertiesOnlineRequest updateRequest = new UpdateTablePropertiesOnlineRequest(requestDocument, requestProperties, 1, null, null, null, null, null, null);
        wordsApi.updateTablePropertiesOnline(updateRequest);
    }

    @Test
    public void testUpdateTableRowFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TableRowFormat requestFormat = new TableRowFormat();
        requestFormat.setAllowBreakAcrossPages(true);
        requestFormat.setHeadingFormat(true);
        requestFormat.setHeight((double)10.0);
        requestFormat.setHeightRule(TableRowFormat.HeightRuleEnum.EXACTLY);

        UpdateTableRowFormatRequest updateRequest = new UpdateTableRowFormatRequest("Sample.docx", "sections/0/tables/2", 0, requestFormat, null, null, null, null, null, null, null);
        wordsApi.updateTableRowFormat(updateRequest);
    }

    @Test
    public void testUpdateTableRowFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestDocument = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        TableRowFormat requestFormat = new TableRowFormat();
        requestFormat.setAllowBreakAcrossPages(true);
        requestFormat.setHeadingFormat(true);
        requestFormat.setHeight((double)10);
        requestFormat.setHeightRule(TableRowFormat.HeightRuleEnum.AUTO);

        UpdateTableRowFormatOnlineRequest updateRequest = new UpdateTableRowFormatOnlineRequest(requestDocument, "sections/0/tables/2", requestFormat, 0, null, null, null, null, null);
        wordsApi.updateTableRowFormatOnline(updateRequest);
    }

    @Test
    public void testUploadFile() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        byte[] requestFileContent = Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath());
        UploadFileRequest uploadRequest = new UploadFileRequest(requestFileContent, "Sample.docx", null);
        wordsApi.uploadFile(uploadRequest);
    }
}