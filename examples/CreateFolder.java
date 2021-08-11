ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
CreateFolderRequest createRequestRequest = new CreateFolderRequest("/TestCreateFolder",null);
wordsApi.createFolder(createRequestRequest);