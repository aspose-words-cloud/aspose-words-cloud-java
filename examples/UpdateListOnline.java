String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ListUpdate requestListUpdate = new ListUpdate();
requestListUpdate.setIsRestartAtEachSection(true);

UpdateListOnlineRequest updateRequestRequest = new UpdateListOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),1,requestListUpdate,null,null,null,null,null);
wordsApi.updateListOnline(updateRequestRequest);