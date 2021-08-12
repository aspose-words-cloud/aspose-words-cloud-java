String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ListLevelUpdate requestListUpdate = new ListLevelUpdate();
requestListUpdate.setAlignment(ListLevelUpdate.AlignmentEnum.RIGHT);

UpdateListLevelOnlineRequest updateRequestRequest = new UpdateListLevelOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),1,requestListUpdate,1,null,null,null,null,null);
wordsApi.updateListLevelOnline(updateRequestRequest);