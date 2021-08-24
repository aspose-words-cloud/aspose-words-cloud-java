ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
GetHeaderFooterOnlineRequest request = new GetHeaderFooterOnlineRequest(requestDocument, 0, null, null, null);
wordsApi.getHeaderFooterOnline(request);