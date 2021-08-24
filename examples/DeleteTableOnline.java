ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteTableOnlineRequest deleteRequest = new DeleteTableOnlineRequest(requestDocument, 1, null, null, null, null, null, null);
wordsApi.deleteTableOnline(deleteRequest);