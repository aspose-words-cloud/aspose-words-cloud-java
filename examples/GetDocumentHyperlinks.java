ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentHyperlinksRequest requestRequest = new GetDocumentHyperlinksRequest("Sample.docx",null,null,null,null);
wordsApi.getDocumentHyperlinks(requestRequest);