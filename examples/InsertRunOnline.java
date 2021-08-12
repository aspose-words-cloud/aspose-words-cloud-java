String documentsDir = "...";
ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RunInsert requestRun = new RunInsert();
requestRun.setText("run with text");

InsertRunOnlineRequest insertRequestRequest = new InsertRunOnlineRequest(Files.readAllBytes(Paths.get(documentsDir, "Sample.doc").toAbsolutePath()),"paragraphs/1",requestRun,null,null,null,null,null,null);
wordsApi.insertRunOnline(insertRequestRequest);