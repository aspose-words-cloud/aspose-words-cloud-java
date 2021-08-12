String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetHeaderFootersOnlineRequest requestRequest = new GetHeaderFootersOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),"",null,null,null);
wordsApi.getHeaderFootersOnline(requestRequest);