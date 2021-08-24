ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
AcceptAllRevisionsOnlineRequest acceptRequest = new AcceptAllRevisionsOnlineRequest(requestDocument, null, null, null);
wordsApi.acceptAllRevisionsOnline(acceptRequest);