ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
MoveFolderRequest moveRequest = new MoveFolderRequest("/TestMoveFolderDest_Sample", "/TestMoveFolderSrc", null, null);
wordsApi.moveFolder(moveRequest);