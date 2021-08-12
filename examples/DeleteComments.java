ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteCommentsRequest deleteRequestRequest = new DeleteCommentsRequest("Sample.docx",null,null,null,null,null,null,null);
wordsApi.deleteComments(deleteRequestRequest);