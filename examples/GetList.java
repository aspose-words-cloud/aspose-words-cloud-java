ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetListRequest request = new GetListRequest("TestGetLists.doc", 1, null, null, null, null);
wordsApi.getList(request);