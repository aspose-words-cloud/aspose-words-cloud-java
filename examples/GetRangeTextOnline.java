String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetRangeTextOnlineRequest requestRequest = new GetRangeTextOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),"id0.0.0","id0.0.1",null,null);
wordsApi.getRangeTextOnline(requestRequest);