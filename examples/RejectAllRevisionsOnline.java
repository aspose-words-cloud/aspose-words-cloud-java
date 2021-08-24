ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
RejectAllRevisionsOnlineRequest rejectRequest = new RejectAllRevisionsOnlineRequest(requestDocument, null, null, null);
wordsApi.rejectAllRevisionsOnline(rejectRequest);