String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteRunOnlineRequest deleteRequestRequest = new DeleteRunOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Runs/Run.doc").toAbsolutePath()),"paragraphs/1",0,null,null,null,null,null);
wordsApi.deleteRunOnline(deleteRequestRequest);