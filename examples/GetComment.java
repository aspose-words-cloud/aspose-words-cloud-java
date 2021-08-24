ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetCommentRequest request = new GetCommentRequest("Sample.docx", 0, null, null, null, null);
wordsApi.getComment(request);