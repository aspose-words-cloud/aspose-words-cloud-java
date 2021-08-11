String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TableRowInsert requestRow = new TableRowInsert();
requestRow.setColumnsCount(5);

InsertTableRowOnlineRequest insertRequestRequest = new InsertTableRowOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2",requestRow,null,null,null,null,null);
wordsApi.insertTableRowOnline(insertRequestRequest);