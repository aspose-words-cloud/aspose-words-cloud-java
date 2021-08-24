ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetRunRequest request = new GetRunRequest("Sample.docx", "paragraphs/0", 0, null, null, null, null);
wordsApi.getRun(request);