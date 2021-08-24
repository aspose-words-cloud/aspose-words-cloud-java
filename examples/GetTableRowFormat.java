ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
GetTableRowFormatRequest request = new GetTableRowFormatRequest("Sample.docx", "sections/0/tables/2", 0, null, null, null, null);
wordsApi.getTableRowFormat(request);