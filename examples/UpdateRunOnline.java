String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RunUpdate requestRun = new RunUpdate();
requestRun.setText("run with text");

UpdateRunOnlineRequest updateRequestRequest = new UpdateRunOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "DocumentElements/Runs/Run.doc").toAbsolutePath()),"paragraphs/1",requestRun,0,null,null,null,null,null);
wordsApi.updateRunOnline(updateRequestRequest);