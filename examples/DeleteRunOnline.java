ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
DeleteRunOnlineRequest deleteRequest = new DeleteRunOnlineRequest(requestDocument, "paragraphs/1", 0, null, null, null, null, null);
wordsApi.deleteRunOnline(deleteRequest);