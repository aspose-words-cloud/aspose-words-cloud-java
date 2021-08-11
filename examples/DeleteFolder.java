ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteFolderRequest deleteRequestRequest = new DeleteFolderRequest("",null,null);
wordsApi.deleteFolder(deleteRequestRequest);