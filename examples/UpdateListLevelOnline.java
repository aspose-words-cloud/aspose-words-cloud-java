ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
ListLevelUpdate requestListUpdate = new ListLevelUpdate();
requestListUpdate.setAlignment(ListLevelUpdate.AlignmentEnum.RIGHT);

UpdateListLevelOnlineRequest updateRequest = new UpdateListLevelOnlineRequest(requestDocument, 1, requestListUpdate, 1, null, null, null, null, null);
wordsApi.updateListLevelOnline(updateRequest);