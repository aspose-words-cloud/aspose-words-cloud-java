String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetDocumentDrawingObjectsOnlineRequest requestRequest = new GetDocumentDrawingObjectsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"sections/0",null,null);
wordsApi.getDocumentDrawingObjectsOnline(requestRequest);