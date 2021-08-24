ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ListUpdate requestListUpdate = new ListUpdate();
requestListUpdate.setIsRestartAtEachSection(true);

UpdateListRequest updateRequest = new UpdateListRequest("TestGetLists.doc", 1, requestListUpdate, null, null, null, null, null, null, null);
wordsApi.updateList(updateRequest);