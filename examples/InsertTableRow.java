ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TableRowInsert requestRow = new TableRowInsert();
requestRow.setColumnsCount(5);

InsertTableRowRequest insertRequest = new InsertTableRowRequest("Sample.docx", "sections/0/tables/2", requestRow, null, null, null, null, null, null, null);
wordsApi.insertTableRow(insertRequest);