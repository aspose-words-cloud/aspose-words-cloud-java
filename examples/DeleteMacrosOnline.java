String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteMacrosOnlineRequest deleteRequestRequest = new DeleteMacrosOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null,null,null);
wordsApi.deleteMacrosOnline(deleteRequestRequest);