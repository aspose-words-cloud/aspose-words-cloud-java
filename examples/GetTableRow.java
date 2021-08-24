ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetTableRowRequest request = new GetTableRowRequest("Sample.docx", "tables/1", 0, null, null, null, null);
wordsApi.getTableRow(request);