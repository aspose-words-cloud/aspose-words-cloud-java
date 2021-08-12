ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
AcceptAllRevisionsRequest acceptRequestRequest = new AcceptAllRevisionsRequest("Sample.docx",null,null,null,null,null);
wordsApi.acceptAllRevisions(acceptRequestRequest);