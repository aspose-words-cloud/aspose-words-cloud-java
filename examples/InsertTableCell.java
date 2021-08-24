ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TableCellInsert requestCell = new TableCellInsert();

InsertTableCellRequest insertRequest = new InsertTableCellRequest("Sample.docx", "sections/0/tables/2/rows/0", requestCell, null, null, null, null, null, null, null);
wordsApi.insertTableCell(insertRequest);