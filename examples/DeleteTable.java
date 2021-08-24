ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteTableRequest deleteRequest = new DeleteTableRequest("Sample.docx", 1, null, null, null, null, null, null, null, null);
wordsApi.deleteTable(deleteRequest);