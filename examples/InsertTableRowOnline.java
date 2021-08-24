ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
TableRowInsert requestRow = new TableRowInsert();
requestRow.setColumnsCount(5);

InsertTableRowOnlineRequest insertRequest = new InsertTableRowOnlineRequest(requestDocument, "sections/0/tables/2", requestRow, null, null, null, null, null);
wordsApi.insertTableRowOnline(insertRequest);