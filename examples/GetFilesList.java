ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFilesListRequest request = new GetFilesListRequest("", null);
wordsApi.getFilesList(request);