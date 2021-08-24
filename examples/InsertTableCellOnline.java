ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
TableCellInsert requestCell = new TableCellInsert();

InsertTableCellOnlineRequest insertRequest = new InsertTableCellOnlineRequest(requestDocument, "sections/0/tables/2/rows/0", requestCell, null, null, null, null, null);
wordsApi.insertTableCellOnline(insertRequest);