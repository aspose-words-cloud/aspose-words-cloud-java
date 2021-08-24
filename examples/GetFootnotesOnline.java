ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
GetFootnotesOnlineRequest request = new GetFootnotesOnlineRequest(requestDocument, null, null, null);
wordsApi.getFootnotesOnline(request);