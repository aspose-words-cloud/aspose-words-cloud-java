ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFieldRequest deleteRequestRequest = new DeleteFieldRequest("Sample.docx",0,null,null,null,null,null,null,null,null);
wordsApi.deleteField(deleteRequestRequest);