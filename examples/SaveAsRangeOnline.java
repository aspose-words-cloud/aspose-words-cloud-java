ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
RangeDocument requestDocumentParameters = new RangeDocument();
requestDocumentParameters.setDocumentName("/NewDoc.docx");

SaveAsRangeOnlineRequest saveRequest = new SaveAsRangeOnlineRequest(requestDocument, "id0.0.0", requestDocumentParameters, "id0.0.1", null, null);
wordsApi.saveAsRangeOnline(saveRequest);