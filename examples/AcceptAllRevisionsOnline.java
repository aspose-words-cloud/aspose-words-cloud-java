String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
AcceptAllRevisionsOnlineRequest acceptRequestRequest = new AcceptAllRevisionsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null);
wordsApi.acceptAllRevisionsOnline(acceptRequestRequest);