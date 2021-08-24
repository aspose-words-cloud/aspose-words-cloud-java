ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.docx").toAbsolutePath());
DeleteWatermarkOnlineRequest deleteRequest = new DeleteWatermarkOnlineRequest(requestDocument, null, null, null, null, null);
wordsApi.deleteWatermarkOnline(deleteRequest);