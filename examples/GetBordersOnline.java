String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetBordersOnlineRequest requestRequest = new GetBordersOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"tables/1/rows/0/cells/0",null,null);
wordsApi.getBordersOnline(requestRequest);