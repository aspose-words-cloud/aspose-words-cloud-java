ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
CreateFolderRequest createRequest = new CreateFolderRequest("/TestCreateFolder", null);
wordsApi.createFolder(createRequest);