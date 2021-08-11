String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteWatermarkOnlineRequest deleteRequestRequest = new DeleteWatermarkOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.docx").toAbsolutePath()),null,null,null,null,null);
wordsApi.deleteWatermarkOnline(deleteRequestRequest);