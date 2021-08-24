ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteCommentsOnlineRequest deleteRequest = new DeleteCommentsOnlineRequest(requestDocument, null, null, null, null, null);
wordsApi.deleteCommentsOnline(deleteRequest);