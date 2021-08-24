ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentHyperlinkByIndexRequest request = new GetDocumentHyperlinkByIndexRequest("Sample.docx", 0, null, null, null, null);
wordsApi.getDocumentHyperlinkByIndex(request);