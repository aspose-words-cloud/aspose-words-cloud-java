ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentDrawingObjectsRequest requestRequest = new GetDocumentDrawingObjectsRequest("Sample.docx",null,null,null,null,null);
wordsApi.getDocumentDrawingObjects(requestRequest);