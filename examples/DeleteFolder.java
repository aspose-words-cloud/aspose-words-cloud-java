ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFolderRequest deleteRequest = new DeleteFolderRequest("", null, null);
wordsApi.deleteFolder(deleteRequest);