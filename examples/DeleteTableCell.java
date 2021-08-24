ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteTableCellRequest deleteRequest = new DeleteTableCellRequest("Sample.docx", "sections/0/tables/2/rows/0", 0, null, null, null, null, null, null, null);
wordsApi.deleteTableCell(deleteRequest);