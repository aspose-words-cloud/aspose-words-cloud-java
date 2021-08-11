String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentDrawingObjectOleDataOnlineRequest requestRequest = new GetDocumentDrawingObjectOleDataOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),0,"sections/0",null,null);
wordsApi.getDocumentDrawingObjectOleDataOnline(requestRequest);