ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteDrawingObjectOnlineRequest deleteRequest = new DeleteDrawingObjectOnlineRequest(requestDocument, 0, null, null, null, null, null, null);
wordsApi.deleteDrawingObjectOnline(deleteRequest);