ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TableInsert requestTable = new TableInsert();
requestTable.setColumnsCount(5);
requestTable.setRowsCount(4);

InsertTableRequest insertRequest = new InsertTableRequest("Sample.docx", requestTable, null, null, null, null, null, null, null, null);
wordsApi.insertTable(insertRequest);