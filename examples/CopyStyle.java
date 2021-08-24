ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
StyleCopy requestStyleCopy = new StyleCopy();
requestStyleCopy.setStyleName("Heading 1");

CopyStyleRequest copyRequest = new CopyStyleRequest("Sample.docx", requestStyleCopy, null, null, null, null, null, null, null);
wordsApi.copyStyle(copyRequest);