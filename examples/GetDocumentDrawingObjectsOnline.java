ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
GetDocumentDrawingObjectsOnlineRequest request = new GetDocumentDrawingObjectsOnlineRequest(requestDocument, "sections/0", null, null);
wordsApi.getDocumentDrawingObjectsOnline(request);