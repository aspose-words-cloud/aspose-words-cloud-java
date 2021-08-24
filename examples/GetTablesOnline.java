ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetTablesOnlineRequest request = new GetTablesOnlineRequest(requestDocument, null, null, null);
wordsApi.getTablesOnline(request);