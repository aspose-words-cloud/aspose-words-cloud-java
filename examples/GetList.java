ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetListRequest requestRequest = new GetListRequest("TestGetLists.doc",1,null,null,null,null);
wordsApi.getList(requestRequest);