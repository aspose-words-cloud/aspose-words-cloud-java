ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentDrawingObjectByIndexRequest requestRequest = new GetDocumentDrawingObjectByIndexRequest("Sample.docx",0,null,null,null,null,null);
wordsApi.getDocumentDrawingObjectByIndex(requestRequest);