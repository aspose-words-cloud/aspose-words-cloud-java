ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetTablePropertiesOnlineRequest request = new GetTablePropertiesOnlineRequest(requestDocument, 1, null, null, null);
wordsApi.getTablePropertiesOnline(request);