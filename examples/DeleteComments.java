ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteCommentsRequest deleteRequest = new DeleteCommentsRequest("Sample.docx", null, null, null, null, null, null, null);
wordsApi.deleteComments(deleteRequest);