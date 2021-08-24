ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
ListUpdate requestListUpdate = new ListUpdate();
requestListUpdate.setIsRestartAtEachSection(true);

UpdateListOnlineRequest updateRequest = new UpdateListOnlineRequest(requestDocument, 1, requestListUpdate, null, null, null, null, null);
wordsApi.updateListOnline(updateRequest);