ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetCommentOnlineRequest request = new GetCommentOnlineRequest(requestDocument, 0, null, null);
wordsApi.getCommentOnline(request);