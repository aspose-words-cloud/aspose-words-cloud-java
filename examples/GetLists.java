ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetListsRequest requestRequest = new GetListsRequest("TestGetLists.doc",null,null,null,null);
wordsApi.getLists(requestRequest);