String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteHeaderFooterOnlineRequest deleteRequestRequest = new DeleteHeaderFooterOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/HeaderFooters/HeadersFooters.doc").toAbsolutePath()),"",0,null,null,null,null,null);
wordsApi.deleteHeaderFooterOnline(deleteRequestRequest);