String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetFootnotesOnlineRequest requestRequest = new GetFootnotesOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "/Footnote.doc").toAbsolutePath()),"",null,null);
wordsApi.getFootnotesOnline(requestRequest);