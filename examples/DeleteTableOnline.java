String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteTableOnlineRequest deleteRequestRequest = new DeleteTableOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),1,"",null,null,null,null,null);
wordsApi.deleteTableOnline(deleteRequestRequest);