ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetCommentsRequest request = new GetCommentsRequest("Sample.docx", null, null, null, null);
wordsApi.getComments(request);