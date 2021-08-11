ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
ListLevelUpdate requestListUpdate = new ListLevelUpdate();
requestListUpdate.setAlignment(ListLevelUpdate.AlignmentEnum.RIGHT);

UpdateListLevelRequest updateRequestRequest = new UpdateListLevelRequest("TestGetLists.doc",1,1,requestListUpdate,null,null,null,null,null,null,null);
wordsApi.updateListLevel(updateRequestRequest);