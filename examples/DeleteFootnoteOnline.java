ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
DeleteFootnoteOnlineRequest deleteRequest = new DeleteFootnoteOnlineRequest(requestDocument, 0, null, null, null, null, null, null);
wordsApi.deleteFootnoteOnline(deleteRequest);