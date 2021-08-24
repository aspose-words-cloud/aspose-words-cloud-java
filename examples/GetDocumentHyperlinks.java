ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentHyperlinksRequest request = new GetDocumentHyperlinksRequest("Sample.docx", null, null, null, null);
wordsApi.getDocumentHyperlinks(request);