ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetTablesRequest requestRequest = new GetTablesRequest("Sample.docx",null,null,null,null,null);
wordsApi.getTables(requestRequest);