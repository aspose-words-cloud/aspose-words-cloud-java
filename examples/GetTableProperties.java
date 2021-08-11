ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetTablePropertiesRequest requestRequest = new GetTablePropertiesRequest("Sample.docx",1,null,null,null,null,null);
wordsApi.getTableProperties(requestRequest);