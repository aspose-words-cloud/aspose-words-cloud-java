ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetTablesRequest request = new GetTablesRequest("Sample.docx", null, null, null, null, null);
wordsApi.getTables(request);