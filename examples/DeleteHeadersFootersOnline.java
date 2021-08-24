ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
DeleteHeadersFootersOnlineRequest deleteRequest = new DeleteHeadersFootersOnlineRequest(requestDocument, "", null, null, null, null, null, null);
wordsApi.deleteHeadersFootersOnline(deleteRequest);