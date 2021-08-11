String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetBorderOnlineRequest requestRequest = new GetBorderOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"left","tables/1/rows/0/cells/0",null,null);
wordsApi.getBorderOnline(requestRequest);