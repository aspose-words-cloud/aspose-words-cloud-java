ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
byte[] requestDocument = Files.readAllBytes(Paths.get("Sample.doc").toAbsolutePath());
RunInsert requestRun = new RunInsert();
requestRun.setText("run with text");

InsertRunOnlineRequest insertRequest = new InsertRunOnlineRequest(requestDocument, "paragraphs/1", requestRun, null, null, null, null, null, null);
wordsApi.insertRunOnline(insertRequest);