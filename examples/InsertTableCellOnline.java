String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
TableCellInsert requestCell = new TableCellInsert();

InsertTableCellOnlineRequest insertRequestRequest = new InsertTableCellOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2/rows/0",requestCell,null,null,null,null,null);
wordsApi.insertTableCellOnline(insertRequestRequest);