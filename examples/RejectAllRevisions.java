ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RejectAllRevisionsRequest rejectRequestRequest = new RejectAllRevisionsRequest("Sample.docx",null,null,null,null,null);
wordsApi.rejectAllRevisions(rejectRequestRequest);