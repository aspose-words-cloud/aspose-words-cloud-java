ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RunInsert requestRun = new RunInsert();
requestRun.setText("run with text");

InsertRunRequest insertRequest = new InsertRunRequest("Sample.docx", "paragraphs/1", requestRun, null, null, null, null, null, null, null, null);
wordsApi.insertRun(insertRequest);