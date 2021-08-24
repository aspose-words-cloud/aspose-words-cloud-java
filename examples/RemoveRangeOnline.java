ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
RemoveRangeOnlineRequest removeRequest = new RemoveRangeOnlineRequest(requestDocument, "id0.0.0", "id0.0.1", null, null, null);
wordsApi.removeRangeOnline(removeRequest);