ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
RunUpdate requestRun = new RunUpdate();
requestRun.setText("run with text");

UpdateRunRequest updateRequestRequest = new UpdateRunRequest("Sample.docx","paragraphs/1",0,requestRun,null,null,null,null,null,null,null);
wordsApi.updateRun(updateRequestRequest);