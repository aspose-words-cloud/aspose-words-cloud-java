String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteCommentsOnlineRequest deleteRequestRequest = new DeleteCommentsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null,null,null);
wordsApi.deleteCommentsOnline(deleteRequestRequest);