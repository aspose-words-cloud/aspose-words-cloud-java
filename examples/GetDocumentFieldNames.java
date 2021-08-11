ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentFieldNamesRequest requestRequest = new GetDocumentFieldNamesRequest("Sample.docx",null,null,null,null,null);
wordsApi.getDocumentFieldNames(requestRequest);