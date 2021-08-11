String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteBordersOnlineRequest deleteRequestRequest = new DeleteBordersOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"tables/1/rows/0/cells/0",null,null,null,null,null);
wordsApi.deleteBordersOnline(deleteRequestRequest);