ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
GetHeaderFooterOfSectionOnlineRequest request = new GetHeaderFooterOfSectionOnlineRequest(requestDocument, 0, 0, null, null, null);
wordsApi.getHeaderFooterOfSectionOnline(request);