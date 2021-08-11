String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetListsOnlineRequest requestRequest = new GetListsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Lists/ListsGet.doc").toAbsolutePath()),null,null);
wordsApi.getListsOnline(requestRequest);