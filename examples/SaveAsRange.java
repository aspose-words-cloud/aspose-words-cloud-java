ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RangeDocument requestDocumentParameters = new RangeDocument();
requestDocumentParameters.setDocumentName("/NewDoc.docx");

SaveAsRangeRequest saveRequest = new SaveAsRangeRequest("Sample.docx", "id0.0.0", requestDocumentParameters, "id0.0.1", null, null, null, null);
wordsApi.saveAsRange(saveRequest);