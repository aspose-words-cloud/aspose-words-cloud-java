String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ReplaceRange requestRangeText = new ReplaceRange();
requestRangeText.setText("Replaced header");

ReplaceWithTextOnlineRequest replaceRequestRequest = new ReplaceWithTextOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),"id0.0.0",requestRangeText,"id0.0.1",null,null,null);
wordsApi.replaceWithTextOnline(replaceRequestRequest);