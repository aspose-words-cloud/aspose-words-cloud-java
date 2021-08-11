String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RangeDocument requestDocumentParameters = new RangeDocument();
requestDocumentParameters.setDocumentName("/NewDoc.docx");

SaveAsRangeOnlineRequest saveRequestRequest = new SaveAsRangeOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Range/RangeGet.doc").toAbsolutePath()),"id0.0.0",requestDocumentParameters,"id0.0.1",null,null);
wordsApi.saveAsRangeOnline(saveRequestRequest);