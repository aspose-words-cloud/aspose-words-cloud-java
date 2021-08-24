ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteTableRowRequest deleteRequest = new DeleteTableRowRequest("Sample.docx", "tables/1", 0, null, null, null, null, null, null, null);
wordsApi.deleteTableRow(deleteRequest);