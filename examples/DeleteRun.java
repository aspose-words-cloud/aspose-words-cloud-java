ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteRunRequest deleteRequest = new DeleteRunRequest("Sample.docx", "paragraphs/1", 0, null, null, null, null, null, null, null);
wordsApi.deleteRun(deleteRequest);