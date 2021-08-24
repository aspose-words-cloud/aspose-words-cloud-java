/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestTable.java">
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

package com.aspose.words.cloud.api.table;

import com.aspose.words.cloud.*;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import com.aspose.words.cloud.model.responses.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.threeten.bp.*;
import java.io.File;
import java.io.IOException;
import javax.mail.MessagingException;
import java.nio.file.*;
import java.util.ArrayList;

/*
 * Example of how to work wtih table.
 */
public class TestTable  extends TestCase
{
    private String remoteDataFolder = TestInitializer.RemoteTestFolder + "/DocumentElements/Tables";
    private String localFile = "DocumentElements/Tables/TablesGet.docx";


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for getting tables.
     */
    @Test
    public void testGetTables() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetTables.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetTablesRequest request = new GetTablesRequest(
            remoteFileName,
            "",
            remoteDataFolder,
            null,
            null,
            null
        );

        TableLinkCollectionResponse result = TestInitializer.wordsApi.getTables(request);
        assertNotNull(result);
        assertNotNull(result.getTables());
        assertNotNull(result.getTables().getTableLinkList());
        assertEquals(5, result.getTables().getTableLinkList().size());
        assertEquals("0.0.1", result.getTables().getTableLinkList().get(0).getNodeId());
    }

    /*
     * Test for getting tables online.
     */
    @Test
    public void testGetTablesOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetTablesOnlineRequest request = new GetTablesOnlineRequest(
            requestDocument,
            "",
            null,
            null
        );

        TableLinkCollectionResponse result = TestInitializer.wordsApi.getTablesOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting tables without node path.
     */
    @Test
    public void testGetTablesWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetTablesWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetTablesRequest request = new GetTablesRequest(
            remoteFileName,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        TableLinkCollectionResponse result = TestInitializer.wordsApi.getTables(request);
        assertNotNull(result);
        assertNotNull(result.getTables());
        assertNotNull(result.getTables().getTableLinkList());
        assertEquals(5, result.getTables().getTableLinkList().size());
        assertEquals("0.0.1", result.getTables().getTableLinkList().get(0).getNodeId());
    }

    /*
     * Test for getting table.
     */
    @Test
    public void testGetTable() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetTable.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetTableRequest request = new GetTableRequest(
            remoteFileName,
            1,
            "",
            remoteDataFolder,
            null,
            null,
            null
        );

        TableResponse result = TestInitializer.wordsApi.getTable(request);
        assertNotNull(result);
        assertNotNull(result.getTable());
        assertNotNull(result.getTable().getTableRowList());
        assertEquals(1, result.getTable().getTableRowList().size());
        assertNotNull(result.getTable().getTableRowList().get(0).getTableCellList());
        assertEquals(2, result.getTable().getTableRowList().get(0).getTableCellList().size());
    }

    /*
     * Test for getting table online.
     */
    @Test
    public void testGetTableOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetTableOnlineRequest request = new GetTableOnlineRequest(
            requestDocument,
            1,
            "",
            null,
            null
        );

        TableResponse result = TestInitializer.wordsApi.getTableOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table without node path.
     */
    @Test
    public void testGetTableWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetTableWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetTableRequest request = new GetTableRequest(
            remoteFileName,
            1,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        TableResponse result = TestInitializer.wordsApi.getTable(request);
        assertNotNull(result);
        assertNotNull(result.getTable());
        assertNotNull(result.getTable().getTableRowList());
        assertEquals(1, result.getTable().getTableRowList().size());
        assertNotNull(result.getTable().getTableRowList().get(0).getTableCellList());
        assertEquals(2, result.getTable().getTableRowList().get(0).getTableCellList().size());
    }

    /*
     * Test for deleting table.
     */
    @Test
    public void testDeleteTable() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteTable.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteTableRequest request = new DeleteTableRequest(
            remoteFileName,
            1,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteTable(request);
    }

    /*
     * Test for deleting table online.
     */
    @Test
    public void testDeleteTableOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteTableOnlineRequest request = new DeleteTableOnlineRequest(
            requestDocument,
            1,
            "",
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.deleteTableOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting table without node path.
     */
    @Test
    public void testDeleteTableWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteTableWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteTableRequest request = new DeleteTableRequest(
            remoteFileName,
            1,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteTable(request);
    }

    /*
     * Test for adding table.
     */
    @Test
    public void testInsertTable() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertTable.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        TableInsert requestTable = new TableInsert();
        requestTable.setColumnsCount(5);
        requestTable.setRowsCount(4);

        InsertTableRequest request = new InsertTableRequest(
            remoteFileName,
            requestTable,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TableResponse result = TestInitializer.wordsApi.insertTable(request);
        assertNotNull(result);
        assertNotNull(result.getTable());
        assertNotNull(result.getTable().getTableRowList());
        assertEquals(4, result.getTable().getTableRowList().size());
        assertNotNull(result.getTable().getTableRowList().get(0).getTableCellList());
        assertEquals(5, result.getTable().getTableRowList().get(0).getTableCellList().size());
    }

    /*
     * Test for adding table online.
     */
    @Test
    public void testInsertTableOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        TableInsert requestTable = new TableInsert();
        requestTable.setColumnsCount(5);
        requestTable.setRowsCount(4);

        InsertTableOnlineRequest request = new InsertTableOnlineRequest(
            requestDocument,
            requestTable,
            "",
            null,
            null,
            null,
            null,
            null
        );

        InsertTableOnlineResponse result = TestInitializer.wordsApi.insertTableOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for adding table without node path.
     */
    @Test
    public void testInsertTableWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertTableWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        TableInsert requestTable = new TableInsert();
        requestTable.setColumnsCount(5);
        requestTable.setRowsCount(4);

        InsertTableRequest request = new InsertTableRequest(
            remoteFileName,
            requestTable,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TableResponse result = TestInitializer.wordsApi.insertTable(request);
        assertNotNull(result);
        assertNotNull(result.getTable());
        assertNotNull(result.getTable().getTableRowList());
        assertEquals(4, result.getTable().getTableRowList().size());
        assertNotNull(result.getTable().getTableRowList().get(0).getTableCellList());
        assertEquals(5, result.getTable().getTableRowList().get(0).getTableCellList().size());
    }

    /*
     * Test for getting document properties.
     */
    @Test
    public void testGetTableProperties() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetTableProperties.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetTablePropertiesRequest request = new GetTablePropertiesRequest(
            remoteFileName,
            1,
            "",
            remoteDataFolder,
            null,
            null,
            null
        );

        TablePropertiesResponse result = TestInitializer.wordsApi.getTableProperties(request);
        assertNotNull(result);
        assertNotNull(result.getProperties());
        assertEquals("Table Grid", result.getProperties().getStyleName());
    }

    /*
     * Test for getting document properties online.
     */
    @Test
    public void testGetTablePropertiesOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetTablePropertiesOnlineRequest request = new GetTablePropertiesOnlineRequest(
            requestDocument,
            1,
            "",
            null,
            null
        );

        TablePropertiesResponse result = TestInitializer.wordsApi.getTablePropertiesOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting document properties without node path.
     */
    @Test
    public void testGetTablePropertiesWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetTablePropertiesWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetTablePropertiesRequest request = new GetTablePropertiesRequest(
            remoteFileName,
            1,
            null,
            remoteDataFolder,
            null,
            null,
            null
        );

        TablePropertiesResponse result = TestInitializer.wordsApi.getTableProperties(request);
        assertNotNull(result);
        assertNotNull(result.getProperties());
        assertEquals("Table Grid", result.getProperties().getStyleName());
    }

    /*
     * Test for updating table properties.
     */
    @Test
    public void testUpdateTableProperties() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateTableProperties.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        TableProperties requestProperties = new TableProperties();
        requestProperties.setAlignment(TableProperties.AlignmentEnum.RIGHT);
        requestProperties.setAllowAutoFit(false);
        requestProperties.setBidi(true);
        requestProperties.setBottomPadding((double)1);
        requestProperties.setCellSpacing((double)2.0);
        requestProperties.setStyleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS);

        UpdateTablePropertiesRequest request = new UpdateTablePropertiesRequest(
            remoteFileName,
            1,
            requestProperties,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TablePropertiesResponse result = TestInitializer.wordsApi.updateTableProperties(request);
        assertNotNull(result);
        assertNotNull(result.getProperties());
        assertEquals(Boolean.valueOf(false), result.getProperties().getAllowAutoFit());
        assertEquals(Boolean.valueOf(true), result.getProperties().getBidi());
        assertEquals(1.0, result.getProperties().getBottomPadding());
        assertEquals(2.0, result.getProperties().getCellSpacing());
    }

    /*
     * Test for updating table properties online.
     */
    @Test
    public void testUpdateTablePropertiesOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        TableProperties requestProperties = new TableProperties();
        requestProperties.setAlignment(TableProperties.AlignmentEnum.RIGHT);
        requestProperties.setAllowAutoFit(false);
        requestProperties.setBidi(true);
        requestProperties.setBottomPadding((double)1);
        requestProperties.setCellSpacing((double)2);
        requestProperties.setStyleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS);

        UpdateTablePropertiesOnlineRequest request = new UpdateTablePropertiesOnlineRequest(
            requestDocument,
            requestProperties,
            1,
            "",
            null,
            null,
            null,
            null,
            null
        );

        UpdateTablePropertiesOnlineResponse result = TestInitializer.wordsApi.updateTablePropertiesOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating table properties without node path.
     */
    @Test
    public void testUpdateTablePropertiesWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateTablePropertiesWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        TableProperties requestProperties = new TableProperties();
        requestProperties.setAlignment(TableProperties.AlignmentEnum.RIGHT);
        requestProperties.setAllowAutoFit(false);
        requestProperties.setBidi(true);
        requestProperties.setBottomPadding((double)1.0);
        requestProperties.setCellSpacing((double)2.0);
        requestProperties.setStyleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS);

        UpdateTablePropertiesRequest request = new UpdateTablePropertiesRequest(
            remoteFileName,
            1,
            requestProperties,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TablePropertiesResponse result = TestInitializer.wordsApi.updateTableProperties(request);
        assertNotNull(result);
        assertNotNull(result.getProperties());
        assertEquals(Boolean.valueOf(false), result.getProperties().getAllowAutoFit());
        assertEquals(Boolean.valueOf(true), result.getProperties().getBidi());
        assertEquals(1.0, result.getProperties().getBottomPadding());
        assertEquals(2.0, result.getProperties().getCellSpacing());
    }

    /*
     * Test for getting table row.
     */
    @Test
    public void testGetTableRow() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetTableRow.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetTableRowRequest request = new GetTableRowRequest(
            remoteFileName,
            "tables/1",
            0,
            remoteDataFolder,
            null,
            null,
            null
        );

        TableRowResponse result = TestInitializer.wordsApi.getTableRow(request);
        assertNotNull(result);
        assertNotNull(result.getRow());
        assertNotNull(result.getRow().getTableCellList());
        assertEquals(2, result.getRow().getTableCellList().size());
    }

    /*
     * Test for getting table row online.
     */
    @Test
    public void testGetTableRowOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetTableRowOnlineRequest request = new GetTableRowOnlineRequest(
            requestDocument,
            "tables/1",
            0,
            null,
            null
        );

        TableRowResponse result = TestInitializer.wordsApi.getTableRowOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting table row.
     */
    @Test
    public void testDeleteTableRow() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteTableRow.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteTableRowRequest request = new DeleteTableRowRequest(
            remoteFileName,
            "tables/1",
            0,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteTableRow(request);
    }

    /*
     * Test for deleting table row online.
     */
    @Test
    public void testDeleteTableRowOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteTableRowOnlineRequest request = new DeleteTableRowOnlineRequest(
            requestDocument,
            "tables/1",
            0,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.deleteTableRowOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for adding row.
     */
    @Test
    public void testInsertTableRow() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertTableRow.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        TableRowInsert requestRow = new TableRowInsert();
        requestRow.setColumnsCount(5);

        InsertTableRowRequest request = new InsertTableRowRequest(
            remoteFileName,
            "sections/0/tables/2",
            requestRow,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TableRowResponse result = TestInitializer.wordsApi.insertTableRow(request);
        assertNotNull(result);
        assertNotNull(result.getRow());
        assertNotNull(result.getRow().getTableCellList());
        assertEquals(5, result.getRow().getTableCellList().size());
    }

    /*
     * Test for adding row online.
     */
    @Test
    public void testInsertTableRowOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        TableRowInsert requestRow = new TableRowInsert();
        requestRow.setColumnsCount(5);

        InsertTableRowOnlineRequest request = new InsertTableRowOnlineRequest(
            requestDocument,
            "sections/0/tables/2",
            requestRow,
            null,
            null,
            null,
            null,
            null
        );

        InsertTableRowOnlineResponse result = TestInitializer.wordsApi.insertTableRowOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting row format.
     */
    @Test
    public void testGetTableRowFormat() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetTableRowFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetTableRowFormatRequest request = new GetTableRowFormatRequest(
            remoteFileName,
            "sections/0/tables/2",
            0,
            remoteDataFolder,
            null,
            null,
            null
        );

        TableRowFormatResponse result = TestInitializer.wordsApi.getTableRowFormat(request);
        assertNotNull(result);
        assertNotNull(result.getRowFormat());
        assertEquals(Boolean.valueOf(true), result.getRowFormat().getAllowBreakAcrossPages());
    }

    /*
     * Test for getting row format online.
     */
    @Test
    public void testGetTableRowFormatOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetTableRowFormatOnlineRequest request = new GetTableRowFormatOnlineRequest(
            requestDocument,
            "sections/0/tables/2",
            0,
            null,
            null
        );

        TableRowFormatResponse result = TestInitializer.wordsApi.getTableRowFormatOnline(request);
        assertNotNull(result);
    }

    /*
     * Test updating row format.
     */
    @Test
    public void testUpdateTableRowFormat() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateTableRowFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        TableRowFormat requestFormat = new TableRowFormat();
        requestFormat.setAllowBreakAcrossPages(true);
        requestFormat.setHeadingFormat(true);
        requestFormat.setHeight((double)10.0);
        requestFormat.setHeightRule(TableRowFormat.HeightRuleEnum.EXACTLY);

        UpdateTableRowFormatRequest request = new UpdateTableRowFormatRequest(
            remoteFileName,
            "sections/0/tables/2",
            0,
            requestFormat,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TableRowFormatResponse result = TestInitializer.wordsApi.updateTableRowFormat(request);
        assertNotNull(result);
        assertNotNull(result.getRowFormat());
        assertEquals(Boolean.valueOf(true), result.getRowFormat().getAllowBreakAcrossPages());
        assertEquals(Boolean.valueOf(true), result.getRowFormat().getHeadingFormat());
        assertEquals(10.0, result.getRowFormat().getHeight());
    }

    /*
     * Test updating row format online.
     */
    @Test
    public void testUpdateTableRowFormatOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        TableRowFormat requestFormat = new TableRowFormat();
        requestFormat.setAllowBreakAcrossPages(true);
        requestFormat.setHeadingFormat(true);
        requestFormat.setHeight((double)10);
        requestFormat.setHeightRule(TableRowFormat.HeightRuleEnum.AUTO);

        UpdateTableRowFormatOnlineRequest request = new UpdateTableRowFormatOnlineRequest(
            requestDocument,
            "sections/0/tables/2",
            requestFormat,
            0,
            null,
            null,
            null,
            null,
            null
        );

        UpdateTableRowFormatOnlineResponse result = TestInitializer.wordsApi.updateTableRowFormatOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table cell.
     */
    @Test
    public void testGetTableCell() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetTableCell.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetTableCellRequest request = new GetTableCellRequest(
            remoteFileName,
            "sections/0/tables/2/rows/0",
            0,
            remoteDataFolder,
            null,
            null,
            null
        );

        TableCellResponse result = TestInitializer.wordsApi.getTableCell(request);
        assertNotNull(result);
        assertNotNull(result.getCell());
        assertEquals("0.0.5.0.0", result.getCell().getNodeId());
    }

    /*
     * Test for getting table cell online.
     */
    @Test
    public void testGetTableCellOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetTableCellOnlineRequest request = new GetTableCellOnlineRequest(
            requestDocument,
            "sections/0/tables/2/rows/0",
            0,
            null,
            null
        );

        TableCellResponse result = TestInitializer.wordsApi.getTableCellOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting cell.
     */
    @Test
    public void testDeleteTableCell() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestDeleteTableCell.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        DeleteTableCellRequest request = new DeleteTableCellRequest(
            remoteFileName,
            "sections/0/tables/2/rows/0",
            0,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TestInitializer.wordsApi.deleteTableCell(request);
    }

    /*
     * Test for deleting cell online.
     */
    @Test
    public void testDeleteTableCellOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        DeleteTableCellOnlineRequest request = new DeleteTableCellOnlineRequest(
            requestDocument,
            "sections/0/tables/2/rows/0",
            0,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.deleteTableCellOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for adding cell.
     */
    @Test
    public void testInsertTableCell() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestInsertTableCell.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        TableCellInsert requestCell = new TableCellInsert();

        InsertTableCellRequest request = new InsertTableCellRequest(
            remoteFileName,
            "sections/0/tables/2/rows/0",
            requestCell,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TableCellResponse result = TestInitializer.wordsApi.insertTableCell(request);
        assertNotNull(result);
        assertNotNull(result.getCell());
        assertEquals("0.0.5.0.3", result.getCell().getNodeId());
    }

    /*
     * Test for adding cell online.
     */
    @Test
    public void testInsertTableCellOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        TableCellInsert requestCell = new TableCellInsert();

        InsertTableCellOnlineRequest request = new InsertTableCellOnlineRequest(
            requestDocument,
            "sections/0/tables/2/rows/0",
            requestCell,
            null,
            null,
            null,
            null,
            null
        );

        InsertTableCellOnlineResponse result = TestInitializer.wordsApi.insertTableCellOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for getting cell format.
     */
    @Test
    public void testGetTableCellFormat() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestGetTableCellFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        GetTableCellFormatRequest request = new GetTableCellFormatRequest(
            remoteFileName,
            "sections/0/tables/2/rows/0",
            0,
            remoteDataFolder,
            null,
            null,
            null
        );

        TableCellFormatResponse result = TestInitializer.wordsApi.getTableCellFormat(request);
        assertNotNull(result);
        assertNotNull(result.getCellFormat());
        assertEquals(Boolean.valueOf(true), result.getCellFormat().getWrapText());
    }

    /*
     * Test for getting cell format online.
     */
    @Test
    public void testGetTableCellFormatOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        GetTableCellFormatOnlineRequest request = new GetTableCellFormatOnlineRequest(
            requestDocument,
            "sections/0/tables/2/rows/0",
            0,
            null,
            null
        );

        TableCellFormatResponse result = TestInitializer.wordsApi.getTableCellFormatOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for updating cell format.
     */
    @Test
    public void testUpdateTableCellFormat() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestUpdateTableCellFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        TableCellFormat requestFormat = new TableCellFormat();
        requestFormat.setBottomPadding((double)5.0);
        requestFormat.setFitText(true);
        requestFormat.setHorizontalMerge(TableCellFormat.HorizontalMergeEnum.FIRST);
        requestFormat.setWrapText(true);

        UpdateTableCellFormatRequest request = new UpdateTableCellFormatRequest(
            remoteFileName,
            "sections/0/tables/2/rows/0",
            0,
            requestFormat,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null,
            null
        );

        TableCellFormatResponse result = TestInitializer.wordsApi.updateTableCellFormat(request);
        assertNotNull(result);
        assertNotNull(result.getCellFormat());
        assertEquals(5.0, result.getCellFormat().getBottomPadding());
        assertEquals(Boolean.valueOf(true), result.getCellFormat().getFitText());
        assertEquals(Boolean.valueOf(true), result.getCellFormat().getWrapText());
    }

    /*
     * Test for updating cell format online.
     */
    @Test
    public void testUpdateTableCellFormatOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        TableCellFormat requestFormat = new TableCellFormat();
        requestFormat.setBottomPadding((double)5);
        requestFormat.setFitText(true);
        requestFormat.setHorizontalMerge(TableCellFormat.HorizontalMergeEnum.FIRST);
        requestFormat.setWrapText(true);

        UpdateTableCellFormatOnlineRequest request = new UpdateTableCellFormatOnlineRequest(
            requestDocument,
            "sections/0/tables/2/rows/0",
            requestFormat,
            0,
            null,
            null,
            null,
            null,
            null
        );

        UpdateTableCellFormatOnlineResponse result = TestInitializer.wordsApi.updateTableCellFormatOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for table rendering.
     */
    @Test
    public void testRenderTable() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestRenderTable.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RenderTableRequest request = new RenderTableRequest(
            remoteFileName,
            "png",
            0,
            "",
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.renderTable(request);
        assertNotNull(result);
    }

    /*
     * Test for table rendering.
     */
    @Test
    public void testRenderTableOnline() throws ApiException, MessagingException, IOException
    {
        byte[] requestDocument = Files.readAllBytes(Paths.get(TestInitializer.LocalTestFolder, localFile).toAbsolutePath());
        RenderTableOnlineRequest request = new RenderTableOnlineRequest(
            requestDocument,
            "png",
            0,
            "",
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.renderTableOnline(request);
        assertNotNull(result);
    }

    /*
     * Test for table rendering without node path.
     */
    @Test
    public void testRenderTableWithoutNodePath() throws ApiException, MessagingException, IOException
    {
        String remoteFileName = "TestRenderTableWithoutNodePath.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        RenderTableRequest request = new RenderTableRequest(
            remoteFileName,
            "png",
            0,
            null,
            remoteDataFolder,
            null,
            null,
            null,
            null,
            null
        );

        File result = TestInitializer.wordsApi.renderTable(request);
        assertNotNull(result);
    }
}
