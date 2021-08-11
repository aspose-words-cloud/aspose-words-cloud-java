String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteBorderOnlineRequest deleteRequestRequest = new DeleteBorderOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"left","tables/1/rows/0/cells/0",null,null,null,null,null);
wordsApi.deleteBorderOnline(deleteRequestRequest);