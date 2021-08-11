ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFieldRequest requestRequest = new GetFieldRequest("Sample.docx",0,null,null,null,null,null);
wordsApi.getField(requestRequest);