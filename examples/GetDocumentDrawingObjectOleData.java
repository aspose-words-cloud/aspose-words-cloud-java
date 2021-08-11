ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentDrawingObjectOleDataRequest requestRequest = new GetDocumentDrawingObjectOleDataRequest("Sample.docx",0,null,null,null,null,null);
wordsApi.getDocumentDrawingObjectOleData(requestRequest);