ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentPropertiesRequest request = new GetDocumentPropertiesRequest("Sample.docx", null, null, null, null);
wordsApi.getDocumentProperties(request);