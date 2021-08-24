ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetTableCellRequest request = new GetTableCellRequest("Sample.docx", "sections/0/tables/2/rows/0", 0, null, null, null, null);
wordsApi.getTableCell(request);