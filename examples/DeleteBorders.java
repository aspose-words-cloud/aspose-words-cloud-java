ApiClient apiClient = new ApiClient(/*clientId*/ "####-####-####-####-####", /*clientSecret*/ "##################", null);
WordsApi wordsApi = new WordsApi(apiClient);
DeleteBordersRequest deleteRequest = new DeleteBordersRequest("Sample.docx", "tables/1/rows/0/cells/0", null, null, null, null, null, null, null);
wordsApi.deleteBorders(deleteRequest);