ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
TableInsert requestTable = new TableInsert();
requestTable.setColumnsCount(5);
requestTable.setRowsCount(4);

InsertTableOnlineRequest insertRequest = new InsertTableOnlineRequest(requestDocument, requestTable, null, null, null, null, null, null);
wordsApi.insertTableOnline(insertRequest);