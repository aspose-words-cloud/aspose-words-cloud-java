ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
GetHeaderFootersOnlineRequest request = new GetHeaderFootersOnlineRequest(requestDocument, "", null, null, null);
wordsApi.getHeaderFootersOnline(request);