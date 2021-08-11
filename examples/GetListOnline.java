String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetListOnlineRequest requestRequest = new GetListOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Lists/ListsGet.doc").toAbsolutePath()),1,null,null);
wordsApi.getListOnline(requestRequest);