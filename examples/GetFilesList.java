ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFilesListRequest requestRequest = new GetFilesListRequest("",null);
wordsApi.getFilesList(requestRequest);