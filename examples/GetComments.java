ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetCommentsRequest requestRequest = new GetCommentsRequest("Sample.docx",null,null,null,null);
wordsApi.getComments(requestRequest);