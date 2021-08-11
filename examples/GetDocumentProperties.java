ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentPropertiesRequest requestRequest = new GetDocumentPropertiesRequest("Sample.docx",null,null,null,null);
wordsApi.getDocumentProperties(requestRequest);