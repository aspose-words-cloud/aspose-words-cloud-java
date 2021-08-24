ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentDrawingObjectsRequest request = new GetDocumentDrawingObjectsRequest("Sample.docx", null, null, null, null, null);
wordsApi.getDocumentDrawingObjects(request);