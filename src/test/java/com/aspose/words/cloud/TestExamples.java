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
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        AcceptAllRevisionsRequest acceptRequestRequest = new AcceptAllRevisionsRequest(remoteFileName,null,null,null,null,remoteFileName);
        wordsApi.acceptAllRevisions(acceptRequestRequest);
    }

    @Test
    public void testAcceptAllRevisionsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        AcceptAllRevisionsOnlineRequest acceptRequestRequest = new AcceptAllRevisionsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null);
        wordsApi.acceptAllRevisionsOnline(acceptRequestRequest);
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

        AppendDocumentRequest appendRequestRequest = new AppendDocumentRequest(remoteFileName,requestDocumentList,null,null,null,null,remoteFileName,null,null);
        wordsApi.appendDocument(appendRequestRequest);
    }

    @Test
    public void testAppendDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DocumentEntry requestDocumentListDocumentEntries0 = new DocumentEntry();
        requestDocumentListDocumentEntries0.setHref("Sample.docx");
        requestDocumentListDocumentEntries0.setImportFormatMode("KeepSourceFormatting");

        ArrayList<DocumentEntry> requestDocumentListDocumentEntries = new ArrayList<DocumentEntry>();
        requestDocumentListDocumentEntries.add(requestDocumentListDocumentEntries0);

        DocumentEntryList requestDocumentList = new DocumentEntryList();
        requestDocumentList.setDocumentEntries(requestDocumentListDocumentEntries);

        AppendDocumentOnlineRequest appendRequestRequest = new AppendDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestDocumentList,null,null,null,null,null);
        wordsApi.appendDocumentOnline(appendRequestRequest);
    }

    @Test
    public void testApplyStyleToDocumentElement() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleApply requestStyleApply = new StyleApply();
        requestStyleApply.setStyleName("Heading 1");

        ApplyStyleToDocumentElementRequest applyStyleRequestRequest = new ApplyStyleToDocumentElementRequest("Sample.docx","paragraphs/1/paragraphFormat",requestStyleApply,null,null,null,null,null,null,null);
        wordsApi.applyStyleToDocumentElement(applyStyleRequestRequest);
    }

    @Test
    public void testApplyStyleToDocumentElementOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleApply requestStyleApply = new StyleApply();
        requestStyleApply.setStyleName("Heading 1");

        ApplyStyleToDocumentElementOnlineRequest applyStyleRequestRequest = new ApplyStyleToDocumentElementOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"paragraphs/1/paragraphFormat",requestStyleApply,null,null,null,null,null);
        wordsApi.applyStyleToDocumentElementOnline(applyStyleRequestRequest);
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

        BuildReportRequest buildReportRequestRequest = new BuildReportRequest("Sample.docx","Data.json",requestReportEngineSettings,null,null,null,null,null);
        wordsApi.buildReport(buildReportRequestRequest);
    }

    @Test
    public void testBuildReportOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ReportEngineSettings requestReportEngineSettings = new ReportEngineSettings();
        requestReportEngineSettings.setDataSourceType(ReportEngineSettings.DataSourceTypeEnum.JSON);
        requestReportEngineSettings.setDataSourceName("persons");

        BuildReportOnlineRequest buildReportRequestRequest = new BuildReportOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"Data.json",requestReportEngineSettings,null);
        wordsApi.buildReportOnline(buildReportRequestRequest);
    }

    @Test
    public void testClassify() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ClassifyRequest classifyRequestRequest = new ClassifyRequest("Try text classification","3");
        wordsApi.classify(classifyRequestRequest);
    }

    @Test
    public void testClassifyDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ClassifyDocumentRequest classifyRequestRequest = new ClassifyDocumentRequest("Sample.docx",null,null,null,null,"3",null);
        wordsApi.classifyDocument(classifyRequestRequest);
    }

    @Test
    public void testClassifyDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ClassifyDocumentOnlineRequest classifyRequestRequest = new ClassifyDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,"3",null);
        wordsApi.classifyDocumentOnline(classifyRequestRequest);
    }

    @Test
    public void testCompareDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CompareData requestCompareData = new CompareData();
        requestCompareData.setAuthor("author");
        requestCompareData.setComparingWithDocument("TestCompareDocument2.doc");
        requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));

        CompareDocumentRequest compareRequestRequest = new CompareDocumentRequest("TestCompareDocument1.doc",requestCompareData,null,null,null,null,"/TestCompareDocumentOut.doc");
        wordsApi.compareDocument(compareRequestRequest);
    }

    @Test
    public void testCompareDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        CompareData requestCompareData = new CompareData();
        requestCompareData.setAuthor("author");
        requestCompareData.setComparingWithDocument("TestCompareDocument2.doc");
        requestCompareData.setDateTime(OffsetDateTime.of(2015, 10, 26, 0, 0, 0, 0, ZoneOffset.UTC));

        CompareDocumentOnlineRequest compareRequestRequest = new CompareDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "compareTestDoc1.doc").toAbsolutePath()),requestCompareData,Files.readAllBytes(Paths.get(documentsDir, "compareTestDoc2.doc").toAbsolutePath()),null,null,"/TestCompareDocumentOut.doc");
        wordsApi.compareDocumentOnline(compareRequestRequest);
    }

    @Test
    public void testConvertDocument() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ConvertDocumentRequest convertRequestRequest = new ConvertDocumentRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"pdf",null,null,null,null);
        wordsApi.convertDocument(convertRequestRequest);
    }

    @Test
    public void testCopyFile() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CopyFileRequest copyRequestRequest = new CopyFileRequest("/TestCopyFileDest.docx","Sample.docx",null,null,null);
        wordsApi.copyFile(copyRequestRequest);
    }

    @Test
    public void testCopyFolder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String folderToCopy = "/TestCopyFolder";

        CopyFolderRequest copyRequestRequest = new CopyFolderRequest(folderToCopy + "Dest",folderToCopy + "Src",null,null);
        wordsApi.copyFolder(copyRequestRequest);
    }

    @Test
    public void testCopyStyle() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleCopy requestStyleCopy = new StyleCopy();
        requestStyleCopy.setStyleName("Heading 1");

        CopyStyleRequest copyRequestRequest = new CopyStyleRequest("Sample.docx",requestStyleCopy,null,null,null,null,null,null,null);
        wordsApi.copyStyle(copyRequestRequest);
    }

    @Test
    public void testCopyStyleOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleCopy requestStyleCopy = new StyleCopy();
        requestStyleCopy.setStyleName("Heading 1");

        CopyStyleOnlineRequest copyRequestRequest = new CopyStyleOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestStyleCopy,null,null,null,null,null);
        wordsApi.copyStyleOnline(copyRequestRequest);
    }

    @Test
    public void testCreateDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CreateDocumentRequest createRequestRequest = new CreateDocumentRequest("Sample.docx",null,null);
        wordsApi.createDocument(createRequestRequest);
    }

    @Test
    public void testCreateFolder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CreateFolderRequest createRequestRequest = new CreateFolderRequest("/TestCreateFolder",null);
        wordsApi.createFolder(createRequestRequest);
    }

    @Test
    public void testCreateOrUpdateDocumentProperty() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        DocumentPropertyCreateOrUpdate requestProperty = new DocumentPropertyCreateOrUpdate();
        requestProperty.setValue("Imran Anwar");

        CreateOrUpdateDocumentPropertyRequest createRequestRequest = new CreateOrUpdateDocumentPropertyRequest(remoteFileName,"AsposeAuthor",requestProperty,null,null,null,null,remoteFileName,null,null);
        wordsApi.createOrUpdateDocumentProperty(createRequestRequest);
    }

    @Test
    public void testCreateOrUpdateDocumentPropertyOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DocumentPropertyCreateOrUpdate requestProperty = new DocumentPropertyCreateOrUpdate();
        requestProperty.setValue("Imran Anwar");

        CreateOrUpdateDocumentPropertyOnlineRequest createRequestRequest = new CreateOrUpdateDocumentPropertyOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"AsposeAuthor",requestProperty,null,null,null,null,null);
        wordsApi.createOrUpdateDocumentPropertyOnline(createRequestRequest);
    }

    @Test
    public void testDeleteAllParagraphTabStops() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteAllParagraphTabStopsRequest deleteRequestRequest = new DeleteAllParagraphTabStopsRequest("Sample.docx",0,null,null,null,null,null,null);
        wordsApi.deleteAllParagraphTabStops(deleteRequestRequest);
    }

    @Test
    public void testDeleteAllParagraphTabStopsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteAllParagraphTabStopsOnlineRequest deleteRequestRequest = new DeleteAllParagraphTabStopsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null,null,null);
        wordsApi.deleteAllParagraphTabStopsOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteBorder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteBorderRequest deleteRequestRequest = new DeleteBorderRequest("Sample.docx","left","tables/1/rows/0/cells/0",null,null,null,null,null,null,null);
        wordsApi.deleteBorder(deleteRequestRequest);
    }

    @Test
    public void testDeleteBorderOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteBorderOnlineRequest deleteRequestRequest = new DeleteBorderOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"left","tables/1/rows/0/cells/0",null,null,null,null,null);
        wordsApi.deleteBorderOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteBorders() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteBordersRequest deleteRequestRequest = new DeleteBordersRequest("Sample.docx","tables/1/rows/0/cells/0",null,null,null,null,null,null,null);
        wordsApi.deleteBorders(deleteRequestRequest);
    }

    @Test
    public void testDeleteBordersOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteBordersOnlineRequest deleteRequestRequest = new DeleteBordersOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"tables/1/rows/0/cells/0",null,null,null,null,null);
        wordsApi.deleteBordersOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteComment() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        DeleteCommentRequest deleteRequestRequest = new DeleteCommentRequest(remoteFileName,0,null,null,null,null,remoteFileName,null,null);
        wordsApi.deleteComment(deleteRequestRequest);
    }

    @Test
    public void testDeleteCommentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteCommentOnlineRequest deleteRequestRequest = new DeleteCommentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null,null,null,null);
        wordsApi.deleteCommentOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteComments() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        DeleteCommentsRequest deleteRequestRequest = new DeleteCommentsRequest(remoteFileName,null,null,null,null,remoteFileName,null,null);
        wordsApi.deleteComments(deleteRequestRequest);
    }

    @Test
    public void testDeleteCommentsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteCommentsOnlineRequest deleteRequestRequest = new DeleteCommentsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null,null,null);
        wordsApi.deleteCommentsOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteCustomXmlPart() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        DeleteCustomXmlPartRequest deleteRequestRequest = new DeleteCustomXmlPartRequest(remoteFileName,0,null,null,null,null,remoteFileName,null,null);
        wordsApi.deleteCustomXmlPart(deleteRequestRequest);
    }

    @Test
    public void testDeleteCustomXmlPartOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteCustomXmlPartOnlineRequest deleteRequestRequest = new DeleteCustomXmlPartOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null,null,null,null);
        wordsApi.deleteCustomXmlPartOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteCustomXmlParts() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        DeleteCustomXmlPartsRequest deleteRequestRequest = new DeleteCustomXmlPartsRequest(remoteFileName,null,null,null,null,remoteFileName,null,null);
        wordsApi.deleteCustomXmlParts(deleteRequestRequest);
    }

    @Test
    public void testDeleteCustomXmlPartsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteCustomXmlPartsOnlineRequest deleteRequestRequest = new DeleteCustomXmlPartsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null,null,null);
        wordsApi.deleteCustomXmlPartsOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteDocumentProperty() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        DeleteDocumentPropertyRequest deleteRequestRequest = new DeleteDocumentPropertyRequest(remoteFileName,"testProp",null,null,null,null,remoteFileName,null,null);
        wordsApi.deleteDocumentProperty(deleteRequestRequest);
    }

    @Test
    public void testDeleteDocumentPropertyOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteDocumentPropertyOnlineRequest deleteRequestRequest = new DeleteDocumentPropertyOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"testProp",null,null,null,null,null);
        wordsApi.deleteDocumentPropertyOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteDrawingObject() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteDrawingObjectRequest deleteRequestRequest = new DeleteDrawingObjectRequest("Sample.docx",0,null,null,null,null,null,null,null,null);
        wordsApi.deleteDrawingObject(deleteRequestRequest);
    }

    @Test
    public void testDeleteDrawingObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteDrawingObjectOnlineRequest deleteRequestRequest = new DeleteDrawingObjectOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null,null,null,null,null);
        wordsApi.deleteDrawingObjectOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFieldRequest deleteRequestRequest = new DeleteFieldRequest("Sample.docx",0,null,null,null,null,null,null,null,null);
        wordsApi.deleteField(deleteRequestRequest);
    }

    @Test
    public void testDeleteFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFieldOnlineRequest deleteRequestRequest = new DeleteFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"sections/0/paragraphs/0",null,null,null,null,null);
        wordsApi.deleteFieldOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteFields() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFieldsRequest deleteRequestRequest = new DeleteFieldsRequest("Sample.docx",null,null,null,null,null,null,null,null);
        wordsApi.deleteFields(deleteRequestRequest);
    }

    @Test
    public void testDeleteFieldsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFieldsOnlineRequest deleteRequestRequest = new DeleteFieldsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null,null,null,null);
        wordsApi.deleteFieldsOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteFile() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFileRequest deleteRequestRequest = new DeleteFileRequest("Sample.docx",null,null);
        wordsApi.deleteFile(deleteRequestRequest);
    }

    @Test
    public void testDeleteFolder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFolderRequest deleteRequestRequest = new DeleteFolderRequest("",null,null);
        wordsApi.deleteFolder(deleteRequestRequest);
    }

    @Test
    public void testDeleteFootnote() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFootnoteRequest deleteRequestRequest = new DeleteFootnoteRequest("Sample.docx",0,null,null,null,null,null,null,null,null);
        wordsApi.deleteFootnote(deleteRequestRequest);
    }

    @Test
    public void testDeleteFootnoteOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFootnoteOnlineRequest deleteRequestRequest = new DeleteFootnoteOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),0,null,null,null,null,null,null);
        wordsApi.deleteFootnoteOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteFormField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        DeleteFormFieldRequest deleteRequestRequest = new DeleteFormFieldRequest(remoteFileName,0,null,null,null,null,null,remoteFileName,null,null);
        wordsApi.deleteFormField(deleteRequestRequest);
    }

    @Test
    public void testDeleteFormFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteFormFieldOnlineRequest deleteRequestRequest = new DeleteFormFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"sections/0",null,null,null,null,null);
        wordsApi.deleteFormFieldOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteHeaderFooter() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteHeaderFooterRequest deleteRequestRequest = new DeleteHeaderFooterRequest("Sample.docx","",0,null,null,null,null,null,null,null);
        wordsApi.deleteHeaderFooter(deleteRequestRequest);
    }

    @Test
    public void testDeleteHeaderFooterOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteHeaderFooterOnlineRequest deleteRequestRequest = new DeleteHeaderFooterOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/HeaderFooters/HeadersFooters.doc").toAbsolutePath()),"",0,null,null,null,null,null);
        wordsApi.deleteHeaderFooterOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteHeadersFooters() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteHeadersFootersRequest deleteRequestRequest = new DeleteHeadersFootersRequest("Sample.docx","",null,null,null,null,null,null,null,null);
        wordsApi.deleteHeadersFooters(deleteRequestRequest);
    }

    @Test
    public void testDeleteHeadersFootersOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteHeadersFootersOnlineRequest deleteRequestRequest = new DeleteHeadersFootersOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/HeaderFooters/HeadersFooters.doc").toAbsolutePath()),"",null,null,null,null,null,null);
        wordsApi.deleteHeadersFootersOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteMacros() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteMacrosRequest deleteRequestRequest = new DeleteMacrosRequest("Sample.docx",null,null,null,null,null,null,null);
        wordsApi.deleteMacros(deleteRequestRequest);
    }

    @Test
    public void testDeleteMacrosOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteMacrosOnlineRequest deleteRequestRequest = new DeleteMacrosOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null,null,null);
        wordsApi.deleteMacrosOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteOfficeMathObject() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteOfficeMathObjectRequest deleteRequestRequest = new DeleteOfficeMathObjectRequest("Sample.docx",0,null,null,null,null,null,null,null,null);
        wordsApi.deleteOfficeMathObject(deleteRequestRequest);
    }

    @Test
    public void testDeleteOfficeMathObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteOfficeMathObjectOnlineRequest deleteRequestRequest = new DeleteOfficeMathObjectOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null,null,null,null,null);
        wordsApi.deleteOfficeMathObjectOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteParagraph() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteParagraphRequest deleteRequestRequest = new DeleteParagraphRequest("Sample.docx",0,null,null,null,null,null,null,null,null);
        wordsApi.deleteParagraph(deleteRequestRequest);
    }

    @Test
    public void testDeleteParagraphListFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteParagraphListFormatRequest deleteRequestRequest = new DeleteParagraphListFormatRequest("Sample.docx",0,null,null,null,null,null,null,null,null);
        wordsApi.deleteParagraphListFormat(deleteRequestRequest);
    }

    @Test
    public void testDeleteParagraphListFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteParagraphListFormatOnlineRequest deleteRequestRequest = new DeleteParagraphListFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),0,null,null,null,null,null,null);
        wordsApi.deleteParagraphListFormatOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteParagraphOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteParagraphOnlineRequest deleteRequestRequest = new DeleteParagraphOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null,null,null,null,null);
        wordsApi.deleteParagraphOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteParagraphTabStop() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteParagraphTabStopRequest deleteRequestRequest = new DeleteParagraphTabStopRequest("Sample.docx",(double)72.0,0,null,null,null,null,null,null);
        wordsApi.deleteParagraphTabStop(deleteRequestRequest);
    }

    @Test
    public void testDeleteParagraphTabStopOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteParagraphTabStopOnlineRequest deleteRequestRequest = new DeleteParagraphTabStopOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),(double)72.0,0,null,null,null,null);
        wordsApi.deleteParagraphTabStopOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteRun() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteRunRequest deleteRequestRequest = new DeleteRunRequest("Sample.docx","paragraphs/1",0,null,null,null,null,null,null,null);
        wordsApi.deleteRun(deleteRequestRequest);
    }

    @Test
    public void testDeleteRunOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteRunOnlineRequest deleteRequestRequest = new DeleteRunOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Runs/Run.doc").toAbsolutePath()),"paragraphs/1",0,null,null,null,null,null);
        wordsApi.deleteRunOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteSection() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteSectionRequest deleteRequestRequest = new DeleteSectionRequest("Sample.docx",0,null,null,null,null,null,null,null);
        wordsApi.deleteSection(deleteRequestRequest);
    }

    @Test
    public void testDeleteSectionOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteSectionOnlineRequest deleteRequestRequest = new DeleteSectionOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null,null,null,null);
        wordsApi.deleteSectionOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteTable() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteTableRequest deleteRequestRequest = new DeleteTableRequest("Sample.docx",1,null,null,null,null,null,null,null,null);
        wordsApi.deleteTable(deleteRequestRequest);
    }

    @Test
    public void testDeleteTableCell() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteTableCellRequest deleteRequestRequest = new DeleteTableCellRequest("Sample.docx","sections/0/tables/2/rows/0",0,null,null,null,null,null,null,null);
        wordsApi.deleteTableCell(deleteRequestRequest);
    }

    @Test
    public void testDeleteTableCellOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteTableCellOnlineRequest deleteRequestRequest = new DeleteTableCellOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2/rows/0",0,null,null,null,null,null);
        wordsApi.deleteTableCellOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteTableOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteTableOnlineRequest deleteRequestRequest = new DeleteTableOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),1,null,null,null,null,null,null);
        wordsApi.deleteTableOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteTableRow() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteTableRowRequest deleteRequestRequest = new DeleteTableRowRequest("Sample.docx","tables/1",0,null,null,null,null,null,null,null);
        wordsApi.deleteTableRow(deleteRequestRequest);
    }

    @Test
    public void testDeleteTableRowOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteTableRowOnlineRequest deleteRequestRequest = new DeleteTableRowOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"tables/1",0,null,null,null,null,null);
        wordsApi.deleteTableRowOnline(deleteRequestRequest);
    }

    @Test
    public void testDeleteWatermark() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        DeleteWatermarkRequest deleteRequestRequest = new DeleteWatermarkRequest(remoteFileName,null,null,null,null,remoteFileName,null,null);
        wordsApi.deleteWatermark(deleteRequestRequest);
    }

    @Test
    public void testDeleteWatermarkOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DeleteWatermarkOnlineRequest deleteRequestRequest = new DeleteWatermarkOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null,null,null);
        wordsApi.deleteWatermarkOnline(deleteRequestRequest);
    }

    @Test
    public void testDownloadFile() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        DownloadFileRequest downloadRequestRequest = new DownloadFileRequest("Sample.docx",null,null);
        wordsApi.downloadFile(downloadRequestRequest);
    }

    @Test
    public void testExecuteMailMerge() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        ExecuteMailMergeRequest mailMergeRequestRequest = new ExecuteMailMergeRequest(remoteFileName,"TestExecuteTemplateData.txt",null,null,null,null,null,null,null,null,remoteFileName);
        wordsApi.executeMailMerge(mailMergeRequestRequest);
    }

    @Test
    public void testExecuteMailMergeOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ExecuteMailMergeOnlineRequest mailMergeRequestRequest = new ExecuteMailMergeOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "TestExecuteTemplate.doc").toAbsolutePath()),Files.readAllBytes(Paths.get(documentsDir, "TestExecuteTemplateData.txt").toAbsolutePath()),null,null,null);
        wordsApi.executeMailMergeOnline(mailMergeRequestRequest);
    }

    @Test
    public void testGetAvailableFonts() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetAvailableFontsRequest requestRequest = new GetAvailableFontsRequest(null);
        wordsApi.getAvailableFonts(requestRequest);
    }

    @Test
    public void testGetBookmarkByName() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBookmarkByNameRequest requestRequest = new GetBookmarkByNameRequest("Sample.docx","aspose",null,null,null,null);
        wordsApi.getBookmarkByName(requestRequest);
    }

    @Test
    public void testGetBookmarkByNameOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBookmarkByNameOnlineRequest requestRequest = new GetBookmarkByNameOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"aspose",null,null);
        wordsApi.getBookmarkByNameOnline(requestRequest);
    }

    @Test
    public void testGetBookmarks() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBookmarksRequest requestRequest = new GetBookmarksRequest("Sample.docx",null,null,null,null);
        wordsApi.getBookmarks(requestRequest);
    }

    @Test
    public void testGetBookmarksOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBookmarksOnlineRequest requestRequest = new GetBookmarksOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null);
        wordsApi.getBookmarksOnline(requestRequest);
    }

    @Test
    public void testGetBorder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBorderRequest requestRequest = new GetBorderRequest("Sample.docx","left","tables/1/rows/0/cells/0",null,null,null,null);
        wordsApi.getBorder(requestRequest);
    }

    @Test
    public void testGetBorderOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBorderOnlineRequest requestRequest = new GetBorderOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"left","tables/1/rows/0/cells/0",null,null);
        wordsApi.getBorderOnline(requestRequest);
    }

    @Test
    public void testGetBorders() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBordersRequest requestRequest = new GetBordersRequest("Sample.docx","tables/1/rows/0/cells/0",null,null,null,null);
        wordsApi.getBorders(requestRequest);
    }

    @Test
    public void testGetBordersOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetBordersOnlineRequest requestRequest = new GetBordersOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"tables/1/rows/0/cells/0",null,null);
        wordsApi.getBordersOnline(requestRequest);
    }

    @Test
    public void testGetComment() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCommentRequest requestRequest = new GetCommentRequest("Sample.docx",0,null,null,null,null);
        wordsApi.getComment(requestRequest);
    }

    @Test
    public void testGetCommentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCommentOnlineRequest requestRequest = new GetCommentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null);
        wordsApi.getCommentOnline(requestRequest);
    }

    @Test
    public void testGetComments() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCommentsRequest requestRequest = new GetCommentsRequest("Sample.docx",null,null,null,null);
        wordsApi.getComments(requestRequest);
    }

    @Test
    public void testGetCommentsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCommentsOnlineRequest requestRequest = new GetCommentsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null);
        wordsApi.getCommentsOnline(requestRequest);
    }

    @Test
    public void testGetCustomXmlPart() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCustomXmlPartRequest requestRequest = new GetCustomXmlPartRequest("Sample.docx",0,null,null,null,null);
        wordsApi.getCustomXmlPart(requestRequest);
    }

    @Test
    public void testGetCustomXmlPartOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCustomXmlPartOnlineRequest requestRequest = new GetCustomXmlPartOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null);
        wordsApi.getCustomXmlPartOnline(requestRequest);
    }

    @Test
    public void testGetCustomXmlParts() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCustomXmlPartsRequest requestRequest = new GetCustomXmlPartsRequest("Sample.docx",null,null,null,null);
        wordsApi.getCustomXmlParts(requestRequest);
    }

    @Test
    public void testGetCustomXmlPartsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetCustomXmlPartsOnlineRequest requestRequest = new GetCustomXmlPartsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null);
        wordsApi.getCustomXmlPartsOnline(requestRequest);
    }

    @Test
    public void testGetDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentRequest requestRequest = new GetDocumentRequest("Sample.docx",null,null,null,null);
        wordsApi.getDocument(requestRequest);
    }

    @Test
    public void testGetDocumentDrawingObjectByIndex() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectByIndexRequest requestRequest = new GetDocumentDrawingObjectByIndexRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getDocumentDrawingObjectByIndex(requestRequest);
    }

    @Test
    public void testGetDocumentDrawingObjectByIndexOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectByIndexOnlineRequest requestRequest = new GetDocumentDrawingObjectByIndexOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"sections/0",null,null);
        wordsApi.getDocumentDrawingObjectByIndexOnline(requestRequest);
    }

    @Test
    public void testGetDocumentDrawingObjectImageData() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectImageDataRequest requestRequest = new GetDocumentDrawingObjectImageDataRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getDocumentDrawingObjectImageData(requestRequest);
    }

    @Test
    public void testGetDocumentDrawingObjectImageDataOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectImageDataOnlineRequest requestRequest = new GetDocumentDrawingObjectImageDataOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"sections/0",null,null);
        wordsApi.getDocumentDrawingObjectImageDataOnline(requestRequest);
    }

    @Test
    public void testGetDocumentDrawingObjectOleData() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectOleDataRequest requestRequest = new GetDocumentDrawingObjectOleDataRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getDocumentDrawingObjectOleData(requestRequest);
    }

    @Test
    public void testGetDocumentDrawingObjectOleDataOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectOleDataOnlineRequest requestRequest = new GetDocumentDrawingObjectOleDataOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"sections/0",null,null);
        wordsApi.getDocumentDrawingObjectOleDataOnline(requestRequest);
    }

    @Test
    public void testGetDocumentDrawingObjects() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectsRequest requestRequest = new GetDocumentDrawingObjectsRequest("Sample.docx",null,null,null,null,null);
        wordsApi.getDocumentDrawingObjects(requestRequest);
    }

    @Test
    public void testGetDocumentDrawingObjectsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentDrawingObjectsOnlineRequest requestRequest = new GetDocumentDrawingObjectsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0",null,null);
        wordsApi.getDocumentDrawingObjectsOnline(requestRequest);
    }

    @Test
    public void testGetDocumentFieldNames() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentFieldNamesRequest requestRequest = new GetDocumentFieldNamesRequest("Sample.docx",null,null,null,null,null);
        wordsApi.getDocumentFieldNames(requestRequest);
    }

    @Test
    public void testGetDocumentFieldNamesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentFieldNamesOnlineRequest requestRequest = new GetDocumentFieldNamesOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,true);
        wordsApi.getDocumentFieldNamesOnline(requestRequest);
    }

    @Test
    public void testGetDocumentHyperlinkByIndex() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentHyperlinkByIndexRequest requestRequest = new GetDocumentHyperlinkByIndexRequest("Sample.docx",0,null,null,null,null);
        wordsApi.getDocumentHyperlinkByIndex(requestRequest);
    }

    @Test
    public void testGetDocumentHyperlinkByIndexOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentHyperlinkByIndexOnlineRequest requestRequest = new GetDocumentHyperlinkByIndexOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null);
        wordsApi.getDocumentHyperlinkByIndexOnline(requestRequest);
    }

    @Test
    public void testGetDocumentHyperlinks() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentHyperlinksRequest requestRequest = new GetDocumentHyperlinksRequest("Sample.docx",null,null,null,null);
        wordsApi.getDocumentHyperlinks(requestRequest);
    }

    @Test
    public void testGetDocumentHyperlinksOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentHyperlinksOnlineRequest requestRequest = new GetDocumentHyperlinksOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null);
        wordsApi.getDocumentHyperlinksOnline(requestRequest);
    }

    @Test
    public void testGetDocumentProperties() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentPropertiesRequest requestRequest = new GetDocumentPropertiesRequest("Sample.docx",null,null,null,null);
        wordsApi.getDocumentProperties(requestRequest);
    }

    @Test
    public void testGetDocumentPropertiesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentPropertiesOnlineRequest requestRequest = new GetDocumentPropertiesOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null);
        wordsApi.getDocumentPropertiesOnline(requestRequest);
    }

    @Test
    public void testGetDocumentProperty() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentPropertyRequest requestRequest = new GetDocumentPropertyRequest("Sample.docx","Author",null,null,null,null);
        wordsApi.getDocumentProperty(requestRequest);
    }

    @Test
    public void testGetDocumentPropertyOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentPropertyOnlineRequest requestRequest = new GetDocumentPropertyOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"Author",null,null);
        wordsApi.getDocumentPropertyOnline(requestRequest);
    }

    @Test
    public void testGetDocumentProtection() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentProtectionRequest requestRequest = new GetDocumentProtectionRequest("Sample.docx",null,null,null,null);
        wordsApi.getDocumentProtection(requestRequest);
    }

    @Test
    public void testGetDocumentProtectionOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentProtectionOnlineRequest requestRequest = new GetDocumentProtectionOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null);
        wordsApi.getDocumentProtectionOnline(requestRequest);
    }

    @Test
    public void testGetDocumentStatistics() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentStatisticsRequest requestRequest = new GetDocumentStatisticsRequest("Sample.docx",null,null,null,null,null,null,null);
        wordsApi.getDocumentStatistics(requestRequest);
    }

    @Test
    public void testGetDocumentStatisticsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentStatisticsOnlineRequest requestRequest = new GetDocumentStatisticsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null,null,null);
        wordsApi.getDocumentStatisticsOnline(requestRequest);
    }

    @Test
    public void testGetDocumentWithFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetDocumentWithFormatRequest requestRequest = new GetDocumentWithFormatRequest("Sample.docx","text",null,null,null,null,"/TestGetDocumentWithFormatAndOutPath.text",null);
        wordsApi.getDocumentWithFormat(requestRequest);
    }

    @Test
    public void testGetField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFieldRequest requestRequest = new GetFieldRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getField(requestRequest);
    }

    @Test
    public void testGetFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFieldOnlineRequest requestRequest = new GetFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"sections/0/paragraphs/0",null,null);
        wordsApi.getFieldOnline(requestRequest);
    }

    @Test
    public void testGetFields() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFieldsRequest requestRequest = new GetFieldsRequest("Sample.docx",null,null,null,null,null);
        wordsApi.getFields(requestRequest);
    }

    @Test
    public void testGetFieldsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFieldsOnlineRequest requestRequest = new GetFieldsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0",null,null);
        wordsApi.getFieldsOnline(requestRequest);
    }

    @Test
    public void testGetFilesList() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFilesListRequest requestRequest = new GetFilesListRequest("",null);
        wordsApi.getFilesList(requestRequest);
    }

    @Test
    public void testGetFootnote() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFootnoteRequest requestRequest = new GetFootnoteRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getFootnote(requestRequest);
    }

    @Test
    public void testGetFootnoteOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFootnoteOnlineRequest requestRequest = new GetFootnoteOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),0,null,null,null);
        wordsApi.getFootnoteOnline(requestRequest);
    }

    @Test
    public void testGetFootnotes() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFootnotesRequest requestRequest = new GetFootnotesRequest("Sample.docx",null,null,null,null,null);
        wordsApi.getFootnotes(requestRequest);
    }

    @Test
    public void testGetFootnotesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFootnotesOnlineRequest requestRequest = new GetFootnotesOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),null,null,null);
        wordsApi.getFootnotesOnline(requestRequest);
    }

    @Test
    public void testGetFormField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFormFieldRequest requestRequest = new GetFormFieldRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getFormField(requestRequest);
    }

    @Test
    public void testGetFormFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFormFieldOnlineRequest requestRequest = new GetFormFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"sections/0",null,null);
        wordsApi.getFormFieldOnline(requestRequest);
    }

    @Test
    public void testGetFormFields() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFormFieldsRequest requestRequest = new GetFormFieldsRequest("Sample.docx",null,null,null,null,null);
        wordsApi.getFormFields(requestRequest);
    }

    @Test
    public void testGetFormFieldsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetFormFieldsOnlineRequest requestRequest = new GetFormFieldsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0",null,null);
        wordsApi.getFormFieldsOnline(requestRequest);
    }

    @Test
    public void testGetHeaderFooter() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetHeaderFooterRequest requestRequest = new GetHeaderFooterRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getHeaderFooter(requestRequest);
    }

    @Test
    public void testGetHeaderFooterOfSection() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetHeaderFooterOfSectionRequest requestRequest = new GetHeaderFooterOfSectionRequest("Sample.docx",0,0,null,null,null,null,null);
        wordsApi.getHeaderFooterOfSection(requestRequest);
    }

    @Test
    public void testGetHeaderFooterOfSectionOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetHeaderFooterOfSectionOnlineRequest requestRequest = new GetHeaderFooterOfSectionOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/HeaderFooters/HeadersFooters.doc").toAbsolutePath()),0,0,null,null,null);
        wordsApi.getHeaderFooterOfSectionOnline(requestRequest);
    }

    @Test
    public void testGetHeaderFooterOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetHeaderFooterOnlineRequest requestRequest = new GetHeaderFooterOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/HeaderFooters/HeadersFooters.doc").toAbsolutePath()),0,null,null,null);
        wordsApi.getHeaderFooterOnline(requestRequest);
    }

    @Test
    public void testGetHeaderFooters() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetHeaderFootersRequest requestRequest = new GetHeaderFootersRequest("Sample.docx","",null,null,null,null,null);
        wordsApi.getHeaderFooters(requestRequest);
    }

    @Test
    public void testGetHeaderFootersOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetHeaderFootersOnlineRequest requestRequest = new GetHeaderFootersOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/HeaderFooters/HeadersFooters.doc").toAbsolutePath()),"",null,null,null);
        wordsApi.getHeaderFootersOnline(requestRequest);
    }

    @Test
    public void testGetList() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetListRequest requestRequest = new GetListRequest("TestGetLists.doc",1,null,null,null,null);
        wordsApi.getList(requestRequest);
    }

    @Test
    public void testGetListOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetListOnlineRequest requestRequest = new GetListOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Lists/ListsGet.doc").toAbsolutePath()),1,null,null);
        wordsApi.getListOnline(requestRequest);
    }

    @Test
    public void testGetLists() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetListsRequest requestRequest = new GetListsRequest("TestGetLists.doc",null,null,null,null);
        wordsApi.getLists(requestRequest);
    }

    @Test
    public void testGetListsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetListsOnlineRequest requestRequest = new GetListsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Lists/ListsGet.doc").toAbsolutePath()),null,null);
        wordsApi.getListsOnline(requestRequest);
    }

    @Test
    public void testGetOfficeMathObject() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetOfficeMathObjectRequest requestRequest = new GetOfficeMathObjectRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getOfficeMathObject(requestRequest);
    }

    @Test
    public void testGetOfficeMathObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetOfficeMathObjectOnlineRequest requestRequest = new GetOfficeMathObjectOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null,null);
        wordsApi.getOfficeMathObjectOnline(requestRequest);
    }

    @Test
    public void testGetOfficeMathObjects() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetOfficeMathObjectsRequest requestRequest = new GetOfficeMathObjectsRequest("Sample.docx",null,null,null,null,null);
        wordsApi.getOfficeMathObjects(requestRequest);
    }

    @Test
    public void testGetOfficeMathObjectsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetOfficeMathObjectsOnlineRequest requestRequest = new GetOfficeMathObjectsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null);
        wordsApi.getOfficeMathObjectsOnline(requestRequest);
    }

    @Test
    public void testGetParagraph() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphRequest requestRequest = new GetParagraphRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getParagraph(requestRequest);
    }

    @Test
    public void testGetParagraphFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphFormatRequest requestRequest = new GetParagraphFormatRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getParagraphFormat(requestRequest);
    }

    @Test
    public void testGetParagraphFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphFormatOnlineRequest requestRequest = new GetParagraphFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null,null);
        wordsApi.getParagraphFormatOnline(requestRequest);
    }

    @Test
    public void testGetParagraphListFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphListFormatRequest requestRequest = new GetParagraphListFormatRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getParagraphListFormat(requestRequest);
    }

    @Test
    public void testGetParagraphListFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphListFormatOnlineRequest requestRequest = new GetParagraphListFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),0,null,null,null);
        wordsApi.getParagraphListFormatOnline(requestRequest);
    }

    @Test
    public void testGetParagraphOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphOnlineRequest requestRequest = new GetParagraphOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"sections/0",null,null);
        wordsApi.getParagraphOnline(requestRequest);
    }

    @Test
    public void testGetParagraphs() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphsRequest requestRequest = new GetParagraphsRequest("Sample.docx",null,null,null,null,null);
        wordsApi.getParagraphs(requestRequest);
    }

    @Test
    public void testGetParagraphsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphsOnlineRequest requestRequest = new GetParagraphsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0",null,null);
        wordsApi.getParagraphsOnline(requestRequest);
    }

    @Test
    public void testGetParagraphTabStops() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphTabStopsRequest requestRequest = new GetParagraphTabStopsRequest("Sample.docx",0,null,null,null,null,null);
        wordsApi.getParagraphTabStops(requestRequest);
    }

    @Test
    public void testGetParagraphTabStopsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetParagraphTabStopsOnlineRequest requestRequest = new GetParagraphTabStopsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null,null);
        wordsApi.getParagraphTabStopsOnline(requestRequest);
    }

    @Test
    public void testGetPublicKey() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetPublicKeyRequest requestRequest = new GetPublicKeyRequest();
        wordsApi.getPublicKey(requestRequest);
    }

    @Test
    public void testGetRangeText() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRangeTextRequest requestRequest = new GetRangeTextRequest("Sample.docx","id0.0.0","id0.0.1",null,null,null,null);
        wordsApi.getRangeText(requestRequest);
    }

    @Test
    public void testGetRangeTextOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRangeTextOnlineRequest requestRequest = new GetRangeTextOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Range/RangeGet.doc").toAbsolutePath()),"id0.0.0","id0.0.1",null,null);
        wordsApi.getRangeTextOnline(requestRequest);
    }

    @Test
    public void testGetRun() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRunRequest requestRequest = new GetRunRequest("Sample.docx","paragraphs/0",0,null,null,null,null);
        wordsApi.getRun(requestRequest);
    }

    @Test
    public void testGetRunFont() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRunFontRequest requestRequest = new GetRunFontRequest("Sample.docx","paragraphs/0",0,null,null,null,null);
        wordsApi.getRunFont(requestRequest);
    }

    @Test
    public void testGetRunFontOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRunFontOnlineRequest requestRequest = new GetRunFontOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"paragraphs/0",0,null,null);
        wordsApi.getRunFontOnline(requestRequest);
    }

    @Test
    public void testGetRunOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRunOnlineRequest requestRequest = new GetRunOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"paragraphs/0",0,null,null);
        wordsApi.getRunOnline(requestRequest);
    }

    @Test
    public void testGetRuns() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRunsRequest requestRequest = new GetRunsRequest("Sample.docx","sections/0/paragraphs/0",null,null,null,null);
        wordsApi.getRuns(requestRequest);
    }

    @Test
    public void testGetRunsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetRunsOnlineRequest requestRequest = new GetRunsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/paragraphs/0",null,null);
        wordsApi.getRunsOnline(requestRequest);
    }

    @Test
    public void testGetSection() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetSectionRequest requestRequest = new GetSectionRequest("Sample.docx",0,null,null,null,null);
        wordsApi.getSection(requestRequest);
    }

    @Test
    public void testGetSectionOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetSectionOnlineRequest requestRequest = new GetSectionOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null);
        wordsApi.getSectionOnline(requestRequest);
    }

    @Test
    public void testGetSectionPageSetup() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetSectionPageSetupRequest requestRequest = new GetSectionPageSetupRequest("Sample.docx",0,null,null,null,null);
        wordsApi.getSectionPageSetup(requestRequest);
    }

    @Test
    public void testGetSectionPageSetupOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetSectionPageSetupOnlineRequest requestRequest = new GetSectionPageSetupOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,null,null);
        wordsApi.getSectionPageSetupOnline(requestRequest);
    }

    @Test
    public void testGetSections() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetSectionsRequest requestRequest = new GetSectionsRequest("Sample.docx",null,null,null,null);
        wordsApi.getSections(requestRequest);
    }

    @Test
    public void testGetSectionsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetSectionsOnlineRequest requestRequest = new GetSectionsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null);
        wordsApi.getSectionsOnline(requestRequest);
    }

    @Test
    public void testGetStyle() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetStyleRequest requestRequest = new GetStyleRequest("Sample.docx","Heading 1",null,null,null,null);
        wordsApi.getStyle(requestRequest);
    }

    @Test
    public void testGetStyleFromDocumentElement() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetStyleFromDocumentElementRequest requestRequest = new GetStyleFromDocumentElementRequest("Sample.docx","paragraphs/1/paragraphFormat",null,null,null,null);
        wordsApi.getStyleFromDocumentElement(requestRequest);
    }

    @Test
    public void testGetStyleFromDocumentElementOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetStyleFromDocumentElementOnlineRequest requestRequest = new GetStyleFromDocumentElementOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"paragraphs/1/paragraphFormat",null,null);
        wordsApi.getStyleFromDocumentElementOnline(requestRequest);
    }

    @Test
    public void testGetStyleOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetStyleOnlineRequest requestRequest = new GetStyleOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"Heading 1",null,null);
        wordsApi.getStyleOnline(requestRequest);
    }

    @Test
    public void testGetStyles() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetStylesRequest requestRequest = new GetStylesRequest("Sample.docx",null,null,null,null);
        wordsApi.getStyles(requestRequest);
    }

    @Test
    public void testGetStylesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetStylesOnlineRequest requestRequest = new GetStylesOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null);
        wordsApi.getStylesOnline(requestRequest);
    }

    @Test
    public void testGetTable() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableRequest requestRequest = new GetTableRequest("Sample.docx",1,null,null,null,null,null);
        wordsApi.getTable(requestRequest);
    }

    @Test
    public void testGetTableCell() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableCellRequest requestRequest = new GetTableCellRequest("Sample.docx","sections/0/tables/2/rows/0",0,null,null,null,null);
        wordsApi.getTableCell(requestRequest);
    }

    @Test
    public void testGetTableCellFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableCellFormatRequest requestRequest = new GetTableCellFormatRequest("Sample.docx","sections/0/tables/2/rows/0",0,null,null,null,null);
        wordsApi.getTableCellFormat(requestRequest);
    }

    @Test
    public void testGetTableCellFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableCellFormatOnlineRequest requestRequest = new GetTableCellFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2/rows/0",0,null,null);
        wordsApi.getTableCellFormatOnline(requestRequest);
    }

    @Test
    public void testGetTableCellOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableCellOnlineRequest requestRequest = new GetTableCellOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2/rows/0",0,null,null);
        wordsApi.getTableCellOnline(requestRequest);
    }

    @Test
    public void testGetTableOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableOnlineRequest requestRequest = new GetTableOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),1,null,null,null);
        wordsApi.getTableOnline(requestRequest);
    }

    @Test
    public void testGetTableProperties() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTablePropertiesRequest requestRequest = new GetTablePropertiesRequest("Sample.docx",1,null,null,null,null,null);
        wordsApi.getTableProperties(requestRequest);
    }

    @Test
    public void testGetTablePropertiesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTablePropertiesOnlineRequest requestRequest = new GetTablePropertiesOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),1,null,null,null);
        wordsApi.getTablePropertiesOnline(requestRequest);
    }

    @Test
    public void testGetTableRow() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableRowRequest requestRequest = new GetTableRowRequest("Sample.docx","tables/1",0,null,null,null,null);
        wordsApi.getTableRow(requestRequest);
    }

    @Test
    public void testGetTableRowFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableRowFormatRequest requestRequest = new GetTableRowFormatRequest("Sample.docx","sections/0/tables/2",0,null,null,null,null);
        wordsApi.getTableRowFormat(requestRequest);
    }

    @Test
    public void testGetTableRowFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableRowFormatOnlineRequest requestRequest = new GetTableRowFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2",0,null,null);
        wordsApi.getTableRowFormatOnline(requestRequest);
    }

    @Test
    public void testGetTableRowOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTableRowOnlineRequest requestRequest = new GetTableRowOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"tables/1",0,null,null);
        wordsApi.getTableRowOnline(requestRequest);
    }

    @Test
    public void testGetTables() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTablesRequest requestRequest = new GetTablesRequest("Sample.docx",null,null,null,null,null);
        wordsApi.getTables(requestRequest);
    }

    @Test
    public void testGetTablesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        GetTablesOnlineRequest requestRequest = new GetTablesOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null);
        wordsApi.getTablesOnline(requestRequest);
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

        InsertCommentRequest insertRequestRequest = new InsertCommentRequest("Sample.docx",requestComment,null,null,null,null,null,null,null);
        wordsApi.insertComment(insertRequestRequest);
    }

    @Test
    public void testInsertCommentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
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

        InsertCommentOnlineRequest insertRequestRequest = new InsertCommentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestComment,null,null,null,null,null);
        wordsApi.insertCommentOnline(insertRequestRequest);
    }

    @Test
    public void testInsertCustomXmlPart() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CustomXmlPartInsert requestCustomXmlPart = new CustomXmlPartInsert();
        requestCustomXmlPart.setId("hello");
        requestCustomXmlPart.setData("<data>Hello world</data>");

        InsertCustomXmlPartRequest insertRequestRequest = new InsertCustomXmlPartRequest("Sample.docx",requestCustomXmlPart,null,null,null,null,null,null,null);
        wordsApi.insertCustomXmlPart(insertRequestRequest);
    }

    @Test
    public void testInsertCustomXmlPartOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        CustomXmlPartInsert requestCustomXmlPart = new CustomXmlPartInsert();
        requestCustomXmlPart.setId("hello");
        requestCustomXmlPart.setData("<data>Hello world</data>");

        InsertCustomXmlPartOnlineRequest insertRequestRequest = new InsertCustomXmlPartOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestCustomXmlPart,null,null,null,null,null);
        wordsApi.insertCustomXmlPartOnline(insertRequestRequest);
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

        InsertDrawingObjectRequest insertRequestRequest = new InsertDrawingObjectRequest("Sample.docx",requestDrawingObject,Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath()),null,null,null,null,null,null,null,null);
        wordsApi.insertDrawingObject(insertRequestRequest);
    }

    @Test
    public void testInsertDrawingObjectOnline() throws Exception
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

        InsertDrawingObjectOnlineRequest insertRequestRequest = new InsertDrawingObjectOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestDrawingObject,Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath()),null,null,null,null,null,null);
        wordsApi.insertDrawingObjectOnline(insertRequestRequest);
    }

    @Test
    public void testInsertField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        FieldInsert requestField = new FieldInsert();
        requestField.setFieldCode("{ NUMPAGES }");

        InsertFieldRequest insertRequestRequest = new InsertFieldRequest("Sample.docx",requestField,null,null,null,null,null,null,null,null,null);
        wordsApi.insertField(insertRequestRequest);
    }

    @Test
    public void testInsertFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        FieldInsert requestField = new FieldInsert();
        requestField.setFieldCode("{ NUMPAGES }");

        InsertFieldOnlineRequest insertRequestRequest = new InsertFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestField,"sections/0/paragraphs/0",null,null,null,null,null,null);
        wordsApi.insertFieldOnline(insertRequestRequest);
    }

    @Test
    public void testInsertFootnote() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        FootnoteInsert requestFootnoteDto = new FootnoteInsert();
        requestFootnoteDto.setFootnoteType(FootnoteInsert.FootnoteTypeEnum.ENDNOTE);
        requestFootnoteDto.setText("test endnote");

        InsertFootnoteRequest insertRequestRequest = new InsertFootnoteRequest("Sample.docx",requestFootnoteDto,null,null,null,null,null,null,null,null);
        wordsApi.insertFootnote(insertRequestRequest);
    }

    @Test
    public void testInsertFootnoteOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        FootnoteInsert requestFootnoteDto = new FootnoteInsert();
        requestFootnoteDto.setFootnoteType(FootnoteInsert.FootnoteTypeEnum.ENDNOTE);
        requestFootnoteDto.setText("test endnote");

        InsertFootnoteOnlineRequest insertRequestRequest = new InsertFootnoteOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),requestFootnoteDto,null,null,null,null,null,null);
        wordsApi.insertFootnoteOnline(insertRequestRequest);
    }

    @Test
    public void testInsertFormField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("123");
        requestFormField.setTextInputFormat("UPPERCASE");

        InsertFormFieldRequest insertRequestRequest = new InsertFormFieldRequest(remoteFileName,requestFormField,null,null,null,null,null,remoteFileName,null,null,null);
        wordsApi.insertFormField(insertRequestRequest);
    }

    @Test
    public void testInsertFormFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("123");
        requestFormField.setTextInputFormat("UPPERCASE");

        InsertFormFieldOnlineRequest insertRequestRequest = new InsertFormFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestFormField,"sections/0/paragraphs/0",null,null,null,null,null,null);
        wordsApi.insertFormFieldOnline(insertRequestRequest);
    }

    @Test
    public void testInsertHeaderFooter() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        InsertHeaderFooterRequest insertRequestRequest = new InsertHeaderFooterRequest("Sample.docx","","FooterEven",null,null,null,null,null,null,null);
        wordsApi.insertHeaderFooter(insertRequestRequest);
    }

    @Test
    public void testInsertHeaderFooterOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        InsertHeaderFooterOnlineRequest insertRequestRequest = new InsertHeaderFooterOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/HeaderFooters/HeadersFooters.doc").toAbsolutePath()),"","FooterEven",null,null,null,null,null);
        wordsApi.insertHeaderFooterOnline(insertRequestRequest);
    }

    @Test
    public void testInsertList() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ListInsert requestListInsert = new ListInsert();
        requestListInsert.setTemplate(ListInsert.TemplateEnum.OUTLINELEGAL);

        InsertListRequest insertRequestRequest = new InsertListRequest("TestGetLists.doc",requestListInsert,null,null,null,null,null,null,null);
        wordsApi.insertList(insertRequestRequest);
    }

    @Test
    public void testInsertListOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ListInsert requestListInsert = new ListInsert();
        requestListInsert.setTemplate(ListInsert.TemplateEnum.OUTLINELEGAL);

        InsertListOnlineRequest insertRequestRequest = new InsertListOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Lists/ListsGet.doc").toAbsolutePath()),requestListInsert,null,null,null,null,null);
        wordsApi.insertListOnline(insertRequestRequest);
    }

    @Test
    public void testInsertOrUpdateParagraphTabStop() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TabStopInsert requestTabStopInsertDto = new TabStopInsert();
        requestTabStopInsertDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
        requestTabStopInsertDto.setLeader(TabStopInsert.LeaderEnum.NONE);
        requestTabStopInsertDto.setPosition((double)100.0);

        InsertOrUpdateParagraphTabStopRequest insertRequestRequest = new InsertOrUpdateParagraphTabStopRequest("Sample.docx",0,requestTabStopInsertDto,null,null,null,null,null,null);
        wordsApi.insertOrUpdateParagraphTabStop(insertRequestRequest);
    }

    @Test
    public void testInsertOrUpdateParagraphTabStopOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        TabStopInsert requestTabStopInsertDto = new TabStopInsert();
        requestTabStopInsertDto.setAlignment(TabStopInsert.AlignmentEnum.LEFT);
        requestTabStopInsertDto.setLeader(TabStopInsert.LeaderEnum.NONE);
        requestTabStopInsertDto.setPosition((double)72);

        InsertOrUpdateParagraphTabStopOnlineRequest insertRequestRequest = new InsertOrUpdateParagraphTabStopOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestTabStopInsertDto,0,null,null,null,null);
        wordsApi.insertOrUpdateParagraphTabStopOnline(insertRequestRequest);
    }

    @Test
    public void testInsertPageNumbers() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        PageNumber requestPageNumber = new PageNumber();
        requestPageNumber.setAlignment("center");
        requestPageNumber.setFormat("{PAGE} of {NUMPAGES}");

        InsertPageNumbersRequest insertRequestRequest = new InsertPageNumbersRequest(remoteFileName,requestPageNumber,null,null,null,null,remoteFileName,null,null);
        wordsApi.insertPageNumbers(insertRequestRequest);
    }

    @Test
    public void testInsertPageNumbersOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        PageNumber requestPageNumber = new PageNumber();
        requestPageNumber.setAlignment("center");
        requestPageNumber.setFormat("{PAGE} of {NUMPAGES}");

        InsertPageNumbersOnlineRequest insertRequestRequest = new InsertPageNumbersOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Common/Sample.docx").toAbsolutePath()),requestPageNumber,null,null,null,null,null);
        wordsApi.insertPageNumbersOnline(insertRequestRequest);
    }

    @Test
    public void testInsertParagraph() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ParagraphInsert requestParagraph = new ParagraphInsert();
        requestParagraph.setText("This is a new paragraph for your document");

        InsertParagraphRequest insertRequestRequest = new InsertParagraphRequest("Sample.docx",requestParagraph,null,null,null,null,null,null,null,null,null);
        wordsApi.insertParagraph(insertRequestRequest);
    }

    @Test
    public void testInsertParagraphOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ParagraphInsert requestParagraph = new ParagraphInsert();
        requestParagraph.setText("This is a new paragraph for your document");

        InsertParagraphOnlineRequest insertRequestRequest = new InsertParagraphOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestParagraph,"sections/0",null,null,null,null,null,null);
        wordsApi.insertParagraphOnline(insertRequestRequest);
    }

    @Test
    public void testInsertRun() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RunInsert requestRun = new RunInsert();
        requestRun.setText("run with text");

        InsertRunRequest insertRequestRequest = new InsertRunRequest("Sample.docx","paragraphs/1",requestRun,null,null,null,null,null,null,null,null);
        wordsApi.insertRun(insertRequestRequest);
    }

    @Test
    public void testInsertRunOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        RunInsert requestRun = new RunInsert();
        requestRun.setText("run with text");

        InsertRunOnlineRequest insertRequestRequest = new InsertRunOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Runs/Run.doc").toAbsolutePath()),"paragraphs/1",requestRun,null,null,null,null,null,null);
        wordsApi.insertRunOnline(insertRequestRequest);
    }

    @Test
    public void testInsertStyle() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleInsert requestStyleInsert = new StyleInsert();
        requestStyleInsert.setStyleName("My Style");
        requestStyleInsert.setStyleType(StyleInsert.StyleTypeEnum.PARAGRAPH);

        InsertStyleRequest insertRequestRequest = new InsertStyleRequest("Sample.docx",requestStyleInsert,null,null,null,null,null,null,null);
        wordsApi.insertStyle(insertRequestRequest);
    }

    @Test
    public void testInsertStyleOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleInsert requestStyleInsert = new StyleInsert();
        requestStyleInsert.setStyleName("My Style");
        requestStyleInsert.setStyleType(StyleInsert.StyleTypeEnum.PARAGRAPH);

        InsertStyleOnlineRequest insertRequestRequest = new InsertStyleOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestStyleInsert,null,null,null,null,null);
        wordsApi.insertStyleOnline(insertRequestRequest);
    }

    @Test
    public void testInsertTable() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TableInsert requestTable = new TableInsert();
        requestTable.setColumnsCount(5);
        requestTable.setRowsCount(4);

        InsertTableRequest insertRequestRequest = new InsertTableRequest("Sample.docx",requestTable,null,null,null,null,null,null,null,null);
        wordsApi.insertTable(insertRequestRequest);
    }

    @Test
    public void testInsertTableCell() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TableCellInsert requestCell = new TableCellInsert();

        InsertTableCellRequest insertRequestRequest = new InsertTableCellRequest("Sample.docx","sections/0/tables/2/rows/0",requestCell,null,null,null,null,null,null,null);
        wordsApi.insertTableCell(insertRequestRequest);
    }

    @Test
    public void testInsertTableCellOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        TableCellInsert requestCell = new TableCellInsert();

        InsertTableCellOnlineRequest insertRequestRequest = new InsertTableCellOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2/rows/0",requestCell,null,null,null,null,null);
        wordsApi.insertTableCellOnline(insertRequestRequest);
    }

    @Test
    public void testInsertTableOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        TableInsert requestTable = new TableInsert();
        requestTable.setColumnsCount(5);
        requestTable.setRowsCount(4);

        InsertTableOnlineRequest insertRequestRequest = new InsertTableOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestTable,null,null,null,null,null,null);
        wordsApi.insertTableOnline(insertRequestRequest);
    }

    @Test
    public void testInsertTableRow() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TableRowInsert requestRow = new TableRowInsert();
        requestRow.setColumnsCount(5);

        InsertTableRowRequest insertRequestRequest = new InsertTableRowRequest("Sample.docx","sections/0/tables/2",requestRow,null,null,null,null,null,null,null);
        wordsApi.insertTableRow(insertRequestRequest);
    }

    @Test
    public void testInsertTableRowOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        TableRowInsert requestRow = new TableRowInsert();
        requestRow.setColumnsCount(5);

        InsertTableRowOnlineRequest insertRequestRequest = new InsertTableRowOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2",requestRow,null,null,null,null,null);
        wordsApi.insertTableRowOnline(insertRequestRequest);
    }

    @Test
    public void testInsertWatermarkImage() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        InsertWatermarkImageRequest insertRequestRequest = new InsertWatermarkImageRequest(remoteFileName,null,null,null,null,null,remoteFileName,null,null,null,"Sample.png");
        wordsApi.insertWatermarkImage(insertRequestRequest);
    }

    @Test
    public void testInsertWatermarkImageOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        InsertWatermarkImageOnlineRequest insertRequestRequest = new InsertWatermarkImageOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath()),null,null,null,null,null,null,null);
        wordsApi.insertWatermarkImageOnline(insertRequestRequest);
    }

    @Test
    public void testInsertWatermarkText() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        WatermarkText requestWatermarkText = new WatermarkText();
        requestWatermarkText.setText("This is the text");
        requestWatermarkText.setRotationAngle((double)90.0);

        InsertWatermarkTextRequest insertRequestRequest = new InsertWatermarkTextRequest(remoteFileName,requestWatermarkText,null,null,null,null,remoteFileName,null,null);
        wordsApi.insertWatermarkText(insertRequestRequest);
    }

    @Test
    public void testInsertWatermarkTextOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        WatermarkText requestWatermarkText = new WatermarkText();
        requestWatermarkText.setText("This is the text");
        requestWatermarkText.setRotationAngle((double)90);

        InsertWatermarkTextOnlineRequest insertRequestRequest = new InsertWatermarkTextOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestWatermarkText,null,null,null,null,null);
        wordsApi.insertWatermarkTextOnline(insertRequestRequest);
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

        LoadWebDocumentRequest loadRequestRequest = new LoadWebDocumentRequest(requestData,null);
        wordsApi.loadWebDocument(loadRequestRequest);
    }

    @Test
    public void testMoveFile() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        MoveFileRequest moveRequestRequest = new MoveFileRequest("/TestMoveFileDest_Sample.docx","Sample.docx",null,null,null);
        wordsApi.moveFile(moveRequestRequest);
    }

    @Test
    public void testMoveFolder() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        MoveFolderRequest moveRequestRequest = new MoveFolderRequest("/TestMoveFolderDest_Sample","/TestMoveFolderSrc",null,null);
        wordsApi.moveFolder(moveRequestRequest);
    }

    @Test
    public void testOptimizeDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        OptimizationOptions requestOptions = new OptimizationOptions();
        requestOptions.setMsWordVersion(OptimizationOptions.MsWordVersionEnum.WORD2002);

        OptimizeDocumentRequest optimizeRequestRequest = new OptimizeDocumentRequest("Sample.docx",requestOptions,null,null,null,null,null,null,null);
        wordsApi.optimizeDocument(optimizeRequestRequest);
    }

    @Test
    public void testOptimizeDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        OptimizationOptions requestOptions = new OptimizationOptions();
        requestOptions.setMsWordVersion(OptimizationOptions.MsWordVersionEnum.WORD2002);

        OptimizeDocumentOnlineRequest optimizeRequestRequest = new OptimizeDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestOptions,null,null,null,null,null);
        wordsApi.optimizeDocumentOnline(optimizeRequestRequest);
    }

    @Test
    public void testProtectDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        ProtectionRequest requestProtectionRequest = new ProtectionRequest();
        requestProtectionRequest.setPassword("123");
        requestProtectionRequest.setProtectionType("ReadOnly");

        ProtectDocumentRequest protectRequestRequest = new ProtectDocumentRequest(remoteFileName,requestProtectionRequest,null,null,null,null,remoteFileName);
        wordsApi.protectDocument(protectRequestRequest);
    }

    @Test
    public void testProtectDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ProtectionRequest requestProtectionRequest = new ProtectionRequest();
        requestProtectionRequest.setNewPassword("123");

        ProtectDocumentOnlineRequest protectRequestRequest = new ProtectDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestProtectionRequest,null,null,null);
        wordsApi.protectDocumentOnline(protectRequestRequest);
    }

    @Test
    public void testRejectAllRevisions() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        RejectAllRevisionsRequest rejectRequestRequest = new RejectAllRevisionsRequest(remoteFileName,null,null,null,null,remoteFileName);
        wordsApi.rejectAllRevisions(rejectRequestRequest);
    }

    @Test
    public void testRejectAllRevisionsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        RejectAllRevisionsOnlineRequest rejectRequestRequest = new RejectAllRevisionsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null);
        wordsApi.rejectAllRevisionsOnline(rejectRequestRequest);
    }

    @Test
    public void testRemoveRange() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RemoveRangeRequest removeRequestRequest = new RemoveRangeRequest("Sample.docx","id0.0.0","id0.0.1",null,null,null,null,null);
        wordsApi.removeRange(removeRequestRequest);
    }

    @Test
    public void testRemoveRangeOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        RemoveRangeOnlineRequest removeRequestRequest = new RemoveRangeOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Range/RangeGet.doc").toAbsolutePath()),"id0.0.0","id0.0.1",null,null,null);
        wordsApi.removeRangeOnline(removeRequestRequest);
    }

    @Test
    public void testRenderDrawingObject() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderDrawingObjectRequest renderRequestRequest = new RenderDrawingObjectRequest("Sample.docx","png",0,null,null,null,null,null,null,null);
        wordsApi.renderDrawingObject(renderRequestRequest);
    }

    @Test
    public void testRenderDrawingObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderDrawingObjectOnlineRequest renderRequestRequest = new RenderDrawingObjectOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"png",0,"sections/0",null,null,null,null);
        wordsApi.renderDrawingObjectOnline(renderRequestRequest);
    }

    @Test
    public void testRenderMathObject() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderMathObjectRequest renderRequestRequest = new RenderMathObjectRequest("Sample.docx","png",0,null,null,null,null,null,null,null);
        wordsApi.renderMathObject(renderRequestRequest);
    }

    @Test
    public void testRenderMathObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderMathObjectOnlineRequest renderRequestRequest = new RenderMathObjectOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"png",0,null,null,null,null,null);
        wordsApi.renderMathObjectOnline(renderRequestRequest);
    }

    @Test
    public void testRenderPage() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderPageRequest renderRequestRequest = new RenderPageRequest("Sample.docx",1,"bmp",null,null,null,null,null);
        wordsApi.renderPage(renderRequestRequest);
    }

    @Test
    public void testRenderPageOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderPageOnlineRequest renderRequestRequest = new RenderPageOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Text/SampleWordDocument.docx").toAbsolutePath()),1,"bmp",null,null,null);
        wordsApi.renderPageOnline(renderRequestRequest);
    }

    @Test
    public void testRenderParagraph() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderParagraphRequest renderRequestRequest = new RenderParagraphRequest("Sample.docx","png",0,null,null,null,null,null,null,null);
        wordsApi.renderParagraph(renderRequestRequest);
    }

    @Test
    public void testRenderParagraphOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderParagraphOnlineRequest renderRequestRequest = new RenderParagraphOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"png",0,null,null,null,null,null);
        wordsApi.renderParagraphOnline(renderRequestRequest);
    }

    @Test
    public void testRenderTable() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderTableRequest renderRequestRequest = new RenderTableRequest("Sample.docx","png",0,null,null,null,null,null,null,null);
        wordsApi.renderTable(renderRequestRequest);
    }

    @Test
    public void testRenderTableOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        RenderTableOnlineRequest renderRequestRequest = new RenderTableOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"png",0,null,null,null,null,null);
        wordsApi.renderTableOnline(renderRequestRequest);
    }

    @Test
    public void testReplaceText() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        ReplaceTextParameters requestReplaceText = new ReplaceTextParameters();
        requestReplaceText.setOldValue("Testing");
        requestReplaceText.setNewValue("Aspose testing");

        ReplaceTextRequest replaceRequestRequest = new ReplaceTextRequest(remoteFileName,requestReplaceText,null,null,null,null,remoteFileName,null,null);
        wordsApi.replaceText(replaceRequestRequest);
    }

    @Test
    public void testReplaceTextOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ReplaceTextParameters requestReplaceText = new ReplaceTextParameters();
        requestReplaceText.setOldValue("aspose");
        requestReplaceText.setNewValue("aspose new");

        ReplaceTextOnlineRequest replaceRequestRequest = new ReplaceTextOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestReplaceText,null,null,null,null,null);
        wordsApi.replaceTextOnline(replaceRequestRequest);
    }

    @Test
    public void testReplaceWithText() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ReplaceRange requestRangeText = new ReplaceRange();
        requestRangeText.setText("Replaced header");

        ReplaceWithTextRequest replaceRequestRequest = new ReplaceWithTextRequest("Sample.docx","id0.0.0",requestRangeText,"id0.0.1",null,null,null,null,null);
        wordsApi.replaceWithText(replaceRequestRequest);
    }

    @Test
    public void testReplaceWithTextOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ReplaceRange requestRangeText = new ReplaceRange();
        requestRangeText.setText("Replaced header");

        ReplaceWithTextOnlineRequest replaceRequestRequest = new ReplaceWithTextOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Range/RangeGet.doc").toAbsolutePath()),"id0.0.0",requestRangeText,"id0.0.1",null,null,null);
        wordsApi.replaceWithTextOnline(replaceRequestRequest);
    }

    @Test
    public void testResetCache() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ResetCacheRequest resetRequestRequest = new ResetCacheRequest();
        wordsApi.resetCache(resetRequestRequest);
    }

    @Test
    public void testSaveAs() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        SaveOptionsData requestSaveOptionsData = new SaveOptionsData();
        requestSaveOptionsData.setSaveFormat("docx");
        requestSaveOptionsData.setFileName("/TestSaveAsFromPdfToDoc.docx");

        SaveAsRequest saveRequestRequest = new SaveAsRequest("Sample.docx",requestSaveOptionsData,null,null,null,null,null);
        wordsApi.saveAs(saveRequestRequest);
    }

    @Test
    public void testSaveAsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        SaveOptionsData requestSaveOptionsData = new SaveOptionsData();
        requestSaveOptionsData.setSaveFormat("pdf");
        requestSaveOptionsData.setFileName("/TestSaveAs.pdf");

        SaveAsOnlineRequest saveRequestRequest = new SaveAsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Common/test_multi_pages.docx").toAbsolutePath()),requestSaveOptionsData,null,null,null);
        wordsApi.saveAsOnline(saveRequestRequest);
    }

    @Test
    public void testSaveAsRange() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RangeDocument requestDocumentParameters = new RangeDocument();
        requestDocumentParameters.setDocumentName("/NewDoc.docx");

        SaveAsRangeRequest saveRequestRequest = new SaveAsRangeRequest("Sample.docx","id0.0.0",requestDocumentParameters,"id0.0.1",null,null,null,null);
        wordsApi.saveAsRange(saveRequestRequest);
    }

    @Test
    public void testSaveAsRangeOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        RangeDocument requestDocumentParameters = new RangeDocument();
        requestDocumentParameters.setDocumentName("/NewDoc.docx");

        SaveAsRangeOnlineRequest saveRequestRequest = new SaveAsRangeOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Range/RangeGet.doc").toAbsolutePath()),"id0.0.0",requestDocumentParameters,"id0.0.1",null,null);
        wordsApi.saveAsRangeOnline(saveRequestRequest);
    }

    @Test
    public void testSaveAsTiff() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        TiffSaveOptionsData requestSaveOptions = new TiffSaveOptionsData();
        requestSaveOptions.setSaveFormat("tiff");
        requestSaveOptions.setFileName("/abc.tiff");

        SaveAsTiffRequest saveRequestRequest = new SaveAsTiffRequest("Sample.docx",requestSaveOptions,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
        wordsApi.saveAsTiff(saveRequestRequest);
    }

    @Test
    public void testSaveAsTiffOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        TiffSaveOptionsData requestSaveOptions = new TiffSaveOptionsData();
        requestSaveOptions.setSaveFormat("tiff");
        requestSaveOptions.setFileName("/abc.tiff");

        SaveAsTiffOnlineRequest saveRequestRequest = new SaveAsTiffOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Common/test_multi_pages.docx").toAbsolutePath()),requestSaveOptions,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
        wordsApi.saveAsTiffOnline(saveRequestRequest);
    }

    @Test
    public void testSearch() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        SearchRequest searchRequestRequest = new SearchRequest("Sample.docx","aspose",null,null,null,null);
        wordsApi.search(searchRequestRequest);
    }

    @Test
    public void testSearchOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        SearchOnlineRequest searchRequestRequest = new SearchOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"aspose",null,null);
        wordsApi.searchOnline(searchRequestRequest);
    }

    @Test
    public void testSplitDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        SplitDocumentRequest splitRequestRequest = new SplitDocumentRequest("Sample.docx","text",null,null,null,null,"/TestSplitDocument.text",1,2,null,null);
        wordsApi.splitDocument(splitRequestRequest);
    }

    @Test
    public void testSplitDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        SplitDocumentOnlineRequest splitRequestRequest = new SplitDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"text",null,null,"/TestSplitDocument.text",1,2,null,null);
        wordsApi.splitDocumentOnline(splitRequestRequest);
    }

    @Test
    public void testUnprotectDocument() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ProtectionRequest requestProtectionRequest = new ProtectionRequest();
        requestProtectionRequest.setPassword("aspose");

        UnprotectDocumentRequest unprotectRequestRequest = new UnprotectDocumentRequest("Sample.docx",requestProtectionRequest,null,null,null,null,null);
        wordsApi.unprotectDocument(unprotectRequestRequest);
    }

    @Test
    public void testUnprotectDocumentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ProtectionRequest requestProtectionRequest = new ProtectionRequest();
        requestProtectionRequest.setPassword("aspose");

        UnprotectDocumentOnlineRequest unprotectRequestRequest = new UnprotectDocumentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestProtectionRequest,null,null,null);
        wordsApi.unprotectDocumentOnline(unprotectRequestRequest);
    }

    @Test
    public void testUpdateBookmark() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String bookmarkName = "aspose";
        String remoteFileName = "Sample.docx";

        BookmarkData requestBookmarkData = new BookmarkData();
        requestBookmarkData.setName(bookmarkName);
        requestBookmarkData.setText("This will be the text for Aspose");

        UpdateBookmarkRequest updateRequestRequest = new UpdateBookmarkRequest(remoteFileName,bookmarkName,requestBookmarkData,null,null,null,null,remoteFileName,null,null);
        wordsApi.updateBookmark(updateRequestRequest);
    }

    @Test
    public void testUpdateBookmarkOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        String bookmarkName = "aspose";

        BookmarkData requestBookmarkData = new BookmarkData();
        requestBookmarkData.setName(bookmarkName);
        requestBookmarkData.setText("This will be the text for Aspose");

        UpdateBookmarkOnlineRequest updateRequestRequest = new UpdateBookmarkOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),bookmarkName,requestBookmarkData,null,null,"Sample.docx",null,null);
        wordsApi.updateBookmarkOnline(updateRequestRequest);
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

        UpdateBorderRequest updateRequestRequest = new UpdateBorderRequest("Sample.docx","left",requestBorderProperties,"tables/1/rows/0/cells/0",null,null,null,null,null,null,null);
        wordsApi.updateBorder(updateRequestRequest);
    }

    @Test
    public void testUpdateBorderOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        XmlColor requestBorderPropertiesColor = new XmlColor();
        requestBorderPropertiesColor.setWeb("#AABBCC");

        Border requestBorderProperties = new Border();
        requestBorderProperties.setBorderType(Border.BorderTypeEnum.LEFT);
        requestBorderProperties.setColor(requestBorderPropertiesColor);
        requestBorderProperties.setDistanceFromText((double)6);
        requestBorderProperties.setLineStyle(Border.LineStyleEnum.DASHDOTSTROKER);
        requestBorderProperties.setLineWidth((double)2);
        requestBorderProperties.setShadow(true);

        UpdateBorderOnlineRequest updateRequestRequest = new UpdateBorderOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestBorderProperties,"left","tables/1/rows/0/cells/0",null,null,null,null,null);
        wordsApi.updateBorderOnline(updateRequestRequest);
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

        UpdateCommentRequest updateRequestRequest = new UpdateCommentRequest("Sample.docx",0,requestComment,null,null,null,null,null,null,null);
        wordsApi.updateComment(updateRequestRequest);
    }

    @Test
    public void testUpdateCommentOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
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

        UpdateCommentOnlineRequest updateRequestRequest = new UpdateCommentOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,requestComment,null,null,null,null,null);
        wordsApi.updateCommentOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateCustomXmlPart() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        CustomXmlPartUpdate requestCustomXmlPart = new CustomXmlPartUpdate();
        requestCustomXmlPart.setData("<data>Hello world</data>");

        UpdateCustomXmlPartRequest updateRequestRequest = new UpdateCustomXmlPartRequest("Sample.docx",0,requestCustomXmlPart,null,null,null,null,null,null,null);
        wordsApi.updateCustomXmlPart(updateRequestRequest);
    }

    @Test
    public void testUpdateCustomXmlPartOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        CustomXmlPartUpdate requestCustomXmlPart = new CustomXmlPartUpdate();
        requestCustomXmlPart.setData("<data>Hello world</data>");

        UpdateCustomXmlPartOnlineRequest updateRequestRequest = new UpdateCustomXmlPartOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,requestCustomXmlPart,null,null,null,null,null);
        wordsApi.updateCustomXmlPartOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateDrawingObject() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
        requestDrawingObject.setLeft((double)0);

        UpdateDrawingObjectRequest updateRequestRequest = new UpdateDrawingObjectRequest("Sample.docx",requestDrawingObject,Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath()),0,null,null,null,null,null,null,null,null);
        wordsApi.updateDrawingObject(updateRequestRequest);
    }

    @Test
    public void testUpdateDrawingObjectOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        DrawingObjectUpdate requestDrawingObject = new DrawingObjectUpdate();
        requestDrawingObject.setLeft((double)0);

        UpdateDrawingObjectOnlineRequest updateRequestRequest = new UpdateDrawingObjectOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestDrawingObject,Files.readAllBytes(Paths.get(documentsDir, "Common/aspose-cloud.png").toAbsolutePath()),0,null,null,null,null,null,null);
        wordsApi.updateDrawingObjectOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        FieldUpdate requestField = new FieldUpdate();
        requestField.setFieldCode("{ NUMPAGES }");

        UpdateFieldRequest updateRequestRequest = new UpdateFieldRequest("Sample.docx",0,requestField,"sections/0/paragraphs/0",null,null,null,null,null,null,null);
        wordsApi.updateField(updateRequestRequest);
    }

    @Test
    public void testUpdateFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        FieldUpdate requestField = new FieldUpdate();
        requestField.setFieldCode("{ NUMPAGES }");

        UpdateFieldOnlineRequest updateRequestRequest = new UpdateFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestField,0,"sections/0/paragraphs/0",null,null,null,null,null);
        wordsApi.updateFieldOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateFields() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        UpdateFieldsRequest updateRequestRequest = new UpdateFieldsRequest("Sample.docx",null,null,null,null,null);
        wordsApi.updateFields(updateRequestRequest);
    }

    @Test
    public void testUpdateFieldsOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        UpdateFieldsOnlineRequest updateRequestRequest = new UpdateFieldsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null);
        wordsApi.updateFieldsOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateFootnote() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        FootnoteUpdate requestFootnoteDto = new FootnoteUpdate();
        requestFootnoteDto.setText("new text is here");

        UpdateFootnoteRequest updateRequestRequest = new UpdateFootnoteRequest("Sample.docx",0,requestFootnoteDto,null,null,null,null,null,null,null,null);
        wordsApi.updateFootnote(updateRequestRequest);
    }

    @Test
    public void testUpdateFootnoteOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        FootnoteUpdate requestFootnoteDto = new FootnoteUpdate();
        requestFootnoteDto.setText("new text is here");

        UpdateFootnoteOnlineRequest updateRequestRequest = new UpdateFootnoteOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),requestFootnoteDto,0,null,null,null,null,null,null);
        wordsApi.updateFootnoteOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateFormField() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("No name");

        UpdateFormFieldRequest updateRequestRequest = new UpdateFormFieldRequest(remoteFileName,0,requestFormField,null,null,null,null,null,remoteFileName,null,null);
        wordsApi.updateFormField(updateRequestRequest);
    }

    @Test
    public void testUpdateFormFieldOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        FormFieldTextInput requestFormField = new FormFieldTextInput();
        requestFormField.setName("FullName");
        requestFormField.setEnabled(true);
        requestFormField.setCalculateOnExit(true);
        requestFormField.setStatusText("");
        requestFormField.setTextInputType(FormFieldTextInput.TextInputTypeEnum.REGULAR);
        requestFormField.setTextInputDefault("No name");

        UpdateFormFieldOnlineRequest updateRequestRequest = new UpdateFormFieldOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestFormField,0,"sections/0",null,null,null,null,null);
        wordsApi.updateFormFieldOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateList() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ListUpdate requestListUpdate = new ListUpdate();
        requestListUpdate.setIsRestartAtEachSection(true);

        UpdateListRequest updateRequestRequest = new UpdateListRequest("TestGetLists.doc",1,requestListUpdate,null,null,null,null,null,null,null);
        wordsApi.updateList(updateRequestRequest);
    }

    @Test
    public void testUpdateListLevel() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ListLevelUpdate requestListUpdate = new ListLevelUpdate();
        requestListUpdate.setAlignment(ListLevelUpdate.AlignmentEnum.RIGHT);

        UpdateListLevelRequest updateRequestRequest = new UpdateListLevelRequest("TestGetLists.doc",1,1,requestListUpdate,null,null,null,null,null,null,null);
        wordsApi.updateListLevel(updateRequestRequest);
    }

    @Test
    public void testUpdateListLevelOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ListLevelUpdate requestListUpdate = new ListLevelUpdate();
        requestListUpdate.setAlignment(ListLevelUpdate.AlignmentEnum.RIGHT);

        UpdateListLevelOnlineRequest updateRequestRequest = new UpdateListLevelOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Lists/ListsGet.doc").toAbsolutePath()),1,requestListUpdate,1,null,null,null,null,null);
        wordsApi.updateListLevelOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateListOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ListUpdate requestListUpdate = new ListUpdate();
        requestListUpdate.setIsRestartAtEachSection(true);

        UpdateListOnlineRequest updateRequestRequest = new UpdateListOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Lists/ListsGet.doc").toAbsolutePath()),1,requestListUpdate,null,null,null,null,null);
        wordsApi.updateListOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateParagraphFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ParagraphFormatUpdate requestParagraphFormatDto = new ParagraphFormatUpdate();
        requestParagraphFormatDto.setAlignment(ParagraphFormatUpdate.AlignmentEnum.RIGHT);

        UpdateParagraphFormatRequest updateRequestRequest = new UpdateParagraphFormatRequest("Sample.docx",0,requestParagraphFormatDto,null,null,null,null,null,null,null,null);
        wordsApi.updateParagraphFormat(updateRequestRequest);
    }

    @Test
    public void testUpdateParagraphFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ParagraphFormatUpdate requestParagraphFormatDto = new ParagraphFormatUpdate();
        requestParagraphFormatDto.setAlignment(ParagraphFormatUpdate.AlignmentEnum.RIGHT);

        UpdateParagraphFormatOnlineRequest updateRequestRequest = new UpdateParagraphFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestParagraphFormatDto,0,null,null,null,null,null,null);
        wordsApi.updateParagraphFormatOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateParagraphListFormat() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        ListFormatUpdate requestListFormatDto = new ListFormatUpdate();
        requestListFormatDto.setListId(2);

        UpdateParagraphListFormatRequest updateRequestRequest = new UpdateParagraphListFormatRequest("Sample.docx",0,requestListFormatDto,null,null,null,null,null,null,null,null);
        wordsApi.updateParagraphListFormat(updateRequestRequest);
    }

    @Test
    public void testUpdateParagraphListFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        ListFormatUpdate requestListFormatDto = new ListFormatUpdate();
        requestListFormatDto.setListId(2);

        UpdateParagraphListFormatOnlineRequest updateRequestRequest = new UpdateParagraphListFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),requestListFormatDto,0,null,null,null,null,null,null);
        wordsApi.updateParagraphListFormatOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateRun() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        RunUpdate requestRun = new RunUpdate();
        requestRun.setText("run with text");

        UpdateRunRequest updateRequestRequest = new UpdateRunRequest("Sample.docx","paragraphs/1",0,requestRun,null,null,null,null,null,null,null);
        wordsApi.updateRun(updateRequestRequest);
    }

    @Test
    public void testUpdateRunFont() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        String remoteFileName = "Sample.docx";

        Font requestFontDto = new Font();
        requestFontDto.setBold(true);

        UpdateRunFontRequest updateRequestRequest = new UpdateRunFontRequest(remoteFileName,"paragraphs/0",0,requestFontDto,null,null,null,null,remoteFileName,null,null);
        wordsApi.updateRunFont(updateRequestRequest);
    }

    @Test
    public void testUpdateRunFontOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        Font requestFontDto = new Font();
        requestFontDto.setBold(true);

        UpdateRunFontOnlineRequest updateRequestRequest = new UpdateRunFontOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"paragraphs/0",requestFontDto,0,null,null,null,null,null);
        wordsApi.updateRunFontOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateRunOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        RunUpdate requestRun = new RunUpdate();
        requestRun.setText("run with text");

        UpdateRunOnlineRequest updateRequestRequest = new UpdateRunOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Runs/Run.doc").toAbsolutePath()),"paragraphs/1",requestRun,0,null,null,null,null,null);
        wordsApi.updateRunOnline(updateRequestRequest);
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

        UpdateSectionPageSetupRequest updateRequestRequest = new UpdateSectionPageSetupRequest("Sample.docx",0,requestPageSetup,null,null,null,null,null,null,null);
        wordsApi.updateSectionPageSetup(updateRequestRequest);
    }

    @Test
    public void testUpdateSectionPageSetupOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        PageSetup requestPageSetup = new PageSetup();
        requestPageSetup.setRtlGutter(true);
        requestPageSetup.setLeftMargin((double)10);
        requestPageSetup.setOrientation(PageSetup.OrientationEnum.LANDSCAPE);
        requestPageSetup.setPaperSize(PageSetup.PaperSizeEnum.A5);

        UpdateSectionPageSetupOnlineRequest updateRequestRequest = new UpdateSectionPageSetupOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,requestPageSetup,null,null,null,null,null);
        wordsApi.updateSectionPageSetupOnline(updateRequestRequest);
    }

    @Test
    public void testUpdateStyle() throws Exception
    {
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleUpdate requestStyleUpdate = new StyleUpdate();
        requestStyleUpdate.setName("My Style");

        UpdateStyleRequest updateRequestRequest = new UpdateStyleRequest("Sample.docx","Heading 1",requestStyleUpdate,null,null,null,null,null,null,null);
        wordsApi.updateStyle(updateRequestRequest);
    }

    @Test
    public void testUpdateStyleOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        StyleUpdate requestStyleUpdate = new StyleUpdate();
        requestStyleUpdate.setName("My Style");

        UpdateStyleOnlineRequest updateRequestRequest = new UpdateStyleOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"Heading 1",requestStyleUpdate,null,null,null,null,null);
        wordsApi.updateStyleOnline(updateRequestRequest);
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

        UpdateTableCellFormatRequest updateRequestRequest = new UpdateTableCellFormatRequest("Sample.docx","sections/0/tables/2/rows/0",0,requestFormat,null,null,null,null,null,null,null);
        wordsApi.updateTableCellFormat(updateRequestRequest);
    }

    @Test
    public void testUpdateTableCellFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        TableCellFormat requestFormat = new TableCellFormat();
        requestFormat.setBottomPadding((double)5);
        requestFormat.setFitText(true);
        requestFormat.setHorizontalMerge(TableCellFormat.HorizontalMergeEnum.FIRST);
        requestFormat.setWrapText(true);

        UpdateTableCellFormatOnlineRequest updateRequestRequest = new UpdateTableCellFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2/rows/0",requestFormat,0,null,null,null,null,null);
        wordsApi.updateTableCellFormatOnline(updateRequestRequest);
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

        UpdateTablePropertiesRequest updateRequestRequest = new UpdateTablePropertiesRequest("Sample.docx",1,requestProperties,null,null,null,null,null,null,null,null);
        wordsApi.updateTableProperties(updateRequestRequest);
    }

    @Test
    public void testUpdateTablePropertiesOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        TableProperties requestProperties = new TableProperties();
        requestProperties.setAlignment(TableProperties.AlignmentEnum.RIGHT);
        requestProperties.setAllowAutoFit(false);
        requestProperties.setBidi(true);
        requestProperties.setBottomPadding((double)1);
        requestProperties.setCellSpacing((double)2);
        requestProperties.setStyleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS);

        UpdateTablePropertiesOnlineRequest updateRequestRequest = new UpdateTablePropertiesOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),requestProperties,1,null,null,null,null,null,null);
        wordsApi.updateTablePropertiesOnline(updateRequestRequest);
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

        UpdateTableRowFormatRequest updateRequestRequest = new UpdateTableRowFormatRequest("Sample.docx","sections/0/tables/2",0,requestFormat,null,null,null,null,null,null,null);
        wordsApi.updateTableRowFormat(updateRequestRequest);
    }

    @Test
    public void testUpdateTableRowFormatOnline() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        TableRowFormat requestFormat = new TableRowFormat();
        requestFormat.setAllowBreakAcrossPages(true);
        requestFormat.setHeadingFormat(true);
        requestFormat.setHeight((double)10);
        requestFormat.setHeightRule(TableRowFormat.HeightRuleEnum.AUTO);

        UpdateTableRowFormatOnlineRequest updateRequestRequest = new UpdateTableRowFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2",requestFormat,0,null,null,null,null,null);
        wordsApi.updateTableRowFormatOnline(updateRequestRequest);
    }

    @Test
    public void testUploadFile() throws Exception
    {
        String documentsDir = "ExamplesData";
        WordsApi wordsApi = new WordsApi(apiClient);
        UploadFileRequest uploadRequestRequest = new UploadFileRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"Sample.docx",null);
        wordsApi.uploadFile(uploadRequestRequest);
    }
}