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
import com.aspose.words.cloud.PathUtil;
import com.aspose.words.cloud.TestInitializer;
import com.aspose.words.cloud.model.*;
import com.aspose.words.cloud.model.requests.*;
import org.junit.Test;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;

public class TestTables extends TestCase {
    private String testFolder = "DocumentElements/Tables";

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestInitializer.Initialize();
    }

    /*
     * Test for removing table
     */
    @Test
public void testDeleteTable() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestDeleteTable.docx";
        Integer index = 0;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteTableRequest request = new DeleteTableRequest(remoteName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteTable(request);
    }

    /*
     * Test for removing table
     */
    @Test
public void testDeleteTableWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestDeleteTableWithoutNodePath.docx";
        Integer index = 0;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteTableWithoutNodePathRequest request = new DeleteTableWithoutNodePathRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteTableWithoutNodePath(request);
    }

    /*
     * Test for removing table cell
     */
    @Test
public void testDeleteTableCell() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestDeleteTableCell.docx";
        Integer index = 0;
        String sourcePath = "sections/0/tables/2/rows/0";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteTableCellRequest request = new DeleteTableCellRequest(remoteName, sourcePath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteTableCell(request);
    }

    /*
     * Test for removing table row
     */
    @Test
public void testDeleteTableRow() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestDeleteTableRow.docx";
        Integer index = 0;
        String sourcePath = "tables/1";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteTableRowRequest request = new DeleteTableRowRequest(remoteName, sourcePath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        TestInitializer.wordsApi.deleteTableRow(request);
    }

    /*
     * Test for getting table border
     */
    @Test
public void testGetBorder() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetBorder.docx";
        String sourcePath = "sections/0/tables/2/rows/0";
        String borderType = "left";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetBorderRequest request = new GetBorderRequest(remoteName, sourcePath, borderType,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        BorderResponse result = TestInitializer.wordsApi.getBorder(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table borders
     */
    @Test
public void testGetBorders() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetBorders.docx";
        String sourcePath = "sections/0/tables/2/rows/0";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetBordersRequest request = new GetBordersRequest(remoteName, sourcePath,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        BordersResponse result = TestInitializer.wordsApi.getBorders(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table
     */
    @Test
public void testGetTable() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTable.docx";
        Integer index = 0;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetTableRequest request = new GetTableRequest(remoteName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableResponse result = TestInitializer.wordsApi.getTable(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table without node path
     */
    @Test
public void testGetTableWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTableWithoutNodePath.docx";
        Integer index = 0;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetTableWithoutNodePathRequest request = new GetTableWithoutNodePathRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableResponse result = TestInitializer.wordsApi.getTableWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table cell
     */
    @Test
public void testGetTableCell() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTableCell.docx";
        Integer index = 0;
        String sourcePath = "sections/0/tables/2/rows/0";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetTableCellRequest request = new GetTableCellRequest(remoteName, sourcePath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableCellResponse result = TestInitializer.wordsApi.getTableCell(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table cell format
     */
    @Test
public void testGetTableCellFormat() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTableCellFormat.docx";
        Integer index = 0;
        String sourcePath = "sections/0/tables/2/rows/0";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetTableCellFormatRequest request = new GetTableCellFormatRequest(remoteName, sourcePath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableCellFormatResponse result = TestInitializer.wordsApi.getTableCellFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table row
     */
    @Test
public void testGetTableRow() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTableRow.docx";
        Integer index = 0;
        String sourcePath = "tables/1";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetTableRowRequest request = new GetTableRowRequest(remoteName, sourcePath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableRowResponse result = TestInitializer.wordsApi.getTableRow(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table row format
     */
    @Test
public void testGetTableRowFormat() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTableRowFormat.docx";
        Integer index = 0;
        String sourcePath = "sections/0/tables/2";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetTableRowFormatRequest request = new GetTableRowFormatRequest(remoteName, sourcePath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableRowFormatResponse result = TestInitializer.wordsApi.getTableRowFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for getting tables
     */
    @Test
public void testGetTables() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTables.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetTablesRequest request = new GetTablesRequest(remoteName,"",
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableLinkCollectionResponse result = TestInitializer.wordsApi.getTables(request);
        assertNotNull(result);
    }

    /*
     * Test for getting tables without node path
     */
    @Test
public void testGetTablesWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTablesWithoutNodePath.docx";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetTablesWithoutNodePathRequest request = new GetTablesWithoutNodePathRequest(remoteName,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TableLinkCollectionResponse result = TestInitializer.wordsApi.getTablesWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting table
     */
    @Test
public void testInsertTable() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestInsertTable.docx";
        TableInsert body = new TableInsert().columnsCount(3).rowsCount(5);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertTableRequest request = new InsertTableRequest(remoteName, "",
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TableResponse result = TestInitializer.wordsApi.insertTable(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting table without node path
     */
    @Test
public void testInsertTableWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestInsertTableWithoutNodePath.docx";
        TableInsert body = new TableInsert().columnsCount(3).rowsCount(5);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertTableWithoutNodePathRequest request = new InsertTableWithoutNodePathRequest(remoteName,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TableResponse result = TestInitializer.wordsApi.insertTableWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting table cell
     */
    @Test
public void testInsertTableCell() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestInsertTableCell.docx";
        TableCellInsert body = new TableCellInsert();
        String sourcePath = "sections/0/tables/2/rows/0";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertTableCellRequest request = new InsertTableCellRequest(remoteName, sourcePath,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TableCellResponse result = TestInitializer.wordsApi.insertTableCell(request);
        assertNotNull(result);
    }

    /*
     * Test for inserting table row
     */
    @Test
public void testInsertTableRow() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestInsertTableRow.docx";
        TableRowInsert body = new TableRowInsert().columnsCount(5);
        String sourcePath = "sections/0/tables/2";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        InsertTableRowRequest request = new InsertTableRowRequest(remoteName, sourcePath,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TableRowResponse result = TestInitializer.wordsApi.insertTableRow(request);
        assertNotNull(result);
    }

    /*
     * Test for rendering table
     */
    @Test
public void testRenderTable() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestRenderTable.docx";
        Integer index = 0;
        String format = "png";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        RenderTableRequest request = new RenderTableRequest(remoteName, format, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null);

        File result = TestInitializer.wordsApi.renderTable(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for rendering table without node path
     */
    @Test
public void testRenderTableWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestRenderTableWithoutNodePath.docx";
        Integer index = 0;
        String format = "png";
        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        RenderTableWithoutNodePathRequest request = new RenderTableWithoutNodePathRequest(remoteName, format, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null);

        File result = TestInitializer.wordsApi.renderTableWithoutNodePath(request);
        assertTrue(result.length() > 0);
    }

    /*
     * Test for updating table cell format
     */
    @Test
public void testUpdateTableCellFormat() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestUpdateTableCellFormat.docx";
        TableCellFormat body = new TableCellFormat().wrapText(true)
                .bottomPadding(5.0).fitText(true).horizontalMerge(TableCellFormat.HorizontalMergeEnum.FIRST);
        String sourcePath = "sections/0/tables/2/rows/0";
        Integer index = 0;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateTableCellFormatRequest request = new UpdateTableCellFormatRequest(remoteName, sourcePath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TableCellFormatResponse result = TestInitializer.wordsApi.updateTableCellFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table properties
     */
    @Test
public void testGetTableProperties() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTableProperties.docx";
        Integer index = 0;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetTablePropertiesRequest request = new GetTablePropertiesRequest(remoteName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TablePropertiesResponse result = TestInitializer.wordsApi.getTableProperties(request);
        assertNotNull(result);
    }

    /*
     * Test for getting table properties without node path
     */
    @Test
public void testGetTablePropertiesWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestGetTablePropertiesWithoutNodePath.docx";
        Integer index = 0;

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        GetTablePropertiesWithoutNodePathRequest request = new GetTablePropertiesWithoutNodePathRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null);

        TablePropertiesResponse result = TestInitializer.wordsApi.getTablePropertiesWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for updating table properties
     */
    @Test
public void testUpdateTableProperties() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestUpdateTableProperties.docx";
        Integer index = 0;
        TableProperties body = new TableProperties().alignment(TableProperties.AlignmentEnum.RIGHT)
                .allowAutoFit(false).bidi(true).bottomPadding(1.0).cellSpacing(2.0).leftIndent(3.0)
                .rightPadding(5.0).styleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS).topPadding(6.0);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateTablePropertiesRequest request = new UpdateTablePropertiesRequest(remoteName, "", index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TablePropertiesResponse result = TestInitializer.wordsApi.updateTableProperties(request);
        assertNotNull(result);
    }

    /*
     * Test for updating table properties without node path
     */
    @Test
public void testUpdateTablePropertiesWithoutNodePath() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestUpdateTablePropertiesWithoutNodePath.docx";
        Integer index = 0;
        TableProperties body = new TableProperties().alignment(TableProperties.AlignmentEnum.RIGHT)
                .allowAutoFit(false).bidi(true).bottomPadding(1.0).cellSpacing(2.0).leftIndent(3.0)
                .rightPadding(5.0).styleOptions(TableProperties.StyleOptionsEnum.COLUMNBANDS).topPadding(6.0);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateTablePropertiesWithoutNodePathRequest request = new UpdateTablePropertiesWithoutNodePathRequest(remoteName, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TablePropertiesResponse result = TestInitializer.wordsApi.updateTablePropertiesWithoutNodePath(request);
        assertNotNull(result);
    }

    /*
     * Test for updating table row format
     */
    @Test
public void testUpdateTableRowFormat() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestUpdateTableRowFormat.docx";
        Integer index = 0;
        TableRowFormat body = new TableRowFormat().allowBreakAcrossPages(true).headingFormat(true)
                .height(10.0).heightRule(TableRowFormat.HeightRuleEnum.AUTO);
        String sourcePath = "sections/0/tables/2";

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateTableRowFormatRequest request = new UpdateTableRowFormatRequest(remoteName, sourcePath, index,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null, body);

        TableRowFormatResponse result = TestInitializer.wordsApi.updateTableRowFormat(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting table border
     */
    @Test
public void testDeleteBorder() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestDeleteTableBorder.docx";
        String borderType = "left";
        String sourcePath = "tables/1/rows/0/cells/0/";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName).toString();

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteBorderRequest request = new DeleteBorderRequest(remoteName, sourcePath, borderType,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null);

        BorderResponse result = TestInitializer.wordsApi.deleteBorder(request);
        assertNotNull(result);
    }

    /*
     * Test for deleting table borders
     */
    @Test
public void testDeleteBorders() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestDeleteTableBorders.docx";
        String sourcePath = "tables/1/rows/0/cells/0/";
        String destName = PathUtil.get(TestInitializer.RemoteTestOut, remoteName).toString();

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        DeleteBordersRequest request = new DeleteBordersRequest(remoteName, sourcePath,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, destName, null, null);

        BordersResponse result = TestInitializer.wordsApi.deleteBorders(request);
        assertNotNull(result);
    }

    /*
     * Test for updating table border
     */
    @Test
public void testUpdateBorder() throws ApiException, FileNotFoundException {
        String fileName = "TablesGet.docx";
        String remoteName = "TestUpdateBorder.docx";
        String borderType = "left";
        String sourcePath = "tables/1/rows/0/cells/0/";
        Border body = new Border().borderType(Border.BorderTypeEnum.LEFT).color(new XmlColor().alpha(2)).distanceFromText(6.0)
                .lineStyle(Border.LineStyleEnum.DASHDOTSTROKER).lineWidth(2.0).shadow(true);

        TestInitializer.UploadFile(PathUtil.get(TestInitializer.LocalTestFolder, testFolder, fileName).toString(), PathUtil.get(TestInitializer.RemoteTestFolder, testFolder, remoteName).toString().replace("\\", "/"));

        UpdateBorderRequest request = new UpdateBorderRequest(remoteName, body, sourcePath, borderType,
                PathUtil.get(TestInitializer.RemoteTestFolder, testFolder).toString(), null, null,
                null, null, null, null);

        BorderResponse result = TestInitializer.wordsApi.updateBorder(request);
        assertNotNull(result);
    }
}
