ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentDrawingObjectImageDataRequest requestRequest = new GetDocumentDrawingObjectImageDataRequest("Sample.docx",0,null,null,null,null,null);
wordsApi.getDocumentDrawingObjectImageData(requestRequest);