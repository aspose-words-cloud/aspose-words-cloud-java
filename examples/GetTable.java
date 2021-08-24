ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetTableRequest request = new GetTableRequest("Sample.docx", 1, null, null, null, null, null);
wordsApi.getTable(request);