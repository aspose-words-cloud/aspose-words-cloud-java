ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentRequest requestRequest = new GetDocumentRequest("Sample.docx",null,null,null,null);
wordsApi.getDocument(requestRequest);