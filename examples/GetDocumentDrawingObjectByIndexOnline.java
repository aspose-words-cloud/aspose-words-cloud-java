String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentDrawingObjectByIndexOnlineRequest requestRequest = new GetDocumentDrawingObjectByIndexOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"sections/0",null,null);
wordsApi.getDocumentDrawingObjectByIndexOnline(requestRequest);