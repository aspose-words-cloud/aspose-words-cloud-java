ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentPropertyRequest requestRequest = new GetDocumentPropertyRequest("Sample.docx","Author",null,null,null,null);
wordsApi.getDocumentProperty(requestRequest);