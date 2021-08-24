ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
ReplaceRange requestRangeText = new ReplaceRange();
requestRangeText.setText("Replaced header");

ReplaceWithTextOnlineRequest replaceRequest = new ReplaceWithTextOnlineRequest(requestDocument, "id0.0.0", requestRangeText, "id0.0.1", null, null, null);
wordsApi.replaceWithTextOnline(replaceRequest);