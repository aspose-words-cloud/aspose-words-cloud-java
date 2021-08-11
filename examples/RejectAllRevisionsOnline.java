String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RejectAllRevisionsOnlineRequest rejectRequestRequest = new RejectAllRevisionsOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null);
wordsApi.rejectAllRevisionsOnline(rejectRequestRequest);