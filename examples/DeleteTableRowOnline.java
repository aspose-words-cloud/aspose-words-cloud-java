String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteTableRowOnlineRequest deleteRequestRequest = new DeleteTableRowOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),"tables/1",0,null,null,null,null,null);
wordsApi.deleteTableRowOnline(deleteRequestRequest);