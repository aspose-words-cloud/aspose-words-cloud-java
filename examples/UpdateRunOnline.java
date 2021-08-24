ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
RunUpdate requestRun = new RunUpdate();
requestRun.setText("run with text");

UpdateRunOnlineRequest updateRequest = new UpdateRunOnlineRequest(requestDocument, "paragraphs/1", requestRun, 0, null, null, null, null, null);
wordsApi.updateRunOnline(updateRequest);