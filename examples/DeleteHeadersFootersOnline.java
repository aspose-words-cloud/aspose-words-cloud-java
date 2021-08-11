String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteHeadersFootersOnlineRequest deleteRequestRequest = new DeleteHeadersFootersOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/HeaderFooters/HeadersFooters.doc").toAbsolutePath()),"",null,null,null,null,null,null);
wordsApi.deleteHeadersFootersOnline(deleteRequestRequest);