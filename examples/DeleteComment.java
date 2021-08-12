ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteCommentRequest deleteRequestRequest = new DeleteCommentRequest("Sample.docx",0,null,null,null,null,null,null,null);
wordsApi.deleteComment(deleteRequestRequest);