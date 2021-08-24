ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentRequest request = new GetDocumentRequest("Sample.docx", null, null, null, null);
wordsApi.getDocument(request);