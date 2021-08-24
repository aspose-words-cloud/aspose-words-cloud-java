ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetTableRowOnlineRequest request = new GetTableRowOnlineRequest(requestDocument, "tables/1", 0, null, null);
wordsApi.getTableRowOnline(request);