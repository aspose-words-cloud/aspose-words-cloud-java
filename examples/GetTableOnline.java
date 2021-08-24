ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetTableOnlineRequest request = new GetTableOnlineRequest(requestDocument, 1, null, null, null);
wordsApi.getTableOnline(request);