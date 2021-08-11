String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetTableCellFormatOnlineRequest requestRequest = new GetTableCellFormatOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0/tables/2/rows/0",0,null,null);
wordsApi.getTableCellFormatOnline(requestRequest);