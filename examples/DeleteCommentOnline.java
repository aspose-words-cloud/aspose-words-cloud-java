ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteCommentOnlineRequest deleteRequest = new DeleteCommentOnlineRequest(requestDocument, 0, null, null, null, null, null);
wordsApi.deleteCommentOnline(deleteRequest);