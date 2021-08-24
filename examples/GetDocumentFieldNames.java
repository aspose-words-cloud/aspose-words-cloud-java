ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentFieldNamesRequest request = new GetDocumentFieldNamesRequest("Sample.docx", null, null, null, null, null);
wordsApi.getDocumentFieldNames(request);