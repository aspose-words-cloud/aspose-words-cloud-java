/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TestTable.java">
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

package com.aspose.words.cloud.api.table;

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
    public void testGetTables() throws ApiException, IOException
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
    }

    /*
     * Test for getting tables without node path.
     */
    @Test
    public void testGetTablesWithoutNodePath() throws ApiException, IOException
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
    }

    /*
     * Test for getting table.
     */
    @Test
    public void testGetTable() throws ApiException, IOException
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
    }

    /*
     * Test for getting table without node path.
     */
    @Test
    public void testGetTableWithoutNodePath() throws ApiException, IOException
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
    }

    /*
     * Test for deleting table.
     */
    @Test
    public void testDeleteTable() throws ApiException, IOException
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
     * Test for deleting table without node path.
     */
    @Test
    public void testDeleteTableWithoutNodePath() throws ApiException, IOException
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
    public void testInsertTable() throws ApiException, IOException
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
    }

    /*
     * Test for adding table without node path.
     */
    @Test
    public void testInsertTableWithoutNodePath() throws ApiException, IOException
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
    }

    /*
     * Test for getting document properties.
     */
    @Test
    public void testGetTableProperties() throws ApiException, IOException
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
    }

    /*
     * Test for getting document properties without node path.
     */
    @Test
    public void testGetTablePropertiesWithoutNodePath() throws ApiException, IOException
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
    }

    /*
     * Test for updating table properties.
     */
    @Test
    public void testUpdateTableProperties() throws ApiException, IOException
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
        requestProperties.setCellSpacing((double)2);
        requestProperties.setStyleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS);

        UpdateTablePropertiesRequest request = new UpdateTablePropertiesRequest(
            remoteFileName,
            requestProperties,
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

        TablePropertiesResponse result = TestInitializer.wordsApi.updateTableProperties(request);
        assertNotNull(result);
    }

    /*
     * Test for updating table properties without node path.
     */
    @Test
    public void testUpdateTablePropertiesWithoutNodePath() throws ApiException, IOException
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
        requestProperties.setBottomPadding((double)1);
        requestProperties.setCellSpacing((double)2);
        requestProperties.setStyleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS);

        UpdateTablePropertiesRequest request = new UpdateTablePropertiesRequest(
            remoteFileName,
            requestProperties,
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

        TablePropertiesResponse result = TestInitializer.wordsApi.updateTableProperties(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table row.
     */
    @Test
    public void testGetTableRow() throws ApiException, IOException
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
    }

    /*
     * Test for deleting table row.
     */
    @Test
    public void testDeleteTableRow() throws ApiException, IOException
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
     * Test for adding row.
     */
    @Test
    public void testInsertTableRow() throws ApiException, IOException
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
            requestRow,
            "sections/0/tables/2",
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
    }

    /*
     * Test for getting row format.
     */
    @Test
    public void testGetTableRowFormat() throws ApiException, IOException
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
    }

    /*
     * Test updating row format.
     */
    @Test
    public void testUpdateTableRowFormat() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateTableRowFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        TableRowFormat requestFormat = new TableRowFormat();
        requestFormat.setAllowBreakAcrossPages(true);
        requestFormat.setHeadingFormat(true);
        requestFormat.setHeight((double)10);
        requestFormat.setHeightRule(TableRowFormat.HeightRuleEnum.AUTO);

        UpdateTableRowFormatRequest request = new UpdateTableRowFormatRequest(
            remoteFileName,
            requestFormat,
            "sections/0/tables/2",
            0,
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
    }

    /*
     * Test for getting table cell.
     */
    @Test
    public void testGetTableCell() throws ApiException, IOException
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
    }

    /*
     * Test for deleting cell.
     */
    @Test
    public void testDeleteTableCell() throws ApiException, IOException
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
     * Test for adding cell.
     */
    @Test
    public void testInsertTableCell() throws ApiException, IOException
    {
        String remoteFileName = "TestInsertTableCell.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        TableCellInsert requestCell = new TableCellInsert();

        InsertTableCellRequest request = new InsertTableCellRequest(
            remoteFileName,
            requestCell,
            "sections/0/tables/2/rows/0",
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
    }

    /*
     * Test for getting cell format.
     */
    @Test
    public void testGetTableCellFormat() throws ApiException, IOException
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
    }

    /*
     * Test for updating cell format.
     */
    @Test
    public void testUpdateTableCellFormat() throws ApiException, IOException
    {
        String remoteFileName = "TestUpdateTableCellFormat.docx";

        TestInitializer.UploadFile(
            PathUtil.get(TestInitializer.LocalTestFolder, localFile),
            remoteDataFolder + "/" + remoteFileName
        );

        TableCellFormat requestFormat = new TableCellFormat();
        requestFormat.setBottomPadding((double)5);
        requestFormat.setFitText(true);
        requestFormat.setHorizontalMerge(TableCellFormat.HorizontalMergeEnum.FIRST);
        requestFormat.setWrapText(true);

        UpdateTableCellFormatRequest request = new UpdateTableCellFormatRequest(
            remoteFileName,
            requestFormat,
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

        TableCellFormatResponse result = TestInitializer.wordsApi.updateTableCellFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for table rendering.
     */
    @Test
    public void testRenderTable() throws ApiException, IOException
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
            null
        );

        File result = TestInitializer.wordsApi.renderTable(request);
        assertNotNull(result);
    }

    /*
     * Test for table rendering without node path.
     */
    @Test
    public void testRenderTableWithoutNodePath() throws ApiException, IOException
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
            null
        );

        File result = TestInitializer.wordsApi.renderTable(request);
        assertNotNull(result);
    }
}
